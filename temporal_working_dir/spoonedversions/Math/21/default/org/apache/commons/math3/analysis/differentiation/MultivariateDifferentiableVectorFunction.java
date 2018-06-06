

package org.apache.commons.math3.analysis.differentiation;


public interface MultivariateDifferentiableVectorFunction extends org.apache.commons.math3.analysis.MultivariateVectorFunction {
	org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] point) throws org.apache.commons.math3.exception.DimensionMismatchException;
}

