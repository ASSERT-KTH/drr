

package com.google.javascript.jscomp.testing;


public final class TestErrorReporter extends junit.framework.Assert implements com.google.javascript.rhino.head.ErrorReporter {
	private final java.lang.String[] errors;

	private final java.lang.String[] warnings;

	private int errorsIndex = 0;

	private int warningsIndex = 0;

	public TestErrorReporter(java.lang.String[] errors, java.lang.String[] warnings) {
		this.errors = errors;
		this.warnings = warnings;
	}

	@java.lang.Override
	public void error(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		if (((errors) != null) && ((errorsIndex) < (errors.length))) {
			junit.framework.Assert.assertEquals(errors[((errorsIndex)++)], message);
		}else {
			junit.framework.Assert.fail(("extra error: " + message));
		}
	}

	@java.lang.Override
	public void warning(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		if (((warnings) != null) && ((warningsIndex) < (warnings.length))) {
			junit.framework.Assert.assertEquals(warnings[((warningsIndex)++)], message);
		}else {
			junit.framework.Assert.fail(("extra warning: " + message));
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.head.EvaluatorException runtimeError(java.lang.String message, java.lang.String sourceName, int line, java.lang.String lineSource, int lineOffset) {
		return new com.google.javascript.rhino.head.EvaluatorException(("JSCompiler test code: " + message));
	}

	public boolean hasEncounteredAllWarnings() {
		return (warnings) == null ? (warningsIndex) == 0 : (warnings.length) == (warningsIndex);
	}

	public boolean hasEncounteredAllErrors() {
		return (errors) == null ? (errorsIndex) == 0 : (errors.length) == (errorsIndex);
	}
}

