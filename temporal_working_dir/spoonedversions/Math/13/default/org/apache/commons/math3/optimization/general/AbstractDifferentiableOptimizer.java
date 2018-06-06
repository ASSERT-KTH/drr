

package org.apache.commons.math3.optimization.general;


@java.lang.Deprecated
public abstract class AbstractDifferentiableOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer<org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction> {
	private org.apache.commons.math3.analysis.MultivariateVectorFunction gradient;

	protected AbstractDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
	}

	protected double[] computeObjectiveGradient(final double[] evaluationPoint) {
		return gradient.value(evaluationPoint);
	}

	@java.lang.Override
	@java.lang.Deprecated
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(final int maxEval, final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f, final org.apache.commons.math3.optimization.GoalType goalType, final double[] startPoint) {
		return optimizeInternal(maxEval, f, goalType, new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(final int maxEval, final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f, final org.apache.commons.math3.optimization.GoalType goalType, final org.apache.commons.math3.optimization.OptimizationData... optData) {
		gradient = new org.apache.commons.math3.analysis.differentiation.GradientFunction(f);
		return super.optimizeInternal(maxEval, f, goalType, optData);
	}
}

