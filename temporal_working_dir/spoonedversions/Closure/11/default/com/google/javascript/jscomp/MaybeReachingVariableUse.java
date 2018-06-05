

package com.google.javascript.jscomp;


class MaybeReachingVariableUse extends com.google.javascript.jscomp.DataFlowAnalysis<com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses> {
	private final com.google.javascript.jscomp.Scope jsScope;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> escaped;

	MaybeReachingVariableUse(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, com.google.javascript.jscomp.Scope jsScope, com.google.javascript.jscomp.AbstractCompiler compiler) {
		super(cfg, new com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUsesJoinOp());
		this.jsScope = jsScope;
		this.escaped = com.google.common.collect.Sets.newHashSet();
		com.google.javascript.jscomp.DataFlowAnalysis.computeEscaped(jsScope, escaped, compiler);
	}

	static final class ReachingUses implements com.google.javascript.jscomp.graph.LatticeElement {
		final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node> mayUseMap;

		public ReachingUses() {
			mayUseMap = com.google.common.collect.HashMultimap.create();
		}

		public ReachingUses(com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses other) {
			mayUseMap = com.google.common.collect.HashMultimap.create(other.mayUseMap);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			return (other instanceof com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses) && (((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses) (other)).mayUseMap.equals(com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses.this.mayUseMap));
		}

		@java.lang.Override
		public int hashCode() {
			return mayUseMap.hashCode();
		}
	}

	private static class ReachingUsesJoinOp implements com.google.javascript.jscomp.JoinOp<com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses> {
		@java.lang.Override
		public com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses apply(java.util.List<com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses> from) {
			com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses result = new com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses();
			for (com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses uses : from) {
				result.mayUseMap.putAll(uses.mayUseMap);
			}
			return result;
		}
	}

	@java.lang.Override
	boolean isForward() {
		return false;
	}

	@java.lang.Override
	com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses createEntryLattice() {
		return new com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses();
	}

	@java.lang.Override
	com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses createInitialEstimateLattice() {
		return new com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses();
	}

	@java.lang.Override
	com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses flowThrough(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses input) {
		com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses output = new com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses(input);
		boolean conditional = hasExceptionHandler(n);
		computeMayUse(n, n, output, conditional);
		return output;
	}

	private boolean hasExceptionHandler(com.google.javascript.rhino.Node cfgNode) {
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> branchEdges = getCfg().getOutEdges(cfgNode);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> edge : branchEdges) {
			if ((edge.getValue()) == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_EX)) {
				return true;
			}
		}
		return false;
	}

	private void computeMayUse(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node cfgNode, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses output, boolean conditional) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.FUNCTION :
				return ;
			case com.google.javascript.rhino.Token.NAME :
				addToUseIfLocal(n.getString(), cfgNode, output);
				return ;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.IF :
				computeMayUse(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				if (!(com.google.javascript.jscomp.NodeUtil.isForIn(n))) {
					computeMayUse(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
				}else {
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					com.google.javascript.rhino.Node rhs = lhs.getNext();
					if (lhs.isVar()) {
						lhs = lhs.getLastChild();
					}
					if ((lhs.isName()) && (!conditional)) {
						removeFromUseIfLocal(lhs.getString(), output);
					}
					computeMayUse(rhs, cfgNode, output, conditional);
				}
				return ;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				computeMayUse(n.getLastChild(), cfgNode, output, true);
				computeMayUse(n.getFirstChild(), cfgNode, output, conditional);
				return ;
			case com.google.javascript.rhino.Token.HOOK :
				computeMayUse(n.getLastChild(), cfgNode, output, true);
				computeMayUse(n.getFirstChild().getNext(), cfgNode, output, true);
				computeMayUse(n.getFirstChild(), cfgNode, output, conditional);
				return ;
			case com.google.javascript.rhino.Token.VAR :
				com.google.javascript.rhino.Node varName = n.getFirstChild();
				com.google.common.base.Preconditions.checkState(n.hasChildren(), "AST should be normalized");
				if (varName.hasChildren()) {
					computeMayUse(varName.getFirstChild(), cfgNode, output, conditional);
					if (!conditional) {
						removeFromUseIfLocal(varName.getString(), output);
					}
				}
				return ;
			default :
				if ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) && (n.getFirstChild().isName())) {
					com.google.javascript.rhino.Node name = n.getFirstChild();
					if (!conditional) {
						removeFromUseIfLocal(name.getString(), output);
					}
					if (!(n.isAssign())) {
						addToUseIfLocal(name.getString(), cfgNode, output);
					}
					computeMayUse(name.getNext(), cfgNode, output, conditional);
				}else {
					for (com.google.javascript.rhino.Node c = n.getLastChild(); c != null; c = n.getChildBefore(c)) {
						computeMayUse(c, cfgNode, output, conditional);
					}
				}
		}
	}

	private void addToUseIfLocal(java.lang.String name, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses use) {
		com.google.javascript.jscomp.Scope.Var var = jsScope.getVar(name);
		if ((var == null) || ((var.scope) != (jsScope))) {
			return ;
		}
		if (!(escaped.contains(var))) {
			use.mayUseMap.put(var, node);
		}
	}

	private void removeFromUseIfLocal(java.lang.String name, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses use) {
		com.google.javascript.jscomp.Scope.Var var = jsScope.getVar(name);
		if ((var == null) || ((var.scope) != (jsScope))) {
			return ;
		}
		if (!(escaped.contains(var))) {
			use.mayUseMap.removeAll(var);
		}
	}

	java.util.Collection<com.google.javascript.rhino.Node> getUses(java.lang.String name, com.google.javascript.rhino.Node defNode) {
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n = getCfg().getNode(defNode);
		com.google.common.base.Preconditions.checkNotNull(n);
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses> state = n.getAnnotation();
		return state.getOut().mayUseMap.get(jsScope.getVar(name));
	}
}

