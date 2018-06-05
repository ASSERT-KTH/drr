

package org.apache.commons.lang;


public final class IDKey {
	private final java.lang.Object value;

	private final int id;

	public IDKey(java.lang.Object _value) {
		id = java.lang.System.identityHashCode(_value);
		value = _value;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(java.lang.Object other) {
		if (!(other instanceof org.apache.commons.lang.IDKey)) {
			return false;
		}
		org.apache.commons.lang.IDKey idKey = ((org.apache.commons.lang.IDKey) (other));
		if ((id) != (idKey.id)) {
			return false;
		}
		return (value) == (idKey.value);
	}
}

