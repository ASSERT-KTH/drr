

package org.apache.commons.math.optimization.univariate;


public abstract class AbstractUnivariateRealOptimizer extends org.apache.commons.math.ConvergingAlgorithmImpl implements org.apache.commons.math.optimization.UnivariateRealOptimizer {
	protected boolean resultComputed;

	protected double result;

	protected double functionValue;

	private int maxEvaluations;

	private int evaluations;

	protected AbstractUnivariateRealOptimizer(final int defaultMaximalIterationCount, final double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
		resultComputed = false;
		setMaxEvaluations(java.lang.Integer.MAX_VALUE);
	}

	protected void checkResultComputed() throws java.lang.IllegalStateException {
		if (!(resultComputed)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.util.LocalizedFormats.NO_RESULT_AVAILABLE);
		}
	}

	public double getResult() {
		checkResultComputed();
		return result;
	}

	public double getFunctionValue() {
		checkResultComputed();
		return functionValue;
	}

	protected final void setResult(final double x, final double fx, final int iterationCount) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.result = x;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.functionValue = fx;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.iterationCount = iterationCount;
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.resultComputed = false;
	}

	public void setMaxEvaluations(int maxEvaluations) {
		org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.this.maxEvaluations = maxEvaluations;
	}

	public int getMaxEvaluations() {
		return maxEvaluations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	protected double computeObjectiveValue(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double point) throws org.apache.commons.math.FunctionEvaluationException {
		if ((++(evaluations)) > (maxEvaluations)) {
			throw new org.apache.commons.math.FunctionEvaluationException(new org.apache.commons.math.MaxEvaluationsExceededException(maxEvaluations), point);
		}
		return f.value(point);
	}
}

