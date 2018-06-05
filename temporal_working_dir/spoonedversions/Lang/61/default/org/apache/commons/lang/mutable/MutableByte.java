

package org.apache.commons.lang.mutable;


public class MutableByte extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = -1585823265L;

	private byte value;

	public MutableByte() {
		super();
	}

	public MutableByte(byte value) {
		super();
		org.apache.commons.lang.mutable.MutableByte.this.value = value;
	}

	public MutableByte(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableByte.this.value = value.byteValue();
	}

	public java.lang.Object getValue() {
		return new java.lang.Byte(org.apache.commons.lang.mutable.MutableByte.this.value);
	}

	public void setValue(byte value) {
		org.apache.commons.lang.mutable.MutableByte.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).byteValue());
	}

	public byte byteValue() {
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

	public java.lang.Byte toByte() {
		return new java.lang.Byte(byteValue());
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(byte operand) {
		org.apache.commons.lang.mutable.MutableByte.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableByte.this.value += operand.byteValue();
	}

	public void subtract(byte operand) {
		org.apache.commons.lang.mutable.MutableByte.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableByte.this.value -= operand.byteValue();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableByte) {
			return (value) == (((org.apache.commons.lang.mutable.MutableByte) (obj)).byteValue());
		}
		return false;
	}

	public int hashCode() {
		return value;
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableByte other = ((org.apache.commons.lang.mutable.MutableByte) (obj));
		byte anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

