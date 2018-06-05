

package org.jfree.chart.axis;


public class DateTick extends org.jfree.chart.axis.ValueTick {
	private java.util.Date date;

	public DateTick(java.util.Date date, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super(date.getTime(), label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.DateTick.this.date = date;
	}

	public java.util.Date getDate() {
		return org.jfree.chart.axis.DateTick.this.date;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.DateTick.this)) {
			return true;
		}
		if ((obj instanceof org.jfree.chart.axis.DateTick) && (super.equals(obj))) {
			org.jfree.chart.axis.DateTick dt = ((org.jfree.chart.axis.DateTick) (obj));
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateTick.this.date, dt.date))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public int hashCode() {
		return org.jfree.chart.axis.DateTick.this.date.hashCode();
	}
}

