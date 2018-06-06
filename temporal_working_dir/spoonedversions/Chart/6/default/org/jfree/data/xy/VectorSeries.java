

package org.jfree.data.xy;


public class VectorSeries extends org.jfree.data.ComparableObjectSeries {
	public VectorSeries(java.lang.Comparable key) {
		this(key, false, true);
	}

	public VectorSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key, autoSort, allowDuplicateXValues);
	}

	public void add(double x, double y, double deltaX, double deltaY) {
		super.add(new org.jfree.data.xy.VectorDataItem(x, y, deltaX, deltaY), true);
	}

	public org.jfree.data.ComparableObjectItem remove(int index) {
		org.jfree.data.xy.VectorDataItem result = ((org.jfree.data.xy.VectorDataItem) (org.jfree.data.xy.VectorSeries.this.data.remove(index)));
		fireSeriesChanged();
		return result;
	}

	public double getXValue(int index) {
		org.jfree.data.xy.VectorDataItem item = ((org.jfree.data.xy.VectorDataItem) (org.jfree.data.xy.VectorSeries.this.getDataItem(index)));
		return item.getXValue();
	}

	public double getYValue(int index) {
		org.jfree.data.xy.VectorDataItem item = ((org.jfree.data.xy.VectorDataItem) (getDataItem(index)));
		return item.getYValue();
	}

	public double getVectorXValue(int index) {
		org.jfree.data.xy.VectorDataItem item = ((org.jfree.data.xy.VectorDataItem) (getDataItem(index)));
		return item.getVectorX();
	}

	public double getVectorYValue(int index) {
		org.jfree.data.xy.VectorDataItem item = ((org.jfree.data.xy.VectorDataItem) (getDataItem(index)));
		return item.getVectorY();
	}

	public org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return super.getDataItem(index);
	}
}

