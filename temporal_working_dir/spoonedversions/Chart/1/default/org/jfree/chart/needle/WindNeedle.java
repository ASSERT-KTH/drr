

package org.jfree.chart.needle;


public class WindNeedle extends org.jfree.chart.needle.ArrowNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -2861061368907167834L;

	public WindNeedle() {
		super(false);
	}

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		super.drawNeedle(g2, plotArea, rotate, angle);
		if ((rotate != null) && (plotArea != null)) {
			int spacing = (getSize()) * 3;
			java.awt.geom.Rectangle2D newArea = new java.awt.geom.Rectangle2D.Double();
			java.awt.geom.Point2D newRotate = rotate;
			newArea.setRect(((plotArea.getMinX()) - spacing), plotArea.getMinY(), plotArea.getWidth(), plotArea.getHeight());
			super.drawNeedle(g2, newArea, newRotate, angle);
			newArea.setRect(((plotArea.getMinX()) + spacing), plotArea.getMinY(), plotArea.getWidth(), plotArea.getHeight());
			super.drawNeedle(g2, newArea, newRotate, angle);
		}
	}

	public boolean equals(java.lang.Object object) {
		if (object == null) {
			return false;
		}
		if (object == (org.jfree.chart.needle.WindNeedle.this)) {
			return true;
		}
		if ((super.equals(object)) && (object instanceof org.jfree.chart.needle.WindNeedle)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return super.hashCode();
	}
}

