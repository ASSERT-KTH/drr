

package org.jfree.data.pie;


public class PieDatasetChangeType implements java.io.Serializable {
	public static final org.jfree.data.pie.PieDatasetChangeType NEW = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.NEW");

	public static final org.jfree.data.pie.PieDatasetChangeType ADD = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.ADD");

	public static final org.jfree.data.pie.PieDatasetChangeType REMOVE = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.REMOVE");

	public static final org.jfree.data.pie.PieDatasetChangeType ADD_AND_REMOVE = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.ADD_AND_REMOVE");

	public static final org.jfree.data.pie.PieDatasetChangeType UPDATE = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.UPDATE");

	public static final org.jfree.data.pie.PieDatasetChangeType CHANGE_KEY = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.ITEM_KEY");

	public static final org.jfree.data.pie.PieDatasetChangeType CLEAR = new org.jfree.data.pie.PieDatasetChangeType("PieDatasetChangeType.CLEAR");

	private java.lang.String name;

	private PieDatasetChangeType(java.lang.String name) {
		org.jfree.data.pie.PieDatasetChangeType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.pie.PieDatasetChangeType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.pie.PieDatasetChangeType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.pie.PieDatasetChangeType)) {
			return false;
		}
		org.jfree.data.pie.PieDatasetChangeType pdct = ((org.jfree.data.pie.PieDatasetChangeType) (obj));
		if (!(org.jfree.data.pie.PieDatasetChangeType.this.name.equals(pdct.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.pie.PieDatasetChangeType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.data.pie.PieDatasetChangeType.this.equals(org.jfree.data.pie.PieDatasetChangeType.ADD)) {
			result = org.jfree.data.pie.PieDatasetChangeType.ADD;
		}
		return result;
	}
}

