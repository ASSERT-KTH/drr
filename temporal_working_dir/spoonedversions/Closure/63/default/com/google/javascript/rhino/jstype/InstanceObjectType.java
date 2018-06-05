

package com.google.javascript.rhino.jstype;


public class InstanceObjectType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
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
	boolean defineProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, boolean inExterns, com.google.javascript.rhino.Node propertyNode) {
		com.google.javascript.rhino.jstype.ObjectType proto = getImplicitPrototype();
		if ((proto != null) && (proto.hasOwnDeclaredProperty(name))) {
			return false;
		}
		return super.defineProperty(name, type, inferred, inExterns, propertyNode);
	}

	@java.lang.Override
	public java.lang.String toString() {
		if (constructor.hasReferenceName()) {
			return constructor.getReferenceName();
		}else {
			return super.toString();
		}
	}

	@java.lang.Override
	boolean isTheObjectType() {
		return (getConstructor().isNative()) && ("Object".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isInstanceType() {
		return true;
	}

	@java.lang.Override
	public boolean isArrayType() {
		return (getConstructor().isNative()) && ("Array".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isStringObjectType() {
		return (getConstructor().isNative()) && ("String".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isBooleanObjectType() {
		return (getConstructor().isNative()) && ("Boolean".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isNumberObjectType() {
		return (getConstructor().isNative()) && ("Number".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isDateType() {
		return (getConstructor().isNative()) && ("Date".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isRegexpType() {
		return (getConstructor().isNative()) && ("RegExp".equals(getReferenceName()));
	}

	@java.lang.Override
	public boolean isNominalType() {
		return hasReferenceName();
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		if ((com.google.javascript.rhino.jstype.InstanceObjectType.this) == that) {
			return true;
		}else
			if (com.google.javascript.rhino.jstype.InstanceObjectType.this.isNominalType()) {
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
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return getConstructor().getImplementedInterfaces();
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorExtendedInterfaces() {
		return getConstructor().getExtendedInterfaces();
	}
}

