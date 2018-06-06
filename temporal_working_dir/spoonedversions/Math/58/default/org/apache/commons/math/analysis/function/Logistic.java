

package org.apache.commons.math.analysis.function;


public class Logistic implements org.apache.commons.math.analysis.UnivariateRealFunction {
	private final double a;

	private final double k;

	private final double b;

	private final double n;

	private final double q;

	private final double m;

	public Logistic(double k, double m, double b, double q, double a, double n) {
		if (n <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(n);
		}
		this.k = k;
		this.m = m;
		this.b = b;
		this.q = q;
		this.a = a;
		this.n = n;
	}

	public double value(double x) {
		return (a) + (((k) - (a)) / (org.apache.commons.math.util.FastMath.pow((1 + ((q) * (org.apache.commons.math.util.FastMath.exp(((b) * ((m) - x)))))), (1 / (n)))));
	}
}

