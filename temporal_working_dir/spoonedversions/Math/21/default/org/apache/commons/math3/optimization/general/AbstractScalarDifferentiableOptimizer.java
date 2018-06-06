

package org.apache.commons.math3.optimization.general;


public abstract class AbstractScalarDifferentiableOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer<org.apache.commons.math3.analysis.DifferentiableMultivariateFunction> implements org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer {
	private org.apache.commons.math3.analysis.MultivariateVectorFunction gradient;

	@java.lang.Deprecated
	protected AbstractScalarDifferentiableOptimizer() {
	}

	protected AbstractScalarDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
	}

	protected double[] computeObjectiveGradient(final double[] evaluationPoint) {
		return gradient.value(evaluationPoint);
	}

	@java.lang.Override
	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, final org.apache.commons.math3.analysis.DifferentiableMultivariateFunction f, final org.apache.commons.math3.optimization.GoalType goalType, final double[] startPoint) {
		gradient = f.gradient();
		return super.optimize(maxEval, f, goalType, startPoint);
	}
}

