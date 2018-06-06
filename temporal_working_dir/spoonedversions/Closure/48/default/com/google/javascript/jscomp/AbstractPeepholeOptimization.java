

package com.google.javascript.jscomp;


abstract class AbstractPeepholeOptimization {
	private com.google.javascript.jscomp.NodeTraversal currentTraversal;

	abstract com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree);

	protected void error(com.google.javascript.jscomp.DiagnosticType diagnostic, com.google.javascript.rhino.Node n) {
		com.google.javascript.jscomp.JSError error = currentTraversal.makeError(n, diagnostic, n.toString());
		currentTraversal.getCompiler().report(error);
	}

	protected void reportCodeChange() {
		com.google.common.base.Preconditions.checkNotNull(currentTraversal);
		currentTraversal.getCompiler().reportCodeChange();
	}

	protected boolean areNodesEqualForInlining(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2) {
		com.google.common.base.Preconditions.checkNotNull(currentTraversal);
		return currentTraversal.getCompiler().areNodesEqualForInlining(n1, n2);
	}

	protected boolean isASTNormalized() {
		com.google.common.base.Preconditions.checkNotNull(currentTraversal);
		com.google.common.base.Preconditions.checkNotNull(currentTraversal.getCompiler());
		return currentTraversal.getCompiler().getLifeCycleStage().isNormalized();
	}

	void beginTraversal(com.google.javascript.jscomp.NodeTraversal traversal) {
		currentTraversal = traversal;
	}

	void endTraversal(com.google.javascript.jscomp.NodeTraversal traversal) {
		currentTraversal = null;
	}

	boolean mayEffectMutableState(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(n, currentTraversal.getCompiler());
	}

	boolean mayHaveSideEffects(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n, currentTraversal.getCompiler());
	}

	boolean isEcmaScript5OrGreater() {
		return ((currentTraversal) != null) && (currentTraversal.getCompiler().acceptEcmaScript5());
	}

	com.google.javascript.jscomp.CodingConvention getCodingConvention() {
		return currentTraversal.getCompiler().getCodingConvention();
	}

	@com.google.common.annotations.VisibleForTesting
	static com.google.javascript.rhino.Node validateResult(com.google.javascript.rhino.Node n) {
		done : {
			if (((n != null) && ((n.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) && (((n.getType()) != (com.google.javascript.rhino.Token.BLOCK)) || (!(n.isSyntheticBlock())))) {
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

