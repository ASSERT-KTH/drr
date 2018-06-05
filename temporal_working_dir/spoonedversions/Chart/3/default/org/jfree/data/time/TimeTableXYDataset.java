

package org.jfree.data.time;


public class TimeTableXYDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.TableXYDataset {
	private org.jfree.data.DefaultKeyedValues2D values;

	private boolean domainIsPointsInTime;

	private org.jfree.data.time.TimePeriodAnchor xPosition;

	private java.util.Calendar workingCalendar;

	public TimeTableXYDataset() {
		this(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
	}

	public TimeTableXYDataset(java.util.TimeZone zone) {
		this(zone, java.util.Locale.getDefault());
	}

	public TimeTableXYDataset(java.util.TimeZone zone, java.util.Locale locale) {
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		if (locale == null) {
			throw new java.lang.IllegalArgumentException("Null 'locale' argument.");
		}
		org.jfree.data.time.TimeTableXYDataset.this.values = new org.jfree.data.DefaultKeyedValues2D(true);
		org.jfree.data.time.TimeTableXYDataset.this.workingCalendar = java.util.Calendar.getInstance(zone, locale);
		org.jfree.data.time.TimeTableXYDataset.this.xPosition = org.jfree.data.time.TimePeriodAnchor.START;
	}

	public boolean getDomainIsPointsInTime() {
		return org.jfree.data.time.TimeTableXYDataset.this.domainIsPointsInTime;
	}

	public void setDomainIsPointsInTime(boolean flag) {
		org.jfree.data.time.TimeTableXYDataset.this.domainIsPointsInTime = flag;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public org.jfree.data.time.TimePeriodAnchor getXPosition() {
		return org.jfree.data.time.TimeTableXYDataset.this.xPosition;
	}

	public void setXPosition(org.jfree.data.time.TimePeriodAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.data.time.TimeTableXYDataset.this.xPosition = anchor;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void add(org.jfree.data.time.TimePeriod period, double y, java.lang.String seriesName) {
		add(period, new java.lang.Double(y), seriesName, true);
	}

	public void add(org.jfree.data.time.TimePeriod period, java.lang.Number y, java.lang.String seriesName, boolean notify) {
		if (period instanceof org.jfree.data.time.RegularTimePeriod) {
			org.jfree.data.time.RegularTimePeriod p = ((org.jfree.data.time.RegularTimePeriod) (period));
			p.peg(org.jfree.data.time.TimeTableXYDataset.this.workingCalendar);
		}
		org.jfree.data.time.TimeTableXYDataset.this.values.addValue(y, period, seriesName);
		if (notify) {
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public void remove(org.jfree.data.time.TimePeriod period, java.lang.String seriesName) {
		remove(period, seriesName, true);
	}

	public void remove(org.jfree.data.time.TimePeriod period, java.lang.String seriesName, boolean notify) {
		org.jfree.data.time.TimeTableXYDataset.this.values.removeValue(period, seriesName);
		if (notify) {
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public void clear() {
		if ((org.jfree.data.time.TimeTableXYDataset.this.values.getRowCount()) > 0) {
			org.jfree.data.time.TimeTableXYDataset.this.values.clear();
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public org.jfree.data.time.TimePeriod getTimePeriod(int item) {
		return ((org.jfree.data.time.TimePeriod) (org.jfree.data.time.TimeTableXYDataset.this.values.getRowKey(item)));
	}

	public int getItemCount() {
		return org.jfree.data.time.TimeTableXYDataset.this.values.getRowCount();
	}

	public int getItemCount(int series) {
		return getItemCount();
	}

	public int getSeriesCount() {
		return org.jfree.data.time.TimeTableXYDataset.this.values.getColumnCount();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.time.TimeTableXYDataset.this.values.getColumnKey(series);
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public double getXValue(int series, int item) {
		org.jfree.data.time.TimePeriod period = ((org.jfree.data.time.TimePeriod) (org.jfree.data.time.TimeTableXYDataset.this.values.getRowKey(item)));
		return getXValue(period);
	}

	public java.lang.Number getStartX(int series, int item) {
		return new java.lang.Double(getStartXValue(series, item));
	}

	public double getStartXValue(int series, int item) {
		org.jfree.data.time.TimePeriod period = ((org.jfree.data.time.TimePeriod) (org.jfree.data.time.TimeTableXYDataset.this.values.getRowKey(item)));
		return period.getStart().getTime();
	}

	public java.lang.Number getEndX(int series, int item) {
		return new java.lang.Double(getEndXValue(series, item));
	}

	public double getEndXValue(int series, int item) {
		org.jfree.data.time.TimePeriod period = ((org.jfree.data.time.TimePeriod) (org.jfree.data.time.TimeTableXYDataset.this.values.getRowKey(item)));
		return period.getEnd().getTime();
	}

	public java.lang.Number getY(int series, int item) {
		return org.jfree.data.time.TimeTableXYDataset.this.values.getValue(item, series);
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	private long getXValue(org.jfree.data.time.TimePeriod period) {
		long result = 0L;
		if ((org.jfree.data.time.TimeTableXYDataset.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.START)) {
			result = period.getStart().getTime();
		}else
			if ((org.jfree.data.time.TimeTableXYDataset.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
				long t0 = period.getStart().getTime();
				long t1 = period.getEnd().getTime();
				result = t0 + ((t1 - t0) / 2L);
			}else
				if ((org.jfree.data.time.TimeTableXYDataset.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.END)) {
					result = period.getEnd().getTime();
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
		java.util.List keys = org.jfree.data.time.TimeTableXYDataset.this.values.getRowKeys();
		if (keys.isEmpty()) {
			return null;
		}
		org.jfree.data.time.TimePeriod first = ((org.jfree.data.time.TimePeriod) (keys.get(0)));
		org.jfree.data.time.TimePeriod last = ((org.jfree.data.time.TimePeriod) (keys.get(((keys.size()) - 1))));
		if ((!includeInterval) || (org.jfree.data.time.TimeTableXYDataset.this.domainIsPointsInTime)) {
			return new org.jfree.data.Range(getXValue(first), getXValue(last));
		}else {
			return new org.jfree.data.Range(first.getStart().getTime(), last.getEnd().getTime());
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.TimeTableXYDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimeTableXYDataset)) {
			return false;
		}
		org.jfree.data.time.TimeTableXYDataset that = ((org.jfree.data.time.TimeTableXYDataset) (obj));
		if ((org.jfree.data.time.TimeTableXYDataset.this.domainIsPointsInTime) != (that.domainIsPointsInTime)) {
			return false;
		}
		if ((org.jfree.data.time.TimeTableXYDataset.this.xPosition) != (that.xPosition)) {
			return false;
		}
		if (!(org.jfree.data.time.TimeTableXYDataset.this.workingCalendar.getTimeZone().equals(that.workingCalendar.getTimeZone()))) {
			return false;
		}
		if (!(org.jfree.data.time.TimeTableXYDataset.this.values.equals(that.values))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.time.TimeTableXYDataset clone = ((org.jfree.data.time.TimeTableXYDataset) (super.clone()));
		clone.values = ((org.jfree.data.DefaultKeyedValues2D) (org.jfree.data.time.TimeTableXYDataset.this.values.clone()));
		clone.workingCalendar = ((java.util.Calendar) (org.jfree.data.time.TimeTableXYDataset.this.workingCalendar.clone()));
		return clone;
	}
}

