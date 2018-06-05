

package org.jfree.data.function;


public class LineFunction2D implements java.io.Serializable , org.jfree.data.function.Function2D {
	private double a;

	private double b;

	public LineFunction2D(double a, double b) {
		org.jfree.data.function.LineFunction2D.this.a = a;
		org.jfree.data.function.LineFunction2D.this.b = b;
	}

	public double getIntercept() {
		return org.jfree.data.function.LineFunction2D.this.a;
	}

	public double getSlope() {
		return org.jfree.data.function.LineFunction2D.this.b;
	}

	public double getValue(double x) {
		return (org.jfree.data.function.LineFunction2D.this.a) + ((org.jfree.data.function.LineFunction2D.this.b) * x);
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.function.LineFunction2D)) {
			return false;
		}
		org.jfree.data.function.LineFunction2D that = ((org.jfree.data.function.LineFunction2D) (obj));
		if ((org.jfree.data.function.LineFunction2D.this.a) != (that.a)) {
			return false;
		}
		if ((org.jfree.data.function.LineFunction2D.this.b) != (that.b)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 29;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.LineFunction2D.this.a);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.LineFunction2D.this.b);
		return result;
	}
}

