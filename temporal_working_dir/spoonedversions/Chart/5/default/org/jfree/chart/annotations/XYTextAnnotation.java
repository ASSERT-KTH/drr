

package org.jfree.chart.annotations;


public class XYTextAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2946063342782506328L;

	public static final java.awt.Font DEFAULT_FONT = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_PAINT = java.awt.Color.black;

	public static final org.jfree.chart.text.TextAnchor DEFAULT_TEXT_ANCHOR = org.jfree.chart.text.TextAnchor.CENTER;

	public static final org.jfree.chart.text.TextAnchor DEFAULT_ROTATION_ANCHOR = org.jfree.chart.text.TextAnchor.CENTER;

	public static final double DEFAULT_ROTATION_ANGLE = 0.0;

	private java.lang.String text;

	private java.awt.Font font;

	private transient java.awt.Paint paint;

	private double x;

	private double y;

	private org.jfree.chart.text.TextAnchor textAnchor;

	private org.jfree.chart.text.TextAnchor rotationAnchor;

	private double rotationAngle;

	public XYTextAnnotation(java.lang.String text, double x, double y) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.text = text;
		org.jfree.chart.annotations.XYTextAnnotation.this.font = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_FONT;
		org.jfree.chart.annotations.XYTextAnnotation.this.paint = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_PAINT;
		org.jfree.chart.annotations.XYTextAnnotation.this.x = x;
		org.jfree.chart.annotations.XYTextAnnotation.this.y = y;
		org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_TEXT_ANCHOR;
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_ROTATION_ANCHOR;
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle = org.jfree.chart.annotations.XYTextAnnotation.DEFAULT_ROTATION_ANGLE;
	}

	public java.lang.String getText() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.text;
	}

	public void setText(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.text = text;
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.font = font;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.paint = paint;
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor;
	}

	public void setTextAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor = anchor;
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor;
	}

	public void setRotationAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor = anchor;
	}

	public double getRotationAngle() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle;
	}

	public void setRotationAngle(double angle) {
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle = angle;
	}

	public double getX() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.x;
	}

	public void setX(double x) {
		org.jfree.chart.annotations.XYTextAnnotation.this.x = x;
	}

	public double getY() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.y;
	}

	public void setY(double y) {
		org.jfree.chart.annotations.XYTextAnnotation.this.y = y;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		float anchorX = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYTextAnnotation.this.x, dataArea, domainEdge)));
		float anchorY = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYTextAnnotation.this.y, dataArea, rangeEdge)));
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			float tempAnchor = anchorX;
			anchorX = anchorY;
			anchorY = tempAnchor;
		}
		g2.setFont(getFont());
		g2.setPaint(getPaint());
		org.jfree.chart.text.TextUtilities.drawRotatedString(getText(), g2, anchorX, anchorY, getTextAnchor(), getRotationAngle(), getRotationAnchor());
		java.awt.Shape hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(getText(), g2, anchorX, anchorY, getTextAnchor(), getRotationAngle(), getRotationAnchor());
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, hotspot, rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYTextAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYTextAnnotation)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.annotations.XYTextAnnotation that = ((org.jfree.chart.annotations.XYTextAnnotation) (obj));
		if (!(org.jfree.chart.annotations.XYTextAnnotation.this.text.equals(that.text))) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTextAnnotation.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTextAnnotation.this.y) != (that.y)) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYTextAnnotation.this.font.equals(that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYTextAnnotation.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor.equals(that.rotationAnchor))) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle) != (that.rotationAngle)) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor.equals(that.textAnchor))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = 37 * (org.jfree.chart.annotations.XYTextAnnotation.this.text.hashCode());
		result = 37 * (org.jfree.chart.annotations.XYTextAnnotation.this.font.hashCode());
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYTextAnnotation.this.paint));
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYTextAnnotation.this.x);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYTextAnnotation.this.y);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor.hashCode());
		result = (37 * result) + (org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor.hashCode());
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYTextAnnotation.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYTextAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

