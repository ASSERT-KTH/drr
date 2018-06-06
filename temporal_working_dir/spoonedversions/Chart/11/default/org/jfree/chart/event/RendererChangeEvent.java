

package org.jfree.chart.event;


public class RendererChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private java.lang.Object renderer;

	public RendererChangeEvent(java.lang.Object renderer) {
		super(renderer);
		org.jfree.chart.event.RendererChangeEvent.this.renderer = renderer;
	}

	public java.lang.Object getRenderer() {
		return org.jfree.chart.event.RendererChangeEvent.this.renderer;
	}
}

