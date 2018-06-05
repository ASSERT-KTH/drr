/*
 * Copyright 2009 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Optimizes the order of compiler passes.
 * @author nicksantos@google.com (Nick Santos)
 * @author dimvar@google.com (Dimitris Vardoulakis)
 */
class PhaseOptimizer implements CompilerPass {

  // This ordering is computed offline by running with compute_phase_ordering.
  @VisibleForTesting
  static final List<String> OPTIMAL_ORDER = ImmutableList.of(
     "deadAssignmentsElimination",
     "inlineFunctions",
     "removeUnusedPrototypeProperties",
     "removeUnreachableCode",
     "removeUnusedVars",
     "minimizeExitPoints",
     "inlineVariables",
     "collapseObjectLiterals",
     "peepholeOptimizations");

  static final int MAX_LOOPS = 100;
  static final String OPTIMIZE_LOOP_ERROR =
      "Fixed point loop exceeded the maximum number of iterations.";

  // Only used by Loop/process, but enum types can't be local
  enum State {
    RUN_PASSES_NOT_RUN_IN_PREV_ITER,
    RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER
  }

  private static final Logger logger =
      Logger.getLogger(PhaseOptimizer.class.getName());

  private final List<CompilerPass> passes = Lists.newArrayList();

  private final AbstractCompiler compiler;
  private final PerformanceTracker tracker;
  private boolean inLoop;
  private PassFactory sanityCheck = null;
  private boolean printAstHashcodes = false;

  private double progress = 0.0;
  private double progressStep = 0.0;

  // The following static properties are only used for computing optimal
  // phase orderings. They should not be touched by normal compiler runs.
  private static boolean randomizeLoops = false;
  private static List<List<String>> loopsRun = Lists.newArrayList();

  private final ProgressRange progressRange;

  // These fields are used during optimization loops.
  // They are declared here for two reasons:
  // 1) Loop and ScopedChangeHandler can communicate via shared state
  // 2) Compiler talks to PhaseOptimizer, not Loop or ScopedChangeHandler
  private NamedPass currentPass;
  // For each pass, remember the time at the end of the pass's last run.
  private Map<NamedPass, Integer> lastRuns;
  private Node currentScope;
  // Starts at 0, increases as "interesting" things happen.
  // Nothing happens at time START_TIME, the first pass starts at time 1.
  // The correctness of scope-change tracking relies on Node/getIntProp
  // returning 0 if the custom attribute on a node hasn't been set.
  private int timestamp;
  // The time of the last change made to the program by any pass.
  private int lastChange;
  private static final int START_TIME = 0;
  private Node jsRoot;
  // Compiler/reportChangeToScope must call reportCodeChange to update all
  // change handlers. This flag prevents double update in ScopedChangeHandler.
  private boolean crossScopeReporting;

  // Used for sanity checks between loopable passes
  private Node lastAst;
  private Map<Node, Node> mtoc; // Stands for "main to clone"

  /**
   * @param compiler the compiler that owns/creates this.
   * @param tracker an optional performance tracker
   * @param progressRange the progress range for the process function or null
   * if progress should not be reported.
   */
  PhaseOptimizer(AbstractCompiler compiler, PerformanceTracker tracker,
      ProgressRange progressRange) {
    this.compiler = compiler;
    this.jsRoot = compiler.getJsRoot();
    this.tracker = tracker;
    this.progressRange = progressRange;
    this.inLoop = false;
    this.crossScopeReporting = false;
    this.timestamp = this.lastChange = START_TIME;
  }

  /**
   * Randomizes loops. This should only be used when computing optimal phase
   * orderings.
   */
  static void randomizeLoops() {
    randomizeLoops = true;
  }

  /**
   * Get the phase ordering of loops during this run.
   * Returns an empty list when the loops are not randomized.
   */
  static List<List<String>> getLoopsRun() {
    return loopsRun;
  }

  /**
   * Clears the phase ordering of loops during this run.
   */
  static void clearLoopsRun() {
    loopsRun.clear();
  }

  /**
   * Add the passes generated by the given factories to the compile sequence.
   *
   * Automatically pulls multi-run passes into fixed point loops. If there
   * are 1 or more multi-run passes in a row, they will run together in
   * the same fixed point loop. The passes will run until they are finished
   * making changes.
   *
   * The PhaseOptimizer is free to tweak the order and frequency of multi-run
   * passes in a fixed-point loop.
   */
  void consume(List<PassFactory> factories) {
    Loop currentLoop = new Loop();
    boolean isCurrentLoopPopulated = false;
    for (PassFactory factory : factories) {
      if (factory.isOneTimePass()) {
        if (isCurrentLoopPopulated) {
          passes.add(currentLoop);
          currentLoop = new Loop();
          isCurrentLoopPopulated = false;
        }
        addOneTimePass(factory);
      } else {
        currentLoop.addLoopedPass(factory);
        isCurrentLoopPopulated = true;
      }
    }

    if (isCurrentLoopPopulated) {
      passes.add(currentLoop);
    }
  }

  /**
   * Add the pass generated by the given factory to the compile sequence.
   * This pass will be run once.
   */
  void addOneTimePass(PassFactory factory) {
    passes.add(new NamedPass(factory));
  }

  /**
   * Add a loop to the compile sequence. This loop will continue running
   * until the AST stops changing.
   * @return The loop structure. Pass suppliers should be added to the loop.
   */
  Loop addFixedPointLoop() {
    Loop loop = new Loop();
    passes.add(loop);
    return loop;
  }

  /**
   * Adds a sanity checker to be run after every pass. Intended for development.
   */
  void setSanityCheck(PassFactory sanityCheck) {
    this.sanityCheck = sanityCheck;
    setSanityCheckState();
  }

  private void setSanityCheckState() {
    lastAst = jsRoot.cloneTree();
    mtoc = NodeUtil.mapMainToClone(jsRoot, lastAst);
  }

  /**
   * Sets the hashcode of the AST to be logged every pass.
   * Intended for development.
   */
  void setPrintAstHashcodes(boolean printAstHashcodes) {
    this.printAstHashcodes = printAstHashcodes;
  }

  /**
   * Run all the passes in the optimizer.
   */
  @Override
  public void process(Node externs, Node root) {
    progress = 0.0;
    progressStep = 0.0;
    if (progressRange != null) {
      progressStep = (progressRange.maxValue - progressRange.initialValue)
          / passes.size();
      progress = progressRange.initialValue;
    }
    for (CompilerPass pass : passes) {
      pass.process(externs, root);
      if (hasHaltingErrors()) {
        return;
      }
    }
  }

  private void maybePrintAstHashcodes(String passName, Node root) {
    if (printAstHashcodes) {
      String hashCodeMsg = "AST hashCode after " + passName + ": " +
          compiler.toSource(root).hashCode();
      System.err.println(hashCodeMsg);
      compiler.addToDebugLog(hashCodeMsg);
    }
  }

  /**
   * Runs the sanity check if it is available.
   */
  private void maybeSanityCheck(Node externs, Node root) {
    if (sanityCheck != null) {
      sanityCheck.create(compiler).process(externs, root);
      NodeUtil.verifyScopeChanges(mtoc, jsRoot, true);
      setSanityCheckState();
    }
  }

  private boolean hasHaltingErrors() {
    return compiler.hasHaltingErrors();
  }

  /**
   * A single compiler pass.
   */
  class NamedPass implements CompilerPass {
    final String name;
    private final PassFactory factory;
    private Tracer tracer;

    NamedPass(PassFactory factory) {
      this.name = factory.getName();
      this.factory = factory;
    }

    @Override
    public void process(Node externs, Node root) {
      logger.fine(name);
      if (tracker != null) {
        tracker.recordPassStart(name, factory.isOneTimePass());
      }
      tracer = new Tracer("JSCompiler");
      // Delay the creation of the actual pass until *after* all previous passes
      // have been processed.
      // Some precondition checks rely on this, eg, in CoalesceVariableNames.
      factory.create(compiler).process(externs, root);
      try {
        if (progressRange == null) {
          compiler.setProgress(-1, name);
        } else {
          progress += progressStep;
          compiler.setProgress(progress, name);
        }
        if (tracker != null) {
          tracker.recordPassStop(name, tracer.stop());
        }
        maybePrintAstHashcodes(name, root);
        maybeSanityCheck(externs, root);
      } catch (Exception e) {
        // TODO(johnlenz): Remove this once the normalization checks report
        // errors instead of exceptions.
        throw new RuntimeException("Sanity check failed for " + name, e);
      }
    }
  }

  /** {@code n} is either a function or the top-level node of the AST */
  void setScope(Node n) {
    // NodeTraversal causes setScope calls outside loops; ignore them.
    if (inLoop) {
      currentScope = n.isFunction() ? n : compiler.getEnclosingScope(n);
    }
  }

  boolean hasScopeChanged(Node n) {
    // Outside loops we don't track changed scopes, so we visit them all.
    if (!inLoop) {
      return true;
    }
    int timeOfLastRun = lastRuns.get(currentPass);
    // A pass looks at all functions when it first runs
    return timeOfLastRun == START_TIME
        || n.getChangeTime() > timeOfLastRun;
  }

  void reportChangeToScope(Node n) {
    lastChange = timestamp;
    n.setChangeTime(timestamp);
    // Every code change happens at a different time
    timestamp++;
  }

  // This method and the next one are used so that we don't falsely report the
  // current scope as changed when reportChangeToScope is called from Compiler.
  void startCrossScopeReporting() {
    crossScopeReporting = true;
  }

  void endCrossScopeReporting() {
    crossScopeReporting = false;
  }

  private class ScopedChangeHandler implements CodeChangeHandler {
    private int lastCodeChangeQuery;

    ScopedChangeHandler() {
      this.lastCodeChangeQuery = timestamp;
    }

    @Override
    public void reportChange() {
      if (crossScopeReporting) {
        // This call was caused by Compiler/reportChangeToScope, do nothing
        return;
      }
      lastChange = timestamp;
      currentScope.setChangeTime(timestamp);
      // Every code change happens at a different time
      timestamp++;
    }

    private boolean hasCodeChangedSinceLastCall() {
      boolean result = lastChange > lastCodeChangeQuery;
      lastCodeChangeQuery = timestamp;
      // The next call to the method will happen at a different time
      timestamp++;
      return result;
    }
  }

  /**
   * Runs a set of compiler passes until they reach a fixed point.
   *
   * Notice that this is a non-static class, because it includes the closure
   * of PhaseOptimizer.
   */
  class Loop implements CompilerPass {
    private final List<NamedPass> myPasses = Lists.newArrayList();
    private final Set<String> myNames = Sets.newHashSet();
    private ScopedChangeHandler scopeHandler;

    void addLoopedPass(PassFactory factory) {
      String name = factory.getName();
      Preconditions.checkArgument(!myNames.contains(name),
          "Already a pass with name '%s' in this loop", name);
      myNames.add(name);
      myPasses.add(new NamedPass(factory));
    }

    @Override
    public void process(Node externs, Node root) {
      Preconditions.checkState(!inLoop, "Nested loops are forbidden");
      inLoop = true;
      if (randomizeLoops) {
        randomizePasses();
      } else {
        optimizePasses();
      }

      // Set up function-change tracking
      scopeHandler = new ScopedChangeHandler();
      compiler.addChangeHandler(scopeHandler);
      setScope(root);
      // lastRuns is initialized before each loop. This way, when a pass is run
      // in the 2nd loop for the 1st time, it looks at all scopes.
      lastRuns = new HashMap<NamedPass, Integer>();
      for (NamedPass pass : myPasses) {
        lastRuns.put(pass, START_TIME);
      }
      // Contains a pass iff it made changes the last time it was run.
      Set<NamedPass> madeChanges = new HashSet<NamedPass>();
      // Contains a pass iff it was run during the last inner loop.
      Set<NamedPass> runInPrevIter = new HashSet<NamedPass>();
      State s = State.RUN_PASSES_NOT_RUN_IN_PREV_ITER;
      boolean lastIterMadeChanges;
      int count = 0;

      try {
        while (true) {
          if (count++ > MAX_LOOPS) {
            compiler.throwInternalError(OPTIMIZE_LOOP_ERROR, null);
          }
          lastIterMadeChanges = false;
          for (NamedPass pass : myPasses) {
            if ((s == State.RUN_PASSES_NOT_RUN_IN_PREV_ITER &&
                !runInPrevIter.contains(pass)) ||
                (s == State.RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER &&
                    madeChanges.contains(pass))) {
              timestamp++;
              currentPass = pass;
              pass.process(externs, root);
              runInPrevIter.add(pass);
              lastRuns.put(pass, timestamp);
              if (hasHaltingErrors()) {
                return;
              } else if (scopeHandler.hasCodeChangedSinceLastCall()) {
                madeChanges.add(pass);
                lastIterMadeChanges = true;
              } else {
                madeChanges.remove(pass);
              }
            } else {
              runInPrevIter.remove(pass);
            }
          }
          if (s == State.RUN_PASSES_NOT_RUN_IN_PREV_ITER) {
            if (lastIterMadeChanges) {
              s = State.RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER;
            } else {
              return;
            }
          } else if (!lastIterMadeChanges) {
            s = State.RUN_PASSES_NOT_RUN_IN_PREV_ITER;
          }
        }
      } finally {
        inLoop = false;
        compiler.removeChangeHandler(scopeHandler);
      }
    }

    /** Re-arrange the passes in a random order. */
    private void randomizePasses() {
      Collections.shuffle(myPasses);
    }

    /** Re-arrange the passes in an optimal order. */
    private void optimizePasses() {
      // It's important that this ordering is deterministic, so that
      // multiple compiles with the same input produce exactly the same
      // results.
      //
      // To do this, grab any passes we recognize, and move them to the end
      // in an "optimal" order.
      List<NamedPass> optimalPasses = Lists.newArrayList();
      for (String passName : OPTIMAL_ORDER) {
        for (NamedPass pass : myPasses) {
          if (pass.name.equals(passName)) {
            optimalPasses.add(pass);
            break;
          }
        }
      }

      myPasses.removeAll(optimalPasses);
      myPasses.addAll(optimalPasses);
    }
  }

  static class ProgressRange {
    public final double initialValue;
    public final double maxValue;

    public ProgressRange(double initialValue, double maxValue) {
      this.initialValue = initialValue;
      this.maxValue = maxValue;
    }
  }
}
