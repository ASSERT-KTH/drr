

package org.jfree.chart.plot.dial;


public class ArcDialFrame extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialFrame , org.jfree.chart.util.PublicCloneable {
	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Paint foregroundPaint;

	private transient java.awt.Stroke stroke;

	private double startAngle;

	private double extent;

	private double innerRadius;

	private double outerRadius;

	public ArcDialFrame() {
		this(0, 180);
	}

	public ArcDialFrame(double startAngle, double extent) {
		org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint = java.awt.Color.gray;
		org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint = new java.awt.Color(100, 100, 150);
		org.jfree.chart.plot.dial.ArcDialFrame.this.stroke = new java.awt.BasicStroke(2.0F);
		org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius = 0.25;
		org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius = 0.75;
		org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle = startAngle;
		org.jfree.chart.plot.dial.ArcDialFrame.this.extent = extent;
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public java.awt.Paint getForegroundPaint() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint;
	}

	public void setForegroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.dial.ArcDialFrame.this.stroke = stroke;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public double getInnerRadius() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius;
	}

	public void setInnerRadius(double radius) {
		if (radius < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'radius' argument.");
		}
		org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public double getOuterRadius() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius;
	}

	public void setOuterRadius(double radius) {
		if (radius < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'radius' argument.");
		}
		org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public double getStartAngle() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle;
	}

	public void setStartAngle(double angle) {
		org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle = angle;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public double getExtent() {
		return org.jfree.chart.plot.dial.ArcDialFrame.this.extent;
	}

	public void setExtent(double extent) {
		org.jfree.chart.plot.dial.ArcDialFrame.this.extent = extent;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.ArcDialFrame.this));
	}

	public java.awt.Shape getWindow(java.awt.geom.Rectangle2D frame) {
		java.awt.geom.Rectangle2D innerFrame = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius, org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius);
		java.awt.geom.Rectangle2D outerFrame = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius, org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius);
		java.awt.geom.Arc2D inner = new java.awt.geom.Arc2D.Double(innerFrame, org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle, org.jfree.chart.plot.dial.ArcDialFrame.this.extent, java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Arc2D outer = new java.awt.geom.Arc2D.Double(outerFrame, ((org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle) + (org.jfree.chart.plot.dial.ArcDialFrame.this.extent)), (-(org.jfree.chart.plot.dial.ArcDialFrame.this.extent)), java.awt.geom.Arc2D.OPEN);
		java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();
		java.awt.geom.Point2D point1 = inner.getStartPoint();
		p.moveTo(((float) (point1.getX())), ((float) (point1.getY())));
		p.append(inner, true);
		p.append(outer, true);
		p.closePath();
		return p;
	}

	protected java.awt.Shape getOuterWindow(java.awt.geom.Rectangle2D frame) {
		double radiusMargin = 0.02;
		double angleMargin = 1.5;
		java.awt.geom.Rectangle2D innerFrame = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius) - radiusMargin), ((org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius) - radiusMargin));
		java.awt.geom.Rectangle2D outerFrame = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, ((org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius) + radiusMargin), ((org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius) + radiusMargin));
		java.awt.geom.Arc2D inner = new java.awt.geom.Arc2D.Double(innerFrame, ((org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle) - angleMargin), ((org.jfree.chart.plot.dial.ArcDialFrame.this.extent) + (2 * angleMargin)), java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Arc2D outer = new java.awt.geom.Arc2D.Double(outerFrame, (((org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle) + angleMargin) + (org.jfree.chart.plot.dial.ArcDialFrame.this.extent)), ((-(org.jfree.chart.plot.dial.ArcDialFrame.this.extent)) - (2 * angleMargin)), java.awt.geom.Arc2D.OPEN);
		java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();
		java.awt.geom.Point2D point1 = inner.getStartPoint();
		p.moveTo(((float) (point1.getX())), ((float) (point1.getY())));
		p.append(inner, true);
		p.append(outer, true);
		p.closePath();
		return p;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.Shape window = getWindow(frame);
		java.awt.Shape outerWindow = getOuterWindow(frame);
		java.awt.geom.Area area1 = new java.awt.geom.Area(outerWindow);
		java.awt.geom.Area area2 = new java.awt.geom.Area(window);
		area1.subtract(area2);
		g2.setPaint(java.awt.Color.lightGray);
		g2.fill(area1);
		g2.setStroke(org.jfree.chart.plot.dial.ArcDialFrame.this.stroke);
		g2.setPaint(org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint);
		g2.draw(window);
		g2.draw(outerWindow);
	}

	public boolean isClippedToWindow() {
		return false;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.ArcDialFrame.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.ArcDialFrame)) {
			return false;
		}
		org.jfree.chart.plot.dial.ArcDialFrame that = ((org.jfree.chart.plot.dial.ArcDialFrame) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint, that.foregroundPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle) != (that.startAngle)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.ArcDialFrame.this.extent) != (that.extent)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius) != (that.innerRadius)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius) != (that.outerRadius)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.ArcDialFrame.this.stroke.equals(that.stroke))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.ArcDialFrame.this.startAngle);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.ArcDialFrame.this.extent);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.ArcDialFrame.this.innerRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.ArcDialFrame.this.outerRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint));
		result = (37 * result) + (org.jfree.chart.plot.dial.ArcDialFrame.this.stroke.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.ArcDialFrame.this.stroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.ArcDialFrame.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.ArcDialFrame.this.foregroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.dial.ArcDialFrame.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}

