

package org.jfree.data.xy;


public class XIntervalDataItem extends org.jfree.data.ComparableObjectItem {
	public XIntervalDataItem(double x, double xLow, double xHigh, double y) {
		super(new java.lang.Double(x), new org.jfree.data.xy.YWithXInterval(y, xLow, xHigh));
	}

	public java.lang.Number getX() {
		return ((java.lang.Number) (getComparable()));
	}

	public double getYValue() {
		org.jfree.data.xy.YWithXInterval interval = ((org.jfree.data.xy.YWithXInterval) (getObject()));
		if (interval != null) {
			return interval.getY();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getXLowValue() {
		org.jfree.data.xy.YWithXInterval interval = ((org.jfree.data.xy.YWithXInterval) (getObject()));
		if (interval != null) {
			return interval.getXLow();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getXHighValue() {
		org.jfree.data.xy.YWithXInterval interval = ((org.jfree.data.xy.YWithXInterval) (getObject()));
		if (interval != null) {
			return interval.getXHigh();
		}else {
			return java.lang.Double.NaN;
		}
	}
}

