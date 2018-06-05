

package org.apache.commons.math3.util;


public class BigReal implements java.io.Serializable , java.lang.Comparable<org.apache.commons.math3.util.BigReal> , org.apache.commons.math3.FieldElement<org.apache.commons.math3.util.BigReal> {
	public static final org.apache.commons.math3.util.BigReal ZERO = new org.apache.commons.math3.util.BigReal(java.math.BigDecimal.ZERO);

	public static final org.apache.commons.math3.util.BigReal ONE = new org.apache.commons.math3.util.BigReal(java.math.BigDecimal.ONE);

	private static final long serialVersionUID = 4984534880991310382L;

	private final java.math.BigDecimal d;

	private java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;

	private int scale = 64;

	public BigReal(java.math.BigDecimal val) {
		d = val;
	}

	public BigReal(java.math.BigInteger val) {
		d = new java.math.BigDecimal(val);
	}

	public BigReal(java.math.BigInteger unscaledVal, int scale) {
		d = new java.math.BigDecimal(unscaledVal, scale);
	}

	public BigReal(java.math.BigInteger unscaledVal, int scale, java.math.MathContext mc) {
		d = new java.math.BigDecimal(unscaledVal, scale, mc);
	}

	public BigReal(java.math.BigInteger val, java.math.MathContext mc) {
		d = new java.math.BigDecimal(val, mc);
	}

	public BigReal(char[] in) {
		d = new java.math.BigDecimal(in);
	}

	public BigReal(char[] in, int offset, int len) {
		d = new java.math.BigDecimal(in, offset, len);
	}

	public BigReal(char[] in, int offset, int len, java.math.MathContext mc) {
		d = new java.math.BigDecimal(in, offset, len, mc);
	}

	public BigReal(char[] in, java.math.MathContext mc) {
		d = new java.math.BigDecimal(in, mc);
	}

	public BigReal(double val) {
		d = new java.math.BigDecimal(val);
	}

	public BigReal(double val, java.math.MathContext mc) {
		d = new java.math.BigDecimal(val, mc);
	}

	public BigReal(int val) {
		d = new java.math.BigDecimal(val);
	}

	public BigReal(int val, java.math.MathContext mc) {
		d = new java.math.BigDecimal(val, mc);
	}

	public BigReal(long val) {
		d = new java.math.BigDecimal(val);
	}

	public BigReal(long val, java.math.MathContext mc) {
		d = new java.math.BigDecimal(val, mc);
	}

	public BigReal(java.lang.String val) {
		d = new java.math.BigDecimal(val);
	}

	public BigReal(java.lang.String val, java.math.MathContext mc) {
		d = new java.math.BigDecimal(val, mc);
	}

	public java.math.RoundingMode getRoundingMode() {
		return roundingMode;
	}

	public void setRoundingMode(java.math.RoundingMode roundingMode) {
		org.apache.commons.math3.util.BigReal.this.roundingMode = roundingMode;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		org.apache.commons.math3.util.BigReal.this.scale = scale;
	}

	public org.apache.commons.math3.util.BigReal add(org.apache.commons.math3.util.BigReal a) {
		return new org.apache.commons.math3.util.BigReal(d.add(a.d));
	}

	public org.apache.commons.math3.util.BigReal subtract(org.apache.commons.math3.util.BigReal a) {
		return new org.apache.commons.math3.util.BigReal(d.subtract(a.d));
	}

	public org.apache.commons.math3.util.BigReal negate() {
		return new org.apache.commons.math3.util.BigReal(d.negate());
	}

	public org.apache.commons.math3.util.BigReal divide(org.apache.commons.math3.util.BigReal a) throws org.apache.commons.math3.exception.MathArithmeticException {
		try {
			return new org.apache.commons.math3.util.BigReal(d.divide(a.d, scale, roundingMode));
		} catch (java.lang.ArithmeticException e) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED);
		}
	}

	public org.apache.commons.math3.util.BigReal reciprocal() throws org.apache.commons.math3.exception.MathArithmeticException {
		try {
			return new org.apache.commons.math3.util.BigReal(java.math.BigDecimal.ONE.divide(d, scale, roundingMode));
		} catch (java.lang.ArithmeticException e) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED);
		}
	}

	public org.apache.commons.math3.util.BigReal multiply(org.apache.commons.math3.util.BigReal a) {
		return new org.apache.commons.math3.util.BigReal(d.multiply(a.d));
	}

	public org.apache.commons.math3.util.BigReal multiply(final int n) {
		return new org.apache.commons.math3.util.BigReal(d.multiply(new java.math.BigDecimal(n)));
	}

	public int compareTo(org.apache.commons.math3.util.BigReal a) {
		return d.compareTo(a.d);
	}

	public double doubleValue() {
		return d.doubleValue();
	}

	public java.math.BigDecimal bigDecimalValue() {
		return d;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math3.util.BigReal.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math3.util.BigReal) {
			return d.equals(((org.apache.commons.math3.util.BigReal) (other)).d);
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return d.hashCode();
	}

	public org.apache.commons.math3.Field<org.apache.commons.math3.util.BigReal> getField() {
		return org.apache.commons.math3.util.BigRealField.getInstance();
	}
}

