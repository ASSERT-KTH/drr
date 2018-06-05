

package org.apache.commons.math3.exception;


public class ZeroException extends org.apache.commons.math3.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -1960874856936000015L;

	public ZeroException() {
		this(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED);
	}

	public ZeroException(org.apache.commons.math3.exception.util.Localizable specific, java.lang.Object... arguments) {
		super(specific, 0, arguments);
	}
}

