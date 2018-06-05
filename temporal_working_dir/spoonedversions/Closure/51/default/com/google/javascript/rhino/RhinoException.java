

package com.google.javascript.rhino;


@java.lang.SuppressWarnings(value = "serial")
public class RhinoException extends java.lang.RuntimeException {
	RhinoException() {
	}

	RhinoException(java.lang.String details) {
		super(details);
	}

	@java.lang.Override
	public final java.lang.String getMessage() {
		java.lang.String details = details();
		if (((sourceName) == null) || ((lineNumber) <= 0)) {
			return details;
		}
		java.lang.StringBuilder buf = new java.lang.StringBuilder(details);
		buf.append(" (");
		if ((sourceName) != null) {
			buf.append(sourceName);
		}
		if ((lineNumber) > 0) {
			buf.append('#');
			buf.append(lineNumber);
		}
		buf.append(')');
		return buf.toString();
	}

	public java.lang.String details() {
		return super.getMessage();
	}

	public final java.lang.String sourceName() {
		return sourceName;
	}

	public final void initSourceName(java.lang.String sourceName) {
		if (sourceName == null)
			throw new java.lang.IllegalArgumentException();
		
		if ((com.google.javascript.rhino.RhinoException.this.sourceName) != null)
			throw new java.lang.IllegalStateException();
		
		com.google.javascript.rhino.RhinoException.this.sourceName = sourceName;
	}

	public final int lineNumber() {
		return lineNumber;
	}

	public final void initLineNumber(int lineNumber) {
		if (lineNumber <= 0)
			throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(lineNumber));
		
		if ((com.google.javascript.rhino.RhinoException.this.lineNumber) > 0)
			throw new java.lang.IllegalStateException();
		
		com.google.javascript.rhino.RhinoException.this.lineNumber = lineNumber;
	}

	public final int columnNumber() {
		return columnNumber;
	}

	public final void initColumnNumber(int columnNumber) {
		if (columnNumber <= 0)
			throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(columnNumber));
		
		if ((com.google.javascript.rhino.RhinoException.this.columnNumber) > 0)
			throw new java.lang.IllegalStateException();
		
		com.google.javascript.rhino.RhinoException.this.columnNumber = columnNumber;
	}

	public final java.lang.String lineSource() {
		return lineSource;
	}

	public final void initLineSource(java.lang.String lineSource) {
		if (lineSource == null)
			throw new java.lang.IllegalArgumentException();
		
		if ((com.google.javascript.rhino.RhinoException.this.lineSource) != null)
			throw new java.lang.IllegalStateException();
		
		com.google.javascript.rhino.RhinoException.this.lineSource = lineSource;
	}

	final void recordErrorOrigin(java.lang.String sourceName, int lineNumber, java.lang.String lineSource, int columnNumber) {
		if (lineNumber == (-1)) {
			lineNumber = 0;
		}
		if (sourceName != null) {
			initSourceName(sourceName);
		}
		if (lineNumber != 0) {
			initLineNumber(lineNumber);
		}
		if (lineSource != null) {
			initLineSource(lineSource);
		}
		if (columnNumber != 0) {
			initColumnNumber(columnNumber);
		}
	}

	private java.lang.String generateStackTrace() {
		return "<No stack trace available>";
	}

	public java.lang.String getScriptStackTrace() {
		return getScriptStackTrace(new java.io.FilenameFilter() {
			@java.lang.Override
			public boolean accept(java.io.File dir, java.lang.String name) {
				return name.endsWith(".js");
			}
		});
	}

	public java.lang.String getScriptStackTrace(java.io.FilenameFilter filter) {
		return "<No stack trace available>";
	}

	@java.lang.Override
	public void printStackTrace(java.io.PrintWriter s) {
		if ((interpreterStackInfo) == null) {
			super.printStackTrace(s);
		}else {
			s.print(generateStackTrace());
		}
	}

	@java.lang.Override
	public void printStackTrace(java.io.PrintStream s) {
		if ((interpreterStackInfo) == null) {
			super.printStackTrace(s);
		}else {
			s.print(generateStackTrace());
		}
	}

	private java.lang.String sourceName;

	private int lineNumber;

	private java.lang.String lineSource;

	private int columnNumber;

	java.lang.Object interpreterStackInfo;

	int[] interpreterLineData;
}

