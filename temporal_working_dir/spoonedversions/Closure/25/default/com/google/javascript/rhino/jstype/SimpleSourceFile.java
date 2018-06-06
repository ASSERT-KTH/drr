

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
	public int getColumnOfOffset(int offset) {
		return 0;
	}

	@java.lang.Override
	public int getLineOfOffset(int offset) {
		return 1;
	}

	@java.lang.Override
	public int getLineOffset(int line) {
		if (line < 1) {
			throw new java.lang.IllegalStateException(("Should not call getLineOffset with line number " + line));
		}
		return java.lang.Integer.MIN_VALUE;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name;
	}
}

