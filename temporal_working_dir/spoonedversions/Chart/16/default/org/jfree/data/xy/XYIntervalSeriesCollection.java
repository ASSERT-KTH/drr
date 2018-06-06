

package org.jfree.data.xy;


public class XYIntervalSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.data.xy.IntervalXYDataset {
	private java.util.List data;

	public XYIntervalSeriesCollection() {
		org.jfree.data.xy.XYIntervalSeriesCollection.this.data = new java.util.ArrayList();
	}

	public void addSeries(org.jfree.data.xy.XYIntervalSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.xy.XYIntervalSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.XYIntervalSeriesCollection.this);
		fireDatasetChanged();
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.XYIntervalSeriesCollection.this.data.size();
	}

	public org.jfree.data.xy.XYIntervalSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getX(item);
	}

	public double getStartXValue(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getXLowValue(item);
	}

	public double getEndXValue(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getXHighValue(item);
	}

	public double getYValue(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getYValue(item);
	}

	public double getStartYValue(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getYLowValue(item);
	}

	public double getEndYValue(int series, int item) {
		org.jfree.data.xy.XYIntervalSeries s = ((org.jfree.data.xy.XYIntervalSeries) (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.get(series)));
		return s.getYHighValue(item);
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getYValue(series, item));
	}

	public java.lang.Number getStartX(int series, int item) {
		return new java.lang.Double(getStartXValue(series, item));
	}

	public java.lang.Number getEndX(int series, int item) {
		return new java.lang.Double(getEndXValue(series, item));
	}

	public java.lang.Number getStartY(int series, int item) {
		return new java.lang.Double(getStartYValue(series, item));
	}

	public java.lang.Number getEndY(int series, int item) {
		return new java.lang.Double(getEndYValue(series, item));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYIntervalSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYIntervalSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.XYIntervalSeriesCollection that = ((org.jfree.data.xy.XYIntervalSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XYIntervalSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYIntervalSeriesCollection clone = ((org.jfree.data.xy.XYIntervalSeriesCollection) (super.clone()));
		int seriesCount = getSeriesCount();
		clone.data = new java.util.ArrayList(seriesCount);
		for (int i = 0; i < (org.jfree.data.xy.XYIntervalSeriesCollection.this.data.size()); i++) {
			clone.data.set(i, getSeries(i).clone());
		}
		return clone;
	}
}

