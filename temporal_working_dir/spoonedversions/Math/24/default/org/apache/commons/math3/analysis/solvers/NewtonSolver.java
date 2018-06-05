

package org.apache.commons.math3.analysis.solvers;


@java.lang.Deprecated
public class NewtonSolver extends org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public NewtonSolver() {
		this(org.apache.commons.math3.analysis.solvers.NewtonSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public NewtonSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	@java.lang.Override
	public double solve(int maxEval, final org.apache.commons.math3.analysis.DifferentiableUnivariateFunction f, final double min, final double max) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		return super.solve(maxEval, f, org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.midpoint(min, max));
	}

	@java.lang.Override
	protected double doSolve() throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		final double startValue = getStartValue();
		final double absoluteAccuracy = getAbsoluteAccuracy();
		double x0 = startValue;
		double x1;
		while (true) {
			x1 = x0 - ((computeObjectiveValue(x0)) / (computeDerivativeObjectiveValue(x0)));
			if ((org.apache.commons.math3.util.FastMath.abs((x1 - x0))) <= absoluteAccuracy) {
				return x1;
			}
			x0 = x1;
		} 
	}
}

