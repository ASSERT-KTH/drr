

package org.apache.commons.math.analysis.integration;


public abstract class UnivariateRealIntegratorImpl implements org.apache.commons.math.analysis.integration.UnivariateRealIntegrator {
	public static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-15;

	public static final double DEFAULT_RELATIVE_ACCURACY = 1.0E-6;

	public static final int DEFAULT_MIN_ITERATIONS_COUNT = 3;

	public static final int DEFAULT_MAX_ITERATIONS_COUNT = java.lang.Integer.MAX_VALUE;

	protected double absoluteAccuracy;

	protected double relativeAccuracy;

	protected int minimalIterationCount;

	protected org.apache.commons.math.util.Incrementor iterations;

	protected org.apache.commons.math.util.Incrementor evaluations;

	protected org.apache.commons.math.analysis.UnivariateFunction function;

	protected double min;

	protected double max;

	protected UnivariateRealIntegratorImpl(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooSmallException {
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.relativeAccuracy = relativeAccuracy;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.absoluteAccuracy = absoluteAccuracy;
		if (minimalIterationCount <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(minimalIterationCount);
		}
		if (maximalIterationCount <= minimalIterationCount) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(maximalIterationCount, minimalIterationCount, false);
		}
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.minimalIterationCount = minimalIterationCount;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.iterations = new org.apache.commons.math.util.Incrementor();
		iterations.setMaximalCount(maximalIterationCount);
		evaluations = new org.apache.commons.math.util.Incrementor();
	}

	protected UnivariateRealIntegratorImpl(final double relativeAccuracy, final double absoluteAccuracy) {
		this(relativeAccuracy, absoluteAccuracy, org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.DEFAULT_MAX_ITERATIONS_COUNT);
	}

	protected UnivariateRealIntegratorImpl(final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooSmallException {
		this(org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.DEFAULT_RELATIVE_ACCURACY, org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.DEFAULT_ABSOLUTE_ACCURACY, minimalIterationCount, maximalIterationCount);
	}

	public double getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public double getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public int getMinimalIterationCount() {
		return minimalIterationCount;
	}

	public int getMaximalIterationCount() {
		return iterations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public int getIterations() {
		return iterations.getCount();
	}

	protected double computeObjectiveValue(final double point) throws org.apache.commons.math.exception.TooManyEvaluationsException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	protected void setup(final int maxEval, final org.apache.commons.math.analysis.UnivariateFunction f, final double lower, final double upper) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(f);
		org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(lower, upper);
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.min = lower;
		org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl.this.max = upper;
		function = f;
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		iterations.resetCount();
	}

	public double integrate(final int maxEval, final org.apache.commons.math.analysis.UnivariateFunction f, final double lower, final double upper) throws org.apache.commons.math.exception.MathIllegalArgumentException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.exception.TooManyEvaluationsException {
		setup(maxEval, f, lower, upper);
		return doIntegrate();
	}

	protected abstract double doIntegrate() throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.TooManyEvaluationsException;
}

