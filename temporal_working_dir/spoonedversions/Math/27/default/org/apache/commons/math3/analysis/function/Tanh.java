

package org.apache.commons.math3.analysis.function;


public class Tanh implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.tanh(x);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				final double tanhX = org.apache.commons.math3.util.FastMath.tanh(x);
				return 1 - (tanhX * tanhX);
			}
		};
	}
}

