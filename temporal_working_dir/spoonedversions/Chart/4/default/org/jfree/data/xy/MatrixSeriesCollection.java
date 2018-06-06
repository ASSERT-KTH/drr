

package org.jfree.data.xy;


public class MatrixSeriesCollection extends org.jfree.data.xy.AbstractXYZDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.XYZDataset {
	private static final long serialVersionUID = -3197705779242543945L;

	private java.util.List seriesList;

	public MatrixSeriesCollection() {
		this(null);
	}

	public MatrixSeriesCollection(org.jfree.data.xy.MatrixSeries series) {
		org.jfree.data.xy.MatrixSeriesCollection.this.seriesList = new java.util.ArrayList();
		if (series != null) {
			org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.add(series);
			series.addChangeListener(org.jfree.data.xy.MatrixSeriesCollection.this);
		}
	}

	public int getItemCount(int seriesIndex) {
		return getSeries(seriesIndex).getItemCount();
	}

	public org.jfree.data.xy.MatrixSeries getSeries(int seriesIndex) {
		if ((seriesIndex < 0) || (seriesIndex > (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Index outside valid range.");
		}
		org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(seriesIndex)));
		return series;
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.size();
	}

	public java.lang.Comparable getSeriesKey(int seriesIndex) {
		return getSeries(seriesIndex).getKey();
	}

	public java.lang.Number getX(int seriesIndex, int itemIndex) {
		org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(seriesIndex)));
		int x = series.getItemColumn(itemIndex);
		return new java.lang.Integer(x);
	}

	public java.lang.Number getY(int seriesIndex, int itemIndex) {
		org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(seriesIndex)));
		int y = series.getItemRow(itemIndex);
		return new java.lang.Integer(y);
	}

	public java.lang.Number getZ(int seriesIndex, int itemIndex) {
		org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(seriesIndex)));
		java.lang.Number z = series.getItem(itemIndex);
		return z;
	}

	public void addSeries(org.jfree.data.xy.MatrixSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Cannot add null series.");
		}
		org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.add(series);
		series.addChangeListener(org.jfree.data.xy.MatrixSeriesCollection.this);
		fireDatasetChanged();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.data.xy.MatrixSeriesCollection.this)) {
			return true;
		}
		if (obj instanceof org.jfree.data.xy.MatrixSeriesCollection) {
			org.jfree.data.xy.MatrixSeriesCollection c = ((org.jfree.data.xy.MatrixSeriesCollection) (obj));
			return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.MatrixSeriesCollection.this.seriesList, c.seriesList);
		}
		return false;
	}

	public int hashCode() {
		return (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList) != null ? org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.hashCode() : 0;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.MatrixSeriesCollection clone = ((org.jfree.data.xy.MatrixSeriesCollection) (super.clone()));
		clone.seriesList = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.MatrixSeriesCollection.this.seriesList)));
		return clone;
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.size()); i++) {
			org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(i)));
			series.removeChangeListener(org.jfree.data.xy.MatrixSeriesCollection.this);
		}
		org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.clear();
		fireDatasetChanged();
	}

	public void removeSeries(org.jfree.data.xy.MatrixSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Cannot remove null series.");
		}
		if (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.contains(series)) {
			series.removeChangeListener(org.jfree.data.xy.MatrixSeriesCollection.this);
			org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.remove(series);
			fireDatasetChanged();
		}
	}

	public void removeSeries(int seriesIndex) {
		if ((seriesIndex < 0) || (seriesIndex > (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Index outside valid range.");
		}
		org.jfree.data.xy.MatrixSeries series = ((org.jfree.data.xy.MatrixSeries) (org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.get(seriesIndex)));
		series.removeChangeListener(org.jfree.data.xy.MatrixSeriesCollection.this);
		org.jfree.data.xy.MatrixSeriesCollection.this.seriesList.remove(seriesIndex);
		fireDatasetChanged();
	}
}

