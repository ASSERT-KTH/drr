

package org.apache.commons.lang.mutable;


public class MutableShort extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = -2135791679L;

	private short value;

	public MutableShort() {
		super();
	}

	public MutableShort(short value) {
		super();
		org.apache.commons.lang.mutable.MutableShort.this.value = value;
	}

	public MutableShort(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableShort.this.value = value.shortValue();
	}

	public java.lang.Object getValue() {
		return new java.lang.Short(org.apache.commons.lang.mutable.MutableShort.this.value);
	}

	public void setValue(short value) {
		org.apache.commons.lang.mutable.MutableShort.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).shortValue());
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(short operand) {
		org.apache.commons.lang.mutable.MutableShort.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableShort.this.value += operand.shortValue();
	}

	public void subtract(short operand) {
		org.apache.commons.lang.mutable.MutableShort.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableShort.this.value -= operand.shortValue();
	}

	public short shortValue() {
		return value;
	}

	public int intValue() {
		return value;
	}

	public long longValue() {
		return value;
	}

	public float floatValue() {
		return value;
	}

	public double doubleValue() {
		return value;
	}

	public java.lang.Short toShort() {
		return new java.lang.Short(shortValue());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableShort) {
			return (value) == (((org.apache.commons.lang.mutable.MutableShort) (obj)).shortValue());
		}
		return false;
	}

	public int hashCode() {
		return value;
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableShort other = ((org.apache.commons.lang.mutable.MutableShort) (obj));
		short anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

