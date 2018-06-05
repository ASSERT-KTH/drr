

package org.apache.commons.lang.mutable;


public class MutableDouble extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang.mutable.MutableDouble> , org.apache.commons.lang.mutable.Mutable<java.lang.Number> {
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

	public java.lang.Double getValue() {
		return new java.lang.Double(org.apache.commons.lang.mutable.MutableDouble.this.value);
	}

	public void setValue(double value) {
		org.apache.commons.lang.mutable.MutableDouble.this.value = value;
	}

	public void setValue(java.lang.Number value) {
		org.apache.commons.lang.mutable.MutableDouble.this.value = value.doubleValue();
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

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		return (obj instanceof org.apache.commons.lang.mutable.MutableDouble) && ((java.lang.Double.doubleToLongBits(((org.apache.commons.lang.mutable.MutableDouble) (obj)).value)) == (java.lang.Double.doubleToLongBits(value)));
	}

	@java.lang.Override
	public int hashCode() {
		long bits = java.lang.Double.doubleToLongBits(value);
		return ((int) (bits ^ (bits >>> 32)));
	}

	public int compareTo(org.apache.commons.lang.mutable.MutableDouble other) {
		double anotherVal = other.value;
		return java.lang.Double.compare(value, anotherVal);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

