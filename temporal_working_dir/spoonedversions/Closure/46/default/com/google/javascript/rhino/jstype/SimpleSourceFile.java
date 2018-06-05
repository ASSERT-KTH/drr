

package com.google.javascript.rhino.jstype;


public final class SimpleSourceFile implements com.google.javascript.rhino.jstype.StaticSourceFile {
	private final java.lang.String name;

	private final boolean extern;

	public SimpleSourceFile(java.lang.String name, boolean extern) {
		this.name = name;
		this.extern = extern;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return name;
	}

	@java.lang.Override
	public boolean isExtern() {
		return extern;
	}

	@java.lang.Override
	public int getLineOffset(int line) {
		return java.lang.Integer.MIN_VALUE;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name;
	}
}

