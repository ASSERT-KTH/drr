

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
	public boolean isEnumElementType() {
		return true;
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
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		if ((com.google.javascript.rhino.jstype.EnumElementType.this) == that) {
			return true;
		}else
			if (com.google.javascript.rhino.jstype.EnumElementType.this.isNominalType()) {
				com.google.javascript.rhino.jstype.ObjectType thatObj = com.google.javascript.rhino.jstype.ObjectType.cast(that);
				if ((thatObj != null) && (thatObj.isNominalType())) {
					return getReferenceName().equals(thatObj.getReferenceName());
				}
			}
		
		return false;
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
	public java.lang.String toString() {
		return (((getReferenceName()) + ".<") + (primitiveType)) + ">";
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
		if (com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.EnumElementType.this, that)) {
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
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, boolean inExterns, com.google.javascript.rhino.Node propertyNode) {
		return true;
	}

	@java.lang.Override
	public boolean isPropertyTypeDeclared(java.lang.String propertyName) {
		return (primitiveObjectType) == null ? false : primitiveObjectType.isPropertyTypeDeclared(propertyName);
	}

	@java.lang.Override
	public boolean isPropertyTypeInferred(java.lang.String propertyName) {
		return (primitiveObjectType) == null ? false : primitiveObjectType.isPropertyTypeInferred(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return null;
	}

	@java.lang.Override
	public int getPropertiesCount() {
		return (primitiveObjectType) == null ? 0 : primitiveObjectType.getPropertiesCount();
	}

	@java.lang.Override
	void collectPropertyNames(java.util.Set<java.lang.String> props) {
		if ((primitiveObjectType) != null) {
			primitiveObjectType.collectPropertyNames(props);
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		return primitiveType.findPropertyType(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String propertyName) {
		return (primitiveObjectType) == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : primitiveObjectType.getPropertyType(propertyName);
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String propertyName) {
		return (primitiveObjectType) == null ? false : primitiveObjectType.hasProperty(propertyName);
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

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		primitiveType = primitiveType.resolve(t, scope);
		primitiveObjectType = ((com.google.javascript.rhino.jstype.ObjectType) (com.google.javascript.rhino.jstype.JSType.safeResolve(primitiveObjectType, t, scope)));
		return com.google.javascript.rhino.jstype.EnumElementType.this;
	}
}

