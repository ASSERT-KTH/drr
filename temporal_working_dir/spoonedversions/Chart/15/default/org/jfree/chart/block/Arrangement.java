

package org.jfree.chart.block;


public interface Arrangement {
	public void add(org.jfree.chart.block.Block block, java.lang.Object key);

	public org.jfree.chart.util.Size2D arrange(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint);

	public void clear();
}

