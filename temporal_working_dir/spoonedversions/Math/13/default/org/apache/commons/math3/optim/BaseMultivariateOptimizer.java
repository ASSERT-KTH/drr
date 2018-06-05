

package org.apache.commons.math3.optim;


public abstract class BaseMultivariateOptimizer<PAIR> extends org.apache.commons.math3.optim.BaseOptimizer<PAIR> {
	private double[] start;

	private double[] lowerBound;

	private double[] upperBound;

	protected BaseMultivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<PAIR> checker) {
		super(checker);
	}

	@java.lang.Override
	public PAIR optimize(org.apache.commons.math3.optim.OptimizationData... optData) {
		parseOptimizationData(optData);
		checkParameters();
		return super.optimize(optData);
	}

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.InitialGuess) {
				start = ((org.apache.commons.math3.optim.InitialGuess) (data)).getInitialGuess();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optim.SimpleBounds) {
				final org.apache.commons.math3.optim.SimpleBounds bounds = ((org.apache.commons.math3.optim.SimpleBounds) (data));
				lowerBound = bounds.getLower();
				upperBound = bounds.getUpper();
				continue;
			}
		}
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
		}
	}
}

