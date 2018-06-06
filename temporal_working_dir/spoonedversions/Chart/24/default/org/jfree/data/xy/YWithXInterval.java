

package org.jfree.data.xy;


public class YWithXInterval implements java.io.Serializable {
	private double y;

	private double xLow;

	private double xHigh;

	public YWithXInterval(double y, double xLow, double xHigh) {
		org.jfree.data.xy.YWithXInterval.this.y = y;
		org.jfree.data.xy.YWithXInterval.this.xLow = xLow;
		org.jfree.data.xy.YWithXInterval.this.xHigh = xHigh;
	}

	public double getY() {
		return org.jfree.data.xy.YWithXInterval.this.y;
	}

	public double getXLow() {
		return org.jfree.data.xy.YWithXInterval.this.xLow;
	}

	public double getXHigh() {
		return org.jfree.data.xy.YWithXInterval.this.xHigh;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.YWithXInterval.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.YWithXInterval)) {
			return false;
		}
		org.jfree.data.xy.YWithXInterval that = ((org.jfree.data.xy.YWithXInterval) (obj));
		if ((org.jfree.data.xy.YWithXInterval.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.data.xy.YWithXInterval.this.xLow) != (that.xLow)) {
			return false;
		}
		if ((org.jfree.data.xy.YWithXInterval.this.xHigh) != (that.xHigh)) {
			return false;
		}
		return true;
	}
}

