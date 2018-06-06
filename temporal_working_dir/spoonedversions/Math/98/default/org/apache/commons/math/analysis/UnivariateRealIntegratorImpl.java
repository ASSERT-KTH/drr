

package org.apache.commons.math.analysis;


public abstract class UnivariateRealIntegratorImpl implements java.io.Serializable , org.apache.commons.math.analysis.UnivariateRealIntegrator {
	static final long serialVersionUID = -3365294665201465048L;

	protected double relativeAccuracy;

	protected int maximalIterationCount;

	protected int minimalIterationCount;

	protected double defaultRelativeAccuracy;

	protected int defaultMaximalIterationCount;

	protected int defaultMinimalIterationCount;

	protected boolean resultComputed = false;

	protected double result;

	protected int iterationCount;

	protected org.apache.commons.math.analysis.UnivariateRealFunction f;

	protected UnivariateRealIntegratorImpl(org.apache.commons.math.analysis.UnivariateRealFunction f, int defaultMaximalIterationCount) throws java.lang.IllegalArgumentException {
		if (f == null) {
			throw new java.lang.IllegalArgumentException("Function can not be null.");
		}
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.f = f;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.defaultMaximalIterationCount = defaultMaximalIterationCount;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.maximalIterationCount = defaultMaximalIterationCount;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.defaultRelativeAccuracy = 1.0E-6;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.relativeAccuracy = defaultRelativeAccuracy;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.defaultMinimalIterationCount = 3;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.minimalIterationCount = defaultMinimalIterationCount;
		verifyIterationCount();
	}

	public double getResult() throws java.lang.IllegalStateException {
		if (resultComputed) {
			return result;
		}else {
			throw new java.lang.IllegalStateException("No result available.");
		}
	}

	public int getIterationCount() throws java.lang.IllegalStateException {
		if (resultComputed) {
			return iterationCount;
		}else {
			throw new java.lang.IllegalStateException("No result available.");
		}
	}

	protected final void setResult(double result, int iterationCount) {
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.result = result;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.iterationCount = iterationCount;
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.resultComputed = true;
	}

	protected final void clearResult() {
		org.apache.commons.math.analysis.UnivariateRealIntegratorImpl.this.resultComputed = false;
	}

	public void setMaximalIterationCount(int count) {
		maximalIterationCount = count;
	}

	public int getMaximalIterationCount() {
		return maximalIterationCount;
	}

	public void resetMaximalIterationCount() {
		maximalIterationCount = defaultMaximalIterationCount;
	}

	public void setMinimalIterationCount(int count) {
		minimalIterationCount = count;
	}

	public int getMinimalIterationCount() {
		return minimalIterationCount;
	}

	public void resetMinimalIterationCount() {
		minimalIterationCount = defaultMinimalIterationCount;
	}

	public void setRelativeAccuracy(double accuracy) {
		relativeAccuracy = accuracy;
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public void resetRelativeAccuracy() {
		relativeAccuracy = defaultRelativeAccuracy;
	}

	protected boolean isSequence(double start, double mid, double end) {
		return (start < mid) && (mid < end);
	}

	protected void verifyInterval(double lower, double upper) throws java.lang.IllegalArgumentException {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException((((("Endpoints do not specify an interval: [" + lower) + ", ") + upper) + "]"));
		}
	}

	protected void verifyIterationCount() throws java.lang.IllegalArgumentException {
		if (!(isSequence(0, minimalIterationCount, ((maximalIterationCount) + 1)))) {
			throw new java.lang.IllegalArgumentException(((("Invalid iteration limits: min=" + (minimalIterationCount)) + " max=") + (maximalIterationCount)));
		}
	}
}

