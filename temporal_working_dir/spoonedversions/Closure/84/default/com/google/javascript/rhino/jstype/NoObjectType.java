

package com.google.javascript.rhino.jstype;


public class NoObjectType extends com.google.javascript.rhino.jstype.FunctionType {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> leastSupertypeVisitor = new com.google.javascript.rhino.jstype.NoObjectType.LeastSupertypeVisitor();

	private class LeastSupertypeVisitor implements com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> , java.io.Serializable {
		private static final long serialVersionUID = 1L;

		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseNoType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return type;
		}

		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type;
		}

		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
			return registry.createUnionType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE), type);
		}

		public com.google.javascript.rhino.jstype.JSType caseAllType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType type) {
			com.google.javascript.rhino.jstype.JSType primitive = type.getPrimitiveType();
			return primitive.isObject() ? primitive : registry.createUnionType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE), type);
		}
	}

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> greatestSubtypeVisitor = new com.google.javascript.rhino.jstype.NoObjectType.GreatestSupertypeVisitor();

	private class GreatestSupertypeVisitor implements com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> , java.io.Serializable {
		private static final long serialVersionUID = 1L;

		public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseNoType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseNullType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseNumberType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseStringType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType that) {
			com.google.javascript.rhino.jstype.JSType anyObjectType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
			if (anyObjectType.isSubtype(that)) {
				return anyObjectType;
			}else
				if (that.isSubtype(anyObjectType)) {
					return that;
				}else {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
				}
			
		}

		public com.google.javascript.rhino.jstype.JSType caseAllType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseVoidType() {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType type) {
			return type.getPrimitiveType().visit(com.google.javascript.rhino.jstype.NoObjectType.GreatestSupertypeVisitor.this);
		}
	}

	NoObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry, null, null, registry.createArrowType(null, null), null, null, true, true);
		getInternalArrowType().returnType = com.google.javascript.rhino.jstype.NoObjectType.this;
		com.google.javascript.rhino.jstype.NoObjectType.this.setInstanceType(com.google.javascript.rhino.jstype.NoObjectType.this);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return that.isEmptyType() ? com.google.javascript.rhino.jstype.TernaryValue.TRUE : com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.NoObjectType.this, that)) {
			return true;
		}else {
			return (that.isObject()) && (!(that.isNoType()));
		}
	}

	@java.lang.Override
	public boolean isFunctionType() {
		return false;
	}

	@java.lang.Override
	public boolean isNoObjectType() {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		return that.visit(leastSupertypeVisitor);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return that.visit(greatestSubtypeVisitor);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return null;
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return null;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return true;
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		return (com.google.javascript.rhino.jstype.NoObjectType.this) == that;
	}

	@java.lang.Override
	public int hashCode() {
		return java.lang.System.identityHashCode(com.google.javascript.rhino.jstype.NoObjectType.this);
	}

	@java.lang.Override
	public int getPropertiesCount() {
		return java.lang.Integer.MAX_VALUE;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String propertyName) {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String propertyName) {
		return true;
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, boolean inExterns, com.google.javascript.rhino.Node propertyNode) {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		return null;
	}

	@java.lang.Override
	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info, boolean inExterns) {
	}

	@java.lang.Override
	public boolean isPropertyTypeInferred(java.lang.String propertyName) {
		return false;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseNoObjectType();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "NoObject";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return null;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		return com.google.javascript.rhino.jstype.NoObjectType.this;
	}
}

