

package org.jfree.chart.renderer;


public class GrayPaintScale implements java.io.Serializable , org.jfree.chart.renderer.PaintScale , org.jfree.chart.util.PublicCloneable {
	private double lowerBound;

	private double upperBound;

	private int alpha;

	public GrayPaintScale() {
		this(0.0, 1.0);
	}

	public GrayPaintScale(double lowerBound, double upperBound) {
		this(lowerBound, upperBound, 255);
	}

	public GrayPaintScale(double lowerBound, double upperBound, int alpha) {
		if (lowerBound >= upperBound) {
			throw new java.lang.IllegalArgumentException("Requires lowerBound < upperBound.");
		}
		if ((alpha < 0) || (alpha > 255)) {
			throw new java.lang.IllegalArgumentException("Requires alpha in the range 0 to 255.");
		}
		org.jfree.chart.renderer.GrayPaintScale.this.lowerBound = lowerBound;
		org.jfree.chart.renderer.GrayPaintScale.this.upperBound = upperBound;
		org.jfree.chart.renderer.GrayPaintScale.this.alpha = alpha;
	}

	public double getLowerBound() {
		return org.jfree.chart.renderer.GrayPaintScale.this.lowerBound;
	}

	public double getUpperBound() {
		return org.jfree.chart.renderer.GrayPaintScale.this.upperBound;
	}

	public int getAlpha() {
		return org.jfree.chart.renderer.GrayPaintScale.this.alpha;
	}

	public java.awt.Paint getPaint(double value) {
		double v = java.lang.Math.max(value, org.jfree.chart.renderer.GrayPaintScale.this.lowerBound);
		v = java.lang.Math.min(v, org.jfree.chart.renderer.GrayPaintScale.this.upperBound);
		int g = ((int) (((v - (org.jfree.chart.renderer.GrayPaintScale.this.lowerBound)) / ((org.jfree.chart.renderer.GrayPaintScale.this.upperBound) - (org.jfree.chart.renderer.GrayPaintScale.this.lowerBound))) * 255.0));
		return new java.awt.Color(g, g, g, org.jfree.chart.renderer.GrayPaintScale.this.alpha);
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
		if ((org.jfree.chart.renderer.GrayPaintScale.this.alpha) != (that.alpha)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hash = 7;
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.GrayPaintScale.this.lowerBound);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.GrayPaintScale.this.upperBound);
		hash = (43 * hash) + (org.jfree.chart.renderer.GrayPaintScale.this.alpha);
		return hash;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

