

package org.apache.commons.math3.analysis.function;


public class Log1p implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable {
	public double value(double x) {
		return org.apache.commons.math3.util.FastMath.log1p(x);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Log1p.this).derivative();
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		return t.log1p();
	}
}

