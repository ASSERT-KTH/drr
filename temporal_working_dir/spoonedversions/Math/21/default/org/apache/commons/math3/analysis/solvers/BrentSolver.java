

package org.apache.commons.math3.analysis.solvers;


public class BrentSolver extends org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public BrentSolver() {
		this(org.apache.commons.math3.analysis.solvers.BrentSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public BrentSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public BrentSolver(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	public BrentSolver(double relativeAccuracy, double absoluteAccuracy, double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	@java.lang.Override
	protected double doSolve() throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		double min = getMin();
		double max = getMax();
		final double initial = getStartValue();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		verifySequence(min, initial, max);
		double yInitial = computeObjectiveValue(initial);
		if ((org.apache.commons.math3.util.FastMath.abs(yInitial)) <= functionValueAccuracy) {
			return initial;
		}
		double yMin = computeObjectiveValue(min);
		if ((org.apache.commons.math3.util.FastMath.abs(yMin)) <= functionValueAccuracy) {
			return min;
		}
		if ((yInitial * yMin) < 0) {
			return brent(min, initial, yMin, yInitial);
		}
		double yMax = computeObjectiveValue(max);
		if ((org.apache.commons.math3.util.FastMath.abs(yMax)) <= functionValueAccuracy) {
			return max;
		}
		if ((yInitial * yMax) < 0) {
			return brent(initial, max, yInitial, yMax);
		}
		throw new org.apache.commons.math3.exception.NoBracketingException(min, max, yMin, yMax);
	}

	private double brent(double lo, double hi, double fLo, double fHi) {
		double a = lo;
		double fa = fLo;
		double b = hi;
		double fb = fHi;
		double c = a;
		double fc = fa;
		double d = b - a;
		double e = d;
		final double t = getAbsoluteAccuracy();
		final double eps = getRelativeAccuracy();
		while (true) {
			if ((org.apache.commons.math3.util.FastMath.abs(fc)) < (org.apache.commons.math3.util.FastMath.abs(fb))) {
				a = b;
				b = c;
				c = a;
				fa = fb;
				fb = fc;
				fc = fa;
			}
			final double tol = ((2 * eps) * (org.apache.commons.math3.util.FastMath.abs(b))) + t;
			final double m = 0.5 * (c - b);
			if (((org.apache.commons.math3.util.FastMath.abs(m)) <= tol) || (org.apache.commons.math3.util.Precision.equals(fb, 0))) {
				return b;
			}
			if (((org.apache.commons.math3.util.FastMath.abs(e)) < tol) || ((org.apache.commons.math3.util.FastMath.abs(fa)) <= (org.apache.commons.math3.util.FastMath.abs(fb)))) {
				d = m;
				e = d;
			}else {
				double s = fb / fa;
				double p;
				double q;
				if (a == c) {
					p = (2 * m) * s;
					q = 1 - s;
				}else {
					q = fa / fc;
					final double r = fb / fc;
					p = s * ((((2 * m) * q) * (q - r)) - ((b - a) * (r - 1)));
					q = ((q - 1) * (r - 1)) * (s - 1);
				}
				if (p > 0) {
					q = -q;
				}else {
					p = -p;
				}
				s = e;
				e = d;
				if ((p >= (((1.5 * m) * q) - (org.apache.commons.math3.util.FastMath.abs((tol * q))))) || (p >= (org.apache.commons.math3.util.FastMath.abs(((0.5 * s) * q))))) {
					d = m;
					e = d;
				}else {
					d = p / q;
				}
			}
			a = b;
			fa = fb;
			if ((org.apache.commons.math3.util.FastMath.abs(d)) > tol) {
				b += d;
			}else
				if (m > 0) {
					b += tol;
				}else {
					b -= tol;
				}
			
			fb = computeObjectiveValue(b);
			if (((fb > 0) && (fc > 0)) || ((fb <= 0) && (fc <= 0))) {
				c = a;
				fc = fa;
				d = b - a;
				e = d;
			}
		} 
	}
}

