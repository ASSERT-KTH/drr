

package com.google.javascript.rhino.jstype;


public interface StaticSourceFile {
	java.lang.String getName();

	boolean isExtern();

	int getLineOffset(int lineNumber);

	int getLineOfOffset(int offset);

	int getColumnOfOffset(int offset);
}

