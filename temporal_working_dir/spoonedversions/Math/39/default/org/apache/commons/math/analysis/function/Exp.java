

package org.apache.commons.math.analysis.function;


public class Exp implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.exp(x);
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return org.apache.commons.math.util.FastMath.exp(x);
			}
		};
	}
}

