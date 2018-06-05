

package org.jfree.chart.needle;


public class PinNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -3787089953079863373L;

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.Area shape;
		java.awt.geom.GeneralPath pointer = new java.awt.geom.GeneralPath();
		int minY = ((int) (plotArea.getMinY()));
		int maxY = ((int) (plotArea.getMaxY()));
		int midX = ((int) ((plotArea.getMinX()) + ((plotArea.getWidth()) / 2)));
		int lenX = ((int) ((plotArea.getWidth()) / 10));
		if (lenX < 2) {
			lenX = 2;
		}
		pointer.moveTo((midX - lenX), (maxY - lenX));
		pointer.lineTo((midX + lenX), (maxY - lenX));
		pointer.lineTo(midX, (minY + lenX));
		pointer.closePath();
		lenX = 4 * lenX;
		java.awt.geom.Ellipse2D circle = new java.awt.geom.Ellipse2D.Double((midX - (lenX / 2)), ((plotArea.getMaxY()) - lenX), lenX, lenX);
		shape = new java.awt.geom.Area(circle);
		shape.add(new java.awt.geom.Area(pointer));
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			shape.transform(getTransform());
		}
		defaultDisplay(g2, shape);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.PinNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.PinNeedle)) {
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

