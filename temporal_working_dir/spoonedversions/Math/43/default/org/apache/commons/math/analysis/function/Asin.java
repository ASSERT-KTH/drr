

package org.apache.commons.math.analysis.function;


public class Asin implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.asin(x);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return 1 / (org.apache.commons.math.util.FastMath.sqrt((1 - (x * x))));
			}
		};
	}
}

