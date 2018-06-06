

package org.jfree.data.xy;


public class XYSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.RangeInfo , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.SelectableXYDataset , org.jfree.data.xy.XYDatasetSelectionState {
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
		setSelectionState(org.jfree.data.xy.XYSeriesCollection.this);
	}

	public org.jfree.data.DomainOrder getDomainOrder() {
		int seriesCount = getSeriesCount();
		for (int i = 0; i < seriesCount; i++) {
			org.jfree.data.xy.XYSeries s = getSeries(i);
			if (!(s.getAutoSort())) {
				return org.jfree.data.DomainOrder.NONE;
			}
		}
		return org.jfree.data.DomainOrder.ASCENDING;
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
		org.jfree.data.xy.XYSeries s = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
		return s.getX(item);
	}

	public java.lang.Number getStartX(int series, int item) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getStartX(series, item);
	}

	public java.lang.Number getEndX(int series, int item) {
		return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getEndX(series, item);
	}

	public java.lang.Number getY(int series, int index) {
		org.jfree.data.xy.XYSeries s = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.XYSeriesCollection.this.data.get(series)));
		return s.getY(index);
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public boolean isSelected(int series, int item) {
		org.jfree.data.xy.XYSeries s = getSeries(series);
		org.jfree.data.xy.XYDataItem i = s.getRawDataItem(item);
		return i.isSelected();
	}

	public void setSelected(int series, int item, boolean selected) {
		setSelected(series, item, selected, true);
	}

	public void setSelected(int series, int item, boolean selected, boolean notify) {
		org.jfree.data.xy.XYSeries s = getSeries(series);
		org.jfree.data.xy.XYDataItem i = s.getRawDataItem(item);
		i.setSelected(selected);
		if (notify) {
			fireDatasetChanged();
		}
	}

	public void clearSelection() {
		int seriesCount = getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			int itemCount = getItemCount(s);
			for (int i = 0; i < itemCount; i++) {
				setSelected(s, i, false, false);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYSeriesCollection)) {
			return false;
		}
		org.jfree.data.xy.XYSeriesCollection that = ((org.jfree.data.xy.XYSeriesCollection) (obj));
		if (!(org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.equals(that.intervalDelegate))) {
			return false;
		}
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XYSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYSeriesCollection clone = ((org.jfree.data.xy.XYSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.XYSeriesCollection.this.data)));
		clone.intervalDelegate = ((org.jfree.data.xy.IntervalXYDelegate) (org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.clone()));
		return clone;
	}

	public int hashCode() {
		int hash = 5;
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.data.xy.XYSeriesCollection.this.data);
		return hash;
	}

	public double getDomainLowerBound(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainLowerBound(includeInterval);
		}else {
			double result = java.lang.Double.NaN;
			int seriesCount = getSeriesCount();
			for (int s = 0; s < seriesCount; s++) {
				org.jfree.data.xy.XYSeries series = getSeries(s);
				double lowX = series.getMinX();
				if (java.lang.Double.isNaN(result)) {
					result = lowX;
				}else {
					if (!(java.lang.Double.isNaN(lowX))) {
						result = java.lang.Math.min(result, lowX);
					}
				}
			}
			return result;
		}
	}

	public double getDomainUpperBound(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainUpperBound(includeInterval);
		}else {
			double result = java.lang.Double.NaN;
			int seriesCount = getSeriesCount();
			for (int s = 0; s < seriesCount; s++) {
				org.jfree.data.xy.XYSeries series = getSeries(s);
				double hiX = series.getMaxX();
				if (java.lang.Double.isNaN(result)) {
					result = hiX;
				}else {
					if (!(java.lang.Double.isNaN(hiX))) {
						result = java.lang.Math.max(result, hiX);
					}
				}
			}
			return result;
		}
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.XYSeriesCollection.this.intervalDelegate.getDomainBounds(includeInterval);
		}else {
			double lower = java.lang.Double.POSITIVE_INFINITY;
			double upper = java.lang.Double.NEGATIVE_INFINITY;
			int seriesCount = getSeriesCount();
			for (int s = 0; s < seriesCount; s++) {
				org.jfree.data.xy.XYSeries series = getSeries(s);
				double minX = series.getMinX();
				if (!(java.lang.Double.isNaN(minX))) {
					lower = java.lang.Math.min(lower, minX);
				}
				double maxX = series.getMaxX();
				if (!(java.lang.Double.isNaN(maxX))) {
					upper = java.lang.Math.max(upper, maxX);
				}
			}
			if (lower > upper) {
				return null;
			}else {
				return new org.jfree.data.Range(lower, upper);
			}
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

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		double lower = java.lang.Double.POSITIVE_INFINITY;
		double upper = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			org.jfree.data.xy.XYSeries series = getSeries(s);
			double minY = series.getMinY();
			if (!(java.lang.Double.isNaN(minY))) {
				lower = java.lang.Math.min(lower, minY);
			}
			double maxY = series.getMaxY();
			if (!(java.lang.Double.isNaN(maxY))) {
				upper = java.lang.Math.max(upper, maxY);
			}
		}
		if (lower > upper) {
			return null;
		}else {
			return new org.jfree.data.Range(lower, upper);
		}
	}

	public double getRangeLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		int seriesCount = getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			org.jfree.data.xy.XYSeries series = getSeries(s);
			double lowY = series.getMinY();
			if (java.lang.Double.isNaN(result)) {
				result = lowY;
			}else {
				if (!(java.lang.Double.isNaN(lowY))) {
					result = java.lang.Math.min(result, lowY);
				}
			}
		}
		return result;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		int seriesCount = getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			org.jfree.data.xy.XYSeries series = getSeries(s);
			double hiY = series.getMaxY();
			if (java.lang.Double.isNaN(result)) {
				result = hiY;
			}else {
				if (!(java.lang.Double.isNaN(hiY))) {
					result = java.lang.Math.max(result, hiY);
				}
			}
		}
		return result;
	}
}

