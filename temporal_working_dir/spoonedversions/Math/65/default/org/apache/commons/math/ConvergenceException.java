

package org.apache.commons.math;


public class ConvergenceException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -1111352570797662604L;

	public ConvergenceException() {
		super(org.apache.commons.math.exception.LocalizedFormats.CONVERGENCE_FAILED);
	}

	@java.lang.Deprecated
	public ConvergenceException(java.lang.String pattern, java.lang.Object... arguments) {
		this(new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public ConvergenceException(org.apache.commons.math.exception.Localizable pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
	}

	public ConvergenceException(java.lang.Throwable cause) {
		super(cause);
	}

	@java.lang.Deprecated
	public ConvergenceException(java.lang.Throwable cause, java.lang.String pattern, java.lang.Object... arguments) {
		this(cause, new org.apache.commons.math.exception.DummyLocalizable(pattern), arguments);
	}

	public ConvergenceException(java.lang.Throwable cause, org.apache.commons.math.exception.Localizable pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
	}
}

