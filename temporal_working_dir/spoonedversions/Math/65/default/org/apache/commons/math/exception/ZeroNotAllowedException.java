

package org.apache.commons.math.exception;


public class ZeroNotAllowedException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -1960874856936000015L;

	public ZeroNotAllowedException() {
		this(null);
	}

	public ZeroNotAllowedException(org.apache.commons.math.exception.Localizable specific) {
		super(specific, org.apache.commons.math.exception.LocalizedFormats.ZERO_NOT_ALLOWED, 0);
	}
}

