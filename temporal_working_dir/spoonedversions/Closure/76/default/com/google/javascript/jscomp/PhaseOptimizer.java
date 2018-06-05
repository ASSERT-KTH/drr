

package com.google.javascript.jscomp;


class PhaseOptimizer implements com.google.javascript.jscomp.CompilerPass {
	@com.google.common.annotations.VisibleForTesting
	static final java.util.List<java.lang.String> OPTIMAL_ORDER = com.google.common.collect.ImmutableList.of("removeUnreachableCode", "removeUnusedVars", "foldConstants", "deadAssignmentsElimination", "inlineVariables", "inlineFunctions", "removeUnusedPrototypeProperties", "minimizeExitPoints");

	static final int MAX_LOOPS = 100;

	static final java.lang.String OPTIMIZE_LOOP_ERROR = "Fixed point loop exceeded the maximum number of iterations.";

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.PhaseOptimizer.class.getName());

	private java.util.List<com.google.javascript.jscomp.CompilerPass> passes = com.google.common.collect.Lists.newArrayList();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.PerformanceTracker tracker;

	private final com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();

	private boolean loopMutex = false;

	private com.google.javascript.jscomp.Tracer currentTracer = null;

	private java.lang.String currentPassName = null;

	private com.google.javascript.jscomp.PassFactory sanityCheck = null;

	private static boolean randomizeLoops = false;

	private static java.util.List<java.util.List<java.lang.String>> loopsRun = com.google.common.collect.Lists.newArrayList();

	PhaseOptimizer(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.PerformanceTracker tracker) {
		this.compiler = compiler;
		this.tracker = tracker;
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
		com.google.javascript.jscomp.PhaseOptimizer.Loop currentLoop = new com.google.javascript.jscomp.PhaseOptimizer.LoopInternal();
		boolean isCurrentLoopPopulated = false;
		for (com.google.javascript.jscomp.PassFactory factory : factories) {
			if (factory.isOneTimePass()) {
				if (isCurrentLoopPopulated) {
					passes.add(currentLoop);
					currentLoop = new com.google.javascript.jscomp.PhaseOptimizer.LoopInternal();
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
		passes.add(new com.google.javascript.jscomp.PhaseOptimizer.PassFactoryDelegate(compiler, factory));
	}

	com.google.javascript.jscomp.PhaseOptimizer.Loop addFixedPointLoop() {
		com.google.javascript.jscomp.PhaseOptimizer.Loop loop = new com.google.javascript.jscomp.PhaseOptimizer.LoopInternal();
		passes.add(loop);
		return loop;
	}

	void setSanityCheck(com.google.javascript.jscomp.PassFactory sanityCheck) {
		com.google.javascript.jscomp.PhaseOptimizer.this.sanityCheck = sanityCheck;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		for (com.google.javascript.jscomp.CompilerPass pass : passes) {
			pass.process(externs, root);
			if (hasHaltingErrors()) {
				return ;
			}
		}
	}

	private void startPass(java.lang.String passName) {
		com.google.common.base.Preconditions.checkState((((currentTracer) == null) && ((currentPassName) == null)));
		currentPassName = passName;
		currentTracer = newTracer(passName);
	}

	private void endPass(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState((((currentTracer) != null) && ((currentPassName) != null)));
		java.lang.String passToCheck = currentPassName;
		try {
			stopTracer(currentTracer, currentPassName);
			currentPassName = null;
			currentTracer = null;
			maybeSanityCheck(externs, root);
		} catch (java.lang.Exception e) {
			throw new java.lang.RuntimeException(("Sanity check failed for " + passToCheck), e);
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

	private com.google.javascript.jscomp.Tracer newTracer(java.lang.String passName) {
		java.lang.String comment = passName + (recentChange.hasCodeChanged() ? " on recently changed AST" : "");
		if ((tracker) != null) {
			tracker.recordPassStart(passName);
		}
		return new com.google.javascript.jscomp.Tracer("JSCompiler", comment);
	}

	private void stopTracer(com.google.javascript.jscomp.Tracer t, java.lang.String passName) {
		long result = t.stop();
		if ((tracker) != null) {
			tracker.recordPassStop(passName, result);
		}
	}

	private abstract class NamedPass implements com.google.javascript.jscomp.CompilerPass {
		private final java.lang.String name;

		NamedPass(java.lang.String name) {
			this.name = name;
		}

		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.PhaseOptimizer.logger.info(name);
			startPass(name);
			processInternal(externs, root);
			endPass(externs, root);
		}

		abstract void processInternal(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root);
	}

	private class PassFactoryDelegate extends com.google.javascript.jscomp.PhaseOptimizer.NamedPass {
		private final com.google.javascript.jscomp.AbstractCompiler myCompiler;

		private final com.google.javascript.jscomp.PassFactory factory;

		private PassFactoryDelegate(com.google.javascript.jscomp.AbstractCompiler myCompiler, com.google.javascript.jscomp.PassFactory factory) {
			super(factory.getName());
			this.myCompiler = myCompiler;
			this.factory = factory;
		}

		@java.lang.Override
		void processInternal(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			factory.create(myCompiler).process(externs, root);
		}
	}

	abstract static class Loop implements com.google.javascript.jscomp.CompilerPass {
		abstract void addLoopedPass(com.google.javascript.jscomp.PassFactory factory);
	}

	private class LoopInternal extends com.google.javascript.jscomp.PhaseOptimizer.Loop {
		private final java.util.List<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> myPasses = com.google.common.collect.Lists.newArrayList();

		private final java.util.Set<java.lang.String> myNames = com.google.common.collect.Sets.newHashSet();

		@java.lang.Override
		void addLoopedPass(com.google.javascript.jscomp.PassFactory factory) {
			java.lang.String name = factory.getName();
			com.google.common.base.Preconditions.checkArgument((!(myNames.contains(name))), (("Already a pass with name '" + name) + "' in this loop"));
			myNames.add(factory.getName());
			myPasses.add(new com.google.javascript.jscomp.PhaseOptimizer.PassFactoryDelegate(compiler, factory));
		}

		private java.util.List<java.lang.String> getPassOrder() {
			java.util.List<java.lang.String> order = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.jscomp.PhaseOptimizer.NamedPass pass : myPasses) {
				order.add(pass.name);
			}
			return order;
		}

		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.common.base.Preconditions.checkState((!(loopMutex)), "Nested loops are forbidden");
			loopMutex = true;
			if (com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops) {
				randomizePasses();
			}else {
				optimizePasses();
			}
			try {
				int count = 0;
				out : do {
					if ((count++) > (com.google.javascript.jscomp.PhaseOptimizer.MAX_LOOPS)) {
						compiler.throwInternalError(com.google.javascript.jscomp.PhaseOptimizer.OPTIMIZE_LOOP_ERROR, null);
					}
					recentChange.reset();
					for (com.google.javascript.jscomp.CompilerPass pass : myPasses) {
						pass.process(externs, root);
						if (hasHaltingErrors()) {
							break out;
						}
					}
				} while ((recentChange.hasCodeChanged()) && (!(hasHaltingErrors())) );
				if (com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops) {
					com.google.javascript.jscomp.PhaseOptimizer.loopsRun.add(getPassOrder());
				}
			} finally {
				loopMutex = false;
			}
		}

		private void randomizePasses() {
			java.util.List<com.google.javascript.jscomp.PhaseOptimizer.NamedPass> mixedupPasses = com.google.common.collect.Lists.newArrayList();
			java.util.Random random = new java.util.Random();
			while ((myPasses.size()) > 0) {
				mixedupPasses.add(myPasses.remove(random.nextInt(myPasses.size())));
			} 
			myPasses.addAll(mixedupPasses);
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
}

