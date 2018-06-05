

package org.apache.commons.math3.util;


public class Decimal64 extends java.lang.Number implements java.lang.Comparable<org.apache.commons.math3.util.Decimal64> , org.apache.commons.math3.FieldElement<org.apache.commons.math3.util.Decimal64> {
	public static final org.apache.commons.math3.util.Decimal64 ZERO;

	public static final org.apache.commons.math3.util.Decimal64 ONE;

	public static final org.apache.commons.math3.util.Decimal64 NEGATIVE_INFINITY;

	public static final org.apache.commons.math3.util.Decimal64 POSITIVE_INFINITY;

	public static final org.apache.commons.math3.util.Decimal64 NAN;

	private static final long serialVersionUID = 20120227L;

	static {
		ZERO = new org.apache.commons.math3.util.Decimal64(0.0);
		ONE = new org.apache.commons.math3.util.Decimal64(1.0);
		NEGATIVE_INFINITY = new org.apache.commons.math3.util.Decimal64(java.lang.Double.NEGATIVE_INFINITY);
		POSITIVE_INFINITY = new org.apache.commons.math3.util.Decimal64(java.lang.Double.POSITIVE_INFINITY);
		NAN = new org.apache.commons.math3.util.Decimal64(java.lang.Double.NaN);
	}

	private final double value;

	public Decimal64(final double x) {
		this.value = x;
	}

	public org.apache.commons.math3.Field<org.apache.commons.math3.util.Decimal64> getField() {
		return org.apache.commons.math3.util.Decimal64Field.getInstance();
	}

	public org.apache.commons.math3.util.Decimal64 add(final org.apache.commons.math3.util.Decimal64 a) {
		return new org.apache.commons.math3.util.Decimal64(((org.apache.commons.math3.util.Decimal64.this.value) + (a.value)));
	}

	public org.apache.commons.math3.util.Decimal64 subtract(final org.apache.commons.math3.util.Decimal64 a) {
		return new org.apache.commons.math3.util.Decimal64(((org.apache.commons.math3.util.Decimal64.this.value) - (a.value)));
	}

	public org.apache.commons.math3.util.Decimal64 negate() {
		return new org.apache.commons.math3.util.Decimal64((-(org.apache.commons.math3.util.Decimal64.this.value)));
	}

	public org.apache.commons.math3.util.Decimal64 multiply(final org.apache.commons.math3.util.Decimal64 a) {
		return new org.apache.commons.math3.util.Decimal64(((org.apache.commons.math3.util.Decimal64.this.value) * (a.value)));
	}

	public org.apache.commons.math3.util.Decimal64 multiply(final int n) {
		return new org.apache.commons.math3.util.Decimal64((n * (org.apache.commons.math3.util.Decimal64.this.value)));
	}

	public org.apache.commons.math3.util.Decimal64 divide(final org.apache.commons.math3.util.Decimal64 a) {
		return new org.apache.commons.math3.util.Decimal64(((org.apache.commons.math3.util.Decimal64.this.value) / (a.value)));
	}

	public org.apache.commons.math3.util.Decimal64 reciprocal() {
		return new org.apache.commons.math3.util.Decimal64((1.0 / (org.apache.commons.math3.util.Decimal64.this.value)));
	}

	@java.lang.Override
	public byte byteValue() {
		return ((byte) (value));
	}

	@java.lang.Override
	public short shortValue() {
		return ((short) (value));
	}

	@java.lang.Override
	public int intValue() {
		return ((int) (value));
	}

	@java.lang.Override
	public long longValue() {
		return ((long) (value));
	}

	@java.lang.Override
	public float floatValue() {
		return ((float) (value));
	}

	@java.lang.Override
	public double doubleValue() {
		return value;
	}

	public int compareTo(final org.apache.commons.math3.util.Decimal64 o) {
		return java.lang.Double.compare(org.apache.commons.math3.util.Decimal64.this.value, o.value);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj instanceof org.apache.commons.math3.util.Decimal64) {
			final org.apache.commons.math3.util.Decimal64 that = ((org.apache.commons.math3.util.Decimal64) (obj));
			return (java.lang.Double.doubleToLongBits(org.apache.commons.math3.util.Decimal64.this.value)) == (java.lang.Double.doubleToLongBits(that.value));
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		long v = java.lang.Double.doubleToLongBits(value);
		return ((int) (v ^ (v >>> 32)));
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.Double.toString(value);
	}

	public boolean isInfinite() {
		return java.lang.Double.isInfinite(value);
	}

	public boolean isNaN() {
		return java.lang.Double.isNaN(value);
	}
}

