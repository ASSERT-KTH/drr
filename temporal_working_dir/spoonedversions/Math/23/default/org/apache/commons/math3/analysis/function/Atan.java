

package org.apache.commons.math3.analysis.function;


public class Atan implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.atan(x);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Atan.this).derivative();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return t.atan();
	}
}

