

package org.apache.commons.math3.optimization.general;


@java.lang.Deprecated
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
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(int maxEval, final org.apache.commons.math3.analysis.DifferentiableMultivariateFunction f, final org.apache.commons.math3.optimization.GoalType goalType, final double[] startPoint) {
		gradient = f.gradient();
		return super.optimizeInternal(maxEval, f, goalType, startPoint);
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(final int maxEval, final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f, final org.apache.commons.math3.optimization.GoalType goalType, final double[] startPoint) {
		return optimizeInternal(maxEval, org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(f), goalType, startPoint);
	}
}

