

package org.jfree.chart.text;


public class TextFragment implements java.io.Serializable {
	private static final long serialVersionUID = 4465945952903143262L;

	public static final java.awt.Font DEFAULT_FONT = new java.awt.Font("Serif", java.awt.Font.PLAIN, 12);

	public static final java.awt.Paint DEFAULT_PAINT = java.awt.Color.black;

	private java.lang.String text;

	private java.awt.Font font;

	private transient java.awt.Paint paint;

	private float baselineOffset;

	public TextFragment(java.lang.String text) {
		this(text, org.jfree.chart.text.TextFragment.DEFAULT_FONT, org.jfree.chart.text.TextFragment.DEFAULT_PAINT);
	}

	public TextFragment(java.lang.String text, java.awt.Font font) {
		this(text, font, org.jfree.chart.text.TextFragment.DEFAULT_PAINT);
	}

	public TextFragment(java.lang.String text, java.awt.Font font, java.awt.Paint paint) {
		this(text, font, paint, 0.0F);
	}

	public TextFragment(java.lang.String text, java.awt.Font font, java.awt.Paint paint, float baselineOffset) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.text.TextFragment.this.text = text;
		org.jfree.chart.text.TextFragment.this.font = font;
		org.jfree.chart.text.TextFragment.this.paint = paint;
		org.jfree.chart.text.TextFragment.this.baselineOffset = baselineOffset;
	}

	public java.lang.String getText() {
		return org.jfree.chart.text.TextFragment.this.text;
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.text.TextFragment.this.font;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.text.TextFragment.this.paint;
	}

	public float getBaselineOffset() {
		return org.jfree.chart.text.TextFragment.this.baselineOffset;
	}

	public void draw(java.awt.Graphics2D g2, float anchorX, float anchorY, org.jfree.chart.text.TextAnchor anchor, float rotateX, float rotateY, double angle) {
		g2.setFont(org.jfree.chart.text.TextFragment.this.font);
		g2.setPaint(org.jfree.chart.text.TextFragment.this.paint);
		org.jfree.chart.text.TextUtilities.drawRotatedString(org.jfree.chart.text.TextFragment.this.text, g2, anchorX, (anchorY + (org.jfree.chart.text.TextFragment.this.baselineOffset)), anchor, angle, rotateX, rotateY);
	}

	public org.jfree.chart.util.Size2D calculateDimensions(java.awt.Graphics2D g2) {
		java.awt.FontMetrics fm = g2.getFontMetrics(org.jfree.chart.text.TextFragment.this.font);
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(org.jfree.chart.text.TextFragment.this.text, g2, fm);
		org.jfree.chart.util.Size2D result = new org.jfree.chart.util.Size2D(bounds.getWidth(), bounds.getHeight());
		return result;
	}

	public float calculateBaselineOffset(java.awt.Graphics2D g2, org.jfree.chart.text.TextAnchor anchor) {
		float result = 0.0F;
		java.awt.FontMetrics fm = g2.getFontMetrics(org.jfree.chart.text.TextFragment.this.font);
		java.awt.font.LineMetrics lm = fm.getLineMetrics("ABCxyz", g2);
		if (((anchor == (org.jfree.chart.text.TextAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.TOP_RIGHT))) {
			result = lm.getAscent();
		}else
			if (((anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT))) {
				result = (-(lm.getDescent())) - (lm.getLeading());
			}
		
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.text.TextFragment.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.text.TextFragment) {
			org.jfree.chart.text.TextFragment tf = ((org.jfree.chart.text.TextFragment) (obj));
			if (!(org.jfree.chart.text.TextFragment.this.text.equals(tf.text))) {
				return false;
			}
			if (!(org.jfree.chart.text.TextFragment.this.font.equals(tf.font))) {
				return false;
			}
			if (!(org.jfree.chart.text.TextFragment.this.paint.equals(tf.paint))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.chart.text.TextFragment.this.text) != null) ? org.jfree.chart.text.TextFragment.this.text.hashCode() : 0;
		result = (29 * result) + ((org.jfree.chart.text.TextFragment.this.font) != null ? org.jfree.chart.text.TextFragment.this.font.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.text.TextFragment.this.paint) != null ? org.jfree.chart.text.TextFragment.this.paint.hashCode() : 0);
		return result;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.text.TextFragment.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.text.TextFragment.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

