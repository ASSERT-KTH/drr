

package org.apache.commons.math3.optim.nonlinear.vector;


public abstract class JacobianMultivariateVectorOptimizer extends org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer {
	private org.apache.commons.math3.analysis.MultivariateMatrixFunction jacobian;

	protected JacobianMultivariateVectorOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker) {
		super(checker);
	}

	protected double[][] computeJacobian(final double[] params) {
		return jacobian.value(params);
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointVectorValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		parseOptimizationData(optData);
		return super.optimize(optData);
	}

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian) {
				jacobian = ((org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian) (data)).getModelFunctionJacobian();
				break;
			}
		}
	}
}

