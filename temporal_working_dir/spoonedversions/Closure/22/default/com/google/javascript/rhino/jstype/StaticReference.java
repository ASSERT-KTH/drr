

package com.google.javascript.rhino.jstype;


public interface StaticReference<T> {
	com.google.javascript.rhino.jstype.StaticSlot<T> getSymbol();

	com.google.javascript.rhino.Node getNode();

	com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile();
}

