

package org.apache.commons.math3.analysis.function;


public class Log10 implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	private static final double LN_10 = org.apache.commons.math3.util.FastMath.log(10);

	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.log10(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return 1 / (x * (org.apache.commons.math3.analysis.function.Log10.LN_10));
			}
		};
	}
}

