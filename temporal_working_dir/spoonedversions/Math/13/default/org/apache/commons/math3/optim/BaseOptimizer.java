

package org.apache.commons.math3.optim;


public abstract class BaseOptimizer<PAIR> {
	protected final org.apache.commons.math3.util.Incrementor evaluations;

	protected final org.apache.commons.math3.util.Incrementor iterations;

	private org.apache.commons.math3.optim.ConvergenceChecker<PAIR> checker;

	protected BaseOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<PAIR> checker) {
		org.apache.commons.math3.optim.BaseOptimizer.this.checker = checker;
		evaluations = new org.apache.commons.math3.util.Incrementor(0, new org.apache.commons.math3.optim.BaseOptimizer.MaxEvalCallback());
		iterations = new org.apache.commons.math3.util.Incrementor(0, new org.apache.commons.math3.optim.BaseOptimizer.MaxIterCallback());
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public int getMaxIterations() {
		return iterations.getMaximalCount();
	}

	public int getIterations() {
		return iterations.getCount();
	}

	public org.apache.commons.math3.optim.ConvergenceChecker<PAIR> getConvergenceChecker() {
		return checker;
	}

	public PAIR optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyEvaluationsException, org.apache.commons.math3.exception.TooManyIterationsException {
		parseOptimizationData(optData);
		evaluations.resetCount();
		iterations.resetCount();
		return doOptimize();
	}

	protected abstract PAIR doOptimize();

	protected void incrementEvaluationCount() throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		evaluations.incrementCount();
	}

	protected void incrementIterationCount() throws org.apache.commons.math3.exception.TooManyIterationsException {
		iterations.incrementCount();
	}

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.MaxEval) {
				evaluations.setMaximalCount(((org.apache.commons.math3.optim.MaxEval) (data)).getMaxEval());
				continue;
			}
			if (data instanceof org.apache.commons.math3.optim.MaxIter) {
				iterations.setMaximalCount(((org.apache.commons.math3.optim.MaxIter) (data)).getMaxIter());
				continue;
			}
		}
	}

	private static class MaxEvalCallback implements org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback {
		public void trigger(int max) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(max);
		}
	}

	private static class MaxIterCallback implements org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback {
		public void trigger(int max) {
			throw new org.apache.commons.math3.exception.TooManyIterationsException(max);
		}
	}
}

