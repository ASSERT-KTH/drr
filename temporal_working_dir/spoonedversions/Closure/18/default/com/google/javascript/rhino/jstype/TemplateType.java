

package com.google.javascript.rhino.jstype;


public class TemplateType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	private final java.lang.String name;

	TemplateType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name) {
		super(registry, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		this.name = name;
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return name;
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		return name;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TemplateType toMaybeTemplateType() {
		return com.google.javascript.rhino.jstype.TemplateType.this;
	}

	@java.lang.Override
	public boolean hasAnyTemplateInternal() {
		return true;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType.this);
	}
}

