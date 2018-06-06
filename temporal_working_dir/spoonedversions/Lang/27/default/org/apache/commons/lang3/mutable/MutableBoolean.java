

package org.apache.commons.lang3.mutable;


public class MutableBoolean implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.mutable.MutableBoolean> , org.apache.commons.lang3.mutable.Mutable<java.lang.Boolean> {
	private static final long serialVersionUID = -4830728138360036487L;

	private boolean value;

	public MutableBoolean() {
		super();
	}

	public MutableBoolean(boolean value) {
		super();
		org.apache.commons.lang3.mutable.MutableBoolean.this.value = value;
	}

	public MutableBoolean(java.lang.Boolean value) {
		super();
		org.apache.commons.lang3.mutable.MutableBoolean.this.value = value.booleanValue();
	}

	public java.lang.Boolean getValue() {
		return java.lang.Boolean.valueOf(org.apache.commons.lang3.mutable.MutableBoolean.this.value);
	}

	public void setValue(boolean value) {
		org.apache.commons.lang3.mutable.MutableBoolean.this.value = value;
	}

	public void setValue(java.lang.Boolean value) {
		org.apache.commons.lang3.mutable.MutableBoolean.this.value = value.booleanValue();
	}

	public boolean isTrue() {
		return (value) == true;
	}

	public boolean isFalse() {
		return (value) == false;
	}

	public boolean booleanValue() {
		return value;
	}

	public java.lang.Boolean toBoolean() {
		return java.lang.Boolean.valueOf(booleanValue());
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang3.mutable.MutableBoolean) {
			return (value) == (((org.apache.commons.lang3.mutable.MutableBoolean) (obj)).booleanValue());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return value ? java.lang.Boolean.TRUE.hashCode() : java.lang.Boolean.FALSE.hashCode();
	}

	public int compareTo(org.apache.commons.lang3.mutable.MutableBoolean other) {
		boolean anotherVal = other.value;
		return (value) == anotherVal ? 0 : value ? 1 : -1;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

