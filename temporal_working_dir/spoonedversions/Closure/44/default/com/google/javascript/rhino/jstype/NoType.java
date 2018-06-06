

package com.google.javascript.rhino.jstype;


public class NoType extends com.google.javascript.rhino.jstype.NoObjectType {
	private static final long serialVersionUID = 1L;

	NoType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public boolean isNoObjectType() {
		return false;
	}

	@java.lang.Override
	public boolean isNoType() {
		return true;
	}

	@java.lang.Override
	public boolean isNullable() {
		return true;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return true;
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return true;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseNoType();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "None";
	}
}

