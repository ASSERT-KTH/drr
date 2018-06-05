

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public abstract class BaseAbstractMultivariateSimpleBoundsOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer<FUNC> implements org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> , org.apache.commons.math3.optimization.BaseMultivariateSimpleBoundsOptimizer<FUNC> {
	@java.lang.Deprecated
	protected BaseAbstractMultivariateSimpleBoundsOptimizer() {
	}

	protected BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
	}

	public double[] getLowerBound() {
		return super.getLowerBound();
	}

	public double[] getUpperBound() {
		return super.getUpperBound();
	}

	@java.lang.Override
	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint) {
		return super.optimizeInternal(maxEval, f, goalType, new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint, double[] lower, double[] upper) {
		return super.optimizeInternal(maxEval, f, goalType, new org.apache.commons.math3.optimization.InitialGuess(startPoint), new org.apache.commons.math3.optimization.SimpleBounds(lower, upper));
	}
}

