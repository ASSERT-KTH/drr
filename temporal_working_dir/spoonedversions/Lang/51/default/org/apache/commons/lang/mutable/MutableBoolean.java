

package org.apache.commons.lang.mutable;


public class MutableBoolean implements java.io.Serializable , java.lang.Comparable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = -4830728138360036487L;

	private boolean value;

	public MutableBoolean() {
		super();
	}

	public MutableBoolean(boolean value) {
		super();
		org.apache.commons.lang.mutable.MutableBoolean.this.value = value;
	}

	public MutableBoolean(java.lang.Boolean value) {
		super();
		org.apache.commons.lang.mutable.MutableBoolean.this.value = value.booleanValue();
	}

	public boolean booleanValue() {
		return value;
	}

	public int compareTo(java.lang.Object obj) {
		org.apache.commons.lang.mutable.MutableBoolean other = ((org.apache.commons.lang.mutable.MutableBoolean) (obj));
		boolean anotherVal = other.value;
		return (value) == anotherVal ? 0 : value ? 1 : -1;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableBoolean) {
			return (value) == (((org.apache.commons.lang.mutable.MutableBoolean) (obj)).booleanValue());
		}
		return false;
	}

	public java.lang.Object getValue() {
		return org.apache.commons.lang.BooleanUtils.toBooleanObject(org.apache.commons.lang.mutable.MutableBoolean.this.value);
	}

	public int hashCode() {
		return value ? java.lang.Boolean.TRUE.hashCode() : java.lang.Boolean.FALSE.hashCode();
	}

	public void setValue(boolean value) {
		org.apache.commons.lang.mutable.MutableBoolean.this.value = value;
	}

	public void setValue(java.lang.Object value) {
		setValue(((java.lang.Boolean) (value)).booleanValue());
	}

	public java.lang.String toString() {
		return java.lang.String.valueOf(value);
	}
}

