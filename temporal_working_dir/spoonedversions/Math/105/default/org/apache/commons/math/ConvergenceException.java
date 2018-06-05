

package org.apache.commons.math;


public class ConvergenceException extends org.apache.commons.math.MathException implements java.io.Serializable {
	private static final long serialVersionUID = -3657394299929217890L;

	public ConvergenceException() {
		this(null, null);
	}

	public ConvergenceException(java.lang.String message) {
		this(message, null);
	}

	public ConvergenceException(java.lang.String message, java.lang.Throwable cause) {
		super(message, cause);
	}

	public ConvergenceException(java.lang.Throwable throwable) {
		this(null, throwable);
	}
}

