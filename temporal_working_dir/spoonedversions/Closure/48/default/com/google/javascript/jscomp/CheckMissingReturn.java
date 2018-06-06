

package com.google.javascript.jscomp;


class CheckMissingReturn implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	static final com.google.javascript.jscomp.DiagnosticType MISSING_RETURN_STATEMENT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MISSING_RETURN_STATEMENT", "Missing return statement. Function expected to return {0}.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel level;

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> IS_RETURN = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node input) {
			return (input != null) && (input.isReturn());
		}
	};

	private static final com.google.common.base.Predicate<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> GOES_THROUGH_TRUE_CONDITION_PREDICATE = new com.google.common.base.Predicate<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> input) {
			com.google.javascript.jscomp.ControlFlowGraph.Branch branch = input.getValue();
			if (branch == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_EX)) {
				return false;
			}else
				if (branch.isConditional()) {
					com.google.javascript.rhino.Node condition = com.google.javascript.jscomp.NodeUtil.getConditionExpression(input.getSource().getValue());
					if (condition != null) {
						com.google.javascript.rhino.jstype.TernaryValue val = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(condition);
						if (val != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
							return (val.toBoolean(true)) == ((com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE) == branch);
						}
					}
				}
			
			return true;
		}
	};

	CheckMissingReturn(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this.compiler = compiler;
		this.level = level;
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.jstype.JSType returnType = explicitReturnExpected(t.getScopeRoot());
		if (returnType == null) {
			return ;
		}
		if (com.google.javascript.jscomp.CheckMissingReturn.fastAllPathsReturnCheck(t.getControlFlowGraph())) {
			return ;
		}
		com.google.javascript.jscomp.CheckPathsBetweenNodes<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> test = new com.google.javascript.jscomp.CheckPathsBetweenNodes<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>(t.getControlFlowGraph(), t.getControlFlowGraph().getEntry(), t.getControlFlowGraph().getImplicitReturn(), com.google.javascript.jscomp.CheckMissingReturn.IS_RETURN, com.google.javascript.jscomp.CheckMissingReturn.GOES_THROUGH_TRUE_CONDITION_PREDICATE);
		if (!(test.allPathsSatisfyPredicate())) {
			compiler.report(t.makeError(t.getScopeRoot(), level, com.google.javascript.jscomp.CheckMissingReturn.MISSING_RETURN_STATEMENT, returnType.toString()));
		}
	}

	private static boolean fastAllPathsReturnCheck(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg) {
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> s : cfg.getImplicitReturn().getInEdges()) {
			if ((s.getSource().getValue().getType()) != (com.google.javascript.rhino.Token.RETURN)) {
				return false;
			}
		}
		return true;
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

	private com.google.javascript.rhino.jstype.JSType explicitReturnExpected(com.google.javascript.rhino.Node scope) {
		com.google.javascript.rhino.jstype.FunctionType scopeType = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(scope.getJSType());
		if (scopeType == null) {
			return null;
		}
		if (com.google.javascript.jscomp.CheckMissingReturn.isEmptyFunction(scope)) {
			return null;
		}
		com.google.javascript.rhino.jstype.JSType returnType = scopeType.getReturnType();
		if (returnType == null) {
			return null;
		}
		if (!(isVoidOrUnknown(returnType))) {
			return returnType;
		}
		return null;
	}

	private static boolean isEmptyFunction(com.google.javascript.rhino.Node function) {
		return ((function.getChildCount()) == 3) && (!(function.getFirstChild().getNext().getNext().hasChildren()));
	}

	private boolean isVoidOrUnknown(com.google.javascript.rhino.jstype.JSType returnType) {
		final com.google.javascript.rhino.jstype.JSType voidType = compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		return voidType.isSubtype(returnType);
	}
}

