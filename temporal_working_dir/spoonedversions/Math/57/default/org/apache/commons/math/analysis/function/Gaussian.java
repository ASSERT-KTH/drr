

package org.apache.commons.math.analysis.function;


public class Gaussian implements org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private final double mean;

	private final double i2s2;

	private final double norm;

	public Gaussian(double norm, double mean, double sigma) {
		if (sigma <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(sigma);
		}
		this.norm = norm;
		this.mean = mean;
		this.i2s2 = 1 / ((2 * sigma) * sigma);
	}

	public Gaussian(double mean, double sigma) {
		this((1 / (sigma * (org.apache.commons.math.util.FastMath.sqrt((2 * (java.lang.Math.PI)))))), mean, sigma);
	}

	public Gaussian() {
		this(0, 1);
	}

	public double value(double x) {
		return org.apache.commons.math.analysis.function.Gaussian.value((x - (mean)), norm, i2s2);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(double x) {
				final double diff = x - (mean);
				final double g = org.apache.commons.math.analysis.function.Gaussian.value(diff, norm, i2s2);
				if (g == 0) {
					return 0;
				}else {
					return (((-2) * diff) * (i2s2)) * g;
				}
			}
		};
	}

	public static class Parametric implements org.apache.commons.math.analysis.ParametricUnivariateRealFunction {
		public double value(double x, double[] param) {
			validateParameters(param);
			final double diff = x - (param[1]);
			final double i2s2 = 1 / ((2 * (param[2])) * (param[2]));
			return org.apache.commons.math.analysis.function.Gaussian.value(diff, param[0], i2s2);
		}

		public double[] gradient(double x, double[] param) {
			validateParameters(param);
			final double norm = param[0];
			final double diff = x - (param[1]);
			final double sigma = param[2];
			final double i2s2 = 1 / ((2 * sigma) * sigma);
			final double n = org.apache.commons.math.analysis.function.Gaussian.value(diff, 1, i2s2);
			final double m = (((norm * n) * 2) * i2s2) * diff;
			final double s = (m * diff) / sigma;
			return new double[]{ n , m , s };
		}

		private void validateParameters(double[] param) {
			if (param == null) {
				throw new org.apache.commons.math.exception.NullArgumentException();
			}
			if ((param.length) != 3) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(param.length, 3);
			}
			if ((param[2]) <= 0) {
				throw new org.apache.commons.math.exception.NotStrictlyPositiveException(param[2]);
			}
		}
	}

	private static double value(double xMinusMean, double norm, double i2s2) {
		return norm * (org.apache.commons.math.util.FastMath.exp((((-xMinusMean) * xMinusMean) * i2s2)));
	}
}

