

package org.jfree.chart.plot.dial;


public interface DialLayer {
	public boolean isVisible();

	public void addChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener listener);

	public void removeChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener listener);

	public boolean hasListener(java.util.EventListener listener);

	public boolean isClippedToWindow();

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view);
}

