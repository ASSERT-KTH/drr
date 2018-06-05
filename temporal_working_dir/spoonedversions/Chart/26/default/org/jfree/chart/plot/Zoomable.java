

package org.jfree.chart.plot;


public interface Zoomable {
	public boolean isDomainZoomable();

	public boolean isRangeZoomable();

	public org.jfree.chart.plot.PlotOrientation getOrientation();

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source);

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source);

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source);

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source);
}

