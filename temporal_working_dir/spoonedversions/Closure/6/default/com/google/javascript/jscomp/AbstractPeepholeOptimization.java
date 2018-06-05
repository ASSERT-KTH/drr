

package com.google.javascript.jscomp;


abstract class AbstractPeepholeOptimization {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	abstract com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree);

	protected void error(com.google.javascript.jscomp.DiagnosticType diagnostic, com.google.javascript.rhino.Node n) {
		com.google.javascript.jscomp.JSError error = com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(n), n, diagnostic, n.toString());
		compiler.report(error);
	}

	protected void reportCodeChange() {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		compiler.reportCodeChange();
	}

	protected boolean areNodesEqualForInlining(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		return compiler.areNodesEqualForInlining(n1, n2);
	}

	protected boolean isASTNormalized() {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		return compiler.getLifeCycleStage().isNormalized();
	}

	void beginTraversal(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.AbstractPeepholeOptimization.this.compiler = compiler;
	}

	void endTraversal(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.AbstractPeepholeOptimization.this.compiler = null;
	}

	boolean mayEffectMutableState(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(n, compiler);
	}

	boolean mayHaveSideEffects(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n, compiler);
	}

	boolean nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(n, compiler);
	}

	boolean isEcmaScript5OrGreater() {
		return ((compiler) != null) && (compiler.acceptEcmaScript5());
	}

	com.google.javascript.jscomp.CodingConvention getCodingConvention() {
		return compiler.getCodingConvention();
	}

	@com.google.common.annotations.VisibleForTesting
	static com.google.javascript.rhino.Node validateResult(com.google.javascript.rhino.Node n) {
		done : {
			if (((n != null) && (!(n.isScript()))) && ((!(n.isBlock())) || (!(n.isSyntheticBlock())))) {
				for (com.google.javascript.rhino.Node parent : n.getAncestors()) {
					if (parent.isScript()) {
						break done;
					}
				}
				com.google.common.base.Preconditions.checkState(false);
			}
		}
		return n;
	}
}

