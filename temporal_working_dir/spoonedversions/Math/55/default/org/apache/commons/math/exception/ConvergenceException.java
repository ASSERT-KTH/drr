

package org.apache.commons.math.exception;


public class ConvergenceException extends org.apache.commons.math.exception.MathIllegalStateException {
	private static final long serialVersionUID = 4330003017885151975L;

	public ConvergenceException() {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.CONVERGENCE_FAILED);
	}

	public ConvergenceException(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		addMessage(pattern, args);
	}
}

