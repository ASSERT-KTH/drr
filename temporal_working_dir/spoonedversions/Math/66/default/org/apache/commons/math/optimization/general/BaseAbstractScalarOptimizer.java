

package org.apache.commons.math.optimization.general;


public abstract class BaseAbstractScalarOptimizer<T extends org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<T> {
	public static final int DEFAULT_MAX_ITERATIONS = 1000;

	public static final int DEFAULT_MAX_EVALUATIONS = 10000;

	private org.apache.commons.math.optimization.RealConvergenceChecker checker;

	private org.apache.commons.math.optimization.GoalType goal;

	private double[] start;

	private int maxIterations;

	private int iterations;

	private int maxEvaluations;

	private int evaluations;

	private org.apache.commons.math.analysis.MultivariateRealFunction function;

	protected BaseAbstractScalarOptimizer() {
		this(new org.apache.commons.math.optimization.SimpleScalarValueChecker(), org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.DEFAULT_MAX_ITERATIONS, org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.DEFAULT_MAX_EVALUATIONS);
	}

	protected BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker checker, int maxIterations, int maxEvaluations) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.checker = checker;
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.maxIterations = maxIterations;
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.maxEvaluations = maxEvaluations;
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return iterations;
	}

	public void setMaxEvaluations(int maxEvaluations) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.maxEvaluations = maxEvaluations;
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker checker) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.checker = checker;
	}

	public org.apache.commons.math.optimization.RealConvergenceChecker getConvergenceChecker() {
		return checker;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math.optimization.OptimizationException {
		if ((++(iterations)) > (maxIterations)) {
			throw new org.apache.commons.math.optimization.OptimizationException(new org.apache.commons.math.MaxIterationsExceededException(maxIterations));
		}
	}

	protected double computeObjectiveValue(double[] evaluationPoint) throws org.apache.commons.math.FunctionEvaluationException {
		if ((++(evaluations)) > (maxEvaluations)) {
			throw new org.apache.commons.math.FunctionEvaluationException(new org.apache.commons.math.MaxEvaluationsExceededException(maxEvaluations), evaluationPoint);
		}
		return function.value(evaluationPoint);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(T f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		iterations = 0;
		evaluations = 0;
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

	protected abstract org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException;
}

