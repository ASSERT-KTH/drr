

package org.jfree.chart.event;


public class PlotChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.plot.Plot plot;

	public PlotChangeEvent(org.jfree.chart.plot.Plot plot) {
		super(plot);
		org.jfree.chart.event.PlotChangeEvent.this.plot = plot;
	}

	public org.jfree.chart.plot.Plot getPlot() {
		return org.jfree.chart.event.PlotChangeEvent.this.plot;
	}
}

