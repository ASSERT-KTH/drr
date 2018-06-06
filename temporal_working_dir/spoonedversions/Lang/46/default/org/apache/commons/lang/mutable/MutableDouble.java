

package org.apache.commons.lang.mutable;


public class MutableDouble extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = 1587163916L;

	private double value;

	public MutableDouble() {
		super();
	}

	public MutableDouble(double value) {
		super();
		org.apache.commons.lang.mutable.MutableDouble.this.value = value;
	}

	public MutableDouble(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableDouble.this.value = value.doubleValue();
	}

	public java.lang.Object getValue() {
		return new java.lang.Double(org.apache.commons.lang.mutable.MutableDouble.this.value);
	}

	public void setValue(double value) {
		org.apache.commons.lang.mutable.MutableDouble.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).doubleValue());
	}

	public int intValue() {
		return ((int) (value));
	}

	public long longValue() {
		return ((long) (value));
	}

	public float floatValue() {
		return ((float) (value));
	}

	public double doubleValue() {
		return value;
	}

	public boolean isNaN() {
		return java.lang.Double.isNaN(value);
	}

	public boolean isInfinite() {
		return java.lang.Double.isInfinite(value);
	}

	public java.lang.Double toDouble() {
		return new java.lang.Double(doubleValue());
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(double operand) {
		org.apache.commons.lang.mutable.MutableDouble.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableDouble.this.value += operand.doubleValue();
	}

	public void subtract(double operand) {
		org.apache.commons.lang.mutable.MutableDouble.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableDouble.this.value -= operand.doubleValue();
	}

	public boolean equals(java.lang.Object obj) {
		return (obj instanceof org.apache.commons.lang.mutable.MutableDouble) && ((java.lang.Double.doubleToLongBits(((org.apache.commons.lang.mutable.MutableDouble) (obj)).value)) == (java.lang.Double.doubleToLongBits(value)));
	}

	public int hashCode() {
		long bits = java.lang.Double.doubleToLongBits(value);
		return ((int) (bits ^ (bits >>> 32)));
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableDouble other = ((org.apache.commons.lang.mutable.MutableDouble) (obj));
		double anotherVal = other.value;
		return org.apache.commons.lang.math.NumberUtils.compare(value, anotherVal);
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

