

package org.apache.commons.math.analysis.integration;


public abstract class UnivariateRealIntegratorImpl implements org.apache.commons.math.analysis.integration.UnivariateRealIntegrator {
	protected double absoluteAccuracy;

	protected double relativeAccuracy;

	protected int maximalIterationCount;

	protected int minimalIterationCount;

	protected int defaultMinimalIterationCount;

	protected int iterationCount;

	protected boolean resultComputed = false;

	protected double result;

	protected UnivariateRealIntegratorImpl(final int maximalIterationCount) {
		setMaximalIterationCount(maximalIterationCount);
		setAbsoluteAccuracy(1.0E-15);
		setRelativeAccuracy(1.0E-6);
		setMinimalIterationCount(3);
		verifyIterationCount();
	}

	public void setMaximalIterationCount(final int count) {
		maximalIterationCount = count;
	}

	public int getMaximalIterationCount() {
		return maximalIterationCount;
	}

	public void setAbsoluteAccuracy(double accuracy) {
		absoluteAccuracy = accuracy;
	}

	public double getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public void setRelativeAccuracy(final double accuracy) {
		relativeAccuracy = accuracy;
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public double getResult() throws java.lang.IllegalStateException {
		if (resultComputed) {
			return result;
		}else {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.NO_RESULT_AVAILABLE);
		}
	}

	protected final void setResult(final double newResult, final int newCount) {
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.result = newResult;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.iterationCount = newCount;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.iterationCount = 0;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.resultComputed = false;
	}

	public void setMinimalIterationCount(final int count) {
		minimalIterationCount = count;
	}

	public int getMinimalIterationCount() {
		return minimalIterationCount;
	}

	public void resetMinimalIterationCount() {
		minimalIterationCount = defaultMinimalIterationCount;
	}

	protected void verifyInterval(final double lower, final double upper) throws java.lang.IllegalArgumentException {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.ENDPOINTS_NOT_AN_INTERVAL, lower, upper);
		}
	}

	protected void verifyIterationCount() throws java.lang.IllegalArgumentException {
		if (((minimalIterationCount) <= 0) || ((maximalIterationCount) <= (minimalIterationCount))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INVALID_ITERATIONS_LIMITS, minimalIterationCount, maximalIterationCount);
		}
	}

	protected void resetIterationsCounter() {
		iterationCount = 0;
	}

	protected void incrementIterationsCounter() {
		if ((++(iterationCount)) > (maximalIterationCount)) {
			throw new org.apache.commons.math.exception.MaxCountExceededException(maximalIterationCount);
		}
	}
}

