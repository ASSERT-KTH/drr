

package org.apache.commons.math3.analysis.differentiation;


public interface UnivariateDifferential {
	org.apache.commons.math3.analysis.UnivariateFunction getPrimitive();

	org.apache.commons.math3.analysis.differentiation.DerivativeStructure f(org.apache.commons.math3.analysis.differentiation.DerivativeStructure t);
}

