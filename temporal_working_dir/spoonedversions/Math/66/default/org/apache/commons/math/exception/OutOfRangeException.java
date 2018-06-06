

package org.apache.commons.math.exception;


public class OutOfRangeException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private final java.lang.Number lo;

	private final java.lang.Number hi;

	public OutOfRangeException(java.lang.Number wrong, java.lang.Number lo, java.lang.Number hi) {
		super(org.apache.commons.math.util.LocalizedFormats.OUT_OF_RANGE_SIMPLE, wrong, lo, hi);
		this.lo = lo;
		this.hi = hi;
	}

	public java.lang.Number getLo() {
		return lo;
	}

	public java.lang.Number getHi() {
		return hi;
	}
}

