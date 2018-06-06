

package com.google.javascript.rhino;


public class SimpleErrorReporter implements com.google.javascript.rhino.ErrorReporter {
	private java.util.List<java.lang.String> warnings = null;

	private java.util.List<java.lang.String> errors = null;

	@java.lang.Override
	public void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		if ((warnings) == null) {
			warnings = new java.util.ArrayList<java.lang.String>();
		}
		warnings.add(formatDetailedMessage(message, sourceName, line, lineOffset));
	}

	@java.lang.Override
	public void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		if ((errors) == null) {
			errors = new java.util.ArrayList<java.lang.String>();
		}
		errors.add(formatDetailedMessage(message, sourceName, line, lineOffset));
	}

	public java.util.List<java.lang.String> errors() {
		return errors;
	}

	public java.util.List<java.lang.String> warnings() {
		return warnings;
	}

	private java.lang.String formatDetailedMessage(java.lang.String message, java.lang.String sourceName, int lineNumber, int lineOffset) {
		java.lang.String details = message;
		if ((sourceName == null) || (lineNumber <= 0)) {
			return details;
		}
		java.lang.StringBuilder buf = new java.lang.StringBuilder(details);
		buf.append(" (");
		if (sourceName != null) {
			buf.append(sourceName);
		}
		if (lineNumber > 0) {
			buf.append('#');
			buf.append(lineNumber);
		}
		buf.append(')');
		return buf.toString();
	}
}

