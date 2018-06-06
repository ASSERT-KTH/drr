

package org.jfree.data.time;


public class TimeSeriesDataItem implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable {
	private static final long serialVersionUID = -2235346966016401302L;

	private org.jfree.data.time.RegularTimePeriod period;

	private java.lang.Number value;

	public TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		org.jfree.data.time.TimeSeriesDataItem.this.period = period;
		org.jfree.data.time.TimeSeriesDataItem.this.value = value;
	}

	public TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod period, double value) {
		this(period, new java.lang.Double(value));
	}

	public org.jfree.data.time.RegularTimePeriod getPeriod() {
		return org.jfree.data.time.TimeSeriesDataItem.this.period;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.time.TimeSeriesDataItem.this.value;
	}

	public void setValue(java.lang.Number value) {
		org.jfree.data.time.TimeSeriesDataItem.this.value = value;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.data.time.TimeSeriesDataItem.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.data.time.TimeSeriesDataItem)) {
			return false;
		}
		org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem = ((org.jfree.data.time.TimeSeriesDataItem) (o));
		if ((org.jfree.data.time.TimeSeriesDataItem.this.period) != null) {
			if (!(org.jfree.data.time.TimeSeriesDataItem.this.period.equals(timeSeriesDataItem.period))) {
				return false;
			}
		}else
			if ((timeSeriesDataItem.period) != null) {
				return false;
			}
		
		if ((org.jfree.data.time.TimeSeriesDataItem.this.value) != null) {
			if (!(org.jfree.data.time.TimeSeriesDataItem.this.value.equals(timeSeriesDataItem.value))) {
				return false;
			}
		}else
			if ((timeSeriesDataItem.value) != null) {
				return false;
			}
		
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.time.TimeSeriesDataItem.this.period) != null) ? org.jfree.data.time.TimeSeriesDataItem.this.period.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.time.TimeSeriesDataItem.this.value) != null ? org.jfree.data.time.TimeSeriesDataItem.this.value.hashCode() : 0);
		return result;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.time.TimeSeriesDataItem) {
			org.jfree.data.time.TimeSeriesDataItem datapair = ((org.jfree.data.time.TimeSeriesDataItem) (o1));
			result = getPeriod().compareTo(datapair.getPeriod());
		}else {
			result = 1;
		}
		return result;
	}

	public java.lang.Object clone() {
		java.lang.Object clone = null;
		try {
			clone = super.clone();
		} catch (java.lang.CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}

