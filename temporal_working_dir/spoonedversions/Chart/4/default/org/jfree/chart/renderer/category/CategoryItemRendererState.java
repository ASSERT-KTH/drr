

package org.jfree.chart.renderer.category;


public class CategoryItemRendererState extends org.jfree.chart.renderer.RendererState {
	private double barWidth;

	private double seriesRunningTotal;

	private int[] visibleSeries;

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

	public int getVisibleSeriesIndex(int rowIndex) {
		if ((org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries) == null) {
			return rowIndex;
		}
		int index = -1;
		for (int vRow = 0; vRow < (org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries.length); vRow++) {
			if ((org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries[vRow]) == rowIndex) {
				index = vRow;
				break;
			}
		}
		return index;
	}

	public int getVisibleSeriesCount() {
		if ((org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries) == null) {
			return -1;
		}
		return org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries.length;
	}

	public int[] getVisibleSeriesArray() {
		if ((org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries) == null) {
			return null;
		}
		int[] result = new int[org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries.length];
		java.lang.System.arraycopy(org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries, 0, result, 0, org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries.length);
		return result;
	}

	public void setVisibleSeriesArray(int[] visibleSeries) {
		org.jfree.chart.renderer.category.CategoryItemRendererState.this.visibleSeries = visibleSeries;
	}
}

