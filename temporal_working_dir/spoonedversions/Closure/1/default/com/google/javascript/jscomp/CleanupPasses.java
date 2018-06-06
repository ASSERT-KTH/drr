

package com.google.javascript.jscomp;


class CleanupPasses extends com.google.javascript.jscomp.PassConfig {
	private com.google.javascript.jscomp.PassConfig.State state;

	public CleanupPasses(com.google.javascript.jscomp.CompilerOptions options) {
		super(options);
	}

	@java.lang.Override
	protected java.util.List<com.google.javascript.jscomp.PassFactory> getChecks() {
		java.util.List<com.google.javascript.jscomp.PassFactory> checks = com.google.common.collect.Lists.newArrayList();
		checks.add(fieldCleanupPassFactory);
		checks.add(scopeCleanupPassFactory);
		checks.add(globalVarRefCleanupPassFactory);
		return checks;
	}

	@java.lang.Override
	protected com.google.javascript.jscomp.PassConfig.State getIntermediateState() {
		return state;
	}

	@java.lang.Override
	protected java.util.List<com.google.javascript.jscomp.PassFactory> getOptimizations() {
		return com.google.common.collect.ImmutableList.of();
	}

	@java.lang.Override
	protected void setIntermediateState(com.google.javascript.jscomp.PassConfig.State state) {
		com.google.javascript.jscomp.CleanupPasses.this.state = state;
	}

	final com.google.javascript.jscomp.PassFactory fieldCleanupPassFactory = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("FieldCleaupPassFactory", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.FieldCleanupPass(compiler);
		}
	};

	final com.google.javascript.jscomp.PassFactory scopeCleanupPassFactory = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("ScopeCleanupPassFactory", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass(compiler);
		}
	};

	final com.google.javascript.jscomp.PassFactory globalVarRefCleanupPassFactory = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("GlobalVarRefCleanupPassFactory", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass(compiler);
		}
	};

	static class MemoizedScopeCleanupPass implements com.google.javascript.jscomp.HotSwapCompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		public MemoizedScopeCleanupPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
			com.google.javascript.jscomp.ScopeCreator creator = compiler.getTypedScopeCreator();
			if (creator instanceof com.google.javascript.jscomp.MemoizedScopeCreator) {
				com.google.javascript.jscomp.MemoizedScopeCreator scopeCreator = ((com.google.javascript.jscomp.MemoizedScopeCreator) (creator));
				java.lang.String newSrc = scriptRoot.getSourceFileName();
				for (com.google.javascript.jscomp.Scope.Var var : scopeCreator.getAllSymbols()) {
					com.google.javascript.rhino.jstype.JSType type = var.getType();
					if (type != null) {
						com.google.javascript.rhino.jstype.FunctionType fnType = type.toMaybeFunctionType();
						if ((fnType != null) && (newSrc.equals(com.google.javascript.jscomp.NodeUtil.getSourceName(fnType.getSource())))) {
							fnType.setSource(null);
						}
					}
				}
				scopeCreator.removeScopesForScript(originalRoot.getSourceFileName());
			}
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		}
	}
}

