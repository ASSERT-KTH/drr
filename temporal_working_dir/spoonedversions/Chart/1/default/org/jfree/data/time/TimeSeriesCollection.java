

package org.jfree.data.time;


public class TimeSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.SelectableXYDataset , org.jfree.data.xy.XYDataset , org.jfree.data.xy.XYDatasetSelectionState , org.jfree.data.xy.XYDomainInfo , org.jfree.data.xy.XYRangeInfo {
	private static final long serialVersionUID = 834149929022371137L;

	private java.util.List data;

	private java.util.Calendar workingCalendar;

	private org.jfree.data.time.TimePeriodAnchor xPosition;

	public TimeSeriesCollection() {
		this(null, java.util.TimeZone.getDefault());
	}

	public TimeSeriesCollection(java.util.TimeZone zone) {
		this(null, zone);
	}

	public TimeSeriesCollection(org.jfree.data.time.TimeSeries series) {
		this(series, java.util.TimeZone.getDefault());
	}

	public TimeSeriesCollection(org.jfree.data.time.TimeSeries series, java.util.TimeZone zone) {
		super();
		if (zone == null) {
			zone = java.util.TimeZone.getDefault();
		}
		org.jfree.data.time.TimeSeriesCollection.this.workingCalendar = java.util.Calendar.getInstance(zone);
		org.jfree.data.time.TimeSeriesCollection.this.data = new java.util.ArrayList();
		if (series != null) {
			org.jfree.data.time.TimeSeriesCollection.this.data.add(series);
			series.addChangeListener(org.jfree.data.time.TimeSeriesCollection.this);
		}
		org.jfree.data.time.TimeSeriesCollection.this.xPosition = org.jfree.data.time.TimePeriodAnchor.START;
		setSelectionState(org.jfree.data.time.TimeSeriesCollection.this);
	}

	public org.jfree.data.DomainOrder getDomainOrder() {
		return org.jfree.data.DomainOrder.ASCENDING;
	}

	public org.jfree.data.time.TimePeriodAnchor getXPosition() {
		return org.jfree.data.time.TimeSeriesCollection.this.xPosition;
	}

	public void setXPosition(org.jfree.data.time.TimePeriodAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.data.time.TimeSeriesCollection.this.xPosition = anchor;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public java.util.List getSeries() {
		return java.util.Collections.unmodifiableList(org.jfree.data.time.TimeSeriesCollection.this.data);
	}

	public int getSeriesCount() {
		return org.jfree.data.time.TimeSeriesCollection.this.data.size();
	}

	public int indexOf(org.jfree.data.time.TimeSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		return org.jfree.data.time.TimeSeriesCollection.this.data.indexOf(series);
	}

	public org.jfree.data.time.TimeSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException((("The 'series' argument is out of bounds (" + series) + ")."));
		}
		return ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
	}

	public org.jfree.data.time.TimeSeries getSeries(java.lang.Comparable key) {
		org.jfree.data.time.TimeSeries result = null;
		java.util.Iterator iterator = org.jfree.data.time.TimeSeriesCollection.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.time.TimeSeries series = ((org.jfree.data.time.TimeSeries) (iterator.next()));
			java.lang.Comparable k = series.getKey();
			if ((k != null) && (k.equals(key))) {
				result = series;
			}
		} 
		return result;
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public void addSeries(org.jfree.data.time.TimeSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.time.TimeSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.time.TimeSeriesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(org.jfree.data.time.TimeSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.time.TimeSeriesCollection.this.data.remove(series);
		series.removeChangeListener(org.jfree.data.time.TimeSeriesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(int index) {
		org.jfree.data.time.TimeSeries series = getSeries(index);
		if (series != null) {
			removeSeries(series);
		}
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.time.TimeSeriesCollection.this.data.size()); i++) {
			org.jfree.data.time.TimeSeries series = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.time.TimeSeriesCollection.this);
		}
		org.jfree.data.time.TimeSeriesCollection.this.data.clear();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public double getXValue(int series, int item) {
		org.jfree.data.time.TimeSeries s = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
		org.jfree.data.time.RegularTimePeriod period = s.getTimePeriod(item);
		return getX(period);
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.time.TimeSeries ts = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
		org.jfree.data.time.RegularTimePeriod period = ts.getTimePeriod(item);
		return new java.lang.Long(getX(period));
	}

	protected synchronized long getX(org.jfree.data.time.RegularTimePeriod period) {
		long result = 0L;
		if ((org.jfree.data.time.TimeSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.START)) {
			result = period.getFirstMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar);
		}else
			if ((org.jfree.data.time.TimeSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
				result = period.getMiddleMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar);
			}else
				if ((org.jfree.data.time.TimeSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.END)) {
					result = period.getLastMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar);
				}
			
		
		return result;
	}

	public synchronized java.lang.Number getStartX(int series, int item) {
		org.jfree.data.time.TimeSeries ts = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
		return new java.lang.Long(ts.getTimePeriod(item).getFirstMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar));
	}

	public synchronized java.lang.Number getEndX(int series, int item) {
		org.jfree.data.time.TimeSeries ts = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
		return new java.lang.Long(ts.getTimePeriod(item).getLastMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar));
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.time.TimeSeries ts = ((org.jfree.data.time.TimeSeries) (org.jfree.data.time.TimeSeriesCollection.this.data.get(series)));
		return ts.getValue(item);
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public boolean isSelected(int series, int item) {
		org.jfree.data.time.TimeSeries s = getSeries(series);
		org.jfree.data.time.TimeSeriesDataItem i = s.getRawDataItem(item);
		return i.isSelected();
	}

	public void setSelected(int series, int item, boolean selected) {
		setSelected(series, item, selected, true);
	}

	public void setSelected(int series, int item, boolean selected, boolean notify) {
		org.jfree.data.time.TimeSeries s = getSeries(series);
		org.jfree.data.time.TimeSeriesDataItem i = s.getRawDataItem(item);
		i.setSelected(selected);
		if (notify) {
			fireSelectionEvent();
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

	public void fireSelectionEvent() {
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int[] getSurroundingItems(int series, long milliseconds) {
		int[] result = new int[]{ -1 , -1 };
		org.jfree.data.time.TimeSeries timeSeries = getSeries(series);
		for (int i = 0; i < (timeSeries.getItemCount()); i++) {
			java.lang.Number x = getX(series, i);
			long m = x.longValue();
			if (m <= milliseconds) {
				result[0] = i;
			}
			if (m >= milliseconds) {
				result[1] = i;
				break;
			}
		}
		return result;
	}

	public double getDomainLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		org.jfree.data.Range r = getDomainBounds(includeInterval);
		if (r != null) {
			result = r.getLowerBound();
		}
		return result;
	}

	public double getDomainUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		org.jfree.data.Range r = getDomainBounds(includeInterval);
		if (r != null) {
			result = r.getUpperBound();
		}
		return result;
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		org.jfree.data.Range result = null;
		java.util.Iterator iterator = org.jfree.data.time.TimeSeriesCollection.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.time.TimeSeries series = ((org.jfree.data.time.TimeSeries) (iterator.next()));
			int count = series.getItemCount();
			if (count > 0) {
				org.jfree.data.time.RegularTimePeriod start = series.getTimePeriod(0);
				org.jfree.data.time.RegularTimePeriod end = series.getTimePeriod((count - 1));
				org.jfree.data.Range temp;
				if (!includeInterval) {
					temp = new org.jfree.data.Range(getX(start), getX(end));
				}else {
					temp = new org.jfree.data.Range(start.getFirstMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar), end.getLastMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar));
				}
				result = org.jfree.data.Range.combine(result, temp);
			}
		} 
		return result;
	}

	public org.jfree.data.Range getDomainBounds(java.util.List visibleSeriesKeys, boolean includeInterval) {
		org.jfree.data.Range result = null;
		java.util.Iterator iterator = visibleSeriesKeys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable seriesKey = ((java.lang.Comparable) (iterator.next()));
			org.jfree.data.time.TimeSeries series = getSeries(seriesKey);
			int count = series.getItemCount();
			if (count > 0) {
				org.jfree.data.time.RegularTimePeriod start = series.getTimePeriod(0);
				org.jfree.data.time.RegularTimePeriod end = series.getTimePeriod((count - 1));
				org.jfree.data.Range temp;
				if (!includeInterval) {
					temp = new org.jfree.data.Range(getX(start), getX(end));
				}else {
					temp = new org.jfree.data.Range(start.getFirstMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar), end.getLastMillisecond(org.jfree.data.time.TimeSeriesCollection.this.workingCalendar));
				}
				result = org.jfree.data.Range.combine(result, temp);
			}
		} 
		return result;
	}

	public org.jfree.data.Range getRangeBounds(java.util.List visibleSeriesKeys, org.jfree.data.Range xRange, boolean includeInterval) {
		org.jfree.data.Range result = null;
		java.util.Iterator iterator = visibleSeriesKeys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable seriesKey = ((java.lang.Comparable) (iterator.next()));
			org.jfree.data.time.TimeSeries series = getSeries(seriesKey);
			org.jfree.data.Range r = null;
			r = new org.jfree.data.Range(series.getMinY(), series.getMaxY());
			result = org.jfree.data.Range.combine(result, r);
		} 
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.TimeSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimeSeriesCollection)) {
			return false;
		}
		org.jfree.data.time.TimeSeriesCollection that = ((org.jfree.data.time.TimeSeriesCollection) (obj));
		if ((org.jfree.data.time.TimeSeriesCollection.this.xPosition) != (that.xPosition)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimeSeriesCollection.this.data, that.data))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.time.TimeSeriesCollection.this.data.hashCode();
		result = (29 * result) + ((org.jfree.data.time.TimeSeriesCollection.this.workingCalendar) != null ? org.jfree.data.time.TimeSeriesCollection.this.workingCalendar.hashCode() : 0);
		result = (29 * result) + ((org.jfree.data.time.TimeSeriesCollection.this.xPosition) != null ? org.jfree.data.time.TimeSeriesCollection.this.xPosition.hashCode() : 0);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.time.TimeSeriesCollection clone = ((org.jfree.data.time.TimeSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.time.TimeSeriesCollection.this.data)));
		clone.workingCalendar = ((java.util.Calendar) (org.jfree.data.time.TimeSeriesCollection.this.workingCalendar.clone()));
		return clone;
	}
}

