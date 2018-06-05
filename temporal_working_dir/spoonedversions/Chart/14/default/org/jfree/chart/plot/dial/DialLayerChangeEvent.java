

package org.jfree.chart.plot.dial;


public class DialLayerChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.plot.dial.DialLayer layer;

	public DialLayerChangeEvent(org.jfree.chart.plot.dial.DialLayer layer) {
		super(layer);
		org.jfree.chart.plot.dial.DialLayerChangeEvent.this.layer = layer;
	}

	public org.jfree.chart.plot.dial.DialLayer getDialLayer() {
		return org.jfree.chart.plot.dial.DialLayerChangeEvent.this.layer;
	}
}

