

package com.google.javascript.rhino.testing;


public abstract class AbstractStaticScope<T> implements com.google.javascript.rhino.jstype.StaticScope<T> {
	@java.lang.Override
	public com.google.javascript.rhino.Node getRootNode() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<T> getParentScope() {
		return null;
	}

	public abstract com.google.javascript.rhino.jstype.StaticSlot<T> getSlot(java.lang.String name);

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<T> getOwnSlot(java.lang.String name) {
		return getSlot(name);
	}

	@java.lang.Override
	public T getTypeOfThis() {
		return null;
	}
}

