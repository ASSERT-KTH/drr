

package org.apache.commons.math;


public class ConvergenceException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -1111352570797662604L;

	public ConvergenceException() {
		super(org.apache.commons.math.util.LocalizedFormats.CONVERGENCE_FAILED);
	}

	@java.lang.Deprecated
	public ConvergenceException(java.lang.String pattern, java.lang.Object... arguments) {
		this(new org.apache.commons.math.util.DummyLocalizable(pattern), arguments);
	}

	public ConvergenceException(org.apache.commons.math.util.Localizable pattern, java.lang.Object... arguments) {
		super(pattern, arguments);
	}

	public ConvergenceException(java.lang.Throwable cause) {
		super(cause);
	}

	@java.lang.Deprecated
	public ConvergenceException(java.lang.Throwable cause, java.lang.String pattern, java.lang.Object... arguments) {
		this(cause, new org.apache.commons.math.util.DummyLocalizable(pattern), arguments);
	}

	public ConvergenceException(java.lang.Throwable cause, org.apache.commons.math.util.Localizable pattern, java.lang.Object... arguments) {
		super(cause, pattern, arguments);
	}
}

