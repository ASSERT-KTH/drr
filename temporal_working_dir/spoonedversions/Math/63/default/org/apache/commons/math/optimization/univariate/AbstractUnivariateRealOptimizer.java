

package org.apache.commons.math.optimization.univariate;


public abstract class AbstractUnivariateRealOptimizer implements org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer {
	private org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker;

	private final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private org.apache.commons.math.optimization.GoalType goal;

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private org.apache.commons.math.analysis.UnivariateRealFunction function;

	public void setMaxEvaluations(int maxEvaluations) {
		evaluations.setMaximalCount(maxEvaluations);
	}

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

	protected double computeObjectiveValue(double point) throws org.apache.commons.math.FunctionEvaluationException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goalType, double min, double max, double startValue) throws org.apache.commons.math.FunctionEvaluationException {
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
		evaluations.resetCount();
		return doOptimize();
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goal, double min, double max) throws org.apache.commons.math.FunctionEvaluationException {
		return optimize(f, goal, min, max, (min + (0.5 * (max - min))));
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.checker = checker;
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected abstract org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException;
}

