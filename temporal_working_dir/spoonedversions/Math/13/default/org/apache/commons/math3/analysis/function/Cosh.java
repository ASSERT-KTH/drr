

package org.apache.commons.math3.analysis.function;


public class Cosh implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.cosh(x);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.function.Sinh();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return t.cosh();
	}
}

