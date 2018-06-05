

package org.jfree.data.xy;


public class XIntervalSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.IntervalXYDataset {
	private java.util.List data;

	public XIntervalSeriesCollection() {
		org.jfree.data.xy.XIntervalSeriesCollection.this.data = new java.util.ArrayList();
	}

	public void addSeries(org.jfree.data.xy.XIntervalSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.xy.XIntervalSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.XIntervalSeriesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.XIntervalSeriesCollection.this.data.size();
	}

	public org.jfree.data.xy.XIntervalSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XIntervalDataItem di = ((org.jfree.data.xy.XIntervalDataItem) (s.getDataItem(item)));
		return di.getX();
	}

	public double getStartXValue(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		return s.getXLowValue(item);
	}

	public double getEndXValue(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		return s.getXHighValue(item);
	}

	public double getYValue(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		return s.getYValue(item);
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XIntervalDataItem di = ((org.jfree.data.xy.XIntervalDataItem) (s.getDataItem(item)));
		return new java.lang.Double(di.getYValue());
	}

	public java.lang.Number getStartX(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XIntervalDataItem di = ((org.jfree.data.xy.XIntervalDataItem) (s.getDataItem(item)));
		return new java.lang.Double(di.getXLowValue());
	}

	public java.lang.Number getEndX(int series, int item) {
		org.jfree.data.xy.XIntervalSeries s = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XIntervalDataItem di = ((org.jfree.data.xy.XIntervalDataItem) (s.getDataItem(item)));
		return new java.lang.Double(di.getXHighValue());
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public void removeSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds.");
		}
		org.jfree.data.xy.XIntervalSeries ts = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(series)));
		ts.removeChangeListener(org.jfree.data.xy.XIntervalSeriesCollection.this);
		org.jfree.data.xy.XIntervalSeriesCollection.this.data.remove(series);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(org.jfree.data.xy.XIntervalSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (org.jfree.data.xy.XIntervalSeriesCollection.this.data.contains(series)) {
			series.removeChangeListener(org.jfree.data.xy.XIntervalSeriesCollection.this);
			org.jfree.data.xy.XIntervalSeriesCollection.this.data.remove(series);
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.XIntervalSeriesCollection.this.data.size()); i++) {
			org.jfree.data.xy.XIntervalSeries series = ((org.jfree.data.xy.XIntervalSeries) (org.jfree.data.xy.XIntervalSeriesCollection.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.xy.XIntervalSeriesCollection.this);
		}
		org.jfree.data.xy.XIntervalSeriesCollection.this.data.clear();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XIntervalSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XIntervalSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.XIntervalSeriesCollection that = ((org.jfree.data.xy.XIntervalSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XIntervalSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XIntervalSeriesCollection clone = ((org.jfree.data.xy.XIntervalSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.XIntervalSeriesCollection.this.data)));
		return clone;
	}
}

