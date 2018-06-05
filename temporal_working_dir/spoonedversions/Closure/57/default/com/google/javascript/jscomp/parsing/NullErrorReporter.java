

package com.google.javascript.jscomp.parsing;


public abstract class NullErrorReporter {
	private NullErrorReporter() {
	}

	public void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
	}

	public void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
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
	}

	private static class OldRhinoNullReporter extends com.google.javascript.jscomp.parsing.NullErrorReporter implements com.google.javascript.rhino.ErrorReporter {
		@java.lang.Override
		public com.google.javascript.rhino.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
			return new com.google.javascript.rhino.EvaluatorException(message);
		}
	}
}

