

package org.apache.commons.math.analysis.polynomials;


public class PolynomialFunctionLagrangeForm implements org.apache.commons.math.analysis.UnivariateFunction {
	private double[] coefficients;

	private final double[] x;

	private final double[] y;

	private boolean coefficientsComputed;

	public PolynomialFunctionLagrangeForm(double[] x, double[] y) {
		this.x = new double[x.length];
		this.y = new double[y.length];
		java.lang.System.arraycopy(x, 0, org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.x, 0, x.length);
		java.lang.System.arraycopy(y, 0, org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.y, 0, y.length);
		coefficientsComputed = false;
		if (!(org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y, false))) {
			org.apache.commons.math.util.MathArrays.sortInPlace(org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.x, org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.y);
			org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.x, org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.this.y, true);
		}
	}

	public double value(double z) {
		return org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluateInternal(x, y, z);
	}

	public int degree() {
		return (x.length) - 1;
	}

	public double[] getInterpolatingPoints() {
		double[] out = new double[x.length];
		java.lang.System.arraycopy(x, 0, out, 0, x.length);
		return out;
	}

	public double[] getInterpolatingValues() {
		double[] out = new double[y.length];
		java.lang.System.arraycopy(y, 0, out, 0, y.length);
		return out;
	}

	public double[] getCoefficients() {
		if (!(coefficientsComputed)) {
			computeCoefficients();
		}
		double[] out = new double[coefficients.length];
		java.lang.System.arraycopy(coefficients, 0, out, 0, coefficients.length);
		return out;
	}

	public static double evaluate(double[] x, double[] y, double z) {
		if (org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y, false)) {
			return org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluateInternal(x, y, z);
		}
		final double[] xNew = new double[x.length];
		final double[] yNew = new double[y.length];
		java.lang.System.arraycopy(x, 0, xNew, 0, x.length);
		java.lang.System.arraycopy(y, 0, yNew, 0, y.length);
		org.apache.commons.math.util.MathArrays.sortInPlace(xNew, yNew);
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(xNew, yNew, true);
		return org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluateInternal(xNew, yNew, z);
	}

	private static double evaluateInternal(double[] x, double[] y, double z) {
		int nearest = 0;
		final int n = x.length;
		final double[] c = new double[n];
		final double[] d = new double[n];
		double min_dist = java.lang.Double.POSITIVE_INFINITY;
		for (int i = 0; i < n; i++) {
			c[i] = y[i];
			d[i] = y[i];
			final double dist = org.apache.commons.math.util.FastMath.abs((z - (x[i])));
			if (dist < min_dist) {
				nearest = i;
				min_dist = dist;
			}
		}
		double value = y[nearest];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				final double tc = (x[j]) - z;
				final double td = (x[(i + j)]) - z;
				final double divider = (x[j]) - (x[(i + j)]);
				final double w = ((c[(j + 1)]) - (d[j])) / divider;
				c[j] = tc * w;
				d[j] = td * w;
			}
			if (nearest < (0.5 * ((n - i) + 1))) {
				value += c[nearest];
			}else {
				nearest--;
				value += d[nearest];
			}
		}
		return value;
	}

	protected void computeCoefficients() {
		final int n = (degree()) + 1;
		coefficients = new double[n];
		for (int i = 0; i < n; i++) {
			coefficients[i] = 0.0;
		}
		final double[] c = new double[n + 1];
		c[0] = 1.0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				c[j] = (c[(j - 1)]) - ((c[j]) * (x[i]));
			}
			c[0] *= -(x[i]);
			c[(i + 1)] = 1;
		}
		final double[] tc = new double[n];
		for (int i = 0; i < n; i++) {
			double d = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					d *= (x[i]) - (x[j]);
				}
			}
			final double t = (y[i]) / d;
			tc[(n - 1)] = c[n];
			coefficients[(n - 1)] += t * (tc[(n - 1)]);
			for (int j = n - 2; j >= 0; j--) {
				tc[j] = (c[(j + 1)]) + ((tc[(j + 1)]) * (x[i]));
				coefficients[j] += t * (tc[j]);
			}
		}
		coefficientsComputed = true;
	}

	public static boolean verifyInterpolationArray(double[] x, double[] y, boolean abort) {
		if ((x.length) != (y.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(x.length, y.length);
		}
		if ((x.length) < 2) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS, 2, x.length, true);
		}
		return org.apache.commons.math.util.MathArrays.checkOrder(x, org.apache.commons.math.util.MathArrays.OrderDirection.INCREASING, true, abort);
	}
}

