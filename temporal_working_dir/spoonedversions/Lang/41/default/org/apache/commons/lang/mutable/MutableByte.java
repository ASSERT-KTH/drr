

package org.apache.commons.lang.mutable;


public class MutableByte extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang.mutable.MutableByte> , org.apache.commons.lang.mutable.Mutable<java.lang.Number> {
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

	public java.lang.Byte getValue() {
		return java.lang.Byte.valueOf(org.apache.commons.lang.mutable.MutableByte.this.value);
	}

	public void setValue(byte value) {
		org.apache.commons.lang.mutable.MutableByte.this.value = value;
	}

	public void setValue(java.lang.Number value) {
		org.apache.commons.lang.mutable.MutableByte.this.value = value.byteValue();
	}

	@java.lang.Override
	public byte byteValue() {
		return value;
	}

	@java.lang.Override
	public int intValue() {
		return value;
	}

	@java.lang.Override
	public long longValue() {
		return value;
	}

	@java.lang.Override
	public float floatValue() {
		return value;
	}

	@java.lang.Override
	public double doubleValue() {
		return value;
	}

	public java.lang.Byte toByte() {
		return java.lang.Byte.valueOf(byteValue());
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

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableByte) {
			return (value) == (((org.apache.commons.lang.mutable.MutableByte) (obj)).byteValue());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return value;
	}

	public int compareTo(org.apache.commons.lang.mutable.MutableByte other) {
		byte anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

