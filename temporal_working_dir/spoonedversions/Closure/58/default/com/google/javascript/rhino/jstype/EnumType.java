

package com.google.javascript.rhino.jstype;


public class EnumType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private com.google.javascript.rhino.jstype.EnumElementType elementsType;

	private final java.util.Set<java.lang.String> elements = new java.util.HashSet<java.lang.String>();

	EnumType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.jstype.JSType elementsType) {
		super(registry, (("enum{" + name) + "}"), null);
		com.google.javascript.rhino.jstype.EnumType.this.elementsType = new com.google.javascript.rhino.jstype.EnumElementType(registry, elementsType, name);
	}

	@java.lang.Override
	public boolean isEnumType() {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
	}

	public java.util.Set<java.lang.String> getElements() {
		return java.util.Collections.unmodifiableSet(elements);
	}

	public boolean defineElement(java.lang.String name, com.google.javascript.rhino.Node definingNode) {
		elements.add(name);
		return defineDeclaredProperty(name, elementsType, definingNode);
	}

	public com.google.javascript.rhino.jstype.EnumElementType getElementsType() {
		return elementsType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = super.testForEquality(that);
		if (result != null) {
			return result;
		}
		return com.google.javascript.rhino.jstype.EnumType.this.isEquivalentTo(that) ? com.google.javascript.rhino.jstype.TernaryValue.TRUE : com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return ((that.isEquivalentTo(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE))) || (that.isEquivalentTo(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE)))) || (com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.EnumType.this, that));
	}

	@java.lang.Override
	public java.lang.String toString() {
		return getReferenceName();
	}

	@java.lang.Override
	public java.lang.String getDisplayName() {
		return elementsType.getDisplayName();
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseObjectType(com.google.javascript.rhino.jstype.EnumType.this);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return null;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return false;
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return true;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		elementsType = ((com.google.javascript.rhino.jstype.EnumElementType) (elementsType.resolve(t, scope)));
		return super.resolveInternal(t, scope);
	}
}

