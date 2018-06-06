

package org.jfree.chart.util;


public final class UnitType implements java.io.Serializable {
	private static final long serialVersionUID = 6531925392288519884L;

	public static final org.jfree.chart.util.UnitType ABSOLUTE = new org.jfree.chart.util.UnitType("UnitType.ABSOLUTE");

	public static final org.jfree.chart.util.UnitType RELATIVE = new org.jfree.chart.util.UnitType("UnitType.RELATIVE");

	private java.lang.String name;

	private UnitType(java.lang.String name) {
		org.jfree.chart.util.UnitType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.UnitType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.UnitType.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.UnitType)) {
			return false;
		}
		org.jfree.chart.util.UnitType that = ((org.jfree.chart.util.UnitType) (obj));
		if (!(org.jfree.chart.util.UnitType.this.name.equals(that.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.UnitType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.UnitType.this.equals(org.jfree.chart.util.UnitType.ABSOLUTE)) {
			return org.jfree.chart.util.UnitType.ABSOLUTE;
		}else
			if (org.jfree.chart.util.UnitType.this.equals(org.jfree.chart.util.UnitType.RELATIVE)) {
				return org.jfree.chart.util.UnitType.RELATIVE;
			}
		
		return null;
	}
}

