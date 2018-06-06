

package org.jfree.chart.renderer;


public class GrayPaintScale implements java.io.Serializable , org.jfree.chart.renderer.PaintScale , org.jfree.chart.util.PublicCloneable {
	private double lowerBound;

	private double upperBound;

	public GrayPaintScale() {
		this(0.0, 1.0);
	}

	public GrayPaintScale(double lowerBound, double upperBound) {
		if (lowerBound >= upperBound) {
			throw new java.lang.IllegalArgumentException("Requires lowerBound < upperBound.");
		}
		org.jfree.chart.renderer.GrayPaintScale.this.lowerBound = lowerBound;
		org.jfree.chart.renderer.GrayPaintScale.this.upperBound = upperBound;
	}

	public double getLowerBound() {
		return org.jfree.chart.renderer.GrayPaintScale.this.lowerBound;
	}

	public double getUpperBound() {
		return org.jfree.chart.renderer.GrayPaintScale.this.upperBound;
	}

	public java.awt.Paint getPaint(double value) {
		double v = java.lang.Math.max(value, org.jfree.chart.renderer.GrayPaintScale.this.lowerBound);
		v = java.lang.Math.min(v, org.jfree.chart.renderer.GrayPaintScale.this.upperBound);
		int g = ((int) (((v - (org.jfree.chart.renderer.GrayPaintScale.this.lowerBound)) / ((org.jfree.chart.renderer.GrayPaintScale.this.upperBound) - (org.jfree.chart.renderer.GrayPaintScale.this.lowerBound))) * 255.0));
		return new java.awt.Color(g, g, g);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.GrayPaintScale.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.GrayPaintScale)) {
			return false;
		}
		org.jfree.chart.renderer.GrayPaintScale that = ((org.jfree.chart.renderer.GrayPaintScale) (obj));
		if ((org.jfree.chart.renderer.GrayPaintScale.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.chart.renderer.GrayPaintScale.this.upperBound) != (that.upperBound)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

