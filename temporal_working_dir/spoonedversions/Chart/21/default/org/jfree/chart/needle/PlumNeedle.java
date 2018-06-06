

package org.jfree.chart.needle;


public class PlumNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -3082660488660600718L;

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.Arc2D shape = new java.awt.geom.Arc2D.Double(java.awt.geom.Arc2D.PIE);
		double radius = plotArea.getHeight();
		double halfX = (plotArea.getWidth()) / 2;
		double diameter = 2 * radius;
		shape.setFrame((((plotArea.getMinX()) + halfX) - radius), ((plotArea.getMinY()) - radius), diameter, diameter);
		radius = java.lang.Math.toDegrees(java.lang.Math.asin((halfX / radius)));
		shape.setAngleStart((270 - radius));
		shape.setAngleExtent((2 * radius));
		java.awt.geom.Area s = new java.awt.geom.Area(shape);
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			s.transform(getTransform());
		}
		defaultDisplay(g2, s);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.PlumNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.PlumNeedle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

