

package org.jfree.chart.renderer.xy;


public class XYItemRendererState extends org.jfree.chart.renderer.RendererState {
	private int firstItemIndex;

	private int lastItemIndex;

	public java.awt.geom.Line2D workingLine;

	private boolean processVisibleItemsOnly;

	private org.jfree.chart.plot.XYCrosshairState crosshairState;

	private org.jfree.data.xy.XYDatasetSelectionState selectionState;

	public XYItemRendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
		super(info);
		org.jfree.chart.renderer.xy.XYItemRendererState.this.workingLine = new java.awt.geom.Line2D.Double();
		org.jfree.chart.renderer.xy.XYItemRendererState.this.processVisibleItemsOnly = true;
		org.jfree.chart.renderer.xy.XYItemRendererState.this.crosshairState = null;
	}

	public boolean getProcessVisibleItemsOnly() {
		return org.jfree.chart.renderer.xy.XYItemRendererState.this.processVisibleItemsOnly;
	}

	public void setProcessVisibleItemsOnly(boolean flag) {
		org.jfree.chart.renderer.xy.XYItemRendererState.this.processVisibleItemsOnly = flag;
	}

	public int getFirstItemIndex() {
		return org.jfree.chart.renderer.xy.XYItemRendererState.this.firstItemIndex;
	}

	public int getLastItemIndex() {
		return org.jfree.chart.renderer.xy.XYItemRendererState.this.lastItemIndex;
	}

	public org.jfree.chart.plot.XYCrosshairState getCrosshairState() {
		return org.jfree.chart.renderer.xy.XYItemRendererState.this.crosshairState;
	}

	public void setCrosshairState(org.jfree.chart.plot.XYCrosshairState state) {
		org.jfree.chart.renderer.xy.XYItemRendererState.this.crosshairState = state;
	}

	public org.jfree.data.xy.XYDatasetSelectionState getSelectionState() {
		return org.jfree.chart.renderer.xy.XYItemRendererState.this.selectionState;
	}

	public void setSelectionState(org.jfree.data.xy.XYDatasetSelectionState state) {
		org.jfree.chart.renderer.xy.XYItemRendererState.this.selectionState = state;
	}

	public void startSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
		org.jfree.chart.renderer.xy.XYItemRendererState.this.firstItemIndex = firstItem;
		org.jfree.chart.renderer.xy.XYItemRendererState.this.lastItemIndex = lastItem;
	}

	public void endSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
	}
}

