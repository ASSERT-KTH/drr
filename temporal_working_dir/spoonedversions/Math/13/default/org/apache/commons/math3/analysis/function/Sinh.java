

package org.apache.commons.math3.analysis.function;


public class Sinh implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.sinh(x);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.DifferentiableUnivariateFunction derivative() {
		return new org.apache.commons.math3.analysis.function.Cosh();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return t.sinh();
	}
}

