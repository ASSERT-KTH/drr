

package com.google.javascript.rhino.jstype;


public interface StaticSymbolTable<S extends com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>, R extends com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType>> {
	java.lang.Iterable<R> getReferences(S symbol);

	com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getScope(S symbol);

	java.lang.Iterable<S> getAllSymbols();
}

