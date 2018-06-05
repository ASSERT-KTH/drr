

package com.google.javascript.rhino.jstype;


public class EnumElementType extends com.google.javascript.rhino.jstype.ObjectType {
	private static final long serialVersionUID = 1L;

	private com.google.javascript.rhino.jstype.JSType primitiveType;

	private com.google.javascript.rhino.jstype.ObjectType primitiveObjectType;

	private final java.lang.String name;

	EnumElementType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.JSType elementType, java.lang.String name) {
		super(registry);
		com.google.javascript.rhino.jstype.EnumElementType.this.primitiveType = elementType;
		com.google.javascript.rhino.jstype.EnumElementType.this.primitiveObjectType = elementType.toObjectType();
		this.name = name;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.PropertyMap getPropertyMap() {
		return (primitiveObjectType) == null ? com.google.javascript.rhino.jstype.PropertyMap.immutableEmptyMap() : primitiveObjectType.getPropertyMap();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.EnumElementType toMaybeEnumElementType() {
		return com.google.javascript.rhino.jstype.EnumElementType.this;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return primitiveType.matchesNumberContext();
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return primitiveType.matchesStringContext();
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return primitiveType.matchesObjectContext();
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return primitiveType.canBeCalled();
	}

	@java.lang.Override
	public boolean isObject() {
		return primitiveType.isObject();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return primitiveType.testForEquality(that);
	}

	@java.lang.Override
	public boolean isNullable() {
		return primitiveType.isNullable();
	}

	@java.lang.Override
	public boolean isNominalType() {
		return hasReferenceName();
	}

	@java.lang.Override
	public int hashCode() {
		if (hasReferenceName()) {
			return getReferenceName().hashCode();
		}else {
			return super.hashCode();
		}
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		return forAnnotations ? primitiveType.toString() : (((getReferenceName()) + ".<") + (primitiveType)) + ">";
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return name;
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return true;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.EnumElementType.this, that)) {
			return true;
		}else {
			return primitiveType.isSubtype(that);
		}
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType.this, that);
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		return primitiveType.findPropertyType(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return (primitiveObjectType) == null ? null : primitiveObjectType.getConstructor();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType autoboxesTo() {
		return primitiveType.autoboxesTo();
	}

	public com.google.javascript.rhino.jstype.JSType getPrimitiveType() {
		return primitiveType;
	}

	com.google.javascript.rhino.jstype.JSType meet(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.JSType meetPrimitive = primitiveType.getGreatestSubtype(that);
		if (meetPrimitive.isEmptyType()) {
			return null;
		}else {
			return new com.google.javascript.rhino.jstype.EnumElementType(registry, meetPrimitive, name);
		}
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		primitiveType = primitiveType.resolve(t, scope);
		primitiveObjectType = com.google.javascript.rhino.jstype.ObjectType.cast(primitiveType);
		return com.google.javascript.rhino.jstype.EnumElementType.this;
	}
}

