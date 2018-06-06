

package org.apache.commons.math.analysis.function;


public class Inverse implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return 1 / x;
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return (-1) / (x * x);
			}
		};
	}
}

