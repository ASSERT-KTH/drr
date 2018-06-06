

package com.google.javascript.rhino.jstype;


public interface StaticReference {
	com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSymbol();

	com.google.javascript.rhino.Node getNode();

	com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile();
}

