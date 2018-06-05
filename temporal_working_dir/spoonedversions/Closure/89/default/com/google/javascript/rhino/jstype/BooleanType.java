

package com.google.javascript.rhino.jstype;


public class BooleanType extends com.google.javascript.rhino.jstype.ValueType {
	private static final long serialVersionUID = 1L;

	BooleanType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public boolean isNullable() {
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = super.testForEquality(that);
		if (result != null) {
			return result;
		}
		if (((that.isUnknownType()) || (that.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN)))) || (that.isObject())) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}
		return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}

	@java.lang.Override
	public boolean isBooleanValueType() {
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
	public com.google.javascript.rhino.jstype.JSType autoboxesTo() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "boolean";
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseBooleanType();
	}
}

