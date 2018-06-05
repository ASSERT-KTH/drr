

package org.jfree.chart.renderer.xy;


public class XYItemRendererState extends org.jfree.chart.renderer.RendererState {
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
}

