

package org.jfree.chart.plot.dial;


public class DialCap extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = -2929484264982524463L;

	private double radius;

	private transient java.awt.Paint fillPaint;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	public DialCap() {
		org.jfree.chart.plot.dial.DialCap.this.radius = 0.05;
		org.jfree.chart.plot.dial.DialCap.this.fillPaint = java.awt.Color.white;
		org.jfree.chart.plot.dial.DialCap.this.outlinePaint = java.awt.Color.black;
		org.jfree.chart.plot.dial.DialCap.this.outlineStroke = new java.awt.BasicStroke(2.0F);
	}

	public double getRadius() {
		return org.jfree.chart.plot.dial.DialCap.this.radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0.0) {
			throw new java.lang.IllegalArgumentException("Requires radius > 0.0.");
		}
		org.jfree.chart.plot.dial.DialCap.this.radius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialCap.this));
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.plot.dial.DialCap.this.fillPaint;
	}

	public void setFillPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialCap.this.fillPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialCap.this));
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.plot.dial.DialCap.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialCap.this.outlinePaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialCap.this));
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.plot.dial.DialCap.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.DialCap.this.outlineStroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialCap.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		g2.setPaint(org.jfree.chart.plot.dial.DialCap.this.fillPaint);
		java.awt.geom.Rectangle2D f = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialCap.this.radius, org.jfree.chart.plot.dial.DialCap.this.radius);
		java.awt.geom.Ellipse2D e = new java.awt.geom.Ellipse2D.Double(f.getX(), f.getY(), f.getWidth(), f.getHeight());
		g2.fill(e);
		g2.setPaint(org.jfree.chart.plot.dial.DialCap.this.outlinePaint);
		g2.setStroke(org.jfree.chart.plot.dial.DialCap.this.outlineStroke);
		g2.draw(e);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialCap.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialCap)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialCap that = ((org.jfree.chart.plot.dial.DialCap) (obj));
		if ((org.jfree.chart.plot.dial.DialCap.this.radius) != (that.radius)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialCap.this.fillPaint, that.fillPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialCap.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialCap.this.outlineStroke.equals(that.outlineStroke))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialCap.this.fillPaint));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialCap.this.outlinePaint));
		result = (37 * result) + (org.jfree.chart.plot.dial.DialCap.this.outlineStroke.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialCap.this.fillPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialCap.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.DialCap.this.outlineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.DialCap.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.DialCap.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.DialCap.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

