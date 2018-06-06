

package com.google.javascript.rhino.jstype;


public class SimpleReference<T extends com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> implements com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> {
	private final T symbol;

	private final com.google.javascript.rhino.Node node;

	public SimpleReference(T symbol, com.google.javascript.rhino.Node node) {
		this.symbol = symbol;
		this.node = node;
	}

	@java.lang.Override
	public final T getSymbol() {
		return symbol;
	}

	@java.lang.Override
	public final com.google.javascript.rhino.Node getNode() {
		return node;
	}

	@java.lang.Override
	public final com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile() {
		return node.getStaticSourceFile();
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.String sourceName = (node) == null ? null : node.getSourceFileName();
		int lineNo = (node) == null ? -1 : node.getLineno();
		return ((((node.getQualifiedName()) + "@") + sourceName) + ":") + lineNo;
	}
}

