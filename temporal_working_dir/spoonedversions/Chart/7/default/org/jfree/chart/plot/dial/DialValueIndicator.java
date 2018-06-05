

package org.jfree.chart.plot.dial;


public class DialValueIndicator extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	private int datasetIndex;

	private double angle;

	private double radius;

	private org.jfree.chart.util.RectangleAnchor frameAnchor;

	private java.lang.Number templateValue;

	private java.text.NumberFormat formatter;

	private java.awt.Font font;

	private transient java.awt.Paint paint;

	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Stroke outlineStroke;

	private transient java.awt.Paint outlinePaint;

	private org.jfree.chart.util.RectangleInsets insets;

	private org.jfree.chart.util.RectangleAnchor valueAnchor;

	private org.jfree.chart.text.TextAnchor textAnchor;

	public DialValueIndicator() {
		this(0);
	}

	public DialValueIndicator(int datasetIndex) {
		org.jfree.chart.plot.dial.DialValueIndicator.this.datasetIndex = datasetIndex;
		org.jfree.chart.plot.dial.DialValueIndicator.this.angle = -90.0;
		org.jfree.chart.plot.dial.DialValueIndicator.this.radius = 0.3;
		org.jfree.chart.plot.dial.DialValueIndicator.this.frameAnchor = org.jfree.chart.util.RectangleAnchor.CENTER;
		org.jfree.chart.plot.dial.DialValueIndicator.this.templateValue = new java.lang.Double(100.0);
		org.jfree.chart.plot.dial.DialValueIndicator.this.formatter = new java.text.DecimalFormat("0.0");
		org.jfree.chart.plot.dial.DialValueIndicator.this.font = new java.awt.Font("Dialog", java.awt.Font.BOLD, 14);
		org.jfree.chart.plot.dial.DialValueIndicator.this.paint = java.awt.Color.black;
		org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint = java.awt.Color.white;
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint = java.awt.Color.blue;
		org.jfree.chart.plot.dial.DialValueIndicator.this.insets = new org.jfree.chart.util.RectangleInsets(4, 4, 4, 4);
		org.jfree.chart.plot.dial.DialValueIndicator.this.valueAnchor = org.jfree.chart.util.RectangleAnchor.RIGHT;
		org.jfree.chart.plot.dial.DialValueIndicator.this.textAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
	}

	public int getDatasetIndex() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.datasetIndex;
	}

	public void setDatasetIndex(int index) {
		org.jfree.chart.plot.dial.DialValueIndicator.this.datasetIndex = index;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public double getAngle() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.angle;
	}

	public void setAngle(double angle) {
		org.jfree.chart.plot.dial.DialValueIndicator.this.angle = angle;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public double getRadius() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.radius;
	}

	public void setRadius(double radius) {
		org.jfree.chart.plot.dial.DialValueIndicator.this.radius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public org.jfree.chart.util.RectangleAnchor getFrameAnchor() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.frameAnchor;
	}

	public void setFrameAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.frameAnchor = anchor;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.lang.Number getTemplateValue() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.templateValue;
	}

	public void setTemplateValue(java.lang.Number value) {
		if (value == null) {
			throw new java.lang.IllegalArgumentException("Null 'value' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.templateValue = value;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.text.NumberFormat getNumberFormat() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.formatter;
	}

	public void setNumberFormat(java.text.NumberFormat formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.formatter = formatter;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.font = font;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.paint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public org.jfree.chart.util.RectangleInsets getInsets() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.insets;
	}

	public void setInsets(org.jfree.chart.util.RectangleInsets insets) {
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.insets = insets;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public org.jfree.chart.util.RectangleAnchor getValueAnchor() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.valueAnchor;
	}

	public void setValueAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.valueAnchor = anchor;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.plot.dial.DialValueIndicator.this.textAnchor;
	}

	public void setTextAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.dial.DialValueIndicator.this.textAnchor = anchor;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialValueIndicator.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.geom.Rectangle2D f = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialValueIndicator.this.radius, org.jfree.chart.plot.dial.DialValueIndicator.this.radius);
		java.awt.geom.Arc2D arc = new java.awt.geom.Arc2D.Double(f, org.jfree.chart.plot.dial.DialValueIndicator.this.angle, 0.0, java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Point2D pt = arc.getStartPoint();
		java.awt.FontMetrics fm = g2.getFontMetrics(org.jfree.chart.plot.dial.DialValueIndicator.this.font);
		java.lang.String s = org.jfree.chart.plot.dial.DialValueIndicator.this.formatter.format(org.jfree.chart.plot.dial.DialValueIndicator.this.templateValue);
		java.awt.geom.Rectangle2D tb = org.jfree.chart.text.TextUtilities.getTextBounds(s, g2, fm);
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.util.RectangleAnchor.createRectangle(new org.jfree.chart.util.Size2D(tb.getWidth(), tb.getHeight()), pt.getX(), pt.getY(), org.jfree.chart.plot.dial.DialValueIndicator.this.frameAnchor);
		java.awt.geom.Rectangle2D fb = org.jfree.chart.plot.dial.DialValueIndicator.this.insets.createOutsetRectangle(bounds);
		g2.setPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint);
		g2.fill(fb);
		g2.setStroke(org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke);
		g2.setPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint);
		g2.draw(fb);
		double value = plot.getValue(org.jfree.chart.plot.dial.DialValueIndicator.this.datasetIndex);
		java.lang.String valueStr = org.jfree.chart.plot.dial.DialValueIndicator.this.formatter.format(value);
		java.awt.geom.Point2D pt2 = org.jfree.chart.util.RectangleAnchor.coordinates(bounds, org.jfree.chart.plot.dial.DialValueIndicator.this.valueAnchor);
		g2.setPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.paint);
		g2.setFont(org.jfree.chart.plot.dial.DialValueIndicator.this.font);
		org.jfree.chart.text.TextUtilities.drawAlignedString(valueStr, g2, ((float) (pt2.getX())), ((float) (pt2.getY())), org.jfree.chart.plot.dial.DialValueIndicator.this.textAnchor);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialValueIndicator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialValueIndicator)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialValueIndicator that = ((org.jfree.chart.plot.dial.DialValueIndicator) (obj));
		if ((org.jfree.chart.plot.dial.DialValueIndicator.this.datasetIndex) != (that.datasetIndex)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialValueIndicator.this.angle) != (that.angle)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialValueIndicator.this.radius) != (that.radius)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.frameAnchor.equals(that.frameAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.templateValue.equals(that.templateValue))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.font.equals(that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialValueIndicator.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke.equals(that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.insets.equals(that.insets))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.valueAnchor.equals(that.valueAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialValueIndicator.this.textAnchor.equals(that.textAnchor))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.paint));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint));
		result = (37 * result) + (org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialValueIndicator.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.DialValueIndicator.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.DialValueIndicator.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.DialValueIndicator.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

