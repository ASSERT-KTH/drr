

package org.apache.commons.math3.analysis.function;


public class Gaussian implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	private final double mean;

	private final double is;

	private final double i2s2;

	private final double norm;

	public Gaussian(double norm, double mean, double sigma) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (sigma <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(sigma);
		}
		this.norm = norm;
		this.mean = mean;
		this.is = 1 / sigma;
		this.i2s2 = (0.5 * (is)) * (is);
	}

	public Gaussian(double mean, double sigma) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this((1 / (sigma * (org.apache.commons.math3.util.FastMath.sqrt((2 * (java.lang.Math.PI)))))), mean, sigma);
	}

	public Gaussian() {
		this(0, 1);
	}

	public double value(double x) {
		return org.apache.commons.math3.analysis.function.Gaussian.value((x - (mean)), norm, i2s2);
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.function.Gaussian.this).derivative();
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double value(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			final double diff = x - (param[1]);
			final double i2s2 = 1 / ((2 * (param[2])) * (param[2]));
			return org.apache.commons.math3.analysis.function.Gaussian.value(diff, param[0], i2s2);
		}

		public double[] gradient(double x, double... param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NullArgumentException {
			validateParameters(param);
			final double norm = param[0];
			final double diff = x - (param[1]);
			final double sigma = param[2];
			final double i2s2 = 1 / ((2 * sigma) * sigma);
			final double n = org.apache.commons.math3.analysis.function.Gaussian.value(diff, 1, i2s2);
			final double m = (((norm * n) * 2) * i2s2) * diff;
			final double s = (m * diff) / sigma;
			return new double[]{ n , m , s };
		}

		private void validateParameters(double[] param) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NullArgumentException {
			if (param == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			if ((param.length) != 3) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(param.length, 3);
			}
			if ((param[2]) <= 0) {
				throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(param[2]);
			}
		}
	}

	private static double value(double xMinusMean, double norm, double i2s2) {
		return norm * (org.apache.commons.math3.util.FastMath.exp((((-xMinusMean) * xMinusMean) * i2s2)));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		final double u = (is) * ((t.getValue()) - (mean));
		double[] f = new double[(t.getOrder()) + 1];
		final double[] p = new double[f.length];
		p[0] = 1;
		final double u2 = u * u;
		double coeff = (norm) * (org.apache.commons.math3.util.FastMath.exp(((-0.5) * u2)));
		if (coeff <= (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
			java.util.Arrays.fill(f, 0.0);
		}else {
			f[0] = coeff;
			for (int n = 1; n < (f.length); ++n) {
				double v = 0;
				p[n] = -(p[(n - 1)]);
				for (int k = n; k >= 0; k -= 2) {
					v = (v * u2) + (p[k]);
					if (k > 2) {
						p[(k - 2)] = ((k - 1) * (p[(k - 1)])) - (p[(k - 3)]);
					}else
						if (k == 2) {
							p[0] = p[1];
						}
					
				}
				if ((n & 1) == 1) {
					v *= u;
				}
				coeff *= is;
				f[n] = coeff * v;
			}
		}
		return t.compose(f);
	}
}

