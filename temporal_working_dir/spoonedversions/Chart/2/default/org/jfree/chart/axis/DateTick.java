

package org.jfree.chart.axis;


public class DateTick extends org.jfree.chart.axis.ValueTick {
	private java.util.Date date;

	public DateTick(java.util.Date date, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		this(org.jfree.chart.axis.TickType.MAJOR, date, label, textAnchor, rotationAnchor, angle);
	}

	public DateTick(org.jfree.chart.axis.TickType tickType, java.util.Date date, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super(tickType, date.getTime(), label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.DateTick.this.date = date;
	}

	public java.util.Date getDate() {
		return org.jfree.chart.axis.DateTick.this.date;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.DateTick.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.DateTick)) {
			return false;
		}
		org.jfree.chart.axis.DateTick that = ((org.jfree.chart.axis.DateTick) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateTick.this.date, that.date))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return org.jfree.chart.axis.DateTick.this.date.hashCode();
	}
}

