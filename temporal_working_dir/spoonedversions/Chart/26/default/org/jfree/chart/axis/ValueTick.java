

package org.jfree.chart.axis;


public abstract class ValueTick extends org.jfree.chart.axis.Tick {
	private double value;

	public ValueTick(double value, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super(label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.ValueTick.this.value = value;
	}

	public double getValue() {
		return org.jfree.chart.axis.ValueTick.this.value;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.ValueTick.this)) {
			return true;
		}
		if ((obj instanceof org.jfree.chart.axis.ValueTick) && (super.equals(obj))) {
			org.jfree.chart.axis.ValueTick vt = ((org.jfree.chart.axis.ValueTick) (obj));
			if (!((org.jfree.chart.axis.ValueTick.this.value) == (vt.value))) {
				return false;
			}
			return true;
		}
		return false;
	}
}

