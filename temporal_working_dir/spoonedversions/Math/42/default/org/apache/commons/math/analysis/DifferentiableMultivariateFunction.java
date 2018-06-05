

package org.apache.commons.math.analysis;


public interface DifferentiableMultivariateFunction extends org.apache.commons.math.analysis.MultivariateFunction {
	org.apache.commons.math.analysis.MultivariateFunction partialDerivative(int k);

	org.apache.commons.math.analysis.MultivariateVectorialFunction gradient();
}

