

package org.jfree.chart.needle;


public class ShipNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 149554868169435612L;

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.GeneralPath shape = new java.awt.geom.GeneralPath();
		shape.append(new java.awt.geom.Arc2D.Double((-9.0), (-7.0), 10, 14, 0.0, 25.5, java.awt.geom.Arc2D.OPEN), true);
		shape.append(new java.awt.geom.Arc2D.Double(0.0, (-7.0), 10, 14, 154.5, 25.5, java.awt.geom.Arc2D.OPEN), true);
		shape.closePath();
		getTransform().setToTranslation(plotArea.getMinX(), plotArea.getMaxY());
		getTransform().scale(plotArea.getWidth(), ((plotArea.getHeight()) / 3));
		shape.transform(getTransform());
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			shape.transform(getTransform());
		}
		defaultDisplay(g2, shape);
	}

	public boolean equals(java.lang.Object object) {
		if (object == null) {
			return false;
		}
		if (object == (org.jfree.chart.needle.ShipNeedle.this)) {
			return true;
		}
		if ((super.equals(object)) && (object instanceof org.jfree.chart.needle.ShipNeedle)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

