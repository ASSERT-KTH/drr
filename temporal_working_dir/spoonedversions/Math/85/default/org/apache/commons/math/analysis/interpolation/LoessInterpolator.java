

package org.apache.commons.math.analysis.interpolation;


public class LoessInterpolator implements java.io.Serializable , org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator {
	private static final long serialVersionUID = 5204927143605193821L;

	public static final double DEFAULT_BANDWIDTH = 0.3;

	public static final int DEFAULT_ROBUSTNESS_ITERS = 2;

	private final double bandwidth;

	private final int robustnessIters;

	public LoessInterpolator() {
		this.bandwidth = org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_BANDWIDTH;
		this.robustnessIters = org.apache.commons.math.analysis.interpolation.LoessInterpolator.DEFAULT_ROBUSTNESS_ITERS;
	}

	public LoessInterpolator(double bandwidth, int robustnessIters) throws org.apache.commons.math.MathException {
		if ((bandwidth < 0) || (bandwidth > 1)) {
			throw new org.apache.commons.math.MathException("bandwidth must be in the interval [0,1], but got {0}", bandwidth);
		}
		this.bandwidth = bandwidth;
		if (robustnessIters < 0) {
			throw new org.apache.commons.math.MathException(("the number of robustness iterations must " + "be non-negative, but got {0}"), robustnessIters);
		}
		this.robustnessIters = robustnessIters;
	}

	public final org.apache.commons.math.analysis.UnivariateRealFunction interpolate(final double[] xval, final double[] yval) throws org.apache.commons.math.MathException {
		return new org.apache.commons.math.analysis.interpolation.SplineInterpolator().interpolate(xval, smooth(xval, yval));
	}

	public final double[] smooth(final double[] xval, final double[] yval) throws org.apache.commons.math.MathException {
		if ((xval.length) != (yval.length)) {
			throw new org.apache.commons.math.MathException(("Loess expects the abscissa and ordinate arrays " + ("to be of the same size, " + "but got {0} abscisssae and {1} ordinatae")), xval.length, yval.length);
		}
		final int n = xval.length;
		if (n == 0) {
			throw new org.apache.commons.math.MathException("Loess expects at least 1 point");
		}
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(xval, true);
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(yval, false);
		org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkStrictlyIncreasing(xval);
		if (n == 1) {
			return new double[]{ yval[0] };
		}
		if (n == 2) {
			return new double[]{ yval[0] , yval[1] };
		}
		int bandwidthInPoints = ((int) ((bandwidth) * n));
		if (bandwidthInPoints < 2) {
			throw new org.apache.commons.math.MathException(("the bandwidth must be large enough to " + (("accomodate at least 2 points. There are {0} " + " data points, and bandwidth must be at least {1} ") + " but it is only {2}")), n, (2.0 / n), bandwidth);
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
					org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(xval, i, bandwidthInterval);
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
				double denom = java.lang.Math.abs((1.0 / ((xval[edge]) - x)));
				for (int k = ileft; k <= iright; ++k) {
					final double xk = xval[k];
					final double yk = yval[k];
					double dist;
					if (k < i) {
						dist = x - xk;
					}else {
						dist = xk - x;
					}
					final double w = (org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube((dist * denom))) * (robustnessWeights[k]);
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
				if (meanXSquared == (meanX * meanX)) {
					beta = 0;
				}else {
					beta = (meanXY - (meanX * meanY)) / (meanXSquared - (meanX * meanX));
				}
				final double alpha = meanY - (beta * meanX);
				res[i] = (beta * x) + alpha;
				residuals[i] = java.lang.Math.abs(((yval[i]) - (res[i])));
			}
			if (iter == (robustnessIters)) {
				break;
			}
			java.lang.System.arraycopy(residuals, 0, sortedResiduals, 0, n);
			java.util.Arrays.sort(sortedResiduals);
			final double medianResidual = sortedResiduals[(n / 2)];
			if (medianResidual == 0) {
				break;
			}
			for (int i = 0; i < n; ++i) {
				final double arg = (residuals[i]) / (6 * medianResidual);
				robustnessWeights[i] = (arg >= 1) ? 0 : java.lang.Math.pow((1 - (arg * arg)), 2);
			}
		}
		return res;
	}

	private static void updateBandwidthInterval(final double[] xval, final int i, final int[] bandwidthInterval) {
		final int left = bandwidthInterval[0];
		final int right = bandwidthInterval[1];
		if ((right < ((xval.length) - 1)) && (((xval[(right + 1)]) - (xval[i])) < ((xval[i]) - (xval[left])))) {
			(bandwidthInterval[0])++;
			(bandwidthInterval[1])++;
		}
	}

	private static double tricube(final double x) {
		final double tmp = 1 - ((x * x) * x);
		return (tmp * tmp) * tmp;
	}

	private static void checkAllFiniteReal(final double[] values, final boolean isAbscissae) throws org.apache.commons.math.MathException {
		for (int i = 0; i < (values.length); i++) {
			final double x = values[i];
			if ((java.lang.Double.isInfinite(x)) || (java.lang.Double.isNaN(x))) {
				final java.lang.String pattern = isAbscissae ? "all abscissae must be finite real numbers, but {0}-th is {1}" : "all ordinatae must be finite real numbers, but {0}-th is {1}";
				throw new org.apache.commons.math.MathException(pattern, i, x);
			}
		}
	}

	private static void checkStrictlyIncreasing(final double[] xval) throws org.apache.commons.math.MathException {
		for (int i = 0; i < (xval.length); ++i) {
			if ((i >= 1) && ((xval[(i - 1)]) >= (xval[i]))) {
				throw new org.apache.commons.math.MathException(("the abscissae array must be sorted in a strictly " + ("increasing order, but the {0}-th element is {1} " + "whereas {2}-th is {3}")), (i - 1), xval[(i - 1)], i, xval[i]);
			}
		}
	}
}

