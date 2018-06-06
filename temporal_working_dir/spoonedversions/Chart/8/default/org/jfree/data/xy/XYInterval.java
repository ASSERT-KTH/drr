

package org.jfree.data.xy;


public class XYInterval implements java.io.Serializable {
	private double xLow;

	private double xHigh;

	private double y;

	private double yLow;

	private double yHigh;

	public XYInterval(double xLow, double xHigh, double y, double yLow, double yHigh) {
		org.jfree.data.xy.XYInterval.this.xLow = xLow;
		org.jfree.data.xy.XYInterval.this.xHigh = xHigh;
		org.jfree.data.xy.XYInterval.this.y = y;
		org.jfree.data.xy.XYInterval.this.yLow = yLow;
		org.jfree.data.xy.XYInterval.this.yHigh = yHigh;
	}

	public double getXLow() {
		return org.jfree.data.xy.XYInterval.this.xLow;
	}

	public double getXHigh() {
		return org.jfree.data.xy.XYInterval.this.xHigh;
	}

	public double getY() {
		return org.jfree.data.xy.XYInterval.this.y;
	}

	public double getYLow() {
		return org.jfree.data.xy.XYInterval.this.yLow;
	}

	public double getYHigh() {
		return org.jfree.data.xy.XYInterval.this.yHigh;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYInterval.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYInterval)) {
			return false;
		}
		org.jfree.data.xy.XYInterval that = ((org.jfree.data.xy.XYInterval) (obj));
		if ((org.jfree.data.xy.XYInterval.this.xLow) != (that.xLow)) {
			return false;
		}
		if ((org.jfree.data.xy.XYInterval.this.xHigh) != (that.xHigh)) {
			return false;
		}
		if ((org.jfree.data.xy.XYInterval.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.data.xy.XYInterval.this.yLow) != (that.yLow)) {
			return false;
		}
		if ((org.jfree.data.xy.XYInterval.this.yHigh) != (that.yHigh)) {
			return false;
		}
		return true;
	}
}

