

package org.apache.commons.math.optimization.univariate;


public class MultiStartUnivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> implements org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer<FUNC> {
	private final org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer<FUNC> optimizer;

	private int maxEvaluations;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math.random.RandomGenerator generator;

	private org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] optima;

	public MultiStartUnivariateRealOptimizer(final org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer<FUNC> optimizer, final int starts, final org.apache.commons.math.random.RandomGenerator generator) {
		this.optimizer = optimizer;
		org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.this.starts = starts;
		org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.this.generator = generator;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker) {
		optimizer.setConvergenceChecker(checker);
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return totalEvaluations;
	}

	public void setMaxEvaluations(int maxEvaluations) {
		org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.this.maxEvaluations = maxEvaluations;
		optimizer.setMaxEvaluations(maxEvaluations);
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[] getOptima() {
		if ((optima) == null) {
			throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
		}
		return optima.clone();
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(final FUNC f, final org.apache.commons.math.optimization.GoalType goal, final double min, final double max) throws org.apache.commons.math.exception.MathUserException {
		return optimize(f, goal, min, max, (min + (0.5 * (max - min))));
	}

	public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimize(final FUNC f, final org.apache.commons.math.optimization.GoalType goal, final double min, final double max, final double startValue) throws org.apache.commons.math.exception.MathUserException {
		org.apache.commons.math.exception.MathUserException lastException = null;
		optima = new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair[starts];
		totalEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				final double s = i == 0 ? startValue : min + ((generator.nextDouble()) * (max - min));
				optima[i] = optimizer.optimize(f, goal, min, max, s);
			} catch (org.apache.commons.math.exception.MathUserException mue) {
				lastException = mue;
				optima[i] = null;
			}
			final int usedEvaluations = optimizer.getEvaluations();
			optimizer.setMaxEvaluations(((optimizer.getMaxEvaluations()) - usedEvaluations));
			totalEvaluations += usedEvaluations;
		}
		sortPairs(goal);
		if ((optima[0]) == null) {
			throw lastException;
		}
		return optima[0];
	}

	private void sortPairs(final org.apache.commons.math.optimization.GoalType goal) {
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair>() {
			public int compare(final org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair o1, final org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE) ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		});
	}
}

