

package org.apache.commons.math.optimization.general;


public abstract class BaseAbstractScalarOptimizer<T extends org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<T> {
	protected final org.apache.commons.math.util.Incrementor evaluations = new org.apache.commons.math.util.Incrementor();

	private org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker;

	private org.apache.commons.math.optimization.GoalType goal;

	private double[] start;

	private org.apache.commons.math.analysis.MultivariateRealFunction function;

	protected BaseAbstractScalarOptimizer() {
		this(new org.apache.commons.math.optimization.SimpleScalarValueChecker(), java.lang.Integer.MAX_VALUE);
	}

	protected BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker, int maxEvaluations) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.checker = checker;
		evaluations.setMaximalCount(maxEvaluations);
	}

	public void setMaxEvaluations(int maxEvaluations) {
		evaluations.setMaximalCount(maxEvaluations);
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> convergenceChecker) {
		org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.this.checker = convergenceChecker;
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> getConvergenceChecker() {
		return checker;
	}

	protected double computeObjectiveValue(double[] point) throws org.apache.commons.math.FunctionEvaluationException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(T f, org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException {
		if (f == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (goalType == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (startPoint == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
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

	protected abstract org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException;
}

