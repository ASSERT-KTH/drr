

package org.apache.commons.math3.analysis.polynomials;


public class PolynomialSplineFunction implements org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction {
	private final double[] knots;

	private final org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] polynomials;

	private final int n;

	public PolynomialSplineFunction(double[] knots, org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] polynomials) {
		if ((knots == null) || (polynomials == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((knots.length) < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_POINTS_IN_SPLINE_PARTITION, 2, knots.length, false);
		}
		if (((knots.length) - 1) != (polynomials.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(polynomials.length, knots.length);
		}
		org.apache.commons.math3.util.MathArrays.checkOrder(knots);
		this.n = (knots.length) - 1;
		this.knots = new double[(n) + 1];
		java.lang.System.arraycopy(knots, 0, org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.this.knots, 0, ((n) + 1));
		this.polynomials = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[n];
		java.lang.System.arraycopy(polynomials, 0, org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.this.polynomials, 0, n);
	}

	public double value(double v) {
		if ((v < (knots[0])) || (v > (knots[n]))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(v, knots[0], knots[n]);
		}
		int i = java.util.Arrays.binarySearch(knots, v);
		if (i < 0) {
			i = (-i) - 2;
		}
		if (i >= (polynomials.length)) {
			i--;
		}
		return polynomials[i].value((v - (knots[i])));
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return polynomialSplineDerivative();
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction polynomialSplineDerivative() {
		org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] derivativePolynomials = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[n];
		for (int i = 0; i < (n); i++) {
			derivativePolynomials[i] = polynomials[i].polynomialDerivative();
		}
		return new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction(knots, derivativePolynomials);
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
		final double t0 = t.getValue();
		if ((t0 < (knots[0])) || (t0 > (knots[n]))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(t0, knots[0], knots[n]);
		}
		int i = java.util.Arrays.binarySearch(knots, t0);
		if (i < 0) {
			i = (-i) - 2;
		}
		if (i >= (polynomials.length)) {
			i--;
		}
		return polynomials[i].value(t.subtract(knots[i]));
	}

	public int getN() {
		return n;
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] getPolynomials() {
		org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] p = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[n];
		java.lang.System.arraycopy(polynomials, 0, p, 0, n);
		return p;
	}

	public double[] getKnots() {
		double[] out = new double[(n) + 1];
		java.lang.System.arraycopy(knots, 0, out, 0, ((n) + 1));
		return out;
	}
}

