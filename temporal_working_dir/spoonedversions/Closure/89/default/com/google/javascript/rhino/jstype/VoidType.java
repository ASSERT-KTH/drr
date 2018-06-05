

package com.google.javascript.rhino.jstype;


public class VoidType extends com.google.javascript.rhino.jstype.ValueType {
	private static final long serialVersionUID = 1L;

	VoidType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType restrictByNotNullOrUndefined() {
		return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN.equals(super.testForEquality(that))) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}
		if ((that.isSubtype(com.google.javascript.rhino.jstype.VoidType.this)) || (that.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE)))) {
			return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
		}
		return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return false;
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
	public boolean isVoidType() {
		return true;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "undefined";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseVoidType();
	}
}

