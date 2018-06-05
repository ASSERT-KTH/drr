

package org.jfree.chart.needle;


public class ArrowNeedle extends org.jfree.chart.needle.MeterNeedle implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -5334056511213782357L;

	private boolean isArrowAtTop = true;

	public ArrowNeedle(boolean isArrowAtTop) {
		org.jfree.chart.needle.ArrowNeedle.this.isArrowAtTop = isArrowAtTop;
	}

	protected void drawNeedle(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D rotate, double angle) {
		java.awt.geom.Line2D shape = new java.awt.geom.Line2D.Float();
		java.awt.Shape d = null;
		float x = ((float) ((plotArea.getMinX()) + ((plotArea.getWidth()) / 2)));
		float minY = ((float) (plotArea.getMinY()));
		float maxY = ((float) (plotArea.getMaxY()));
		shape.setLine(x, minY, x, maxY);
		java.awt.geom.GeneralPath shape1 = new java.awt.geom.GeneralPath();
		if (org.jfree.chart.needle.ArrowNeedle.this.isArrowAtTop) {
			shape1.moveTo(x, minY);
			minY += 4 * (getSize());
		}else {
			shape1.moveTo(x, maxY);
			minY = maxY - (4 * (getSize()));
		}
		shape1.lineTo((x + (getSize())), minY);
		shape1.lineTo((x - (getSize())), minY);
		shape1.closePath();
		if ((rotate != null) && (angle != 0)) {
			getTransform().setToRotation(angle, rotate.getX(), rotate.getY());
			d = getTransform().createTransformedShape(shape);
		}else {
			d = shape;
		}
		defaultDisplay(g2, d);
		if ((rotate != null) && (angle != 0)) {
			d = getTransform().createTransformedShape(shape1);
		}else {
			d = shape1;
		}
		defaultDisplay(g2, d);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.needle.ArrowNeedle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.needle.ArrowNeedle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.needle.ArrowNeedle that = ((org.jfree.chart.needle.ArrowNeedle) (obj));
		if ((org.jfree.chart.needle.ArrowNeedle.this.isArrowAtTop) != (that.isArrowAtTop)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

