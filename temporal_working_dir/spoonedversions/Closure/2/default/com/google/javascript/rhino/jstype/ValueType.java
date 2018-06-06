

package com.google.javascript.rhino.jstype;


abstract class ValueType extends com.google.javascript.rhino.jstype.JSType {
	ValueType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	final com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		return com.google.javascript.rhino.jstype.ValueType.this;
	}

	@java.lang.Override
	public boolean hasDisplayName() {
		return true;
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseValueType(com.google.javascript.rhino.jstype.ValueType.this, that);
	}
}

