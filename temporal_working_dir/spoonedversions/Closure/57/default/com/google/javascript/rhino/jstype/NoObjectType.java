

package com.google.javascript.rhino.jstype;


public class NoObjectType extends com.google.javascript.rhino.jstype.FunctionType {
	private static final long serialVersionUID = 1L;

	NoObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry, null, null, registry.createArrowType(null, null), null, null, true, true);
		getInternalArrowType().returnType = com.google.javascript.rhino.jstype.NoObjectType.this;
		com.google.javascript.rhino.jstype.NoObjectType.this.setInstanceType(com.google.javascript.rhino.jstype.NoObjectType.this);
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.NoObjectType.this, that)) {
			return true;
		}else {
			return ((that.isObject()) && (!(that.isNoType()))) && (!(that.isNoResolvedType()));
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
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		return true;
	}

	@java.lang.Override
	public boolean removeProperty(java.lang.String name) {
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		return null;
	}

	@java.lang.Override
	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info) {
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

