

package org.apache.commons.math.analysis;


public class PolynomialSplineFunction implements java.io.Serializable , org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction {
	private static final long serialVersionUID = 7011031166416885789L;

	private double[] knots;

	private org.apache.commons.math.analysis.PolynomialFunction[] polynomials = null;

	private int n = 0;

	public PolynomialSplineFunction(double[] knots, org.apache.commons.math.analysis.PolynomialFunction[] polynomials) {
		if ((knots.length) < 2) {
			throw new java.lang.IllegalArgumentException("Not enough knot values -- spline partition must have at least 2 points.");
		}
		if (((knots.length) - 1) != (polynomials.length)) {
			throw new java.lang.IllegalArgumentException("Number of polynomial interpolants must match the number of segments.");
		}
		if (!(org.apache.commons.math.analysis.PolynomialSplineFunction.isStrictlyIncreasing(knots))) {
			throw new java.lang.IllegalArgumentException("Knot values must be strictly increasing.");
		}
		org.apache.commons.math.analysis.PolynomialSplineFunction.this.n = (knots.length) - 1;
		org.apache.commons.math.analysis.PolynomialSplineFunction.this.knots = new double[(n) + 1];
		java.lang.System.arraycopy(knots, 0, org.apache.commons.math.analysis.PolynomialSplineFunction.this.knots, 0, ((n) + 1));
		org.apache.commons.math.analysis.PolynomialSplineFunction.this.polynomials = new org.apache.commons.math.analysis.PolynomialFunction[n];
		java.lang.System.arraycopy(polynomials, 0, org.apache.commons.math.analysis.PolynomialSplineFunction.this.polynomials, 0, n);
	}

	public double value(double v) throws org.apache.commons.math.FunctionEvaluationException {
		if ((v < (knots[0])) || (v > (knots[n]))) {
			throw new org.apache.commons.math.FunctionEvaluationException(v, "Argument outside domain");
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

	public org.apache.commons.math.analysis.UnivariateRealFunction derivative() {
		return polynomialSplineDerivative();
	}

	public org.apache.commons.math.analysis.PolynomialSplineFunction polynomialSplineDerivative() {
		org.apache.commons.math.analysis.PolynomialFunction[] derivativePolynomials = new org.apache.commons.math.analysis.PolynomialFunction[n];
		for (int i = 0; i < (n); i++) {
			derivativePolynomials[i] = polynomials[i].polynomialDerivative();
		}
		return new org.apache.commons.math.analysis.PolynomialSplineFunction(knots, derivativePolynomials);
	}

	public int getN() {
		return n;
	}

	public org.apache.commons.math.analysis.PolynomialFunction[] getPolynomials() {
		org.apache.commons.math.analysis.PolynomialFunction[] p = new org.apache.commons.math.analysis.PolynomialFunction[n];
		java.lang.System.arraycopy(polynomials, 0, p, 0, n);
		return p;
	}

	public double[] getKnots() {
		double[] out = new double[(n) + 1];
		java.lang.System.arraycopy(knots, 0, out, 0, ((n) + 1));
		return out;
	}

	private static boolean isStrictlyIncreasing(double[] x) {
		for (int i = 1; i < (x.length); ++i) {
			if ((x[(i - 1)]) >= (x[i])) {
				return false;
			}
		}
		return true;
	}
}

