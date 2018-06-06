

package org.apache.commons.math3.optim;


public abstract class BaseMultiStartMultivariateOptimizer<PAIR> extends org.apache.commons.math3.optim.BaseMultivariateOptimizer<PAIR> {
	private final org.apache.commons.math3.optim.BaseMultivariateOptimizer<PAIR> optimizer;

	private int totalEvaluations;

	private int starts;

	private org.apache.commons.math3.random.RandomVectorGenerator generator;

	private org.apache.commons.math3.optim.OptimizationData[] optimData;

	private int maxEvalIndex = -1;

	private int initialGuessIndex = -1;

	public BaseMultiStartMultivariateOptimizer(final org.apache.commons.math3.optim.BaseMultivariateOptimizer<PAIR> optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) {
		super(optimizer.getConvergenceChecker());
		if (starts < 1) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(starts);
		}
		this.optimizer = optimizer;
		org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.this.starts = starts;
		org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.this.generator = generator;
	}

	@java.lang.Override
	public int getEvaluations() {
		return totalEvaluations;
	}

	public abstract PAIR[] getOptima();

	@java.lang.Override
	public PAIR optimize(org.apache.commons.math3.optim.OptimizationData... optData) {
		optimData = optData;
		return super.optimize(optData);
	}

	@java.lang.Override
	protected PAIR doOptimize() {
		for (int i = 0; i < (optimData.length); i++) {
			if ((optimData[i]) instanceof org.apache.commons.math3.optim.MaxEval) {
				optimData[i] = null;
				maxEvalIndex = i;
			}
			if ((optimData[i]) instanceof org.apache.commons.math3.optim.InitialGuess) {
				optimData[i] = null;
				initialGuessIndex = i;
				continue;
			}
		}
		if ((maxEvalIndex) == (-1)) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException();
		}
		if ((initialGuessIndex) == (-1)) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException();
		}
		java.lang.RuntimeException lastException = null;
		totalEvaluations = 0;
		clear();
		final int maxEval = getMaxEvaluations();
		final double[] min = getLowerBound();
		final double[] max = getUpperBound();
		final double[] startPoint = getStartPoint();
		for (int i = 0; i < (starts); i++) {
			try {
				optimData[maxEvalIndex] = new org.apache.commons.math3.optim.MaxEval((maxEval - (totalEvaluations)));
				final double[] s = i == 0 ? startPoint : generator.nextVector();
				optimData[initialGuessIndex] = new org.apache.commons.math3.optim.InitialGuess(s);
				final PAIR result = optimizer.optimize(optimData);
				store(result);
			} catch (java.lang.RuntimeException mue) {
				lastException = mue;
			}
			totalEvaluations += optimizer.getEvaluations();
		}
		final PAIR[] optima = getOptima();
		if ((optima.length) == 0) {
			throw lastException;
		}
		return optima[0];
	}

	protected abstract void store(PAIR optimum);

	protected abstract void clear();
}

