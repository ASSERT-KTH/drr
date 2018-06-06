

package org.apache.commons.lang.mutable;


public class MutableLong extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang.mutable.MutableLong> , org.apache.commons.lang.mutable.Mutable<java.lang.Number> {
	private static final long serialVersionUID = 62986528375L;

	private long value;

	public MutableLong() {
		super();
	}

	public MutableLong(long value) {
		super();
		org.apache.commons.lang.mutable.MutableLong.this.value = value;
	}

	public MutableLong(java.lang.Number value) {
		super();
		org.apache.commons.lang.mutable.MutableLong.this.value = value.longValue();
	}

	public java.lang.Long getValue() {
		return new java.lang.Long(org.apache.commons.lang.mutable.MutableLong.this.value);
	}

	public void setValue(long value) {
		org.apache.commons.lang.mutable.MutableLong.this.value = value;
	}

	public void setValue(java.lang.Number value) {
		org.apache.commons.lang.mutable.MutableLong.this.value = value.longValue();
	}

	public void increment() {
		(value)++;
	}

	public void decrement() {
		(value)--;
	}

	public void add(long operand) {
		org.apache.commons.lang.mutable.MutableLong.this.value += operand;
	}

	public void add(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableLong.this.value += operand.longValue();
	}

	public void subtract(long operand) {
		org.apache.commons.lang.mutable.MutableLong.this.value -= operand;
	}

	public void subtract(java.lang.Number operand) {
		org.apache.commons.lang.mutable.MutableLong.this.value -= operand.longValue();
	}

	@java.lang.Override
	public int intValue() {
		return ((int) (value));
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

	public java.lang.Long toLong() {
		return new java.lang.Long(longValue());
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableLong) {
			return (value) == (((org.apache.commons.lang.mutable.MutableLong) (obj)).longValue());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return ((int) ((value) ^ ((value) >>> 32)));
	}

	public int compareTo(org.apache.commons.lang.mutable.MutableLong other) {
		long anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

