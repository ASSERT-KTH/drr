

package org.jfree.chart.renderer.xy;


public interface XYBarPainter {
	public void paintBar(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, boolean selected, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base);

	public void paintBarShadow(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, boolean selected, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base, boolean pegShadow);
}

