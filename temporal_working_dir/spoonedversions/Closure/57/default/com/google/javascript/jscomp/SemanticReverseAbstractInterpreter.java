

package com.google.javascript.jscomp;


class SemanticReverseAbstractInterpreter extends com.google.javascript.jscomp.ChainableReverseAbstractInterpreter {
	private static final com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> EQ = new com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType.TypePair apply(com.google.javascript.rhino.jstype.JSType.TypePair p) {
			if (((p.typeA) == null) || ((p.typeB) == null)) {
				return null;
			}
			return p.typeA.getTypesUnderEquality(p.typeB);
		}
	};

	private static final com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> NE = new com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType.TypePair apply(com.google.javascript.rhino.jstype.JSType.TypePair p) {
			if (((p.typeA) == null) || ((p.typeB) == null)) {
				return null;
			}
			return p.typeA.getTypesUnderInequality(p.typeB);
		}
	};

	private static final com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> SHEQ = new com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType.TypePair apply(com.google.javascript.rhino.jstype.JSType.TypePair p) {
			if (((p.typeA) == null) || ((p.typeB) == null)) {
				return null;
			}
			return p.typeA.getTypesUnderShallowEquality(p.typeB);
		}
	};

	private static final com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> SHNE = new com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType.TypePair apply(com.google.javascript.rhino.jstype.JSType.TypePair p) {
			if (((p.typeA) == null) || ((p.typeB) == null)) {
				return null;
			}
			return p.typeA.getTypesUnderShallowInequality(p.typeB);
		}
	};

	private final com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> INEQ = new com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType.TypePair apply(com.google.javascript.rhino.jstype.JSType.TypePair p) {
			return new com.google.javascript.rhino.jstype.JSType.TypePair(getRestrictedWithoutUndefined(p.typeA), getRestrictedWithoutUndefined(p.typeB));
		}
	};

	SemanticReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention convention, com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry) {
		super(convention, typeRegistry);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.FlowScope getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.FlowScope blindScope, boolean outcome) {
		int operatorToken = condition.getType();
		switch (operatorToken) {
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.CASE :
				com.google.javascript.rhino.Node left;
				com.google.javascript.rhino.Node right;
				if (operatorToken == (com.google.javascript.rhino.Token.CASE)) {
					left = condition.getParent().getFirstChild();
					right = condition.getFirstChild();
				}else {
					left = condition.getFirstChild();
					right = condition.getLastChild();
				}
				com.google.javascript.rhino.Node typeOfNode = null;
				com.google.javascript.rhino.Node stringNode = null;
				if (((left.getType()) == (com.google.javascript.rhino.Token.TYPEOF)) && ((right.getType()) == (com.google.javascript.rhino.Token.STRING))) {
					typeOfNode = left;
					stringNode = right;
				}else
					if (((right.getType()) == (com.google.javascript.rhino.Token.TYPEOF)) && ((left.getType()) == (com.google.javascript.rhino.Token.STRING))) {
						typeOfNode = right;
						stringNode = left;
					}
				
				if ((typeOfNode != null) && (stringNode != null)) {
					com.google.javascript.rhino.Node operandNode = typeOfNode.getFirstChild();
					com.google.javascript.rhino.jstype.JSType operandType = getTypeIfRefinable(operandNode, blindScope);
					if (operandType != null) {
						boolean resultEqualsValue = ((operatorToken == (com.google.javascript.rhino.Token.EQ)) || (operatorToken == (com.google.javascript.rhino.Token.SHEQ))) || (operatorToken == (com.google.javascript.rhino.Token.CASE));
						if (!outcome) {
							resultEqualsValue = !resultEqualsValue;
						}
						return caseTypeOf(operandNode, operandType, stringNode.getString(), resultEqualsValue, blindScope);
					}
				}
		}
		switch (operatorToken) {
			case com.google.javascript.rhino.Token.AND :
				if (outcome) {
					return caseAndOrNotShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, true);
				}else {
					return caseAndOrMaybeShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, true);
				}
			case com.google.javascript.rhino.Token.OR :
				if (!outcome) {
					return caseAndOrNotShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, false);
				}else {
					return caseAndOrMaybeShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, false);
				}
			case com.google.javascript.rhino.Token.EQ :
				if (outcome) {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.EQ);
				}else {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.NE);
				}
			case com.google.javascript.rhino.Token.NE :
				if (outcome) {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.NE);
				}else {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.EQ);
				}
			case com.google.javascript.rhino.Token.SHEQ :
				if (outcome) {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHEQ);
				}else {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHNE);
				}
			case com.google.javascript.rhino.Token.SHNE :
				if (outcome) {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHNE);
				}else {
					return caseEquality(condition, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHEQ);
				}
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
				return caseNameOrGetProp(condition, blindScope, outcome);
			case com.google.javascript.rhino.Token.ASSIGN :
				return firstPreciserScopeKnowingConditionOutcome(condition.getFirstChild(), firstPreciserScopeKnowingConditionOutcome(condition.getFirstChild().getNext(), blindScope, outcome), outcome);
			case com.google.javascript.rhino.Token.NOT :
				return firstPreciserScopeKnowingConditionOutcome(condition.getFirstChild(), blindScope, (!outcome));
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.GT :
				if (outcome) {
					return caseEquality(condition, blindScope, INEQ);
				}
				break;
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return caseInstanceOf(condition.getFirstChild(), condition.getLastChild(), blindScope, outcome);
			case com.google.javascript.rhino.Token.IN :
				if (outcome && ((condition.getFirstChild().getType()) == (com.google.javascript.rhino.Token.STRING))) {
					return caseIn(condition.getLastChild(), condition.getFirstChild().getString(), blindScope);
				}
				break;
			case com.google.javascript.rhino.Token.CASE :
				com.google.javascript.rhino.Node left = condition.getParent().getFirstChild();
				com.google.javascript.rhino.Node right = condition.getFirstChild();
				if (outcome) {
					return caseEquality(left, right, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHEQ);
				}else {
					return caseEquality(left, right, blindScope, com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.SHNE);
				}
		}
		return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
	}

	private com.google.javascript.jscomp.FlowScope caseEquality(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.FlowScope blindScope, com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> merging) {
		return caseEquality(condition.getFirstChild(), condition.getLastChild(), blindScope, merging);
	}

	private com.google.javascript.jscomp.FlowScope caseEquality(com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, com.google.javascript.jscomp.FlowScope blindScope, com.google.common.base.Function<com.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair> merging) {
		com.google.javascript.rhino.jstype.JSType leftType = getTypeIfRefinable(left, blindScope);
		boolean leftIsRefineable;
		if (leftType != null) {
			leftIsRefineable = true;
		}else {
			leftIsRefineable = false;
			leftType = left.getJSType();
		}
		com.google.javascript.rhino.jstype.JSType rightType = getTypeIfRefinable(right, blindScope);
		boolean rightIsRefineable;
		if (rightType != null) {
			rightIsRefineable = true;
		}else {
			rightIsRefineable = false;
			rightType = right.getJSType();
		}
		com.google.javascript.rhino.jstype.JSType.TypePair merged = merging.apply(new com.google.javascript.rhino.jstype.JSType.TypePair(leftType, rightType));
		if ((merged != null) && ((leftIsRefineable && ((merged.typeA) != null)) || (rightIsRefineable && ((merged.typeB) != null)))) {
			com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
			if (leftIsRefineable && ((merged.typeA) != null)) {
				declareNameInScope(informed, left, merged.typeA);
			}
			if (rightIsRefineable && ((merged.typeB) != null)) {
				declareNameInScope(informed, right, merged.typeB);
			}
			return informed;
		}
		return blindScope;
	}

	private com.google.javascript.jscomp.FlowScope caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, com.google.javascript.jscomp.FlowScope blindScope, boolean condition) {
		com.google.javascript.rhino.jstype.JSType leftType = getTypeIfRefinable(left, blindScope);
		boolean leftIsRefineable;
		if (leftType != null) {
			leftIsRefineable = true;
		}else {
			leftIsRefineable = false;
			leftType = left.getJSType();
			blindScope = firstPreciserScopeKnowingConditionOutcome(left, blindScope, condition);
		}
		leftType = (leftType == null) ? null : leftType.getRestrictedTypeGivenToBooleanOutcome(condition);
		if (leftType == null) {
			return firstPreciserScopeKnowingConditionOutcome(right, blindScope, condition);
		}
		com.google.javascript.rhino.jstype.JSType rightType = getTypeIfRefinable(right, blindScope);
		boolean rightIsRefineable;
		if (rightType != null) {
			rightIsRefineable = true;
		}else {
			rightIsRefineable = false;
			rightType = right.getJSType();
			blindScope = firstPreciserScopeKnowingConditionOutcome(right, blindScope, condition);
		}
		if (condition) {
			rightType = (rightType == null) ? null : rightType.getRestrictedTypeGivenToBooleanOutcome(condition);
			if (((leftType != null) && leftIsRefineable) || ((rightType != null) && rightIsRefineable)) {
				com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
				if (leftIsRefineable && (leftType != null)) {
					declareNameInScope(informed, left, leftType);
				}
				if (rightIsRefineable && (rightType != null)) {
					declareNameInScope(informed, right, rightType);
				}
				return informed;
			}
		}
		return blindScope;
	}

	private com.google.javascript.jscomp.FlowScope caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, com.google.javascript.jscomp.FlowScope blindScope, boolean condition) {
		com.google.javascript.jscomp.FlowScope leftScope = firstPreciserScopeKnowingConditionOutcome(left, blindScope, (!condition));
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
		if (leftVar == null) {
			return blindScope;
		}
		com.google.javascript.jscomp.FlowScope rightScope = firstPreciserScopeKnowingConditionOutcome(left, blindScope, condition);
		rightScope = firstPreciserScopeKnowingConditionOutcome(right, rightScope, (!condition));
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> rightVar = rightScope.findUniqueRefinedSlot(blindScope);
		if ((rightVar == null) || (!(leftVar.getName().equals(rightVar.getName())))) {
			return blindScope;
		}
		com.google.javascript.rhino.jstype.JSType type = leftVar.getType().getLeastSupertype(rightVar.getType());
		com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
		informed.inferSlotType(leftVar.getName(), type);
		return informed;
	}

	private com.google.javascript.jscomp.FlowScope caseNameOrGetProp(com.google.javascript.rhino.Node name, com.google.javascript.jscomp.FlowScope blindScope, boolean outcome) {
		com.google.javascript.rhino.jstype.JSType type = getTypeIfRefinable(name, blindScope);
		if (type != null) {
			com.google.javascript.rhino.jstype.JSType restrictedType = type.getRestrictedTypeGivenToBooleanOutcome(outcome);
			com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
			declareNameInScope(informed, name, restrictedType);
			return informed;
		}
		return blindScope;
	}

	private com.google.javascript.jscomp.FlowScope caseTypeOf(com.google.javascript.rhino.Node node, com.google.javascript.rhino.jstype.JSType type, java.lang.String value, boolean resultEqualsValue, com.google.javascript.jscomp.FlowScope blindScope) {
		com.google.javascript.rhino.jstype.JSType restrictedType = getRestrictedByTypeOfResult(type, value, resultEqualsValue);
		if (restrictedType == null) {
			return blindScope;
		}
		com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
		declareNameInScope(informed, node, restrictedType);
		return informed;
	}

	private com.google.javascript.jscomp.FlowScope caseInstanceOf(com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, com.google.javascript.jscomp.FlowScope blindScope, boolean outcome) {
		com.google.javascript.rhino.jstype.JSType leftType = getTypeIfRefinable(left, blindScope);
		if (leftType == null) {
			return blindScope;
		}
		com.google.javascript.rhino.jstype.JSType rightType = right.getJSType();
		com.google.javascript.rhino.jstype.ObjectType targetType = typeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		if (rightType instanceof com.google.javascript.rhino.jstype.FunctionType) {
			targetType = ((com.google.javascript.rhino.jstype.FunctionType) (rightType));
		}
		com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> visitor;
		if (outcome) {
			visitor = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor(targetType);
		}else {
			visitor = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor(targetType);
		}
		com.google.javascript.rhino.jstype.JSType restrictedLeftType = leftType.visit(visitor);
		if ((restrictedLeftType != null) && (!(restrictedLeftType.equals(leftType)))) {
			com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
			declareNameInScope(informed, left, restrictedLeftType);
			return informed;
		}
		return blindScope;
	}

	private com.google.javascript.jscomp.FlowScope caseIn(com.google.javascript.rhino.Node object, java.lang.String propertyName, com.google.javascript.jscomp.FlowScope blindScope) {
		com.google.javascript.rhino.jstype.JSType jsType = object.getJSType();
		jsType = com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.this.getRestrictedWithoutNull(jsType);
		jsType = com.google.javascript.jscomp.SemanticReverseAbstractInterpreter.this.getRestrictedWithoutUndefined(jsType);
		boolean hasProperty = false;
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(jsType);
		if (objectType != null) {
			hasProperty = objectType.hasProperty(propertyName);
		}
		if (!hasProperty) {
			java.lang.String qualifiedName = object.getQualifiedName();
			if (qualifiedName != null) {
				java.lang.String propertyQualifiedName = (qualifiedName + ".") + propertyName;
				if ((blindScope.getSlot(propertyQualifiedName)) == null) {
					com.google.javascript.jscomp.FlowScope informed = blindScope.createChildFlowScope();
					com.google.javascript.rhino.jstype.JSType unknownType = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					informed.inferQualifiedSlot(propertyQualifiedName, unknownType, unknownType);
					return informed;
				}
			}
		}
		return blindScope;
	}

	private class RestrictByTrueInstanceOfResultVisitor extends com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor {
		private final com.google.javascript.rhino.jstype.ObjectType target;

		RestrictByTrueInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType target) {
			this.target = target;
		}

		@java.lang.Override
		protected com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType type) {
			return applyCommonRestriction(type);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			if ((target) instanceof com.google.javascript.rhino.jstype.FunctionType) {
				com.google.javascript.rhino.jstype.FunctionType funcTarget = ((com.google.javascript.rhino.jstype.FunctionType) (target));
				if (funcTarget.hasInstanceType()) {
					return funcTarget.getInstanceType();
				}
			}
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return applyCommonRestriction(type);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			return applyCommonRestriction(type);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return caseObjectType(type);
		}

		private com.google.javascript.rhino.jstype.JSType applyCommonRestriction(com.google.javascript.rhino.jstype.JSType type) {
			if (target.isUnknownType()) {
				return type;
			}
			com.google.javascript.rhino.jstype.FunctionType funcTarget = ((com.google.javascript.rhino.jstype.FunctionType) (target));
			if (funcTarget.hasInstanceType()) {
				return type.getGreatestSubtype(funcTarget.getInstanceType());
			}
			return null;
		}
	}

	private class RestrictByFalseInstanceOfResultVisitor extends com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor {
		private final com.google.javascript.rhino.jstype.ObjectType target;

		RestrictByFalseInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType target) {
			this.target = target;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			if (target.isUnknownType()) {
				return type;
			}
			com.google.javascript.rhino.jstype.FunctionType funcTarget = ((com.google.javascript.rhino.jstype.FunctionType) (target));
			if (funcTarget.hasInstanceType()) {
				if (type.isSubtype(funcTarget.getInstanceType())) {
					return null;
				}
				return type;
			}
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			if (target.isUnknownType()) {
				return type;
			}
			com.google.javascript.rhino.jstype.FunctionType funcTarget = ((com.google.javascript.rhino.jstype.FunctionType) (target));
			if (funcTarget.hasInstanceType()) {
				return type.getRestrictedUnion(funcTarget.getInstanceType());
			}
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return caseObjectType(type);
		}
	}
}

