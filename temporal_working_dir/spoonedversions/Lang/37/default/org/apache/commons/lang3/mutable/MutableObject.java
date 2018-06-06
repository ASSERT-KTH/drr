

package org.apache.commons.lang3.mutable;


public class MutableObject<T> implements java.io.Serializable , org.apache.commons.lang3.mutable.Mutable<T> {
	private static final long serialVersionUID = 86241875189L;

	private T value;

	public MutableObject() {
		super();
	}

	public MutableObject(T value) {
		super();
		org.apache.commons.lang3.mutable.MutableObject.this.value = value;
	}

	public T getValue() {
		return org.apache.commons.lang3.mutable.MutableObject.this.value;
	}

	public void setValue(T value) {
		org.apache.commons.lang3.mutable.MutableObject.this.value = value;
	}

	public boolean equals(org.apache.commons.lang3.mutable.MutableObject<T> obj) {
		if (obj == null) {
			return false;
		}
		T other = obj.value;
		return ((value) == other) || (((value) != null) && (value.equals(other)));
	}

	@java.lang.Override
	public int hashCode() {
		return (value) == null ? 0 : value.hashCode();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return (value) == null ? "null" : value.toString();
	}
}

