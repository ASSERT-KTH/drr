

package com.google.javascript.rhino.jstype;


public interface StaticScope<T> {
	com.google.javascript.rhino.Node getRootNode();

	com.google.javascript.rhino.jstype.StaticScope<T> getParentScope();

	com.google.javascript.rhino.jstype.StaticSlot<T> getSlot(java.lang.String name);

	com.google.javascript.rhino.jstype.StaticSlot<T> getOwnSlot(java.lang.String name);

	T getTypeOfThis();
}

