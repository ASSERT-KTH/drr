

package org.apache.commons.math.analysis.function;


public class Sqrt implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.sqrt(x);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return 1 / (2 * (org.apache.commons.math.util.FastMath.sqrt(x)));
			}
		};
	}
}

