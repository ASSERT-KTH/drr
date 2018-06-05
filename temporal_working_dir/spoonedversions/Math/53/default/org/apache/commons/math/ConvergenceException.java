

package org.apache.commons.math;


public class ConvergenceException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -1111352570797662604L;

	public ConvergenceException() {
		super(org.apache.commons.math.exception.util.LocalizedFormats.CONVERGENCE_FAILED);
	}

	public ConvergenceException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
	}

	public ConvergenceException(java.lang.Throwable cause) {
		super(cause);
	}

	public ConvergenceException(java.lang.Throwable cause, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
	}
}

