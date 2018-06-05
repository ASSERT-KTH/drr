

package org.jfree.chart.util;


public final class RectangleEdge implements java.io.Serializable {
	private static final long serialVersionUID = -7400988293691093548L;

	public static final org.jfree.chart.util.RectangleEdge TOP = new org.jfree.chart.util.RectangleEdge("RectangleEdge.TOP");

	public static final org.jfree.chart.util.RectangleEdge BOTTOM = new org.jfree.chart.util.RectangleEdge("RectangleEdge.BOTTOM");

	public static final org.jfree.chart.util.RectangleEdge LEFT = new org.jfree.chart.util.RectangleEdge("RectangleEdge.LEFT");

	public static final org.jfree.chart.util.RectangleEdge RIGHT = new org.jfree.chart.util.RectangleEdge("RectangleEdge.RIGHT");

	private java.lang.String name;

	private RectangleEdge(java.lang.String name) {
		org.jfree.chart.util.RectangleEdge.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.RectangleEdge.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.RectangleEdge.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.RectangleEdge)) {
			return false;
		}
		org.jfree.chart.util.RectangleEdge order = ((org.jfree.chart.util.RectangleEdge) (obj));
		if (!(org.jfree.chart.util.RectangleEdge.this.name.equals(order.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.RectangleEdge.this.name.hashCode();
	}

	public static boolean isTopOrBottom(org.jfree.chart.util.RectangleEdge edge) {
		return (edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM));
	}

	public static boolean isLeftOrRight(org.jfree.chart.util.RectangleEdge edge) {
		return (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT));
	}

	public static org.jfree.chart.util.RectangleEdge opposite(org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.chart.util.RectangleEdge result = null;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result = org.jfree.chart.util.RectangleEdge.BOTTOM;
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = org.jfree.chart.util.RectangleEdge.TOP;
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					result = org.jfree.chart.util.RectangleEdge.RIGHT;
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result = org.jfree.chart.util.RectangleEdge.LEFT;
					}
				
			
		
		return result;
	}

	public static double coordinate(java.awt.geom.Rectangle2D rectangle, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result = rectangle.getMinY();
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = rectangle.getMaxY();
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					result = rectangle.getMinX();
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result = rectangle.getMaxX();
					}
				
			
		
		return result;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.util.RectangleEdge result = null;
		if (org.jfree.chart.util.RectangleEdge.this.equals(org.jfree.chart.util.RectangleEdge.TOP)) {
			result = org.jfree.chart.util.RectangleEdge.TOP;
		}else
			if (org.jfree.chart.util.RectangleEdge.this.equals(org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = org.jfree.chart.util.RectangleEdge.BOTTOM;
			}else
				if (org.jfree.chart.util.RectangleEdge.this.equals(org.jfree.chart.util.RectangleEdge.LEFT)) {
					result = org.jfree.chart.util.RectangleEdge.LEFT;
				}else
					if (org.jfree.chart.util.RectangleEdge.this.equals(org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result = org.jfree.chart.util.RectangleEdge.RIGHT;
					}
				
			
		
		return result;
	}
}

