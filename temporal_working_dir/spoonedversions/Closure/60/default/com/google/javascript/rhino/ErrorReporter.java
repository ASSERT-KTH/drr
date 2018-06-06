

package com.google.javascript.rhino;


public interface ErrorReporter {
	void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset);

	void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset);

	com.google.javascript.rhino.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset);
}

