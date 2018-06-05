

package com.google.javascript.rhino;


public class SimpleErrorReporter implements com.google.javascript.rhino.ErrorReporter {
	private java.util.List<java.lang.String> warnings = null;

	private java.util.List<java.lang.String> errors = null;

	@java.lang.Override
	public void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		if ((warnings) == null) {
			warnings = new java.util.ArrayList<java.lang.String>();
		}
		warnings.add(formatDetailedMessage(message, sourceName, line, lineSource, lineOffset));
	}

	@java.lang.Override
	public void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		if ((errors) == null) {
			errors = new java.util.ArrayList<java.lang.String>();
		}
		errors.add(formatDetailedMessage(message, sourceName, line, lineSource, lineOffset));
	}

	@java.lang.Override
	public com.google.javascript.rhino.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		return new com.google.javascript.rhino.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
	}

	public java.util.List<java.lang.String> errors() {
		return errors;
	}

	public java.util.List<java.lang.String> warnings() {
		return warnings;
	}

	private java.lang.String formatDetailedMessage(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		com.google.javascript.rhino.RhinoException e = new com.google.javascript.rhino.RhinoException(message);
		if (sourceName != null) {
			e.initSourceName(sourceName);
		}
		if (lineSource != null) {
			e.initLineSource(lineSource);
		}
		if (line > 0) {
			e.initLineNumber(line);
		}
		if (lineOffset > 0) {
			e.initColumnNumber(lineOffset);
		}
		return e.getMessage();
	}
}

