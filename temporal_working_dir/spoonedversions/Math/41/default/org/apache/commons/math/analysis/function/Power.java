

package org.apache.commons.math.analysis.function;


public class Power implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	private final double p;

	public Power(double p) {
		this.p = p;
	}

	public double value(double x) {
		return org.apache.commons.math.util.FastMath.pow(x, p);
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return (p) * (org.apache.commons.math.util.FastMath.pow(x, ((p) - 1)));
			}
		};
	}
}

