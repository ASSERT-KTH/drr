

package org.jfree.chart.plot.dial;


public class DialTextAnnotation extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	private java.lang.String label;

	private java.awt.Font font;

	private transient java.awt.Paint paint;

	private double angle;

	private double radius;

	private org.jfree.chart.text.TextAnchor anchor;

	public DialTextAnnotation(java.lang.String label) {
		if (label == null) {
			throw new java.lang.IllegalArgumentException("Null 'label' argument.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.angle = -90.0;
		org.jfree.chart.plot.dial.DialTextAnnotation.this.radius = 0.3;
		org.jfree.chart.plot.dial.DialTextAnnotation.this.font = new java.awt.Font("Dialog", java.awt.Font.BOLD, 14);
		org.jfree.chart.plot.dial.DialTextAnnotation.this.paint = java.awt.Color.black;
		org.jfree.chart.plot.dial.DialTextAnnotation.this.label = label;
		org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.label;
	}

	public void setLabel(java.lang.String label) {
		if (label == null) {
			throw new java.lang.IllegalArgumentException("Null 'label' argument.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.label = label;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.font = font;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.paint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public double getAngle() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.angle;
	}

	public void setAngle(double angle) {
		org.jfree.chart.plot.dial.DialTextAnnotation.this.angle = angle;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public double getRadius() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.radius;
	}

	public void setRadius(double radius) {
		if (radius < 0.0) {
			throw new java.lang.IllegalArgumentException("The 'radius' cannot be negative.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.radius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public org.jfree.chart.text.TextAnchor getAnchor() {
		return org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor;
	}

	public void setAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor = anchor;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialTextAnnotation.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.geom.Rectangle2D f = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialTextAnnotation.this.radius, org.jfree.chart.plot.dial.DialTextAnnotation.this.radius);
		java.awt.geom.Arc2D arc = new java.awt.geom.Arc2D.Double(f, org.jfree.chart.plot.dial.DialTextAnnotation.this.angle, 0.0, java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Point2D pt = arc.getStartPoint();
		g2.setPaint(org.jfree.chart.plot.dial.DialTextAnnotation.this.paint);
		g2.setFont(org.jfree.chart.plot.dial.DialTextAnnotation.this.font);
		org.jfree.chart.text.TextUtilities.drawAlignedString(org.jfree.chart.plot.dial.DialTextAnnotation.this.label, g2, ((float) (pt.getX())), ((float) (pt.getY())), org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialTextAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialTextAnnotation)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialTextAnnotation that = ((org.jfree.chart.plot.dial.DialTextAnnotation) (obj));
		if (!(org.jfree.chart.plot.dial.DialTextAnnotation.this.label.equals(that.label))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialTextAnnotation.this.font.equals(that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialTextAnnotation.this.paint, that.paint))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialTextAnnotation.this.radius) != (that.radius)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialTextAnnotation.this.angle) != (that.angle)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor.equals(that.anchor))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialTextAnnotation.this.paint));
		result = (37 * result) + (org.jfree.chart.plot.dial.DialTextAnnotation.this.font.hashCode());
		result = (37 * result) + (org.jfree.chart.plot.dial.DialTextAnnotation.this.label.hashCode());
		result = (37 * result) + (org.jfree.chart.plot.dial.DialTextAnnotation.this.anchor.hashCode());
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialTextAnnotation.this.angle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialTextAnnotation.this.radius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialTextAnnotation.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.DialTextAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

