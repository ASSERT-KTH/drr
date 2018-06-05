

package org.jfree.data.xy;


public class YIntervalSeries extends org.jfree.data.ComparableObjectSeries {
	public YIntervalSeries(java.lang.Comparable key) {
		this(key, true, true);
	}

	public YIntervalSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key, autoSort, allowDuplicateXValues);
	}

	public void add(double x, double y, double yLow, double yHigh) {
		super.add(new org.jfree.data.xy.YIntervalDataItem(x, y, yLow, yHigh), true);
	}

	public java.lang.Number getX(int index) {
		org.jfree.data.xy.YIntervalDataItem item = ((org.jfree.data.xy.YIntervalDataItem) (getDataItem(index)));
		return item.getX();
	}

	public double getYValue(int index) {
		org.jfree.data.xy.YIntervalDataItem item = ((org.jfree.data.xy.YIntervalDataItem) (getDataItem(index)));
		return item.getYValue();
	}

	public double getYLowValue(int index) {
		org.jfree.data.xy.YIntervalDataItem item = ((org.jfree.data.xy.YIntervalDataItem) (getDataItem(index)));
		return item.getYLowValue();
	}

	public double getYHighValue(int index) {
		org.jfree.data.xy.YIntervalDataItem item = ((org.jfree.data.xy.YIntervalDataItem) (getDataItem(index)));
		return item.getYHighValue();
	}

	public org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return super.getDataItem(index);
	}
}

