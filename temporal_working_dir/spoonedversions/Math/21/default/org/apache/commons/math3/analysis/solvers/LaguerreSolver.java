

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
	public double doSolve() throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		final double min = getMin();
		final double max = getMax();
		final double initial = getStartValue();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		verifySequence(min, initial, max);
		final double yInitial = computeObjectiveValue(initial);
		if ((org.apache.commons.math3.util.FastMath.abs(yInitial)) <= functionValueAccuracy) {
			return initial;
		}
		final double yMin = computeObjectiveValue(min);
		if ((org.apache.commons.math3.util.FastMath.abs(yMin)) <= functionValueAccuracy) {
			return min;
		}
		if ((yInitial * yMin) < 0) {
			return laguerre(min, initial, yMin, yInitial);
		}
		final double yMax = computeObjectiveValue(max);
		if ((org.apache.commons.math3.util.FastMath.abs(yMax)) <= functionValueAccuracy) {
			return max;
		}
		if ((yInitial * yMax) < 0) {
			return laguerre(initial, max, yInitial, yMax);
		}
		throw new org.apache.commons.math3.exception.NoBracketingException(min, max, yMin, yMax);
	}

	@java.lang.Deprecated
	public double laguerre(double lo, double hi, double fLo, double fHi) {
		final org.apache.commons.math3.complex.Complex[] c = org.apache.commons.math3.complex.ComplexUtils.convertToComplex(getCoefficients());
		final org.apache.commons.math3.complex.Complex initial = new org.apache.commons.math3.complex.Complex((0.5 * (lo + hi)), 0);
		final org.apache.commons.math3.complex.Complex z = complexSolver.solve(c, initial);
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

	public org.apache.commons.math3.complex.Complex[] solveAllComplex(double[] coefficients, double initial) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		setup(java.lang.Integer.MAX_VALUE, new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(coefficients), java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, initial);
		return complexSolver.solveAll(org.apache.commons.math3.complex.ComplexUtils.convertToComplex(coefficients), new org.apache.commons.math3.complex.Complex(initial, 0.0));
	}

	public org.apache.commons.math3.complex.Complex solveComplex(double[] coefficients, double initial) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		setup(java.lang.Integer.MAX_VALUE, new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(coefficients), java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, initial);
		return complexSolver.solve(org.apache.commons.math3.complex.ComplexUtils.convertToComplex(coefficients), new org.apache.commons.math3.complex.Complex(initial, 0.0));
	}

	private class ComplexSolver {
		public boolean isRoot(double min, double max, org.apache.commons.math3.complex.Complex z) {
			if (isSequence(min, z.getReal(), max)) {
				double tolerance = org.apache.commons.math3.util.FastMath.max(((getRelativeAccuracy()) * (z.abs())), getAbsoluteAccuracy());
				return ((org.apache.commons.math3.util.FastMath.abs(z.getImaginary())) <= tolerance) || ((z.abs()) <= (getFunctionValueAccuracy()));
			}
			return false;
		}

		public org.apache.commons.math3.complex.Complex[] solveAll(org.apache.commons.math3.complex.Complex[] coefficients, org.apache.commons.math3.complex.Complex initial) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException {
			if (coefficients == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			final int n = (coefficients.length) - 1;
			if (n == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL);
			}
			final org.apache.commons.math3.complex.Complex[] c = new org.apache.commons.math3.complex.Complex[n + 1];
			for (int i = 0; i <= n; i++) {
				c[i] = coefficients[i];
			}
			final org.apache.commons.math3.complex.Complex[] root = new org.apache.commons.math3.complex.Complex[n];
			for (int i = 0; i < n; i++) {
				final org.apache.commons.math3.complex.Complex[] subarray = new org.apache.commons.math3.complex.Complex[(n - i) + 1];
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

		public org.apache.commons.math3.complex.Complex solve(org.apache.commons.math3.complex.Complex[] coefficients, org.apache.commons.math3.complex.Complex initial) throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.TooManyEvaluationsException {
			if (coefficients == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException();
			}
			final int n = (coefficients.length) - 1;
			if (n == 0) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.POLYNOMIAL);
			}
			final double absoluteAccuracy = getAbsoluteAccuracy();
			final double relativeAccuracy = getRelativeAccuracy();
			final double functionValueAccuracy = getFunctionValueAccuracy();
			final org.apache.commons.math3.complex.Complex nC = new org.apache.commons.math3.complex.Complex(n, 0);
			final org.apache.commons.math3.complex.Complex n1C = new org.apache.commons.math3.complex.Complex((n - 1), 0);
			org.apache.commons.math3.complex.Complex z = initial;
			org.apache.commons.math3.complex.Complex oldz = new org.apache.commons.math3.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
			while (true) {
				org.apache.commons.math3.complex.Complex pv = coefficients[n];
				org.apache.commons.math3.complex.Complex dv = org.apache.commons.math3.complex.Complex.ZERO;
				org.apache.commons.math3.complex.Complex d2v = org.apache.commons.math3.complex.Complex.ZERO;
				for (int j = n - 1; j >= 0; j--) {
					d2v = dv.add(z.multiply(d2v));
					dv = pv.add(z.multiply(dv));
					pv = coefficients[j].add(z.multiply(pv));
				}
				d2v = d2v.multiply(new org.apache.commons.math3.complex.Complex(2.0, 0.0));
				final double tolerance = org.apache.commons.math3.util.FastMath.max((relativeAccuracy * (z.abs())), absoluteAccuracy);
				if ((z.subtract(oldz).abs()) <= tolerance) {
					return z;
				}
				if ((pv.abs()) <= functionValueAccuracy) {
					return z;
				}
				final org.apache.commons.math3.complex.Complex G = dv.divide(pv);
				final org.apache.commons.math3.complex.Complex G2 = G.multiply(G);
				final org.apache.commons.math3.complex.Complex H = G2.subtract(d2v.divide(pv));
				final org.apache.commons.math3.complex.Complex delta = n1C.multiply(nC.multiply(H).subtract(G2));
				final org.apache.commons.math3.complex.Complex deltaSqrt = delta.sqrt();
				final org.apache.commons.math3.complex.Complex dplus = G.add(deltaSqrt);
				final org.apache.commons.math3.complex.Complex dminus = G.subtract(deltaSqrt);
				final org.apache.commons.math3.complex.Complex denominator = (dplus.abs()) > (dminus.abs()) ? dplus : dminus;
				if (denominator.equals(new org.apache.commons.math3.complex.Complex(0.0, 0.0))) {
					z = z.add(new org.apache.commons.math3.complex.Complex(absoluteAccuracy, absoluteAccuracy));
					oldz = new org.apache.commons.math3.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
				}else {
					oldz = z;
					z = z.subtract(nC.divide(denominator));
				}
				incrementEvaluationCount();
			} 
		}
	}
}

