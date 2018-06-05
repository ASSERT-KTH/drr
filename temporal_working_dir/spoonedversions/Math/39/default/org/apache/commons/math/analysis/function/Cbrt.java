

package org.apache.commons.math.analysis.function;


public class Cbrt implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.cbrt(x);
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return 1 / (3 * (org.apache.commons.math.util.FastMath.cbrt((x * x))));
			}
		};
	}
}

