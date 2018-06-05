

package org.apache.commons.lang3.mutable;


public class MutableInt extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableInt> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
	private static final long serialVersionUID = 512176391864L;

	private int value;

	public MutableInt() {
		super();
	}

	public MutableInt(int value) {
		super();
		org.apache.commons.lang3.mutable.MutableInt.this.value = value;
	}

	public MutableInt(java.lang.Number value) {
		super();
		org.apache.commons.lang3.mutable.MutableInt.this.value = value.intValue();
	}

	public MutableInt(java.lang.String value) throws java.lang.NumberFormatException {
		super();
		org.apache.commons.lang3.mutable.MutableInt.this.value = java.lang.Integer.parseInt(value);
	}

	public java.lang.Integer getValue() {
		return new java.lang.Integer(org.apache.commons.lang3.mutable.MutableInt.this.value);
	}

	public void setValue(int value) {
		org.apache.commons.lang3.mutable.MutableInt.this.value = value;
	}

	public void setValue(java.lang.Number value) {
		org.apache.commons.lang3.mutable.MutableInt.this.value = value.intValue();
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(int operand) {
		org.apache.commons.lang3.mutable.MutableInt.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang3.mutable.MutableInt.this.value += operand.intValue();
	}

	public void subtract(int operand) {
		org.apache.commons.lang3.mutable.MutableInt.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang3.mutable.MutableInt.this.value -= operand.intValue();
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

	public java.lang.Integer toInteger() {
		return java.lang.Integer.valueOf(intValue());
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang3.mutable.MutableInt) {
			return (value) == (((org.apache.commons.lang3.mutable.MutableInt) (obj)).intValue());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return value;
	}

	public int compareTo(org.apache.commons.lang3.mutable.MutableInt other) {
		int anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

