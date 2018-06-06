

package org.jfree.data.xy;


public class XYIntervalSeries extends org.jfree.data.ComparableObjectSeries {
	public XYIntervalSeries(java.lang.Comparable key) {
		this(key, true, true);
	}

	public XYIntervalSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key, autoSort, allowDuplicateXValues);
	}

	public void add(double x, double xLow, double xHigh, double y, double yLow, double yHigh) {
		super.add(new org.jfree.data.xy.XYIntervalDataItem(x, xLow, xHigh, y, yLow, yHigh), true);
	}

	public java.lang.Number getX(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getX();
	}

	public double getXLowValue(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getXLowValue();
	}

	public double getXHighValue(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getXHighValue();
	}

	public double getYValue(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getYValue();
	}

	public double getYLowValue(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getYLowValue();
	}

	public double getYHighValue(int index) {
		org.jfree.data.xy.XYIntervalDataItem item = ((org.jfree.data.xy.XYIntervalDataItem) (getDataItem(index)));
		return item.getYHighValue();
	}

	public org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return super.getDataItem(index);
	}
}

