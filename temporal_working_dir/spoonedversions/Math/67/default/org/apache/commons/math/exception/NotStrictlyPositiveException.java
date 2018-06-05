

package org.apache.commons.math.exception;


public class NotStrictlyPositiveException extends org.apache.commons.math.exception.NumberIsTooSmallException {
	public NotStrictlyPositiveException(java.lang.Number value) {
		super(value, 0, false);
	}

	public NotStrictlyPositiveException(org.apache.commons.math.util.Localizable specific, java.lang.Number value) {
		super(specific, value, 0, false);
	}
}

