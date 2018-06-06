

package org.apache.commons.math.optimization.fitting;


public class PolynomialFitter {
	private final org.apache.commons.math.optimization.fitting.CurveFitter fitter;

	private final int degree;

	public PolynomialFitter(int degree, final org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer optimizer) {
		this.fitter = new org.apache.commons.math.optimization.fitting.CurveFitter(optimizer);
		this.degree = degree;
	}

	public void addObservedPoint(double weight, double x, double y) {
		fitter.addObservedPoint(weight, x, y);
	}

	public void clearObservations() {
		fitter.clearObservations();
	}

	public org.apache.commons.math.analysis.polynomials.PolynomialFunction fit() {
		return new org.apache.commons.math.analysis.polynomials.PolynomialFunction(fitter.fit(new org.apache.commons.math.optimization.fitting.PolynomialFitter.ParametricPolynomial(), new double[(degree) + 1]));
	}

	private static class ParametricPolynomial implements org.apache.commons.math.optimization.fitting.ParametricRealFunction {
		public double[] gradient(double x, double[] parameters) {
			final double[] gradient = new double[parameters.length];
			double xn = 1.0;
			for (int i = 0; i < (parameters.length); ++i) {
				gradient[i] = xn;
				xn *= x;
			}
			return gradient;
		}

		public double value(final double x, final double[] parameters) {
			double y = 0;
			for (int i = (parameters.length) - 1; i >= 0; --i) {
				y = (y * x) + (parameters[i]);
			}
			return y;
		}
	}
}

