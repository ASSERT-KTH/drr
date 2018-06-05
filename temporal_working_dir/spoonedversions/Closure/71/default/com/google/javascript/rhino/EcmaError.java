

package com.google.javascript.rhino;


public class EcmaError extends com.google.javascript.rhino.RhinoException {
	static final long serialVersionUID = -6261226256957286699L;

	private java.lang.String errorName;

	private java.lang.String errorMessage;

	EcmaError(java.lang.String errorName, java.lang.String errorMessage, java.lang.String sourceName, int lineNumber, java.lang.String lineSource, int columnNumber) {
		recordErrorOrigin(sourceName, lineNumber, lineSource, columnNumber);
		com.google.javascript.rhino.EcmaError.this.errorName = errorName;
		com.google.javascript.rhino.EcmaError.this.errorMessage = errorMessage;
	}

	@java.lang.Override
	public java.lang.String details() {
		return ((errorName) + ": ") + (errorMessage);
	}

	public java.lang.String getName() {
		return errorName;
	}

	public java.lang.String getErrorMessage() {
		return errorMessage;
	}

	@java.lang.Deprecated
	public java.lang.String getSourceName() {
		return sourceName();
	}

	@java.lang.Deprecated
	public int getLineNumber() {
		return lineNumber();
	}

	@java.lang.Deprecated
	public int getColumnNumber() {
		return columnNumber();
	}

	@java.lang.Deprecated
	public java.lang.String getLineSource() {
		return lineSource();
	}
}

