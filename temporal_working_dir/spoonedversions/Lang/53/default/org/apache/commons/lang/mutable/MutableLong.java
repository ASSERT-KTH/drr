

package org.apache.commons.lang.mutable;


public class MutableLong extends java.lang.Number implements java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
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

	public java.lang.Object getValue() {
		return new java.lang.Long(org.apache.commons.lang.mutable.MutableLong.this.value);
	}

	public void setValue(long value) {
		org.apache.commons.lang.mutable.MutableLong.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Number) (value)).longValue());
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

	public int intValue() {
		return ((int) (value));
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

	public java.lang.Long toLong() {
		return new java.lang.Long(longValue());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableLong) {
			return (value) == (((org.apache.commons.lang.mutable.MutableLong) (obj)).longValue());
		}
		return false;
	}

	public int hashCode() {
		return ((int) ((value) ^ ((value) >>> 32)));
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableLong other = ((org.apache.commons.lang.mutable.MutableLong) (obj));
		long anotherVal = other.value;
		return (value) < anotherVal ? -1 : (value) == anotherVal ? 0 : 1;
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

