

package com.google.javascript.rhino.jstype;


public interface StaticSlot<T> {
	java.lang.String getName();

	T getType();

	boolean isTypeInferred();

	com.google.javascript.rhino.jstype.StaticReference<T> getDeclaration();
}

