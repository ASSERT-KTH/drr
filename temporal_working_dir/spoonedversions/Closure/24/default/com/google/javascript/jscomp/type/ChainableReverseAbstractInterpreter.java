

package com.google.javascript.jscomp.type;


public abstract class ChainableReverseAbstractInterpreter implements com.google.javascript.jscomp.type.ReverseAbstractInterpreter {
	protected final com.google.javascript.jscomp.CodingConvention convention;

	final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter firstLink;

	private com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter nextLink;

	public ChainableReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention convention, com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry) {
		com.google.common.base.Preconditions.checkNotNull(convention);
		this.convention = convention;
		this.typeRegistry = typeRegistry;
		firstLink = com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.this;
		nextLink = null;
	}

	public com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter lastLink) {
		com.google.common.base.Preconditions.checkArgument(((lastLink.nextLink) == null));
		com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.this.nextLink = lastLink;
		lastLink.firstLink = com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.this.firstLink;
		return lastLink;
	}

	public com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter getFirst() {
		return firstLink;
	}

	protected com.google.javascript.jscomp.type.FlowScope firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.type.FlowScope blindScope, boolean outcome) {
		return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
	}

	protected com.google.javascript.jscomp.type.FlowScope nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.type.FlowScope blindScope, boolean outcome) {
		return (nextLink) != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope;
	}

	protected com.google.javascript.rhino.jstype.JSType getTypeIfRefinable(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.type.FlowScope scope) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> nameVar = scope.getSlot(node.getString());
				if (nameVar != null) {
					com.google.javascript.rhino.jstype.JSType nameVarType = nameVar.getType();
					if (nameVarType == null) {
						nameVarType = node.getJSType();
					}
					return nameVarType;
				}
				return null;
			case com.google.javascript.rhino.Token.GETPROP :
				java.lang.String qualifiedName = node.getQualifiedName();
				if (qualifiedName == null) {
					return null;
				}
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> propVar = scope.getSlot(qualifiedName);
				com.google.javascript.rhino.jstype.JSType propVarType = null;
				if (propVar != null) {
					propVarType = propVar.getType();
				}
				if (propVarType == null) {
					propVarType = node.getJSType();
				}
				if (propVarType == null) {
					propVarType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}
				return propVarType;
		}
		return null;
	}

	protected void declareNameInScope(com.google.javascript.jscomp.type.FlowScope scope, com.google.javascript.rhino.Node node, com.google.javascript.rhino.jstype.JSType type) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				scope.inferSlotType(node.getString(), type);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				java.lang.String qualifiedName = node.getQualifiedName();
				com.google.common.base.Preconditions.checkNotNull(qualifiedName);
				com.google.javascript.rhino.jstype.JSType origType = node.getJSType();
				origType = (origType == null) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : origType;
				scope.inferQualifiedSlot(node, qualifiedName, origType, type);
				break;
			default :
				throw new java.lang.IllegalArgumentException(("Node cannot be refined. \n" + (node.toStringTree())));
		}
	}

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictUndefinedVisitor = new com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType enumElementType) {
			com.google.javascript.rhino.jstype.JSType type = enumElementType.getPrimitiveType().visit(this);
			if ((type != null) && (enumElementType.getPrimitiveType().equals(type))) {
				return enumElementType;
			}else {
				return type;
			}
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseAllType() {
			return typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			return type.getRestrictedUnion(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return null;
		}
	};

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictNullVisitor = new com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType enumElementType) {
			com.google.javascript.rhino.jstype.JSType type = enumElementType.getPrimitiveType().visit(this);
			if ((type != null) && (enumElementType.getPrimitiveType().equals(type))) {
				return enumElementType;
			}else {
				return type;
			}
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseAllType() {
			return typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			return type.getRestrictedUnion(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		}
	};

	abstract class RestrictByTypeOfResultVisitor implements com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> {
		protected abstract com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType topType);

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseAllType() {
			return caseTopType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE));
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			return caseTopType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			com.google.javascript.rhino.jstype.JSType restricted = null;
			for (com.google.javascript.rhino.jstype.JSType alternate : type.getAlternates()) {
				com.google.javascript.rhino.jstype.JSType restrictedAlternate = alternate.visit(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.this);
				if (restrictedAlternate != null) {
					if (restricted == null) {
						restricted = restrictedAlternate;
					}else {
						restricted = restrictedAlternate.getLeastSupertype(restricted);
					}
				}
			}
			return restricted;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType enumElementType) {
			com.google.javascript.rhino.jstype.JSType type = enumElementType.getPrimitiveType().visit(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.this);
			if ((type != null) && (enumElementType.getPrimitiveType().equals(type))) {
				return enumElementType;
			}else {
				return type;
			}
		}
	}

	abstract class RestrictByTrueTypeOfResultVisitor extends com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return null;
		}
	}

	abstract class RestrictByFalseTypeOfResultVisitor extends com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor {
		@java.lang.Override
		protected com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType topType) {
			return topType;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		}
	}

	private class RestrictByOneTypeOfResultVisitor extends com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor {
		private final java.lang.String value;

		private final boolean resultEqualsValue;

		RestrictByOneTypeOfResultVisitor(java.lang.String value, boolean resultEqualsValue) {
			this.value = value;
			this.resultEqualsValue = resultEqualsValue;
		}

		private boolean matchesExpectation(java.lang.String result) {
			return (result.equals(value)) == (resultEqualsValue);
		}

		@java.lang.Override
		protected com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType topType) {
			com.google.javascript.rhino.jstype.JSType result = topType;
			if (resultEqualsValue) {
				com.google.javascript.rhino.jstype.JSType typeByName = getNativeTypeForTypeOf(value);
				if (typeByName != null) {
					result = typeByName;
				}
			}
			return result;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return ((value.equals("object")) || (value.equals("function"))) == (resultEqualsValue) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE) : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return matchesExpectation("boolean") ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE) : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return matchesExpectation("function") ? type : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return matchesExpectation("object") ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE) : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return matchesExpectation("number") ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE) : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			if (value.equals("function")) {
				com.google.javascript.rhino.jstype.JSType ctorType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE);
				return (resultEqualsValue) && (ctorType.isSubtype(type)) ? ctorType : null;
			}
			return matchesExpectation("object") ? type : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return matchesExpectation("string") ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE) : null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return matchesExpectation("undefined") ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE) : null;
		}
	}

	protected final com.google.javascript.rhino.jstype.JSType getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType type) {
		return type == null ? null : type.visit(restrictUndefinedVisitor);
	}

	protected final com.google.javascript.rhino.jstype.JSType getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType type) {
		return type == null ? null : type.visit(restrictNullVisitor);
	}

	com.google.javascript.rhino.jstype.JSType getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType type, java.lang.String value, boolean resultEqualsValue) {
		if (type == null) {
			if (resultEqualsValue) {
				com.google.javascript.rhino.jstype.JSType result = getNativeTypeForTypeOf(value);
				return result == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : result;
			}else {
				return null;
			}
		}
		return type.visit(new com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor(value, resultEqualsValue));
	}

	com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return typeRegistry.getNativeType(typeId);
	}

	private com.google.javascript.rhino.jstype.JSType getNativeTypeForTypeOf(java.lang.String value) {
		if (value.equals("number")) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}else
			if (value.equals("boolean")) {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
			}else
				if (value.equals("string")) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
				}else
					if (value.equals("undefined")) {
						return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
					}else
						if (value.equals("function")) {
							return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE);
						}else {
							return null;
						}
					
				
			
		
	}
}

