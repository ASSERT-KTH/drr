

package org.apache.commons.math.optimization;


public class BaseMultiStartMultivariateVectorialOptimizer<FUNC extends org.apache.commons.math.analysis.MultivariateVectorialFunction> implements org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer<FUNC> {
	private final org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer<FUNC> optimizer;

	private int maxEvaluations;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math.random.RandomVectorGenerator generator;

	private org.apache.commons.math.optimization.VectorialPointValuePair[] optima;

	protected BaseMultiStartMultivariateVectorialOptimizer(final org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer<FUNC> optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		if ((optimizer == null) || (generator == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (starts < 1) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.this.starts = starts;
		org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.this.generator = generator;
	}

	public org.apache.commons.math.optimization.VectorialPointValuePair[] getOptima() {
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

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> checker) {
		optimizer.setConvergenceChecker(checker);
	}

	public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public org.apache.commons.math.optimization.VectorialPointValuePair optimize(int maxEval, final FUNC f, double[] target, double[] weights, double[] startPoint) {
		maxEvaluations = maxEval;
		org.apache.commons.math.exception.MathUserException lastException = null;
		optima = new org.apache.commons.math.optimization.VectorialPointValuePair[starts];
		totalEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				optima[i] = optimizer.optimize((maxEval - (totalEvaluations)), f, target, weights, (i == 0 ? startPoint : generator.nextVector()));
			} catch (org.apache.commons.math.exception.MathUserException mue) {
				lastException = mue;
				optima[i] = null;
			} catch (org.apache.commons.math.exception.ConvergenceException oe) {
				optima[i] = null;
			}
			totalEvaluations += optimizer.getEvaluations();
		}
		sortPairs(target, weights);
		if ((optima[0]) == null) {
			throw lastException;
		}
		return optima[0];
	}

	private void sortPairs(final double[] target, final double[] weights) {
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math.optimization.VectorialPointValuePair>() {
			public int compare(final org.apache.commons.math.optimization.VectorialPointValuePair o1, final org.apache.commons.math.optimization.VectorialPointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				return java.lang.Double.compare(weightedResidual(o1), weightedResidual(o2));
			}

			private double weightedResidual(final org.apache.commons.math.optimization.VectorialPointValuePair pv) {
				final double[] value = pv.getValueRef();
				double sum = 0;
				for (int i = 0; i < (value.length); ++i) {
					final double ri = (value[i]) - (target[i]);
					sum += ((weights[i]) * ri) * ri;
				}
				return sum;
			}
		});
	}
}

