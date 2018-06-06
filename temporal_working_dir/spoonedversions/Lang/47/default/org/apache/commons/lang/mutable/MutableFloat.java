

package org.apache.commons.lang.mutable;


public class MutableFloat extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
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

	public java.lang.Object getValue() {
		return new java.lang.Float(org.apache.commons.lang.mutable.MutableFloat.this.value);
	}

	public void setValue(float value) {
		org.apache.commons.lang.mutable.MutableFloat.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).floatValue());
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

	public int intValue() {
		return ((int) (value));
	}

	public long longValue() {
		return ((long) (value));
	}

	public float floatValue() {
		return value;
	}

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

	public boolean equals(java.lang.Object obj) {
		return (obj instanceof org.apache.commons.lang.mutable.MutableFloat) && ((java.lang.Float.floatToIntBits(((org.apache.commons.lang.mutable.MutableFloat) (obj)).value)) == (java.lang.Float.floatToIntBits(value)));
	}

	public int hashCode() {
		return java.lang.Float.floatToIntBits(value);
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableFloat other = ((org.apache.commons.lang.mutable.MutableFloat) (obj));
		float anotherVal = other.value;
		return org.apache.commons.lang.math.NumberUtils.compare(value, anotherVal);
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

