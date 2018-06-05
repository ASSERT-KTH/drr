

package org.apache.commons.math.optimization;


public class MultiStartDifferentiableMultivariateRealOptimizer implements org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer {
	private static final long serialVersionUID = -3220364832729994537L;

	private final org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer optimizer;

	private int maxIterations;

	private int totalIterations;

	private int totalEvaluations;

	private int totalGradientEvaluations;

	private int starts;

	private org.apache.commons.math.random.RandomVectorGenerator generator;

	private org.apache.commons.math.optimization.RealPointValuePair[] optima;

	public MultiStartDifferentiableMultivariateRealOptimizer(final org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomVectorGenerator generator) {
		this.optimizer = optimizer;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.maxIterations = java.lang.Integer.MAX_VALUE;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.totalIterations = 0;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.totalEvaluations = 0;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.totalGradientEvaluations = 0;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.starts = starts;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.generator = generator;
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.optima = null;
	}

	public org.apache.commons.math.optimization.RealPointValuePair[] getOptima() throws java.lang.IllegalStateException {
		if ((optima) == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("no optimum computed yet");
		}
		return optima.clone();
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return totalIterations;
	}

	public int getEvaluations() {
		return totalEvaluations;
	}

	public int getGradientEvaluations() {
		return totalGradientEvaluations;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker checker) {
		optimizer.setConvergenceChecker(checker);
	}

	public org.apache.commons.math.optimization.RealConvergenceChecker getConvergenceChecker() {
		return optimizer.getConvergenceChecker();
	}

	public org.apache.commons.math.optimization.RealPointValuePair optimize(final org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, double[] startPoint) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		optima = new org.apache.commons.math.optimization.RealPointValuePair[starts];
		totalIterations = 0;
		totalEvaluations = 0;
		totalGradientEvaluations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				optimizer.setMaxIterations(((maxIterations) - (totalIterations)));
				optima[i] = optimizer.optimize(f, goalType, (i == 0 ? startPoint : generator.nextVector()));
			} catch (org.apache.commons.math.FunctionEvaluationException fee) {
				optima[i] = null;
			} catch (org.apache.commons.math.optimization.OptimizationException oe) {
				optima[i] = null;
			}
			totalIterations += optimizer.getIterations();
			totalEvaluations += optimizer.getEvaluations();
			totalGradientEvaluations += optimizer.getGradientEvaluations();
		}
		java.util.Arrays.sort(optima, new java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>() {
			public int compare(final org.apache.commons.math.optimization.RealPointValuePair o1, final org.apache.commons.math.optimization.RealPointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : +1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return goalType == (org.apache.commons.math.optimization.GoalType.MINIMIZE) ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		});
		if ((optima[0]) == null) {
			throw new org.apache.commons.math.optimization.OptimizationException("none of the {0} start points lead to convergence", starts);
		}
		return optima[0];
	}
}

