

package com.google.javascript.jscomp.jsonml;


public class JsonMLError {
	private final com.google.javascript.jscomp.DiagnosticType type;

	public final java.lang.String description;

	public final java.lang.String sourceName;

	public final com.google.javascript.jscomp.jsonml.JsonML element;

	public final int lineNumber;

	public final com.google.javascript.jscomp.jsonml.ErrorLevel level;

	private JsonMLError(com.google.javascript.jscomp.DiagnosticType type, java.lang.String sourceName, com.google.javascript.jscomp.jsonml.JsonML element, int lineNumber, com.google.javascript.jscomp.jsonml.ErrorLevel level, java.lang.String... arguments) {
		this.type = type;
		this.description = type.format.format(arguments);
		this.sourceName = sourceName;
		this.element = element;
		this.lineNumber = lineNumber;
		this.level = level;
	}

	private JsonMLError(java.lang.String description, com.google.javascript.jscomp.DiagnosticType type, java.lang.String sourceName, com.google.javascript.jscomp.jsonml.JsonML element, int lineNumber, com.google.javascript.jscomp.jsonml.ErrorLevel level) {
		this.type = type;
		this.description = description;
		this.sourceName = sourceName;
		this.element = element;
		this.lineNumber = lineNumber;
		this.level = level;
	}

	public static com.google.javascript.jscomp.jsonml.JsonMLError make(com.google.javascript.jscomp.DiagnosticType type, java.lang.String sourceName, com.google.javascript.jscomp.jsonml.JsonML element, int lineNumber, com.google.javascript.jscomp.jsonml.ErrorLevel level, java.lang.String... arguments) {
		return new com.google.javascript.jscomp.jsonml.JsonMLError(type, sourceName, element, lineNumber, level, arguments);
	}

	public static com.google.javascript.jscomp.jsonml.JsonMLError make(com.google.javascript.jscomp.JSError error, com.google.javascript.jscomp.jsonml.JsonMLAst ast) {
		int n = error.lineNumber;
		com.google.javascript.jscomp.jsonml.JsonML element = ast.getElementPreOrder(n);
		com.google.javascript.jscomp.jsonml.ErrorLevel level = (error.level) == (com.google.javascript.jscomp.CheckLevel.ERROR) ? com.google.javascript.jscomp.jsonml.ErrorLevel.COMPILATION_ERROR : com.google.javascript.jscomp.jsonml.ErrorLevel.COMPILATION_WARNING;
		return new com.google.javascript.jscomp.jsonml.JsonMLError(error.getType(), error.sourceName, element, 0, level, error.description);
	}
}

