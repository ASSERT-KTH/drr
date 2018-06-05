

package org.jfree.chart.event;


public class ChartProgressEvent extends java.util.EventObject {
	public static final int DRAWING_STARTED = 1;

	public static final int DRAWING_FINISHED = 2;

	private int type;

	private int percent;

	private org.jfree.chart.JFreeChart chart;

	public ChartProgressEvent(java.lang.Object source, org.jfree.chart.JFreeChart chart, int type, int percent) {
		super(source);
		org.jfree.chart.event.ChartProgressEvent.this.chart = chart;
		org.jfree.chart.event.ChartProgressEvent.this.type = type;
	}

	public org.jfree.chart.JFreeChart getChart() {
		return org.jfree.chart.event.ChartProgressEvent.this.chart;
	}

	public void setChart(org.jfree.chart.JFreeChart chart) {
		org.jfree.chart.event.ChartProgressEvent.this.chart = chart;
	}

	public int getType() {
		return org.jfree.chart.event.ChartProgressEvent.this.type;
	}

	public void setType(int type) {
		org.jfree.chart.event.ChartProgressEvent.this.type = type;
	}

	public int getPercent() {
		return org.jfree.chart.event.ChartProgressEvent.this.percent;
	}

	public void setPercent(int percent) {
		org.jfree.chart.event.ChartProgressEvent.this.percent = percent;
	}
}

