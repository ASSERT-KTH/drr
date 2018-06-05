

package org.jfree.chart.block;


public class ColorBlock extends org.jfree.chart.block.AbstractBlock implements org.jfree.chart.block.Block {
	private transient java.awt.Paint paint;

	public ColorBlock(java.awt.Paint paint, double width, double height) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.block.ColorBlock.this.paint = paint;
		setWidth(width);
		setHeight(height);
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.block.ColorBlock.this.paint;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		java.awt.geom.Rectangle2D bounds = getBounds();
		g2.setPaint(org.jfree.chart.block.ColorBlock.this.paint);
		g2.fill(bounds);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		draw(g2, area);
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.ColorBlock.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.ColorBlock)) {
			return false;
		}
		org.jfree.chart.block.ColorBlock that = ((org.jfree.chart.block.ColorBlock) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.block.ColorBlock.this.paint, that.paint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.block.ColorBlock.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.block.ColorBlock.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

