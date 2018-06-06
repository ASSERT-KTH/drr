

package com.google.javascript.jscomp;


class ChainCalls implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.rhino.Node> badFunctionNodes = com.google.common.collect.Sets.newHashSet();

	private final java.util.Set<com.google.javascript.rhino.Node> goodFunctionNodes = com.google.common.collect.Sets.newHashSet();

	private final java.util.List<com.google.javascript.jscomp.ChainCalls.CallSite> callSites = com.google.common.collect.Lists.newArrayList();

	private com.google.javascript.jscomp.SimpleDefinitionFinder defFinder;

	private com.google.javascript.jscomp.ChainCalls.GatherFunctions gatherFunctions = new com.google.javascript.jscomp.ChainCalls.GatherFunctions();

	ChainCalls(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, root);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ChainCalls.GatherCallSites());
		for (com.google.javascript.jscomp.ChainCalls.CallSite callSite : callSites) {
			callSite.parent.removeChild(callSite.n);
			callSite.n.removeChild(callSite.callNode);
			callSite.nextGetPropNode.replaceChild(callSite.nextGetPropFirstChildNode, callSite.callNode);
			compiler.reportCodeChange();
		}
	}

	private class GatherFunctions implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = t.getControlFlowGraph();
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> s : cfg.getImplicitReturn().getInEdges()) {
				com.google.javascript.rhino.Node exitNode = s.getSource().getValue();
				if ((((exitNode.getType()) != (com.google.javascript.rhino.Token.RETURN)) || ((exitNode.getFirstChild()) == null)) || ((exitNode.getFirstChild().getType()) != (com.google.javascript.rhino.Token.THIS))) {
					badFunctionNodes.add(t.getScopeRoot());
					return ;
				}
			}
			goodFunctionNodes.add(t.getScopeRoot());
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}

	private class GatherCallSites extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(com.google.javascript.jscomp.NodeUtil.isExpressionNode(n))) {
				return ;
			}
			com.google.javascript.rhino.Node callNode = n.getFirstChild();
			if ((callNode.getType()) != (com.google.javascript.rhino.Token.CALL)) {
				return ;
			}
			com.google.javascript.rhino.Node getPropNode = callNode.getFirstChild();
			if ((getPropNode.getType()) != (com.google.javascript.rhino.Token.GETPROP)) {
				return ;
			}
			com.google.javascript.rhino.Node getPropFirstChildNode = getPropNode.getFirstChild();
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> definitions = defFinder.getDefinitionsReferencedAt(getPropNode);
			if (definitions == null) {
				return ;
			}
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition definition : definitions) {
				com.google.javascript.rhino.Node rValue = definition.getRValue();
				if (rValue == null) {
					return ;
				}
				if (badFunctionNodes.contains(rValue)) {
					return ;
				}
				if (!(goodFunctionNodes.contains(rValue))) {
					com.google.javascript.jscomp.NodeTraversal.traverse(compiler, rValue, gatherFunctions);
					if (badFunctionNodes.contains(rValue)) {
						return ;
					}
				}
			}
			com.google.javascript.rhino.Node nextNode = n.getNext();
			if ((nextNode == null) || ((nextNode.getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT))) {
				return ;
			}
			com.google.javascript.rhino.Node nextCallNode = nextNode.getFirstChild();
			if ((nextCallNode.getType()) != (com.google.javascript.rhino.Token.CALL)) {
				return ;
			}
			com.google.javascript.rhino.Node nextGetPropNode = nextCallNode.getFirstChild();
			if ((nextGetPropNode.getType()) != (com.google.javascript.rhino.Token.GETPROP)) {
				return ;
			}
			com.google.javascript.rhino.Node nextGetPropFirstChildNode = nextGetPropNode.getFirstChild();
			if (!(compiler.areNodesEqualForInlining(nextGetPropFirstChildNode, getPropFirstChildNode))) {
				return ;
			}
			if (com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(getPropFirstChildNode)) {
				return ;
			}
			callSites.add(new com.google.javascript.jscomp.ChainCalls.CallSite(parent, n, callNode, nextGetPropNode, nextGetPropFirstChildNode));
		}
	}

	private static class CallSite {
		final com.google.javascript.rhino.Node parent;

		final com.google.javascript.rhino.Node n;

		final com.google.javascript.rhino.Node callNode;

		final com.google.javascript.rhino.Node nextGetPropNode;

		final com.google.javascript.rhino.Node nextGetPropFirstChildNode;

		CallSite(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node nextGetPropNode, com.google.javascript.rhino.Node nextGetPropFirstChildNode) {
			this.parent = parent;
			this.n = n;
			this.callNode = callNode;
			this.nextGetPropNode = nextGetPropNode;
			this.nextGetPropFirstChildNode = nextGetPropFirstChildNode;
		}
	}
}

