

package org.apache.commons.math.analysis.integration;


public class SimpsonIntegrator extends org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator {
	public static final int SIMPSON_MAX_ITERATIONS_COUNT = 64;

	public SimpsonIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooLargeException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math.analysis.integration.SimpsonIntegrator.SIMPSON_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math.analysis.integration.SimpsonIntegrator.SIMPSON_MAX_ITERATIONS_COUNT, false);
		}
	}

	public SimpsonIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooLargeException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super(minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math.analysis.integration.SimpsonIntegrator.SIMPSON_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math.analysis.integration.SimpsonIntegrator.SIMPSON_MAX_ITERATIONS_COUNT, false);
		}
	}

	public SimpsonIntegrator() {
		super(org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math.analysis.integration.SimpsonIntegrator.SIMPSON_MAX_ITERATIONS_COUNT);
	}

	@java.lang.Override
	protected double doIntegrate() throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.TooManyEvaluationsException {
		org.apache.commons.math.analysis.integration.TrapezoidIntegrator qtrap = new org.apache.commons.math.analysis.integration.TrapezoidIntegrator();
		if ((minimalIterationCount) == 1) {
			return ((4 * (qtrap.stage(org.apache.commons.math.analysis.integration.SimpsonIntegrator.this, 1))) - (qtrap.stage(org.apache.commons.math.analysis.integration.SimpsonIntegrator.this, 0))) / 3.0;
		}
		double olds = 0;
		double oldt = qtrap.stage(org.apache.commons.math.analysis.integration.SimpsonIntegrator.this, 0);
		while (true) {
			final double t = qtrap.stage(org.apache.commons.math.analysis.integration.SimpsonIntegrator.this, iterations.getCount());
			iterations.incrementCount();
			final double s = ((4 * t) - oldt) / 3.0;
			if ((iterations.getCount()) >= (minimalIterationCount)) {
				final double delta = org.apache.commons.math.util.FastMath.abs((s - olds));
				final double rLimit = ((relativeAccuracy) * ((org.apache.commons.math.util.FastMath.abs(olds)) + (org.apache.commons.math.util.FastMath.abs(s)))) * 0.5;
				if ((delta <= rLimit) || (delta <= (absoluteAccuracy))) {
					return s;
				}
			}
			olds = s;
			oldt = t;
		} 
	}
}

