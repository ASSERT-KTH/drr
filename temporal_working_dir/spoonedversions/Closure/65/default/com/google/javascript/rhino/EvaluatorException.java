

package com.google.javascript.rhino;


public class EvaluatorException extends com.google.javascript.rhino.RhinoException {
	static final long serialVersionUID = -8743165779676009808L;

	public EvaluatorException(java.lang.String detail) {
		super(detail);
	}

	public EvaluatorException(java.lang.String detail, java.lang.String sourceName, int lineNumber) {
		this(detail, sourceName, lineNumber, null, 0);
	}

	public EvaluatorException(java.lang.String detail, java.lang.String sourceName, int lineNumber, java.lang.String lineSource, int columnNumber) {
		super(detail);
		recordErrorOrigin(sourceName, lineNumber, lineSource, columnNumber);
	}
}

