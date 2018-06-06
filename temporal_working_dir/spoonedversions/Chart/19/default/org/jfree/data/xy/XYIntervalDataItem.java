

package org.jfree.data.xy;


public class XYIntervalDataItem extends org.jfree.data.ComparableObjectItem {
	public XYIntervalDataItem(double x, double xLow, double xHigh, double y, double yLow, double yHigh) {
		super(new java.lang.Double(x), new org.jfree.data.xy.XYInterval(xLow, xHigh, y, yLow, yHigh));
	}

	public java.lang.Double getX() {
		return ((java.lang.Double) (getComparable()));
	}

	public double getYValue() {
		org.jfree.data.xy.XYInterval interval = ((org.jfree.data.xy.XYInterval) (getObject()));
		if (interval != null) {
			return interval.getY();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getXLowValue() {
		org.jfree.data.xy.XYInterval interval = ((org.jfree.data.xy.XYInterval) (getObject()));
		if (interval != null) {
			return interval.getXLow();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getXHighValue() {
		org.jfree.data.xy.XYInterval interval = ((org.jfree.data.xy.XYInterval) (getObject()));
		if (interval != null) {
			return interval.getXHigh();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getYLowValue() {
		org.jfree.data.xy.XYInterval interval = ((org.jfree.data.xy.XYInterval) (getObject()));
		if (interval != null) {
			return interval.getYLow();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getYHighValue() {
		org.jfree.data.xy.XYInterval interval = ((org.jfree.data.xy.XYInterval) (getObject()));
		if (interval != null) {
			return interval.getYHigh();
		}else {
			return java.lang.Double.NaN;
		}
	}
}

