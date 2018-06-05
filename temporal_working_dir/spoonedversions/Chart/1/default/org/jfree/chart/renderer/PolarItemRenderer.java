

package org.jfree.chart.renderer;


public interface PolarItemRenderer {
	public void drawSeries(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.PolarPlot plot, org.jfree.data.xy.XYDataset dataset, int seriesIndex);

	public void drawAngularGridLines(java.awt.Graphics2D g2, org.jfree.chart.plot.PolarPlot plot, java.util.List ticks, java.awt.geom.Rectangle2D dataArea);

	public void drawRadialGridLines(java.awt.Graphics2D g2, org.jfree.chart.plot.PolarPlot plot, org.jfree.chart.axis.ValueAxis radialAxis, java.util.List ticks, java.awt.geom.Rectangle2D dataArea);

	public org.jfree.chart.LegendItem getLegendItem(int series);

	public org.jfree.chart.plot.PolarPlot getPlot();

	public void setPlot(org.jfree.chart.plot.PolarPlot plot);

	public void addChangeListener(org.jfree.chart.event.RendererChangeListener listener);

	public void removeChangeListener(org.jfree.chart.event.RendererChangeListener listener);
}

