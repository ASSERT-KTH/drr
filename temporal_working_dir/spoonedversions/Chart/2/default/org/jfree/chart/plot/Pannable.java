

package org.jfree.chart.plot;


public interface Pannable {
	public org.jfree.chart.plot.PlotOrientation getOrientation();

	public boolean isDomainPannable();

	public boolean isRangePannable();

	public void panDomainAxes(double percent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source);

	public void panRangeAxes(double percent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source);
}

