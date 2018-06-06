

package org.apache.commons.math.exception;


public class NotPositiveException extends org.apache.commons.math.exception.NumberIsTooSmallException {
	public NotPositiveException(java.lang.Number value) {
		super(value, 0, true);
	}

	public NotPositiveException(org.apache.commons.math.util.Localizable specific, java.lang.Number value) {
		super(specific, value, 0, true);
	}
}

