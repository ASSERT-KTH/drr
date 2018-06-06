

package org.jfree.chart.annotations;


public class TextAnnotation implements java.io.Serializable {
	private static final long serialVersionUID = 7008912287533127432L;

	public static final java.awt.Font DEFAULT_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_PAINT = java.awt.Color.black;

	public static final org.jfree.chart.text.TextAnchor DEFAULT_TEXT_ANCHOR = org.jfree.chart.text.TextAnchor.CENTER;

	public static final org.jfree.chart.text.TextAnchor DEFAULT_ROTATION_ANCHOR = org.jfree.chart.text.TextAnchor.CENTER;

	public static final double DEFAULT_ROTATION_ANGLE = 0.0;

	private java.lang.String text;

	private java.awt.Font font;

	private transient java.awt.Paint paint;

	private org.jfree.chart.text.TextAnchor textAnchor;

	private org.jfree.chart.text.TextAnchor rotationAnchor;

	private double rotationAngle;

	protected TextAnnotation(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.annotations.TextAnnotation.this.text = text;
		org.jfree.chart.annotations.TextAnnotation.this.font = org.jfree.chart.annotations.TextAnnotation.DEFAULT_FONT;
		org.jfree.chart.annotations.TextAnnotation.this.paint = org.jfree.chart.annotations.TextAnnotation.DEFAULT_PAINT;
		org.jfree.chart.annotations.TextAnnotation.this.textAnchor = org.jfree.chart.annotations.TextAnnotation.DEFAULT_TEXT_ANCHOR;
		org.jfree.chart.annotations.TextAnnotation.this.rotationAnchor = org.jfree.chart.annotations.TextAnnotation.DEFAULT_ROTATION_ANCHOR;
		org.jfree.chart.annotations.TextAnnotation.this.rotationAngle = org.jfree.chart.annotations.TextAnnotation.DEFAULT_ROTATION_ANGLE;
	}

	public java.lang.String getText() {
		return org.jfree.chart.annotations.TextAnnotation.this.text;
	}

	public void setText(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.annotations.TextAnnotation.this.text = text;
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.annotations.TextAnnotation.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.annotations.TextAnnotation.this.font = font;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.annotations.TextAnnotation.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.TextAnnotation.this.paint = paint;
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.annotations.TextAnnotation.this.textAnchor;
	}

	public void setTextAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.TextAnnotation.this.textAnchor = anchor;
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.annotations.TextAnnotation.this.rotationAnchor;
	}

	public void setRotationAnchor(org.jfree.chart.text.TextAnchor anchor) {
		org.jfree.chart.annotations.TextAnnotation.this.rotationAnchor = anchor;
	}

	public double getRotationAngle() {
		return org.jfree.chart.annotations.TextAnnotation.this.rotationAngle;
	}

	public void setRotationAngle(double angle) {
		org.jfree.chart.annotations.TextAnnotation.this.rotationAngle = angle;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.TextAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.TextAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.TextAnnotation that = ((org.jfree.chart.annotations.TextAnnotation) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.TextAnnotation.this.text, that.getText()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.TextAnnotation.this.font, that.getFont()))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.TextAnnotation.this.paint, that.getPaint()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.TextAnnotation.this.textAnchor, that.getTextAnchor()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.TextAnnotation.this.rotationAnchor, that.getRotationAnchor()))) {
			return false;
		}
		if ((org.jfree.chart.annotations.TextAnnotation.this.rotationAngle) != (that.getRotationAngle())) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.annotations.TextAnnotation.this.font.hashCode());
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.TextAnnotation.this.paint));
		result = (37 * result) + (org.jfree.chart.annotations.TextAnnotation.this.rotationAnchor.hashCode());
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.TextAnnotation.this.rotationAngle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.annotations.TextAnnotation.this.text.hashCode());
		result = (37 * result) + (org.jfree.chart.annotations.TextAnnotation.this.textAnchor.hashCode());
		return result;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.TextAnnotation.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.TextAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

