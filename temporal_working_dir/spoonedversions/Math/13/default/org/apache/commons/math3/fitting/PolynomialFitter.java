

package org.apache.commons.math3.fitting;


public class PolynomialFitter extends org.apache.commons.math3.fitting.CurveFitter<org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric> {
	public PolynomialFitter(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer) {
		super(optimizer);
	}

	public double[] fit(int maxEval, double[] guess) {
		return fit(maxEval, new org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric(), guess);
	}

	public double[] fit(double[] guess) {
		return fit(new org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric(), guess);
	}
}

