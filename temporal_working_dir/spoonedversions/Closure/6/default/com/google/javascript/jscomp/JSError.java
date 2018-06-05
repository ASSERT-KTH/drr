

package com.google.javascript.jscomp;


public class JSError {
	private final com.google.javascript.jscomp.DiagnosticType type;

	public final java.lang.String description;

	public final java.lang.String sourceName;

	final com.google.javascript.rhino.Node node;

	public final int lineNumber;

	@java.lang.Deprecated
	public final com.google.javascript.jscomp.CheckLevel level;

	private final com.google.javascript.jscomp.CheckLevel defaultLevel;

	private final int charno;

	public static com.google.javascript.jscomp.JSError make(com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(null, null, (-1), (-1), type, null, arguments);
	}

	public static com.google.javascript.jscomp.JSError make(java.lang.String sourceName, int lineno, int charno, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(sourceName, null, lineno, charno, type, null, arguments);
	}

	public static com.google.javascript.jscomp.JSError make(java.lang.String sourceName, int lineno, int charno, com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(sourceName, null, lineno, charno, type, level, arguments);
	}

	public static com.google.javascript.jscomp.JSError make(java.lang.String sourceName, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(sourceName, n, type, arguments);
	}

	public static com.google.javascript.jscomp.JSError make(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(n.getSourceFileName(), n, type, arguments);
	}

	public static com.google.javascript.jscomp.JSError make(java.lang.String sourceName, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.JSError(sourceName, n, n.getLineno(), n.getCharno(), type, level, arguments);
	}

	private JSError(java.lang.String sourceName, @javax.annotation.Nullable
	com.google.javascript.rhino.Node node, int lineno, int charno, com.google.javascript.jscomp.DiagnosticType type, com.google.javascript.jscomp.CheckLevel level, java.lang.String... arguments) {
		this.type = type;
		this.node = node;
		this.description = type.format.format(arguments);
		this.lineNumber = lineno;
		this.charno = charno;
		this.sourceName = sourceName;
		this.defaultLevel = (level == null) ? type.level : level;
		this.level = (level == null) ? type.level : level;
	}

	private JSError(java.lang.String sourceName, @javax.annotation.Nullable
	com.google.javascript.rhino.Node node, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		this(sourceName, node, (node != null ? node.getLineno() : -1), (node != null ? node.getCharno() : -1), type, null, arguments);
	}

	public com.google.javascript.jscomp.DiagnosticType getType() {
		return type;
	}

	public java.lang.String format(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.MessageFormatter formatter) {
		switch (level) {
			case ERROR :
				return formatter.formatError(com.google.javascript.jscomp.JSError.this);
			case WARNING :
				return formatter.formatWarning(com.google.javascript.jscomp.JSError.this);
			default :
				return null;
		}
	}

	@java.lang.Override
	public java.lang.String toString() {
		return ((((((((type.key) + ". ") + (description)) + " at ") + (((sourceName) != null) && ((sourceName.length()) > 0) ? sourceName : "(unknown source)")) + " line ") + ((lineNumber) != (-1) ? java.lang.String.valueOf(lineNumber) : "(unknown line)")) + " : ") + ((charno) != (-1) ? java.lang.String.valueOf(charno) : "(unknown column)");
	}

	public int getCharno() {
		return charno;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getNodeSourceOffset() {
		return (node) != null ? node.getSourceOffset() : -1;
	}

	public int getNodeLength() {
		return (node) != null ? node.getLength() : 0;
	}

	public com.google.javascript.jscomp.CheckLevel getDefaultLevel() {
		return defaultLevel;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		if ((com.google.javascript.jscomp.JSError.this) == o) {
			return true;
		}
		if ((o == null) || ((getClass()) != (o.getClass()))) {
			return false;
		}
		com.google.javascript.jscomp.JSError jsError = ((com.google.javascript.jscomp.JSError) (o));
		if ((charno) != (jsError.charno)) {
			return false;
		}
		if ((lineNumber) != (jsError.lineNumber)) {
			return false;
		}
		if (!(description.equals(jsError.description))) {
			return false;
		}
		if ((defaultLevel) != (jsError.defaultLevel)) {
			return false;
		}
		if ((sourceName) != null ? !(sourceName.equals(jsError.sourceName)) : (jsError.sourceName) != null) {
			return false;
		}
		if (!(type.equals(jsError.type))) {
			return false;
		}
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		int result = type.hashCode();
		result = (31 * result) + (description.hashCode());
		result = (31 * result) + ((sourceName) != null ? sourceName.hashCode() : 0);
		result = (31 * result) + (lineNumber);
		result = (31 * result) + (defaultLevel.hashCode());
		result = (31 * result) + (charno);
		return result;
	}
}

