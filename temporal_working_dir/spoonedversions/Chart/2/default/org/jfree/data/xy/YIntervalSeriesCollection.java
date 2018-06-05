

package org.jfree.data.xy;


public class YIntervalSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.IntervalXYDataset {
	private java.util.List data;

	public YIntervalSeriesCollection() {
		org.jfree.data.xy.YIntervalSeriesCollection.this.data = new java.util.ArrayList();
	}

	public void addSeries(org.jfree.data.xy.YIntervalSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.xy.YIntervalSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.YIntervalSeriesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.YIntervalSeriesCollection.this.data.size();
	}

	public org.jfree.data.xy.YIntervalSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return s.getX(item);
	}

	public double getYValue(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return s.getYValue(item);
	}

	public double getStartYValue(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return s.getYLowValue(item);
	}

	public double getEndYValue(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return s.getYHighValue(item);
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return new java.lang.Double(s.getYValue(item));
	}

	public java.lang.Number getStartX(int series, int item) {
		return getX(series, item);
	}

	public java.lang.Number getEndX(int series, int item) {
		return getX(series, item);
	}

	public java.lang.Number getStartY(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return new java.lang.Double(s.getYLowValue(item));
	}

	public java.lang.Number getEndY(int series, int item) {
		org.jfree.data.xy.YIntervalSeries s = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		return new java.lang.Double(s.getYHighValue(item));
	}

	public void removeSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds.");
		}
		org.jfree.data.xy.YIntervalSeries ts = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(series)));
		ts.removeChangeListener(org.jfree.data.xy.YIntervalSeriesCollection.this);
		org.jfree.data.xy.YIntervalSeriesCollection.this.data.remove(series);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(org.jfree.data.xy.YIntervalSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (org.jfree.data.xy.YIntervalSeriesCollection.this.data.contains(series)) {
			series.removeChangeListener(org.jfree.data.xy.YIntervalSeriesCollection.this);
			org.jfree.data.xy.YIntervalSeriesCollection.this.data.remove(series);
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.YIntervalSeriesCollection.this.data.size()); i++) {
			org.jfree.data.xy.YIntervalSeries series = ((org.jfree.data.xy.YIntervalSeries) (org.jfree.data.xy.YIntervalSeriesCollection.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.xy.YIntervalSeriesCollection.this);
		}
		org.jfree.data.xy.YIntervalSeriesCollection.this.data.clear();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.YIntervalSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.YIntervalSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.YIntervalSeriesCollection that = ((org.jfree.data.xy.YIntervalSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.YIntervalSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.YIntervalSeriesCollection clone = ((org.jfree.data.xy.YIntervalSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.YIntervalSeriesCollection.this.data)));
		return clone;
	}
}

