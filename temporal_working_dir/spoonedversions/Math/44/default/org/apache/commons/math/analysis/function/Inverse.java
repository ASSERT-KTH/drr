

package org.apache.commons.math.analysis.function;


public class Inverse implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return 1 / x;
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				return (-1) / (x * x);
			}
		};
	}
}

