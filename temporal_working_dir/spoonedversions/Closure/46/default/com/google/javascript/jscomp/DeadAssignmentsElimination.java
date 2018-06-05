

package com.google.javascript.jscomp;


class DeadAssignmentsElimination extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.LiveVariablesAnalysis liveness;

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> matchRemovableAssigns = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) && (n.getFirstChild().isName())) || (n.isInc())) || (n.isDec());
		}
	};

	public DeadAssignmentsElimination(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkNotNull(externs);
		com.google.common.base.Preconditions.checkNotNull(root);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.DeadAssignmentsElimination.this);
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.jscomp.Scope scope = t.getScope();
		if (scope.isGlobal()) {
			return ;
		}
		if ((com.google.javascript.jscomp.LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE) < (t.getScope().getVarCount())) {
			return ;
		}
		com.google.javascript.rhino.Node fnBlock = t.getScopeRoot().getLastChild();
		if (com.google.javascript.jscomp.NodeUtil.containsFunction(fnBlock)) {
			return ;
		}
		if (!(com.google.javascript.jscomp.NodeUtil.has(fnBlock, com.google.javascript.jscomp.DeadAssignmentsElimination.matchRemovableAssigns, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysTrue()))) {
			return ;
		}
		com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = t.getControlFlowGraph();
		liveness = new com.google.javascript.jscomp.LiveVariablesAnalysis(cfg, scope, compiler);
		liveness.analyze();
		tryRemoveDeadAssignments(t, cfg);
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
	}

	private void tryRemoveDeadAssignments(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg) {
		java.lang.Iterable<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> nodes = cfg.getDirectedGraphNodes();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> cfgNode : nodes) {
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> state = cfgNode.getAnnotation();
			com.google.javascript.rhino.Node n = cfgNode.getValue();
			if (n == null) {
				continue;
			}
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.DO :
					tryRemoveAssignment(t, com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), state);
					continue;
				case com.google.javascript.rhino.Token.FOR :
					if (!(com.google.javascript.jscomp.NodeUtil.isForIn(n))) {
						tryRemoveAssignment(t, com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), state);
					}
					continue;
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.RETURN :
					if (n.hasChildren()) {
						tryRemoveAssignment(t, n.getFirstChild(), state);
					}
					continue;
			}
			tryRemoveAssignment(t, n, state);
		}
	}

	private void tryRemoveAssignment(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> state) {
		tryRemoveAssignment(t, n, n, state);
	}

	private void tryRemoveAssignment(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node exprRoot, com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> state) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) || (n.isInc())) || (n.isDec())) {
			com.google.javascript.rhino.Node lhs = n.getFirstChild();
			com.google.javascript.rhino.Node rhs = lhs.getNext();
			if (rhs != null) {
				tryRemoveAssignment(t, rhs, exprRoot, state);
				rhs = lhs.getNext();
			}
			com.google.javascript.jscomp.Scope scope = t.getScope();
			if (!(lhs.isName())) {
				return ;
			}
			java.lang.String name = lhs.getString();
			if (!(scope.isDeclared(name, false))) {
				return ;
			}
			com.google.javascript.jscomp.Scope.Var var = scope.getVar(name);
			if (liveness.getEscapedLocals().contains(var)) {
				return ;
			}
			if ((((rhs != null) && (rhs.isName())) && (rhs.getString().equals(var.name))) && (n.isAssign())) {
				n.removeChild(rhs);
				n.getParent().replaceChild(n, rhs);
				compiler.reportCodeChange();
				return ;
			}
			if (state.getOut().isLive(var)) {
				return ;
			}
			if ((state.getIn().isLive(var)) && (isVariableStillLiveWithinExpression(n, exprRoot, var.name))) {
				return ;
			}
			if (n.isAssign()) {
				n.removeChild(rhs);
				n.getParent().replaceChild(n, rhs);
			}else
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) {
					n.removeChild(rhs);
					n.removeChild(lhs);
					com.google.javascript.rhino.Node op = new com.google.javascript.rhino.Node(com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(n), lhs, rhs);
					parent.replaceChild(n, op);
				}else
					if ((n.isInc()) || (n.isDec())) {
						if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) {
							parent.replaceChild(n, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID, com.google.javascript.rhino.Node.newNumber(0).copyInformationFrom(n)));
						}else
							if ((n.isComma()) && (n != (parent.getLastChild()))) {
								parent.removeChild(n);
							}else
								if (((parent.isFor()) && (!(com.google.javascript.jscomp.NodeUtil.isForIn(parent)))) && ((com.google.javascript.jscomp.NodeUtil.getConditionExpression(parent)) != n)) {
									parent.replaceChild(n, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
								}else {
									return ;
								}
							
						
					}else {
						com.google.common.base.Preconditions.checkState(false, "Unknown statement");
					}
				
			
			compiler.reportCodeChange();
			return ;
		}else {
			for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null;) {
				com.google.javascript.rhino.Node next = c.getNext();
				if (!(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(c))) {
					tryRemoveAssignment(t, c, exprRoot, state);
				}
				c = next;
			}
			return ;
		}
	}

	private boolean isVariableStillLiveWithinExpression(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node exprRoot, java.lang.String variable) {
		while (n != exprRoot) {
			com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness state = com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
			switch (n.getParent().getType()) {
				case com.google.javascript.rhino.Token.OR :
				case com.google.javascript.rhino.Token.AND :
					if ((n.getNext()) != null) {
						state = isVariableReadBeforeKill(n.getNext(), variable);
						if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL)) {
							state = com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
						}
					}
					break;
				case com.google.javascript.rhino.Token.HOOK :
					if (((n.getNext()) != null) && ((n.getNext().getNext()) != null)) {
						state = checkHookBranchReadBeforeKill(n.getNext(), n.getNext().getNext(), variable);
					}
					break;
				default :
					for (com.google.javascript.rhino.Node sibling = n.getNext(); sibling != null; sibling = sibling.getNext()) {
						state = isVariableReadBeforeKill(sibling, variable);
						if (state != (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE)) {
							break;
						}
					}
			}
			if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ)) {
				return true;
			}else
				if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL)) {
					return false;
				}
			
			n = n.getParent();
		} 
		return false;
	}

	private enum VariableLiveness {
MAYBE_LIVE, READ, KILL;	}

	private com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness isVariableReadBeforeKill(com.google.javascript.rhino.Node n, java.lang.String variable) {
		if (com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(n)) {
			return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
		}
		if ((n.isName()) && (variable.equals(n.getString()))) {
			if (com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(n, n.getParent())) {
				com.google.common.base.Preconditions.checkState(n.getParent().isAssign());
				com.google.javascript.rhino.Node rhs = n.getNext();
				com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness state = isVariableReadBeforeKill(rhs, variable);
				if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ)) {
					return state;
				}
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL;
			}else {
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ;
			}
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.AND :
				com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness v1 = isVariableReadBeforeKill(n.getFirstChild(), variable);
				com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness v2 = isVariableReadBeforeKill(n.getLastChild(), variable);
				if (v1 != (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE)) {
					return v1;
				}else
					if (v2 == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ)) {
						return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ;
					}else {
						return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
					}
				
			case com.google.javascript.rhino.Token.HOOK :
				com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness first = isVariableReadBeforeKill(n.getFirstChild(), variable);
				if (first != (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE)) {
					return first;
				}
				return checkHookBranchReadBeforeKill(n.getFirstChild().getNext(), n.getLastChild(), variable);
			default :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
					com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness state = isVariableReadBeforeKill(child, variable);
					if (state != (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE)) {
						return state;
					}
				}
		}
		return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
	}

	private com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness checkHookBranchReadBeforeKill(com.google.javascript.rhino.Node trueCase, com.google.javascript.rhino.Node falseCase, java.lang.String variable) {
		com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness v1 = isVariableReadBeforeKill(trueCase, variable);
		com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness v2 = isVariableReadBeforeKill(falseCase, variable);
		if ((v1 == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ)) || (v2 == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ))) {
			return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ;
		}else
			if ((v1 == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL)) && (v2 == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL))) {
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL;
			}else {
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
			}
		
	}
}

