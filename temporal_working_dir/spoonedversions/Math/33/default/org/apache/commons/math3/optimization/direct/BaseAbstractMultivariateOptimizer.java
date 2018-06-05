

package org.apache.commons.math3.optimization.direct;


public abstract class BaseAbstractMultivariateOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> {
	protected final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker;

	private org.apache.commons.math3.optimization.GoalType goal;

	private double[] start;

	private org.apache.commons.math3.analysis.MultivariateFunction function;

	protected BaseAbstractMultivariateOptimizer() {
		this(new org.apache.commons.math3.optimization.SimpleValueChecker());
	}

	protected BaseAbstractMultivariateOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.this.checker = checker;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected double computeObjectiveValue(double[] point) {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint) {
		if (f == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (goalType == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (startPoint == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		function = f;
		goal = goalType;
		start = startPoint.clone();
		return doOptimize();
	}

	public org.apache.commons.math3.optimization.GoalType getGoalType() {
		return goal;
	}

	public double[] getStartPoint() {
		return start.clone();
	}

	protected abstract org.apache.commons.math3.optimization.PointValuePair doOptimize();
}

