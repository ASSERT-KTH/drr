

package org.apache.commons.math3.analysis.function;


public class Exp implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.exp(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return org.apache.commons.math3.util.FastMath.exp(x);
			}
		};
	}
}

