

package org.apache.commons.math3.analysis;


@java.lang.Deprecated
public interface DifferentiableMultivariateFunction extends org.apache.commons.math3.analysis.MultivariateFunction {
	org.apache.commons.math3.analysis.MultivariateFunction partialDerivative(int k);

	org.apache.commons.math3.analysis.MultivariateVectorFunction gradient();
}

