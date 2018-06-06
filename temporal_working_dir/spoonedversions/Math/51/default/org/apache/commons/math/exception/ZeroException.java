

package org.apache.commons.math.exception;


public class ZeroException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -1960874856936000015L;

	public ZeroException() {
		this(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED);
	}

	public ZeroException(org.apache.commons.math.exception.util.Localizable specific) {
		super(specific, 0);
	}
}

