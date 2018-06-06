

package org.jfree.chart.util;


public final class XYCoordinateType implements java.io.Serializable {
	public static final org.jfree.chart.util.XYCoordinateType DATA = new org.jfree.chart.util.XYCoordinateType("XYCoordinateType.DATA");

	public static final org.jfree.chart.util.XYCoordinateType RELATIVE = new org.jfree.chart.util.XYCoordinateType("XYCoordinateType.RELATIVE");

	public static final org.jfree.chart.util.XYCoordinateType INDEX = new org.jfree.chart.util.XYCoordinateType("XYCoordinateType.INDEX");

	private java.lang.String name;

	private XYCoordinateType(java.lang.String name) {
		org.jfree.chart.util.XYCoordinateType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.XYCoordinateType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.XYCoordinateType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.XYCoordinateType)) {
			return false;
		}
		org.jfree.chart.util.XYCoordinateType order = ((org.jfree.chart.util.XYCoordinateType) (obj));
		if (!(org.jfree.chart.util.XYCoordinateType.this.name.equals(order.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.XYCoordinateType.this.equals(org.jfree.chart.util.XYCoordinateType.DATA)) {
			return org.jfree.chart.util.XYCoordinateType.DATA;
		}else
			if (org.jfree.chart.util.XYCoordinateType.this.equals(org.jfree.chart.util.XYCoordinateType.RELATIVE)) {
				return org.jfree.chart.util.XYCoordinateType.RELATIVE;
			}else
				if (org.jfree.chart.util.XYCoordinateType.this.equals(org.jfree.chart.util.XYCoordinateType.INDEX)) {
					return org.jfree.chart.util.XYCoordinateType.INDEX;
				}
			
		
		return null;
	}
}

