

package org.apache.commons.math3.exception;


public class NumberIsTooSmallException extends org.apache.commons.math3.exception.MathIllegalNumberException {
	private static final long serialVersionUID = -6100997100383932834L;

	private final java.lang.Number min;

	private final boolean boundIsAllowed;

	public NumberIsTooSmallException(java.lang.Number wrong, java.lang.Number min, boolean boundIsAllowed) {
		this((boundIsAllowed ? org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL : org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_SMALL_BOUND_EXCLUDED), wrong, min, boundIsAllowed);
	}

	public NumberIsTooSmallException(org.apache.commons.math3.exception.util.Localizable specific, java.lang.Number wrong, java.lang.Number min, boolean boundIsAllowed) {
		super(specific, wrong, min);
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

