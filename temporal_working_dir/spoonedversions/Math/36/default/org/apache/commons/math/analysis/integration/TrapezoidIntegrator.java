

package org.apache.commons.math.analysis.integration;


public class TrapezoidIntegrator extends org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator {
	public static final int TRAPEZOID_MAX_ITERATIONS_COUNT = 64;

	private double s;

	public TrapezoidIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooLargeException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT, false);
		}
	}

	public TrapezoidIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooLargeException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super(minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT, false);
		}
	}

	public TrapezoidIntegrator() {
		super(org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT);
	}

	double stage(final org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator baseIntegrator, final int n) throws org.apache.commons.math.exception.TooManyEvaluationsException {
		if (n == 0) {
			s = (0.5 * ((baseIntegrator.max) - (baseIntegrator.min))) * ((baseIntegrator.computeObjectiveValue(baseIntegrator.min)) + (baseIntegrator.computeObjectiveValue(baseIntegrator.max)));
			return s;
		}else {
			final long np = 1L << (n - 1);
			double sum = 0;
			final double spacing = ((baseIntegrator.max) - (baseIntegrator.min)) / np;
			double x = (baseIntegrator.min) + (0.5 * spacing);
			for (long i = 0; i < np; i++) {
				sum += baseIntegrator.computeObjectiveValue(x);
				x += spacing;
			}
			s = 0.5 * ((s) + (sum * spacing));
			return s;
		}
	}

	@java.lang.Override
	protected double doIntegrate() throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.TooManyEvaluationsException {
		double oldt = stage(org.apache.commons.math.analysis.integration.TrapezoidIntegrator.this, 0);
		iterations.incrementCount();
		while (true) {
			final int i = iterations.getCount();
			final double t = stage(org.apache.commons.math.analysis.integration.TrapezoidIntegrator.this, i);
			if (i >= (minimalIterationCount)) {
				final double delta = org.apache.commons.math.util.FastMath.abs((t - oldt));
				final double rLimit = ((relativeAccuracy) * ((org.apache.commons.math.util.FastMath.abs(oldt)) + (org.apache.commons.math.util.FastMath.abs(t)))) * 0.5;
				if ((delta <= rLimit) || (delta <= (absoluteAccuracy))) {
					return t;
				}
			}
			oldt = t;
			iterations.incrementCount();
		} 
	}
}

