

package org.jfree.chart.plot.dial;


public class SimpleDialFrame extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialFrame , org.jfree.chart.util.PublicCloneable {
	private double radius;

	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Paint foregroundPaint;

	private transient java.awt.Stroke stroke;

	public SimpleDialFrame() {
		org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint = java.awt.Color.gray;
		org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint = java.awt.Color.black;
		org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke = new java.awt.BasicStroke(2.0F);
		org.jfree.chart.plot.dial.SimpleDialFrame.this.radius = 0.95;
	}

	public double getRadius() {
		return org.jfree.chart.plot.dial.SimpleDialFrame.this.radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new java.lang.IllegalArgumentException(("" + "The 'radius' must be positive."));
		}
		org.jfree.chart.plot.dial.SimpleDialFrame.this.radius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.SimpleDialFrame.this));
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.SimpleDialFrame.this));
	}

	public java.awt.Paint getForegroundPaint() {
		return org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint;
	}

	public void setForegroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.SimpleDialFrame.this));
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.SimpleDialFrame.this));
	}

	public java.awt.Shape getWindow(java.awt.geom.Rectangle2D frame) {
		java.awt.geom.Rectangle2D f = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.SimpleDialFrame.this.radius, org.jfree.chart.plot.dial.SimpleDialFrame.this.radius);
		return new java.awt.geom.Ellipse2D.Double(f.getX(), f.getY(), f.getWidth(), f.getHeight());
	}

	public boolean isClippedToWindow() {
		return false;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.Shape window = getWindow(frame);
		java.awt.geom.Rectangle2D f = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.SimpleDialFrame.this.radius) + 0.02), ((org.jfree.chart.plot.dial.SimpleDialFrame.this.radius) + 0.02));
		java.awt.geom.Ellipse2D e = new java.awt.geom.Ellipse2D.Double(f.getX(), f.getY(), f.getWidth(), f.getHeight());
		java.awt.geom.Area area = new java.awt.geom.Area(e);
		java.awt.geom.Area area2 = new java.awt.geom.Area(window);
		area.subtract(area2);
		g2.setPaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint);
		g2.fill(area);
		g2.setStroke(org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke);
		g2.setPaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint);
		g2.draw(window);
		g2.draw(e);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.SimpleDialFrame.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.SimpleDialFrame)) {
			return false;
		}
		org.jfree.chart.plot.dial.SimpleDialFrame that = ((org.jfree.chart.plot.dial.SimpleDialFrame) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint, that.foregroundPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.SimpleDialFrame.this.radius) != (that.radius)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke.equals(that.stroke))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.SimpleDialFrame.this.radius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint));
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint));
		result = (37 * result) + (org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.SimpleDialFrame.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.SimpleDialFrame.this.foregroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.SimpleDialFrame.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

