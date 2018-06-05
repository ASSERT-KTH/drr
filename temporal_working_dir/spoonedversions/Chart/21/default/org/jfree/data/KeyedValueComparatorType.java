

package org.jfree.data;


public final class KeyedValueComparatorType {
	public static final org.jfree.data.KeyedValueComparatorType BY_KEY = new org.jfree.data.KeyedValueComparatorType("KeyedValueComparatorType.BY_KEY");

	public static final org.jfree.data.KeyedValueComparatorType BY_VALUE = new org.jfree.data.KeyedValueComparatorType("KeyedValueComparatorType.BY_VALUE");

	private java.lang.String name;

	private KeyedValueComparatorType(java.lang.String name) {
		org.jfree.data.KeyedValueComparatorType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.KeyedValueComparatorType.this.name;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.data.KeyedValueComparatorType.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.data.KeyedValueComparatorType)) {
			return false;
		}
		org.jfree.data.KeyedValueComparatorType type = ((org.jfree.data.KeyedValueComparatorType) (o));
		if (!(org.jfree.data.KeyedValueComparatorType.this.name.equals(type.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.KeyedValueComparatorType.this.name.hashCode();
	}
}

