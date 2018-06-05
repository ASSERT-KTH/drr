

package org.apache.commons.math3.optimization.direct;


public abstract class BaseAbstractMultivariateSimpleBoundsOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer<FUNC> implements org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> , org.apache.commons.math3.optimization.BaseMultivariateSimpleBoundsOptimizer<FUNC> {
	private double[] lowerBound;

	private double[] upperBound;

	@java.lang.Deprecated
	protected BaseAbstractMultivariateSimpleBoundsOptimizer() {
	}

	protected BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
	}

	public double[] getLowerBound() {
		return lowerBound.clone();
	}

	public double[] getUpperBound() {
		return upperBound.clone();
	}

	@java.lang.Override
	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint) {
		return optimize(maxEval, f, goalType, startPoint, null, null);
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, FUNC f, org.apache.commons.math3.optimization.GoalType goalType, double[] startPoint, double[] lower, double[] upper) {
		final int dim = startPoint.length;
		if (lower != null) {
			if ((lower.length) != dim) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(lower.length, dim);
			}
			for (int i = 0; i < dim; i++) {
				final double v = startPoint[i];
				final double lo = lower[i];
				if (v < lo) {
					throw new org.apache.commons.math3.exception.NumberIsTooSmallException(v, lo, true);
				}
			}
		}
		if (upper != null) {
			if ((upper.length) != dim) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(upper.length, dim);
			}
			for (int i = 0; i < dim; i++) {
				final double v = startPoint[i];
				final double hi = upper[i];
				if (v > hi) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(v, hi, true);
				}
			}
		}
		if (lower == null) {
			lowerBound = new double[dim];
			for (int i = 0; i < dim; i++) {
				lowerBound[i] = java.lang.Double.NEGATIVE_INFINITY;
			}
		}else {
			lowerBound = lower.clone();
		}
		if (upper == null) {
			upperBound = new double[dim];
			for (int i = 0; i < dim; i++) {
				upperBound[i] = java.lang.Double.POSITIVE_INFINITY;
			}
		}else {
			upperBound = upper.clone();
		}
		return super.optimize(maxEval, f, goalType, startPoint);
	}
}

