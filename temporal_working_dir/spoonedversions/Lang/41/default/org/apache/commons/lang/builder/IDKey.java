

package org.apache.commons.lang.builder;


final class IDKey {
	private final java.lang.Object value;

	private final int id;

	public IDKey(java.lang.Object _value) {
		id = java.lang.System.identityHashCode(_value);
		value = _value;
	}

	@java.lang.Override
	public int hashCode() {
		return id;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if (!(other instanceof org.apache.commons.lang.builder.IDKey)) {
			return false;
		}
		org.apache.commons.lang.builder.IDKey idKey = ((org.apache.commons.lang.builder.IDKey) (other));
		if ((id) != (idKey.id)) {
			return false;
		}
		return (value) == (idKey.value);
	}
}

