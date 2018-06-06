

package org.jfree.data.function;


public class PowerFunction2D implements java.io.Serializable , org.jfree.data.function.Function2D {
	private double a;

	private double b;

	public PowerFunction2D(double a, double b) {
		org.jfree.data.function.PowerFunction2D.this.a = a;
		org.jfree.data.function.PowerFunction2D.this.b = b;
	}

	public double getA() {
		return org.jfree.data.function.PowerFunction2D.this.a;
	}

	public double getB() {
		return org.jfree.data.function.PowerFunction2D.this.b;
	}

	public double getValue(double x) {
		return (org.jfree.data.function.PowerFunction2D.this.a) * (java.lang.Math.pow(x, org.jfree.data.function.PowerFunction2D.this.b));
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.function.PowerFunction2D)) {
			return false;
		}
		org.jfree.data.function.PowerFunction2D that = ((org.jfree.data.function.PowerFunction2D) (obj));
		if ((org.jfree.data.function.PowerFunction2D.this.a) != (that.a)) {
			return false;
		}
		if ((org.jfree.data.function.PowerFunction2D.this.b) != (that.b)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 29;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.PowerFunction2D.this.a);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.PowerFunction2D.this.b);
		return result;
	}
}

