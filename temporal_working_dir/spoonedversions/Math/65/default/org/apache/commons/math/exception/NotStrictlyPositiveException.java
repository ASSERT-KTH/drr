

package org.apache.commons.math.exception;


public class NotStrictlyPositiveException extends org.apache.commons.math.exception.NumberIsTooSmallException {
	private static final long serialVersionUID = -7824848630829852237L;

	public NotStrictlyPositiveException(java.lang.Number value) {
		super(value, 0, false);
	}

	public NotStrictlyPositiveException(org.apache.commons.math.exception.Localizable specific, java.lang.Number value) {
		super(specific, value, 0, false);
	}
}

