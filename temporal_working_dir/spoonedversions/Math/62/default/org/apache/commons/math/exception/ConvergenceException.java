

package org.apache.commons.math.exception;


public class ConvergenceException extends org.apache.commons.math.exception.MathIllegalStateException {
	private static final long serialVersionUID = 4330003017885151975L;

	public ConvergenceException() {
		this(null);
	}

	public ConvergenceException(org.apache.commons.math.exception.util.Localizable specific) {
		this(specific, org.apache.commons.math.exception.util.LocalizedFormats.CONVERGENCE_FAILED, null);
	}

	public ConvergenceException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Object... args) {
		super(specific, org.apache.commons.math.exception.util.LocalizedFormats.CONVERGENCE_FAILED, args);
	}
}

