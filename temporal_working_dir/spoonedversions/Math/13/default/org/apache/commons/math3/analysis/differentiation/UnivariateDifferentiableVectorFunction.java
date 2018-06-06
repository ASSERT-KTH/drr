

package org.apache.commons.math3.analysis.differentiation;


public interface UnivariateDifferentiableVectorFunction extends org.apache.commons.math3.analysis.UnivariateVectorFunction {
	org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure x) throws org.apache.commons.math3.exception.MathIllegalArgumentException;
}

