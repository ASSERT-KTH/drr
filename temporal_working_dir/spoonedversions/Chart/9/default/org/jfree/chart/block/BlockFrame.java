

package org.jfree.chart.block;


public interface BlockFrame {
	public org.jfree.chart.util.RectangleInsets getInsets();

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area);
}

