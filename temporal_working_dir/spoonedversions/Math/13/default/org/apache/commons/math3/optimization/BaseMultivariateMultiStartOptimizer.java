

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class BaseMultivariateMultiStartOptimizer<FUNC extends org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> {
	private final org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> optimizer;

	private int maxEvaluations;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math3.random.RandomVectorGenerator generator;

	private org.apache.commons.math3.optimization.PointValuePair[] optima;

	protected BaseMultivariateMultiStartOptimizer(final org.apache.commons.math3.optimization.BaseMultivariateOptimizer<FUNC> optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		if ((optimizer == null) || (generator == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (starts < 1) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.this.starts = starts;
		org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.this.generator = generator;
	}

	public org.apache.commons.math3.optimization.PointValuePair[] getOptima() {
		if ((optima) == null) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
		}
		return optima.clone();
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return totalEvaluations;
	}

	public org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public org.apache.commons.math3.optimization.PointValuePair optimize(int maxEval, final FUNC f, final org.apache.commons.math3.optimization.GoalType goal, double[] startPoint) {
		maxEvaluations = maxEval;
		java.lang.RuntimeException lastException = null;
		optima = new org.apache.commons.math3.optimization.PointValuePair[starts];
		totalEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				optima[i] = optimizer.optimize((maxEval - (totalEvaluations)), f, goal, (i == 0 ? startPoint : generator.nextVector()));
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
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair>() {
			public int compare(final org.apache.commons.math3.optimization.PointValuePair o1, final org.apache.commons.math3.optimization.PointValuePair o2) {
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

