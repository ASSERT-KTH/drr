

package com.google.javascript.jscomp;


class PeepholeRemoveDeadCode extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		switch (subtree.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
				return tryFoldAssignment(subtree);
			case com.google.javascript.rhino.Token.COMMA :
				return tryFoldComma(subtree);
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
				return tryOptimizeBlock(subtree);
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				subtree = tryFoldExpr(subtree);
				return subtree;
			case com.google.javascript.rhino.Token.HOOK :
				return tryFoldHook(subtree);
			case com.google.javascript.rhino.Token.SWITCH :
				return tryOptimizeSwitch(subtree);
			case com.google.javascript.rhino.Token.IF :
				return tryFoldIf(subtree);
			case com.google.javascript.rhino.Token.WHILE :
				return tryFoldWhile(subtree);
			case com.google.javascript.rhino.Token.FOR :
				{
					com.google.javascript.rhino.Node condition = com.google.javascript.jscomp.NodeUtil.getConditionExpression(subtree);
					if (condition != null) {
						tryFoldForCondition(condition);
					}
				}
				return tryFoldFor(subtree);
			case com.google.javascript.rhino.Token.DO :
				return tryFoldDo(subtree);
			case com.google.javascript.rhino.Token.TRY :
				return tryFoldTry(subtree);
			default :
				return subtree;
		}
	}

	private com.google.javascript.rhino.Node tryFoldTry(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isTry());
		com.google.javascript.rhino.Node body = n.getFirstChild();
		com.google.javascript.rhino.Node catchBlock = body.getNext();
		com.google.javascript.rhino.Node finallyBlock = catchBlock.getNext();
		if ((!(catchBlock.hasChildren())) && ((finallyBlock == null) || (!(finallyBlock.hasChildren())))) {
			n.removeChild(body);
			n.getParent().replaceChild(n, body);
			reportCodeChange();
			return body;
		}
		if (!(body.hasChildren())) {
			com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(catchBlock);
			if (finallyBlock != null) {
				n.removeChild(finallyBlock);
				n.getParent().replaceChild(n, finallyBlock);
			}else {
				n.getParent().removeChild(n);
			}
			reportCodeChange();
			return finallyBlock;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAssignment(com.google.javascript.rhino.Node subtree) {
		com.google.common.base.Preconditions.checkState(subtree.isAssign());
		com.google.javascript.rhino.Node left = subtree.getFirstChild();
		com.google.javascript.rhino.Node right = subtree.getLastChild();
		if (((left.isName()) && (right.isName())) && (left.getString().equals(right.getString()))) {
			subtree.getParent().replaceChild(subtree, right.detachFromParent());
			reportCodeChange();
			return right;
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldExpr(com.google.javascript.rhino.Node subtree) {
		com.google.javascript.rhino.Node result = trySimplifyUnusedResult(subtree.getFirstChild());
		if (result == null) {
			com.google.javascript.rhino.Node parent = subtree.getParent();
			if (parent.isLabel()) {
				com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.IR.block().srcref(subtree);
				parent.replaceChild(subtree, replacement);
				subtree = replacement;
			}else {
				subtree.detachFromParent();
				subtree = null;
			}
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node trySimplifyUnusedResult(com.google.javascript.rhino.Node n) {
		return trySimplifyUnusedResult(n, true);
	}

	private com.google.javascript.rhino.Node trySimplifyUnusedResult(com.google.javascript.rhino.Node n, boolean removeUnused) {
		com.google.javascript.rhino.Node result = n;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.HOOK :
				com.google.javascript.rhino.Node trueNode = trySimplifyUnusedResult(n.getFirstChild().getNext());
				com.google.javascript.rhino.Node falseNode = trySimplifyUnusedResult(n.getLastChild());
				if ((trueNode == null) && (falseNode != null)) {
					n.setType(com.google.javascript.rhino.Token.OR);
					com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 2));
				}else
					if ((trueNode != null) && (falseNode == null)) {
						n.setType(com.google.javascript.rhino.Token.AND);
						com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 2));
					}else
						if ((trueNode == null) && (falseNode == null)) {
							result = trySimplifyUnusedResult(n.getFirstChild());
						}else {
							result = n;
						}
					
				
				break;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				com.google.javascript.rhino.Node conditionalResultNode = trySimplifyUnusedResult(n.getLastChild());
				if (conditionalResultNode == null) {
					com.google.common.base.Preconditions.checkState(n.hasOneChild());
					result = trySimplifyUnusedResult(n.getFirstChild());
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				result = null;
				break;
			case com.google.javascript.rhino.Token.COMMA :
				com.google.javascript.rhino.Node left = trySimplifyUnusedResult(n.getFirstChild());
				com.google.javascript.rhino.Node right = trySimplifyUnusedResult(n.getLastChild());
				if ((left == null) && (right == null)) {
					result = null;
				}else
					if (left == null) {
						result = right;
					}else
						if (right == null) {
							result = left;
						}else {
							result = n;
						}
					
				
				break;
			default :
				if (!(com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(n))) {
					com.google.javascript.rhino.Node resultList = null;
					for (com.google.javascript.rhino.Node next, c = n.getFirstChild(); c != null; c = next) {
						next = c.getNext();
						c = trySimplifyUnusedResult(c);
						if (c != null) {
							c.detachFromParent();
							if (resultList == null) {
								resultList = c;
							}else {
								resultList = com.google.javascript.rhino.IR.comma(resultList, c).srcref(c);
							}
						}
					}
					result = resultList;
				}
		}
		if (n != result) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if (result == null) {
				if (removeUnused) {
					parent.removeChild(n);
				}else {
					result = com.google.javascript.rhino.IR.empty().srcref(n);
					parent.replaceChild(n, result);
				}
			}else {
				if ((result.getParent()) != null) {
					result.detachFromParent();
				}
				n.getParent().replaceChild(n, result);
			}
			reportCodeChange();
		}
		return result;
	}

	private com.google.javascript.rhino.Node tryOptimizeSwitch(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isSwitch());
		com.google.javascript.rhino.Node defaultCase = tryOptimizeDefaultCase(n);
		if (defaultCase == null) {
			com.google.javascript.rhino.Node next = null;
			com.google.javascript.rhino.Node prev = null;
			for (com.google.javascript.rhino.Node c = n.getFirstChild().getNext(); c != null; c = next) {
				next = c.getNext();
				if ((!(mayHaveSideEffects(c.getFirstChild()))) && (isUselessCase(c, prev))) {
					removeCase(n, c);
				}else {
					prev = c;
				}
			}
		}
		if (n.hasOneChild()) {
			com.google.javascript.rhino.Node condition = n.removeFirstChild();
			com.google.javascript.rhino.Node parent = n.getParent();
			com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.IR.exprResult(condition).srcref(n);
			parent.replaceChild(n, replacement);
			reportCodeChange();
			return replacement;
		}
		return null;
	}

	private com.google.javascript.rhino.Node tryOptimizeDefaultCase(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isSwitch());
		com.google.javascript.rhino.Node lastNonRemovable = n.getFirstChild();
		for (com.google.javascript.rhino.Node c = n.getFirstChild().getNext(); c != null; c = c.getNext()) {
			if (c.isDefaultCase()) {
				com.google.javascript.rhino.Node caseToRemove = lastNonRemovable.getNext();
				for (com.google.javascript.rhino.Node next; caseToRemove != c; caseToRemove = next) {
					next = caseToRemove.getNext();
					removeCase(n, caseToRemove);
				}
				com.google.javascript.rhino.Node prevCase = lastNonRemovable == (n.getFirstChild()) ? null : lastNonRemovable;
				if (isUselessCase(c, prevCase)) {
					removeCase(n, c);
					return null;
				}
				return c;
			}else {
				com.google.common.base.Preconditions.checkState(c.isCase());
				if ((c.getLastChild().hasChildren()) || (mayHaveSideEffects(c.getFirstChild()))) {
					lastNonRemovable = c;
				}
			}
		}
		return null;
	}

	private void removeCase(com.google.javascript.rhino.Node switchNode, com.google.javascript.rhino.Node caseNode) {
		com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(caseNode);
		switchNode.removeChild(caseNode);
		reportCodeChange();
	}

	private boolean isUselessCase(com.google.javascript.rhino.Node caseNode, @javax.annotation.Nullable
	com.google.javascript.rhino.Node previousCase) {
		com.google.common.base.Preconditions.checkState(((previousCase == null) || ((previousCase.getNext()) == caseNode)));
		com.google.javascript.rhino.Node switchNode = caseNode.getParent();
		if (((switchNode.getLastChild()) != caseNode) && (previousCase != null)) {
			com.google.javascript.rhino.Node previousBlock = previousCase.getLastChild();
			if ((!(previousBlock.hasChildren())) || (!(isExit(previousBlock.getLastChild())))) {
				return false;
			}
		}
		com.google.javascript.rhino.Node executingCase = caseNode;
		while (executingCase != null) {
			com.google.common.base.Preconditions.checkState(((executingCase.isDefaultCase()) || (executingCase.isCase())));
			com.google.common.base.Preconditions.checkState(((caseNode == executingCase) || (!(executingCase.isDefaultCase()))));
			com.google.javascript.rhino.Node block = executingCase.getLastChild();
			com.google.common.base.Preconditions.checkState(block.isBlock());
			if (block.hasChildren()) {
				for (com.google.javascript.rhino.Node blockChild : block.children()) {
					switch (blockChild.getType()) {
						case com.google.javascript.rhino.Token.BREAK :
							return (blockChild.getFirstChild()) == null;
						case com.google.javascript.rhino.Token.VAR :
							if ((blockChild.hasOneChild()) && ((blockChild.getFirstChild().getFirstChild()) == null)) {
								continue;
							}
							return false;
						default :
							return false;
					}
				}
			}else {
				executingCase = executingCase.getNext();
			}
		} 
		return true;
	}

	private boolean isExit(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.BREAK :
			case com.google.javascript.rhino.Token.CONTINUE :
			case com.google.javascript.rhino.Token.RETURN :
			case com.google.javascript.rhino.Token.THROW :
				return true;
			default :
				return false;
		}
	}

	private com.google.javascript.rhino.Node tryFoldComma(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = left.getNext();
		left = trySimplifyUnusedResult(left);
		if ((left == null) || (!(mayHaveSideEffects(left)))) {
			n.removeChild(right);
			parent.replaceChild(n, right);
			reportCodeChange();
			return right;
		}
		return n;
	}

	com.google.javascript.rhino.Node tryOptimizeBlock(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null;) {
			com.google.javascript.rhino.Node next = c.getNext();
			if ((!(isUnremovableNode(c))) && (!(mayHaveSideEffects(c)))) {
				n.removeChild(c);
				reportCodeChange();
			}else {
				tryOptimizeConditionalAfterAssign(c);
			}
			c = next;
		}
		if ((n.isSyntheticBlock()) || ((n.getParent()) == null)) {
			return n;
		}
		if (com.google.javascript.jscomp.NodeUtil.tryMergeBlock(n)) {
			reportCodeChange();
			return null;
		}
		return n;
	}

	private boolean isUnremovableNode(com.google.javascript.rhino.Node n) {
		return ((n.isBlock()) && (n.isSyntheticBlock())) || (n.isScript());
	}

	private void tryOptimizeConditionalAfterAssign(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node next = n.getNext();
		if ((isSimpleAssignment(n)) && (isConditionalStatement(next))) {
			com.google.javascript.rhino.Node lhsAssign = getSimpleAssignmentName(n);
			com.google.javascript.rhino.Node condition = getConditionalStatementCondition(next);
			if (((lhsAssign.isName()) && (condition.isName())) && (lhsAssign.getString().equals(condition.getString()))) {
				com.google.javascript.rhino.Node rhsAssign = getSimpleAssignmentValue(n);
				com.google.javascript.rhino.jstype.TernaryValue value = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(rhsAssign);
				if (value != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					com.google.javascript.rhino.Node replacementConditionNode = com.google.javascript.jscomp.NodeUtil.booleanNode(value.toBoolean(true));
					condition.getParent().replaceChild(condition, replacementConditionNode);
					reportCodeChange();
				}
			}
		}
	}

	private boolean isSimpleAssignment(com.google.javascript.rhino.Node n) {
		if ((com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) && (n.getFirstChild().getFirstChild().isName())) {
			return true;
		}else
			if (((n.isVar()) && (n.hasOneChild())) && ((n.getFirstChild().getFirstChild()) != null)) {
				return true;
			}
		
		return false;
	}

	private com.google.javascript.rhino.Node getSimpleAssignmentName(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(isSimpleAssignment(n));
		if (com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) {
			return n.getFirstChild().getFirstChild();
		}else {
			return n.getFirstChild();
		}
	}

	private com.google.javascript.rhino.Node getSimpleAssignmentValue(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(isSimpleAssignment(n));
		return n.getFirstChild().getLastChild();
	}

	private boolean isConditionalStatement(com.google.javascript.rhino.Node n) {
		return (n != null) && ((n.isIf()) || (isExprConditional(n)));
	}

	private boolean isExprConditional(com.google.javascript.rhino.Node n) {
		if (n.isExprResult()) {
			switch (n.getFirstChild().getType()) {
				case com.google.javascript.rhino.Token.HOOK :
				case com.google.javascript.rhino.Token.AND :
				case com.google.javascript.rhino.Token.OR :
					return true;
			}
		}
		return false;
	}

	private com.google.javascript.rhino.Node getConditionalStatementCondition(com.google.javascript.rhino.Node n) {
		if (n.isIf()) {
			return com.google.javascript.jscomp.NodeUtil.getConditionExpression(n);
		}else {
			com.google.common.base.Preconditions.checkState(isExprConditional(n));
			return n.getFirstChild().getFirstChild();
		}
	}

	private com.google.javascript.rhino.Node tryFoldIf(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isIf());
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.common.base.Preconditions.checkNotNull(parent);
		int type = n.getType();
		com.google.javascript.rhino.Node cond = n.getFirstChild();
		com.google.javascript.rhino.Node thenBody = cond.getNext();
		com.google.javascript.rhino.Node elseBody = thenBody.getNext();
		if ((elseBody != null) && (!(mayHaveSideEffects(elseBody)))) {
			n.removeChild(elseBody);
			elseBody = null;
			reportCodeChange();
		}
		if ((!(mayHaveSideEffects(thenBody))) && (elseBody != null)) {
			n.removeChild(elseBody);
			n.replaceChild(thenBody, elseBody);
			com.google.javascript.rhino.Node notCond = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT);
			n.replaceChild(cond, notCond);
			notCond.addChildToFront(cond);
			cond = notCond;
			thenBody = cond.getNext();
			elseBody = null;
			reportCodeChange();
		}
		if ((!(mayHaveSideEffects(thenBody))) && (elseBody == null)) {
			if (mayHaveSideEffects(cond)) {
				n.removeChild(cond);
				com.google.javascript.rhino.Node replacement = com.google.javascript.jscomp.NodeUtil.newExpr(cond);
				parent.replaceChild(n, replacement);
				reportCodeChange();
				return replacement;
			}else {
				com.google.javascript.jscomp.NodeUtil.removeChild(parent, n);
				reportCodeChange();
				return null;
			}
		}
		com.google.javascript.rhino.jstype.TernaryValue condValue = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond);
		if (condValue == (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			return n;
		}
		if (mayHaveSideEffects(cond)) {
			boolean newConditionValue = condValue == (com.google.javascript.rhino.jstype.TernaryValue.TRUE);
			if ((!newConditionValue) && (elseBody == null)) {
				elseBody = com.google.javascript.rhino.IR.block().srcref(n);
				n.addChildToBack(elseBody);
			}
			com.google.javascript.rhino.Node newCond = com.google.javascript.jscomp.NodeUtil.booleanNode(newConditionValue);
			n.replaceChild(cond, newCond);
			com.google.javascript.rhino.Node branchToKeep = newConditionValue ? thenBody : elseBody;
			branchToKeep.addChildToFront(com.google.javascript.rhino.IR.exprResult(cond).srcref(cond));
			reportCodeChange();
			cond = newCond;
		}
		boolean condTrue = condValue.toBoolean(true);
		if ((n.getChildCount()) == 2) {
			com.google.common.base.Preconditions.checkState((type == (com.google.javascript.rhino.Token.IF)));
			if (condTrue) {
				com.google.javascript.rhino.Node thenStmt = n.getFirstChild().getNext();
				n.removeChild(thenStmt);
				parent.replaceChild(n, thenStmt);
				reportCodeChange();
				return thenStmt;
			}else {
				com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(n);
				com.google.javascript.jscomp.NodeUtil.removeChild(parent, n);
				reportCodeChange();
				return null;
			}
		}else {
			com.google.javascript.rhino.Node trueBranch = n.getFirstChild().getNext();
			com.google.javascript.rhino.Node falseBranch = trueBranch.getNext();
			com.google.javascript.rhino.Node branchToKeep = condTrue ? trueBranch : falseBranch;
			com.google.javascript.rhino.Node branchToRemove = condTrue ? falseBranch : trueBranch;
			com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(branchToRemove);
			n.removeChild(branchToKeep);
			parent.replaceChild(n, branchToKeep);
			reportCodeChange();
			return branchToKeep;
		}
	}

	private com.google.javascript.rhino.Node tryFoldHook(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isHook());
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.common.base.Preconditions.checkNotNull(parent);
		com.google.javascript.rhino.Node cond = n.getFirstChild();
		com.google.javascript.rhino.Node thenBody = cond.getNext();
		com.google.javascript.rhino.Node elseBody = thenBody.getNext();
		com.google.javascript.rhino.jstype.TernaryValue condValue = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond);
		if (condValue == (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			if (!(areNodesEqualForInlining(thenBody, elseBody))) {
				return n;
			}
		}
		n.detachChildren();
		com.google.javascript.rhino.Node branchToKeep = condValue.toBoolean(true) ? thenBody : elseBody;
		com.google.javascript.rhino.Node replacement;
		if (mayHaveSideEffects(cond)) {
			replacement = com.google.javascript.rhino.IR.comma(cond, branchToKeep).srcref(n);
		}else {
			replacement = branchToKeep;
		}
		parent.replaceChild(n, replacement);
		reportCodeChange();
		return replacement;
	}

	com.google.javascript.rhino.Node tryFoldWhile(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(n.isWhile());
		com.google.javascript.rhino.Node cond = com.google.javascript.jscomp.NodeUtil.getConditionExpression(n);
		if ((com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(cond)) != (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
			return n;
		}
		com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(n);
		com.google.javascript.jscomp.NodeUtil.removeChild(n.getParent(), n);
		reportCodeChange();
		return null;
	}

	com.google.javascript.rhino.Node tryFoldFor(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(n.isFor());
		if (com.google.javascript.jscomp.NodeUtil.isForIn(n)) {
			return n;
		}
		com.google.javascript.rhino.Node init = n.getFirstChild();
		com.google.javascript.rhino.Node cond = init.getNext();
		com.google.javascript.rhino.Node increment = cond.getNext();
		if ((!(init.isEmpty())) && (!(init.isVar()))) {
			init = trySimplifyUnusedResult(init, false);
		}
		if (!(increment.isEmpty())) {
			increment = trySimplifyUnusedResult(increment, false);
		}
		if (!(n.getFirstChild().isEmpty())) {
			return n;
		}
		if ((com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond)) != (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
			return n;
		}
		com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(n);
		if (!(mayHaveSideEffects(cond))) {
			com.google.javascript.jscomp.NodeUtil.removeChild(n.getParent(), n);
		}else {
			com.google.javascript.rhino.Node statement = com.google.javascript.rhino.IR.exprResult(cond.detachFromParent()).copyInformationFrom(cond);
			n.getParent().replaceChild(n, statement);
		}
		reportCodeChange();
		return null;
	}

	com.google.javascript.rhino.Node tryFoldDo(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(n.isDo());
		com.google.javascript.rhino.Node cond = com.google.javascript.jscomp.NodeUtil.getConditionExpression(n);
		if ((com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond)) != (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
			return n;
		}
		if (hasBreakOrContinue(n)) {
			return n;
		}
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(n, n.getFirstChild()));
		com.google.javascript.rhino.Node block = n.removeFirstChild();
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, block);
		if (mayHaveSideEffects(cond)) {
			com.google.javascript.rhino.Node condStatement = com.google.javascript.rhino.IR.exprResult(cond.detachFromParent()).srcref(cond);
			parent.addChildAfter(condStatement, block);
		}
		reportCodeChange();
		return n;
	}

	boolean hasBreakOrContinue(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.has(n, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>or(new com.google.javascript.jscomp.NodeUtil.MatchNodeType(com.google.javascript.rhino.Token.BREAK), new com.google.javascript.jscomp.NodeUtil.MatchNodeType(com.google.javascript.rhino.Token.CONTINUE)), com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION);
	}

	private void tryFoldForCondition(com.google.javascript.rhino.Node forCondition) {
		if ((com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(forCondition)) == (com.google.javascript.rhino.jstype.TernaryValue.TRUE)) {
			forCondition.getParent().replaceChild(forCondition, com.google.javascript.rhino.IR.empty());
			reportCodeChange();
		}
	}
}

