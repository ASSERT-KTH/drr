

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
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.TRY)));
		com.google.javascript.rhino.Node body = n.getFirstChild();
		com.google.javascript.rhino.Node catchBlock = body.getNext();
		com.google.javascript.rhino.Node finallyBlock = catchBlock.getNext();
		if ((!(catchBlock.hasChildren())) && ((finallyBlock == null) || (!(finallyBlock.hasChildren())))) {
			n.removeChild(body);
			n.getParent().replaceChild(n, body);
			reportCodeChange();
			return body;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAssignment(com.google.javascript.rhino.Node subtree) {
		com.google.common.base.Preconditions.checkState(((subtree.getType()) == (com.google.javascript.rhino.Token.ASSIGN)));
		com.google.javascript.rhino.Node left = subtree.getFirstChild();
		com.google.javascript.rhino.Node right = subtree.getLastChild();
		if ((((left.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((right.getType()) == (com.google.javascript.rhino.Token.NAME))) && (left.getString().equals(right.getString()))) {
			subtree.getParent().replaceChild(subtree, right.detachFromParent());
			reportCodeChange();
			return right;
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldExpr(com.google.javascript.rhino.Node subtree) {
		com.google.javascript.rhino.Node result = trySimpilifyUnusedResult(subtree.getFirstChild());
		if (result == null) {
			com.google.javascript.rhino.Node parent = subtree.getParent();
			if ((parent.getType()) == (com.google.javascript.rhino.Token.LABEL)) {
				com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK).copyInformationFrom(subtree);
				parent.replaceChild(subtree, replacement);
				subtree = replacement;
			}else {
				subtree.detachFromParent();
				subtree = null;
			}
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node trySimpilifyUnusedResult(com.google.javascript.rhino.Node n) {
		return trySimpilifyUnusedResult(n, true);
	}

	private com.google.javascript.rhino.Node trySimpilifyUnusedResult(com.google.javascript.rhino.Node n, boolean removeUnused) {
		com.google.javascript.rhino.Node result = n;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.HOOK :
				com.google.javascript.rhino.Node trueNode = trySimpilifyUnusedResult(n.getFirstChild().getNext());
				com.google.javascript.rhino.Node falseNode = trySimpilifyUnusedResult(n.getLastChild());
				if ((trueNode == null) && (falseNode != null)) {
					n.setType(com.google.javascript.rhino.Token.OR);
					com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 2));
				}else
					if ((trueNode != null) && (falseNode == null)) {
						n.setType(com.google.javascript.rhino.Token.AND);
						com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 2));
					}else
						if ((trueNode == null) && (falseNode == null)) {
							result = trySimpilifyUnusedResult(n.getFirstChild());
						}else {
							result = n;
						}
					
				
				break;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				com.google.javascript.rhino.Node conditionalResultNode = trySimpilifyUnusedResult(n.getLastChild());
				if (conditionalResultNode == null) {
					com.google.common.base.Preconditions.checkState(n.hasOneChild());
					result = trySimpilifyUnusedResult(n.getFirstChild());
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				result = null;
				break;
			case com.google.javascript.rhino.Token.COMMA :
				com.google.javascript.rhino.Node left = trySimpilifyUnusedResult(n.getFirstChild());
				com.google.javascript.rhino.Node right = trySimpilifyUnusedResult(n.getLastChild());
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
						c = trySimpilifyUnusedResult(c);
						if (c != null) {
							c.detachFromParent();
							if (resultList == null) {
								resultList = c;
							}else {
								resultList = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, resultList, c).copyInformationFrom(c);
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
					result = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY).copyInformationFrom(n);
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
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.SWITCH)));
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
			com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, condition).copyInformationFrom(n);
			parent.replaceChild(n, replacement);
			reportCodeChange();
			return replacement;
		}
		return null;
	}

	private com.google.javascript.rhino.Node tryOptimizeDefaultCase(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.SWITCH)));
		com.google.javascript.rhino.Node lastNonRemovable = n.getFirstChild();
		for (com.google.javascript.rhino.Node c = n.getFirstChild().getNext(); c != null; c = c.getNext()) {
			if ((c.getType()) == (com.google.javascript.rhino.Token.DEFAULT)) {
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
				com.google.common.base.Preconditions.checkState(((c.getType()) == (com.google.javascript.rhino.Token.CASE)));
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
			com.google.common.base.Preconditions.checkState((((executingCase.getType()) == (com.google.javascript.rhino.Token.DEFAULT)) || ((executingCase.getType()) == (com.google.javascript.rhino.Token.CASE))));
			com.google.common.base.Preconditions.checkState(((caseNode == executingCase) || ((executingCase.getType()) != (com.google.javascript.rhino.Token.DEFAULT))));
			com.google.javascript.rhino.Node block = executingCase.getLastChild();
			com.google.common.base.Preconditions.checkState(((block.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
			if (block.hasChildren()) {
				for (com.google.javascript.rhino.Node blockChild : block.children()) {
					int type = blockChild.getType();
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
		left = trySimpilifyUnusedResult(left);
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
			if ((!(mayHaveSideEffects(c))) && (!(c.isSyntheticBlock()))) {
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

	private void tryOptimizeConditionalAfterAssign(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node next = n.getNext();
		if ((isSimpleAssignment(n)) && (isConditionalStatement(next))) {
			com.google.javascript.rhino.Node lhsAssign = getSimpleAssignmentName(n);
			com.google.javascript.rhino.Node condition = getConditionalStatementCondition(next);
			if (((com.google.javascript.jscomp.NodeUtil.isName(lhsAssign)) && (com.google.javascript.jscomp.NodeUtil.isName(condition))) && (lhsAssign.getString().equals(condition.getString()))) {
				com.google.javascript.rhino.Node rhsAssign = getSimpleAssignmentValue(n);
				com.google.javascript.rhino.jstype.TernaryValue value = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(rhsAssign);
				if (value != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					int replacementConditionNodeType = value.toBoolean(true) ? com.google.javascript.rhino.Token.TRUE : com.google.javascript.rhino.Token.FALSE;
					condition.getParent().replaceChild(condition, new com.google.javascript.rhino.Node(replacementConditionNodeType));
					reportCodeChange();
				}
			}
		}
	}

	private boolean isSimpleAssignment(com.google.javascript.rhino.Node n) {
		if ((com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) && (com.google.javascript.jscomp.NodeUtil.isName(n.getFirstChild().getFirstChild()))) {
			return true;
		}else
			if ((((n.getType()) == (com.google.javascript.rhino.Token.VAR)) && (n.hasOneChild())) && ((n.getFirstChild().getFirstChild()) != null)) {
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
		return (n != null) && (((n.getType()) == (com.google.javascript.rhino.Token.IF)) || (isExprConditional(n)));
	}

	private boolean isExprConditional(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
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
		if ((n.getType()) == (com.google.javascript.rhino.Token.IF)) {
			return com.google.javascript.jscomp.NodeUtil.getConditionExpression(n);
		}else {
			com.google.common.base.Preconditions.checkState(isExprConditional(n));
			return n.getFirstChild().getFirstChild();
		}
	}

	private com.google.javascript.rhino.Node tryFoldIf(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.IF)));
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
				elseBody = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK).copyInformationFrom(n);
				n.addChildToBack(elseBody);
			}
			com.google.javascript.rhino.Node newCond = new com.google.javascript.rhino.Node((newConditionValue ? com.google.javascript.rhino.Token.TRUE : com.google.javascript.rhino.Token.FALSE));
			n.replaceChild(cond, newCond);
			com.google.javascript.rhino.Node branchToKeep = newConditionValue ? thenBody : elseBody;
			branchToKeep.addChildToFront(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, cond).copyInformationFrom(cond));
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
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.HOOK)));
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.common.base.Preconditions.checkNotNull(parent);
		com.google.javascript.rhino.Node cond = n.getFirstChild();
		com.google.javascript.rhino.Node thenBody = cond.getNext();
		com.google.javascript.rhino.Node elseBody = thenBody.getNext();
		com.google.javascript.rhino.jstype.TernaryValue condValue = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond);
		if (condValue == (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			return n;
		}
		n.detachChildren();
		com.google.javascript.rhino.Node branchToKeep = condValue.toBoolean(true) ? thenBody : elseBody;
		com.google.javascript.rhino.Node replacement;
		if (mayHaveSideEffects(cond)) {
			replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA).copyInformationFrom(n);
			replacement.addChildToFront(cond);
			replacement.addChildToBack(branchToKeep);
		}else {
			replacement = branchToKeep;
		}
		parent.replaceChild(n, replacement);
		reportCodeChange();
		return replacement;
	}

	com.google.javascript.rhino.Node tryFoldWhile(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.WHILE)));
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
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.FOR)));
		if (com.google.javascript.jscomp.NodeUtil.isForIn(n)) {
			return n;
		}
		com.google.javascript.rhino.Node init = n.getFirstChild();
		com.google.javascript.rhino.Node cond = init.getNext();
		com.google.javascript.rhino.Node increment = cond.getNext();
		if (((init.getType()) != (com.google.javascript.rhino.Token.EMPTY)) && ((init.getType()) != (com.google.javascript.rhino.Token.VAR))) {
			init = trySimpilifyUnusedResult(init, false);
		}
		if ((increment.getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
			increment = trySimpilifyUnusedResult(increment, false);
		}
		if ((n.getFirstChild().getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
			return n;
		}
		if ((com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond)) != (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
			return n;
		}
		com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(n);
		if (!(mayHaveSideEffects(cond))) {
			com.google.javascript.jscomp.NodeUtil.removeChild(n.getParent(), n);
		}else {
			com.google.javascript.rhino.Node statement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, cond.detachFromParent()).copyInformationFrom(cond);
			n.getParent().replaceChild(n, statement);
		}
		reportCodeChange();
		return null;
	}

	com.google.javascript.rhino.Node tryFoldDo(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.DO)));
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
			com.google.javascript.rhino.Node condStatement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, cond.detachFromParent()).copyInformationFrom(cond);
			parent.addChildAfter(condStatement, block);
		}
		reportCodeChange();
		return n;
	}

	boolean hasBreakOrContinue(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.has(n, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>or(new com.google.javascript.jscomp.NodeUtil.MatchNodeType(com.google.javascript.rhino.Token.BREAK), new com.google.javascript.jscomp.NodeUtil.MatchNodeType(com.google.javascript.rhino.Token.CONTINUE)), new com.google.javascript.jscomp.NodeUtil.MatchNotFunction());
	}

	private void tryFoldForCondition(com.google.javascript.rhino.Node forCondition) {
		if ((com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(forCondition)) == (com.google.javascript.rhino.jstype.TernaryValue.TRUE)) {
			forCondition.getParent().replaceChild(forCondition, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
			reportCodeChange();
		}
	}
}

