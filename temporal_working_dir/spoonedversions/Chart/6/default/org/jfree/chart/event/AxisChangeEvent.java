

package org.jfree.chart.event;


public class AxisChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.axis.Axis axis;

	public AxisChangeEvent(org.jfree.chart.axis.Axis axis) {
		super(axis);
		org.jfree.chart.event.AxisChangeEvent.this.axis = axis;
	}

	public org.jfree.chart.axis.Axis getAxis() {
		return org.jfree.chart.event.AxisChangeEvent.this.axis;
	}
}

