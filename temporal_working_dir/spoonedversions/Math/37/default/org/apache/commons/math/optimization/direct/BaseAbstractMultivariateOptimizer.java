

package org.apache.commons.math.optimization.direct;


public abstract class BaseAbstractMultivariateOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateFunction> implements org.apache.commons.math.optimization.BaseMultivariateOptimizer<FUNC> {
	protected final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker;

	private org.apache.commons.math.optimization.GoalType goal;

	private double[] start;

	private org.apache.commons.math.analysis.MultivariateFunction function;

	protected BaseAbstractMultivariateOptimizer() {
		this(new org.apache.commons.math.optimization.SimpleScalarValueChecker());
	}

	protected BaseAbstractMultivariateOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker) {
		org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.this.checker = checker;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected double computeObjectiveValue(double[] point) {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) {
		if (f == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (goalType == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (startPoint == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		function = f;
		goal = goalType;
		start = startPoint.clone();
		return doOptimize();
	}

	public org.apache.commons.math.optimization.GoalType getGoalType() {
		return goal;
	}

	public double[] getStartPoint() {
		return start.clone();
	}

	protected abstract org.apache.commons.math.optimization.RealPointValuePair doOptimize();
}

