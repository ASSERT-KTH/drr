

package org.jfree.chart.annotations;


public class XYPointerAnnotation extends org.jfree.chart.annotations.XYTextAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4031161445009858551L;

	public static final double DEFAULT_TIP_RADIUS = 10.0;

	public static final double DEFAULT_BASE_RADIUS = 30.0;

	public static final double DEFAULT_LABEL_OFFSET = 3.0;

	public static final double DEFAULT_ARROW_LENGTH = 5.0;

	public static final double DEFAULT_ARROW_WIDTH = 3.0;

	private double angle;

	private double tipRadius;

	private double baseRadius;

	private double arrowLength;

	private double arrowWidth;

	private transient java.awt.Stroke arrowStroke;

	private transient java.awt.Paint arrowPaint;

	private double labelOffset;

	public XYPointerAnnotation(java.lang.String label, double x, double y, double angle) {
		super(label, x, y);
		org.jfree.chart.annotations.XYPointerAnnotation.this.angle = angle;
		org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius = org.jfree.chart.annotations.XYPointerAnnotation.DEFAULT_TIP_RADIUS;
		org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius = org.jfree.chart.annotations.XYPointerAnnotation.DEFAULT_BASE_RADIUS;
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength = org.jfree.chart.annotations.XYPointerAnnotation.DEFAULT_ARROW_LENGTH;
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth = org.jfree.chart.annotations.XYPointerAnnotation.DEFAULT_ARROW_WIDTH;
		org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset = org.jfree.chart.annotations.XYPointerAnnotation.DEFAULT_LABEL_OFFSET;
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint = java.awt.Color.black;
	}

	public double getAngle() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.angle;
	}

	public void setAngle(double angle) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.angle = angle;
	}

	public double getTipRadius() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius;
	}

	public void setTipRadius(double radius) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius = radius;
	}

	public double getBaseRadius() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius;
	}

	public void setBaseRadius(double radius) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius = radius;
	}

	public double getLabelOffset() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset;
	}

	public void setLabelOffset(double offset) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset = offset;
	}

	public double getArrowLength() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength;
	}

	public void setArrowLength(double length) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength = length;
	}

	public double getArrowWidth() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth;
	}

	public void setArrowWidth(double width) {
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth = width;
	}

	public java.awt.Stroke getArrowStroke() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke;
	}

	public void setArrowStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' not permitted.");
		}
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke = stroke;
	}

	public java.awt.Paint getArrowPaint() {
		return org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint;
	}

	public void setArrowPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint = paint;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		double j2DX = domainAxis.valueToJava2D(getX(), dataArea, domainEdge);
		double j2DY = rangeAxis.valueToJava2D(getY(), dataArea, rangeEdge);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double temp = j2DX;
			j2DX = j2DY;
			j2DY = temp;
		}
		double startX = j2DX + ((java.lang.Math.cos(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius));
		double startY = j2DY + ((java.lang.Math.sin(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius));
		double endX = j2DX + ((java.lang.Math.cos(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius));
		double endY = j2DY + ((java.lang.Math.sin(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius));
		double arrowBaseX = endX + ((java.lang.Math.cos(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength));
		double arrowBaseY = endY + ((java.lang.Math.sin(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength));
		double arrowLeftX = arrowBaseX + ((java.lang.Math.cos(((org.jfree.chart.annotations.XYPointerAnnotation.this.angle) + ((java.lang.Math.PI) / 2.0)))) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth));
		double arrowLeftY = arrowBaseY + ((java.lang.Math.sin(((org.jfree.chart.annotations.XYPointerAnnotation.this.angle) + ((java.lang.Math.PI) / 2.0)))) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth));
		double arrowRightX = arrowBaseX - ((java.lang.Math.cos(((org.jfree.chart.annotations.XYPointerAnnotation.this.angle) + ((java.lang.Math.PI) / 2.0)))) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth));
		double arrowRightY = arrowBaseY - ((java.lang.Math.sin(((org.jfree.chart.annotations.XYPointerAnnotation.this.angle) + ((java.lang.Math.PI) / 2.0)))) * (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth));
		java.awt.geom.GeneralPath arrow = new java.awt.geom.GeneralPath();
		arrow.moveTo(((float) (endX)), ((float) (endY)));
		arrow.lineTo(((float) (arrowLeftX)), ((float) (arrowLeftY)));
		arrow.lineTo(((float) (arrowRightX)), ((float) (arrowRightY)));
		arrow.closePath();
		g2.setStroke(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke);
		g2.setPaint(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint);
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(startX, startY, endX, endY);
		g2.draw(line);
		g2.fill(arrow);
		g2.setFont(getFont());
		g2.setPaint(getPaint());
		double labelX = j2DX + ((java.lang.Math.cos(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * ((org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius) + (org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset)));
		double labelY = j2DY + ((java.lang.Math.sin(org.jfree.chart.annotations.XYPointerAnnotation.this.angle)) * ((org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius) + (org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset)));
		java.awt.geom.Rectangle2D hotspot = org.jfree.chart.text.TextUtilities.drawAlignedString(getText(), g2, ((float) (labelX)), ((float) (labelY)), getTextAnchor());
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, hotspot, rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYPointerAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYPointerAnnotation)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.annotations.XYPointerAnnotation that = ((org.jfree.chart.annotations.XYPointerAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.angle) != (that.angle)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius) != (that.tipRadius)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius) != (that.baseRadius)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength) != (that.arrowLength)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth) != (that.arrowWidth)) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint.equals(that.arrowPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke, that.arrowStroke))) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset) != (that.labelOffset)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.angle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.tipRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.baseRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowLength);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowWidth);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (result * 37) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint));
		result = (result * 37) + (org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke.hashCode());
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYPointerAnnotation.this.labelOffset);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return super.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYPointerAnnotation.this.arrowStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

