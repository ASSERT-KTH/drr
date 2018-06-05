

package org.jfree.chart.plot.dial;


public class StandardDialScale extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialScale , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = 3715644629665918516L;

	private double lowerBound;

	private double upperBound;

	private double startAngle;

	private double extent;

	private double tickRadius;

	private double majorTickIncrement;

	private double majorTickLength;

	private transient java.awt.Paint majorTickPaint;

	private transient java.awt.Stroke majorTickStroke;

	private int minorTickCount;

	private double minorTickLength;

	private transient java.awt.Paint minorTickPaint;

	private transient java.awt.Stroke minorTickStroke;

	private double tickLabelOffset;

	private java.awt.Font tickLabelFont;

	private boolean tickLabelsVisible;

	private java.text.NumberFormat tickLabelFormatter;

	private boolean firstTickLabelVisible;

	private transient java.awt.Paint tickLabelPaint;

	public StandardDialScale() {
		this(0.0, 100.0, 175, (-170), 10.0, 4);
	}

	public StandardDialScale(double lowerBound, double upperBound, double startAngle, double extent, double majorTickIncrement, int minorTickCount) {
		org.jfree.chart.plot.dial.StandardDialScale.this.startAngle = startAngle;
		org.jfree.chart.plot.dial.StandardDialScale.this.extent = extent;
		org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound = lowerBound;
		org.jfree.chart.plot.dial.StandardDialScale.this.upperBound = upperBound;
		org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius = 0.7;
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelsVisible = true;
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFormatter = new java.text.DecimalFormat("0.0");
		org.jfree.chart.plot.dial.StandardDialScale.this.firstTickLabelVisible = true;
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFont = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 16);
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint = java.awt.Color.blue;
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset = 0.1;
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement = majorTickIncrement;
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength = 0.04;
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint = java.awt.Color.black;
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke = new java.awt.BasicStroke(3.0F);
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount = minorTickCount;
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength = 0.02;
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint = java.awt.Color.black;
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke = new java.awt.BasicStroke(1.0F);
	}

	public double getLowerBound() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound;
	}

	public void setLowerBound(double lower) {
		org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound = lower;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getUpperBound() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.upperBound;
	}

	public void setUpperBound(double upper) {
		org.jfree.chart.plot.dial.StandardDialScale.this.upperBound = upper;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getStartAngle() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.startAngle;
	}

	public void setStartAngle(double angle) {
		org.jfree.chart.plot.dial.StandardDialScale.this.startAngle = angle;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getExtent() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.extent;
	}

	public void setExtent(double extent) {
		org.jfree.chart.plot.dial.StandardDialScale.this.extent = extent;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getTickRadius() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius;
	}

	public void setTickRadius(double radius) {
		if (radius <= 0.0) {
			throw new java.lang.IllegalArgumentException("The 'radius' must be positive.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getMajorTickIncrement() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement;
	}

	public void setMajorTickIncrement(double increment) {
		if (increment <= 0.0) {
			throw new java.lang.IllegalArgumentException("The 'increment' must be positive.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement = increment;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getMajorTickLength() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength;
	}

	public void setMajorTickLength(double length) {
		if (length < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'length' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength = length;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Paint getMajorTickPaint() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint;
	}

	public void setMajorTickPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Stroke getMajorTickStroke() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke;
	}

	public void setMajorTickStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public int getMinorTickCount() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount;
	}

	public void setMinorTickCount(int count) {
		if (count < 0) {
			throw new java.lang.IllegalArgumentException("The 'count' cannot be negative.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount = count;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getMinorTickLength() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength;
	}

	public void setMinorTickLength(double length) {
		if (length < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'length' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength = length;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Paint getMinorTickPaint() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint;
	}

	public void setMinorTickPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Stroke getMinorTickStroke() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke;
	}

	public void setMinorTickStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public double getTickLabelOffset() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset;
	}

	public void setTickLabelOffset(double offset) {
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset = offset;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Font getTickLabelFont() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFont;
	}

	public void setTickLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFont = font;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.awt.Paint getTickLabelPaint() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint;
	}

	public void setTickLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public boolean getTickLabelsVisible() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelsVisible;
	}

	public void setTickLabelsVisible(boolean visible) {
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelsVisible = visible;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public java.text.NumberFormat getTickLabelFormatter() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFormatter;
	}

	public void setTickLabelFormatter(java.text.NumberFormat formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFormatter = formatter;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public boolean getFirstTickLabelVisible() {
		return org.jfree.chart.plot.dial.StandardDialScale.this.firstTickLabelVisible;
	}

	public void setFirstTickLabelVisible(boolean visible) {
		org.jfree.chart.plot.dial.StandardDialScale.this.firstTickLabelVisible = visible;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialScale.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.geom.Rectangle2D arcRect = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius, org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius);
		java.awt.geom.Rectangle2D arcRectMajor = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength)), ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength)));
		java.awt.geom.Rectangle2D arcRectMinor = arcRect;
		if (((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount) > 0) && ((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength) > 0.0)) {
			arcRectMinor = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength)), ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength)));
		}
		java.awt.geom.Rectangle2D arcRectForLabels = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset)), ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) - (org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset)));
		boolean firstLabel = true;
		java.awt.geom.Arc2D arc = new java.awt.geom.Arc2D.Double();
		java.awt.geom.Line2D workingLine = new java.awt.geom.Line2D.Double();
		for (double v = org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound; v <= (org.jfree.chart.plot.dial.StandardDialScale.this.upperBound); v += org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement) {
			arc.setArc(arcRect, org.jfree.chart.plot.dial.StandardDialScale.this.startAngle, ((valueToAngle(v)) - (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle)), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt0 = arc.getEndPoint();
			arc.setArc(arcRectMajor, org.jfree.chart.plot.dial.StandardDialScale.this.startAngle, ((valueToAngle(v)) - (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle)), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt1 = arc.getEndPoint();
			g2.setPaint(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint);
			g2.setStroke(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke);
			workingLine.setLine(pt0, pt1);
			g2.draw(workingLine);
			arc.setArc(arcRectForLabels, org.jfree.chart.plot.dial.StandardDialScale.this.startAngle, ((valueToAngle(v)) - (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle)), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt2 = arc.getEndPoint();
			if (org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelsVisible) {
				if ((!firstLabel) || (org.jfree.chart.plot.dial.StandardDialScale.this.firstTickLabelVisible)) {
					g2.setFont(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFont);
					g2.setPaint(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint);
					org.jfree.chart.text.TextUtilities.drawAlignedString(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFormatter.format(v), g2, ((float) (pt2.getX())), ((float) (pt2.getY())), org.jfree.chart.text.TextAnchor.CENTER);
				}
			}
			firstLabel = false;
			if (((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount) > 0) && ((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength) > 0.0)) {
				double minorTickIncrement = (org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement) / ((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount) + 1);
				for (int i = 0; i < (org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount); i++) {
					double vv = v + ((i + 1) * minorTickIncrement);
					if (vv >= (org.jfree.chart.plot.dial.StandardDialScale.this.upperBound)) {
						break;
					}
					double angle = valueToAngle(vv);
					arc.setArc(arcRect, org.jfree.chart.plot.dial.StandardDialScale.this.startAngle, (angle - (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle)), java.awt.geom.Arc2D.OPEN);
					pt0 = arc.getEndPoint();
					arc.setArc(arcRectMinor, org.jfree.chart.plot.dial.StandardDialScale.this.startAngle, (angle - (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle)), java.awt.geom.Arc2D.OPEN);
					java.awt.geom.Point2D pt3 = arc.getEndPoint();
					g2.setStroke(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke);
					g2.setPaint(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint);
					workingLine.setLine(pt0, pt3);
					g2.draw(workingLine);
				}
			}
		}
	}

	public double valueToAngle(double value) {
		double range = (org.jfree.chart.plot.dial.StandardDialScale.this.upperBound) - (org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound);
		double unit = (org.jfree.chart.plot.dial.StandardDialScale.this.extent) / range;
		return (org.jfree.chart.plot.dial.StandardDialScale.this.startAngle) + (unit * (value - (org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound)));
	}

	public double angleToValue(double angle) {
		return java.lang.Double.NaN;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.StandardDialScale.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.StandardDialScale)) {
			return false;
		}
		org.jfree.chart.plot.dial.StandardDialScale that = ((org.jfree.chart.plot.dial.StandardDialScale) (obj));
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.upperBound) != (that.upperBound)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.startAngle) != (that.startAngle)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.extent) != (that.extent)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius) != (that.tickRadius)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.majorTickIncrement) != (that.majorTickIncrement)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.majorTickLength) != (that.majorTickLength)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint, that.majorTickPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke.equals(that.majorTickStroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickCount) != (that.minorTickCount)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.minorTickLength) != (that.minorTickLength)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint, that.minorTickPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke.equals(that.minorTickStroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelsVisible) != (that.tickLabelsVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelOffset) != (that.tickLabelOffset)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelFont.equals(that.tickLabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint, that.tickLabelPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialScale.this.lowerBound);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialScale.this.upperBound);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialScale.this.startAngle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialScale.this.extent);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialScale.this.tickRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.StandardDialScale.this.majorTickStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.StandardDialScale.this.minorTickStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.dial.StandardDialScale.this.tickLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

