

package com.google.javascript.rhino.testing;


public final class TestErrorReporter extends junit.framework.Assert implements com.google.javascript.rhino.ErrorReporter {
	private java.lang.String[] errors;

	private java.lang.String[] warnings;

	private int errorsIndex = 0;

	private int warningsIndex = 0;

	public TestErrorReporter(java.lang.String[] errors, java.lang.String[] warnings) {
		com.google.javascript.rhino.testing.TestErrorReporter.this.errors = errors;
		com.google.javascript.rhino.testing.TestErrorReporter.this.warnings = warnings;
	}

	public static com.google.javascript.rhino.testing.TestErrorReporter forNoExpectedReports() {
		return new com.google.javascript.rhino.testing.TestErrorReporter(null, null);
	}

	public void setErrors(java.lang.String[] errors) {
		com.google.javascript.rhino.testing.TestErrorReporter.this.errors = errors;
		errorsIndex = 0;
	}

	public void setWarnings(java.lang.String[] warnings) {
		com.google.javascript.rhino.testing.TestErrorReporter.this.warnings = warnings;
		warningsIndex = 0;
	}

	@java.lang.Override
	public void error(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		if (((errors) != null) && ((errorsIndex) < (errors.length))) {
			junit.framework.Assert.assertEquals(errors[((errorsIndex)++)], message);
		}else {
			junit.framework.Assert.fail(("extra error: " + message));
		}
	}

	@java.lang.Override
	public void warning(java.lang.String message, java.lang.String sourceName, int line, int lineOffset) {
		if (((warnings) != null) && ((warningsIndex) < (warnings.length))) {
			junit.framework.Assert.assertEquals(warnings[((warningsIndex)++)], message);
		}else {
			junit.framework.Assert.fail(("extra warning: " + message));
		}
	}

	public boolean hasEncounteredAllWarnings() {
		return (warnings) == null ? (warningsIndex) == 0 : (warnings.length) == (warningsIndex);
	}

	public boolean hasEncounteredAllErrors() {
		return (errors) == null ? (errorsIndex) == 0 : (errors.length) == (errorsIndex);
	}
}

