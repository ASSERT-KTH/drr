

package org.apache.commons.math3.util;


public abstract class ContinuedFraction {
	private static final double DEFAULT_EPSILON = 1.0E-8;

	protected ContinuedFraction() {
		super();
	}

	protected abstract double getA(int n, double x);

	protected abstract double getB(int n, double x);

	public double evaluate(double x) {
		return evaluate(x, org.apache.commons.math3.util.ContinuedFraction.DEFAULT_EPSILON, java.lang.Integer.MAX_VALUE);
	}

	public double evaluate(double x, double epsilon) {
		return evaluate(x, epsilon, java.lang.Integer.MAX_VALUE);
	}

	public double evaluate(double x, int maxIterations) {
		return evaluate(x, org.apache.commons.math3.util.ContinuedFraction.DEFAULT_EPSILON, maxIterations);
	}

	public double evaluate(double x, double epsilon, int maxIterations) {
		final double small = 1.0E-50;
		double hPrev = getA(0, x);
		if (org.apache.commons.math3.util.Precision.equals(hPrev, 0.0, small)) {
			hPrev = small;
		}
		int n = 1;
		double dPrev = 0.0;
		double p0 = 1.0;
		double q1 = 1.0;
		double cPrev = hPrev;
		double hN = hPrev;
		while (n < maxIterations) {
			final double a = getA(n, x);
			final double b = getB(n, x);
			double cN = (a * hPrev) + (b * p0);
			double q2 = (a * q1) + (b * dPrev);
			if ((java.lang.Double.isInfinite(cN)) || (java.lang.Double.isInfinite(q2))) {
				double scaleFactor = 1.0;
				double lastScaleFactor = 1.0;
				final int maxPower = 5;
				final double scale = org.apache.commons.math3.util.FastMath.max(a, b);
				if (scale <= 0) {
					throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE, x);
				}
				for (int i = 0; i < maxPower; i++) {
					lastScaleFactor = scaleFactor;
					scaleFactor *= scale;
					if ((a != 0.0) && (a > b)) {
						cN = (hPrev / lastScaleFactor) + ((b / scaleFactor) * p0);
						q2 = (q1 / lastScaleFactor) + ((b / scaleFactor) * dPrev);
					}else
						if (b != 0) {
							cN = ((a / scaleFactor) * hPrev) + (p0 / lastScaleFactor);
							q2 = ((a / scaleFactor) * q1) + (dPrev / lastScaleFactor);
						}
					
					if (!((java.lang.Double.isInfinite(cN)) || (java.lang.Double.isInfinite(q2)))) {
						break;
					}
				}
			}
			final double deltaN = (cN / q2) / cPrev;
			hN = cPrev * deltaN;
			if (java.lang.Double.isInfinite(hN)) {
				throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE, x);
			}
			if (java.lang.Double.isNaN(hN)) {
				throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE, x);
			}
			if ((org.apache.commons.math3.util.FastMath.abs((deltaN - 1.0))) < epsilon) {
				break;
			}
			dPrev = q1;
			cPrev = cN / q2;
			p0 = hPrev;
			hPrev = cN;
			q1 = q2;
			n++;
		} 
		if (n >= maxIterations) {
			throw new org.apache.commons.math3.exception.MaxCountExceededException(org.apache.commons.math3.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION, maxIterations, x);
		}
		return hN;
	}
}

