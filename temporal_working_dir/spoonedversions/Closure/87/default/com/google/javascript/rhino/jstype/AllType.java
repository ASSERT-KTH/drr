

package com.google.javascript.rhino.jstype;


public final class AllType extends com.google.javascript.rhino.jstype.JSType {
	private static final long serialVersionUID = 1L;

	AllType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.AllType.this, that);
	}

	@java.lang.Override
	public boolean isAllType() {
		return true;
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
	public boolean canBeCalled() {
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnknownType()) {
			return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		return com.google.javascript.rhino.jstype.AllType.this;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return that;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "*";
	}

	@java.lang.Override
	public java.lang.String getDisplayName() {
		return "<Any Type>";
	}

	@java.lang.Override
	public boolean hasDisplayName() {
		return true;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseAllType();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		return com.google.javascript.rhino.jstype.AllType.this;
	}
}

