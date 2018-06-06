

package com.google.javascript.jscomp.parsing;


public abstract class NullErrorReporter {
	private NullErrorReporter() {
	}

	public void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
	}

	public void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
	}

	public static com.google.javascript.rhino.ErrorReporter forOldRhino() {
		return new com.google.javascript.jscomp.parsing.NullErrorReporter.OldRhinoNullReporter();
	}

	public static com.google.javascript.jscomp.mozilla.rhino.ErrorReporter forNewRhino() {
		return new com.google.javascript.jscomp.parsing.NullErrorReporter.NewRhinoNullReporter();
	}

	private static class NewRhinoNullReporter extends com.google.javascript.jscomp.parsing.NullErrorReporter implements com.google.javascript.jscomp.mozilla.rhino.ErrorReporter {
		@java.lang.Override
		public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
			return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message);
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

	private static class OldRhinoNullReporter extends com.google.javascript.jscomp.parsing.NullErrorReporter implements com.google.javascript.rhino.ErrorReporter {	}
}

