

package org.apache.commons.math3.exception;


public class MathInternalError extends org.apache.commons.math3.exception.MathIllegalStateException {
	private static final long serialVersionUID = -6276776513966934846L;

	private static final java.lang.String REPORT_URL = "https://issues.apache.org/jira/browse/MATH";

	public MathInternalError() {
		getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.INTERNAL_ERROR, org.apache.commons.math3.exception.MathInternalError.REPORT_URL);
	}

	public MathInternalError(final java.lang.Throwable cause) {
		super(cause, org.apache.commons.math3.exception.util.LocalizedFormats.INTERNAL_ERROR, org.apache.commons.math3.exception.MathInternalError.REPORT_URL);
	}

	public MathInternalError(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... args) {
		super(pattern, args);
	}
}

