

package org.jfree.data.xy;


public class YInterval implements java.io.Serializable {
	private double y;

	private double yLow;

	private double yHigh;

	public YInterval(double y, double yLow, double yHigh) {
		org.jfree.data.xy.YInterval.this.y = y;
		org.jfree.data.xy.YInterval.this.yLow = yLow;
		org.jfree.data.xy.YInterval.this.yHigh = yHigh;
	}

	public double getY() {
		return org.jfree.data.xy.YInterval.this.y;
	}

	public double getYLow() {
		return org.jfree.data.xy.YInterval.this.yLow;
	}

	public double getYHigh() {
		return org.jfree.data.xy.YInterval.this.yHigh;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.YInterval.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.YInterval)) {
			return false;
		}
		org.jfree.data.xy.YInterval that = ((org.jfree.data.xy.YInterval) (obj));
		if ((org.jfree.data.xy.YInterval.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.data.xy.YInterval.this.yLow) != (that.yLow)) {
			return false;
		}
		if ((org.jfree.data.xy.YInterval.this.yHigh) != (that.yHigh)) {
			return false;
		}
		return true;
	}
}

