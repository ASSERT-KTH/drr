

package org.apache.commons.math3.analysis.integration;


public abstract class BaseAbstractUnivariateIntegrator implements org.apache.commons.math3.analysis.integration.UnivariateIntegrator {
	public static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-15;

	public static final double DEFAULT_RELATIVE_ACCURACY = 1.0E-6;

	public static final int DEFAULT_MIN_ITERATIONS_COUNT = 3;

	public static final int DEFAULT_MAX_ITERATIONS_COUNT = java.lang.Integer.MAX_VALUE;

	protected final org.apache.commons.math3.util.Incrementor iterations;

	private final double absoluteAccuracy;

	private final double relativeAccuracy;

	private final int minimalIterationCount;

	private final org.apache.commons.math3.util.Incrementor evaluations;

	private org.apache.commons.math3.analysis.UnivariateFunction function;

	private double min;

	private double max;

	protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		this.relativeAccuracy = relativeAccuracy;
		this.absoluteAccuracy = absoluteAccuracy;
		if (minimalIterationCount <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(minimalIterationCount);
		}
		if (maximalIterationCount <= minimalIterationCount) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(maximalIterationCount, minimalIterationCount, false);
		}
		this.minimalIterationCount = minimalIterationCount;
		this.iterations = new org.apache.commons.math3.util.Incrementor();
		iterations.setMaximalCount(maximalIterationCount);
		evaluations = new org.apache.commons.math3.util.Incrementor();
	}

	protected BaseAbstractUnivariateIntegrator(final double relativeAccuracy, final double absoluteAccuracy) {
		this(relativeAccuracy, absoluteAccuracy, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MAX_ITERATIONS_COUNT);
	}

	protected BaseAbstractUnivariateIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		this(org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_ABSOLUTE_ACCURACY, minimalIterationCount, maximalIterationCount);
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

	protected double getMin() {
		return min;
	}

	protected double getMax() {
		return max;
	}

	protected double computeObjectiveValue(final double point) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
		return function.value(point);
	}

	protected void setup(final int maxEval, final org.apache.commons.math3.analysis.UnivariateFunction f, final double lower, final double upper) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(f);
		org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.verifyInterval(lower, upper);
		min = lower;
		max = upper;
		function = f;
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		iterations.resetCount();
	}

	public double integrate(final int maxEval, final org.apache.commons.math3.analysis.UnivariateFunction f, final double lower, final double upper) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		setup(maxEval, f, lower, upper);
		return doIntegrate();
	}

	protected abstract double doIntegrate() throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.TooManyEvaluationsException;
}

