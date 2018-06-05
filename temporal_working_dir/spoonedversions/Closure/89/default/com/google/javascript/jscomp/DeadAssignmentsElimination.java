

package com.google.javascript.jscomp;


class DeadAssignmentsElimination extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.LiveVariablesAnalysis liveness;

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> matchRemovableAssigns = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME))) || ((n.getType()) == (com.google.javascript.rhino.Token.INC))) || ((n.getType()) == (com.google.javascript.rhino.Token.DEC));
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
		if (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) || ((n.getType()) == (com.google.javascript.rhino.Token.INC))) || ((n.getType()) == (com.google.javascript.rhino.Token.DEC))) {
			com.google.javascript.rhino.Node lhs = n.getFirstChild();
			com.google.javascript.rhino.Node rhs = lhs.getNext();
			if (rhs != null) {
				tryRemoveAssignment(t, rhs, exprRoot, state);
				rhs = lhs.getNext();
			}
			com.google.javascript.jscomp.Scope scope = t.getScope();
			if (!(com.google.javascript.jscomp.NodeUtil.isName(lhs))) {
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
			if ((((rhs != null) && (com.google.javascript.jscomp.NodeUtil.isName(rhs))) && (rhs.getString().equals(var.name))) && (com.google.javascript.jscomp.NodeUtil.isAssign(n))) {
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
			if (com.google.javascript.jscomp.NodeUtil.isAssign(n)) {
				n.removeChild(rhs);
				n.getParent().replaceChild(n, rhs);
			}else
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) {
					n.removeChild(rhs);
					n.removeChild(lhs);
					com.google.javascript.rhino.Node op = new com.google.javascript.rhino.Node(com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(n), lhs, rhs);
					parent.replaceChild(n, op);
				}else
					if (((n.getType()) == (com.google.javascript.rhino.Token.INC)) || ((n.getType()) == (com.google.javascript.rhino.Token.DEC))) {
						if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) {
							parent.replaceChild(n, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID, com.google.javascript.rhino.Node.newNumber(0).copyInformationFrom(n)));
						}else
							if (((n.getType()) == (com.google.javascript.rhino.Token.COMMA)) && (n != (parent.getLastChild()))) {
								parent.removeChild(n);
							}else
								if ((((parent.getType()) == (com.google.javascript.rhino.Token.FOR)) && (!(com.google.javascript.jscomp.NodeUtil.isForIn(parent)))) && ((com.google.javascript.jscomp.NodeUtil.getConditionExpression(parent)) != n)) {
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
			for (com.google.javascript.rhino.Node sibling = n.getNext(); sibling != null; sibling = sibling.getNext()) {
				if (!(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(sibling))) {
					com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness state = readVariableBeforeKilling(sibling, variable);
					if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ)) {
						return true;
					}else
						if (state == (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL)) {
							return false;
						}
					
				}
			}
			n = n.getParent();
		} 
		return false;
	}

	private enum VariableLiveness {
MAYBE_LIVE, READ, KILL;	}

	private com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness readVariableBeforeKilling(com.google.javascript.rhino.Node n, java.lang.String variable) {
		if ((com.google.javascript.jscomp.NodeUtil.isName(n)) && (variable.equals(n.getString()))) {
			if (com.google.javascript.jscomp.NodeUtil.isLhs(n, n.getParent())) {
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.KILL;
			}else {
				return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.READ;
			}
		}
		for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
			if (!(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(child))) {
				com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness state = readVariableBeforeKilling(child, variable);
				if (state != (com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE)) {
					return state;
				}
			}
		}
		return com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness.MAYBE_LIVE;
	}
}

