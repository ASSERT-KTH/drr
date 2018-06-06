

package org.apache.commons.math3.analysis.differentiation;


public interface MultivariateDifferentiableFunction extends org.apache.commons.math3.analysis.MultivariateFunction {
	org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] point) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathIllegalArgumentException;
}

