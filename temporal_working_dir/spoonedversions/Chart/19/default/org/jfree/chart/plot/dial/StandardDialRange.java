

package org.jfree.chart.plot.dial;


public class StandardDialRange extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	private int scaleIndex;

	private double lowerBound;

	private double upperBound;

	private transient java.awt.Paint paint;

	private double innerRadius;

	private double outerRadius;

	public StandardDialRange() {
		this(0.0, 100.0, java.awt.Color.white);
	}

	public StandardDialRange(double lower, double upper, java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex = 0;
		org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound = lower;
		org.jfree.chart.plot.dial.StandardDialRange.this.upperBound = upper;
		org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius = 0.48;
		org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius = 0.52;
		org.jfree.chart.plot.dial.StandardDialRange.this.paint = paint;
	}

	public int getScaleIndex() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex;
	}

	public void setScaleIndex(int index) {
		org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex = index;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public double getLowerBound() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound;
	}

	public void setLowerBound(double bound) {
		if (bound >= (org.jfree.chart.plot.dial.StandardDialRange.this.upperBound)) {
			throw new java.lang.IllegalArgumentException("Lower bound must be less than upper bound.");
		}
		org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound = bound;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public double getUpperBound() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.upperBound;
	}

	public void setUpperBound(double bound) {
		if (bound <= (org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound)) {
			throw new java.lang.IllegalArgumentException("Lower bound must be less than upper bound.");
		}
		org.jfree.chart.plot.dial.StandardDialRange.this.upperBound = bound;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public void setBounds(double lower, double upper) {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException("Lower must be less than upper.");
		}
		org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound = lower;
		org.jfree.chart.plot.dial.StandardDialRange.this.upperBound = upper;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.dial.StandardDialRange.this.paint = paint;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public double getInnerRadius() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius;
	}

	public void setInnerRadius(double radius) {
		org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public double getOuterRadius() {
		return org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius;
	}

	public void setOuterRadius(double radius) {
		org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.StandardDialRange.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
		java.awt.geom.Rectangle2D arcRectInner = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius, org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius);
		java.awt.geom.Rectangle2D arcRectOuter = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius, org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius);
		org.jfree.chart.plot.dial.DialScale scale = plot.getScale(org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex);
		if (scale == null) {
			throw new java.lang.RuntimeException(("No scale for scaleIndex = " + (org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex)));
		}
		double angleMin = scale.valueToAngle(org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound);
		double angleMax = scale.valueToAngle(org.jfree.chart.plot.dial.StandardDialRange.this.upperBound);
		java.awt.geom.Arc2D arcInner = new java.awt.geom.Arc2D.Double(arcRectInner, angleMin, (angleMax - angleMin), java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Arc2D arcOuter = new java.awt.geom.Arc2D.Double(arcRectOuter, angleMax, (angleMin - angleMax), java.awt.geom.Arc2D.OPEN);
		g2.setPaint(org.jfree.chart.plot.dial.StandardDialRange.this.paint);
		g2.setStroke(new java.awt.BasicStroke(2.0F));
		g2.draw(arcInner);
		g2.draw(arcOuter);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.StandardDialRange.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.StandardDialRange)) {
			return false;
		}
		org.jfree.chart.plot.dial.StandardDialRange that = ((org.jfree.chart.plot.dial.StandardDialRange) (obj));
		if ((org.jfree.chart.plot.dial.StandardDialRange.this.scaleIndex) != (that.scaleIndex)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialRange.this.upperBound) != (that.upperBound)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.StandardDialRange.this.paint, that.paint))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius) != (that.innerRadius)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius) != (that.outerRadius)) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialRange.this.lowerBound);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialRange.this.upperBound);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialRange.this.innerRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.StandardDialRange.this.outerRadius);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.plot.dial.StandardDialRange.this.paint));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.StandardDialRange.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.StandardDialRange.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

