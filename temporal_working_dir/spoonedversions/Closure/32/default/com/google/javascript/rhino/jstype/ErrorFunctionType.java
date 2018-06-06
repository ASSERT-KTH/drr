

package com.google.javascript.rhino.jstype;


class ErrorFunctionType extends com.google.javascript.rhino.jstype.FunctionType {
	private static final long serialVersionUID = 1L;

	ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name) {
		super(registry, name, null, registry.createArrowType(registry.createOptionalParameters(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE)), null), null, null, true, true);
		getInternalArrowType().returnType = getInstanceType();
	}
}

