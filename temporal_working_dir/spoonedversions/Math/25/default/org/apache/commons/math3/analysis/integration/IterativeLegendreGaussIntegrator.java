

package org.apache.commons.math3.analysis.integration;


public class IterativeLegendreGaussIntegrator extends org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator {
	private static final org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory FACTORY = new org.apache.commons.math3.analysis.integration.gauss.GaussIntegratorFactory();

	private final int numberOfPoints;

	public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);
		numberOfPoints = n;
	}

	public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy) {
		this(n, relativeAccuracy, absoluteAccuracy, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MAX_ITERATIONS_COUNT);
	}

	public IterativeLegendreGaussIntegrator(final int n, final int minimalIterationCount, final int maximalIterationCount) {
		this(n, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY, org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_ABSOLUTE_ACCURACY, minimalIterationCount, maximalIterationCount);
	}

	@java.lang.Override
	protected double doIntegrate() throws org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		double oldt = stage(1);
		int n = 2;
		while (true) {
			final double t = stage(n);
			final double delta = org.apache.commons.math3.util.FastMath.abs((t - oldt));
			final double limit = org.apache.commons.math3.util.FastMath.max(getAbsoluteAccuracy(), (((getRelativeAccuracy()) * ((org.apache.commons.math3.util.FastMath.abs(oldt)) + (org.apache.commons.math3.util.FastMath.abs(t)))) * 0.5));
			if ((((iterations.getCount()) + 1) >= (getMinimalIterationCount())) && (delta <= limit)) {
				return t;
			}
			final double ratio = org.apache.commons.math3.util.FastMath.min(4, org.apache.commons.math3.util.FastMath.pow((delta / limit), (0.5 / (numberOfPoints))));
			n = org.apache.commons.math3.util.FastMath.max(((int) (ratio * n)), (n + 1));
			oldt = t;
			iterations.incrementCount();
		} 
	}

	private double stage(final int n) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		final org.apache.commons.math3.analysis.UnivariateFunction f = new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return computeObjectiveValue(x);
			}
		};
		final double min = getMin();
		final double max = getMax();
		final double step = (max - min) / n;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			final double a = min + (i * step);
			final double b = a + step;
			final org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator g = org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator.FACTORY.legendreHighPrecision(numberOfPoints, a, b);
			sum += g.integrate(f);
		}
		return sum;
	}
}

