

package org.apache.commons.math3.analysis.function;


public class Cos implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.cos(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return -(org.apache.commons.math3.util.FastMath.sin(x));
			}
		};
	}
}

