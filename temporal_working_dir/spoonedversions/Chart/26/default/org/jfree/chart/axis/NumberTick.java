

package org.jfree.chart.axis;


public class NumberTick extends org.jfree.chart.axis.ValueTick {
	private java.lang.Number number;

	public NumberTick(java.lang.Number number, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super(number.doubleValue(), label, textAnchor, rotationAnchor, angle);
		org.jfree.chart.axis.NumberTick.this.number = number;
	}

	public java.lang.Number getNumber() {
		return org.jfree.chart.axis.NumberTick.this.number;
	}
}

