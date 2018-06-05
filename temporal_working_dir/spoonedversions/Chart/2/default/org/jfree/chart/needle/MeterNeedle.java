

package org.jfree.chart.needle;


public abstract class MeterNeedle implements java.io.Serializable {
	private static final long serialVersionUID = 5203064851510951052L;

	private transient java.awt.Paint outlinePaint = java.awt.Color.black;

	private transient java.awt.Stroke outlineStroke = new java.awt.BasicStroke(2);

	private transient java.awt.Paint fillPaint = null;

	private transient java.awt.Paint highlightPaint = null;

	private int size = 5;

	private double rotateX = 0.5;

	private double rotateY = 0.5;

	protected static java.awt.geom.AffineTransform transform = new java.awt.geom.AffineTransform();

	public MeterNeedle() {
		this(null, null, null);
	}

	public MeterNeedle(java.awt.Paint outline, java.awt.Paint fill, java.awt.Paint highlight) {
		org.jfree.chart.needle.MeterNeedle.this.fillPaint = fill;
		org.jfree.chart.needle.MeterNeedle.this.highlightPaint = highlight;
		org.jfree.chart.needle.MeterNeedle.this.outlinePaint = outline;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.needle.MeterNeedle.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint p) {
		if (p != null) {
			org.jfree.chart.needle.MeterNeedle.this.outlinePaint = p;
		}
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.needle.MeterNeedle.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke s) {
		if (s != null) {
			org.jfree.chart.needle.MeterNeedle.this.outlineStroke = s;
		}
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.needle.MeterNeedle.this.fillPaint;
	}

	public void setFillPaint(java.awt.Paint p) {
		if (p != null) {
			org.jfree.chart.needle.MeterNeedle.this.fillPaint = p;
		}
	}

	public java.awt.Paint getHighlightPaint() {
		return org.jfree.chart.needle.MeterNeedle.this.highlightPaint;
	}

	public void setHighlightPaint(java.awt.Paint p) {
		if (p != null) {
			org.jfree.chart.needle.MeterNeedle.this.highlightPaint = p;
		}
	}

	public double getRotateX() {
		return org.jfree.chart.needle.MeterNeedle.this.rotateX;
	}

	public void setRotateX(double x) {
		org.jfree.chart.needle.MeterNeedle.this.rotateX = x;
	}

	public void setRotateY(double y) {
		org.jfree.chart.needle.MeterNeedle.this.rotateY = y;
	}

	public double getRotateY() {
		return org.jfree.chart.needle.MeterNeedle.this.rotateY;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		draw(g2, plotArea, 0);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, double angle) {
		java.awt.geom.Point2D.Double pt = new java.awt.geom.Point2D.Double();
		pt.setLocation(((plotArea.getMinX()) + ((org.jfree.chart.needle.MeterNeedle.this.rotateX) * (plotArea.getWidth()))), ((plotArea.getMinY()) + ((org.jfree.chart.needle.MeterNeedle.this.rotateY) * (plotArea.getHeight()))));
		draw(g2, plotArea, pt, angle);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.Paint savePaint = g2.getColor();
		java.awt.Stroke saveStroke = g2.getStroke();
		drawNeedle(g2, plotArea, rotate, java.lang.Math.toRadians(angle));
		g2.setStroke(saveStroke);
		g2.setPaint(savePaint);
	}

	protected abstract void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle);

	protected void defaultDisplay(java.awt.Graphics2D g2, java.awt.Shape shape) {
		if ((org.jfree.chart.needle.MeterNeedle.this.fillPaint) != null) {
			g2.setPaint(org.jfree.chart.needle.MeterNeedle.this.fillPaint);
			g2.fill(shape);
		}
		if ((org.jfree.chart.needle.MeterNeedle.this.outlinePaint) != null) {
			g2.setStroke(org.jfree.chart.needle.MeterNeedle.this.outlineStroke);
			g2.setPaint(org.jfree.chart.needle.MeterNeedle.this.outlinePaint);
			g2.draw(shape);
		}
	}

	public int getSize() {
		return org.jfree.chart.needle.MeterNeedle.this.size;
	}

	public void setSize(int pixels) {
		org.jfree.chart.needle.MeterNeedle.this.size = pixels;
	}

	public java.awt.geom.AffineTransform getTransform() {
		return org.jfree.chart.needle.MeterNeedle.transform;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.MeterNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.MeterNeedle)) {
			return false;
		}
		org.jfree.chart.needle.MeterNeedle that = ((org.jfree.chart.needle.MeterNeedle) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.needle.MeterNeedle.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.needle.MeterNeedle.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.needle.MeterNeedle.this.fillPaint, that.fillPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.needle.MeterNeedle.this.highlightPaint, that.highlightPaint))) {
			return false;
		}
		if ((org.jfree.chart.needle.MeterNeedle.this.size) != (that.size)) {
			return false;
		}
		if ((org.jfree.chart.needle.MeterNeedle.this.rotateX) != (that.rotateX)) {
			return false;
		}
		if ((org.jfree.chart.needle.MeterNeedle.this.rotateY) != (that.rotateY)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = org.jfree.chart.util.HashUtilities.hashCode(193, org.jfree.chart.needle.MeterNeedle.this.fillPaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.highlightPaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.outlinePaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.outlineStroke);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.rotateX);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.rotateY);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.needle.MeterNeedle.this.size);
		return result;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.needle.MeterNeedle.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.needle.MeterNeedle.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.needle.MeterNeedle.this.fillPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.needle.MeterNeedle.this.highlightPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.needle.MeterNeedle.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.needle.MeterNeedle.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.needle.MeterNeedle.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.needle.MeterNeedle.this.highlightPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

