

package org.apache.commons.math3.analysis.polynomials;


public class PolynomialFunction implements java.io.Serializable , org.apache.commons.math3.analysis.DifferentiableUnivariateFunction , org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable {
	private static final long serialVersionUID = -7726511984200295583L;

	private final double[] coefficients;

	public PolynomialFunction(double[] c) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		super();
		org.apache.commons.math3.util.MathUtils.checkNotNull(c);
		int n = c.length;
		if (n == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
		}
		while ((n > 1) && ((c[(n - 1)]) == 0)) {
			--n;
		} 
		this.coefficients = new double[n];
		java.lang.System.arraycopy(c, 0, org.apache.commons.math3.analysis.polynomials.PolynomialFunction.this.coefficients, 0, n);
	}

	public double value(double x) {
		return org.apache.commons.math3.analysis.polynomials.PolynomialFunction.evaluate(coefficients, x);
	}

	public int degree() {
		return (coefficients.length) - 1;
	}

	public double[] getCoefficients() {
		return coefficients.clone();
	}

	protected static double evaluate(double[] coefficients, double argument) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(coefficients);
		int n = coefficients.length;
		if (n == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
		}
		double result = coefficients[(n - 1)];
		for (int j = n - 2; j >= 0; j--) {
			result = (argument * result) + (coefficients[j]);
		}
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(coefficients);
		int n = coefficients.length;
		if (n == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
		}
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(t.getFreeParameters(), t.getOrder(), coefficients[(n - 1)]);
		for (int j = n - 2; j >= 0; j--) {
			result = result.multiply(t).add(coefficients[j]);
		}
		return result;
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction add(final org.apache.commons.math3.analysis.polynomials.PolynomialFunction p) {
		final int lowLength = org.apache.commons.math3.util.FastMath.min(coefficients.length, p.coefficients.length);
		final int highLength = org.apache.commons.math3.util.FastMath.max(coefficients.length, p.coefficients.length);
		double[] newCoefficients = new double[highLength];
		for (int i = 0; i < lowLength; ++i) {
			newCoefficients[i] = (coefficients[i]) + (p.coefficients[i]);
		}
		java.lang.System.arraycopy(((coefficients.length) < (p.coefficients.length) ? p.coefficients : coefficients), lowLength, newCoefficients, lowLength, (highLength - lowLength));
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(newCoefficients);
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction subtract(final org.apache.commons.math3.analysis.polynomials.PolynomialFunction p) {
		int lowLength = org.apache.commons.math3.util.FastMath.min(coefficients.length, p.coefficients.length);
		int highLength = org.apache.commons.math3.util.FastMath.max(coefficients.length, p.coefficients.length);
		double[] newCoefficients = new double[highLength];
		for (int i = 0; i < lowLength; ++i) {
			newCoefficients[i] = (coefficients[i]) - (p.coefficients[i]);
		}
		if ((coefficients.length) < (p.coefficients.length)) {
			for (int i = lowLength; i < highLength; ++i) {
				newCoefficients[i] = -(p.coefficients[i]);
			}
		}else {
			java.lang.System.arraycopy(coefficients, lowLength, newCoefficients, lowLength, (highLength - lowLength));
		}
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(newCoefficients);
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction negate() {
		double[] newCoefficients = new double[coefficients.length];
		for (int i = 0; i < (coefficients.length); ++i) {
			newCoefficients[i] = -(coefficients[i]);
		}
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(newCoefficients);
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction multiply(final org.apache.commons.math3.analysis.polynomials.PolynomialFunction p) {
		double[] newCoefficients = new double[((coefficients.length) + (p.coefficients.length)) - 1];
		for (int i = 0; i < (newCoefficients.length); ++i) {
			newCoefficients[i] = 0.0;
			for (int j = org.apache.commons.math3.util.FastMath.max(0, ((i + 1) - (p.coefficients.length))); j < (org.apache.commons.math3.util.FastMath.min(coefficients.length, (i + 1))); ++j) {
				newCoefficients[i] += (coefficients[j]) * (p.coefficients[(i - j)]);
			}
		}
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(newCoefficients);
	}

	protected static double[] differentiate(double[] coefficients) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(coefficients);
		int n = coefficients.length;
		if (n == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
		}
		if (n == 1) {
			return new double[]{ 0 };
		}
		double[] result = new double[n - 1];
		for (int i = n - 1; i > 0; i--) {
			result[(i - 1)] = i * (coefficients[i]);
		}
		return result;
	}

	public org.apache.commons.math3.analysis.polynomials.PolynomialFunction polynomialDerivative() {
		return new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(org.apache.commons.math3.analysis.polynomials.PolynomialFunction.differentiate(coefficients));
	}

	public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
		return polynomialDerivative();
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder s = new java.lang.StringBuilder();
		if ((coefficients[0]) == 0.0) {
			if ((coefficients.length) == 1) {
				return "0";
			}
		}else {
			s.append(org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString(coefficients[0]));
		}
		for (int i = 1; i < (coefficients.length); ++i) {
			if ((coefficients[i]) != 0) {
				if ((s.length()) > 0) {
					if ((coefficients[i]) < 0) {
						s.append(" - ");
					}else {
						s.append(" + ");
					}
				}else {
					if ((coefficients[i]) < 0) {
						s.append("-");
					}
				}
				double absAi = org.apache.commons.math3.util.FastMath.abs(coefficients[i]);
				if ((absAi - 1) != 0) {
					s.append(org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString(absAi));
					s.append(' ');
				}
				s.append("x");
				if (i > 1) {
					s.append('^');
					s.append(java.lang.Integer.toString(i));
				}
			}
		}
		return s.toString();
	}

	private static java.lang.String toString(double coeff) {
		final java.lang.String c = java.lang.Double.toString(coeff);
		if (c.endsWith(".0")) {
			return c.substring(0, ((c.length()) - 2));
		}else {
			return c;
		}
	}

	@java.lang.Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + (java.util.Arrays.hashCode(coefficients));
		return result;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((org.apache.commons.math3.analysis.polynomials.PolynomialFunction.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.apache.commons.math3.analysis.polynomials.PolynomialFunction)) {
			return false;
		}
		org.apache.commons.math3.analysis.polynomials.PolynomialFunction other = ((org.apache.commons.math3.analysis.polynomials.PolynomialFunction) (obj));
		if (!(java.util.Arrays.equals(coefficients, other.coefficients))) {
			return false;
		}
		return true;
	}

	public static class Parametric implements org.apache.commons.math3.analysis.ParametricUnivariateFunction {
		public double[] gradient(double x, double... parameters) {
			final double[] gradient = new double[parameters.length];
			double xn = 1.0;
			for (int i = 0; i < (parameters.length); ++i) {
				gradient[i] = xn;
				xn *= x;
			}
			return gradient;
		}

		public double value(final double x, final double... parameters) {
			return org.apache.commons.math3.analysis.polynomials.PolynomialFunction.evaluate(parameters, x);
		}
	}
}

