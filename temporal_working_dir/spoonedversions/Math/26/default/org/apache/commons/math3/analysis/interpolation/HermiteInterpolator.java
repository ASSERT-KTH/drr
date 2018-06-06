

package org.apache.commons.math3.analysis.interpolation;


public class HermiteInterpolator implements org.apache.commons.math3.analysis.DifferentiableUnivariateVectorFunction {
	private final java.util.List<java.lang.Double> abscissae;

	private final java.util.List<double[]> topDiagonal;

	private final java.util.List<double[]> bottomDiagonal;

	public HermiteInterpolator() {
		this.abscissae = new java.util.ArrayList<java.lang.Double>();
		this.topDiagonal = new java.util.ArrayList<double[]>();
		this.bottomDiagonal = new java.util.ArrayList<double[]>();
	}

	public void addSamplePoint(final double x, final double[]... value) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		for (int i = 0; i < (value.length); ++i) {
			final double[] y = value[i].clone();
			if (i > 1) {
				double inv = 1.0 / (org.apache.commons.math3.util.ArithmeticUtils.factorial(i));
				for (int j = 0; j < (y.length); ++j) {
					y[j] *= inv;
				}
			}
			final int n = abscissae.size();
			bottomDiagonal.add((n - i), y);
			double[] bottom0 = y;
			for (int j = i; j < n; ++j) {
				final double[] bottom1 = bottomDiagonal.get((n - (j + 1)));
				final double inv = 1.0 / (x - (abscissae.get((n - (j + 1)))));
				if (java.lang.Double.isInfinite(inv)) {
					throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DUPLICATED_ABSCISSA_DIVISION_BY_ZERO, x);
				}
				for (int k = 0; k < (y.length); ++k) {
					bottom1[k] = inv * ((bottom0[k]) - (bottom1[k]));
				}
				bottom0 = bottom1;
			}
			topDiagonal.add(bottom0.clone());
			abscissae.add(x);
		}
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] getPolynomials() throws org.apache.commons.math3.exception.MathIllegalStateException {
		checkInterpolation();
		final org.apache.commons.math3.analysis.polynomials.PolynomialFunction zero = polynomial(0);
		org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] polynomials = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[topDiagonal.get(0).length];
		for (int i = 0; i < (polynomials.length); ++i) {
			polynomials[i] = zero;
		}
		org.apache.commons.math3.analysis.polynomials.PolynomialFunction coeff = polynomial(1);
		for (int i = 0; i < (topDiagonal.size()); ++i) {
			double[] tdi = topDiagonal.get(i);
			for (int k = 0; k < (polynomials.length); ++k) {
				polynomials[k] = polynomials[k].add(coeff.multiply(polynomial(tdi[k])));
			}
			coeff = coeff.multiply(polynomial((-(abscissae.get(i))), 1.0));
		}
		return polynomials;
	}

	public double[] value(double x) throws org.apache.commons.math3.exception.MathIllegalStateException {
		checkInterpolation();
		final double[] value = new double[topDiagonal.get(0).length];
		double valueCoeff = 1;
		for (int i = 0; i < (topDiagonal.size()); ++i) {
			double[] dividedDifference = topDiagonal.get(i);
			for (int k = 0; k < (value.length); ++k) {
				value[k] += (dividedDifference[k]) * valueCoeff;
			}
			final double deltaX = x - (abscissae.get(i));
			valueCoeff *= deltaX;
		}
		return value;
	}

	public double[] derivative(double x) throws org.apache.commons.math3.exception.MathIllegalStateException {
		checkInterpolation();
		final double[] derivative = new double[topDiagonal.get(0).length];
		double valueCoeff = 1;
		double derivativeCoeff = 0;
		for (int i = 0; i < (topDiagonal.size()); ++i) {
			double[] dividedDifference = topDiagonal.get(i);
			for (int k = 0; k < (derivative.length); ++k) {
				derivative[k] += (dividedDifference[k]) * derivativeCoeff;
			}
			final double deltaX = x - (abscissae.get(i));
			derivativeCoeff = valueCoeff + (derivativeCoeff * deltaX);
			valueCoeff *= deltaX;
		}
		return derivative;
	}

	public org.apache.commons.math3.analysis.UnivariateVectorFunction derivative() {
		return new org.apache.commons.math3.analysis.UnivariateVectorFunction() {
			public double[] value(double x) {
				return derivative(x);
			}
		};
	}

	private void checkInterpolation() throws org.apache.commons.math3.exception.MathIllegalStateException {
		if (abscissae.isEmpty()) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_INTERPOLATION_SAMPLE);
		}
	}

	private org.apache.commons.math3.analysis.polynomials.PolynomialFunction polynomial(double... c) {
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(c);
	}
}

