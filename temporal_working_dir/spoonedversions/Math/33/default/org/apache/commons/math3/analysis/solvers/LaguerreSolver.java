

package org.apache.commons.math3.analysis.solvers;


public class LaguerreSolver extends org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	private final org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver complexSolver = new org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver();

	public LaguerreSolver() {
		this(org.apache.commons.math3.analysis.solvers.LaguerreSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public LaguerreSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public LaguerreSolver(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	public LaguerreSolver(double relativeAccuracy, double absoluteAccuracy, double functionValueAccuracy) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
	}

	@java.lang.Override
	public double doSolve() {
		double min = getMin();
		double max = getMax();
		double initial = getStartValue();
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
			return laguerre(min, initial, yMin, yInitial);
		}
		double yMax = computeObjectiveValue(max);
		if ((org.apache.commons.math3.util.FastMath.abs(yMax)) <= functionValueAccuracy) {
			return max;
		}
		if ((yInitial * yMax) < 0) {
			return laguerre(initial, max, yInitial, yMax);
		}
		throw new org.apache.commons.math3.exception.NoBracketingException(min, max, yMin, yMax);
	}

	public double laguerre(double lo, double hi, double fLo, double fHi) {
		double[] coefficients = getCoefficients();
		org.apache.commons.math3.complex.Complex[] c = new org.apache.commons.math3.complex.Complex[coefficients.length];
		for (int i = 0; i < (coefficients.length); i++) {
			c[i] = new org.apache.commons.math3.complex.Complex(coefficients[i], 0);
		}
		org.apache.commons.math3.complex.Complex initial = new org.apache.commons.math3.complex.Complex((0.5 * (lo + hi)), 0);
		org.apache.commons.math3.complex.Complex z = complexSolver.solve(c, initial);
		if (complexSolver.isRoot(lo, hi, z)) {
			return z.getReal();
		}else {
			double r = java.lang.Double.NaN;
			org.apache.commons.math3.complex.Complex[] root = complexSolver.solveAll(c, initial);
			for (int i = 0; i < (root.length); i++) {
				if (complexSolver.isRoot(lo, hi, root[i])) {
					r = root[i].getReal();
					break;
				}
			}
			return r;
		}
	}

	private class ComplexSolver {
		public boolean isRoot(double min, double max, org.apache.commons.math3.complex.Complex z) {
			if (isSequence(min, z.getReal(), max)) {
				double tolerance = org.apache.commons.math3.util.FastMath.max(((getRelativeAccuracy()) * (z.abs())), getAbsoluteAccuracy());
				return ((org.apache.commons.math3.util.FastMath.abs(z.getImaginary())) <= tolerance) || ((z.abs()) <= (getFunctionValueAccuracy()));
			}
			return false;
		}

		public org.apache.commons.math3.complex.Complex[] solveAll(org.apache.commons.math3.complex.Complex[] coefficients, org.apache.commons.math3.complex.Complex initial) {
			if (coefficients == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			int n = (coefficients.length) - 1;
			if (n == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL);
			}
			org.apache.commons.math3.complex.Complex[] c = new org.apache.commons.math3.complex.Complex[n + 1];
			for (int i = 0; i <= n; i++) {
				c[i] = coefficients[i];
			}
			org.apache.commons.math3.complex.Complex[] root = new org.apache.commons.math3.complex.Complex[n];
			for (int i = 0; i < n; i++) {
				org.apache.commons.math3.complex.Complex[] subarray = new org.apache.commons.math3.complex.Complex[(n - i) + 1];
				java.lang.System.arraycopy(c, 0, subarray, 0, subarray.length);
				root[i] = solve(subarray, initial);
				org.apache.commons.math3.complex.Complex newc = c[(n - i)];
				org.apache.commons.math3.complex.Complex oldc = null;
				for (int j = (n - i) - 1; j >= 0; j--) {
					oldc = c[j];
					c[j] = newc;
					newc = oldc.add(newc.multiply(root[i]));
				}
			}
			return root;
		}

		public org.apache.commons.math3.complex.Complex solve(org.apache.commons.math3.complex.Complex[] coefficients, org.apache.commons.math3.complex.Complex initial) {
			if (coefficients == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			int n = (coefficients.length) - 1;
			if (n == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL);
			}
			final double absoluteAccuracy = getAbsoluteAccuracy();
			final double relativeAccuracy = getRelativeAccuracy();
			final double functionValueAccuracy = getFunctionValueAccuracy();
			org.apache.commons.math3.complex.Complex N = new org.apache.commons.math3.complex.Complex(n, 0.0);
			org.apache.commons.math3.complex.Complex N1 = new org.apache.commons.math3.complex.Complex((n - 1), 0.0);
			org.apache.commons.math3.complex.Complex pv = null;
			org.apache.commons.math3.complex.Complex dv = null;
			org.apache.commons.math3.complex.Complex d2v = null;
			org.apache.commons.math3.complex.Complex G = null;
			org.apache.commons.math3.complex.Complex G2 = null;
			org.apache.commons.math3.complex.Complex H = null;
			org.apache.commons.math3.complex.Complex delta = null;
			org.apache.commons.math3.complex.Complex denominator = null;
			org.apache.commons.math3.complex.Complex z = initial;
			org.apache.commons.math3.complex.Complex oldz = new org.apache.commons.math3.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
			while (true) {
				pv = coefficients[n];
				dv = org.apache.commons.math3.complex.Complex.ZERO;
				d2v = org.apache.commons.math3.complex.Complex.ZERO;
				for (int j = n - 1; j >= 0; j--) {
					d2v = dv.add(z.multiply(d2v));
					dv = pv.add(z.multiply(dv));
					pv = coefficients[j].add(z.multiply(pv));
				}
				d2v = d2v.multiply(new org.apache.commons.math3.complex.Complex(2.0, 0.0));
				double tolerance = org.apache.commons.math3.util.FastMath.max((relativeAccuracy * (z.abs())), absoluteAccuracy);
				if ((z.subtract(oldz).abs()) <= tolerance) {
					return z;
				}
				if ((pv.abs()) <= functionValueAccuracy) {
					return z;
				}
				G = dv.divide(pv);
				G2 = G.multiply(G);
				H = G2.subtract(d2v.divide(pv));
				delta = N1.multiply(N.multiply(H).subtract(G2));
				org.apache.commons.math3.complex.Complex deltaSqrt = delta.sqrt();
				org.apache.commons.math3.complex.Complex dplus = G.add(deltaSqrt);
				org.apache.commons.math3.complex.Complex dminus = G.subtract(deltaSqrt);
				denominator = ((dplus.abs()) > (dminus.abs())) ? dplus : dminus;
				if (denominator.equals(new org.apache.commons.math3.complex.Complex(0.0, 0.0))) {
					z = z.add(new org.apache.commons.math3.complex.Complex(absoluteAccuracy, absoluteAccuracy));
					oldz = new org.apache.commons.math3.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
				}else {
					oldz = z;
					z = z.subtract(N.divide(denominator));
				}
				incrementEvaluationCount();
			} 
		}
	}
}

