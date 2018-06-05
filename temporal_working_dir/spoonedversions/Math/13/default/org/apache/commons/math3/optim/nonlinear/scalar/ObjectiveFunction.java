

package org.apache.commons.math3.optim.nonlinear.scalar;


public class ObjectiveFunction implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.analysis.MultivariateFunction function;

	public ObjectiveFunction(org.apache.commons.math3.analysis.MultivariateFunction f) {
		function = f;
	}

	public org.apache.commons.math3.analysis.MultivariateFunction getObjectiveFunction() {
		return function;
	}
}

