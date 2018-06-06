

package com.google.javascript.rhino.jstype;


class ProxyObjectType extends com.google.javascript.rhino.jstype.ObjectType {
	private static final long serialVersionUID = 1L;

	private com.google.javascript.rhino.jstype.JSType referencedType;

	private com.google.javascript.rhino.jstype.ObjectType referencedObjType;

	ProxyObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.JSType referencedType) {
		super(registry);
		setReferencedType(referencedType);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSlot(java.lang.String name) {
		if ((referencedObjType) != null) {
			return referencedObjType.getSlot(name);
		}
		return null;
	}

	com.google.javascript.rhino.jstype.JSType getReferencedTypeInternal() {
		return referencedType;
	}

	com.google.javascript.rhino.jstype.ObjectType getReferencedObjTypeInternal() {
		return referencedObjType;
	}

	void setReferencedType(com.google.javascript.rhino.jstype.JSType referencedType) {
		com.google.javascript.rhino.jstype.ProxyObjectType.this.referencedType = referencedType;
		if (referencedType instanceof com.google.javascript.rhino.jstype.ObjectType) {
			com.google.javascript.rhino.jstype.ProxyObjectType.this.referencedObjType = ((com.google.javascript.rhino.jstype.ObjectType) (referencedType));
		}else {
			com.google.javascript.rhino.jstype.ProxyObjectType.this.referencedObjType = null;
		}
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return (referencedObjType) == null ? "" : referencedObjType.getReferenceName();
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return (referencedObjType) == null ? null : referencedObjType.hasReferenceName();
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return referencedType.matchesNumberContext();
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return referencedType.matchesStringContext();
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return referencedType.matchesObjectContext();
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return referencedType.canBeCalled();
	}

	@java.lang.Override
	public boolean isNoType() {
		return referencedType.isNoType();
	}

	@java.lang.Override
	public boolean isNoObjectType() {
		return referencedType.isNoObjectType();
	}

	@java.lang.Override
	public boolean isNoResolvedType() {
		return referencedType.isNoResolvedType();
	}

	@java.lang.Override
	public boolean isUnknownType() {
		return referencedType.isUnknownType();
	}

	@java.lang.Override
	public boolean isCheckedUnknownType() {
		return referencedType.isCheckedUnknownType();
	}

	@java.lang.Override
	public boolean isNullable() {
		return referencedType.isNullable();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.EnumType toMaybeEnumType() {
		return referencedType.toMaybeEnumType();
	}

	@java.lang.Override
	public boolean isConstructor() {
		return referencedType.isConstructor();
	}

	@java.lang.Override
	public boolean isNominalType() {
		return referencedType.isNominalType();
	}

	@java.lang.Override
	public boolean isInstanceType() {
		return referencedType.isInstanceType();
	}

	@java.lang.Override
	public boolean isInterface() {
		return referencedType.isInterface();
	}

	@java.lang.Override
	public boolean isOrdinaryFunction() {
		return referencedType.isOrdinaryFunction();
	}

	@java.lang.Override
	public boolean isAllType() {
		return referencedType.isAllType();
	}

	@java.lang.Override
	public boolean isNativeObjectType() {
		return (referencedObjType) == null ? false : referencedObjType.isNativeObjectType();
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.RecordType toMaybeRecordType() {
		return referencedType.toMaybeRecordType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.UnionType toMaybeUnionType() {
		return referencedType.toMaybeUnionType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType toMaybeFunctionType() {
		return referencedType.toMaybeFunctionType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.EnumElementType toMaybeEnumElementType() {
		return referencedType.toMaybeEnumElementType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return referencedType.testForEquality(that);
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return referencedType.isSubtype(that);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getOwnerFunction() {
		return (referencedObjType) == null ? null : referencedObjType.getOwnerFunction();
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return (referencedObjType) == null ? java.util.Collections.<com.google.javascript.rhino.jstype.ObjectType>emptyList() : referencedObjType.getCtorImplementedInterfaces();
	}

	@java.lang.Override
	public boolean canAssignTo(com.google.javascript.rhino.jstype.JSType that) {
		return referencedType.canAssignTo(that);
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		if ((com.google.javascript.rhino.jstype.ProxyObjectType.this) == that) {
			return true;
		}
		return referencedType.isEquivalentTo(that);
	}

	@java.lang.Override
	public int hashCode() {
		return referencedType.hashCode();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return referencedType.toString();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return (referencedObjType) == null ? null : referencedObjType.getImplicitPrototype();
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		return (referencedObjType) == null ? true : referencedObjType.defineProperty(propertyName, type, inferred, propertyNode);
	}

	@java.lang.Override
	public boolean removeProperty(java.lang.String name) {
		return (referencedObjType) == null ? false : referencedObjType.removeProperty(name);
	}

	@java.lang.Override
	public boolean isPropertyTypeDeclared(java.lang.String propertyName) {
		return (referencedObjType) == null ? false : referencedObjType.isPropertyTypeDeclared(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getPropertyNode(java.lang.String propertyName) {
		return (referencedObjType) == null ? null : referencedObjType.getPropertyNode(propertyName);
	}

	@java.lang.Override
	public boolean isPropertyTypeInferred(java.lang.String propertyName) {
		return (referencedObjType) == null ? false : referencedObjType.isPropertyTypeInferred(propertyName);
	}

	@java.lang.Override
	public boolean isPropertyInExterns(java.lang.String propertyName) {
		return (referencedObjType) == null ? false : referencedObjType.isPropertyInExterns(propertyName);
	}

	@java.lang.Override
	public int getPropertiesCount() {
		return (referencedObjType) == null ? 0 : referencedObjType.getPropertiesCount();
	}

	@java.lang.Override
	protected void collectPropertyNames(java.util.Set<java.lang.String> props) {
		if ((referencedObjType) != null) {
			referencedObjType.collectPropertyNames(props);
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		return referencedType.findPropertyType(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String propertyName) {
		return (referencedObjType) == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : referencedObjType.getPropertyType(propertyName);
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		return referencedType.getJSDocInfo();
	}

	@java.lang.Override
	public void setJSDocInfo(com.google.javascript.rhino.JSDocInfo info) {
		if ((referencedObjType) != null) {
			referencedObjType.setJSDocInfo(info);
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		return (referencedObjType) == null ? null : referencedObjType.getOwnPropertyJSDocInfo(propertyName);
	}

	@java.lang.Override
	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info) {
		if ((referencedObjType) != null) {
			referencedObjType.setPropertyJSDocInfo(propertyName, info);
		}
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String propertyName) {
		return (referencedObjType) == null ? false : referencedObjType.hasProperty(propertyName);
	}

	@java.lang.Override
	public boolean hasOwnProperty(java.lang.String propertyName) {
		return (referencedObjType) == null ? false : referencedObjType.hasOwnProperty(propertyName);
	}

	@java.lang.Override
	public java.util.Set<java.lang.String> getOwnPropertyNames() {
		return (referencedObjType) == null ? com.google.common.collect.ImmutableSet.<java.lang.String>of() : referencedObjType.getOwnPropertyNames();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return (referencedObjType) == null ? null : referencedObjType.getConstructor();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getParameterType() {
		return (referencedObjType) == null ? null : referencedObjType.getParameterType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getIndexType() {
		return (referencedObjType) == null ? null : referencedObjType.getIndexType();
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return referencedType.visit(visitor);
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		setReferencedType(referencedType.resolve(t, scope));
		return com.google.javascript.rhino.jstype.ProxyObjectType.this;
	}

	@java.lang.Override
	public java.lang.String toDebugHashCodeString() {
		return ("{proxy:" + (referencedType.toDebugHashCodeString())) + "}";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getTypeOfThis() {
		if ((referencedObjType) != null) {
			return referencedObjType.getTypeOfThis();
		}
		return super.getTypeOfThis();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType collapseUnion() {
		if (referencedType.isUnionType()) {
			return referencedType.collapseUnion();
		}
		return com.google.javascript.rhino.jstype.ProxyObjectType.this;
	}
}

