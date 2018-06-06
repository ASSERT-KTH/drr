

package org.jfree.chart.util;


public final class SortOrder implements java.io.Serializable {
	private static final long serialVersionUID = -2124469847758108312L;

	public static final org.jfree.chart.util.SortOrder ASCENDING = new org.jfree.chart.util.SortOrder("SortOrder.ASCENDING");

	public static final org.jfree.chart.util.SortOrder DESCENDING = new org.jfree.chart.util.SortOrder("SortOrder.DESCENDING");

	private java.lang.String name;

	private SortOrder(java.lang.String name) {
		org.jfree.chart.util.SortOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.SortOrder.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.SortOrder.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.SortOrder)) {
			return false;
		}
		final org.jfree.chart.util.SortOrder that = ((org.jfree.chart.util.SortOrder) (obj));
		if (!(org.jfree.chart.util.SortOrder.this.name.equals(that.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.SortOrder.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.SortOrder.this.equals(org.jfree.chart.util.SortOrder.ASCENDING)) {
			return org.jfree.chart.util.SortOrder.ASCENDING;
		}else
			if (org.jfree.chart.util.SortOrder.this.equals(org.jfree.chart.util.SortOrder.DESCENDING)) {
				return org.jfree.chart.util.SortOrder.DESCENDING;
			}
		
		return null;
	}
}

