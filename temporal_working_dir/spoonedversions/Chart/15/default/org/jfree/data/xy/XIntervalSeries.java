

package org.jfree.data.xy;


public class XIntervalSeries extends org.jfree.data.ComparableObjectSeries {
	public XIntervalSeries(java.lang.Comparable key) {
		this(key, true, true);
	}

	public XIntervalSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key, autoSort, allowDuplicateXValues);
	}

	public void add(double x, double xLow, double xHigh, double y) {
		super.add(new org.jfree.data.xy.XIntervalDataItem(x, xLow, xHigh, y), true);
	}

	public java.lang.Number getX(int index) {
		org.jfree.data.xy.XIntervalDataItem item = ((org.jfree.data.xy.XIntervalDataItem) (getDataItem(index)));
		return item.getX();
	}

	public double getYValue(int index) {
		org.jfree.data.xy.XIntervalDataItem item = ((org.jfree.data.xy.XIntervalDataItem) (getDataItem(index)));
		return item.getYValue();
	}

	public org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return super.getDataItem(index);
	}
}

