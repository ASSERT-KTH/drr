

package org.apache.commons.math.analysis.minimization;


public abstract class UnivariateRealMinimizerImpl extends org.apache.commons.math.ConvergingAlgorithmImpl implements org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer {
	private static final long serialVersionUID = 4543031162377070699L;

	protected boolean resultComputed = false;

	protected double result;

	protected double functionValue;

	protected UnivariateRealMinimizerImpl(int defaultMaximalIterationCount, double defaultAbsoluteAccuracy) {
		super(defaultMaximalIterationCount, defaultAbsoluteAccuracy);
	}

	protected void checkResultComputed() throws java.lang.IllegalStateException {
		if (!(resultComputed)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("no result available", null);
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

	protected final void setResult(double result, int iterationCount) {
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.result = result;
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.resultComputed = true;
	}

	protected final void setResult(double x, double fx, int iterationCount) {
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.result = x;
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.functionValue = fx;
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl.this.resultComputed = false;
	}
}

