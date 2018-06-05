

package org.jfree.data.time;


public class TimeSeriesDataItem implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable {
	private static final long serialVersionUID = -2235346966016401302L;

	private org.jfree.data.time.RegularTimePeriod period;

	private java.lang.Number value;

	private boolean selected;

	public TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		org.jfree.data.time.TimeSeriesDataItem.this.period = period;
		org.jfree.data.time.TimeSeriesDataItem.this.value = value;
		org.jfree.data.time.TimeSeriesDataItem.this.selected = false;
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

	public boolean isSelected() {
		return org.jfree.data.time.TimeSeriesDataItem.this.selected;
	}

	public void setSelected(boolean selected) {
		org.jfree.data.time.TimeSeriesDataItem.this.selected = selected;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.time.TimeSeriesDataItem.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimeSeriesDataItem)) {
			return false;
		}
		org.jfree.data.time.TimeSeriesDataItem that = ((org.jfree.data.time.TimeSeriesDataItem) (obj));
		if (!(org.jfree.data.time.TimeSeriesDataItem.this.period.equals(that.period))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimeSeriesDataItem.this.value, that.value))) {
			return false;
		}
		if ((org.jfree.data.time.TimeSeriesDataItem.this.selected) != (that.selected)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.time.TimeSeriesDataItem.this.period) != null) ? org.jfree.data.time.TimeSeriesDataItem.this.period.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.time.TimeSeriesDataItem.this.value) != null ? org.jfree.data.time.TimeSeriesDataItem.this.value.hashCode() : 0);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.time.TimeSeriesDataItem.this.selected);
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

