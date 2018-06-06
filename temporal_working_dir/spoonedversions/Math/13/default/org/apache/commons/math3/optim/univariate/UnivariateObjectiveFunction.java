

package org.apache.commons.math3.optim.univariate;


public class UnivariateObjectiveFunction implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.analysis.UnivariateFunction function;

	public UnivariateObjectiveFunction(org.apache.commons.math3.analysis.UnivariateFunction f) {
		function = f;
	}

	public org.apache.commons.math3.analysis.UnivariateFunction getObjectiveFunction() {
		return function;
	}
}

