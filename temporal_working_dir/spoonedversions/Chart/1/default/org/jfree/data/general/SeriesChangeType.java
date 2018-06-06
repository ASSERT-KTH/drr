

package org.jfree.data.general;


public class SeriesChangeType implements java.io.Serializable {
	public static final org.jfree.data.general.SeriesChangeType CHANGE_KEY = new org.jfree.data.general.SeriesChangeType("SeriesChangeType.CHANGE_KEY");

	public static final org.jfree.data.general.SeriesChangeType ADD = new org.jfree.data.general.SeriesChangeType("SeriesChangeType.ADD");

	public static final org.jfree.data.general.SeriesChangeType REMOVE = new org.jfree.data.general.SeriesChangeType("SeriesChangeType.REMOVE");

	public static final org.jfree.data.general.SeriesChangeType ADD_AND_REMOVE = new org.jfree.data.general.SeriesChangeType("SeriesChangeType.ADD_AND_REMOVE");

	public static final org.jfree.data.general.SeriesChangeType UPDATE = new org.jfree.data.general.SeriesChangeType("SeriesChangeType.UPDATE");

	private java.lang.String name;

	private SeriesChangeType(java.lang.String name) {
		org.jfree.data.general.SeriesChangeType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.general.SeriesChangeType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.general.SeriesChangeType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.SeriesChangeType)) {
			return false;
		}
		org.jfree.data.general.SeriesChangeType style = ((org.jfree.data.general.SeriesChangeType) (obj));
		if (!(org.jfree.data.general.SeriesChangeType.this.name.equals(style.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.general.SeriesChangeType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.data.general.SeriesChangeType.this.equals(org.jfree.data.general.SeriesChangeType.ADD)) {
			result = org.jfree.data.general.SeriesChangeType.ADD;
		}
		return result;
	}
}

