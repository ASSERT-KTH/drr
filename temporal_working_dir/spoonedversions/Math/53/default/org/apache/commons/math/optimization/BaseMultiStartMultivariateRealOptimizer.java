

package org.apache.commons.math.optimization;


public class BaseMultiStartMultivariateRealOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<FUNC> {
	private final org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<FUNC> optimizer;

	private int maxEvaluations;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math.random.RandomVectorGenerator generator;

	private org.apache.commons.math.optimization.RealPointValuePair[] optima;

	protected BaseMultiStartMultivariateRealOptimizer(final org.apache.commons.math.optimization.BaseMultivariateRealOptimizer<FUNC> optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		if ((optimizer == null) || (generator == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (starts < 1) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.this.starts = starts;
		org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.this.generator = generator;
	}

	public org.apache.commons.math.optimization.RealPointValuePair[] getOptima() {
		if ((optima) == null) {
			throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
		}
		return optima.clone();
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return totalEvaluations;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker) {
		optimizer.setConvergenceChecker(checker);
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(int maxEval, final FUNC f, final org.apache.commons.math.optimization.GoalType goal, double[] startPoint) {
		maxEvaluations = maxEval;
		org.apache.commons.math.exception.MathUserException lastException = null;
		optima = new org.apache.commons.math.optimization.RealPointValuePair[starts];
		totalEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				optima[i] = optimizer.optimize((maxEval - (totalEvaluations)), f, goal, (i == 0 ? startPoint : generator.nextVector()));
			} catch (org.apache.commons.math.exception.MathUserException mue) {
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

	private void sortPairs(final org.apache.commons.math.optimization.GoalType goal) {
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>() {
			public int compare(final org.apache.commons.math.optimization.RealPointValuePair o1, final org.apache.commons.math.optimization.RealPointValuePair o2) {
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

