

package com.google.javascript.jscomp;


class PeepholeFoldConstants extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	static final com.google.javascript.jscomp.DiagnosticType INVALID_GETELEM_INDEX_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_GETELEM_INDEX_ERROR", "Array index not integer: {0}");

	static final com.google.javascript.jscomp.DiagnosticType INDEX_OUT_OF_BOUNDS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INDEX_OUT_OF_BOUNDS_ERROR", "Array index out of bounds: {0}");

	static final com.google.javascript.jscomp.DiagnosticType NEGATING_A_NON_NUMBER_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NEGATING_A_NON_NUMBER_ERROR", "Can't negate non-numeric value: {0}");

	static final com.google.javascript.jscomp.DiagnosticType BITWISE_OPERAND_OUT_OF_RANGE = com.google.javascript.jscomp.DiagnosticType.error("JSC_BITWISE_OPERAND_OUT_OF_RANGE", "Operand out of range, bitwise operation will lose information: {0}");

	static final com.google.javascript.jscomp.DiagnosticType SHIFT_AMOUNT_OUT_OF_BOUNDS = com.google.javascript.jscomp.DiagnosticType.error("JSC_SHIFT_AMOUNT_OUT_OF_BOUNDS", "Shift amount out of bounds: {0}");

	static final com.google.javascript.jscomp.DiagnosticType FRACTIONAL_BITWISE_OPERAND = com.google.javascript.jscomp.DiagnosticType.error("JSC_FRACTIONAL_BITWISE_OPERAND", "Fractional bitwise operand: {0}");

	private static final double MAX_FOLD_NUMBER = java.lang.Math.pow(2, 53);

	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		switch (subtree.getType()) {
			case com.google.javascript.rhino.Token.NEW :
				return tryFoldCtorCall(subtree);
			case com.google.javascript.rhino.Token.TYPEOF :
				return tryFoldTypeof(subtree);
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.BITNOT :
				tryReduceOperandsForOp(subtree);
				return tryFoldUnaryOperator(subtree);
			case com.google.javascript.rhino.Token.VOID :
				return tryReduceVoid(subtree);
			default :
				tryReduceOperandsForOp(subtree);
				return tryFoldBinaryOperator(subtree);
		}
	}

	private com.google.javascript.rhino.Node tryFoldBinaryOperator(com.google.javascript.rhino.Node subtree) {
		com.google.javascript.rhino.Node left = subtree.getFirstChild();
		if (left == null) {
			return subtree;
		}
		com.google.javascript.rhino.Node right = left.getNext();
		if (right == null) {
			return subtree;
		}
		switch (subtree.getType()) {
			case com.google.javascript.rhino.Token.GETPROP :
				return tryFoldGetProp(subtree, left, right);
			case com.google.javascript.rhino.Token.GETELEM :
				return tryFoldGetElem(subtree, left, right);
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return tryFoldInstanceof(subtree, left, right);
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				return tryFoldAndOr(subtree, left, right);
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
				return tryFoldShift(subtree, left, right);
			case com.google.javascript.rhino.Token.ASSIGN :
				return tryFoldAssign(subtree, left, right);
			case com.google.javascript.rhino.Token.ADD :
				return tryFoldAdd(subtree, left, right);
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.MOD :
				return tryFoldArithmeticOp(subtree, left, right);
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
				com.google.javascript.rhino.Node result = tryFoldArithmeticOp(subtree, left, right);
				if (result != subtree) {
					return result;
				}
				return tryFoldLeftChildOp(subtree, left, right);
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
				return tryFoldComparison(subtree, left, right);
			default :
				return subtree;
		}
	}

	private com.google.javascript.rhino.Node tryReduceVoid(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node child = n.getFirstChild();
		if (((child.getType()) != (com.google.javascript.rhino.Token.NUMBER)) || ((child.getDouble()) != 0.0)) {
			if (!(mayHaveSideEffects(n))) {
				n.replaceChild(child, com.google.javascript.rhino.Node.newNumber(0));
				reportCodeChange();
			}
		}
		return n;
	}

	private void tryReduceOperandsForOp(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ADD :
				com.google.javascript.rhino.Node left = n.getFirstChild();
				com.google.javascript.rhino.Node right = n.getLastChild();
				if ((!(com.google.javascript.jscomp.NodeUtil.mayBeString(left))) && (!(com.google.javascript.jscomp.NodeUtil.mayBeString(right)))) {
					tryConvertOperandsToNumber(n);
				}
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				tryConvertToNumber(n.getLastChild());
				break;
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
				tryConvertOperandsToNumber(n);
				break;
		}
	}

	private void tryConvertOperandsToNumber(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node next;
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = next) {
			next = c.getNext();
			tryConvertToNumber(c);
		}
	}

	private void tryConvertToNumber(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NUMBER :
				return ;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.COMMA :
				tryConvertToNumber(n.getLastChild());
				return ;
			case com.google.javascript.rhino.Token.HOOK :
				tryConvertToNumber(n.getChildAtIndex(1));
				tryConvertToNumber(n.getLastChild());
				return ;
			case com.google.javascript.rhino.Token.NAME :
				if (!(com.google.javascript.jscomp.NodeUtil.isUndefined(n))) {
					return ;
				}
				break;
		}
		java.lang.Double result = com.google.javascript.jscomp.NodeUtil.getNumberValue(n);
		if (result == null) {
			return ;
		}
		double value = result;
		com.google.javascript.rhino.Node replacement;
		if (java.lang.Double.isNaN(value)) {
			replacement = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "NaN");
		}else
			if (value == (java.lang.Double.POSITIVE_INFINITY)) {
				replacement = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "Infinity");
			}else
				if (value == (java.lang.Double.NEGATIVE_INFINITY)) {
					replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NEG, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "Infinity"));
					replacement.copyInformationFromForTree(n);
				}else {
					replacement = com.google.javascript.rhino.Node.newNumber(value);
				}
			
		
		n.getParent().replaceChild(n, replacement);
		reportCodeChange();
	}

	private com.google.javascript.rhino.Node tryFoldTypeof(com.google.javascript.rhino.Node originalTypeofNode) {
		com.google.common.base.Preconditions.checkArgument(((originalTypeofNode.getType()) == (com.google.javascript.rhino.Token.TYPEOF)));
		com.google.javascript.rhino.Node argumentNode = originalTypeofNode.getFirstChild();
		if ((argumentNode == null) || (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(argumentNode, true)))) {
			return originalTypeofNode;
		}
		java.lang.String typeNameString = null;
		switch (argumentNode.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				typeNameString = "function";
				break;
			case com.google.javascript.rhino.Token.STRING :
				typeNameString = "string";
				break;
			case com.google.javascript.rhino.Token.NUMBER :
				typeNameString = "number";
				break;
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				typeNameString = "boolean";
				break;
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.OBJECTLIT :
			case com.google.javascript.rhino.Token.ARRAYLIT :
				typeNameString = "object";
				break;
			case com.google.javascript.rhino.Token.VOID :
				typeNameString = "undefined";
				break;
			case com.google.javascript.rhino.Token.NAME :
				if ("undefined".equals(argumentNode.getString())) {
					typeNameString = "undefined";
				}
				break;
		}
		if (typeNameString != null) {
			com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.Node.newString(typeNameString);
			originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
			reportCodeChange();
			return newNode;
		}
		return originalTypeofNode;
	}

	private com.google.javascript.rhino.Node tryFoldUnaryOperator(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.hasOneChild());
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node parent = n.getParent();
		if (left == null) {
			return n;
		}
		com.google.javascript.rhino.jstype.TernaryValue leftVal = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(left);
		if (leftVal == (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			return n;
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NOT :
				int result = leftVal.toBoolean(true) ? com.google.javascript.rhino.Token.FALSE : com.google.javascript.rhino.Token.TRUE;
				com.google.javascript.rhino.Node replacementNode = new com.google.javascript.rhino.Node(result);
				parent.replaceChild(n, replacementNode);
				reportCodeChange();
				return replacementNode;
			case com.google.javascript.rhino.Token.POS :
				if (com.google.javascript.jscomp.NodeUtil.isNumericResult(left)) {
					parent.replaceChild(n, left.detachFromParent());
					reportCodeChange();
					return left;
				}
				return n;
			case com.google.javascript.rhino.Token.NEG :
				try {
					if ((left.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						if (left.getString().equals("Infinity")) {
							return n;
						}else
							if (left.getString().equals("NaN")) {
								n.removeChild(left);
								parent.replaceChild(n, left);
								reportCodeChange();
								return left;
							}
						
					}
					double negNum = -(left.getDouble());
					com.google.javascript.rhino.Node negNumNode = com.google.javascript.rhino.Node.newNumber(negNum);
					parent.replaceChild(n, negNumNode);
					reportCodeChange();
					return negNumNode;
				} catch (java.lang.UnsupportedOperationException ex) {
					error(com.google.javascript.jscomp.PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR, left);
					return n;
				}
			case com.google.javascript.rhino.Token.BITNOT :
				try {
					double val = left.getDouble();
					if ((val >= (java.lang.Integer.MIN_VALUE)) && (val <= (java.lang.Integer.MAX_VALUE))) {
						int intVal = ((int) (val));
						if (intVal == val) {
							com.google.javascript.rhino.Node notIntValNode = com.google.javascript.rhino.Node.newNumber((~intVal));
							parent.replaceChild(n, notIntValNode);
							reportCodeChange();
							return notIntValNode;
						}else {
							error(com.google.javascript.jscomp.PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND, left);
							return n;
						}
					}else {
						error(com.google.javascript.jscomp.PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE, left);
						return n;
					}
				} catch (java.lang.UnsupportedOperationException ex) {
					error(com.google.javascript.jscomp.PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR, left);
					return n;
				}
			default :
				return n;
		}
	}

	private com.google.javascript.rhino.Node tryFoldInstanceof(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.INSTANCEOF)));
		if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, true)) && (!(mayHaveSideEffects(right)))) {
			com.google.javascript.rhino.Node replacementNode = null;
			if (com.google.javascript.jscomp.NodeUtil.isImmutableValue(left)) {
				replacementNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FALSE);
			}else
				if (((right.getType()) == (com.google.javascript.rhino.Token.NAME)) && ("Object".equals(right.getString()))) {
					replacementNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRUE);
				}
			
			if (replacementNode != null) {
				n.getParent().replaceChild(n, replacementNode);
				reportCodeChange();
				return replacementNode;
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAssign(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.ASSIGN)));
		if ((!(right.hasChildren())) || ((right.getFirstChild().getNext()) != (right.getLastChild()))) {
			return n;
		}
		if (mayHaveSideEffects(left)) {
			return n;
		}
		com.google.javascript.rhino.Node newRight;
		if (areNodesEqualForInlining(left, right.getFirstChild())) {
			newRight = right.getLastChild();
		}else
			if ((com.google.javascript.jscomp.NodeUtil.isCommutative(right.getType())) && (areNodesEqualForInlining(left, right.getLastChild()))) {
				newRight = right.getFirstChild();
			}else {
				return n;
			}
		
		int newType = -1;
		switch (right.getType()) {
			case com.google.javascript.rhino.Token.ADD :
				newType = com.google.javascript.rhino.Token.ASSIGN_ADD;
				break;
			case com.google.javascript.rhino.Token.BITAND :
				newType = com.google.javascript.rhino.Token.ASSIGN_BITAND;
				break;
			case com.google.javascript.rhino.Token.BITOR :
				newType = com.google.javascript.rhino.Token.ASSIGN_BITOR;
				break;
			case com.google.javascript.rhino.Token.BITXOR :
				newType = com.google.javascript.rhino.Token.ASSIGN_BITXOR;
				break;
			case com.google.javascript.rhino.Token.DIV :
				newType = com.google.javascript.rhino.Token.ASSIGN_DIV;
				break;
			case com.google.javascript.rhino.Token.LSH :
				newType = com.google.javascript.rhino.Token.ASSIGN_LSH;
				break;
			case com.google.javascript.rhino.Token.MOD :
				newType = com.google.javascript.rhino.Token.ASSIGN_MOD;
				break;
			case com.google.javascript.rhino.Token.MUL :
				newType = com.google.javascript.rhino.Token.ASSIGN_MUL;
				break;
			case com.google.javascript.rhino.Token.RSH :
				newType = com.google.javascript.rhino.Token.ASSIGN_RSH;
				break;
			case com.google.javascript.rhino.Token.SUB :
				newType = com.google.javascript.rhino.Token.ASSIGN_SUB;
				break;
			case com.google.javascript.rhino.Token.URSH :
				newType = com.google.javascript.rhino.Token.ASSIGN_URSH;
				break;
			default :
				return n;
		}
		com.google.javascript.rhino.Node newNode = new com.google.javascript.rhino.Node(newType, left.detachFromParent(), newRight.detachFromParent());
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
	}

	private com.google.javascript.rhino.Node tryFoldAndOr(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.javascript.rhino.Node result = null;
		int type = n.getType();
		com.google.javascript.rhino.jstype.TernaryValue leftVal = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(left);
		if (leftVal != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			boolean lval = leftVal.toBoolean(true);
			if ((lval && (type == (com.google.javascript.rhino.Token.OR))) || ((!lval) && (type == (com.google.javascript.rhino.Token.AND)))) {
				result = left;
			}else
				if (!(mayHaveSideEffects(left))) {
					result = right;
				}
			
		}
		if (result != null) {
			n.removeChild(result);
			parent.replaceChild(n, result);
			reportCodeChange();
			return result;
		}else {
			return n;
		}
	}

	private com.google.javascript.rhino.Node tryFoldChildAddString(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false)) && ((left.getType()) == (com.google.javascript.rhino.Token.ADD))) {
			com.google.javascript.rhino.Node ll = left.getFirstChild();
			com.google.javascript.rhino.Node lr = ll.getNext();
			if ((lr.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				java.lang.String leftString = com.google.javascript.jscomp.NodeUtil.getStringValue(lr);
				java.lang.String rightString = com.google.javascript.jscomp.NodeUtil.getStringValue(right);
				if ((leftString != null) && (rightString != null)) {
					left.removeChild(ll);
					java.lang.String result = leftString + rightString;
					n.replaceChild(left, ll);
					n.replaceChild(right, com.google.javascript.rhino.Node.newString(result));
					reportCodeChange();
					return n;
				}
			}
		}
		if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, false)) && ((right.getType()) == (com.google.javascript.rhino.Token.ADD))) {
			com.google.javascript.rhino.Node rl = right.getFirstChild();
			com.google.javascript.rhino.Node rr = right.getLastChild();
			if ((rl.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				java.lang.String leftString = com.google.javascript.jscomp.NodeUtil.getStringValue(left);
				java.lang.String rightString = com.google.javascript.jscomp.NodeUtil.getStringValue(rl);
				if ((leftString != null) && (rightString != null)) {
					right.removeChild(rr);
					java.lang.String result = leftString + rightString;
					n.replaceChild(right, rr);
					n.replaceChild(left, com.google.javascript.rhino.Node.newString(result));
					reportCodeChange();
					return n;
				}
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAddConstantString(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if (((left.getType()) == (com.google.javascript.rhino.Token.STRING)) || ((right.getType()) == (com.google.javascript.rhino.Token.STRING))) {
			java.lang.String leftString = com.google.javascript.jscomp.NodeUtil.getStringValue(left);
			java.lang.String rightString = com.google.javascript.jscomp.NodeUtil.getStringValue(right);
			if ((leftString != null) && (rightString != null)) {
				com.google.javascript.rhino.Node newStringNode = com.google.javascript.rhino.Node.newString((leftString + rightString));
				n.getParent().replaceChild(n, newStringNode);
				reportCodeChange();
				return newStringNode;
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldArithmeticOp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.javascript.rhino.Node result = performArithmeticOp(n.getType(), left, right);
		if (result != null) {
			result.copyInformationFromForTree(n);
			n.getParent().replaceChild(n, result);
			reportCodeChange();
			return result;
		}
		return n;
	}

	private com.google.javascript.rhino.Node performArithmeticOp(int opType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if ((opType == (com.google.javascript.rhino.Token.ADD)) && ((com.google.javascript.jscomp.NodeUtil.mayBeString(left, false)) || (com.google.javascript.jscomp.NodeUtil.mayBeString(right, false)))) {
			return null;
		}
		double result;
		java.lang.Double lValObj = com.google.javascript.jscomp.NodeUtil.getNumberValue(left);
		if (lValObj == null) {
			return null;
		}
		java.lang.Double rValObj = com.google.javascript.jscomp.NodeUtil.getNumberValue(right);
		if (rValObj == null) {
			return null;
		}
		double lval = lValObj;
		double rval = rValObj;
		switch (opType) {
			case com.google.javascript.rhino.Token.BITAND :
				result = (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(lval)) & (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(rval));
				break;
			case com.google.javascript.rhino.Token.BITOR :
				result = (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(lval)) | (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(rval));
				break;
			case com.google.javascript.rhino.Token.BITXOR :
				result = (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(lval)) ^ (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.toInt32(rval));
				break;
			case com.google.javascript.rhino.Token.ADD :
				result = lval + rval;
				break;
			case com.google.javascript.rhino.Token.SUB :
				result = lval - rval;
				break;
			case com.google.javascript.rhino.Token.MUL :
				result = lval * rval;
				break;
			case com.google.javascript.rhino.Token.MOD :
				if (rval == 0) {
					return null;
				}
				result = lval % rval;
				break;
			case com.google.javascript.rhino.Token.DIV :
				if (rval == 0) {
					return null;
				}
				result = lval / rval;
				break;
			default :
				throw new java.lang.Error("Unexpected arithmetic operator");
		}
		if (((java.lang.String.valueOf(result).length()) <= (((java.lang.String.valueOf(lval).length()) + (java.lang.String.valueOf(rval).length())) + 1)) && ((java.lang.Math.abs(result)) <= (com.google.javascript.jscomp.PeepholeFoldConstants.MAX_FOLD_NUMBER))) {
			com.google.javascript.rhino.Node newNumber = com.google.javascript.rhino.Node.newNumber(result);
			return newNumber;
		}else
			if (java.lang.Double.isNaN(result)) {
				return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "NaN");
			}else
				if (result == (java.lang.Double.POSITIVE_INFINITY)) {
					return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "Infinity");
				}else
					if (result == (java.lang.Double.NEGATIVE_INFINITY)) {
						return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NEG, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "Infinity"));
					}
				
			
		
		return null;
	}

	private com.google.javascript.rhino.Node tryFoldLeftChildOp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		int opType = n.getType();
		com.google.common.base.Preconditions.checkState((((com.google.javascript.jscomp.NodeUtil.isAssociative(opType)) && (com.google.javascript.jscomp.NodeUtil.isCommutative(opType))) || ((n.getType()) == (com.google.javascript.rhino.Token.ADD))));
		com.google.common.base.Preconditions.checkState((((n.getType()) != (com.google.javascript.rhino.Token.ADD)) || (!(com.google.javascript.jscomp.NodeUtil.mayBeString(n)))));
		java.lang.Double rightValObj = com.google.javascript.jscomp.NodeUtil.getNumberValue(right);
		if ((rightValObj != null) && ((left.getType()) == opType)) {
			com.google.common.base.Preconditions.checkState(((left.getChildCount()) == 2));
			com.google.javascript.rhino.Node ll = left.getFirstChild();
			com.google.javascript.rhino.Node lr = ll.getNext();
			com.google.javascript.rhino.Node valueToCombine = ll;
			com.google.javascript.rhino.Node replacement = performArithmeticOp(opType, valueToCombine, right);
			if (replacement == null) {
				valueToCombine = lr;
				replacement = performArithmeticOp(opType, valueToCombine, right);
			}
			if (replacement != null) {
				left.removeChild(valueToCombine);
				n.replaceChild(left, left.removeFirstChild());
				replacement.copyInformationFromForTree(right);
				n.replaceChild(right, replacement);
				reportCodeChange();
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAdd(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.ADD)));
		if (com.google.javascript.jscomp.NodeUtil.mayBeString(node, true)) {
			if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, false)) && (com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false))) {
				return tryFoldAddConstantString(node, left, right);
			}else {
				return tryFoldChildAddString(node, left, right);
			}
		}else {
			com.google.javascript.rhino.Node result = tryFoldArithmeticOp(node, left, right);
			if (result != node) {
				return result;
			}
			return tryFoldLeftChildOp(node, left, right);
		}
	}

	private com.google.javascript.rhino.Node tryFoldShift(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if (((left.getType()) == (com.google.javascript.rhino.Token.NUMBER)) && ((right.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
			double result;
			double lval = left.getDouble();
			double rval = right.getDouble();
			if (!((lval >= (java.lang.Integer.MIN_VALUE)) && (lval <= (java.lang.Integer.MAX_VALUE)))) {
				error(com.google.javascript.jscomp.PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE, left);
				return n;
			}
			if (!((rval >= 0) && (rval < 32))) {
				error(com.google.javascript.jscomp.PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS, right);
				return n;
			}
			int lvalInt = ((int) (lval));
			if (lvalInt != lval) {
				error(com.google.javascript.jscomp.PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND, left);
				return n;
			}
			int rvalInt = ((int) (rval));
			if (rvalInt != rval) {
				error(com.google.javascript.jscomp.PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND, right);
				return n;
			}
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.LSH :
					result = lvalInt << rvalInt;
					break;
				case com.google.javascript.rhino.Token.RSH :
					result = lvalInt >> rvalInt;
					break;
				case com.google.javascript.rhino.Token.URSH :
					long lvalLong = lvalInt & 4294967295L;
					result = lvalLong >>> rvalInt;
					break;
				default :
					throw new java.lang.AssertionError(("Unknown shift operator: " + (com.google.javascript.rhino.Node.tokenToName(n.getType()))));
			}
			com.google.javascript.rhino.Node newNumber = com.google.javascript.rhino.Node.newNumber(result);
			n.getParent().replaceChild(n, newNumber);
			reportCodeChange();
			return newNumber;
		}
		return n;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.rhino.Node tryFoldComparison(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		boolean leftLiteral = com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, true);
		boolean rightLiteral = com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, true);
		if ((!leftLiteral) || (!rightLiteral)) {
			if (((n.getType()) != (com.google.javascript.rhino.Token.GT)) && ((n.getType()) != (com.google.javascript.rhino.Token.LT))) {
				return n;
			}
		}
		int op = n.getType();
		boolean result;
		boolean undefinedRight = (com.google.javascript.jscomp.NodeUtil.isUndefined(right)) && rightLiteral;
		boolean nullRight = com.google.javascript.jscomp.NodeUtil.isNull(right);
		int lhType = getNormalizedNodeType(left);
		int rhType = getNormalizedNodeType(right);
		switch (lhType) {
			case com.google.javascript.rhino.Token.VOID :
				if (!leftLiteral) {
					return n;
				}else
					if (!rightLiteral) {
						return n;
					}else {
						result = compareToUndefined(right, op);
					}
				
				break;
			case com.google.javascript.rhino.Token.NULL :
				if (rightLiteral && (isEqualityOp(op))) {
					result = compareToNull(right, op);
					break;
				}
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				if (undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				if (((rhType != (com.google.javascript.rhino.Token.TRUE)) && (rhType != (com.google.javascript.rhino.Token.FALSE))) && (rhType != (com.google.javascript.rhino.Token.NULL))) {
					return n;
				}
				switch (op) {
					case com.google.javascript.rhino.Token.SHEQ :
					case com.google.javascript.rhino.Token.EQ :
						result = lhType == rhType;
						break;
					case com.google.javascript.rhino.Token.SHNE :
					case com.google.javascript.rhino.Token.NE :
						result = lhType != rhType;
						break;
					case com.google.javascript.rhino.Token.GE :
					case com.google.javascript.rhino.Token.LE :
					case com.google.javascript.rhino.Token.GT :
					case com.google.javascript.rhino.Token.LT :
						java.lang.Boolean compareResult = compareAsNumbers(op, left, right);
						if (compareResult != null) {
							result = compareResult;
						}else {
							return n;
						}
						break;
					default :
						return n;
				}
				break;
			case com.google.javascript.rhino.Token.THIS :
				if ((right.getType()) != (com.google.javascript.rhino.Token.THIS)) {
					return n;
				}
				switch (op) {
					case com.google.javascript.rhino.Token.SHEQ :
					case com.google.javascript.rhino.Token.EQ :
						result = true;
						break;
					case com.google.javascript.rhino.Token.SHNE :
					case com.google.javascript.rhino.Token.NE :
						result = false;
						break;
					default :
						return n;
				}
				break;
			case com.google.javascript.rhino.Token.STRING :
				if (undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				if (nullRight && (isEqualityOp(op))) {
					result = compareToNull(left, op);
					break;
				}
				if ((com.google.javascript.rhino.Token.STRING) != (right.getType())) {
					return n;
				}
				switch (op) {
					case com.google.javascript.rhino.Token.SHEQ :
					case com.google.javascript.rhino.Token.EQ :
						result = left.getString().equals(right.getString());
						break;
					case com.google.javascript.rhino.Token.SHNE :
					case com.google.javascript.rhino.Token.NE :
						result = !(left.getString().equals(right.getString()));
						break;
					default :
						return n;
				}
				break;
			case com.google.javascript.rhino.Token.NUMBER :
				if (undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				if (nullRight && (isEqualityOp(op))) {
					result = compareToNull(left, op);
					break;
				}
				if ((com.google.javascript.rhino.Token.NUMBER) != (right.getType())) {
					return n;
				}
				java.lang.Boolean compareResult = compareAsNumbers(op, left, right);
				if (compareResult != null) {
					result = compareResult;
				}else {
					return null;
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				if (leftLiteral && undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				if (rightLiteral) {
					boolean undefinedLeft = left.getString().equals("undefined");
					if (undefinedLeft) {
						result = compareToUndefined(right, op);
						break;
					}
					if ((leftLiteral && nullRight) && (isEqualityOp(op))) {
						result = compareToNull(left, op);
						break;
					}
				}
				if ((com.google.javascript.rhino.Token.NAME) != (right.getType())) {
					return n;
				}
				java.lang.String ln = left.getString();
				java.lang.String rn = right.getString();
				if (!(ln.equals(rn))) {
					return n;
				}
				switch (op) {
					case com.google.javascript.rhino.Token.LT :
					case com.google.javascript.rhino.Token.GT :
						result = false;
						break;
					default :
						return n;
				}
				break;
			case com.google.javascript.rhino.Token.NEG :
				if (leftLiteral) {
					if (undefinedRight) {
						result = compareToUndefined(left, op);
						break;
					}
					if (nullRight && (isEqualityOp(op))) {
						result = compareToNull(left, op);
						break;
					}
				}
				return n;
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.OBJECTLIT :
			case com.google.javascript.rhino.Token.REGEXP :
			case com.google.javascript.rhino.Token.FUNCTION :
				if (leftLiteral) {
					if (undefinedRight) {
						result = compareToUndefined(left, op);
						break;
					}
					if (nullRight && (isEqualityOp(op))) {
						result = compareToNull(left, op);
						break;
					}
				}
				return n;
			default :
				return n;
		}
		com.google.javascript.rhino.Node newNode = new com.google.javascript.rhino.Node((result ? com.google.javascript.rhino.Token.TRUE : com.google.javascript.rhino.Token.FALSE));
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
	}

	private int getNormalizedNodeType(com.google.javascript.rhino.Node n) {
		int type = n.getType();
		if (type == (com.google.javascript.rhino.Token.NOT)) {
			com.google.javascript.rhino.jstype.TernaryValue value = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n);
			switch (value) {
				case TRUE :
					return com.google.javascript.rhino.Token.TRUE;
				case FALSE :
					return com.google.javascript.rhino.Token.FALSE;
			}
		}
		return type;
	}

	private java.lang.Boolean compareAsNumbers(int op, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		java.lang.Double leftValue = com.google.javascript.jscomp.NodeUtil.getNumberValue(left);
		if (leftValue == null) {
			return null;
		}
		java.lang.Double rightValue = com.google.javascript.jscomp.NodeUtil.getNumberValue(right);
		if (rightValue == null) {
			return null;
		}
		double lv = leftValue;
		double rv = rightValue;
		java.lang.Boolean result;
		switch (op) {
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.EQ :
				com.google.common.base.Preconditions.checkState((((left.getType()) == (com.google.javascript.rhino.Token.NUMBER)) && ((right.getType()) == (com.google.javascript.rhino.Token.NUMBER))));
				result = lv == rv;
				break;
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.NE :
				com.google.common.base.Preconditions.checkState((((left.getType()) == (com.google.javascript.rhino.Token.NUMBER)) && ((right.getType()) == (com.google.javascript.rhino.Token.NUMBER))));
				result = lv != rv;
				break;
			case com.google.javascript.rhino.Token.LE :
				result = lv <= rv;
				break;
			case com.google.javascript.rhino.Token.LT :
				result = lv < rv;
				break;
			case com.google.javascript.rhino.Token.GE :
				result = lv >= rv;
				break;
			case com.google.javascript.rhino.Token.GT :
				result = lv > rv;
				break;
			default :
				return null;
		}
		return result;
	}

	private boolean compareToUndefined(com.google.javascript.rhino.Node value, int op) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isLiteralValue(value, true));
		boolean valueUndefined = com.google.javascript.jscomp.NodeUtil.isUndefined(value);
		boolean valueNull = (com.google.javascript.rhino.Token.NULL) == (value.getType());
		boolean equivalent = valueUndefined || valueNull;
		switch (op) {
			case com.google.javascript.rhino.Token.EQ :
				return equivalent;
			case com.google.javascript.rhino.Token.NE :
				return !equivalent;
			case com.google.javascript.rhino.Token.SHEQ :
				return valueUndefined;
			case com.google.javascript.rhino.Token.SHNE :
				return !valueUndefined;
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GE :
				return false;
			default :
				throw new java.lang.IllegalStateException("unexpected.");
		}
	}

	private boolean isEqualityOp(int op) {
		switch (op) {
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
				return true;
		}
		return false;
	}

	private boolean compareToNull(com.google.javascript.rhino.Node value, int op) {
		boolean valueUndefined = com.google.javascript.jscomp.NodeUtil.isUndefined(value);
		boolean valueNull = (com.google.javascript.rhino.Token.NULL) == (value.getType());
		boolean equivalent = valueUndefined || valueNull;
		switch (op) {
			case com.google.javascript.rhino.Token.EQ :
				return equivalent;
			case com.google.javascript.rhino.Token.NE :
				return !equivalent;
			case com.google.javascript.rhino.Token.SHEQ :
				return valueNull;
			case com.google.javascript.rhino.Token.SHNE :
				return !valueNull;
			default :
				throw new java.lang.IllegalStateException("unexpected.");
		}
	}

	private com.google.javascript.rhino.Node tryFoldCtorCall(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.NEW)));
		if (inForcedStringContext(n)) {
			return tryFoldInForcedStringContext(n);
		}
		return n;
	}

	private boolean inForcedStringContext(com.google.javascript.rhino.Node n) {
		return ((n.getParent().getType()) == (com.google.javascript.rhino.Token.GETELEM)) && ((n.getParent().getLastChild()) == n);
	}

	private com.google.javascript.rhino.Node tryFoldInForcedStringContext(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.NEW)));
		com.google.javascript.rhino.Node objectType = n.getFirstChild();
		if ((objectType.getType()) != (com.google.javascript.rhino.Token.NAME)) {
			return n;
		}
		if (objectType.getString().equals("String")) {
			com.google.javascript.rhino.Node value = objectType.getNext();
			java.lang.String stringValue = null;
			if (value == null) {
				stringValue = "";
			}else {
				if (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(value))) {
					return n;
				}
				stringValue = com.google.javascript.jscomp.NodeUtil.getStringValue(value);
			}
			if (stringValue == null) {
				return n;
			}
			com.google.javascript.rhino.Node parent = n.getParent();
			com.google.javascript.rhino.Node newString = com.google.javascript.rhino.Node.newString(stringValue);
			parent.replaceChild(n, newString);
			newString.copyInformationFrom(parent);
			reportCodeChange();
			return newString;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldGetElem(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.GETELEM)));
		if ((left.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
			return tryFoldObjectPropAccess(n, left, right);
		}
		if ((left.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT)) {
			return tryFoldArrayAccess(n, left, right);
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldGetProp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)));
		if ((left.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
			return tryFoldObjectPropAccess(n, left, right);
		}
		if (((right.getType()) == (com.google.javascript.rhino.Token.STRING)) && (right.getString().equals("length"))) {
			int knownLength = -1;
			switch (left.getType()) {
				case com.google.javascript.rhino.Token.ARRAYLIT :
					if (mayHaveSideEffects(left)) {
						return n;
					}
					knownLength = left.getChildCount();
					break;
				case com.google.javascript.rhino.Token.STRING :
					knownLength = left.getString().length();
					break;
				default :
					return n;
			}
			com.google.common.base.Preconditions.checkState((knownLength != (-1)));
			com.google.javascript.rhino.Node lengthNode = com.google.javascript.rhino.Node.newNumber(knownLength);
			n.getParent().replaceChild(n, lengthNode);
			reportCodeChange();
			return lengthNode;
		}
		return n;
	}

	private boolean isAssignmentTarget(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if ((((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == n)) || ((parent.getType()) == (com.google.javascript.rhino.Token.INC))) || ((parent.getType()) == (com.google.javascript.rhino.Token.DEC))) {
			return true;
		}
		return false;
	}

	private com.google.javascript.rhino.Node tryFoldArrayAccess(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if (isAssignmentTarget(n)) {
			return n;
		}
		if ((right.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
			return n;
		}
		double index = right.getDouble();
		int intIndex = ((int) (index));
		if (intIndex != index) {
			error(com.google.javascript.jscomp.PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR, right);
			return n;
		}
		if (intIndex < 0) {
			error(com.google.javascript.jscomp.PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR, right);
			return n;
		}
		com.google.javascript.rhino.Node elem = left.getFirstChild();
		for (int i = 0; (elem != null) && (i < intIndex); i++) {
			elem = elem.getNext();
		}
		if (elem == null) {
			error(com.google.javascript.jscomp.PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR, right);
			return n;
		}
		if ((elem.getType()) == (com.google.javascript.rhino.Token.EMPTY)) {
			elem = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(elem);
		}else {
			left.removeChild(elem);
		}
		n.getParent().replaceChild(n, elem);
		reportCodeChange();
		return elem;
	}

	private com.google.javascript.rhino.Node tryFoldObjectPropAccess(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isGet(n));
		if (((left.getType()) != (com.google.javascript.rhino.Token.OBJECTLIT)) || ((right.getType()) != (com.google.javascript.rhino.Token.STRING))) {
			return n;
		}
		if (isAssignmentTarget(n)) {
			return n;
		}
		com.google.javascript.rhino.Node key = null;
		com.google.javascript.rhino.Node value = null;
		for (com.google.javascript.rhino.Node c = left.getFirstChild(); c != null; c = c.getNext()) {
			if (c.getString().equals(right.getString())) {
				switch (c.getType()) {
					case com.google.javascript.rhino.Token.SET :
						continue;
					case com.google.javascript.rhino.Token.GET :
					case com.google.javascript.rhino.Token.STRING :
						if ((value != null) && (mayHaveSideEffects(value))) {
							return n;
						}
						key = c;
						value = key.getFirstChild();
						break;
					default :
						throw new java.lang.IllegalStateException();
				}
			}else
				if (mayHaveSideEffects(c.getFirstChild())) {
					return n;
				}
			
		}
		if (value == null) {
			return n;
		}
		if (((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && (com.google.javascript.jscomp.NodeUtil.referencesThis(value))) {
			return n;
		}
		com.google.javascript.rhino.Node replacement = value.detachFromParent();
		if ((key.getType()) == (com.google.javascript.rhino.Token.GET)) {
			replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, replacement);
			replacement.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		}
		n.getParent().replaceChild(n, replacement);
		reportCodeChange();
		return n;
	}
}

