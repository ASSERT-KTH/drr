

package org.jfree.data.xy;


public class VectorSeriesCollection extends org.jfree.data.xy.AbstractXYDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.VectorXYDataset {
	private java.util.List data;

	public VectorSeriesCollection() {
		org.jfree.data.xy.VectorSeriesCollection.this.data = new java.util.ArrayList();
	}

	public void addSeries(org.jfree.data.xy.VectorSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.xy.VectorSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.VectorSeriesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean removeSeries(org.jfree.data.xy.VectorSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		boolean removed = org.jfree.data.xy.VectorSeriesCollection.this.data.remove(series);
		if (removed) {
			series.removeChangeListener(org.jfree.data.xy.VectorSeriesCollection.this);
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
		return removed;
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.VectorSeriesCollection.this.data.size()); i++) {
			org.jfree.data.xy.VectorSeries series = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.xy.VectorSeriesCollection.this);
		}
		org.jfree.data.xy.VectorSeriesCollection.this.data.clear();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.VectorSeriesCollection.this.data.size();
	}

	public org.jfree.data.xy.VectorSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int indexOf(org.jfree.data.xy.VectorSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		return org.jfree.data.xy.VectorSeriesCollection.this.data.indexOf(series);
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public double getXValue(int series, int item) {
		org.jfree.data.xy.VectorSeries s = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.VectorDataItem di = ((org.jfree.data.xy.VectorDataItem) (s.getDataItem(item)));
		return di.getXValue();
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public double getYValue(int series, int item) {
		org.jfree.data.xy.VectorSeries s = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.VectorDataItem di = ((org.jfree.data.xy.VectorDataItem) (s.getDataItem(item)));
		return di.getYValue();
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getYValue(series, item));
	}

	public org.jfree.data.xy.Vector getVector(int series, int item) {
		org.jfree.data.xy.VectorSeries s = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.VectorDataItem di = ((org.jfree.data.xy.VectorDataItem) (s.getDataItem(item)));
		return di.getVector();
	}

	public double getVectorXValue(int series, int item) {
		org.jfree.data.xy.VectorSeries s = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.VectorDataItem di = ((org.jfree.data.xy.VectorDataItem) (s.getDataItem(item)));
		return di.getVectorX();
	}

	public double getVectorYValue(int series, int item) {
		org.jfree.data.xy.VectorSeries s = ((org.jfree.data.xy.VectorSeries) (org.jfree.data.xy.VectorSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.VectorDataItem di = ((org.jfree.data.xy.VectorDataItem) (s.getDataItem(item)));
		return di.getVectorY();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.VectorSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.VectorSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.VectorSeriesCollection that = ((org.jfree.data.xy.VectorSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.VectorSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.VectorSeriesCollection clone = ((org.jfree.data.xy.VectorSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.VectorSeriesCollection.this.data)));
		return clone;
	}
}

