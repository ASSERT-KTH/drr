

package com.google.javascript.rhino.jstype;


public final class ParameterizedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
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

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		return (super.isEquivalentTo(that)) && (com.google.javascript.rhino.jstype.JSType.isEquivalent(parameterType, that.toObjectType().getParameterType()));
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		java.lang.String result = super.toStringHelper(forAnnotations);
		return ((result + ".<") + (parameterType.toStringHelper(forAnnotations))) + ">";
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType.this);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ParameterizedType toMaybeParameterizedType() {
		return com.google.javascript.rhino.jstype.ParameterizedType.this;
	}

	@java.lang.Override
	public boolean hasAnyTemplateInternal() {
		return (super.hasAnyTemplate()) || (parameterType.hasAnyTemplate());
	}
}

