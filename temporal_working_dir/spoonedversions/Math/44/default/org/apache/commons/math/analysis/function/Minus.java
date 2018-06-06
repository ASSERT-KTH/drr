

package org.apache.commons.math.analysis.function;


public class Minus implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return -x;
	}

	public org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.function.Constant((-1));
	}
}

