

package org.jfree.chart.axis;


public abstract class ValueTick extends org.jfree.chart.axis.Tick {
	private double value;

	private org.jfree.chart.axis.TickType tickType;

	public ValueTick(double value, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		this(org.jfree.chart.axis.TickType.MAJOR, value, label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.ValueTick.this.value = value;
	}

	public ValueTick(org.jfree.chart.axis.TickType tickType, double value, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super(label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.ValueTick.this.value = value;
		org.jfree.chart.axis.ValueTick.this.tickType = tickType;
	}

	public double getValue() {
		return org.jfree.chart.axis.ValueTick.this.value;
	}

	public org.jfree.chart.axis.TickType getTickType() {
		return org.jfree.chart.axis.ValueTick.this.tickType;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.ValueTick.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.ValueTick)) {
			return false;
		}
		org.jfree.chart.axis.ValueTick that = ((org.jfree.chart.axis.ValueTick) (obj));
		if ((org.jfree.chart.axis.ValueTick.this.value) != (that.value)) {
			return false;
		}
		if (!(org.jfree.chart.axis.ValueTick.this.tickType.equals(that.tickType))) {
			return false;
		}
		return super.equals(obj);
	}
}

