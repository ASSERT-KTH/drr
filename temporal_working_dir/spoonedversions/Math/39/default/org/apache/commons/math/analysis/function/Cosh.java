

package org.apache.commons.math.analysis.function;


public class Cosh implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.cosh(x);
	}

	public org.apache.commons.math.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.function.Sinh();
	}
}

