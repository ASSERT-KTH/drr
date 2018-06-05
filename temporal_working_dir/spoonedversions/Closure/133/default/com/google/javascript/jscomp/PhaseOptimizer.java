

package com.google.javascript.jscomp;


class PhaseOptimizer implements com.google.javascript.jscomp.CompilerPass {
	@com.google.common.annotations.VisibleForTesting
	static final java.util.List<java.lang.String> OPTIMAL_ORDER = com.google.common.collect.ImmutableList.of("deadAssignmentsElimination", "inlineFunctions", "removeUnusedPrototypeProperties", "removeUnreachableCode", "removeUnusedVars", "minimizeExitPoints", "inlineVariables", "collapseObjectLiterals", "peepholeOptimizations");

	static final int MAX_LOOPS = 100;

	static final java.lang.String OPTIMIZE_LOOP_ERROR = "Fixed point loop exceeded the maximum number of iterations.";

	enum State {
RUN_PASSES_NOT_RUN_IN_PREV_ITER, RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER;	}

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.PhaseOptimizer.class.getName());

	private final java.util.List<com.google.javascript.jscomp.CompilerPass> passes = com.google.common.collect.Lists.newArrayList();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.PerformanceTracker tracker;

	private final com.google.javascript.jscomp.CodeChangeHandler recentChange = new com.google.javascript.jscomp.CodeChangeHandler();

	private boolean loopMutex = false;

	private com.google.javascript.jscomp.Tracer currentTracer = null;

	private java.lang.String currentPassName = null;

	private com.google.javascript.jscomp.PassFactory sanityCheck = null;

	private boolean printAstHashcodes = false;

	private double progress = 0.0;

	private double progressStep = 0.0;

	private static boolean randomizeLoops = false;

	private static java.util.List<java.util.List<java.lang.String>> loopsRun = com.google.common.collect.Lists.newArrayList();

	private final com.google.javascript.jscomp.PhaseOptimizer.ProgressRange progressRange;

	PhaseOptimizer(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.PerformanceTracker tracker, com.google.javascript.jscomp.PhaseOptimizer.ProgressRange progressRange) {
		this.compiler = compiler;
		this.tracker = tracker;
		this.progressRange = progressRange;
		compiler.addChangeHandler(recentChange);
	}

	static void randomizeLoops() {
		com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops = true;
	}

	static java.util.List<java.util.List<java.lang.String>> getLoopsRun() {
		return com.google.javascript.jscomp.PhaseOptimizer.loopsRun;
	}

	static void clearLoopsRun() {
		com.google.javascript.jscomp.PhaseOptimizer.loopsRun.clear();
	}

	void consume(java.util.List<com.google.javascript.jscomp.PassFactory> factories) {
		com.google.javascript.jscomp.PhaseOptimizer.Loop currentLoop = new com.google.javascript.jscomp.PhaseOptimizer.Loop();
		boolean isCurrentLoopPopulated = false;
		for (com.google.javascript.jscomp.PassFactory factory : factories) {
			if (factory.isOneTimePass()) {
				if (isCurrentLoopPopulated) {
					passes.add(currentLoop);
					currentLoop = new com.google.javascript.jscomp.PhaseOptimizer.Loop();
					isCurrentLoopPopulated = false;
				}
				addOneTimePass(factory);
			}else {
				currentLoop.addLoopedPass(factory);
				isCurrentLoopPopulated = true;
			}
		}
		if (isCurrentLoopPopulated) {
			passes.add(currentLoop);
		}
	}

	void addOneTimePass(com.google.javascript.jscomp.PassFactory factory) {
		passes.add(new com.google.javascript.jscomp.PhaseOptimizer.NamedPass(factory));
	}

	com.google.javascript.jscomp.PhaseOptimizer.Loop addFixedPointLoop() {
		com.google.javascript.jscomp.PhaseOptimizer.Loop loop = new com.google.javascript.jscomp.PhaseOptimizer.Loop();
		passes.add(loop);
		return loop;
	}

	void setSanityCheck(com.google.javascript.jscomp.PassFactory sanityCheck) {
		com.google.javascript.jscomp.PhaseOptimizer.this.sanityCheck = sanityCheck;
	}

	void setPrintAstHashcodes(boolean printAstHashcodes) {
		com.google.javascript.jscomp.PhaseOptimizer.this.printAstHashcodes = printAstHashcodes;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		progress = 0.0;
		progressStep = 0.0;
		if ((progressRange) != null) {
			progressStep = ((progressRange.maxValue) - (progressRange.initialValue)) / (passes.size());
			progress = progressRange.initialValue;
		}
		for (com.google.javascript.jscomp.CompilerPass pass : passes) {
			pass.process(externs, root);
			if (hasHaltingErrors()) {
				return ;
			}
		}
	}

	private void startPass(java.lang.String passName, boolean isOneTime) {
		com.google.common.base.Preconditions.checkState((((currentTracer) == null) && ((currentPassName) == null)));
		currentPassName = passName;
		currentTracer = newTracer(passName, isOneTime);
	}

	private void endPass(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState((((currentTracer) != null) && ((currentPassName) != null)));
		java.lang.String passToCheck = currentPassName;
		try {
			if ((progressRange) == null) {
				compiler.setProgress((-1), currentPassName);
			}else {
				progress += progressStep;
				compiler.setProgress(progress, currentPassName);
			}
			stopTracer(currentTracer, currentPassName);
			currentPassName = null;
			currentTracer = null;
			maybePrintAstHashcodes(passToCheck, root);
			maybeSanityCheck(externs, root);
		} catch (java.lang.Exception e) {
			throw new java.lang.RuntimeException(("Sanity check failed for " + passToCheck), e);
		}
	}

	private void maybePrintAstHashcodes(java.lang.String passName, com.google.javascript.rhino.Node root) {
		if (printAstHashcodes) {
			java.lang.String hashCodeMsg = (("AST hashCode after " + passName) + ": ") + (compiler.toSource(root).hashCode());
			java.lang.System.err.println(hashCodeMsg);
			compiler.addToDebugLog(hashCodeMsg);
		}
	}

	void maybeSanityCheck(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if ((sanityCheck) != null) {
			sanityCheck.create(compiler).process(externs, root);
		}
	}

	private boolean hasHaltingErrors() {
		return compiler.hasHaltingErrors();
	}

	private com.google.javascript.jscomp.Tracer newTracer(java.lang.String passName, boolean isOneTime) {
		java.lang.String comment = passName + (recentChange.hasCodeChanged() ? " on recently changed AST" : "");
		if ((tracker) != null) {
			tracker.recordPassStart(passName, isOneTime);
		}
		return new com.google.javascript.jscomp.Tracer("JSCompiler", comment);
	}

	private void stopTracer(com.google.javascript.jscomp.Tracer t, java.lang.String passName) {
		long result = t.stop();
		if ((tracker) != null) {
			tracker.recordPassStop(passName, result);
		}
	}

	class NamedPass implements com.google.javascript.jscomp.CompilerPass {
		final java.lang.String name;

		private final com.google.javascript.jscomp.PassFactory factory;

		NamedPass(com.google.javascript.jscomp.PassFactory factory) {
			this.name = factory.getName();
			this.factory = factory;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.PhaseOptimizer.logger.fine(name);
			startPass(name, factory.isOneTimePass());
			factory.create(compiler).process(externs, root);
			endPass(externs, root);
		}
	}

	class Loop implements com.google.javascript.jscomp.CompilerPass {
		private final java.util.List<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> myPasses = com.google.common.collect.Lists.newArrayList();

		private final java.util.Set<java.lang.String> myNames = com.google.common.collect.Sets.newHashSet();

		void addLoopedPass(com.google.javascript.jscomp.PassFactory factory) {
			java.lang.String name = factory.getName();
			com.google.common.base.Preconditions.checkArgument((!(myNames.contains(name))), "Already a pass with name '%s' in this loop", name);
			myNames.add(name);
			myPasses.add(new com.google.javascript.jscomp.PhaseOptimizer.NamedPass(factory));
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.common.base.Preconditions.checkState((!(loopMutex)), "Nested loops are forbidden");
			loopMutex = true;
			if (com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops) {
				randomizePasses();
			}else {
				optimizePasses();
			}
			java.util.Set<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> madeChanges = new java.util.HashSet<com.google.javascript.jscomp.PhaseOptimizer.NamedPass>();
			java.util.Set<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> runInPrevIter = new java.util.HashSet<com.google.javascript.jscomp.PhaseOptimizer.NamedPass>();
			com.google.javascript.jscomp.PhaseOptimizer.State s = com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_NOT_RUN_IN_PREV_ITER;
			boolean lastIterMadeChanges;
			int count = 0;
			try {
				while (true) {
					if ((count++) > (com.google.javascript.jscomp.PhaseOptimizer.MAX_LOOPS)) {
						compiler.throwInternalError(com.google.javascript.jscomp.PhaseOptimizer.OPTIMIZE_LOOP_ERROR, null);
					}
					lastIterMadeChanges = false;
					for (com.google.javascript.jscomp.PhaseOptimizer.NamedPass pass : myPasses) {
						recentChange.reset();
						if (((s == (com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_NOT_RUN_IN_PREV_ITER)) && (!(runInPrevIter.contains(pass)))) || ((s == (com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER)) && (madeChanges.contains(pass)))) {
							pass.process(externs, root);
							runInPrevIter.add(pass);
							if (hasHaltingErrors()) {
								return ;
							}else
								if (recentChange.hasCodeChanged()) {
									madeChanges.add(pass);
									lastIterMadeChanges = true;
								}else {
									madeChanges.remove(pass);
								}
							
						}else {
							runInPrevIter.remove(pass);
						}
					}
					if (s == (com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_NOT_RUN_IN_PREV_ITER)) {
						if (lastIterMadeChanges) {
							s = com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_THAT_CHANGED_STH_IN_PREV_ITER;
						}else {
							return ;
						}
					}else
						if (!lastIterMadeChanges) {
							s = com.google.javascript.jscomp.PhaseOptimizer.State.RUN_PASSES_NOT_RUN_IN_PREV_ITER;
						}
					
				} 
			} finally {
				loopMutex = false;
			}
		}

		private void randomizePasses() {
			java.util.Collections.shuffle(myPasses);
		}

		private void optimizePasses() {
			java.util.List<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> optimalPasses = com.google.common.collect.Lists.newArrayList();
			for (java.lang.String passName : com.google.javascript.jscomp.PhaseOptimizer.OPTIMAL_ORDER) {
				for (com.google.javascript.jscomp.PhaseOptimizer.NamedPass pass : myPasses) {
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

