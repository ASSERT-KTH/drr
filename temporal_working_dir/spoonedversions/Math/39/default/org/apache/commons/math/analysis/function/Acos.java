

package org.apache.commons.math.analysis.function;


public class Acos implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.acos(x);
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return (-1) / (org.apache.commons.math.util.FastMath.sqrt((1 - (x * x))));
			}
		};
	}
}

