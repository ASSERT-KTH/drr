

package org.apache.commons.math.exception;


public class NumberIsTooSmallException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -6100997100383932834L;

	private final java.lang.Number min;

	private final boolean boundIsAllowed;

	public NumberIsTooSmallException(java.lang.Number wrong, java.lang.Number min, boolean boundIsAllowed) {
		this(null, wrong, min, boundIsAllowed);
	}

	public NumberIsTooSmallException(org.apache.commons.math.exception.Localizable specific, java.lang.Number wrong, java.lang.Number min, boolean boundIsAllowed) {
		super(specific, (boundIsAllowed ? org.apache.commons.math.exception.LocalizedFormats.NUMBER_TOO_SMALL : org.apache.commons.math.exception.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED), wrong, min);
		this.min = min;
		this.boundIsAllowed = boundIsAllowed;
	}

	public boolean getBoundIsAllowed() {
		return boundIsAllowed;
	}

	public java.lang.Number getMin() {
		return min;
	}
}

