

package org.jfree.data.xy;


public class XYSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset {
	private static final long serialVersionUID = -7590013825931496766L;

	private java.util.List data;

	private org.jfree.data.xy.IntervalXYDelegate intervalDelegate;

	public XYSeriesCollection() {
		this(null);
	}

	public XYSeriesCollection(org.jfree.data.xy.XYSeries series) {
		org.jfree.data.xy.XYSeriesCollection.this.data = new java.util.ArrayList();
		org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate = new org.jfree.data.xy.IntervalXYDelegate(org.jfree.data.xy.XYSeriesCollection.this, false);
		addChangeListener(org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate);
		if (series != null) {
			org.jfree.data.xy.XYSeriesCollection.this.data.add(series);
			series.addChangeListener(org.jfree.data.xy.XYSeriesCollection.this);
		}
	}

	public void addSeries(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.xy.XYSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.XYSeriesCollection.this);
		fireDatasetChanged();
	}

	public void removeSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds.");
		}
		org.jfree.data.xy.XYSeries ts = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
		ts.removeChangeListener(org.jfree.data.xy.XYSeriesCollection.this);
		org.jfree.data.xy.XYSeriesCollection.this.data.remove(series);
		fireDatasetChanged();
	}

	public void removeSeries(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (org.jfree.data.xy.XYSeriesCollection.this.data.contains(series)) {
			series.removeChangeListener(org.jfree.data.xy.XYSeriesCollection.this);
			org.jfree.data.xy.XYSeriesCollection.this.data.remove(series);
			fireDatasetChanged();
		}
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.XYSeriesCollection.this.data.size()); i++) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.xy.XYSeriesCollection.this);
		}
		org.jfree.data.xy.XYSeriesCollection.this.data.clear();
		fireDatasetChanged();
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.XYSeriesCollection.this.data.size();
	}

	public java.util.List getSeries() {
		return java.util.Collections.unmodifiableList(org.jfree.data.xy.XYSeriesCollection.this.data);
	}

	public int indexOf(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		return org.jfree.data.xy.XYSeriesCollection.this.data.indexOf(series);
	}

	public org.jfree.data.xy.XYSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
	}

	public org.jfree.data.xy.XYSeries getSeries(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		java.util.Iterator iterator = org.jfree.data.xy.XYSeriesCollection.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (iterator.next()));
			if (key.equals(series.getKey())) {
				return series;
			}
		} 
		throw new org.jfree.data.UnknownKeyException(("Key not found: " + key));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.xy.XYSeries ts = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XYDataItem xyItem = ts.getDataItem(item);
		return xyItem.getX();
	}

	public java.lang.Number getStartX(int series, int item) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getStartX(series, item);
	}

	public java.lang.Number getEndX(int series, int item) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getEndX(series, item);
	}

	public java.lang.Number getY(int series, int index) {
		org.jfree.data.xy.XYSeries ts = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
		org.jfree.data.xy.XYDataItem xyItem = ts.getDataItem(index);
		return xyItem.getY();
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.XYSeriesCollection that = ((org.jfree.data.xy.XYSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XYSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYSeriesCollection clone = ((org.jfree.data.xy.XYSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.XYSeriesCollection.this.data)));
		clone.intervalDelegate = ((org.jfree.data.xy.IntervalXYDelegate) (org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.clone()));
		return clone;
	}

	public int hashCode() {
		return (org.jfree.data.xy.XYSeriesCollection.this.data) != null ? org.jfree.data.xy.XYSeriesCollection.this.data.hashCode() : 0;
	}

	public double getDomainLowerBound(boolean includeInterval) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainLowerBound(includeInterval);
	}

	public double getDomainUpperBound(boolean includeInterval) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainUpperBound(includeInterval);
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainBounds(includeInterval);
		}else {
			return org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYSeriesCollection.this, includeInterval);
		}
	}

	public double getIntervalWidth() {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getIntervalWidth();
	}

	public void setIntervalWidth(double width) {
		if (width < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'width' argument.");
		}
		org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.setFixedIntervalWidth(width);
		fireDatasetChanged();
	}

	public double getIntervalPositionFactor() {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getIntervalPositionFactor();
	}

	public void setIntervalPositionFactor(double factor) {
		org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.setIntervalPositionFactor(factor);
		fireDatasetChanged();
	}

	public boolean isAutoWidth() {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.isAutoWidth();
	}

	public void setAutoWidth(boolean b) {
		org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.setAutoWidth(b);
		fireDatasetChanged();
	}
}

