

package com.google.javascript.jscomp;


class PeepholeSubstituteAlternateSyntax extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	private static final int AND_PRECEDENCE = com.google.javascript.jscomp.NodeUtil.precedence(com.google.javascript.rhino.Token.AND);

	private static final int OR_PRECEDENCE = com.google.javascript.jscomp.NodeUtil.precedence(com.google.javascript.rhino.Token.OR);

	private static final int NOT_PRECEDENCE = com.google.javascript.jscomp.NodeUtil.precedence(com.google.javascript.rhino.Token.NOT);

	private final boolean doCommaSpliting;

	static final com.google.javascript.jscomp.DiagnosticType INVALID_REGULAR_EXPRESSION_FLAGS = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_REGULAR_EXPRESSION_FLAGS", "Invalid flags to RegExp constructor: {0}");

	static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> DONT_TRAVERSE_FUNCTIONS_PREDICATE = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node input) {
			return (input.getType()) != (com.google.javascript.rhino.Token.FUNCTION);
		}
	};

	PeepholeSubstituteAlternateSyntax(boolean doCommaSpliting) {
		this.doCommaSpliting = doCommaSpliting;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings(value = "fallthrough")
	public com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node node) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.RETURN :
				{
					com.google.javascript.rhino.Node result = tryRemoveRedundantExit(node);
					if (result != node) {
						return result;
					}
					result = tryReplaceExitWithBreak(node);
					if (result != node) {
						return result;
					}
					return tryReduceReturn(node);
				}
			case com.google.javascript.rhino.Token.THROW :
				{
					com.google.javascript.rhino.Node result = tryRemoveRedundantExit(node);
					if (result != node) {
						return result;
					}
					return tryReplaceExitWithBreak(node);
				}
			case com.google.javascript.rhino.Token.NOT :
				tryMinimizeCondition(node.getFirstChild());
				return tryMinimizeNot(node);
			case com.google.javascript.rhino.Token.IF :
				tryMinimizeCondition(node.getFirstChild());
				return tryMinimizeIf(node);
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				tryMinimizeCondition(node.getFirstChild());
				return node;
			case com.google.javascript.rhino.Token.HOOK :
				tryMinimizeCondition(node.getFirstChild());
				return node;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
				tryMinimizeCondition(com.google.javascript.jscomp.NodeUtil.getConditionExpression(node));
				return node;
			case com.google.javascript.rhino.Token.FOR :
				if (!(com.google.javascript.jscomp.NodeUtil.isForIn(node))) {
					tryMinimizeCondition(com.google.javascript.jscomp.NodeUtil.getConditionExpression(node));
				}
				return node;
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				return reduceTrueFalse(node);
			case com.google.javascript.rhino.Token.NEW :
				node = tryFoldStandardConstructors(node);
				if ((node.getType()) != (com.google.javascript.rhino.Token.CALL)) {
					return node;
				}
			case com.google.javascript.rhino.Token.CALL :
				return tryFoldLiteralConstructor(node);
			case com.google.javascript.rhino.Token.COMMA :
				return tryFoldComma(node);
			case com.google.javascript.rhino.Token.NAME :
				return tryReplaceUndefined(node);
			case com.google.javascript.rhino.Token.BLOCK :
				return tryReplaceIf(node);
			default :
				return node;
		}
	}

	private com.google.javascript.rhino.Node tryFoldComma(com.google.javascript.rhino.Node n) {
		if (!(doCommaSpliting)) {
			return n;
		}
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = n.getLastChild();
		if (((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) && ((parent.getParent().getType()) != (com.google.javascript.rhino.Token.LABEL))) {
			n.detachChildren();
			parent.replaceChild(n, left);
			com.google.javascript.rhino.Node newStatement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, right);
			newStatement.copyInformationFrom(n);
			parent.getParent().addChildAfter(newStatement, parent);
			reportCodeChange();
			return left;
		}else {
			return n;
		}
	}

	private com.google.javascript.rhino.Node tryReplaceIf(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
			if ((child.getType()) == (com.google.javascript.rhino.Token.IF)) {
				com.google.javascript.rhino.Node cond = child.getFirstChild();
				com.google.javascript.rhino.Node thenBranch = cond.getNext();
				com.google.javascript.rhino.Node elseBranch = thenBranch.getNext();
				com.google.javascript.rhino.Node nextNode = child.getNext();
				if ((((nextNode != null) && (elseBranch == null)) && (isReturnBlock(thenBranch))) && (isReturnExpression(nextNode))) {
					com.google.javascript.rhino.Node thenExpr = null;
					if (isReturnExpressBlock(thenBranch)) {
						thenExpr = getBlockReturnExpression(thenBranch);
						thenExpr.detachFromParent();
					}else {
						thenExpr = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(child);
					}
					com.google.javascript.rhino.Node elseExpr = nextNode.getFirstChild();
					cond.detachFromParent();
					elseExpr.detachFromParent();
					com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenExpr, elseExpr).copyInformationFrom(child);
					com.google.javascript.rhino.Node returnNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, hookNode);
					n.replaceChild(child, returnNode);
					n.removeChild(nextNode);
					reportCodeChange();
				}
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryReplaceUndefined(com.google.javascript.rhino.Node n) {
		if (((isASTNormalized()) && (com.google.javascript.jscomp.NodeUtil.isUndefined(n))) && (!(com.google.javascript.jscomp.NodeUtil.isLValue(n)))) {
			com.google.javascript.rhino.Node replacement = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(n);
			n.getParent().replaceChild(n, replacement);
			reportCodeChange();
			return replacement;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryReduceReturn(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node result = n.getFirstChild();
		if (result != null) {
			switch (result.getType()) {
				case com.google.javascript.rhino.Token.VOID :
					com.google.javascript.rhino.Node operand = result.getFirstChild();
					if (!(mayHaveSideEffects(operand))) {
						n.removeFirstChild();
						reportCodeChange();
					}
					break;
				case com.google.javascript.rhino.Token.NAME :
					java.lang.String name = result.getString();
					if (name.equals("undefined")) {
						n.removeFirstChild();
						reportCodeChange();
					}
					break;
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryReplaceExitWithBreak(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node result = n.getFirstChild();
		com.google.javascript.rhino.Node breakTarget = n;
		for (; !(com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(breakTarget, null)); breakTarget = breakTarget.getParent()) {
			if ((com.google.javascript.jscomp.NodeUtil.isFunction(breakTarget)) || ((breakTarget.getType()) == (com.google.javascript.rhino.Token.SCRIPT))) {
				return n;
			}
		}
		com.google.javascript.rhino.Node follow = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(breakTarget);
		com.google.javascript.rhino.Node prefinallyFollows = follow;
		follow = skipFinallyNodes(follow);
		if (prefinallyFollows != follow) {
			if (!(isPure(result))) {
				return n;
			}
		}
		if ((follow == null) && (((n.getType()) == (com.google.javascript.rhino.Token.THROW)) || (result != null))) {
			return n;
		}
		if ((follow == null) || (areMatchingExits(n, follow))) {
			com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BREAK);
			n.getParent().replaceChild(n, replacement);
			com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.this.reportCodeChange();
			return replacement;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryRemoveRedundantExit(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node exitExpr = n.getFirstChild();
		com.google.javascript.rhino.Node follow = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(n);
		com.google.javascript.rhino.Node prefinallyFollows = follow;
		follow = skipFinallyNodes(follow);
		if (prefinallyFollows != follow) {
			if (!(isPure(exitExpr))) {
				return n;
			}
		}
		if ((follow == null) && (((n.getType()) == (com.google.javascript.rhino.Token.THROW)) || (exitExpr != null))) {
			return n;
		}
		if ((follow == null) || (areMatchingExits(n, follow))) {
			n.detachFromParent();
			reportCodeChange();
			return null;
		}
		return n;
	}

	boolean isPure(com.google.javascript.rhino.Node n) {
		return (n == null) || ((!(com.google.javascript.jscomp.NodeUtil.canBeSideEffected(n))) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n))));
	}

	com.google.javascript.rhino.Node skipFinallyNodes(com.google.javascript.rhino.Node n) {
		while ((n != null) && (com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(n.getParent(), n))) {
			n = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(n);
		} 
		return n;
	}

	boolean areMatchingExits(com.google.javascript.rhino.Node nodeThis, com.google.javascript.rhino.Node nodeThat) {
		return (nodeThis.isEquivalentTo(nodeThat)) && ((!(isExceptionPossible(nodeThis))) || ((getExceptionHandler(nodeThis)) == (getExceptionHandler(nodeThat))));
	}

	boolean isExceptionPossible(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState((((n.getType()) == (com.google.javascript.rhino.Token.RETURN)) || ((n.getType()) == (com.google.javascript.rhino.Token.THROW))));
		return ((n.getType()) == (com.google.javascript.rhino.Token.THROW)) || ((n.hasChildren()) && (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(n.getLastChild(), true))));
	}

	com.google.javascript.rhino.Node getExceptionHandler(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(n);
	}

	private com.google.javascript.rhino.Node tryMinimizeNot(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node notChild = n.getFirstChild();
		int complementOperator;
		switch (notChild.getType()) {
			case com.google.javascript.rhino.Token.EQ :
				complementOperator = com.google.javascript.rhino.Token.NE;
				break;
			case com.google.javascript.rhino.Token.NE :
				complementOperator = com.google.javascript.rhino.Token.EQ;
				break;
			case com.google.javascript.rhino.Token.SHEQ :
				complementOperator = com.google.javascript.rhino.Token.SHNE;
				break;
			case com.google.javascript.rhino.Token.SHNE :
				complementOperator = com.google.javascript.rhino.Token.SHEQ;
				break;
			default :
				return n;
		}
		com.google.javascript.rhino.Node newOperator = n.removeFirstChild();
		newOperator.setType(complementOperator);
		parent.replaceChild(n, newOperator);
		reportCodeChange();
		return newOperator;
	}

	private com.google.javascript.rhino.Node tryMinimizeIf(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node cond = n.getFirstChild();
		if (com.google.javascript.jscomp.NodeUtil.isLiteralValue(cond, true)) {
			return n;
		}
		com.google.javascript.rhino.Node thenBranch = cond.getNext();
		com.google.javascript.rhino.Node elseBranch = thenBranch.getNext();
		if (elseBranch == null) {
			if (isFoldableExpressBlock(thenBranch)) {
				com.google.javascript.rhino.Node expr = getBlockExpression(thenBranch);
				if (isPropertyAssignmentInExpression(expr)) {
					return n;
				}
				if ((cond.getType()) == (com.google.javascript.rhino.Token.NOT)) {
					if ((isLowerPrecedenceInExpression(cond, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.OR_PRECEDENCE)) && (isLowerPrecedenceInExpression(expr.getFirstChild(), com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.OR_PRECEDENCE))) {
						return n;
					}
					com.google.javascript.rhino.Node or = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OR, cond.removeFirstChild(), expr.removeFirstChild()).copyInformationFrom(n);
					com.google.javascript.rhino.Node newExpr = com.google.javascript.jscomp.NodeUtil.newExpr(or);
					parent.replaceChild(n, newExpr);
					reportCodeChange();
					return newExpr;
				}
				if ((isLowerPrecedenceInExpression(cond, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.AND_PRECEDENCE)) && (isLowerPrecedenceInExpression(expr.getFirstChild(), com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.AND_PRECEDENCE))) {
					return n;
				}
				n.removeChild(cond);
				com.google.javascript.rhino.Node and = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.AND, cond, expr.removeFirstChild()).copyInformationFrom(n);
				com.google.javascript.rhino.Node newExpr = com.google.javascript.jscomp.NodeUtil.newExpr(and);
				parent.replaceChild(n, newExpr);
				reportCodeChange();
				return newExpr;
			}else {
				if ((com.google.javascript.jscomp.NodeUtil.isStatementBlock(thenBranch)) && (thenBranch.hasOneChild())) {
					com.google.javascript.rhino.Node innerIf = thenBranch.getFirstChild();
					if ((innerIf.getType()) == (com.google.javascript.rhino.Token.IF)) {
						com.google.javascript.rhino.Node innerCond = innerIf.getFirstChild();
						com.google.javascript.rhino.Node innerThenBranch = innerCond.getNext();
						com.google.javascript.rhino.Node innerElseBranch = innerThenBranch.getNext();
						if ((innerElseBranch == null) && (!((isLowerPrecedenceInExpression(cond, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.AND_PRECEDENCE)) && (isLowerPrecedenceInExpression(innerCond, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.AND_PRECEDENCE))))) {
							n.detachChildren();
							n.addChildToBack(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.AND, cond, innerCond.detachFromParent()).copyInformationFrom(cond));
							n.addChildrenToBack(innerThenBranch.detachFromParent());
							reportCodeChange();
							return n;
						}
					}
				}
			}
			return n;
		}
		tryRemoveRepeatedStatements(n);
		if (((cond.getType()) == (com.google.javascript.rhino.Token.NOT)) && (!(consumesDanglingElse(elseBranch)))) {
			n.replaceChild(cond, cond.removeFirstChild());
			n.removeChild(thenBranch);
			n.addChildToBack(thenBranch);
			reportCodeChange();
			return n;
		}
		if ((isReturnExpressBlock(thenBranch)) && (isReturnExpressBlock(elseBranch))) {
			com.google.javascript.rhino.Node thenExpr = getBlockReturnExpression(thenBranch);
			com.google.javascript.rhino.Node elseExpr = getBlockReturnExpression(elseBranch);
			n.removeChild(cond);
			thenExpr.detachFromParent();
			elseExpr.detachFromParent();
			com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenExpr, elseExpr).copyInformationFrom(n);
			com.google.javascript.rhino.Node returnNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, hookNode);
			parent.replaceChild(n, returnNode);
			reportCodeChange();
			return returnNode;
		}
		boolean thenBranchIsExpressionBlock = isFoldableExpressBlock(thenBranch);
		boolean elseBranchIsExpressionBlock = isFoldableExpressBlock(elseBranch);
		if (thenBranchIsExpressionBlock && elseBranchIsExpressionBlock) {
			com.google.javascript.rhino.Node thenOp = getBlockExpression(thenBranch).getFirstChild();
			com.google.javascript.rhino.Node elseOp = getBlockExpression(elseBranch).getFirstChild();
			if ((thenOp.getType()) == (elseOp.getType())) {
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(thenOp)) {
					com.google.javascript.rhino.Node lhs = thenOp.getFirstChild();
					if ((areNodesEqualForInlining(lhs, elseOp.getFirstChild())) && (!(mayEffectMutableState(lhs)))) {
						n.removeChild(cond);
						com.google.javascript.rhino.Node assignName = thenOp.removeFirstChild();
						com.google.javascript.rhino.Node thenExpr = thenOp.removeFirstChild();
						com.google.javascript.rhino.Node elseExpr = elseOp.getLastChild();
						elseOp.removeChild(elseExpr);
						com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenExpr, elseExpr).copyInformationFrom(n);
						com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(thenOp.getType(), assignName, hookNode).copyInformationFrom(thenOp);
						com.google.javascript.rhino.Node expr = com.google.javascript.jscomp.NodeUtil.newExpr(assign);
						parent.replaceChild(n, expr);
						reportCodeChange();
						return expr;
					}
				}
			}
			n.removeChild(cond);
			thenOp.detachFromParent();
			elseOp.detachFromParent();
			com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenOp, elseOp).copyInformationFrom(n);
			com.google.javascript.rhino.Node expr = com.google.javascript.jscomp.NodeUtil.newExpr(hookNode);
			parent.replaceChild(n, expr);
			reportCodeChange();
			return expr;
		}
		boolean thenBranchIsVar = isVarBlock(thenBranch);
		boolean elseBranchIsVar = isVarBlock(elseBranch);
		if ((thenBranchIsVar && elseBranchIsExpressionBlock) && (com.google.javascript.jscomp.NodeUtil.isAssign(getBlockExpression(elseBranch).getFirstChild()))) {
			com.google.javascript.rhino.Node var = getBlockVar(thenBranch);
			com.google.javascript.rhino.Node elseAssign = getBlockExpression(elseBranch).getFirstChild();
			com.google.javascript.rhino.Node name1 = var.getFirstChild();
			com.google.javascript.rhino.Node maybeName2 = elseAssign.getFirstChild();
			if (((name1.hasChildren()) && ((maybeName2.getType()) == (com.google.javascript.rhino.Token.NAME))) && (name1.getString().equals(maybeName2.getString()))) {
				com.google.javascript.rhino.Node thenExpr = name1.removeChildren();
				com.google.javascript.rhino.Node elseExpr = elseAssign.getLastChild().detachFromParent();
				cond.detachFromParent();
				com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenExpr, elseExpr).copyInformationFrom(n);
				var.detachFromParent();
				name1.addChildrenToBack(hookNode);
				parent.replaceChild(n, var);
				reportCodeChange();
				return var;
			}
		}else
			if ((elseBranchIsVar && thenBranchIsExpressionBlock) && (com.google.javascript.jscomp.NodeUtil.isAssign(getBlockExpression(thenBranch).getFirstChild()))) {
				com.google.javascript.rhino.Node var = getBlockVar(elseBranch);
				com.google.javascript.rhino.Node thenAssign = getBlockExpression(thenBranch).getFirstChild();
				com.google.javascript.rhino.Node maybeName1 = thenAssign.getFirstChild();
				com.google.javascript.rhino.Node name2 = var.getFirstChild();
				if (((name2.hasChildren()) && ((maybeName1.getType()) == (com.google.javascript.rhino.Token.NAME))) && (maybeName1.getString().equals(name2.getString()))) {
					com.google.javascript.rhino.Node thenExpr = thenAssign.getLastChild().detachFromParent();
					com.google.javascript.rhino.Node elseExpr = name2.removeChildren();
					cond.detachFromParent();
					com.google.javascript.rhino.Node hookNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, thenExpr, elseExpr).copyInformationFrom(n);
					var.detachFromParent();
					name2.addChildrenToBack(hookNode);
					parent.replaceChild(n, var);
					reportCodeChange();
					return var;
				}
			}
		
		return n;
	}

	private void tryRemoveRepeatedStatements(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.IF)));
		com.google.javascript.rhino.Node parent = n.getParent();
		if (!(com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent))) {
			return ;
		}
		com.google.javascript.rhino.Node cond = n.getFirstChild();
		com.google.javascript.rhino.Node trueBranch = cond.getNext();
		com.google.javascript.rhino.Node falseBranch = trueBranch.getNext();
		com.google.common.base.Preconditions.checkNotNull(trueBranch);
		com.google.common.base.Preconditions.checkNotNull(falseBranch);
		while (true) {
			com.google.javascript.rhino.Node lastTrue = trueBranch.getLastChild();
			com.google.javascript.rhino.Node lastFalse = falseBranch.getLastChild();
			if (((lastTrue == null) || (lastFalse == null)) || (!(areNodesEqualForInlining(lastTrue, lastFalse)))) {
				break;
			}
			lastTrue.detachFromParent();
			lastFalse.detachFromParent();
			parent.addChildAfter(lastTrue, n);
			reportCodeChange();
		} 
	}

	private boolean isFoldableExpressBlock(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
			if (n.hasOneChild()) {
				com.google.javascript.rhino.Node maybeExpr = n.getFirstChild();
				if ((maybeExpr.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					if ((maybeExpr.getFirstChild().getType()) == (com.google.javascript.rhino.Token.CALL)) {
						com.google.javascript.rhino.Node calledFn = maybeExpr.getFirstChild().getFirstChild();
						if ((calledFn.getType()) == (com.google.javascript.rhino.Token.GETELEM)) {
							return false;
						}else
							if (((calledFn.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (calledFn.getLastChild().getString().startsWith("on"))) {
								return false;
							}
						
					}
					return true;
				}
				return false;
			}
		}
		return false;
	}

	private com.google.javascript.rhino.Node getBlockExpression(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(isFoldableExpressBlock(n));
		return n.getFirstChild();
	}

	private boolean isReturnBlock(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
			if (n.hasOneChild()) {
				com.google.javascript.rhino.Node first = n.getFirstChild();
				return (first.getType()) == (com.google.javascript.rhino.Token.RETURN);
			}
		}
		return false;
	}

	private boolean isReturnExpressBlock(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
			if (n.hasOneChild()) {
				com.google.javascript.rhino.Node first = n.getFirstChild();
				if ((first.getType()) == (com.google.javascript.rhino.Token.RETURN)) {
					return first.hasOneChild();
				}
			}
		}
		return false;
	}

	private boolean isReturnExpression(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.RETURN)) {
			return n.hasOneChild();
		}
		return false;
	}

	private com.google.javascript.rhino.Node getBlockReturnExpression(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(isReturnExpressBlock(n));
		return n.getFirstChild().getFirstChild();
	}

	private boolean isVarBlock(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
			if (n.hasOneChild()) {
				com.google.javascript.rhino.Node first = n.getFirstChild();
				if ((first.getType()) == (com.google.javascript.rhino.Token.VAR)) {
					return first.hasOneChild();
				}
			}
		}
		return false;
	}

	private com.google.javascript.rhino.Node getBlockVar(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(isVarBlock(n));
		return n.getFirstChild();
	}

	private boolean consumesDanglingElse(com.google.javascript.rhino.Node n) {
		while (true) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.IF :
					if ((n.getChildCount()) < 3) {
						return true;
					}
					n = n.getLastChild();
					continue;
				case com.google.javascript.rhino.Token.WITH :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.FOR :
					n = n.getLastChild();
					continue;
				default :
					return false;
			}
		} 
	}

	private boolean isLowerPrecedenceInExpression(com.google.javascript.rhino.Node n, final int precedence) {
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> isLowerPrecedencePredicate = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node input) {
				return (com.google.javascript.jscomp.NodeUtil.precedence(input.getType())) < precedence;
			}
		};
		return com.google.javascript.jscomp.NodeUtil.has(n, isLowerPrecedencePredicate, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE);
	}

	private boolean isLowerPrecedence(com.google.javascript.rhino.Node n, final int precedence) {
		return (com.google.javascript.jscomp.NodeUtil.precedence(n.getType())) < precedence;
	}

	private boolean isHigherPrecedence(com.google.javascript.rhino.Node n, final int precedence) {
		return (com.google.javascript.jscomp.NodeUtil.precedence(n.getType())) > precedence;
	}

	private boolean isPropertyAssignmentInExpression(com.google.javascript.rhino.Node n) {
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> isPropertyAssignmentInExpressionPredicate = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node input) {
				return ((input.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && ((input.getParent().getType()) == (com.google.javascript.rhino.Token.ASSIGN));
			}
		};
		return com.google.javascript.jscomp.NodeUtil.has(n, isPropertyAssignmentInExpressionPredicate, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE);
	}

	private com.google.javascript.rhino.Node tryMinimizeCondition(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NOT :
				com.google.javascript.rhino.Node first = n.getFirstChild();
				switch (first.getType()) {
					case com.google.javascript.rhino.Token.NOT :
						{
							com.google.javascript.rhino.Node newRoot = first.removeFirstChild();
							parent.replaceChild(n, newRoot);
							reportCodeChange();
							return newRoot;
						}
					case com.google.javascript.rhino.Token.AND :
					case com.google.javascript.rhino.Token.OR :
						{
							com.google.javascript.rhino.Node leftParent = first.getFirstChild();
							com.google.javascript.rhino.Node rightParent = first.getLastChild();
							com.google.javascript.rhino.Node left;
							com.google.javascript.rhino.Node right;
							if (((leftParent.getType()) != (com.google.javascript.rhino.Token.NOT)) && ((rightParent.getType()) != (com.google.javascript.rhino.Token.NOT))) {
								int op_precedence = com.google.javascript.jscomp.NodeUtil.precedence(first.getType());
								if (((isLowerPrecedence(leftParent, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.NOT_PRECEDENCE)) && (isHigherPrecedence(leftParent, op_precedence))) || ((isLowerPrecedence(rightParent, com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.NOT_PRECEDENCE)) && (isHigherPrecedence(rightParent, op_precedence)))) {
									return n;
								}
							}
							if ((leftParent.getType()) == (com.google.javascript.rhino.Token.NOT)) {
								left = leftParent.removeFirstChild();
							}else {
								leftParent.detachFromParent();
								left = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT, leftParent).copyInformationFrom(leftParent);
							}
							if ((rightParent.getType()) == (com.google.javascript.rhino.Token.NOT)) {
								right = rightParent.removeFirstChild();
							}else {
								rightParent.detachFromParent();
								right = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT, rightParent).copyInformationFrom(rightParent);
							}
							int newOp = (first.getType()) == (com.google.javascript.rhino.Token.AND) ? com.google.javascript.rhino.Token.OR : com.google.javascript.rhino.Token.AND;
							com.google.javascript.rhino.Node newRoot = new com.google.javascript.rhino.Node(newOp, left, right);
							parent.replaceChild(n, newRoot);
							reportCodeChange();
							return newRoot;
						}
					default :
						com.google.javascript.rhino.jstype.TernaryValue nVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(first);
						if (nVal != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
							boolean result = nVal.not().toBoolean(true);
							int equivalentResult = result ? 1 : 0;
							return maybeReplaceChildWithNumber(n, parent, equivalentResult);
						}
				}
				return n;
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.AND :
				{
					com.google.javascript.rhino.Node left = n.getFirstChild();
					com.google.javascript.rhino.Node right = n.getLastChild();
					left = tryMinimizeCondition(left);
					right = tryMinimizeCondition(right);
					com.google.javascript.rhino.jstype.TernaryValue rightVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(right);
					if ((com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(right)) != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
						int type = n.getType();
						com.google.javascript.rhino.Node replacement = null;
						boolean rval = rightVal.toBoolean(true);
						if (((type == (com.google.javascript.rhino.Token.OR)) && (!rval)) || ((type == (com.google.javascript.rhino.Token.AND)) && rval)) {
							replacement = left;
						}else
							if (!(mayHaveSideEffects(left))) {
								replacement = right;
							}
						
						if (replacement != null) {
							n.detachChildren();
							parent.replaceChild(n, replacement);
							reportCodeChange();
							return replacement;
						}
					}
					return n;
				}
			case com.google.javascript.rhino.Token.HOOK :
				{
					com.google.javascript.rhino.Node condition = n.getFirstChild();
					com.google.javascript.rhino.Node trueNode = n.getFirstChild().getNext();
					com.google.javascript.rhino.Node falseNode = n.getLastChild();
					trueNode = tryMinimizeCondition(trueNode);
					falseNode = tryMinimizeCondition(falseNode);
					com.google.javascript.rhino.Node replacement = null;
					com.google.javascript.rhino.jstype.TernaryValue trueNodeVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(trueNode);
					com.google.javascript.rhino.jstype.TernaryValue falseNodeVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(falseNode);
					if ((trueNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.TRUE)) && (falseNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.FALSE))) {
						condition.detachFromParent();
						replacement = condition;
					}else
						if ((trueNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) && (falseNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.TRUE))) {
							condition.detachFromParent();
							replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT, condition);
						}else
							if (trueNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.TRUE)) {
								n.detachChildren();
								replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OR, condition, falseNode);
							}else
								if (falseNodeVal == (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
									n.detachChildren();
									replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.AND, condition, trueNode);
								}
							
						
					
					if (replacement != null) {
						parent.replaceChild(n, replacement);
						n = replacement;
						reportCodeChange();
					}
					return n;
				}
			default :
				com.google.javascript.rhino.jstype.TernaryValue nVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n);
				if (nVal != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					boolean result = nVal.toBoolean(true);
					int equivalentResult = result ? 1 : 0;
					return maybeReplaceChildWithNumber(n, parent, equivalentResult);
				}
				return n;
		}
	}

	private com.google.javascript.rhino.Node maybeReplaceChildWithNumber(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, int num) {
		com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.Node.newNumber(num);
		if (!(newNode.isEquivalentTo(n))) {
			parent.replaceChild(n, newNode);
			reportCodeChange();
			return newNode;
		}
		return n;
	}

	private static final com.google.common.collect.ImmutableSet<java.lang.String> STANDARD_OBJECT_CONSTRUCTORS = com.google.common.collect.ImmutableSet.of("Object", "Array", "RegExp", "Error");

	private com.google.javascript.rhino.Node tryFoldStandardConstructors(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NEW)));
		if (isASTNormalized()) {
			if ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME)) {
				java.lang.String className = n.getFirstChild().getString();
				if (com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.STANDARD_OBJECT_CONSTRUCTORS.contains(className)) {
					n.setType(com.google.javascript.rhino.Token.CALL);
					reportCodeChange();
				}
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldLiteralConstructor(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument((((n.getType()) == (com.google.javascript.rhino.Token.CALL)) || ((n.getType()) == (com.google.javascript.rhino.Token.NEW))));
		com.google.javascript.rhino.Node constructorNameNode = n.getFirstChild();
		com.google.javascript.rhino.Node newLiteralNode = null;
		if ((isASTNormalized()) && ((com.google.javascript.rhino.Token.NAME) == (constructorNameNode.getType()))) {
			java.lang.String className = constructorNameNode.getString();
			if ("RegExp".equals(className)) {
				return tryFoldRegularExpressionConstructor(n);
			}else {
				boolean constructorHasArgs = (constructorNameNode.getNext()) != null;
				if (("Object".equals(className)) && (!constructorHasArgs)) {
					newLiteralNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT);
				}else
					if ("Array".equals(className)) {
						com.google.javascript.rhino.Node arg0 = constructorNameNode.getNext();
						com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction action = isSafeToFoldArrayConstructor(arg0);
						if ((action == (com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITH_ARGS)) || (action == (com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITHOUT_ARGS))) {
							newLiteralNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ARRAYLIT);
							n.removeChildren();
							if (action == (com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITH_ARGS)) {
								newLiteralNode.addChildrenToFront(arg0);
							}
						}
					}
				
				if (newLiteralNode != null) {
					n.getParent().replaceChild(n, newLiteralNode);
					reportCodeChange();
					return newLiteralNode;
				}
			}
		}
		return n;
	}

	private static enum FoldArrayAction {
NOT_SAFE_TO_FOLD, SAFE_TO_FOLD_WITH_ARGS, SAFE_TO_FOLD_WITHOUT_ARGS;	}

	private com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node arg) {
		com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.NOT_SAFE_TO_FOLD;
		if (arg == null) {
			action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITHOUT_ARGS;
		}else
			if ((arg.getNext()) != null) {
				action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITH_ARGS;
			}else {
				switch (arg.getType()) {
					case com.google.javascript.rhino.Token.STRING :
						action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITH_ARGS;
						break;
					case com.google.javascript.rhino.Token.NUMBER :
						if ((arg.getDouble()) == 0) {
							action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITHOUT_ARGS;
						}
						break;
					case com.google.javascript.rhino.Token.ARRAYLIT :
						action = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.FoldArrayAction.SAFE_TO_FOLD_WITH_ARGS;
						break;
					default :
				}
			}
		
		return action;
	}

	private com.google.javascript.rhino.Node tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node constructor = n.getFirstChild();
		com.google.javascript.rhino.Node pattern = constructor.getNext();
		com.google.javascript.rhino.Node flags = null != pattern ? pattern.getNext() : null;
		if ((null == pattern) || ((null != flags) && (null != (flags.getNext())))) {
			return n;
		}
		if ((((((pattern.getType()) == (com.google.javascript.rhino.Token.STRING)) && (!("".equals(pattern.getString())))) && ((pattern.getString().length()) < 100)) && ((null == flags) || ((flags.getType()) == (com.google.javascript.rhino.Token.STRING)))) && ((isEcmaScript5OrGreater()) || (!(com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(pattern.getString()))))) {
			pattern = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe(pattern);
			com.google.javascript.rhino.Node regexLiteral;
			if ((null == flags) || ("".equals(flags.getString()))) {
				regexLiteral = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, pattern);
			}else {
				if (!(com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areValidRegexpFlags(flags.getString()))) {
					error(com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS, flags);
					return n;
				}
				if (!(areSafeFlagsToFold(flags.getString()))) {
					return n;
				}
				n.removeChild(flags);
				regexLiteral = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, pattern, flags);
			}
			parent.replaceChild(n, regexLiteral);
			reportCodeChange();
			return regexLiteral;
		}
		return n;
	}

	private com.google.javascript.rhino.Node reduceTrueFalse(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node not = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT, com.google.javascript.rhino.Node.newNumber(((n.getType()) == (com.google.javascript.rhino.Token.TRUE) ? 0 : 1)));
		not.copyInformationFromForTree(n);
		n.getParent().replaceChild(n, not);
		reportCodeChange();
		return not;
	}

	private static final java.util.regex.Pattern REGEXP_FLAGS_RE = java.util.regex.Pattern.compile("^[gmi]*$");

	private static boolean areValidRegexpFlags(java.lang.String flags) {
		return com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.REGEXP_FLAGS_RE.matcher(flags).matches();
	}

	private boolean areSafeFlagsToFold(java.lang.String flags) {
		return (isEcmaScript5OrGreater()) || ((flags.indexOf('g')) < 0);
	}

	private static com.google.javascript.rhino.Node makeForwardSlashBracketSafe(com.google.javascript.rhino.Node n) {
		java.lang.String s = n.getString();
		java.lang.StringBuilder sb = null;
		int pos = 0;
		boolean isEscaped = false;
		boolean inCharset = false;
		for (int i = 0; i < (s.length()); ++i) {
			char ch = s.charAt(i);
			switch (ch) {
				case '\\' :
					isEscaped = !isEscaped;
					continue;
				case '/' :
					if ((!isEscaped) && (!inCharset)) {
						if (null == sb) {
							sb = new java.lang.StringBuilder(((s.length()) + 16));
						}
						sb.append(s, pos, i).append('\\');
						pos = i;
					}
					break;
				case '[' :
					if (!isEscaped) {
						inCharset = true;
					}
					break;
				case ']' :
					if (!isEscaped) {
						inCharset = false;
					}
					break;
				case '\r' :
				case '\n' :
				case '\u2028' :
				case '\u2029' :
					if (null == sb) {
						sb = new java.lang.StringBuilder(((s.length()) + 16));
					}
					if (isEscaped) {
						sb.append(s, pos, (i - 1));
					}else {
						sb.append(s, pos, i);
					}
					switch (ch) {
						case '\r' :
							sb.append("\\r");
							break;
						case '\n' :
							sb.append("\\n");
							break;
						case '\u2028' :
							sb.append("\\u2028");
							break;
						case '\u2029' :
							sb.append("\\u2029");
							break;
					}
					pos = i + 1;
					break;
			}
			isEscaped = false;
		}
		if (null == sb) {
			return n.cloneTree();
		}
		sb.append(s, pos, s.length());
		return com.google.javascript.rhino.Node.newString(sb.toString()).copyInformationFrom(n);
	}

	static boolean containsUnicodeEscape(java.lang.String s) {
		java.lang.String esc = com.google.javascript.jscomp.CodeGenerator.regexpEscape(s);
		for (int i = -1; (i = esc.indexOf("\\u", (i + 1))) >= 0;) {
			int nSlashes = 0;
			while (((i - nSlashes) > 0) && ('\\' == (esc.charAt(((i - nSlashes) - 1))))) {
				++nSlashes;
			} 
			if (0 == (nSlashes & 1)) {
				return true;
			}
		}
		return false;
	}
}

