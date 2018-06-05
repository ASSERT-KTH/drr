

package org.jfree.chart.renderer;


public class RendererState {
	private org.jfree.chart.plot.PlotRenderingInfo info;

	public RendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.RendererState.this.info = info;
	}

	public org.jfree.chart.plot.PlotRenderingInfo getInfo() {
		return org.jfree.chart.renderer.RendererState.this.info;
	}

	public org.jfree.chart.entity.EntityCollection getEntityCollection() {
		org.jfree.chart.entity.EntityCollection result = null;
		if ((org.jfree.chart.renderer.RendererState.this.info) != null) {
			org.jfree.chart.ChartRenderingInfo owner = org.jfree.chart.renderer.RendererState.this.info.getOwner();
			if (owner != null) {
				result = owner.getEntityCollection();
			}
		}
		return result;
	}
}

