

package org.apache.commons.math3.optimization.fitting;


public class PolynomialFitter extends org.apache.commons.math3.optimization.fitting.CurveFitter {
	private final int degree;

	public PolynomialFitter(int degree, final org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer) {
		super(optimizer);
		this.degree = degree;
	}

	public double[] fit() {
		return fit(new org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric(), new double[(degree) + 1]);
	}
}

