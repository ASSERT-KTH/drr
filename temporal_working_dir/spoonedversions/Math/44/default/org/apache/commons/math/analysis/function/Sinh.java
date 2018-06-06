

package org.apache.commons.math.analysis.function;


public class Sinh implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.sinh(x);
	}

	public org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.function.Cosh();
	}
}

