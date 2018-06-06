

package com.google.javascript.jscomp;


class RhinoErrorReporter {
	static final com.google.javascript.jscomp.DiagnosticType PARSE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_PARSE_ERROR", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType TYPE_PARSE_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TYPE_PARSE_ERROR", "{0}");

	static final com.google.javascript.jscomp.DiagnosticType EXTRA_FILEOVERVIEW = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXTRA_FILEOVERVIEW", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType TRAILING_COMMA = com.google.javascript.jscomp.DiagnosticType.error("JSC_TRAILING_COMMA", ("Parse error. Internet Explorer has a non-standard " + ("intepretation of trailing commas. Arrays will have the wrong " + "length and objects will not parse at all.")));

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_PARAM = com.google.javascript.jscomp.DiagnosticType.error("JSC_DUPLICATE_PARAM", "Parse error. {0}");

	static final com.google.javascript.jscomp.DiagnosticType BAD_JSDOC_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_BAD_JSDOC_ANNOTATION", "Parse error. {0}");

	private final java.util.Map<java.util.regex.Pattern, com.google.javascript.jscomp.DiagnosticType> typeMap;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.regex.Pattern replacePlaceHolders(java.lang.String s) {
		s = java.util.regex.Pattern.quote(s);
		return java.util.regex.Pattern.compile(s.replaceAll("\\{\\d+\\}", "\\\\E.*\\\\Q"));
	}

	private RhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		typeMap = com.google.common.collect.ImmutableMap.of(replacePlaceHolders(com.google.javascript.rhino.ScriptRuntime.getMessage0("msg.jsdoc.fileoverview.extra")), com.google.javascript.jscomp.RhinoErrorReporter.EXTRA_FILEOVERVIEW, replacePlaceHolders(com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.getMessage0("msg.extra.trailing.comma")), com.google.javascript.jscomp.RhinoErrorReporter.TRAILING_COMMA, replacePlaceHolders(com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.getMessage0("msg.dup.parms")), com.google.javascript.jscomp.RhinoErrorReporter.DUPLICATE_PARAM, replacePlaceHolders(com.google.javascript.rhino.ScriptRuntime.getMessage0("msg.bad.jsdoc.tag")), com.google.javascript.jscomp.RhinoErrorReporter.BAD_JSDOC_ANNOTATION, java.util.regex.Pattern.compile("^Bad type annotation.*"), com.google.javascript.jscomp.RhinoErrorReporter.TYPE_PARSE_ERROR);
	}

	public static com.google.javascript.jscomp.mozilla.rhino.ErrorReporter forNewRhino(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter(compiler);
	}

	public static com.google.javascript.rhino.ErrorReporter forOldRhino(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter(compiler);
	}

	public void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		compiler.report(makeError(message, sourceName, line, lineOffset, com.google.javascript.jscomp.CheckLevel.WARNING));
	}

	public void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		compiler.report(makeError(message, sourceName, line, lineOffset, com.google.javascript.jscomp.CheckLevel.ERROR));
	}

	private com.google.javascript.jscomp.JSError makeError(java.lang.String message, java.lang.String sourceName, int line, int lineOffset, com.google.javascript.jscomp.CheckLevel defaultLevel) {
		for (java.util.Map.Entry<java.util.regex.Pattern, com.google.javascript.jscomp.DiagnosticType> entry : typeMap.entrySet()) {
			if (entry.getKey().matcher(message).matches()) {
				return com.google.javascript.jscomp.JSError.make(sourceName, line, lineOffset, entry.getValue(), message);
			}
		}
		return com.google.javascript.jscomp.JSError.make(sourceName, line, lineOffset, defaultLevel, com.google.javascript.jscomp.RhinoErrorReporter.PARSE_ERROR, message);
	}

	private static class OldRhinoErrorReporter extends com.google.javascript.jscomp.RhinoErrorReporter implements com.google.javascript.rhino.ErrorReporter {
		private OldRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			super(compiler);
		}
	}

	private static class NewRhinoErrorReporter extends com.google.javascript.jscomp.RhinoErrorReporter implements com.google.javascript.jscomp.mozilla.rhino.ErrorReporter {
		private NewRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			super(compiler);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
			return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
		}

		@java.lang.Override
		public void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String sourceLine, int lineOffset) {
			super.error(message, sourceName, line, lineOffset);
		}

		@java.lang.Override
		public void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String sourceLine, int lineOffset) {
			super.warning(message, sourceName, line, lineOffset);
		}
	}
}

