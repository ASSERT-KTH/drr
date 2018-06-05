

package com.google.javascript.jscomp;


class UnreachableCodeElimination extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.UnreachableCodeElimination.class.getName());

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean removeNoOpStatements;

	java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> cfgStack = new java.util.LinkedList<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();

	com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> curCfg = null;

	UnreachableCodeElimination(com.google.javascript.jscomp.AbstractCompiler compiler, boolean removeNoOpStatements) {
		this.compiler = compiler;
		this.removeNoOpStatements = removeNoOpStatements;
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.jscomp.Scope scope = t.getScope();
		com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false);
		cfa.process(null, scope.getRootNode());
		cfgStack.push(curCfg);
		curCfg = cfa.getCfg();
		new com.google.javascript.jscomp.graph.GraphReachability<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>(curCfg).compute(curCfg.getEntry().getValue());
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		curCfg = cfgStack.pop();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.UnreachableCodeElimination.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (parent == null) {
			return ;
		}
		if (((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT))) {
			return ;
		}
		if ((n.getType()) == (com.google.javascript.rhino.Token.TRY)) {
			com.google.javascript.rhino.Node body = n.getFirstChild();
			com.google.javascript.rhino.Node catchOrFinallyBlock = body.getNext();
			com.google.javascript.rhino.Node finallyBlock = catchOrFinallyBlock.getNext();
			if ((!(catchOrFinallyBlock.hasChildren())) && ((finallyBlock == null) || (!(finallyBlock.hasChildren())))) {
				n.removeChild(body);
				parent.replaceChild(n, body);
				compiler.reportCodeChange();
				n = body;
			}
		}
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> gNode = curCfg.getDirectedGraphNode(n);
		if (gNode == null) {
			return ;
		}
		if (((gNode.getAnnotation()) != (com.google.javascript.jscomp.graph.GraphReachability.REACHABLE)) || ((removeNoOpStatements) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n))))) {
			removeDeadExprStatementSafely(n);
			return ;
		}
		tryRemoveUnconditionalBranching(n);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.rhino.Node tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node n) {
		if (n == null) {
			return n;
		}
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> gNode = curCfg.getDirectedGraphNode(n);
		if (gNode == null) {
			return n;
		}
		if ((n.getParent()) == null) {
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> outEdges = gNode.getOutEdges();
			if ((outEdges.size()) == 1) {
				return tryRemoveUnconditionalBranching(outEdges.get(0).getDestination().getValue());
			}
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.BLOCK :
				if (n.hasChildren()) {
					com.google.javascript.rhino.Node first = n.getFirstChild();
					return tryRemoveUnconditionalBranching(first);
				}else {
					return tryRemoveUnconditionalBranching(com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(n));
				}
			case com.google.javascript.rhino.Token.RETURN :
				if (n.hasChildren()) {
					break;
				}
			case com.google.javascript.rhino.Token.BREAK :
			case com.google.javascript.rhino.Token.CONTINUE :
				java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> outEdges = gNode.getOutEdges();
				if (((outEdges.size()) == 1) && (((n.getNext()) == null) || ((n.getNext().getType()) == (com.google.javascript.rhino.Token.FUNCTION)))) {
					com.google.common.base.Preconditions.checkState(((outEdges.get(0).getValue()) == (com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND)));
					com.google.javascript.rhino.Node fallThrough = tryRemoveUnconditionalBranching(com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(n));
					com.google.javascript.rhino.Node nextCfgNode = outEdges.get(0).getDestination().getValue();
					if (nextCfgNode == fallThrough) {
						removeDeadExprStatementSafely(n);
						return fallThrough;
					}
				}
		}
		return n;
	}

	private void removeDeadExprStatementSafely(com.google.javascript.rhino.Node n) {
		if (((n.getType()) == (com.google.javascript.rhino.Token.EMPTY)) || (((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) && (!(n.hasChildren())))) {
			return ;
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.CATCH :
			case com.google.javascript.rhino.Token.FINALLY :
				return ;
		}
		com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(n);
		compiler.reportCodeChange();
		if (com.google.javascript.jscomp.UnreachableCodeElimination.logger.isLoggable(java.util.logging.Level.FINE)) {
			com.google.javascript.jscomp.UnreachableCodeElimination.logger.fine(("Removing " + (n.toString())));
		}
		com.google.javascript.jscomp.NodeUtil.removeChild(n.getParent(), n);
	}
}

