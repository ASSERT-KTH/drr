

package org.jfree.data.xy;


public class YIntervalDataItem extends org.jfree.data.ComparableObjectItem {
	public YIntervalDataItem(double x, double y, double yLow, double yHigh) {
		super(new java.lang.Double(x), new org.jfree.data.xy.YInterval(y, yLow, yHigh));
	}

	public java.lang.Double getX() {
		return ((java.lang.Double) (getComparable()));
	}

	public double getYValue() {
		org.jfree.data.xy.YInterval interval = ((org.jfree.data.xy.YInterval) (getObject()));
		if (interval != null) {
			return interval.getY();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getYLowValue() {
		org.jfree.data.xy.YInterval interval = ((org.jfree.data.xy.YInterval) (getObject()));
		if (interval != null) {
			return interval.getYLow();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getYHighValue() {
		org.jfree.data.xy.YInterval interval = ((org.jfree.data.xy.YInterval) (getObject()));
		if (interval != null) {
			return interval.getYHigh();
		}else {
			return java.lang.Double.NaN;
		}
	}
}

