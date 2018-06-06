

package com.google.javascript.jscomp;


class RhinoErrorReporter {
	static final com.google.javascript.jscomp.DiagnosticType PARSE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_PARSE_ERROR", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType TYPE_PARSE_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TYPE_PARSE_ERROR", "{0}");

	static final com.google.javascript.jscomp.DiagnosticType TRAILING_COMMA = com.google.javascript.jscomp.DiagnosticType.error("JSC_TRAILING_COMMA", ("Parse error. IE8 (and below) will parse trailing commas in " + (("array and object literals incorrectly. " + "If you are targeting newer versions of JS, ") + "set the appropriate language_in option.")));

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_PARAM = com.google.javascript.jscomp.DiagnosticType.error("JSC_DUPLICATE_PARAM", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType BAD_JSDOC_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_BAD_JSDOC_ANNOTATION", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType MISPLACED_TYPE_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MISPLACED_TYPE_ANNOTATION", ("Type annotations are not allowed here. " + "Are you missing parentheses?"));

	static final com.google.javascript.jscomp.DiagnosticType PARSE_TREE_TOO_DEEP = com.google.javascript.jscomp.DiagnosticType.error("PARSE_TREE_TOO_DEEP", "Parse tree too deep.");

	private final java.util.Map<java.util.regex.Pattern, com.google.javascript.jscomp.DiagnosticType> typeMap;

	final com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.regex.Pattern replacePlaceHolders(java.lang.String s) {
		s = java.util.regex.Pattern.quote(s);
		return java.util.regex.Pattern.compile(s.replaceAll("\\{\\d+\\}", "\\\\E.*\\\\Q"));
	}

	private RhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		typeMap = com.google.common.collect.ImmutableMap.<java.util.regex.Pattern, com.google.javascript.jscomp.DiagnosticType>builder().put(replacePlaceHolders(com.google.javascript.rhino.head.ScriptRuntime.getMessage0("msg.extra.trailing.comma")), com.google.javascript.jscomp.RhinoErrorReporter.TRAILING_COMMA).put(replacePlaceHolders(com.google.javascript.rhino.head.ScriptRuntime.getMessage0("msg.dup.parms")), com.google.javascript.jscomp.RhinoErrorReporter.DUPLICATE_PARAM).put(replacePlaceHolders(com.google.javascript.rhino.ScriptRuntime.getMessage0("msg.bad.jsdoc.tag")), com.google.javascript.jscomp.RhinoErrorReporter.BAD_JSDOC_ANNOTATION).put(java.util.regex.Pattern.compile("^Type annotations are not allowed here.*"), com.google.javascript.jscomp.RhinoErrorReporter.MISPLACED_TYPE_ANNOTATION).put(java.util.regex.Pattern.compile("^Bad type annotation.*"), com.google.javascript.jscomp.RhinoErrorReporter.TYPE_PARSE_ERROR).put(replacePlaceHolders(com.google.javascript.rhino.head.ScriptRuntime.getMessage0("msg.too.deep.parser.recursion")), com.google.javascript.jscomp.RhinoErrorReporter.PARSE_TREE_TOO_DEEP).build();
	}

	public static com.google.javascript.rhino.head.ErrorReporter forNewRhino(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter(compiler);
	}

	public static com.google.javascript.rhino.ErrorReporter forOldRhino(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter(compiler);
	}

	void warningAtLine(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		compiler.report(makeError(message, sourceName, line, lineOffset, com.google.javascript.jscomp.CheckLevel.WARNING));
	}

	void errorAtLine(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		compiler.report(makeError(message, sourceName, line, lineOffset, com.google.javascript.jscomp.CheckLevel.ERROR));
	}

	protected com.google.javascript.jscomp.DiagnosticType mapError(java.lang.String message) {
		for (java.util.Map.Entry<java.util.regex.Pattern, com.google.javascript.jscomp.DiagnosticType> entry : typeMap.entrySet()) {
			if (entry.getKey().matcher(message).matches()) {
				return entry.getValue();
			}
		}
		return null;
	}

	private com.google.javascript.jscomp.JSError makeError(java.lang.String message, java.lang.String sourceName, int line, int lineOffset, com.google.javascript.jscomp.CheckLevel defaultLevel) {
		com.google.javascript.jscomp.DiagnosticType type = mapError(message);
		if (type != null) {
			return com.google.javascript.jscomp.JSError.make(sourceName, line, lineOffset, type, message);
		}
		return com.google.javascript.jscomp.JSError.make(sourceName, line, lineOffset, defaultLevel, com.google.javascript.jscomp.RhinoErrorReporter.PARSE_ERROR, message);
	}

	private static class OldRhinoErrorReporter extends com.google.javascript.jscomp.RhinoErrorReporter implements com.google.javascript.rhino.ErrorReporter {
		private OldRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			super(compiler);
		}

		@java.lang.Override
		public void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
			super.errorAtLine(message, sourceName, line, lineOffset);
		}

		@java.lang.Override
		public void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
			super.warningAtLine(message, sourceName, line, lineOffset);
		}
	}

	private static class NewRhinoErrorReporter extends com.google.javascript.jscomp.RhinoErrorReporter implements com.google.javascript.rhino.head.ast.IdeErrorReporter {
		private NewRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			super(compiler);
		}

		@java.lang.Override
		public com.google.javascript.rhino.head.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
			com.google.javascript.jscomp.DiagnosticType type = mapError(message);
			if (type != null) {
				super.errorAtLine(message, sourceName, line, lineOffset);
			}
			return new com.google.javascript.rhino.head.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
		}

		@java.lang.Override
		public void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String sourceLine, int lineOffset) {
			super.errorAtLine(message, sourceName, line, lineOffset);
		}

		@java.lang.Override
		public void error(java.lang.String message, java.lang.String sourceName, int offset, int length) {
			int line = 1;
			int column = 0;
			com.google.javascript.jscomp.SourceFile file = com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.this.compiler.getSourceFileByName(sourceName);
			if (file != null) {
				line = file.getLineOfOffset(offset);
				column = file.getColumnOfOffset(offset);
			}
			super.errorAtLine(message, sourceName, line, column);
		}

		@java.lang.Override
		public void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String sourceLine, int lineOffset) {
			super.warningAtLine(message, sourceName, line, lineOffset);
		}

		@java.lang.Override
		public void warning(java.lang.String message, java.lang.String sourceName, int offset, int length) {
			int line = 1;
			int column = 0;
			com.google.javascript.jscomp.SourceFile file = com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.this.compiler.getSourceFileByName(sourceName);
			if (file != null) {
				line = file.getLineOfOffset(offset);
				column = file.getColumnOfOffset(offset);
			}
			super.errorAtLine(message, sourceName, line, column);
		}
	}
}

