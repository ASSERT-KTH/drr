

package org.apache.commons.math.optimization.general;


public abstract class AbstractScalarDifferentiableOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	private org.apache.commons.math.analysis.MultivariateVectorialFunction gradient;

	protected AbstractScalarDifferentiableOptimizer() {
	}

	protected AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker, int maxEvaluations) {
		super(checker, maxEvaluations);
	}

	protected double[] computeObjectiveGradient(final double[] evaluationPoint) throws org.apache.commons.math.FunctionEvaluationException {
		return gradient.value(evaluationPoint);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(final org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException {
		gradient = f.gradient();
		return super.optimize(f, goalType, startPoint);
	}
}

