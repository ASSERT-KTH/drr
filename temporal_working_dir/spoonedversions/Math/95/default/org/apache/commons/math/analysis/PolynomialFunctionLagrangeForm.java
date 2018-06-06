

package org.apache.commons.math.analysis;


public class PolynomialFunctionLagrangeForm implements java.io.Serializable , org.apache.commons.math.analysis.UnivariateRealFunction {
	static final long serialVersionUID = -3965199246151093920L;

	private double[] coefficients;

	private double[] x;

	private double[] y;

	private boolean coefficientsComputed;

	PolynomialFunctionLagrangeForm(double[] x, double[] y) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y);
		org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.this.x = new double[x.length];
		org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.this.y = new double[y.length];
		java.lang.System.arraycopy(x, 0, org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.this.x, 0, x.length);
		java.lang.System.arraycopy(y, 0, org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.this.y, 0, y.length);
		coefficientsComputed = false;
	}

	public double value(double z) throws org.apache.commons.math.FunctionEvaluationException {
		try {
			return org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.evaluate(x, y, z);
		} catch (org.apache.commons.math.DuplicateSampleAbscissaException e) {
			throw new org.apache.commons.math.FunctionEvaluationException(z, e.getPattern(), e.getArguments(), e);
		}
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

	public static double evaluate(double[] x, double[] y, double z) throws java.lang.IllegalArgumentException, org.apache.commons.math.DuplicateSampleAbscissaException {
		int i;
		int j;
		int n;
		int nearest = 0;
		double value;
		double[] c;
		double[] d;
		double tc;
		double td;
		double divider;
		double w;
		double dist;
		double min_dist;
		org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y);
		n = x.length;
		c = new double[n];
		d = new double[n];
		min_dist = java.lang.Double.POSITIVE_INFINITY;
		for (i = 0; i < n; i++) {
			c[i] = y[i];
			d[i] = y[i];
			dist = java.lang.Math.abs((z - (x[i])));
			if (dist < min_dist) {
				nearest = i;
				min_dist = dist;
			}
		}
		value = y[nearest];
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				tc = (x[j]) - z;
				td = (x[(i + j)]) - z;
				divider = (x[j]) - (x[(i + j)]);
				if (divider == 0.0) {
					throw new org.apache.commons.math.DuplicateSampleAbscissaException(x[i], i, (i + j));
				}
				w = ((c[(j + 1)]) - (d[j])) / divider;
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

	protected void computeCoefficients() throws java.lang.ArithmeticException {
		int i;
		int j;
		int n;
		double[] c;
		double[] tc;
		double d;
		double t;
		n = (degree()) + 1;
		coefficients = new double[n];
		for (i = 0; i < n; i++) {
			coefficients[i] = 0.0;
		}
		c = new double[n + 1];
		c[0] = 1.0;
		for (i = 0; i < n; i++) {
			for (j = i; j > 0; j--) {
				c[j] = (c[(j - 1)]) - ((c[j]) * (x[i]));
			}
			c[0] *= -(x[i]);
			c[(i + 1)] = 1;
		}
		tc = new double[n];
		for (i = 0; i < n; i++) {
			d = 1;
			for (j = 0; j < n; j++) {
				if (i != j) {
					d *= (x[i]) - (x[j]);
				}
			}
			if (d == 0.0) {
				throw new java.lang.ArithmeticException("Identical abscissas cause division by zero.");
			}
			t = (y[i]) / d;
			tc[(n - 1)] = c[n];
			coefficients[(n - 1)] += t * (tc[(n - 1)]);
			for (j = n - 2; j >= 0; j--) {
				tc[j] = (c[(j + 1)]) + ((tc[(j + 1)]) * (x[i]));
				coefficients[j] += t * (tc[j]);
			}
		}
		coefficientsComputed = true;
	}

	protected static void verifyInterpolationArray(double[] x, double[] y) throws java.lang.IllegalArgumentException {
		if (((x.length) < 2) || ((y.length) < 2)) {
			throw new java.lang.IllegalArgumentException("Interpolation requires at least two points.");
		}
		if ((x.length) != (y.length)) {
			throw new java.lang.IllegalArgumentException("Abscissa and value arrays must have the same length.");
		}
	}
}

