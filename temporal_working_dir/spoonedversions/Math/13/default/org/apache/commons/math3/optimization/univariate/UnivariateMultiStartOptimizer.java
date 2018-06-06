

package org.apache.commons.math3.optimization.univariate;


@java.lang.Deprecated
public class UnivariateMultiStartOptimizer<FUNC extends org.apache.commons.math3.analysis.UnivariateFunction> implements org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer<FUNC> {
	private final org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer<FUNC> optimizer;

	private int maxEvaluations;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math3.random.RandomGenerator generator;

	private org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair[] optima;

	public UnivariateMultiStartOptimizer(final org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer<FUNC> optimizer, final int starts, final org.apache.commons.math3.random.RandomGenerator generator) {
		if ((optimizer == null) || (generator == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (starts < 1) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.this.starts = starts;
		org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.this.generator = generator;
	}

	public org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return totalEvaluations;
	}

	public org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair[] getOptima() {
		if ((optima) == null) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
		}
		return optima.clone();
	}

	public org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, final FUNC f, final org.apache.commons.math3.optimization.GoalType goal, final double min, final double max) {
		return optimize(maxEval, f, goal, min, max, (min + (0.5 * (max - min))));
	}

	public org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair optimize(int maxEval, final FUNC f, final org.apache.commons.math3.optimization.GoalType goal, final double min, final double max, final double startValue) {
		java.lang.RuntimeException lastException = null;
		optima = new org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair[starts];
		totalEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				final double s = i == 0 ? startValue : min + ((generator.nextDouble()) * (max - min));
				optima[i] = optimizer.optimize((maxEval - (totalEvaluations)), f, goal, min, max, s);
			} catch (java.lang.RuntimeException mue) {
				lastException = mue;
				optima[i] = null;
			}
			totalEvaluations += optimizer.getEvaluations();
		}
		sortPairs(goal);
		if ((optima[0]) == null) {
			throw lastException;
		}
		return optima[0];
	}

	private void sortPairs(final org.apache.commons.math3.optimization.GoalType goal) {
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair>() {
			public int compare(final org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair o1, final org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return goal == (org.apache.commons.math3.optimization.GoalType.MINIMIZE) ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		});
	}
}

