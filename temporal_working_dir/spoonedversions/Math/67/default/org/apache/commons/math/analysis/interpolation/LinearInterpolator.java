

package org.apache.commons.math.analysis.interpolation;


public class LinearInterpolator implements org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator {
	public org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction interpolate(double[] x, double[] y) {
		if ((x.length) != (y.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(x.length, y.length);
		}
		if ((x.length) < 2) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.util.LocalizedFormats.NUMBER_OF_POINTS, x.length, 2, true);
		}
		int n = (x.length) - 1;
		org.apache.commons.math.util.MathUtils.checkOrder(x);
		final double[] m = new double[n];
		for (int i = 0; i < n; i++) {
			m[i] = ((y[(i + 1)]) - (y[i])) / ((x[(i + 1)]) - (x[i]));
		}
		org.apache.commons.math.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[n];
		final double[] coefficients = new double[2];
		for (int i = 0; i < n; i++) {
			coefficients[0] = y[i];
			coefficients[1] = m[i];
			polynomials[i] = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(coefficients);
		}
		return new org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction(x, polynomials);
	}
}

