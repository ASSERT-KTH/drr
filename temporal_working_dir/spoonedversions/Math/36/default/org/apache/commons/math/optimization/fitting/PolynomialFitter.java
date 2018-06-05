

package org.apache.commons.math.optimization.fitting;


public class PolynomialFitter extends org.apache.commons.math.optimization.fitting.CurveFitter {
	private final int degree;

	public PolynomialFitter(int degree, final org.apache.commons.math.optimization.DifferentiableMultivariateVectorOptimizer optimizer) {
		super(optimizer);
		this.degree = degree;
	}

	public double[] fit() {
		return fit(new org.apache.commons.math.analysis.polynomials.PolynomialFunction.Parametric(), new double[(degree) + 1]);
	}
}

