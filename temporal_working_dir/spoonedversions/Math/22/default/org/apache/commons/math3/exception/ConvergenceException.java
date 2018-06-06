

package org.apache.commons.math3.exception;


public class ConvergenceException extends org.apache.commons.math3.exception.MathIllegalStateException {
	private static final long serialVersionUID = 4330003017885151975L;

	public ConvergenceException() {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED);
	}

	public ConvergenceException(org.apache.commons.math3.exception.util.Localizable pattern, java.lang.Object... args) {
		getContext().addMessage(pattern, args);
	}
}

