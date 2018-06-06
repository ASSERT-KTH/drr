

package org.jfree.chart.block;


public class EmptyBlock extends org.jfree.chart.block.AbstractBlock implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.block.Block , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4083197869412648579L;

	public EmptyBlock(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		return null;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

