

package org.apache.commons.math3.analysis.function;


public class Log implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.log(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return 1 / x;
			}
		};
	}
}

