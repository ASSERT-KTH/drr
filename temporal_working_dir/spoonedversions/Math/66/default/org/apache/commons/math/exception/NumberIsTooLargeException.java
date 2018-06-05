

package org.apache.commons.math.exception;


public class NumberIsTooLargeException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private final java.lang.Number max;

	private final boolean boundIsAllowed;

	public NumberIsTooLargeException(java.lang.Number wrong, java.lang.Number max, boolean boundIsAllowed) {
		this(null, wrong, max, boundIsAllowed);
	}

	public NumberIsTooLargeException(org.apache.commons.math.util.Localizable specific, java.lang.Number wrong, java.lang.Number max, boolean boundIsAllowed) {
		super(specific, (boundIsAllowed ? org.apache.commons.math.util.LocalizedFormats.NUMBER_TOO_LARGE : org.apache.commons.math.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED), wrong, max);
		this.max = max;
		this.boundIsAllowed = boundIsAllowed;
	}

	public boolean getBoundIsAllowed() {
		return boundIsAllowed;
	}

	public java.lang.Number getMax() {
		return max;
	}
}

