

package org.apache.commons.math3.analysis.function;


public class Sinh implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.sinh(x);
	}

	public org.apache.commons.math3.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.function.Cosh();
	}
}

