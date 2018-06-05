

package org.jfree.data.time;


public class TimePeriodValue implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 3390443360845711275L;

	private org.jfree.data.time.TimePeriod period;

	private java.lang.Number value;

	public TimePeriodValue(org.jfree.data.time.TimePeriod period, java.lang.Number value) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		org.jfree.data.time.TimePeriodValue.this.period = period;
		org.jfree.data.time.TimePeriodValue.this.value = value;
	}

	public TimePeriodValue(org.jfree.data.time.TimePeriod period, double value) {
		this(period, new java.lang.Double(value));
	}

	public org.jfree.data.time.TimePeriod getPeriod() {
		return org.jfree.data.time.TimePeriodValue.this.period;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.time.TimePeriodValue.this.value;
	}

	public void setValue(java.lang.Number value) {
		org.jfree.data.time.TimePeriodValue.this.value = value;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.time.TimePeriodValue.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimePeriodValue)) {
			return false;
		}
		org.jfree.data.time.TimePeriodValue timePeriodValue = ((org.jfree.data.time.TimePeriodValue) (obj));
		if ((org.jfree.data.time.TimePeriodValue.this.period) != null ? !(org.jfree.data.time.TimePeriodValue.this.period.equals(timePeriodValue.period)) : (timePeriodValue.period) != null) {
			return false;
		}
		if ((org.jfree.data.time.TimePeriodValue.this.value) != null ? !(org.jfree.data.time.TimePeriodValue.this.value.equals(timePeriodValue.value)) : (timePeriodValue.value) != null) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.time.TimePeriodValue.this.period) != null) ? org.jfree.data.time.TimePeriodValue.this.period.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.time.TimePeriodValue.this.value) != null ? org.jfree.data.time.TimePeriodValue.this.value.hashCode() : 0);
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

