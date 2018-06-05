

package org.apache.commons.math;


public class ConvergenceException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = 4380655778005469702L;

	public ConvergenceException() {
		super("Convergence failed", new java.lang.Object[0]);
	}

	public ConvergenceException(java.lang.String pattern, java.lang.Object[] arguments) {
		super(pattern, arguments);
	}

	public ConvergenceException(java.lang.Throwable cause) {
		super(cause);
	}

	public ConvergenceException(java.lang.String pattern, java.lang.Object[] arguments, java.lang.Throwable cause) {
		super(pattern, arguments, cause);
	}

	public ConvergenceException(java.lang.String msg, java.lang.Throwable rootCause) {
		super(msg, rootCause);
	}

	public ConvergenceException(java.lang.String msg) {
		super(msg);
	}
}

