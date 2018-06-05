

package org.apache.commons.lang.mutable;


public class MutableFloat extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang.mutable.MutableFloat> , org.apache.commons.lang.mutable.Mutable<java.lang.Number> {
	private static final long serialVersionUID = 5787169186L;

	private float value;

	public MutableFloat() {
		super();
	}

	public MutableFloat(float value) {
		super();
		org.apache.commons.lang.mutable.MutableFloat.this.value = value;
	}

	public MutableFloat(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableFloat.this.value = value.floatValue();
	}

	public java.lang.Float getValue() {
		return new java.lang.Float(org.apache.commons.lang.mutable.MutableFloat.this.value);
	}

	public void setValue(float value) {
		org.apache.commons.lang.mutable.MutableFloat.this.value = value;
	}

	public void setValue(java.lang.Number value) {
		org.apache.commons.lang.mutable.MutableFloat.this.value = value.floatValue();
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(float operand) {
		org.apache.commons.lang.mutable.MutableFloat.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableFloat.this.value += operand.floatValue();
	}

	public void subtract(float operand) {
		org.apache.commons.lang.mutable.MutableFloat.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableFloat.this.value -= operand.floatValue();
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
		return value;
	}

	@java.lang.Override
	public double doubleValue() {
		return value;
	}

	public boolean isNaN() {
		return java.lang.Float.isNaN(value);
	}

	public boolean isInfinite() {
		return java.lang.Float.isInfinite(value);
	}

	public java.lang.Float toFloat() {
		return new java.lang.Float(floatValue());
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		return (obj instanceof org.apache.commons.lang.mutable.MutableFloat) && ((java.lang.Float.floatToIntBits(((org.apache.commons.lang.mutable.MutableFloat) (obj)).value)) == (java.lang.Float.floatToIntBits(value)));
	}

	@java.lang.Override
	public int hashCode() {
		return java.lang.Float.floatToIntBits(value);
	}

	public int compareTo(org.apache.commons.lang.mutable.MutableFloat other) {
		float anotherVal = other.value;
		return java.lang.Float.compare(value, anotherVal);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

