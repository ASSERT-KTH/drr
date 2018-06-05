

package com.google.javascript.jscomp;


class CheckUnreachableCode implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	static final com.google.javascript.jscomp.DiagnosticType UNREACHABLE_CODE = com.google.javascript.jscomp.DiagnosticType.error("JSC_UNREACHABLE_CODE", "unreachable code");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel level;

	CheckUnreachableCode(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this.compiler = compiler;
		this.level = level;
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		initScope(t.getControlFlowGraph());
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> gNode = t.getControlFlowGraph().getNode(n);
		if ((gNode != null) && ((gNode.getAnnotation()) != (com.google.javascript.jscomp.graph.GraphReachability.REACHABLE))) {
			if ((((n.getLineno()) != (-1)) && ((n.getType()) != (com.google.javascript.rhino.Token.EMPTY))) && ((n.getType()) != (com.google.javascript.rhino.Token.BREAK))) {
				compiler.report(t.makeError(n, level, com.google.javascript.jscomp.CheckUnreachableCode.UNREACHABLE_CODE));
				new com.google.javascript.jscomp.graph.GraphReachability<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>(t.getControlFlowGraph()).recompute(n);
				return false;
			}
		}
		return true;
	}

	private void initScope(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> controlFlowGraph) {
		new com.google.javascript.jscomp.graph.GraphReachability<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>(controlFlowGraph, new com.google.javascript.jscomp.CheckUnreachableCode.ReachablePredicate()).compute(controlFlowGraph.getEntry().getValue());
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
	}

	private final class ReachablePredicate implements com.google.common.base.Predicate<com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> {
		@java.lang.Override
		public boolean apply(com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> input) {
			com.google.javascript.jscomp.ControlFlowGraph.Branch branch = input.edge;
			if (!(branch.isConditional())) {
				return true;
			}
			com.google.javascript.rhino.Node predecessor = input.sourceNode;
			com.google.javascript.rhino.Node condition = com.google.javascript.jscomp.NodeUtil.getConditionExpression(predecessor);
			if (condition != null) {
				com.google.javascript.rhino.jstype.TernaryValue val = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(condition);
				if (val != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					return (val.toBoolean(true)) == (branch == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE));
				}
			}
			return true;
		}
	}
}

