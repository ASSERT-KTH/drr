

package org.jfree.chart.renderer;


public class Outlier implements java.lang.Comparable {
	private java.awt.geom.Point2D point;

	private double radius;

	public Outlier(double xCoord, double yCoord, double radius) {
		org.jfree.chart.renderer.Outlier.this.point = new java.awt.geom.Point2D.Double((xCoord - radius), (yCoord - radius));
		org.jfree.chart.renderer.Outlier.this.radius = radius;
	}

	public java.awt.geom.Point2D getPoint() {
		return org.jfree.chart.renderer.Outlier.this.point;
	}

	public void setPoint(java.awt.geom.Point2D point) {
		org.jfree.chart.renderer.Outlier.this.point = point;
	}

	public double getX() {
		return getPoint().getX();
	}

	public double getY() {
		return getPoint().getY();
	}

	public double getRadius() {
		return org.jfree.chart.renderer.Outlier.this.radius;
	}

	public void setRadius(double radius) {
		org.jfree.chart.renderer.Outlier.this.radius = radius;
	}

	public int compareTo(java.lang.Object o) {
		org.jfree.chart.renderer.Outlier outlier = ((org.jfree.chart.renderer.Outlier) (o));
		java.awt.geom.Point2D p1 = getPoint();
		java.awt.geom.Point2D p2 = outlier.getPoint();
		if (p1.equals(p2)) {
			return 0;
		}else
			if (((p1.getX()) < (p2.getX())) || ((p1.getY()) < (p2.getY()))) {
				return -1;
			}else {
				return 1;
			}
		
	}

	public boolean overlaps(org.jfree.chart.renderer.Outlier other) {
		return ((((other.getX()) >= ((getX()) - ((org.jfree.chart.renderer.Outlier.this.radius) * 1.1))) && ((other.getX()) <= ((getX()) + ((org.jfree.chart.renderer.Outlier.this.radius) * 1.1)))) && ((other.getY()) >= ((getY()) - ((org.jfree.chart.renderer.Outlier.this.radius) * 1.1)))) && ((other.getY()) <= ((getY()) + ((org.jfree.chart.renderer.Outlier.this.radius) * 1.1)));
	}

	public java.lang.String toString() {
		return ((("{" + (getX())) + ",") + (getY())) + "}";
	}
}

