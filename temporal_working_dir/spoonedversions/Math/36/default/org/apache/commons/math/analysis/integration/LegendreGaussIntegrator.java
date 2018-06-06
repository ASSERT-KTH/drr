

package org.apache.commons.math.analysis.integration;


public class LegendreGaussIntegrator extends org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator {
	private static final double[] ABSCISSAS_2 = new double[]{ (-1.0) / (org.apache.commons.math.util.FastMath.sqrt(3.0)) , 1.0 / (org.apache.commons.math.util.FastMath.sqrt(3.0)) };

	private static final double[] WEIGHTS_2 = new double[]{ 1.0 , 1.0 };

	private static final double[] ABSCISSAS_3 = new double[]{ -(org.apache.commons.math.util.FastMath.sqrt(0.6)) , 0.0 , org.apache.commons.math.util.FastMath.sqrt(0.6) };

	private static final double[] WEIGHTS_3 = new double[]{ 5.0 / 9.0 , 8.0 / 9.0 , 5.0 / 9.0 };

	private static final double[] ABSCISSAS_4 = new double[]{ -(org.apache.commons.math.util.FastMath.sqrt(((15.0 + (2.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 35.0))) , -(org.apache.commons.math.util.FastMath.sqrt(((15.0 - (2.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 35.0))) , org.apache.commons.math.util.FastMath.sqrt(((15.0 - (2.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 35.0)) , org.apache.commons.math.util.FastMath.sqrt(((15.0 + (2.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 35.0)) };

	private static final double[] WEIGHTS_4 = new double[]{ (90.0 - (5.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 180.0 , (90.0 + (5.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 180.0 , (90.0 + (5.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 180.0 , (90.0 - (5.0 * (org.apache.commons.math.util.FastMath.sqrt(30.0)))) / 180.0 };

	private static final double[] ABSCISSAS_5 = new double[]{ -(org.apache.commons.math.util.FastMath.sqrt(((35.0 + (2.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 63.0))) , -(org.apache.commons.math.util.FastMath.sqrt(((35.0 - (2.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 63.0))) , 0.0 , org.apache.commons.math.util.FastMath.sqrt(((35.0 - (2.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 63.0)) , org.apache.commons.math.util.FastMath.sqrt(((35.0 + (2.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 63.0)) };

	private static final double[] WEIGHTS_5 = new double[]{ (322.0 - (13.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 900.0 , (322.0 + (13.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 900.0 , 128.0 / 225.0 , (322.0 + (13.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 900.0 , (322.0 - (13.0 * (org.apache.commons.math.util.FastMath.sqrt(70.0)))) / 900.0 };

	private final double[] abscissas;

	private final double[] weights;

	public LegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount);
		switch (n) {
			case 2 :
				abscissas = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.ABSCISSAS_2;
				weights = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.WEIGHTS_2;
				break;
			case 3 :
				abscissas = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.ABSCISSAS_3;
				weights = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.WEIGHTS_3;
				break;
			case 4 :
				abscissas = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.ABSCISSAS_4;
				weights = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.WEIGHTS_4;
				break;
			case 5 :
				abscissas = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.ABSCISSAS_5;
				weights = org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.WEIGHTS_5;
				break;
			default :
				throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED, n, 2, 5);
		}
	}

	public LegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy) {
		this(n, relativeAccuracy, absoluteAccuracy, org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MIN_ITERATIONS_COUNT, org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_MAX_ITERATIONS_COUNT);
	}

	public LegendreGaussIntegrator(final int n, final int minimalIterationCount, final int maximalIterationCount) {
		this(n, org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_RELATIVE_ACCURACY, org.apache.commons.math.analysis.integration.BaseAbstractUnivariateIntegrator.DEFAULT_ABSOLUTE_ACCURACY, minimalIterationCount, maximalIterationCount);
	}

	@java.lang.Override
	protected double doIntegrate() throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.TooManyEvaluationsException {
		double oldt = stage(1);
		int n = 2;
		while (true) {
			final double t = stage(n);
			final double delta = org.apache.commons.math.util.FastMath.abs((t - oldt));
			final double limit = org.apache.commons.math.util.FastMath.max(absoluteAccuracy, (((relativeAccuracy) * ((org.apache.commons.math.util.FastMath.abs(oldt)) + (org.apache.commons.math.util.FastMath.abs(t)))) * 0.5));
			if ((((iterations.getCount()) + 1) >= (minimalIterationCount)) && (delta <= limit)) {
				return t;
			}
			double ratio = org.apache.commons.math.util.FastMath.min(4, org.apache.commons.math.util.FastMath.pow((delta / limit), (0.5 / (abscissas.length))));
			n = org.apache.commons.math.util.FastMath.max(((int) (ratio * n)), (n + 1));
			oldt = t;
			iterations.incrementCount();
		} 
	}

	private double stage(final int n) throws org.apache.commons.math.exception.TooManyEvaluationsException {
		final double step = ((max) - (min)) / n;
		final double halfStep = step / 2.0;
		double midPoint = (min) + halfStep;
		double sum = 0.0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < (abscissas.length); ++j) {
				sum += (weights[j]) * (computeObjectiveValue((midPoint + (halfStep * (abscissas[j])))));
			}
			midPoint += step;
		}
		return halfStep * sum;
	}
}

