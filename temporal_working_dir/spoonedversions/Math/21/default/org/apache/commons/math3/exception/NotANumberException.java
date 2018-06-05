

package org.apache.commons.math3.exception;


public class NotANumberException extends org.apache.commons.math3.exception.MathIllegalNumberException {
	private static final long serialVersionUID = 20120906L;

	public NotANumberException() {
		super(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_NOT_ALLOWED, java.lang.Double.NaN);
	}
}

