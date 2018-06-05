

package com.google.javascript.rhino.jstype;


public class FunctionPrototypeType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.jstype.FunctionType ownerFunction;

	FunctionPrototypeType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.FunctionType ownerFunction, com.google.javascript.rhino.jstype.ObjectType implicitPrototype, boolean isNative) {
		super(registry, null, implicitPrototype, isNative);
		this.ownerFunction = ownerFunction;
	}

	FunctionPrototypeType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.FunctionType ownerFunction, com.google.javascript.rhino.jstype.ObjectType implicitPrototype) {
		this(registry, ownerFunction, implicitPrototype, false);
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		if ((ownerFunction) == null) {
			return "{...}.prototype";
		}else {
			return (ownerFunction.getReferenceName()) + ".prototype";
		}
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return ((ownerFunction) != null) && (ownerFunction.hasReferenceName());
	}

	@java.lang.Override
	public boolean isFunctionPrototypeType() {
		return true;
	}

	public com.google.javascript.rhino.jstype.FunctionType getOwnerFunction() {
		return ownerFunction;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return getOwnerFunction().getImplementedInterfaces();
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorExtendedInterfaces() {
		if ((getOwnerFunction()) != null) {
			return getOwnerFunction().getExtendedInterfaces();
		}else {
			return com.google.common.collect.ImmutableSet.of();
		}
	}
}

