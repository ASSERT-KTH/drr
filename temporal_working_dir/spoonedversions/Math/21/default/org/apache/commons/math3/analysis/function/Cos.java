

package org.apache.commons.math3.analysis.function;


public class Cos implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.cos(x);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Cos.this).derivative();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return t.cos();
	}
}

