

package com.google.javascript.rhino.jstype;


public class UnknownType extends com.google.javascript.rhino.jstype.ObjectType {
	private static final long serialVersionUID = 1L;

	private final boolean isChecked;

	UnknownType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, boolean isChecked) {
		super(registry);
		this.isChecked = isChecked;
	}

	@java.lang.Override
	public boolean isUnknownType() {
		return true;
	}

	@java.lang.Override
	public boolean isCheckedUnknownType() {
		return isChecked;
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return true;
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
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
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
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseUnknownType();
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseUnknownType(com.google.javascript.rhino.jstype.UnknownType.this, that);
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		return getReferenceName();
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return null;
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return isChecked ? "??" : "?";
	}

	@java.lang.Override
	public java.lang.String getDisplayName() {
		return "Unknown";
	}

	@java.lang.Override
	public boolean hasDisplayName() {
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		return com.google.javascript.rhino.jstype.UnknownType.this;
	}
}

