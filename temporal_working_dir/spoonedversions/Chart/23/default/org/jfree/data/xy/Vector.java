

package org.jfree.data.xy;


public class Vector implements java.io.Serializable {
	private double x;

	private double y;

	public Vector(double x, double y) {
		org.jfree.data.xy.Vector.this.x = x;
		org.jfree.data.xy.Vector.this.y = y;
	}

	public double getX() {
		return org.jfree.data.xy.Vector.this.x;
	}

	public double getY() {
		return org.jfree.data.xy.Vector.this.y;
	}

	public double getLength() {
		return java.lang.Math.sqrt((((org.jfree.data.xy.Vector.this.x) * (org.jfree.data.xy.Vector.this.x)) + ((org.jfree.data.xy.Vector.this.y) * (org.jfree.data.xy.Vector.this.y))));
	}

	public double getAngle() {
		return java.lang.Math.atan2(org.jfree.data.xy.Vector.this.y, org.jfree.data.xy.Vector.this.x);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.Vector.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.Vector)) {
			return false;
		}
		org.jfree.data.xy.Vector that = ((org.jfree.data.xy.Vector) (obj));
		if ((org.jfree.data.xy.Vector.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.data.xy.Vector.this.y) != (that.y)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.data.xy.Vector.this.x);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.data.xy.Vector.this.y);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}
}

