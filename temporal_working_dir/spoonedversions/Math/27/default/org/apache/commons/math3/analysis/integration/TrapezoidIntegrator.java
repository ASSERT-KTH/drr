

package org.apache.commons.math3.analysis.integration;


public class TrapezoidIntegrator extends org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator {
	public static final int TRAPEZOID_MAX_ITERATIONS_COUNT = 64;

	private double s;

	public TrapezoidIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT, false);
		}
	}

	public TrapezoidIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		super(minimalIterationCount, maximalIterationCount);
		if (maximalIterationCount > (org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(maximalIterationCount, org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT, false);
		}
	}

	public TrapezoidIntegrator() {
		super(org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TRAPEZOID_MAX_ITERATIONS_COUNT);
	}

	double stage(final org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator baseIntegrator, final int n) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		if (n == 0) {
			final double max = baseIntegrator.getMax();
			final double min = baseIntegrator.getMin();
			s = (0.5 * (max - min)) * ((baseIntegrator.computeObjectiveValue(min)) + (baseIntegrator.computeObjectiveValue(max)));
			return s;
		}else {
			final long np = 1L << (n - 1);
			double sum = 0;
			final double max = baseIntegrator.getMax();
			final double min = baseIntegrator.getMin();
			final double spacing = (max - min) / np;
			double x = min + (0.5 * spacing);
			for (long i = 0; i < np; i++) {
				sum += baseIntegrator.computeObjectiveValue(x);
				x += spacing;
			}
			s = 0.5 * ((s) + (sum * spacing));
			return s;
		}
	}

	@java.lang.Override
	protected double doIntegrate() throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		double oldt = stage(org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.this, 0);
		iterations.incrementCount();
		while (true) {
			final int i = iterations.getCount();
			final double t = stage(org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.this, i);
			if (i >= (getMinimalIterationCount())) {
				final double delta = org.apache.commons.math3.util.FastMath.abs((t - oldt));
				final double rLimit = ((getRelativeAccuracy()) * ((org.apache.commons.math3.util.FastMath.abs(oldt)) + (org.apache.commons.math3.util.FastMath.abs(t)))) * 0.5;
				if ((delta <= rLimit) || (delta <= (getAbsoluteAccuracy()))) {
					return t;
				}
			}
			oldt = t;
			iterations.incrementCount();
		} 
	}
}

