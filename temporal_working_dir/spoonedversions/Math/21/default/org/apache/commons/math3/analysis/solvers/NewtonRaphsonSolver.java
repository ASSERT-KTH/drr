

package org.apache.commons.math3.analysis.solvers;


public class NewtonRaphsonSolver extends org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public NewtonRaphsonSolver() {
		this(org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public NewtonRaphsonSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	@java.lang.Override
	public double solve(int maxEval, final org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction f, final double min, final double max) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		return super.solve(maxEval, f, org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.midpoint(min, max));
	}

	@java.lang.Override
	protected double doSolve() throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		final double startValue = getStartValue();
		final double absoluteAccuracy = getAbsoluteAccuracy();
		double x0 = startValue;
		double x1;
		while (true) {
			final org.apache.commons.math3.analysis.differentiation.DerivativeStructure y0 = computeObjectiveValueAndDerivative(x0);
			x1 = x0 - ((y0.getValue()) / (y0.getPartialDerivative(1)));
			if ((org.apache.commons.math3.util.FastMath.abs((x1 - x0))) <= absoluteAccuracy) {
				return x1;
			}
			x0 = x1;
		} 
	}
}

