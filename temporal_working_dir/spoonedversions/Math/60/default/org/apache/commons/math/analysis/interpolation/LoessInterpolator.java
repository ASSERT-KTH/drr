

package org.apache.commons.math.analysis.interpolation;


public class LoessInterpolator implements java.io.Serializable , org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator {
	public static final double DEFAULT_BANDWIDTH = 0.3;

	public static final int DEFAULT_ROBUSTNESS_ITERS = 2;

	public static final double DEFAULT_ACCURACY = 1.0E-12;

	private static final long serialVersionUID = 5204927143605193821L;

	private final double bandwidth;

	private final int robustnessIters;

	private final double accuracy;

	public LoessInterpolator() {
		this.bandwidth = org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_BANDWIDTH;
		this.robustnessIters = org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_ROBUSTNESS_ITERS;
		this.accuracy = org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_ACCURACY;
	}

	public LoessInterpolator(double bandwidth, int robustnessIters) throws org.apache.commons.math.MathException {
		this(bandwidth, robustnessIters, org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_ACCURACY);
	}

	public LoessInterpolator(double bandwidth, int robustnessIters, double accuracy) throws org.apache.commons.math.MathException {
		if ((bandwidth < 0) || (bandwidth > 1)) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.BANDWIDTH_OUT_OF_INTERVAL, bandwidth);
		}
		this.bandwidth = bandwidth;
		if (robustnessIters < 0) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.NEGATIVE_ROBUSTNESS_ITERATIONS, robustnessIters);
		}
		this.robustnessIters = robustnessIters;
		this.accuracy = accuracy;
	}

	public final org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction interpolate(final double[] xval, final double[] yval) throws org.apache.commons.math.MathException {
		return new org.apache.commons.math.analysis.interpolation.SplineInterpolator().interpolate(xval, smooth(xval, yval));
	}

	public final double[] smooth(final double[] xval, final double[] yval, final double[] weights) throws org.apache.commons.math.MathException {
		if ((xval.length) != (yval.length)) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS, xval.length, yval.length);
		}
		final int n = xval.length;
		if (n == 0) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.LOESS_EXPECTS_AT_LEAST_ONE_POINT);
		}
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(xval, org.apache.commons.math.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA);
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(yval, org.apache.commons.math.exception.util.LocalizedFormats.NON_REAL_FINITE_ORDINATE);
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(weights, org.apache.commons.math.exception.util.LocalizedFormats.NON_REAL_FINITE_WEIGHT);
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkStrictlyIncreasing(xval);
		if (n == 1) {
			return new double[]{ yval[0] };
		}
		if (n == 2) {
			return new double[]{ yval[0] , yval[1] };
		}
		int bandwidthInPoints = ((int) ((bandwidth) * n));
		if (bandwidthInPoints < 2) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_SMALL_BANDWIDTH, n, (2.0 / n), bandwidth);
		}
		final double[] res = new double[n];
		final double[] residuals = new double[n];
		final double[] sortedResiduals = new double[n];
		final double[] robustnessWeights = new double[n];
		java.util.Arrays.fill(robustnessWeights, 1);
		for (int iter = 0; iter <= (robustnessIters); ++iter) {
			final int[] bandwidthInterval = new int[]{ 0 , bandwidthInPoints - 1 };
			for (int i = 0; i < n; ++i) {
				final double x = xval[i];
				if (i > 0) {
					org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(xval, weights, i, bandwidthInterval);
				}
				final int ileft = bandwidthInterval[0];
				final int iright = bandwidthInterval[1];
				final int edge;
				if (((xval[i]) - (xval[ileft])) > ((xval[iright]) - (xval[i]))) {
					edge = ileft;
				}else {
					edge = iright;
				}
				double sumWeights = 0;
				double sumX = 0;
				double sumXSquared = 0;
				double sumY = 0;
				double sumXY = 0;
				double denom = org.apache.commons.math.util.FastMath.abs((1.0 / ((xval[edge]) - x)));
				for (int k = ileft; k <= iright; ++k) {
					final double xk = xval[k];
					final double yk = yval[k];
					final double dist = k < i ? x - xk : xk - x;
					final double w = ((org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube((dist * denom))) * (robustnessWeights[k])) * (weights[k]);
					final double xkw = xk * w;
					sumWeights += w;
					sumX += xkw;
					sumXSquared += xk * xkw;
					sumY += yk * w;
					sumXY += yk * xkw;
				}
				final double meanX = sumX / sumWeights;
				final double meanY = sumY / sumWeights;
				final double meanXY = sumXY / sumWeights;
				final double meanXSquared = sumXSquared / sumWeights;
				final double beta;
				if ((org.apache.commons.math.util.FastMath.sqrt(org.apache.commons.math.util.FastMath.abs((meanXSquared - (meanX * meanX))))) < (accuracy)) {
					beta = 0;
				}else {
					beta = (meanXY - (meanX * meanY)) / (meanXSquared - (meanX * meanX));
				}
				final double alpha = meanY - (beta * meanX);
				res[i] = (beta * x) + alpha;
				residuals[i] = org.apache.commons.math.util.FastMath.abs(((yval[i]) - (res[i])));
			}
			if (iter == (robustnessIters)) {
				break;
			}
			java.lang.System.arraycopy(residuals, 0, sortedResiduals, 0, n);
			java.util.Arrays.sort(sortedResiduals);
			final double medianResidual = sortedResiduals[(n / 2)];
			if ((org.apache.commons.math.util.FastMath.abs(medianResidual)) < (accuracy)) {
				break;
			}
			for (int i = 0; i < n; ++i) {
				final double arg = (residuals[i]) / (6 * medianResidual);
				if (arg >= 1) {
					robustnessWeights[i] = 0;
				}else {
					final double w = 1 - (arg * arg);
					robustnessWeights[i] = w * w;
				}
			}
		}
		return res;
	}

	public final double[] smooth(final double[] xval, final double[] yval) throws org.apache.commons.math.MathException {
		if ((xval.length) != (yval.length)) {
			throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS, xval.length, yval.length);
		}
		final double[] unitWeights = new double[xval.length];
		java.util.Arrays.fill(unitWeights, 1.0);
		return smooth(xval, yval, unitWeights);
	}

	private static void updateBandwidthInterval(final double[] xval, final double[] weights, final int i, final int[] bandwidthInterval) {
		final int left = bandwidthInterval[0];
		final int right = bandwidthInterval[1];
		int nextRight = org.apache.commons.math.analysis.interpolation.LoessInterpolator.nextNonzero(weights, right);
		if ((nextRight < (xval.length)) && (((xval[nextRight]) - (xval[i])) < ((xval[i]) - (xval[left])))) {
			int nextLeft = org.apache.commons.math.analysis.interpolation.LoessInterpolator.nextNonzero(weights, bandwidthInterval[0]);
			bandwidthInterval[0] = nextLeft;
			bandwidthInterval[1] = nextRight;
		}
	}

	private static int nextNonzero(final double[] weights, final int i) {
		int j = i + 1;
		while ((j < (weights.length)) && ((weights[j]) == 0)) {
			j++;
		} 
		return j;
	}

	private static double tricube(final double x) {
		final double tmp = 1 - ((x * x) * x);
		return (tmp * tmp) * tmp;
	}

	private static void checkAllFiniteReal(final double[] values, final org.apache.commons.math.exception.util.Localizable pattern) throws org.apache.commons.math.MathException {
		for (int i = 0; i < (values.length); i++) {
			final double x = values[i];
			if ((java.lang.Double.isInfinite(x)) || (java.lang.Double.isNaN(x))) {
				throw new org.apache.commons.math.MathException(pattern, i, x);
			}
		}
	}

	private static void checkStrictlyIncreasing(final double[] xval) throws org.apache.commons.math.MathException {
		for (int i = 0; i < (xval.length); ++i) {
			if ((i >= 1) && ((xval[(i - 1)]) >= (xval[i]))) {
				throw new org.apache.commons.math.MathException(org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_ORDER_ABSCISSA_ARRAY, (i - 1), xval[(i - 1)], i, xval[i]);
			}
		}
	}
}

