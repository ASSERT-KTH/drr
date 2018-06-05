

package org.apache.commons.math.analysis.function;


public class Tan implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.tan(x);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				final double tanX = org.apache.commons.math.util.FastMath.tan(x);
				return 1 + (tanX * tanX);
			}
		};
	}
}

