

package org.apache.commons.math3.analysis.function;


public class Minus implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return -x;
	}

	public org.apache.commons.math3.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.function.Constant((-1));
	}
}

