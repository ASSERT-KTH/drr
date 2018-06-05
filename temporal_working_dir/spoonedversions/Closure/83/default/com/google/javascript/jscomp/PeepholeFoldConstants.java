

package com.google.javascript.jscomp;


class PeepholeFoldConstants extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	static final com.google.javascript.jscomp.DiagnosticType DIVIDE_BY_0_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_DIVIDE_BY_0_ERROR", "Divide by 0");

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
			case com.google.javascript.rhino.Token.CALL :
				return tryFoldKnownMethods(subtree);
			case com.google.javascript.rhino.Token.NEW :
				return tryFoldCtorCall(subtree);
			case com.google.javascript.rhino.Token.TYPEOF :
				return tryFoldTypeof(subtree);
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.BITNOT :
				return tryFoldUnaryOperator(subtree);
			default :
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
		com.google.javascript.rhino.jstype.TernaryValue leftVal = com.google.javascript.jscomp.NodeUtil.getBooleanValue(left);
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
		com.google.javascript.rhino.jstype.TernaryValue leftVal = com.google.javascript.jscomp.NodeUtil.getBooleanValue(left);
		if (leftVal != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
			boolean lval = leftVal.toBoolean(true);
			if ((lval && (type == (com.google.javascript.rhino.Token.OR))) || ((!lval) && (type == (com.google.javascript.rhino.Token.AND)))) {
				result = left;
			}else {
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

	private com.google.javascript.rhino.Node tryFoldLeftChildAdd(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if (((com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false)) && ((left.getType()) == (com.google.javascript.rhino.Token.ADD))) && ((left.getChildCount()) == 2)) {
			com.google.javascript.rhino.Node ll = left.getFirstChild();
			com.google.javascript.rhino.Node lr = ll.getNext();
			if ((lr.getType()) != (com.google.javascript.rhino.Token.STRING)) {
				return n;
			}
			java.lang.String leftString = com.google.javascript.jscomp.NodeUtil.getStringValue(lr);
			java.lang.String rightString = com.google.javascript.jscomp.NodeUtil.getStringValue(right);
			if ((leftString != null) && (rightString != null)) {
				left.removeChild(ll);
				java.lang.String result = leftString + rightString;
				n.replaceChild(left, ll);
				n.replaceChild(right, com.google.javascript.rhino.Node.newString(result));
				reportCodeChange();
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAddConstant(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if (((left.getType()) == (com.google.javascript.rhino.Token.STRING)) || ((right.getType()) == (com.google.javascript.rhino.Token.STRING))) {
			java.lang.String leftString = com.google.javascript.jscomp.NodeUtil.getStringValue(left);
			java.lang.String rightString = com.google.javascript.jscomp.NodeUtil.getStringValue(right);
			if ((leftString != null) && (rightString != null)) {
				com.google.javascript.rhino.Node newStringNode = com.google.javascript.rhino.Node.newString((leftString + rightString));
				n.getParent().replaceChild(n, newStringNode);
				reportCodeChange();
				return newStringNode;
			}
		}else {
			return tryFoldArithmeticOp(n, left, right);
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldArithmeticOp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.javascript.rhino.Node result = performArithmeticOp(n.getType(), left, right);
		if (result != null) {
			n.getParent().replaceChild(n, result);
			reportCodeChange();
			return result;
		}
		return n;
	}

	private com.google.javascript.rhino.Node performArithmeticOp(int opType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		if ((opType == (com.google.javascript.rhino.Token.ADD)) && (((left.getType()) != (com.google.javascript.rhino.Token.NUMBER)) || ((right.getType()) != (com.google.javascript.rhino.Token.NUMBER)))) {
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
				if (!(areValidInts(lval, rval))) {
					return null;
				}
				result = ((int) (lval)) & ((int) (rval));
				break;
			case com.google.javascript.rhino.Token.BITOR :
				if (!(areValidInts(lval, rval))) {
					return null;
				}
				result = ((int) (lval)) | ((int) (rval));
				break;
			case com.google.javascript.rhino.Token.BITXOR :
				if (!(areValidInts(lval, rval))) {
					return null;
				}
				result = ((int) (lval)) ^ ((int) (rval));
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
					error(com.google.javascript.jscomp.PeepholeFoldConstants.DIVIDE_BY_0_ERROR, right);
					return null;
				}
				result = lval % rval;
				break;
			case com.google.javascript.rhino.Token.DIV :
				if (rval == 0) {
					error(com.google.javascript.jscomp.PeepholeFoldConstants.DIVIDE_BY_0_ERROR, right);
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

	private boolean isValidInt(double val) {
		return (!((val < (java.lang.Integer.MIN_VALUE)) || (val > (java.lang.Integer.MAX_VALUE)))) && (val == ((int) (val)));
	}

	private boolean areValidInts(double val1, double val2) {
		return (isValidInt(val1)) && (isValidInt(val2));
	}

	private com.google.javascript.rhino.Node tryFoldLeftChildOp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		int opType = n.getType();
		com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.NodeUtil.isAssociative(opType)) && (com.google.javascript.jscomp.NodeUtil.isCommutative(opType))));
		if (((right.getType()) == (com.google.javascript.rhino.Token.NUMBER)) && ((left.getType()) == opType)) {
			com.google.common.base.Preconditions.checkState(((left.getChildCount()) == 2));
			com.google.javascript.rhino.Node ll = left.getFirstChild();
			com.google.javascript.rhino.Node lr = ll.getNext();
			com.google.javascript.rhino.Node valueToCombine;
			if ((ll.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
				valueToCombine = ll;
			}else
				if ((lr.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
					valueToCombine = lr;
				}else {
					return n;
				}
			
			com.google.javascript.rhino.Node replacement = performArithmeticOp(opType, valueToCombine, right);
			if (replacement != null) {
				left.removeChild(valueToCombine);
				n.replaceChild(left, left.removeFirstChild());
				n.replaceChild(right, replacement);
				reportCodeChange();
			}
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldAdd(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.ADD)));
		if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, false)) && (com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false))) {
			return tryFoldAddConstant(node, left, right);
		}else {
			return tryFoldLeftChildAdd(node, left, right);
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
		if ((!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(left, false))) || (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false)))) {
			if (((n.getType()) != (com.google.javascript.rhino.Token.GT)) && ((n.getType()) != (com.google.javascript.rhino.Token.LT))) {
				return n;
			}
		}
		int op = n.getType();
		boolean result;
		boolean rightLiteral = com.google.javascript.jscomp.NodeUtil.isLiteralValue(right, false);
		boolean undefinedRight = (((com.google.javascript.rhino.Token.NAME) == (right.getType())) && (right.getString().equals("undefined"))) || (((com.google.javascript.rhino.Token.VOID) == (right.getType())) && (com.google.javascript.jscomp.NodeUtil.isLiteralValue(right.getFirstChild(), false)));
		switch (left.getType()) {
			case com.google.javascript.rhino.Token.VOID :
				if (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(left.getFirstChild(), false))) {
					return n;
				}else
					if (!rightLiteral) {
						return n;
					}else {
						result = compareToUndefined(right, op);
					}
				
				break;
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				if (undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				int rhType = right.getType();
				if (((rhType != (com.google.javascript.rhino.Token.TRUE)) && (rhType != (com.google.javascript.rhino.Token.FALSE))) && (rhType != (com.google.javascript.rhino.Token.NULL))) {
					return n;
				}
				switch (op) {
					case com.google.javascript.rhino.Token.SHEQ :
					case com.google.javascript.rhino.Token.EQ :
						result = (left.getType()) == (right.getType());
						break;
					case com.google.javascript.rhino.Token.SHNE :
					case com.google.javascript.rhino.Token.NE :
						result = (left.getType()) != (right.getType());
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
				if (undefinedRight) {
					result = compareToUndefined(left, op);
					break;
				}
				if (rightLiteral) {
					boolean undefinedLeft = left.getString().equals("undefined");
					if (undefinedLeft) {
						result = compareToUndefined(right, op);
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
			default :
				return n;
		}
		com.google.javascript.rhino.Node newNode = new com.google.javascript.rhino.Node((result ? com.google.javascript.rhino.Token.TRUE : com.google.javascript.rhino.Token.FALSE));
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
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
		boolean valueUndefined = (((com.google.javascript.rhino.Token.NAME) == (value.getType())) && (value.getString().equals("undefined"))) || (((com.google.javascript.rhino.Token.VOID) == (value.getType())) && (com.google.javascript.jscomp.NodeUtil.isLiteralValue(value.getFirstChild(), false)));
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

	private com.google.javascript.rhino.Node tryFoldKnownMethods(com.google.javascript.rhino.Node subtree) {
		subtree = tryFoldArrayJoin(subtree);
		if ((subtree.getType()) == (com.google.javascript.rhino.Token.CALL)) {
			subtree = tryFoldKnownStringMethods(subtree);
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldKnownStringMethods(com.google.javascript.rhino.Node subtree) {
		com.google.common.base.Preconditions.checkArgument(((subtree.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.javascript.rhino.Node callTarget = subtree.getFirstChild();
		if (callTarget == null) {
			return subtree;
		}
		com.google.javascript.rhino.Node firstArg = callTarget.getNext();
		if (firstArg == null) {
			return subtree;
		}
		if ((!(com.google.javascript.jscomp.NodeUtil.isGet(callTarget))) || (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(firstArg)))) {
			return subtree;
		}
		com.google.javascript.rhino.Node stringNode = callTarget.getFirstChild();
		com.google.javascript.rhino.Node functionName = stringNode.getNext();
		if (((stringNode.getType()) != (com.google.javascript.rhino.Token.STRING)) || ((functionName.getType()) != (com.google.javascript.rhino.Token.STRING))) {
			return subtree;
		}
		java.lang.String functionNameString = functionName.getString();
		if ((functionNameString.equals("indexOf")) || (functionNameString.equals("lastIndexOf"))) {
			subtree = tryFoldStringIndexOf(subtree, functionNameString, stringNode, firstArg);
		}else
			if (functionNameString.equals("substr")) {
				subtree = tryFoldStringSubstr(subtree, stringNode, firstArg);
			}else
				if (functionNameString.equals("substring")) {
					subtree = tryFoldStringSubstring(subtree, stringNode, firstArg);
				}
			
		
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldStringIndexOf(com.google.javascript.rhino.Node n, java.lang.String functionName, com.google.javascript.rhino.Node lstringNode, com.google.javascript.rhino.Node firstArg) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((lstringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		java.lang.String lstring = com.google.javascript.jscomp.NodeUtil.getStringValue(lstringNode);
		boolean isIndexOf = functionName.equals("indexOf");
		com.google.javascript.rhino.Node secondArg = firstArg.getNext();
		java.lang.String searchValue = com.google.javascript.jscomp.NodeUtil.getStringValue(firstArg);
		if (searchValue == null) {
			return n;
		}
		int fromIndex = isIndexOf ? 0 : lstring.length();
		if (secondArg != null) {
			if (((secondArg.getNext()) != null) || ((secondArg.getType()) != (com.google.javascript.rhino.Token.NUMBER))) {
				return n;
			}else {
				fromIndex = ((int) (secondArg.getDouble()));
			}
		}
		int indexVal = isIndexOf ? lstring.indexOf(searchValue, fromIndex) : lstring.lastIndexOf(searchValue, fromIndex);
		com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.Node.newNumber(indexVal);
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
	}

	private com.google.javascript.rhino.Node tryFoldArrayJoin(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		if (callTarget == null) {
			return n;
		}
		com.google.javascript.rhino.Node right = callTarget.getNext();
		if (right == null) {
			return n;
		}
		if ((!(com.google.javascript.jscomp.NodeUtil.isGetProp(callTarget))) || (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(right)))) {
			return n;
		}
		com.google.javascript.rhino.Node arrayNode = callTarget.getFirstChild();
		com.google.javascript.rhino.Node functionName = arrayNode.getNext();
		if (((arrayNode.getType()) != (com.google.javascript.rhino.Token.ARRAYLIT)) || (!(functionName.getString().equals("join")))) {
			return n;
		}
		java.lang.String joinString = com.google.javascript.jscomp.NodeUtil.getStringValue(right);
		java.util.List<com.google.javascript.rhino.Node> arrayFoldedChildren = com.google.common.collect.Lists.newLinkedList();
		java.lang.StringBuilder sb = null;
		int foldedSize = 0;
		com.google.javascript.rhino.Node prev = null;
		com.google.javascript.rhino.Node elem = arrayNode.getFirstChild();
		while (elem != null) {
			if (com.google.javascript.jscomp.NodeUtil.isImmutableValue(elem)) {
				if (sb == null) {
					sb = new java.lang.StringBuilder();
				}else {
					sb.append(joinString);
				}
				sb.append(com.google.javascript.jscomp.NodeUtil.getStringValue(elem));
			}else {
				if (sb != null) {
					com.google.common.base.Preconditions.checkNotNull(prev);
					foldedSize += (sb.length()) + 2;
					arrayFoldedChildren.add(com.google.javascript.rhino.Node.newString(sb.toString()).copyInformationFrom(prev));
					sb = null;
				}
				foldedSize += com.google.javascript.jscomp.InlineCostEstimator.getCost(elem);
				arrayFoldedChildren.add(elem);
			}
			prev = elem;
			elem = elem.getNext();
		} 
		if (sb != null) {
			com.google.common.base.Preconditions.checkNotNull(prev);
			foldedSize += (sb.length()) + 2;
			arrayFoldedChildren.add(com.google.javascript.rhino.Node.newString(sb.toString()).copyInformationFrom(prev));
		}
		foldedSize += (arrayFoldedChildren.size()) - 1;
		int originalSize = com.google.javascript.jscomp.InlineCostEstimator.getCost(n);
		switch (arrayFoldedChildren.size()) {
			case 0 :
				com.google.javascript.rhino.Node emptyStringNode = com.google.javascript.rhino.Node.newString("");
				n.getParent().replaceChild(n, emptyStringNode);
				reportCodeChange();
				return emptyStringNode;
			case 1 :
				com.google.javascript.rhino.Node foldedStringNode = arrayFoldedChildren.remove(0);
				if (foldedSize > originalSize) {
					return n;
				}
				arrayNode.detachChildren();
				if ((foldedStringNode.getType()) != (com.google.javascript.rhino.Token.STRING)) {
					com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ADD, com.google.javascript.rhino.Node.newString("").copyInformationFrom(right), foldedStringNode);
					foldedStringNode = replacement;
				}
				n.getParent().replaceChild(n, foldedStringNode);
				reportCodeChange();
				return foldedStringNode;
			default :
				if ((arrayFoldedChildren.size()) == (arrayNode.getChildCount())) {
					return n;
				}
				int kJoinOverhead = "[].join()".length();
				foldedSize += kJoinOverhead;
				foldedSize += com.google.javascript.jscomp.InlineCostEstimator.getCost(right);
				if (foldedSize > originalSize) {
					return n;
				}
				arrayNode.detachChildren();
				for (com.google.javascript.rhino.Node node : arrayFoldedChildren) {
					arrayNode.addChildToBack(node);
				}
				reportCodeChange();
				break;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldStringSubstr(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int start;
		int length;
		java.lang.String stringAsString = stringNode.getString();
		if ((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
			start = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		com.google.javascript.rhino.Node arg2 = arg1.getNext();
		if (arg2 != null) {
			if ((arg2.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
				length = ((int) (arg2.getDouble()));
			}else {
				return n;
			}
			if ((arg2.getNext()) != null) {
				return n;
			}
		}else {
			length = (stringAsString.length()) - start;
		}
		if ((((start + length) > (stringAsString.length())) || (length < 0)) || (start < 0)) {
			return n;
		}
		java.lang.String result = stringAsString.substring(start, (start + length));
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newString(result);
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}

	private com.google.javascript.rhino.Node tryFoldStringSubstring(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int start;
		int end;
		java.lang.String stringAsString = stringNode.getString();
		if ((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
			start = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		com.google.javascript.rhino.Node arg2 = arg1.getNext();
		if (arg2 != null) {
			if ((arg2.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
				end = ((int) (arg2.getDouble()));
			}else {
				return n;
			}
			if ((arg2.getNext()) != null) {
				return n;
			}
		}else {
			end = stringAsString.length();
		}
		if ((((end > (stringAsString.length())) || (start > (stringAsString.length()))) || (end < 0)) || (start < 0)) {
			return n;
		}
		java.lang.String result = stringAsString.substring(start, end);
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newString(result);
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}

	private com.google.javascript.rhino.Node tryFoldGetElem(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.GETELEM)));
		if ((left.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT)) {
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
			left.removeChild(elem);
			n.getParent().replaceChild(n, elem);
			reportCodeChange();
			return elem;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldGetProp(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)));
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
}

