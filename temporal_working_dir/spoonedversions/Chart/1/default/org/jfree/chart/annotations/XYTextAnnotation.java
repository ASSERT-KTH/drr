

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

	private transient java.awt.Paint backgroundPaint;

	private boolean outlineVisible;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	public XYTextAnnotation(java.lang.String text, double x, double y) {
		super();
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
		org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint = null;
		org.jfree.chart.annotations.XYTextAnnotation.this.outlineVisible = false;
		org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint = java.awt.Color.black;
		org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke = new java.awt.BasicStroke(0.5F);
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
		fireAnnotationChanged();
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.paint = paint;
		fireAnnotationChanged();
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor;
	}

	public void setTextAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.textAnchor = anchor;
		fireAnnotationChanged();
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor;
	}

	public void setRotationAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAnchor = anchor;
		fireAnnotationChanged();
	}

	public double getRotationAngle() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle;
	}

	public void setRotationAngle(double angle) {
		org.jfree.chart.annotations.XYTextAnnotation.this.rotationAngle = angle;
		fireAnnotationChanged();
	}

	public double getX() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.x;
	}

	public void setX(double x) {
		org.jfree.chart.annotations.XYTextAnnotation.this.x = x;
		fireAnnotationChanged();
	}

	public double getY() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.y;
	}

	public void setY(double y) {
		org.jfree.chart.annotations.XYTextAnnotation.this.y = y;
		fireAnnotationChanged();
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint = paint;
		fireAnnotationChanged();
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint = paint;
		fireAnnotationChanged();
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke = stroke;
		fireAnnotationChanged();
	}

	public boolean isOutlineVisible() {
		return org.jfree.chart.annotations.XYTextAnnotation.this.outlineVisible;
	}

	public void setOutlineVisible(boolean visible) {
		org.jfree.chart.annotations.XYTextAnnotation.this.outlineVisible = visible;
		fireAnnotationChanged();
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
		java.awt.Shape hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(getText(), g2, anchorX, anchorY, getTextAnchor(), getRotationAngle(), getRotationAnchor());
		if ((org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint);
			g2.fill(hotspot);
		}
		g2.setPaint(getPaint());
		org.jfree.chart.text.TextUtilities.drawRotatedString(getText(), g2, anchorX, anchorY, getTextAnchor(), getRotationAngle(), getRotationAnchor());
		if (org.jfree.chart.annotations.XYTextAnnotation.this.outlineVisible) {
			g2.setStroke(org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke);
			g2.setPaint(org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint);
			g2.draw(hotspot);
		}
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
		if ((org.jfree.chart.annotations.XYTextAnnotation.this.outlineVisible) != (that.outlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke.equals(that.outlineStroke))) {
			return false;
		}
		return super.equals(obj);
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
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYTextAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYTextAnnotation.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYTextAnnotation.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYTextAnnotation.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

