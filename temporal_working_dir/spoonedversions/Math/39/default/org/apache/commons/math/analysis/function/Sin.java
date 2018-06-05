

package org.apache.commons.math.analysis.function;


public class Sin implements org.apache.commons.math.analysis.DifferentiableUnivariateFunction {
	public double value(double x) {
		return org.apache.commons.math.util.FastMath.sin(x);
	}

	public org.apache.commons.math.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math.analysis.function.Cos();
	}
}

