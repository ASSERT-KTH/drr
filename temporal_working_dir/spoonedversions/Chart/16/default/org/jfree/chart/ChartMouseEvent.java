

package org.jfree.chart;


public class ChartMouseEvent extends java.util.EventObject implements java.io.Serializable {
	private static final long serialVersionUID = -682393837314562149L;

	private org.jfree.chart.JFreeChart chart;

	private java.awt.event.MouseEvent trigger;

	private org.jfree.chart.entity.ChartEntity entity;

	public ChartMouseEvent(org.jfree.chart.JFreeChart chart, java.awt.event.MouseEvent trigger, org.jfree.chart.entity.ChartEntity entity) {
		super(chart);
		org.jfree.chart.ChartMouseEvent.this.chart = chart;
		org.jfree.chart.ChartMouseEvent.this.trigger = trigger;
		org.jfree.chart.ChartMouseEvent.this.entity = entity;
	}

	public org.jfree.chart.JFreeChart getChart() {
		return org.jfree.chart.ChartMouseEvent.this.chart;
	}

	public java.awt.event.MouseEvent getTrigger() {
		return org.jfree.chart.ChartMouseEvent.this.trigger;
	}

	public org.jfree.chart.entity.ChartEntity getEntity() {
		return org.jfree.chart.ChartMouseEvent.this.entity;
	}
}

