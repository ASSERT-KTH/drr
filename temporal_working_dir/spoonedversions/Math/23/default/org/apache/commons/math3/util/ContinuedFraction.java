

package org.apache.commons.math3.util;


public abstract class ContinuedFraction {
	private static final double DEFAULT_EPSILON = 1.0E-8;

	protected ContinuedFraction() {
		super();
	}

	protected abstract double getA(int n, double x);

	protected abstract double getB(int n, double x);

	public double evaluate(double x) throws org.apache.commons.math3.exception.ConvergenceException {
		try {
			return evaluate(x, org.apache.commons.math3.util.ContinuedFraction.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.MathInternalError(e);
		}
	}

	public double evaluate(double x, double epsilon) throws org.apache.commons.math3.exception.ConvergenceException {
		try {
			return evaluate(x, epsilon, java.lang.Integer.MAX_VALUE);
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.MathInternalError(e);
		}
	}

	public double evaluate(double x, int maxIterations) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.MaxCountExceededException {
		return evaluate(x, org.apache.commons.math3.util.ContinuedFraction.DEFAULT_EPSILON, maxIterations);
	}

	public double evaluate(double x, double epsilon, int maxIterations) throws org.apache.commons.math3.exception.ConvergenceException, org.apache.commons.math3.exception.MaxCountExceededException {
		final double small = 1.0E-50;
		double hPrev = getA(0, x);
		if (org.apache.commons.math3.util.Precision.equals(hPrev, 0.0, small)) {
			hPrev = small;
		}
		int n = 1;
		double dPrev = 0.0;
		double cPrev = hPrev;
		double hN = hPrev;
		while (n < maxIterations) {
			final double a = getA(n, x);
			final double b = getB(n, x);
			double dN = a + (b * dPrev);
			if (org.apache.commons.math3.util.Precision.equals(dN, 0.0, small)) {
				dN = small;
			}
			double cN = a + (b / cPrev);
			if (org.apache.commons.math3.util.Precision.equals(cN, 0.0, small)) {
				cN = small;
			}
			dN = 1 / dN;
			final double deltaN = cN * dN;
			hN = hPrev * deltaN;
			if (java.lang.Double.isInfinite(hN)) {
				throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE, x);
			}
			if (java.lang.Double.isNaN(hN)) {
				throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE, x);
			}
			if ((org.apache.commons.math3.util.FastMath.abs((deltaN - 1.0))) < epsilon) {
				break;
			}
			dPrev = dN;
			cPrev = cN;
			hPrev = hN;
			n++;
		} 
		if (n >= maxIterations) {
			throw new org.apache.commons.math3.exception.MaxCountExceededException(org.apache.commons.math3.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION, maxIterations, x);
		}
		return hN;
	}
}

