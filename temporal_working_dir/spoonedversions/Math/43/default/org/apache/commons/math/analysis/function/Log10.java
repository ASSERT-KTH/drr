

package org.apache.commons.math.analysis.function;


public class Log10 implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private static final double LN_10 = org.apache.commons.math.util.FastMath.log(10);

	public double value(double x) {
		return org.apache.commons.math.util.FastMath.log10(x);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return 1 / (x * (org.apache.commons.math.analysis.function.Log10.LN_10));
			}
		};
	}
}

