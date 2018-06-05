

package org.jfree.chart.panel;


public interface Overlay {
	public void paintOverlay(java.awt.Graphics2D g2, org.jfree.chart.ChartPanel chartPanel);

	public void addChangeListener(org.jfree.chart.event.OverlayChangeListener listener);

	public void removeChangeListener(org.jfree.chart.event.OverlayChangeListener listener);
}

