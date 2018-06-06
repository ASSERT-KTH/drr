

package org.apache.commons.math3.analysis.function;


public class Tan implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.tan(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				final double tanX = org.apache.commons.math3.util.FastMath.tan(x);
				return 1 + (tanX * tanX);
			}
		};
	}
}

