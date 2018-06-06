

package org.jfree.chart.block;


public class LineBorder implements java.io.Serializable , org.jfree.chart.block.BlockFrame {
	private transient java.awt.Paint paint;

	private transient java.awt.Stroke stroke;

	private org.jfree.chart.util.RectangleInsets insets;

	public LineBorder() {
		this(java.awt.Color.black, new java.awt.BasicStroke(1.0F), new org.jfree.chart.util.RectangleInsets(1.0, 1.0, 1.0, 1.0));
	}

	public LineBorder(java.awt.Paint paint, java.awt.Stroke stroke, org.jfree.chart.util.RectangleInsets insets) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		org.jfree.chart.block.LineBorder.this.paint = paint;
		org.jfree.chart.block.LineBorder.this.stroke = stroke;
		org.jfree.chart.block.LineBorder.this.insets = insets;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.block.LineBorder.this.paint;
	}

	public org.jfree.chart.util.RectangleInsets getInsets() {
		return org.jfree.chart.block.LineBorder.this.insets;
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.block.LineBorder.this.stroke;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		double w = area.getWidth();
		double h = area.getHeight();
		if ((w <= 0.0) || (h <= 0.0)) {
			return ;
		}
		double t = org.jfree.chart.block.LineBorder.this.insets.calculateTopInset(h);
		double b = org.jfree.chart.block.LineBorder.this.insets.calculateBottomInset(h);
		double l = org.jfree.chart.block.LineBorder.this.insets.calculateLeftInset(w);
		double r = org.jfree.chart.block.LineBorder.this.insets.calculateRightInset(w);
		double x = area.getX();
		double y = area.getY();
		double x0 = x + (l / 2.0);
		double x1 = (x + w) - (r / 2.0);
		double y0 = (y + h) - (b / 2.0);
		double y1 = y + (t / 2.0);
		g2.setPaint(getPaint());
		g2.setStroke(getStroke());
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
		if (t > 0.0) {
			line.setLine(x0, y1, x1, y1);
			g2.draw(line);
		}
		if (b > 0.0) {
			line.setLine(x0, y0, x1, y0);
			g2.draw(line);
		}
		if (l > 0.0) {
			line.setLine(x0, y0, x0, y1);
			g2.draw(line);
		}
		if (r > 0.0) {
			line.setLine(x1, y0, x1, y1);
			g2.draw(line);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.LineBorder.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.LineBorder)) {
			return false;
		}
		org.jfree.chart.block.LineBorder that = ((org.jfree.chart.block.LineBorder) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.block.LineBorder.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.LineBorder.this.stroke, that.stroke))) {
			return false;
		}
		if (!(org.jfree.chart.block.LineBorder.this.insets.equals(that.insets))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.block.LineBorder.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.block.LineBorder.this.stroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.block.LineBorder.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.block.LineBorder.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

