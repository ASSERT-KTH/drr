

package org.apache.commons.math.optimization;


public class MultiStartUnivariateRealOptimizer implements org.apache.commons.math.optimization.UnivariateRealOptimizer {
	private static final long serialVersionUID = 5983375963110961019L;

	private final org.apache.commons.math.optimization.UnivariateRealOptimizer optimizer;

	private int maxIterations;

	private int totalIterations;

	private int starts;

	private org.apache.commons.math.random.RandomGenerator generator;

	private double[] optima;

	public MultiStartUnivariateRealOptimizer(final org.apache.commons.math.optimization.UnivariateRealOptimizer optimizer, final int starts, final org.apache.commons.math.random.RandomGenerator generator) {
		this.optimizer = optimizer;
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.maxIterations = java.lang.Integer.MAX_VALUE;
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.totalIterations = 0;
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.starts = starts;
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.generator = generator;
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.optima = null;
	}

	public double getFunctionValue() {
		return optimizer.getFunctionValue();
	}

	public double getResult() {
		return optimizer.getResult();
	}

	public double getAbsoluteAccuracy() {
		return optimizer.getAbsoluteAccuracy();
	}

	public int getIterationCount() {
		return totalIterations;
	}

	public int getMaximalIterationCount() {
		return maxIterations;
	}

	public double getRelativeAccuracy() {
		return optimizer.getRelativeAccuracy();
	}

	public void resetAbsoluteAccuracy() {
		optimizer.resetAbsoluteAccuracy();
	}

	public void resetMaximalIterationCount() {
		optimizer.resetMaximalIterationCount();
	}

	public void resetRelativeAccuracy() {
		optimizer.resetRelativeAccuracy();
	}

	public void setAbsoluteAccuracy(double accuracy) {
		optimizer.setAbsoluteAccuracy(accuracy);
	}

	public void setMaximalIterationCount(int count) {
		org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.this.maxIterations = count;
	}

	public void setRelativeAccuracy(double accuracy) {
		optimizer.setRelativeAccuracy(accuracy);
	}

	public double[] getOptima() throws java.lang.IllegalStateException {
		if ((optima) == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("no optimum computed yet");
		}
		return optima.clone();
	}

	public double optimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double min, final double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		return optimize(f, goalType, min, max, (min + ((generator.nextDouble()) * (max - min))));
	}

	public double optimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double min, final double max, final double startValue) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		optima = new double[starts];
		totalIterations = 0;
		for (int i = 0; i < (starts); ++i) {
			try {
				optimizer.setMaximalIterationCount(((maxIterations) - (totalIterations)));
				optima[i] = optimizer.optimize(f, goalType, min, max, (i == 0 ? startValue : (generator.nextDouble()) * (max - min)));
			} catch (org.apache.commons.math.FunctionEvaluationException fee) {
				optima[i] = java.lang.Double.NaN;
			} catch (org.apache.commons.math.ConvergenceException ce) {
				optima[i] = java.lang.Double.NaN;
			}
			totalIterations += optimizer.getIterationCount();
		}
		int lastNaN = optima.length;
		for (int i = 0; i < lastNaN; ++i) {
			if (java.lang.Double.isNaN(optima[i])) {
				optima[i] = optima[(--lastNaN)];
				optima[(lastNaN + 1)] = java.lang.Double.NaN;
			}
		}
		java.util.Arrays.sort(optima, 0, lastNaN);
		if (goalType == (org.apache.commons.math.optimization.GoalType.MAXIMIZE)) {
			for (int i = 0, j = lastNaN - 1; i < j; ++i , --j) {
				double tmp = optima[i];
				optima[i] = optima[j];
				optima[j] = tmp;
			}
		}
		if (java.lang.Double.isNaN(optima[0])) {
			throw new org.apache.commons.math.optimization.OptimizationException("none of the {0} start points lead to convergence", starts);
		}
		return optima[0];
	}
}

