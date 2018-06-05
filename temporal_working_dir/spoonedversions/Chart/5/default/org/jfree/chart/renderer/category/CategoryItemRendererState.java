

package org.jfree.chart.renderer.category;


public class CategoryItemRendererState extends org.jfree.chart.renderer.RendererState {
	private double barWidth;

	private double seriesRunningTotal;

	private org.jfree.chart.plot.CategoryCrosshairState crosshairState;

	public CategoryItemRendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
		super(info);
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.barWidth = 0.0;
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.seriesRunningTotal = 0.0;
	}

	public double getBarWidth() {
		return org.jfree.chart.renderer.category.CategoryItemRendererState.this.barWidth;
	}

	public void setBarWidth(double width) {
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.barWidth = width;
	}

	public double getSeriesRunningTotal() {
		return org.jfree.chart.renderer.category.CategoryItemRendererState.this.seriesRunningTotal;
	}

	void setSeriesRunningTotal(double total) {
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.seriesRunningTotal = total;
	}

	public org.jfree.chart.plot.CategoryCrosshairState getCrosshairState() {
		return org.jfree.chart.renderer.category.CategoryItemRendererState.this.crosshairState;
	}

	public void setCrosshairState(org.jfree.chart.plot.CategoryCrosshairState state) {
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.crosshairState = state;
	}
}

