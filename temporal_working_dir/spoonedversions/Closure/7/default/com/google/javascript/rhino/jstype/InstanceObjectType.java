

package com.google.javascript.rhino.jstype;


class InstanceObjectType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.jstype.FunctionType constructor;

	InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.FunctionType constructor) {
		this(registry, constructor, false);
	}

	InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.FunctionType constructor, boolean isNativeType) {
		super(registry, null, null, isNativeType);
		com.google.common.base.Preconditions.checkNotNull(constructor);
		this.constructor = constructor;
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return getConstructor().getReferenceName();
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return getConstructor().hasReferenceName();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return getConstructor().getPrototype();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return constructor;
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		com.google.javascript.rhino.jstype.ObjectType proto = getImplicitPrototype();
		if ((proto != null) && (proto.hasOwnDeclaredProperty(name))) {
			return false;
		}
		return super.defineProperty(name, type, inferred, propertyNode);
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		if (constructor.hasReferenceName()) {
			return constructor.getReferenceName();
		}else {
			return super.toStringHelper(forAnnotations);
		}
	}

	@java.lang.Override
	boolean isTheObjectType() {
		return (getConstructor().isNativeObjectType()) && ("Object".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isInstanceType() {
		return true;
	}

	@java.lang.Override
	public boolean isArrayType() {
		return (getConstructor().isNativeObjectType()) && ("Array".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isStringObjectType() {
		return (getConstructor().isNativeObjectType()) && ("String".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isBooleanObjectType() {
		return (getConstructor().isNativeObjectType()) && ("Boolean".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isNumberObjectType() {
		return (getConstructor().isNativeObjectType()) && ("Number".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isDateType() {
		return (getConstructor().isNativeObjectType()) && ("Date".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isRegexpType() {
		return (getConstructor().isNativeObjectType()) && ("RegExp".equals(getReferenceName()));
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
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return getConstructor().getImplementedInterfaces();
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorExtendedInterfaces() {
		return getConstructor().getExtendedInterfaces();
	}
}

