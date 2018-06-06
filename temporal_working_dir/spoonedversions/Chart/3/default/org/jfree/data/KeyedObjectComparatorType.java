

package org.jfree.data;


public final class KeyedObjectComparatorType {
	public static final org.jfree.data.KeyedObjectComparatorType BY_KEY = new org.jfree.data.KeyedObjectComparatorType("KeyedObjectComparatorType.BY_KEY");

	public static final org.jfree.data.KeyedObjectComparatorType BY_VALUE = new org.jfree.data.KeyedObjectComparatorType("KeyedObjectComparatorType.BY_VALUE");

	private java.lang.String name;

	private KeyedObjectComparatorType(java.lang.String name) {
		org.jfree.data.KeyedObjectComparatorType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.KeyedObjectComparatorType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.KeyedObjectComparatorType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.KeyedObjectComparatorType)) {
			return false;
		}
		org.jfree.data.KeyedObjectComparatorType type = ((org.jfree.data.KeyedObjectComparatorType) (obj));
		if (!(org.jfree.data.KeyedObjectComparatorType.this.name.equals(type.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.KeyedObjectComparatorType.this.name.hashCode();
	}
}

