

package com.google.javascript.rhino;


class JavaScriptException extends com.google.javascript.rhino.RhinoException {
	static final long serialVersionUID = -7666130513694669293L;

	JavaScriptException(java.lang.Object value, java.lang.String sourceName, int lineNumber) {
		recordErrorOrigin(sourceName, lineNumber, null, 0);
		com.google.javascript.rhino.JavaScriptException.this.value = value;
	}

	java.lang.Object getValue() {
		return value;
	}

	private java.lang.Object value;
}

