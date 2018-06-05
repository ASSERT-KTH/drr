

package org.jfree.data.function;


public class PowerFunction2D implements org.jfree.data.function.Function2D {
	private double a;

	private double b;

	public PowerFunction2D(double a, double b) {
		org.jfree.data.function.PowerFunction2D.this.a = a;
		org.jfree.data.function.PowerFunction2D.this.b = b;
	}

	public double getValue(double x) {
		return (org.jfree.data.function.PowerFunction2D.this.a) * (java.lang.Math.pow(x, org.jfree.data.function.PowerFunction2D.this.b));
	}
}

