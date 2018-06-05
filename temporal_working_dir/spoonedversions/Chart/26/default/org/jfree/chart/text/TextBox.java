

package org.jfree.chart.text;


public class TextBox implements java.io.Serializable {
	private static final long serialVersionUID = 3360220213180203706L;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	private org.jfree.chart.util.RectangleInsets interiorGap;

	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Paint shadowPaint;

	private double shadowXOffset = 2.0;

	private double shadowYOffset = 2.0;

	private org.jfree.chart.text.TextBlock textBlock;

	public TextBox() {
		this(((org.jfree.chart.text.TextBlock) (null)));
	}

	public TextBox(final java.lang.String text) {
		this(((org.jfree.chart.text.TextBlock) (null)));
		if (text != null) {
			org.jfree.chart.text.TextBox.this.textBlock = new org.jfree.chart.text.TextBlock();
			org.jfree.chart.text.TextBox.this.textBlock.addLine(text, new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10), java.awt.Color.black);
		}
	}

	public TextBox(final org.jfree.chart.text.TextBlock block) {
		org.jfree.chart.text.TextBox.this.outlinePaint = java.awt.Color.black;
		org.jfree.chart.text.TextBox.this.outlineStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.text.TextBox.this.interiorGap = new org.jfree.chart.util.RectangleInsets(1.0, 3.0, 1.0, 3.0);
		org.jfree.chart.text.TextBox.this.backgroundPaint = new java.awt.Color(255, 255, 192);
		org.jfree.chart.text.TextBox.this.shadowPaint = java.awt.Color.gray;
		org.jfree.chart.text.TextBox.this.shadowXOffset = 2.0;
		org.jfree.chart.text.TextBox.this.shadowYOffset = 2.0;
		org.jfree.chart.text.TextBox.this.textBlock = block;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.text.TextBox.this.outlinePaint;
	}

	public void setOutlinePaint(final java.awt.Paint paint) {
		org.jfree.chart.text.TextBox.this.outlinePaint = paint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.text.TextBox.this.outlineStroke;
	}

	public void setOutlineStroke(final java.awt.Stroke stroke) {
		org.jfree.chart.text.TextBox.this.outlineStroke = stroke;
	}

	public org.jfree.chart.util.RectangleInsets getInteriorGap() {
		return org.jfree.chart.text.TextBox.this.interiorGap;
	}

	public void setInteriorGap(final org.jfree.chart.util.RectangleInsets gap) {
		org.jfree.chart.text.TextBox.this.interiorGap = gap;
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.text.TextBox.this.backgroundPaint;
	}

	public void setBackgroundPaint(final java.awt.Paint paint) {
		org.jfree.chart.text.TextBox.this.backgroundPaint = paint;
	}

	public java.awt.Paint getShadowPaint() {
		return org.jfree.chart.text.TextBox.this.shadowPaint;
	}

	public void setShadowPaint(final java.awt.Paint paint) {
		org.jfree.chart.text.TextBox.this.shadowPaint = paint;
	}

	public double getShadowXOffset() {
		return org.jfree.chart.text.TextBox.this.shadowXOffset;
	}

	public void setShadowXOffset(final double offset) {
		org.jfree.chart.text.TextBox.this.shadowXOffset = offset;
	}

	public double getShadowYOffset() {
		return org.jfree.chart.text.TextBox.this.shadowYOffset;
	}

	public void setShadowYOffset(final double offset) {
		org.jfree.chart.text.TextBox.this.shadowYOffset = offset;
	}

	public org.jfree.chart.text.TextBlock getTextBlock() {
		return org.jfree.chart.text.TextBox.this.textBlock;
	}

	public void setTextBlock(final org.jfree.chart.text.TextBlock block) {
		org.jfree.chart.text.TextBox.this.textBlock = block;
	}

	public void draw(final java.awt.Graphics2D g2, final float x, final float y, final org.jfree.chart.util.RectangleAnchor anchor) {
		final org.jfree.chart.util.Size2D d1 = org.jfree.chart.text.TextBox.this.textBlock.calculateDimensions(g2);
		final double w = org.jfree.chart.text.TextBox.this.interiorGap.extendWidth(d1.getWidth());
		final double h = org.jfree.chart.text.TextBox.this.interiorGap.extendHeight(d1.getHeight());
		final org.jfree.chart.util.Size2D d2 = new org.jfree.chart.util.Size2D(w, h);
		final java.awt.geom.Rectangle2D bounds = org.jfree.chart.util.RectangleAnchor.createRectangle(d2, x, y, anchor);
		if ((org.jfree.chart.text.TextBox.this.shadowPaint) != null) {
			final java.awt.geom.Rectangle2D shadow = new java.awt.geom.Rectangle2D.Double(((bounds.getX()) + (org.jfree.chart.text.TextBox.this.shadowXOffset)), ((bounds.getY()) + (org.jfree.chart.text.TextBox.this.shadowYOffset)), bounds.getWidth(), bounds.getHeight());
			g2.setPaint(org.jfree.chart.text.TextBox.this.shadowPaint);
			g2.fill(shadow);
		}
		if ((org.jfree.chart.text.TextBox.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.text.TextBox.this.backgroundPaint);
			g2.fill(bounds);
		}
		if (((org.jfree.chart.text.TextBox.this.outlinePaint) != null) && ((org.jfree.chart.text.TextBox.this.outlineStroke) != null)) {
			g2.setPaint(org.jfree.chart.text.TextBox.this.outlinePaint);
			g2.setStroke(org.jfree.chart.text.TextBox.this.outlineStroke);
			g2.draw(bounds);
		}
		org.jfree.chart.text.TextBox.this.textBlock.draw(g2, ((float) (bounds.getCenterX())), ((float) (bounds.getCenterY())), org.jfree.chart.text.TextBlockAnchor.CENTER);
	}

	public double getHeight(final java.awt.Graphics2D g2) {
		final org.jfree.chart.util.Size2D d = org.jfree.chart.text.TextBox.this.textBlock.calculateDimensions(g2);
		return org.jfree.chart.text.TextBox.this.interiorGap.extendHeight(d.getHeight());
	}

	public boolean equals(final java.lang.Object obj) {
		if (obj == (org.jfree.chart.text.TextBox.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.text.TextBox)) {
			return false;
		}
		final org.jfree.chart.text.TextBox that = ((org.jfree.chart.text.TextBox) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.interiorGap, that.interiorGap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.shadowPaint, that.shadowPaint))) {
			return false;
		}
		if ((org.jfree.chart.text.TextBox.this.shadowXOffset) != (that.shadowXOffset)) {
			return false;
		}
		if ((org.jfree.chart.text.TextBox.this.shadowYOffset) != (that.shadowYOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.text.TextBox.this.textBlock, that.textBlock))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		long temp;
		result = ((org.jfree.chart.text.TextBox.this.outlinePaint) != null) ? org.jfree.chart.text.TextBox.this.outlinePaint.hashCode() : 0;
		result = (29 * result) + ((org.jfree.chart.text.TextBox.this.outlineStroke) != null ? org.jfree.chart.text.TextBox.this.outlineStroke.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.text.TextBox.this.interiorGap) != null ? org.jfree.chart.text.TextBox.this.interiorGap.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.text.TextBox.this.backgroundPaint) != null ? org.jfree.chart.text.TextBox.this.backgroundPaint.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.text.TextBox.this.shadowPaint) != null ? org.jfree.chart.text.TextBox.this.shadowPaint.hashCode() : 0);
		temp = ((org.jfree.chart.text.TextBox.this.shadowXOffset) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.text.TextBox.this.shadowXOffset) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = ((org.jfree.chart.text.TextBox.this.shadowYOffset) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.text.TextBox.this.shadowYOffset) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (29 * result) + ((org.jfree.chart.text.TextBox.this.textBlock) != null ? org.jfree.chart.text.TextBox.this.textBlock.hashCode() : 0);
		return result;
	}

	private void writeObject(final java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.text.TextBox.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.text.TextBox.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.text.TextBox.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.text.TextBox.this.shadowPaint, stream);
	}

	private void readObject(final java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.text.TextBox.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.text.TextBox.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.text.TextBox.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.text.TextBox.this.shadowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

