

package org.jfree.chart.needle;


public class LineNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 6215321387896748945L;

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.Line2D shape = new java.awt.geom.Line2D.Double();
		double x = (plotArea.getMinX()) + ((plotArea.getWidth()) / 2);
		shape.setLine(x, plotArea.getMinY(), x, plotArea.getMaxY());
		java.awt.Shape s = shape;
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			s = getTransform().createTransformedShape(s);
		}
		defaultDisplay(g2, s);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.LineNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.LineNeedle)) {
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

