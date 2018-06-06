

package com.google.javascript.rhino.jstype;


public final class NullType extends com.google.javascript.rhino.jstype.ValueType {
	private static final long serialVersionUID = 1L;

	NullType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public boolean isNullType() {
		return true;
	}

	@java.lang.Override
	public boolean isNullable() {
		return true;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return false;
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType restrictByNotNullOrUndefined() {
		return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = super.testForEquality(that);
		if (result != null) {
			return result;
		}
		if ((that.isNullType()) || (that.isVoidType())) {
			return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
		}
		if ((that.isUnknownType()) || (that.isNullable())) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}
		return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "null";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseNullType();
	}
}

