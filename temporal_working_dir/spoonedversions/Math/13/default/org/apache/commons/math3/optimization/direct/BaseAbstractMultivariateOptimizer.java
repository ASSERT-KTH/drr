

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public abstract class BaseAbstractMultivariateOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> {
	protected final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker;

	private org.apache.commons.math3.optimization.GoalType goal;

	private double[] start;

	private double[] lowerBound;

	private double[] upperBound;

	private org.apache.commons.math3.analysis.MultivariateFunction function;

	@java.lang.Deprecated
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

	@java.lang.Deprecated
	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint) {
		return optimizeInternal(maxEval, f, goalType, new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, org.apache.commons.math3.optimization.OptimizationData... optData) {
		return optimizeInternal(maxEval, f, goalType, optData);
	}

	@java.lang.Deprecated
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint) {
		return optimizeInternal(maxEval, f, goalType, new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, org.apache.commons.math3.optimization.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		function = f;
		goal = goalType;
		parseOptimizationData(optData);
		checkParameters();
		return doOptimize();
	}

	private void parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData... optData) {
		for (org.apache.commons.math3.optimization.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optimization.InitialGuess) {
				start = ((org.apache.commons.math3.optimization.InitialGuess) (data)).getInitialGuess();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optimization.SimpleBounds) {
				final org.apache.commons.math3.optimization.SimpleBounds bounds = ((org.apache.commons.math3.optimization.SimpleBounds) (data));
				lowerBound = bounds.getLower();
				upperBound = bounds.getUpper();
				continue;
			}
		}
	}

	public org.apache.commons.math3.optimization.GoalType getGoalType() {
		return goal;
	}

	public double[] getStartPoint() {
		return (start) == null ? null : start.clone();
	}

	public double[] getLowerBound() {
		return (lowerBound) == null ? null : lowerBound.clone();
	}

	public double[] getUpperBound() {
		return (upperBound) == null ? null : upperBound.clone();
	}

	protected abstract org.apache.commons.math3.optimization.PointValuePair doOptimize();

	private void checkParameters() {
		if ((start) != null) {
			final int dim = start.length;
			if ((lowerBound) != null) {
				if ((lowerBound.length) != dim) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(lowerBound.length, dim);
				}
				for (int i = 0; i < dim; i++) {
					final double v = start[i];
					final double lo = lowerBound[i];
					if (v < lo) {
						throw new org.apache.commons.math3.exception.NumberIsTooSmallException(v, lo, true);
					}
				}
			}
			if ((upperBound) != null) {
				if ((upperBound.length) != dim) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(upperBound.length, dim);
				}
				for (int i = 0; i < dim; i++) {
					final double v = start[i];
					final double hi = upperBound[i];
					if (v > hi) {
						throw new org.apache.commons.math3.exception.NumberIsTooLargeException(v, hi, true);
					}
				}
			}
			if ((lowerBound) == null) {
				lowerBound = new double[dim];
				for (int i = 0; i < dim; i++) {
					lowerBound[i] = java.lang.Double.NEGATIVE_INFINITY;
				}
			}
			if ((upperBound) == null) {
				upperBound = new double[dim];
				for (int i = 0; i < dim; i++) {
					upperBound[i] = java.lang.Double.POSITIVE_INFINITY;
				}
			}
		}
	}
}

