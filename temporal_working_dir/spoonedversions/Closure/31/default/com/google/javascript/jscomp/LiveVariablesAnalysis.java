

package com.google.javascript.jscomp;


class LiveVariablesAnalysis extends com.google.javascript.jscomp.DataFlowAnalysis<com.google.javascript.rhino.Node, com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> {
	static final int MAX_VARIABLES_TO_ANALYZE = 100;

	public static final java.lang.String ARGUMENT_ARRAY_ALIAS = "arguments";

	private static class LiveVariableJoinOp implements com.google.javascript.jscomp.JoinOp<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> {
		@java.lang.Override
		public com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice apply(java.util.List<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> in) {
			com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice result = new com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice(in.get(0));
			for (int i = 1; i < (in.size()); i++) {
				result.liveSet.or(in.get(i).liveSet);
			}
			return result;
		}
	}

	static class LiveVariableLattice implements com.google.javascript.jscomp.graph.LatticeElement {
		private final java.util.BitSet liveSet;

		private LiveVariableLattice(int numVars) {
			this.liveSet = new java.util.BitSet(numVars);
		}

		private LiveVariableLattice(com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice other) {
			com.google.common.base.Preconditions.checkNotNull(other);
			this.liveSet = ((java.util.BitSet) (other.liveSet.clone()));
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			com.google.common.base.Preconditions.checkNotNull(other);
			return (other instanceof com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice) && (com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.this.liveSet.equals(((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice) (other)).liveSet));
		}

		public boolean isLive(com.google.javascript.jscomp.Scope.Var v) {
			com.google.common.base.Preconditions.checkNotNull(v);
			return liveSet.get(v.index);
		}

		public boolean isLive(int index) {
			return liveSet.get(index);
		}

		@java.lang.Override
		public java.lang.String toString() {
			return liveSet.toString();
		}

		@java.lang.Override
		public int hashCode() {
			return liveSet.hashCode();
		}
	}

	private final com.google.javascript.jscomp.Scope jsScope;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> escaped;

	LiveVariablesAnalysis(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, com.google.javascript.jscomp.Scope jsScope, com.google.javascript.jscomp.AbstractCompiler compiler) {
		super(cfg, new com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableJoinOp());
		this.jsScope = jsScope;
		this.escaped = com.google.common.collect.Sets.newHashSet();
		com.google.javascript.jscomp.DataFlowAnalysis.computeEscaped(jsScope, escaped, compiler);
	}

	public java.util.Set<com.google.javascript.jscomp.Scope.Var> getEscapedLocals() {
		return escaped;
	}

	public int getVarIndex(java.lang.String var) {
		return jsScope.getVar(var).index;
	}

	@java.lang.Override
	boolean isForward() {
		return false;
	}

	@java.lang.Override
	com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice createEntryLattice() {
		return new com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice(jsScope.getVarCount());
	}

	@java.lang.Override
	com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice createInitialEstimateLattice() {
		return new com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice(jsScope.getVarCount());
	}

	@java.lang.Override
	com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice flowThrough(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice input) {
		final java.util.BitSet gen = new java.util.BitSet(input.liveSet.size());
		final java.util.BitSet kill = new java.util.BitSet(input.liveSet.size());
		boolean conditional = false;
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> edgeList = getCfg().getOutEdges(node);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> edge : edgeList) {
			if (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_EX.equals(edge.getValue())) {
				conditional = true;
			}
		}
		computeGenKill(node, gen, kill, conditional);
		com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice result = new com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice(input);
		result.liveSet.andNot(kill);
		result.liveSet.or(gen);
		return result;
	}

	private void computeGenKill(com.google.javascript.rhino.Node n, java.util.BitSet gen, java.util.BitSet kill, boolean conditional) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.FUNCTION :
				return ;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.IF :
				computeGenKill(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), gen, kill, conditional);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				if (!(com.google.javascript.jscomp.NodeUtil.isForIn(n))) {
					computeGenKill(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), gen, kill, conditional);
				}else {
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					com.google.javascript.rhino.Node rhs = lhs.getNext();
					if (lhs.isVar()) {
						lhs = lhs.getLastChild();
					}
					if (lhs.isName()) {
						addToSetIfLocal(lhs, kill);
						addToSetIfLocal(lhs, gen);
					}else {
						computeGenKill(lhs, gen, kill, conditional);
					}
					computeGenKill(rhs, gen, kill, conditional);
				}
				return ;
			case com.google.javascript.rhino.Token.VAR :
				for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
					if (c.hasChildren()) {
						computeGenKill(c.getFirstChild(), gen, kill, conditional);
						if (!conditional) {
							addToSetIfLocal(c, kill);
						}
					}
				}
				return ;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				computeGenKill(n.getFirstChild(), gen, kill, conditional);
				computeGenKill(n.getLastChild(), gen, kill, true);
				return ;
			case com.google.javascript.rhino.Token.HOOK :
				computeGenKill(n.getFirstChild(), gen, kill, conditional);
				computeGenKill(n.getFirstChild().getNext(), gen, kill, true);
				computeGenKill(n.getLastChild(), gen, kill, true);
				return ;
			case com.google.javascript.rhino.Token.NAME :
				if (isArgumentsName(n)) {
					markAllParametersEscaped();
				}else {
					addToSetIfLocal(n, gen);
				}
				return ;
			default :
				if ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) && (n.getFirstChild().isName())) {
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					if (!conditional) {
						addToSetIfLocal(lhs, kill);
					}
					if (!(n.isAssign())) {
						addToSetIfLocal(lhs, gen);
					}
					computeGenKill(lhs.getNext(), gen, kill, conditional);
				}else {
					for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
						computeGenKill(c, gen, kill, conditional);
					}
				}
				return ;
		}
	}

	private void addToSetIfLocal(com.google.javascript.rhino.Node node, java.util.BitSet set) {
		com.google.common.base.Preconditions.checkState(node.isName());
		java.lang.String name = node.getString();
		if (!(jsScope.isDeclared(name, false))) {
			return ;
		}
		com.google.javascript.jscomp.Scope.Var var = jsScope.getVar(name);
		if (!(escaped.contains(var))) {
			set.set(var.index);
		}
	}

	void markAllParametersEscaped() {
		com.google.javascript.rhino.Node lp = jsScope.getRootNode().getFirstChild().getNext();
		for (com.google.javascript.rhino.Node arg = lp.getFirstChild(); arg != null; arg = arg.getNext()) {
			escaped.add(jsScope.getVar(arg.getString()));
		}
	}

	private boolean isArgumentsName(com.google.javascript.rhino.Node n) {
		if (((!(n.isName())) || (!(n.getString().equals(com.google.javascript.jscomp.LiveVariablesAnalysis.ARGUMENT_ARRAY_ALIAS)))) || (jsScope.isDeclared(com.google.javascript.jscomp.LiveVariablesAnalysis.ARGUMENT_ARRAY_ALIAS, false))) {
			return false;
		}else {
			return true;
		}
	}
}

