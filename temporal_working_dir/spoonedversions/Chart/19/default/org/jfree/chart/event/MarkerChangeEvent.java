

package org.jfree.chart.event;


public class MarkerChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.plot.Marker marker;

	public MarkerChangeEvent(org.jfree.chart.plot.Marker marker) {
		super(marker);
		org.jfree.chart.event.MarkerChangeEvent.this.marker = marker;
	}

	public org.jfree.chart.plot.Marker getMarker() {
		return org.jfree.chart.event.MarkerChangeEvent.this.marker;
	}
}

