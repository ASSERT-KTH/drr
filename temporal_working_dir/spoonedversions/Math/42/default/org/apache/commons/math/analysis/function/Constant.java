

package org.apache.commons.math.analysis.function;


public class Constant implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	private final double c;

	public Constant(double c) {
		this.c = c;
	}

	public double value(double x) {
		return c;
	}

	public org.apache.commons.math.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.function.Constant(0);
	}
}

