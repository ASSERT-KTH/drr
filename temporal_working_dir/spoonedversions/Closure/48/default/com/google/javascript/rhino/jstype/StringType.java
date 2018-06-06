

package com.google.javascript.rhino.jstype;


public final class StringType extends com.google.javascript.rhino.jstype.ValueType {
	private static final long serialVersionUID = 1L;

	StringType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = super.testForEquality(that);
		if (result != null) {
			return result;
		}
		if ((that.isUnknownType()) || (that.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN)))) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}
		return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}

	@java.lang.Override
	public boolean isStringValueType() {
		return true;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
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
	public java.lang.String toString() {
		return getDisplayName();
	}

	@java.lang.Override
	public java.lang.String getDisplayName() {
		return "string";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType autoboxesTo() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseStringType();
	}
}

