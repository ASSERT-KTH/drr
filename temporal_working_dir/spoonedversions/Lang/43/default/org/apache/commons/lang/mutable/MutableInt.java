

package org.apache.commons.lang.mutable;


public class MutableInt extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = 512176391864L;

	private int value;

	public MutableInt() {
		super();
	}

	public MutableInt(int value) {
		super();
		org.apache.commons.lang.mutable.MutableInt.this.value = value;
	}

	public MutableInt(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableInt.this.value = value.intValue();
	}

	public java.lang.Object getValue() {
		return new java.lang.Integer(org.apache.commons.lang.mutable.MutableInt.this.value);
	}

	public void setValue(int value) {
		org.apache.commons.lang.mutable.MutableInt.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).intValue());
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(int operand) {
		org.apache.commons.lang.mutable.MutableInt.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableInt.this.value += operand.intValue();
	}

	public void subtract(int operand) {
		org.apache.commons.lang.mutable.MutableInt.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableInt.this.value -= operand.intValue();
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

	public java.lang.Integer toInteger() {
		return new java.lang.Integer(intValue());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableInt) {
			return (value) == (((org.apache.commons.lang.mutable.MutableInt) (obj)).intValue());
		}
		return false;
	}

	public int hashCode() {
		return value;
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableInt other = ((org.apache.commons.lang.mutable.MutableInt) (obj));
		int anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

