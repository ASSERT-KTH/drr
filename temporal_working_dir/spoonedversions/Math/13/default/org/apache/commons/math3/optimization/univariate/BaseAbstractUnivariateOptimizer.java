

package org.apache.commons.math3.optimization.univariate;


@java.lang.Deprecated
public abstract class BaseAbstractUnivariateOptimizer implements org.apache.commons.math3.optimization.univariate.UnivariateOptimizer {
	private final org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> checker;

	private final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private org.apache.commons.math3.optimization.GoalType goal;

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private org.apache.commons.math3.analysis.UnivariateFunction function;

	protected BaseAbstractUnivariateOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> checker) {
		this.checker = checker;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math3.optimization.GoalType getGoalType() {
		return goal;
	}

	public double getMin() {
		return searchMin;
	}

	public double getMax() {
		return searchMax;
	}

	public double getStartValue() {
		return searchStart;
	}

	protected double computeObjectiveValue(double point) {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, org.apache.commons.math3.analysis.UnivariateFunction f, org.apache.commons.math3.optimization.GoalType goalType, double min, double max, double startValue) {
		if (f == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (goalType == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		searchMin = min;
		searchMax = max;
		searchStart = startValue;
		goal = goalType;
		function = f;
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		return doOptimize();
	}

	public org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, org.apache.commons.math3.analysis.UnivariateFunction f, org.apache.commons.math3.optimization.GoalType goalType, double min, double max) {
		return optimize(maxEval, f, goalType, min, max, (min + (0.5 * (max - min))));
	}

	public org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected abstract org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair doOptimize();
}

