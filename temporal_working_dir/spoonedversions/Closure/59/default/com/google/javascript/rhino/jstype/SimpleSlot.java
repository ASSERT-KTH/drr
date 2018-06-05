

package com.google.javascript.rhino.jstype;


public class SimpleSlot implements com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> {
	final java.lang.String name;

	final com.google.javascript.rhino.jstype.JSType type;

	final boolean inferred;

	public SimpleSlot(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred) {
		this.name = name;
		this.type = type;
		this.inferred = inferred;
	}

	public java.lang.String getName() {
		return name;
	}

	public com.google.javascript.rhino.jstype.JSType getType() {
		return type;
	}

	public boolean isTypeInferred() {
		return inferred;
	}

	public com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> getDeclaration() {
		return null;
	}
}

