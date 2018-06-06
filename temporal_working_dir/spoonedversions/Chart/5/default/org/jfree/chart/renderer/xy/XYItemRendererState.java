

package org.jfree.chart.renderer.xy;


public class XYItemRendererState extends org.jfree.chart.renderer.RendererState {
	private int firstItemIndex;

	private int lastItemIndex;

	public java.awt.geom.Line2D workingLine;

	private boolean processVisibleItemsOnly;

	public XYItemRendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
		super(info);
		org.jfree.chart.renderer.xy.XYItemRendererState.this.workingLine = new java.awt.geom.Line2D.Double();
		org.jfree.chart.renderer.xy.XYItemRendererState.this.processVisibleItemsOnly = true;
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

	public void startSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
		org.jfree.chart.renderer.xy.XYItemRendererState.this.firstItemIndex = firstItem;
		org.jfree.chart.renderer.xy.XYItemRendererState.this.lastItemIndex = lastItem;
	}

	public void endSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
	}
}

