

package org.apache.commons.math.optimization.general;


public abstract class AbstractScalarDifferentiableOptimizer extends org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction> implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	protected org.apache.commons.math.optimization.RealConvergenceChecker checker;

	protected org.apache.commons.math.optimization.GoalType goal;

	protected double[] point;

	private int gradientEvaluations;

	private org.apache.commons.math.analysis.MultivariateVectorialFunction gradient;

	protected AbstractScalarDifferentiableOptimizer() {
	}

	protected AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker checker, int maxIterations, int maxEvaluations) {
		super(checker, maxIterations, maxEvaluations);
		org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.this.checker = checker;
	}

	public int getGradientEvaluations() {
		return gradientEvaluations;
	}

	protected double[] computeObjectiveGradient(final double[] evaluationPoint) throws org.apache.commons.math.FunctionEvaluationException {
		++(gradientEvaluations);
		return gradient.value(evaluationPoint);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(final org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		gradientEvaluations = 0;
		gradient = f.gradient();
		goal = goalType;
		point = startPoint.clone();
		return super.optimize(f, goalType, startPoint);
	}
}

