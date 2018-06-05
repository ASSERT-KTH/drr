

package org.jfree.chart.needle;


public class LongNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -4319985779783688159L;

	public LongNeedle() {
		super();
		setRotateY(0.8);
	}

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.GeneralPath shape1 = new java.awt.geom.GeneralPath();
		java.awt.geom.GeneralPath shape2 = new java.awt.geom.GeneralPath();
		java.awt.geom.GeneralPath shape3 = new java.awt.geom.GeneralPath();
		float minX = ((float) (plotArea.getMinX()));
		float minY = ((float) (plotArea.getMinY()));
		float maxX = ((float) (plotArea.getMaxX()));
		float maxY = ((float) (plotArea.getMaxY()));
		float midX = ((float) (minX + ((plotArea.getWidth()) * 0.5)));
		float midY = ((float) (minY + ((plotArea.getHeight()) * 0.8)));
		float y = maxY - (2 * (maxY - midY));
		if (y < minY) {
			y = minY;
		}
		shape1.moveTo(minX, midY);
		shape1.lineTo(midX, minY);
		shape1.lineTo(midX, y);
		shape1.closePath();
		shape2.moveTo(maxX, midY);
		shape2.lineTo(midX, minY);
		shape2.lineTo(midX, y);
		shape2.closePath();
		shape3.moveTo(minX, midY);
		shape3.lineTo(midX, maxY);
		shape3.lineTo(maxX, midY);
		shape3.lineTo(midX, y);
		shape3.closePath();
		java.awt.Shape s1 = shape1;
		java.awt.Shape s2 = shape2;
		java.awt.Shape s3 = shape3;
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			s1 = shape1.createTransformedShape(org.jfree.chart.needle.MeterNeedle.transform);
			s2 = shape2.createTransformedShape(org.jfree.chart.needle.MeterNeedle.transform);
			s3 = shape3.createTransformedShape(org.jfree.chart.needle.MeterNeedle.transform);
		}
		if ((getHighlightPaint()) != null) {
			g2.setPaint(getHighlightPaint());
			g2.fill(s3);
		}
		if ((getFillPaint()) != null) {
			g2.setPaint(getFillPaint());
			g2.fill(s1);
			g2.fill(s2);
		}
		if ((getOutlinePaint()) != null) {
			g2.setStroke(getOutlineStroke());
			g2.setPaint(getOutlinePaint());
			g2.draw(s1);
			g2.draw(s2);
			g2.draw(s3);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.LongNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.LongNeedle)) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

