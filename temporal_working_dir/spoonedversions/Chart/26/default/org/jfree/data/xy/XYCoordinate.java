

package org.jfree.data.xy;


public class XYCoordinate implements java.io.Serializable , java.lang.Comparable {
	private double x;

	private double y;

	public XYCoordinate() {
		this(0.0, 0.0);
	}

	public XYCoordinate(double x, double y) {
		org.jfree.data.xy.XYCoordinate.this.x = x;
		org.jfree.data.xy.XYCoordinate.this.y = y;
	}

	public double getX() {
		return org.jfree.data.xy.XYCoordinate.this.x;
	}

	public double getY() {
		return org.jfree.data.xy.XYCoordinate.this.y;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYCoordinate.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYCoordinate)) {
			return false;
		}
		org.jfree.data.xy.XYCoordinate that = ((org.jfree.data.xy.XYCoordinate) (obj));
		if ((org.jfree.data.xy.XYCoordinate.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.data.xy.XYCoordinate.this.y) != (that.y)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.data.xy.XYCoordinate.this.x);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.data.xy.XYCoordinate.this.y);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.String toString() {
		return ((("(" + (org.jfree.data.xy.XYCoordinate.this.x)) + ", ") + (org.jfree.data.xy.XYCoordinate.this.y)) + ")";
	}

	public int compareTo(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.xy.XYCoordinate)) {
			throw new java.lang.IllegalArgumentException("Incomparable object.");
		}
		org.jfree.data.xy.XYCoordinate that = ((org.jfree.data.xy.XYCoordinate) (obj));
		if ((org.jfree.data.xy.XYCoordinate.this.x) > (that.x)) {
			return 1;
		}else
			if ((org.jfree.data.xy.XYCoordinate.this.x) < (that.x)) {
				return -1;
			}else {
				if ((org.jfree.data.xy.XYCoordinate.this.y) > (that.y)) {
					return 1;
				}else
					if ((org.jfree.data.xy.XYCoordinate.this.y) < (that.y)) {
						return -1;
					}
				
			}
		
		return 0;
	}
}

