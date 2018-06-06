

package org.jfree.chart.util;


public class Size2D implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 2558191683786418168L;

	public double width;

	public double height;

	public Size2D() {
		this(0.0, 0.0);
	}

	public Size2D(double width, double height) {
		org.jfree.chart.util.Size2D.this.width = width;
		org.jfree.chart.util.Size2D.this.height = height;
	}

	public double getWidth() {
		return org.jfree.chart.util.Size2D.this.width;
	}

	public void setWidth(double width) {
		org.jfree.chart.util.Size2D.this.width = width;
	}

	public double getHeight() {
		return org.jfree.chart.util.Size2D.this.height;
	}

	public void setHeight(double height) {
		org.jfree.chart.util.Size2D.this.height = height;
	}

	public java.lang.String toString() {
		return ((("Size2D[width=" + (org.jfree.chart.util.Size2D.this.width)) + ", height=") + (org.jfree.chart.util.Size2D.this.height)) + "]";
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.Size2D.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.Size2D)) {
			return false;
		}
		final org.jfree.chart.util.Size2D that = ((org.jfree.chart.util.Size2D) (obj));
		if ((org.jfree.chart.util.Size2D.this.width) != (that.width)) {
			return false;
		}
		if ((org.jfree.chart.util.Size2D.this.height) != (that.height)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

