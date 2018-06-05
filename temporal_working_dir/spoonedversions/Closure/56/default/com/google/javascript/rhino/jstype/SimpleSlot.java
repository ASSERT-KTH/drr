

package com.google.javascript.rhino.jstype;


public class SimpleSlot implements com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> , java.io.Serializable {
	final java.lang.String name;

	final com.google.javascript.rhino.jstype.JSType type;

	final boolean inferred;

	public SimpleSlot(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred) {
		this.name = name;
		this.type = type;
		this.inferred = inferred;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return name;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getType() {
		return type;
	}

	@java.lang.Override
	public boolean isTypeInferred() {
		return inferred;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> getDeclaration() {
		return null;
	}
}

