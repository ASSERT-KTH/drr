

package org.apache.commons.math.optimization.univariate;


public abstract class AbstractUnivariateRealOptimizer extends org.apache.commons.math.ConvergingAlgorithmImpl implements org.apache.commons.math.optimization.UnivariateRealOptimizer {
	private boolean resultComputed;

	private double result;

	private double functionValue;

	private int maxEvaluations;

	private int evaluations;

	private org.apache.commons.math.optimization.GoalType optimizationGoal;

	private double searchMin;

	private double searchMax;

	private double searchStart;

	private org.apache.commons.math.analysis.UnivariateRealFunction function;

	protected AbstractUnivariateRealOptimizer(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		resultComputed = false;
		setMaxEvaluations(java.lang.Integer.MAX_VALUE);
	}

	protected AbstractUnivariateRealOptimizer() {
	}

	protected void checkResultComputed() {
		if (!(resultComputed)) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
	}

	public double getResult() {
		if (!(resultComputed)) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		return result;
	}

	public double getFunctionValue() {
		if ((functionValue) == (java.lang.Double.NaN)) {
			final double opt = getResult();
			try {
				functionValue = function.value(opt);
			} catch (org.apache.commons.math.FunctionEvaluationException e) {
				throw new java.lang.RuntimeException(e);
			}
		}
		return functionValue;
	}

	protected final void setResult(final double x, final double fx, final int iterationCount) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.result = x;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.functionValue = fx;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.iterationCount = iterationCount;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = false;
	}

	public void setMaxEvaluations(int maxEvaluations) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.maxEvaluations = maxEvaluations;
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	public org.apache.commons.math.optimization.GoalType getGoalType() {
		return optimizationGoal;
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

	protected double computeObjectiveValue(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double point) throws org.apache.commons.math.FunctionEvaluationException {
		if ((++(evaluations)) > (maxEvaluations)) {
			throw new org.apache.commons.math.FunctionEvaluationException(new org.apache.commons.math.MaxEvaluationsExceededException(maxEvaluations), point);
		}
		return f.value(point);
	}

	protected double computeObjectiveValue(double point) throws org.apache.commons.math.FunctionEvaluationException {
		if ((++(evaluations)) > (maxEvaluations)) {
			resultComputed = false;
			throw new org.apache.commons.math.FunctionEvaluationException(new org.apache.commons.math.MaxEvaluationsExceededException(maxEvaluations), point);
		}
		return function.value(point);
	}

	public double optimize(org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goal, double min, double max, double startValue) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.searchMin = min;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.searchMax = max;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.searchStart = startValue;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.optimizationGoal = goal;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.function = f;
		functionValue = java.lang.Double.NaN;
		evaluations = 0;
		resetIterationsCounter();
		result = doOptimize();
		resultComputed = true;
		return result;
	}

	protected void setFunctionValue(double functionValue) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.functionValue = functionValue;
	}

	public double optimize(org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goal, double min, double max) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return optimize(f, goal, min, max, (min + (0.5 * (max - min))));
	}

	protected abstract double doOptimize() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException;
}

