

package org.apache.commons.math3.analysis.function;


public class Constant implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	private final double c;

	public Constant(double c) {
		this.c = c;
	}

	public double value(double x) {
		return c;
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Constant.this).derivative();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(t.getFreeParameters(), t.getOrder(), c);
	}
}

