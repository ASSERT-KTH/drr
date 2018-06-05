

package org.apache.commons.math3.analysis.function;


public class Asin implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.asin(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return 1 / (org.apache.commons.math3.util.FastMath.sqrt((1 - (x * x))));
			}
		};
	}
}

