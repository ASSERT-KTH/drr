

package org.apache.commons.math.analysis;


public interface DifferentiableMultivariateVectorialFunction extends org.apache.commons.math.analysis.MultivariateVectorialFunction {
	org.apache.commons.math.analysis.MultivariateVectorialFunction partialDerivative(int j);

	org.apache.commons.math.analysis.MultivariateVectorialFunction gradient(int i);

	org.apache.commons.math.analysis.MultivariateMatrixFunction jacobian();
}

