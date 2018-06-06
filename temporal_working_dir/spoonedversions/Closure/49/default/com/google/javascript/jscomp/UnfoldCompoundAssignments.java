

package com.google.javascript.jscomp;


class UnfoldCompoundAssignments implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public UnfoldCompoundAssignments(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
				unfoldIncrDecr(node, ((node.getType()) == (com.google.javascript.rhino.Token.INC)));
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				unfoldCompoundAssignment(node);
				break;
		}
	}

	private void unfoldIncrDecr(com.google.javascript.rhino.Node node, boolean isIncrement) {
		com.google.common.base.Preconditions.checkArgument(((isPrefix(node)) || (valueIsDiscarded(node))), "Unfolding postfix ++/-- requires that the result be ignored.");
		com.google.javascript.rhino.Node lhs = node.getFirstChild().cloneTree();
		com.google.common.base.Preconditions.checkArgument((!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(lhs))), "Cannot unfold compound assignment if LHS can have side effects");
		if (isIncrement) {
			lhs = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.POS, lhs);
		}
		node.setType(com.google.javascript.rhino.Token.ASSIGN);
		com.google.javascript.rhino.Node rhs = new com.google.javascript.rhino.Node((isIncrement ? com.google.javascript.rhino.Token.ADD : com.google.javascript.rhino.Token.SUB), lhs, com.google.javascript.rhino.Node.newNumber(1));
		rhs.copyInformationFromForTree(node);
		node.addChildToBack(rhs);
		compiler.reportCodeChange();
	}

	private boolean valueIsDiscarded(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node parent = node.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return true;
			case com.google.javascript.rhino.Token.COMMA :
				return (parent.getFirstChild()) == node;
			case com.google.javascript.rhino.Token.FOR :
				com.google.common.base.Preconditions.checkArgument((!(com.google.javascript.jscomp.NodeUtil.isForIn(parent))), "Error: the child of a FOR-IN cannot be an INC or DEC");
				return (parent.getChildAtIndex(2)) == node;
		}
		return false;
	}

	private boolean isPrefix(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument((((node.getType()) == (com.google.javascript.rhino.Token.INC)) || ((node.getType()) == (com.google.javascript.rhino.Token.DEC))), "isPrefix can only be called on INC and DEC nodes");
		return (node.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP)) == 0;
	}

	private void unfoldCompoundAssignment(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node lhs = node.getFirstChild();
		com.google.common.base.Preconditions.checkArgument((!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(lhs))), "Cannot unfold compound assignment if LHS can have side effects");
		com.google.javascript.rhino.Node newRhs = node.cloneTree();
		newRhs.setType(com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node));
		node.replaceChildAfter(lhs, newRhs);
		node.setType(com.google.javascript.rhino.Token.ASSIGN);
		compiler.reportCodeChange();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized(), "UnfoldCompoundAssignments requires a normalized AST");
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.UnfoldCompoundAssignments.this);
	}
}

