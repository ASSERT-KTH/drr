

package org.apache.commons.math.optimization.general;


public abstract class AbstractScalarDifferentiableOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	private org.apache.commons.math.analysis.MultivariateVectorialFunction gradient;

	protected AbstractScalarDifferentiableOptimizer() {
	}

	protected AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker) {
		super(checker);
	}

	protected double[] computeObjectiveGradient(final double[] evaluationPoint) {
		return gradient.value(evaluationPoint);
	}

	@java.lang.Override
	public org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, final org.apache.commons.math.analysis.DifferentiableMultivariateFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double[] startPoint) {
		gradient = f.gradient();
		return super.optimize(maxEval, f, goalType, startPoint);
	}
}

