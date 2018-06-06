

package org.jfree.data.function;


public class LineFunction2D implements org.jfree.data.function.Function2D {
	private double a;

	private double b;

	public LineFunction2D(double a, double b) {
		org.jfree.data.function.LineFunction2D.this.a = a;
		org.jfree.data.function.LineFunction2D.this.b = b;
	}

	public double getValue(double x) {
		return (org.jfree.data.function.LineFunction2D.this.a) + ((org.jfree.data.function.LineFunction2D.this.b) * x);
	}
}

