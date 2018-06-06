

package org.apache.commons.math3.optim.nonlinear.vector;


public class ModelFunctionJacobian implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.analysis.MultivariateMatrixFunction jacobian;

	public ModelFunctionJacobian(org.apache.commons.math3.analysis.MultivariateMatrixFunction j) {
		jacobian = j;
	}

	public org.apache.commons.math3.analysis.MultivariateMatrixFunction getModelFunctionJacobian() {
		return jacobian;
	}
}

