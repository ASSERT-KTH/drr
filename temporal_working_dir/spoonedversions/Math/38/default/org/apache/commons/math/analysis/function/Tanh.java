

package org.apache.commons.math.analysis.function;


public class Tanh implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.tanh(x);
	}

	public org.apache.commons.math.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				final double tanhX = org.apache.commons.math.util.FastMath.tanh(x);
				return 1 - (tanhX * tanhX);
			}
		};
	}
}

