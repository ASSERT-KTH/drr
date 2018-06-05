

package org.jfree.data.time;


public class TimePeriodValuesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset {
	private static final long serialVersionUID = -3077934065236454199L;

	private java.util.List data;

	private org.jfree.data.time.TimePeriodAnchor xPosition;

	public TimePeriodValuesCollection() {
		this(((org.jfree.data.time.TimePeriodValues) (null)));
	}

	public TimePeriodValuesCollection(org.jfree.data.time.TimePeriodValues series) {
		org.jfree.data.time.TimePeriodValuesCollection.this.data = new java.util.ArrayList();
		org.jfree.data.time.TimePeriodValuesCollection.this.xPosition = org.jfree.data.time.TimePeriodAnchor.MIDDLE;
		if (series != null) {
			org.jfree.data.time.TimePeriodValuesCollection.this.data.add(series);
			series.addChangeListener(org.jfree.data.time.TimePeriodValuesCollection.this);
		}
	}

	public org.jfree.data.time.TimePeriodAnchor getXPosition() {
		return org.jfree.data.time.TimePeriodValuesCollection.this.xPosition;
	}

	public void setXPosition(org.jfree.data.time.TimePeriodAnchor position) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		org.jfree.data.time.TimePeriodValuesCollection.this.xPosition = position;
	}

	public int getSeriesCount() {
		return org.jfree.data.time.TimePeriodValuesCollection.this.data.size();
	}

	public org.jfree.data.time.TimePeriodValues getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Index 'series' out of range.");
		}
		return ((org.jfree.data.time.TimePeriodValues) (org.jfree.data.time.TimePeriodValuesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public void addSeries(org.jfree.data.time.TimePeriodValues series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.time.TimePeriodValuesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.time.TimePeriodValuesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(org.jfree.data.time.TimePeriodValues series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.time.TimePeriodValuesCollection.this.data.remove(series);
		series.removeChangeListener(org.jfree.data.time.TimePeriodValuesCollection.this);
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeSeries(int index) {
		org.jfree.data.time.TimePeriodValues series = getSeries(index);
		if (series != null) {
			removeSeries(series);
		}
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.time.TimePeriodValues ts = ((org.jfree.data.time.TimePeriodValues) (org.jfree.data.time.TimePeriodValuesCollection.this.data.get(series)));
		org.jfree.data.time.TimePeriodValue dp = ts.getDataItem(item);
		org.jfree.data.time.TimePeriod period = dp.getPeriod();
		return new java.lang.Long(getX(period));
	}

	private long getX(org.jfree.data.time.TimePeriod period) {
		if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.START)) {
			return period.getStart().getTime();
		}else
			if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
				return ((period.getStart().getTime()) / 2) + ((period.getEnd().getTime()) / 2);
			}else
				if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.END)) {
					return period.getEnd().getTime();
				}else {
					throw new java.lang.IllegalStateException("TimePeriodAnchor unknown.");
				}
			
		
	}

	public java.lang.Number getStartX(int series, int item) {
		org.jfree.data.time.TimePeriodValues ts = ((org.jfree.data.time.TimePeriodValues) (org.jfree.data.time.TimePeriodValuesCollection.this.data.get(series)));
		org.jfree.data.time.TimePeriodValue dp = ts.getDataItem(item);
		return new java.lang.Long(dp.getPeriod().getStart().getTime());
	}

	public java.lang.Number getEndX(int series, int item) {
		org.jfree.data.time.TimePeriodValues ts = ((org.jfree.data.time.TimePeriodValues) (org.jfree.data.time.TimePeriodValuesCollection.this.data.get(series)));
		org.jfree.data.time.TimePeriodValue dp = ts.getDataItem(item);
		return new java.lang.Long(dp.getPeriod().getEnd().getTime());
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.time.TimePeriodValues ts = ((org.jfree.data.time.TimePeriodValues) (org.jfree.data.time.TimePeriodValuesCollection.this.data.get(series)));
		org.jfree.data.time.TimePeriodValue dp = ts.getDataItem(item);
		return dp.getValue();
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
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
		org.jfree.data.Range temp = null;
		java.util.Iterator iterator = org.jfree.data.time.TimePeriodValuesCollection.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.time.TimePeriodValues series = ((org.jfree.data.time.TimePeriodValues) (iterator.next()));
			int count = series.getItemCount();
			if (count > 0) {
				org.jfree.data.time.TimePeriod start = series.getTimePeriod(series.getMinStartIndex());
				org.jfree.data.time.TimePeriod end = series.getTimePeriod(series.getMaxEndIndex());
				if (!includeInterval) {
					if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.START)) {
						org.jfree.data.time.TimePeriod maxStart = series.getTimePeriod(series.getMaxStartIndex());
						temp = new org.jfree.data.Range(start.getStart().getTime(), maxStart.getStart().getTime());
					}else
						if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
							org.jfree.data.time.TimePeriod minMiddle = series.getTimePeriod(series.getMinMiddleIndex());
							long s1 = minMiddle.getStart().getTime();
							long e1 = minMiddle.getEnd().getTime();
							org.jfree.data.time.TimePeriod maxMiddle = series.getTimePeriod(series.getMaxMiddleIndex());
							long s2 = maxMiddle.getStart().getTime();
							long e2 = maxMiddle.getEnd().getTime();
							temp = new org.jfree.data.Range((s1 + ((e1 - s1) / 2)), (s2 + ((e2 - s2) / 2)));
						}else
							if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.END)) {
								org.jfree.data.time.TimePeriod minEnd = series.getTimePeriod(series.getMinEndIndex());
								temp = new org.jfree.data.Range(minEnd.getEnd().getTime(), end.getEnd().getTime());
							}
						
					
				}else {
					temp = new org.jfree.data.Range(start.getStart().getTime(), end.getEnd().getTime());
				}
				result = org.jfree.data.Range.combine(result, temp);
			}
		} 
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.TimePeriodValuesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimePeriodValuesCollection)) {
			return false;
		}
		org.jfree.data.time.TimePeriodValuesCollection that = ((org.jfree.data.time.TimePeriodValuesCollection) (obj));
		if ((org.jfree.data.time.TimePeriodValuesCollection.this.xPosition) != (that.xPosition)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimePeriodValuesCollection.this.data, that.data))) {
			return false;
		}
		return true;
	}
}

