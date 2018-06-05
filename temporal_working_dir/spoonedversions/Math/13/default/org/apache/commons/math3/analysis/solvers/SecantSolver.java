

package org.apache.commons.math3.analysis.solvers;


public class SecantSolver extends org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver {
	protected static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public SecantSolver() {
		super(org.apache.commons.math3.analysis.solvers.SecantSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public SecantSolver(final double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public SecantSolver(final double relativeAccuracy, final double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	@java.lang.Override
	protected final double doSolve() throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.TooManyEvaluationsException {
		double x0 = getMin();
		double x1 = getMax();
		double f0 = computeObjectiveValue(x0);
		double f1 = computeObjectiveValue(x1);
		if (f0 == 0.0) {
			return x0;
		}
		if (f1 == 0.0) {
			return x1;
		}
		verifyBracketing(x0, x1);
		final double ftol = getFunctionValueAccuracy();
		final double atol = getAbsoluteAccuracy();
		final double rtol = getRelativeAccuracy();
		while (true) {
			final double x = x1 - ((f1 * (x1 - x0)) / (f1 - f0));
			final double fx = computeObjectiveValue(x);
			if (fx == 0.0) {
				return x;
			}
			x0 = x1;
			f0 = f1;
			x1 = x;
			f1 = fx;
			if ((org.apache.commons.math3.util.FastMath.abs(f1)) <= ftol) {
				return x1;
			}
			if ((org.apache.commons.math3.util.FastMath.abs((x1 - x0))) < (org.apache.commons.math3.util.FastMath.max((rtol * (org.apache.commons.math3.util.FastMath.abs(x1))), atol))) {
				return x1;
			}
		} 
	}
}

