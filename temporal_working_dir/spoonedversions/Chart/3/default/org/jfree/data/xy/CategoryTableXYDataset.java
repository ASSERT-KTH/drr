

package org.jfree.data.xy;


public class CategoryTableXYDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.TableXYDataset {
	private org.jfree.data.DefaultKeyedValues2D values;

	private org.jfree.data.xy.IntervalXYDelegate intervalDelegate;

	public CategoryTableXYDataset() {
		org.jfree.data.xy.CategoryTableXYDataset.this.values = new org.jfree.data.DefaultKeyedValues2D(true);
		org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate = new org.jfree.data.xy.IntervalXYDelegate(org.jfree.data.xy.CategoryTableXYDataset.this);
		addChangeListener(org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate);
	}

	public void add(double x, double y, java.lang.String seriesName) {
		add(new java.lang.Double(x), new java.lang.Double(y), seriesName, true);
	}

	public void add(java.lang.Number x, java.lang.Number y, java.lang.String seriesName, boolean notify) {
		org.jfree.data.xy.CategoryTableXYDataset.this.values.addValue(y, ((java.lang.Comparable) (x)), seriesName);
		if (notify) {
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public void remove(double x, java.lang.String seriesName) {
		remove(new java.lang.Double(x), seriesName, true);
	}

	public void remove(java.lang.Number x, java.lang.String seriesName, boolean notify) {
		org.jfree.data.xy.CategoryTableXYDataset.this.values.removeValue(((java.lang.Comparable) (x)), seriesName);
		if (notify) {
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.CategoryTableXYDataset.this.values.getColumnCount();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.values.getColumnKey(series);
	}

	public int getItemCount() {
		return org.jfree.data.xy.CategoryTableXYDataset.this.values.getRowCount();
	}

	public int getItemCount(int series) {
		return getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		return ((java.lang.Number) (org.jfree.data.xy.CategoryTableXYDataset.this.values.getRowKey(item)));
	}

	public java.lang.Number getStartX(int series, int item) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getStartX(series, item);
	}

	public java.lang.Number getEndX(int series, int item) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getEndX(series, item);
	}

	public java.lang.Number getY(int series, int item) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.values.getValue(item, series);
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public double getDomainLowerBound(boolean includeInterval) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getDomainLowerBound(includeInterval);
	}

	public double getDomainUpperBound(boolean includeInterval) {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getDomainUpperBound(includeInterval);
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getDomainBounds(includeInterval);
		}else {
			return org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.CategoryTableXYDataset.this, includeInterval);
		}
	}

	public double getIntervalPositionFactor() {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getIntervalPositionFactor();
	}

	public void setIntervalPositionFactor(double d) {
		org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.setIntervalPositionFactor(d);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public double getIntervalWidth() {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.getIntervalWidth();
	}

	public void setIntervalWidth(double d) {
		org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.setFixedIntervalWidth(d);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean isAutoWidth() {
		return org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.isAutoWidth();
	}

	public void setAutoWidth(boolean b) {
		org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.setAutoWidth(b);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.xy.CategoryTableXYDataset)) {
			return false;
		}
		org.jfree.data.xy.CategoryTableXYDataset that = ((org.jfree.data.xy.CategoryTableXYDataset) (obj));
		if (!(org.jfree.data.xy.CategoryTableXYDataset.this.intervalDelegate.equals(that.intervalDelegate))) {
			return false;
		}
		if (!(org.jfree.data.xy.CategoryTableXYDataset.this.values.equals(that.values))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.CategoryTableXYDataset clone = ((org.jfree.data.xy.CategoryTableXYDataset) (super.clone()));
		clone.values = ((org.jfree.data.DefaultKeyedValues2D) (org.jfree.data.xy.CategoryTableXYDataset.this.values.clone()));
		clone.intervalDelegate = new org.jfree.data.xy.IntervalXYDelegate(clone);
		clone.intervalDelegate.setFixedIntervalWidth(getIntervalWidth());
		clone.intervalDelegate.setAutoWidth(isAutoWidth());
		clone.intervalDelegate.setIntervalPositionFactor(getIntervalPositionFactor());
		return clone;
	}
}

