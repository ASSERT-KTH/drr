

package com.google.javascript.jscomp;


public class DiagnosticType implements java.io.Serializable , java.lang.Comparable<com.google.javascript.jscomp.DiagnosticType> {
	private static final long serialVersionUID = 1;

	public final java.lang.String key;

	public final java.text.MessageFormat format;

	public final com.google.javascript.jscomp.CheckLevel defaultLevel;

	public com.google.javascript.jscomp.CheckLevel level;

	public static com.google.javascript.jscomp.DiagnosticType error(java.lang.String name, java.lang.String descriptionFormat) {
		return com.google.javascript.jscomp.DiagnosticType.make(name, com.google.javascript.jscomp.CheckLevel.ERROR, descriptionFormat);
	}

	public static com.google.javascript.jscomp.DiagnosticType warning(java.lang.String name, java.lang.String descriptionFormat) {
		return com.google.javascript.jscomp.DiagnosticType.make(name, com.google.javascript.jscomp.CheckLevel.WARNING, descriptionFormat);
	}

	public static com.google.javascript.jscomp.DiagnosticType disabled(java.lang.String name, java.lang.String descriptionFormat) {
		return com.google.javascript.jscomp.DiagnosticType.make(name, com.google.javascript.jscomp.CheckLevel.OFF, descriptionFormat);
	}

	public static com.google.javascript.jscomp.DiagnosticType make(java.lang.String name, com.google.javascript.jscomp.CheckLevel level, java.lang.String descriptionFormat) {
		return new com.google.javascript.jscomp.DiagnosticType(name, level, new java.text.MessageFormat(descriptionFormat));
	}

	private DiagnosticType(java.lang.String key, com.google.javascript.jscomp.CheckLevel level, java.text.MessageFormat format) {
		this.key = key;
		this.defaultLevel = level;
		this.format = format;
		com.google.javascript.jscomp.DiagnosticType.this.level = com.google.javascript.jscomp.DiagnosticType.this.defaultLevel;
	}

	java.lang.String format(java.lang.Object... arguments) {
		return format.format(arguments);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object type) {
		return (type instanceof com.google.javascript.jscomp.DiagnosticType) && (((com.google.javascript.jscomp.DiagnosticType) (type)).key.equals(key));
	}

	@java.lang.Override
	public int hashCode() {
		return key.hashCode();
	}

	@java.lang.Override
	public int compareTo(com.google.javascript.jscomp.DiagnosticType diagnosticType) {
		return key.compareTo(diagnosticType.key);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return ((key) + ": ") + (format.toPattern());
	}
}

