

package org.jfree.chart.plot.dial;


public class DialBackground extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	private transient java.awt.Paint paint;

	private org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer;

	public DialBackground() {
		this(java.awt.Color.white);
	}

	public DialBackground(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialBackground.this.paint = paint;
		org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.dial.DialBackground.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialBackground.this.paint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialBackground.this));
	}

	public org.jfree.chart.util.GradientPaintTransformer getGradientPaintTransformer() {
		return org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer;
	}

	public void setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer t) {
		if (t == null) {
			throw new java.lang.IllegalArgumentException("Null 't' argument.");
		}
		org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer = t;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialBackground.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.Paint p = org.jfree.chart.plot.dial.DialBackground.this.paint;
		if (p instanceof java.awt.GradientPaint) {
			p = org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer.transform(((java.awt.GradientPaint) (p)), view);
		}
		g2.setPaint(p);
		g2.fill(view);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialBackground.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialBackground)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialBackground that = ((org.jfree.chart.plot.dial.DialBackground) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialBackground.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer.equals(that.gradientPaintTransformer))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialBackground.this.paint));
		result = (37 * result) + (org.jfree.chart.plot.dial.DialBackground.this.gradientPaintTransformer.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialBackground.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.DialBackground.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

