

package com.google.javascript.rhino.jstype;


final class ParameterizedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	final com.google.javascript.rhino.jstype.JSType parameterType;

	ParameterizedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.ObjectType objectType, com.google.javascript.rhino.jstype.JSType parameterType) {
		super(registry, objectType);
		this.parameterType = parameterType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getParameterType() {
		return parameterType;
	}
}

