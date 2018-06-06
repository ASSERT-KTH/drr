

package org.jfree.chart.event;


public class RendererChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private java.lang.Object renderer;

	private boolean seriesVisibilityChanged;

	public RendererChangeEvent(java.lang.Object renderer) {
		this(renderer, false);
	}

	public RendererChangeEvent(java.lang.Object renderer, boolean seriesVisibilityChanged) {
		super(renderer);
		org.jfree.chart.event.RendererChangeEvent.this.renderer = renderer;
		org.jfree.chart.event.RendererChangeEvent.this.seriesVisibilityChanged = seriesVisibilityChanged;
	}

	public java.lang.Object getRenderer() {
		return org.jfree.chart.event.RendererChangeEvent.this.renderer;
	}

	public boolean getSeriesVisibilityChanged() {
		return org.jfree.chart.event.RendererChangeEvent.this.seriesVisibilityChanged;
	}
}

