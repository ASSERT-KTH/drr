

package com.google.javascript.jscomp;


class ControlFlowGraph<N> extends com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> {
	private final com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> implicitReturn;

	private final com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> entry;

	public ControlFlowGraph(N entry) {
		implicitReturn = createDirectedGraphNode(null);
		this.entry = createDirectedGraphNode(entry);
	}

	public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> getImplicitReturn() {
		return implicitReturn;
	}

	public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> getEntry() {
		return entry;
	}

	public boolean isImplicitReturn(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node) {
		return node == (implicitReturn);
	}

	public void connectToImplicitReturn(N srcValue, com.google.javascript.jscomp.ControlFlowGraph.Branch edgeValue) {
		super.connect(srcValue, edgeValue, null);
	}

	public java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> getOptionalNodeComparator(boolean isForward) {
		return null;
	}

	public static enum Branch {
ON_TRUE, ON_FALSE, UNCOND, ON_EX, SYN_BLOCK;
		public boolean isConditional() {
			return ((com.google.javascript.jscomp.ControlFlowGraph.Branch.this) == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE)) || ((com.google.javascript.jscomp.ControlFlowGraph.Branch.this) == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE));
		}
	}

	public abstract static class AbstractCfgNodeTraversalCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (parent == null) {
				return true;
			}
			return !(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(n));
		}
	}

	public static boolean isEnteringNewCfgNode(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.FINALLY :
				return true;
			case com.google.javascript.rhino.Token.FUNCTION :
				return n != (parent.getFirstChild().getNext());
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.IF :
				return (com.google.javascript.jscomp.NodeUtil.getConditionExpression(parent)) != n;
			case com.google.javascript.rhino.Token.FOR :
				if (com.google.javascript.jscomp.NodeUtil.isForIn(parent)) {
					return n == (parent.getLastChild());
				}else {
					return (com.google.javascript.jscomp.NodeUtil.getConditionExpression(parent)) != n;
				}
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.CASE :
			case com.google.javascript.rhino.Token.CATCH :
			case com.google.javascript.rhino.Token.WITH :
				return n != (parent.getFirstChild());
			default :
				return false;
		}
	}
}

