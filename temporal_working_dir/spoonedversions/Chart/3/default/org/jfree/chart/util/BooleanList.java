

package org.jfree.chart.util;


public class BooleanList extends org.jfree.chart.util.AbstractObjectList {
	private static final long serialVersionUID = -8543170333219422042L;

	public BooleanList() {
	}

	public java.lang.Boolean getBoolean(int index) {
		return ((java.lang.Boolean) (get(index)));
	}

	public void setBoolean(int index, java.lang.Boolean b) {
		set(index, b);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.jfree.chart.util.BooleanList) {
			return super.equals(obj);
		}
		return false;
	}

	public int hashCode() {
		return super.hashCode();
	}
}

