

package com.google.javascript.rhino;


public interface ErrorReporter {
	void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset);

	void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset);
}

