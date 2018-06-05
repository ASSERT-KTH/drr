

package org.apache.commons.lang.mutable;


public class MutableObject implements java.io.Serializable , org.apache.commons.lang.mutable.Mutable {
	private static final long serialVersionUID = 86241875189L;

	private java.lang.Object value;

	public MutableObject() {
		super();
	}

	public MutableObject(java.lang.Object value) {
		super();
		org.apache.commons.lang.mutable.MutableObject.this.value = value;
	}

	public java.lang.Object getValue() {
		return org.apache.commons.lang.mutable.MutableObject.this.value;
	}

	public void setValue(java.lang.Object value) {
		org.apache.commons.lang.mutable.MutableObject.this.value = value;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.apache.commons.lang.mutable.MutableObject) {
			java.lang.Object other = ((org.apache.commons.lang.mutable.MutableObject) (obj)).value;
			return ((value) == other) || (((value) != null) && (value.equals(other)));
		}
		return false;
	}

	public int hashCode() {
		return (value) == null ? 0 : value.hashCode();
	}

	public java.lang.String toString() {
		return (value) == null ? "null" : value.toString();
	}
}

