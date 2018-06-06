

package org.apache.commons.math.exception;


public class OutOfRangeException extends org.apache.commons.math.exception.MathIllegalNumberException {
	private static final long serialVersionUID = 111601815794403609L;

	private final java.lang.Number lo;

	private final java.lang.Number hi;

	public OutOfRangeException(java.lang.Number wrong, java.lang.Number lo, java.lang.Number hi) {
		this(null, wrong, lo, hi);
	}

	public OutOfRangeException(org.apache.commons.math.exception.util.Localizable specific, java.lang.Number wrong, java.lang.Number lo, java.lang.Number hi) {
		super(specific, org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_RANGE_SIMPLE, wrong, lo, hi);
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

