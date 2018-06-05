

package org.apache.commons.math3.analysis.differentiation;


public interface UnivariateDifferentiableMatrixFunction extends org.apache.commons.math3.analysis.UnivariateMatrixFunction {
	org.apache.commons.math3.analysis.differentiation.DerivativeStructure[][] value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure x);
}

