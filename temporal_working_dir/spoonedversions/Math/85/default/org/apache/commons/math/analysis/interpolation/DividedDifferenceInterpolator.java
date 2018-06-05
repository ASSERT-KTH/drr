

package org.apache.commons.math.analysis.interpolation;


public class DividedDifferenceInterpolator implements java.io.Serializable , org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator {
	private static final long serialVersionUID = 107049519551235069L;

	public org.apache.commons.math.analysis.UnivariateRealFunction interpolate(double[] x, double[] y) throws org.apache.commons.math.DuplicateSampleAbscissaException {
		double[] a;
		double[] c;
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y);
		c = new double[(x.length) - 1];
		for (int i = 0; i < (c.length); i++) {
			c[i] = x[i];
		}
		a = org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolator.computeDividedDifference(x, y);
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm p;
		p = new org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm(a, c);
		return p;
	}

	protected static double[] computeDividedDifference(double[] x, double[] y) throws org.apache.commons.math.DuplicateSampleAbscissaException {
		int i;
		int j;
		int n;
		double[] divdiff;
		double[] a;
		double denominator;
		org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y);
		n = x.length;
		divdiff = new double[n];
		for (i = 0; i < n; i++) {
			divdiff[i] = y[i];
		}
		a = new double[n];
		a[0] = divdiff[0];
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				denominator = (x[(j + i)]) - (x[j]);
				if (denominator == 0.0) {
					throw new org.apache.commons.math.DuplicateSampleAbscissaException(x[j], j, (j + i));
				}
				divdiff[j] = ((divdiff[(j + 1)]) - (divdiff[j])) / denominator;
			}
			a[i] = divdiff[0];
		}
		return a;
	}
}

