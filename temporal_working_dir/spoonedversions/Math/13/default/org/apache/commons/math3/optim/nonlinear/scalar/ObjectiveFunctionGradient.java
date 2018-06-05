

package org.apache.commons.math3.optim.nonlinear.scalar;


public class ObjectiveFunctionGradient implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.analysis.MultivariateVectorFunction gradient;

	public ObjectiveFunctionGradient(org.apache.commons.math3.analysis.MultivariateVectorFunction g) {
		gradient = g;
	}

	public org.apache.commons.math3.analysis.MultivariateVectorFunction getObjectiveFunctionGradient() {
		return gradient;
	}
}

