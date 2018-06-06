

package org.apache.commons.math.optimization.univariate;


public abstract class AbstractUnivariateRealOptimizer implements org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer {
	private org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker;

	private final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private org.apache.commons.math.optimization.GoalType goal;

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private org.apache.commons.math.analysis.UnivariateRealFunction function;

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math.optimization.GoalType getGoalType() {
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
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(int maxEval, org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goalType, double min, double max, double startValue) {
		if (f == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (goalType == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
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

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(int maxEval, org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goalType, double min, double max) {
		return optimize(maxEval, f, goalType, min, max, (min + (0.5 * (max - min))));
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> c) {
		checker = c;
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected abstract org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair doOptimize();
}

