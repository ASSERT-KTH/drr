

package org.jfree.chart.needle;


public class PointerNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -4744677345334729606L;

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.GeneralPath shape1 = new java.awt.geom.GeneralPath();
		java.awt.geom.GeneralPath shape2 = new java.awt.geom.GeneralPath();
		float minX = ((float) (plotArea.getMinX()));
		float minY = ((float) (plotArea.getMinY()));
		float maxX = ((float) (plotArea.getMaxX()));
		float maxY = ((float) (plotArea.getMaxY()));
		float midX = ((float) (minX + ((plotArea.getWidth()) / 2)));
		float midY = ((float) (minY + ((plotArea.getHeight()) / 2)));
		shape1.moveTo(minX, midY);
		shape1.lineTo(midX, minY);
		shape1.lineTo(maxX, midY);
		shape1.closePath();
		shape2.moveTo(minX, midY);
		shape2.lineTo(midX, maxY);
		shape2.lineTo(maxX, midY);
		shape2.closePath();
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			shape1.transform(getTransform());
			shape2.transform(getTransform());
		}
		if ((getFillPaint()) != null) {
			g2.setPaint(getFillPaint());
			g2.fill(shape1);
		}
		if ((getHighlightPaint()) != null) {
			g2.setPaint(getHighlightPaint());
			g2.fill(shape2);
		}
		if ((getOutlinePaint()) != null) {
			g2.setStroke(getOutlineStroke());
			g2.setPaint(getOutlinePaint());
			g2.draw(shape1);
			g2.draw(shape2);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.PointerNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.PointerNeedle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

