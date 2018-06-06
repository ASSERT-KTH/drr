

package org.apache.commons.math3.optim.nonlinear.vector;


public class ModelFunction implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.analysis.MultivariateVectorFunction model;

	public ModelFunction(org.apache.commons.math3.analysis.MultivariateVectorFunction m) {
		model = m;
	}

	public org.apache.commons.math3.analysis.MultivariateVectorFunction getModelFunction() {
		return model;
	}
}

