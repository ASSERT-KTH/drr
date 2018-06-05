

package org.apache.commons.math.analysis.polynomials;


public class PolynomialFunctionNewtonForm implements org.apache.commons.math.analysis.UnivariateRealFunction {
	private double[] coefficients;

	private final double[] c;

	private final double[] a;

	private boolean coefficientsComputed;

	public PolynomialFunctionNewtonForm(double[] a, double[] c) {
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(a, c);
		this.a = new double[a.length];
		this.c = new double[c.length];
		java.lang.System.arraycopy(a, 0, org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.this.a, 0, a.length);
		java.lang.System.arraycopy(c, 0, org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.this.c, 0, c.length);
		coefficientsComputed = false;
	}

	public double value(double z) {
		return org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.evaluate(a, c, z);
	}

	public int degree() {
		return c.length;
	}

	public double[] getNewtonCoefficients() {
		double[] out = new double[a.length];
		java.lang.System.arraycopy(a, 0, out, 0, a.length);
		return out;
	}

	public double[] getCenters() {
		double[] out = new double[c.length];
		java.lang.System.arraycopy(c, 0, out, 0, c.length);
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

	public static double evaluate(double[] a, double[] c, double z) {
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(a, c);
		final int n = c.length;
		double value = a[n];
		for (int i = n - 1; i >= 0; i--) {
			value = (a[i]) + ((z - (c[i])) * value);
		}
		return value;
	}

	protected void computeCoefficients() {
		final int n = degree();
		coefficients = new double[n + 1];
		for (int i = 0; i <= n; i++) {
			coefficients[i] = 0.0;
		}
		coefficients[0] = a[n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - i; j > 0; j--) {
				coefficients[j] = (coefficients[(j - 1)]) - ((c[i]) * (coefficients[j]));
			}
			coefficients[0] = (a[i]) - ((c[i]) * (coefficients[0]));
		}
		coefficientsComputed = true;
	}

	protected static void verifyInputArray(double[] a, double[] c) {
		if (((a.length) == 0) || ((c.length) == 0)) {
			throw new org.apache.commons.math.exception.NoDataException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
		}
		if ((a.length) != ((c.length) + 1)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(org.apache.commons.math.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1, a.length, c.length);
		}
	}
}

