

package org.apache.commons.math3.optim.univariate;


public class MultiStartUnivariateOptimizer extends org.apache.commons.math3.optim.univariate.UnivariateOptimizer {
	private final org.apache.commons.math3.optim.univariate.UnivariateOptimizer optimizer;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math3.random.RandomGenerator generator;

	private org.apache.commons.math3.optim.univariate.UnivariatePointValuePair[] optima;

	private org.apache.commons.math3.optim.OptimizationData[] optimData;

	private int maxEvalIndex = -1;

	private int searchIntervalIndex = -1;

	public MultiStartUnivariateOptimizer(final org.apache.commons.math3.optim.univariate.UnivariateOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomGenerator generator) {
		super(optimizer.getConvergenceChecker());
		if (starts < 1) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.this.starts = starts;
		org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.this.generator = generator;
	}

	@java.lang.Override
	public int getEvaluations() {
		return totalEvaluations;
	}

	public org.apache.commons.math3.optim.univariate.UnivariatePointValuePair[] getOptima() {
		if ((optima) == null) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
		}
		return optima.clone();
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.univariate.UnivariatePointValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) {
		optimData = optData;
		return super.optimize(optData);
	}

	@java.lang.Override
	protected org.apache.commons.math3.optim.univariate.UnivariatePointValuePair doOptimize() {
		for (int i = 0; i < (optimData.length); i++) {
			if ((optimData[i]) instanceof org.apache.commons.math3.optim.MaxEval) {
				optimData[i] = null;
				maxEvalIndex = i;
				continue;
			}
			if ((optimData[i]) instanceof org.apache.commons.math3.optim.univariate.SearchInterval) {
				optimData[i] = null;
				searchIntervalIndex = i;
				continue;
			}
		}
		if ((maxEvalIndex) == (-1)) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException();
		}
		if ((searchIntervalIndex) == (-1)) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException();
		}
		java.lang.RuntimeException lastException = null;
		optima = new org.apache.commons.math3.optim.univariate.UnivariatePointValuePair[starts];
		totalEvaluations = 0;
		final int maxEval = getMaxEvaluations();
		final double min = getMin();
		final double max = getMax();
		final double startValue = getStartValue();
		for (int i = 0; i < (starts); i++) {
			try {
				optimData[maxEvalIndex] = new org.apache.commons.math3.optim.MaxEval((maxEval - (totalEvaluations)));
				final double s = i == 0 ? startValue : min + ((generator.nextDouble()) * (max - min));
				optimData[searchIntervalIndex] = new org.apache.commons.math3.optim.univariate.SearchInterval(min, max, s);
				optima[i] = optimizer.optimize(optimData);
			} catch (java.lang.RuntimeException mue) {
				lastException = mue;
				optima[i] = null;
			}
			totalEvaluations += optimizer.getEvaluations();
		}
		sortPairs(getGoalType());
		if ((optima[0]) == null) {
			throw lastException;
		}
		return optima[0];
	}

	private void sortPairs(final org.apache.commons.math3.optim.nonlinear.scalar.GoalType goal) {
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math3.optim.univariate.UnivariatePointValuePair>() {
			public int compare(final org.apache.commons.math3.optim.univariate.UnivariatePointValuePair o1, final org.apache.commons.math3.optim.univariate.UnivariatePointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return goal == (org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE) ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		});
	}
}

