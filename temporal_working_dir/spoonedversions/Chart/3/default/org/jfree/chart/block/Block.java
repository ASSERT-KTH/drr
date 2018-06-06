

package org.jfree.chart.block;


public interface Block extends org.jfree.chart.Drawable {
	public java.lang.String getID();

	public void setID(java.lang.String id);

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2);

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint);

	public java.awt.geom.Rectangle2D getBounds();

	public void setBounds(java.awt.geom.Rectangle2D bounds);

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params);
}

