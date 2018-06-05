

package com.google.javascript.jscomp;


public class StatementFusion extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node n) {
		if ((!(com.google.javascript.jscomp.NodeUtil.isFunction(n.getParent()))) && (com.google.javascript.jscomp.StatementFusion.canFuseIntoOneStatement(n))) {
			fuseIntoOneStatement(n);
			reportCodeChange();
		}
		return n;
	}

	private static boolean canFuseIntoOneStatement(com.google.javascript.rhino.Node block) {
		if ((block.getType()) != (com.google.javascript.rhino.Token.BLOCK)) {
			return false;
		}
		if ((!(block.hasChildren())) || (block.hasOneChild())) {
			return false;
		}
		com.google.javascript.rhino.Node last = block.getLastChild();
		for (com.google.javascript.rhino.Node c = block.getFirstChild(); c != null; c = c.getNext()) {
			if ((!(com.google.javascript.jscomp.NodeUtil.isExpressionNode(c))) && (c != last)) {
				return false;
			}
		}
		switch (last.getType()) {
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.THROW :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return true;
			case com.google.javascript.rhino.Token.RETURN :
				return last.hasChildren();
			case com.google.javascript.rhino.Token.FOR :
				return (com.google.javascript.jscomp.NodeUtil.isForIn(last)) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(last.getFirstChild())));
		}
		return false;
	}

	private void fuseIntoOneStatement(com.google.javascript.rhino.Node block) {
		com.google.javascript.rhino.Node cur = block.removeFirstChild();
		com.google.javascript.rhino.Node commaTree = cur.removeFirstChild();
		while (block.hasMoreThanOneChild()) {
			com.google.javascript.rhino.Node next = block.removeFirstChild().removeFirstChild();
			commaTree = com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoExpression(commaTree, next);
		} 
		com.google.common.base.Preconditions.checkState(block.hasOneChild());
		com.google.javascript.rhino.Node last = block.getLastChild();
		switch (last.getType()) {
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.RETURN :
			case com.google.javascript.rhino.Token.THROW :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoFirstChild(commaTree, last);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				if (com.google.javascript.jscomp.NodeUtil.isForIn(last)) {
					com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoSecondChild(commaTree, last);
				}
				return ;
			default :
				throw new java.lang.IllegalStateException("Statement fusion missing.");
		}
	}

	private static com.google.javascript.rhino.Node fuseExpressionIntoExpression(com.google.javascript.rhino.Node exp1, com.google.javascript.rhino.Node exp2) {
		com.google.javascript.rhino.Node comma = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, exp1);
		comma.copyInformationFrom(exp2);
		if ((exp2.getType()) == (com.google.javascript.rhino.Token.COMMA)) {
			com.google.javascript.rhino.Node leftMostChild = exp2;
			while ((leftMostChild.getType()) == (com.google.javascript.rhino.Token.COMMA)) {
				leftMostChild = leftMostChild.getFirstChild();
			} 
			com.google.javascript.rhino.Node parent = leftMostChild.getParent();
			comma.addChildToBack(leftMostChild.detachFromParent());
			parent.addChildToFront(comma);
			return exp2;
		}else {
			comma.addChildToBack(exp2);
			return comma;
		}
	}

	private static void fuseExpresssonIntoFirstChild(com.google.javascript.rhino.Node exp, com.google.javascript.rhino.Node stmt) {
		com.google.javascript.rhino.Node val = stmt.removeFirstChild();
		com.google.javascript.rhino.Node comma = com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoExpression(exp, val);
		stmt.addChildToFront(comma);
	}

	private static void fuseExpresssonIntoSecondChild(com.google.javascript.rhino.Node exp, com.google.javascript.rhino.Node stmt) {
		com.google.javascript.rhino.Node val = stmt.removeChildAfter(stmt.getFirstChild());
		com.google.javascript.rhino.Node comma = com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoExpression(exp, val);
		stmt.addChildAfter(comma, stmt.getFirstChild());
	}
}

