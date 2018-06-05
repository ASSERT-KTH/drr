

package org.jfree.chart.block;


public class BlockBorder implements java.io.Serializable , org.jfree.chart.block.BlockFrame {
	private static final long serialVersionUID = 4961579220410228283L;

	public static final org.jfree.chart.block.BlockBorder NONE = new org.jfree.chart.block.BlockBorder(org.jfree.chart.util.RectangleInsets.ZERO_INSETS, java.awt.Color.white);

	private org.jfree.chart.util.RectangleInsets insets;

	private transient java.awt.Paint paint;

	public BlockBorder() {
		this(java.awt.Color.black);
	}

	public BlockBorder(java.awt.Paint paint) {
		this(new org.jfree.chart.util.RectangleInsets(1, 1, 1, 1), paint);
	}

	public BlockBorder(double top, double left, double bottom, double right) {
		this(new org.jfree.chart.util.RectangleInsets(top, left, bottom, right), java.awt.Color.black);
	}

	public BlockBorder(double top, double left, double bottom, double right, java.awt.Paint paint) {
		this(new org.jfree.chart.util.RectangleInsets(top, left, bottom, right), paint);
	}

	public BlockBorder(org.jfree.chart.util.RectangleInsets insets, java.awt.Paint paint) {
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.block.BlockBorder.this.insets = insets;
		org.jfree.chart.block.BlockBorder.this.paint = paint;
	}

	public org.jfree.chart.util.RectangleInsets getInsets() {
		return org.jfree.chart.block.BlockBorder.this.insets;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.block.BlockBorder.this.paint;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		double t = org.jfree.chart.block.BlockBorder.this.insets.calculateTopInset(area.getHeight());
		double b = org.jfree.chart.block.BlockBorder.this.insets.calculateBottomInset(area.getHeight());
		double l = org.jfree.chart.block.BlockBorder.this.insets.calculateLeftInset(area.getWidth());
		double r = org.jfree.chart.block.BlockBorder.this.insets.calculateRightInset(area.getWidth());
		double x = area.getX();
		double y = area.getY();
		double w = area.getWidth();
		double h = area.getHeight();
		g2.setPaint(org.jfree.chart.block.BlockBorder.this.paint);
		java.awt.geom.Rectangle2D rect = new java.awt.geom.Rectangle2D.Double();
		if (t > 0.0) {
			rect.setRect(x, y, w, t);
			g2.fill(rect);
		}
		if (b > 0.0) {
			rect.setRect(x, ((y + h) - b), w, b);
			g2.fill(rect);
		}
		if (l > 0.0) {
			rect.setRect(x, y, l, h);
			g2.fill(rect);
		}
		if (r > 0.0) {
			rect.setRect(((x + w) - r), y, r, h);
			g2.fill(rect);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.BlockBorder.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.BlockBorder)) {
			return false;
		}
		org.jfree.chart.block.BlockBorder that = ((org.jfree.chart.block.BlockBorder) (obj));
		if (!(org.jfree.chart.block.BlockBorder.this.insets.equals(that.insets))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.block.BlockBorder.this.paint, that.paint))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.block.BlockBorder.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.block.BlockBorder.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

