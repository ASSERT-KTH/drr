

package org.jfree.chart.event;


public class ChartChangeEvent extends java.util.EventObject {
	private org.jfree.chart.event.ChartChangeEventType type;

	private org.jfree.chart.JFreeChart chart;

	public ChartChangeEvent(java.lang.Object source) {
		this(source, null, org.jfree.chart.event.ChartChangeEventType.GENERAL);
	}

	public ChartChangeEvent(java.lang.Object source, org.jfree.chart.JFreeChart chart) {
		this(source, chart, org.jfree.chart.event.ChartChangeEventType.GENERAL);
	}

	public ChartChangeEvent(java.lang.Object source, org.jfree.chart.JFreeChart chart, org.jfree.chart.event.ChartChangeEventType type) {
		super(source);
		org.jfree.chart.event.ChartChangeEvent.this.chart = chart;
		org.jfree.chart.event.ChartChangeEvent.this.type = type;
	}

	public org.jfree.chart.JFreeChart getChart() {
		return org.jfree.chart.event.ChartChangeEvent.this.chart;
	}

	public void setChart(org.jfree.chart.JFreeChart chart) {
		org.jfree.chart.event.ChartChangeEvent.this.chart = chart;
	}

	public org.jfree.chart.event.ChartChangeEventType getType() {
		return org.jfree.chart.event.ChartChangeEvent.this.type;
	}

	public void setType(org.jfree.chart.event.ChartChangeEventType type) {
		org.jfree.chart.event.ChartChangeEvent.this.type = type;
	}
}

