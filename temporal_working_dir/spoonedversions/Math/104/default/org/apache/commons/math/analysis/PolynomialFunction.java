

package org.apache.commons.math.analysis;


public class PolynomialFunction implements java.io.Serializable , org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private static final long serialVersionUID = 3322454535052136809L;

	private double[] coefficients;

	public PolynomialFunction(double[] c) {
		super();
		if ((c.length) < 1) {
			throw new java.lang.IllegalArgumentException("Polynomial coefficient array must have postive length.");
		}
		org.apache.commons.math.analysis.PolynomialFunction.this.coefficients = new double[c.length];
		java.lang.System.arraycopy(c, 0, org.apache.commons.math.analysis.PolynomialFunction.this.coefficients, 0, c.length);
	}

	public double value(double x) {
		return org.apache.commons.math.analysis.PolynomialFunction.evaluate(coefficients, x);
	}

	public int degree() {
		return (coefficients.length) - 1;
	}

	public double[] getCoefficients() {
		double[] out = new double[coefficients.length];
		java.lang.System.arraycopy(coefficients, 0, out, 0, coefficients.length);
		return out;
	}

	protected static double evaluate(double[] coefficients, double argument) {
		int n = coefficients.length;
		if (n < 1) {
			throw new java.lang.IllegalArgumentException("Coefficient array must have positive length for evaluation");
		}
		double result = coefficients[(n - 1)];
		for (int j = n - 2; j >= 0; j--) {
			result = (argument * result) + (coefficients[j]);
		}
		return result;
	}

	protected static double[] differentiate(double[] coefficients) {
		int n = coefficients.length;
		if (n < 1) {
			throw new java.lang.IllegalArgumentException("Coefficient array must have positive length for differentiation");
		}
		if (n == 1) {
			return new double[]{ 0 };
		}
		double[] result = new double[n - 1];
		for (int i = n - 1; i > 0; i--) {
			result[(i - 1)] = ((double) (i)) * (coefficients[i]);
		}
		return result;
	}

	public org.apache.commons.math.analysis.PolynomialFunction polynomialDerivative() {
		return new org.apache.commons.math.analysis.PolynomialFunction(org.apache.commons.math.analysis.PolynomialFunction.differentiate(coefficients));
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return polynomialDerivative();
	}
}

