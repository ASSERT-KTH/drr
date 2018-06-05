

package org.apache.commons.math.optimization.general;


public class NonLinearConjugateGradientOptimizer extends org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer {
	private final org.apache.commons.math.optimization.general.ConjugateGradientFormula updateFormula;

	private org.apache.commons.math.optimization.general.Preconditioner preconditioner;

	private org.apache.commons.math.analysis.solvers.UnivariateRealSolver solver;

	private double initialStep;

	private double[] point;

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math.optimization.general.ConjugateGradientFormula updateFormula) {
		this.updateFormula = updateFormula;
		preconditioner = null;
		solver = null;
		initialStep = 1.0;
	}

	public void setPreconditioner(final org.apache.commons.math.optimization.general.Preconditioner preconditioner) {
		org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.this.preconditioner = preconditioner;
	}

	public void setLineSearchSolver(final org.apache.commons.math.analysis.solvers.UnivariateRealSolver lineSearchSolver) {
		solver = lineSearchSolver;
		solver.setMaxEvaluations(getMaxEvaluations());
	}

	public void setInitialStep(final double initialStep) {
		if (initialStep <= 0) {
			org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.this.initialStep = 1.0;
		}else {
			org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.this.initialStep = initialStep;
		}
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.exception.MathUserException {
		if ((preconditioner) == null) {
			preconditioner = new org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
		}
		if ((solver) == null) {
			solver = new org.apache.commons.math.analysis.solvers.BrentSolver();
			solver.setMaxEvaluations(getMaxEvaluations());
		}
		point = getStartPoint();
		final org.apache.commons.math.optimization.GoalType goal = getGoalType();
		final int n = point.length;
		double[] r = computeObjectiveGradient(point);
		if (goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE)) {
			for (int i = 0; i < n; ++i) {
				r[i] = -(r[i]);
			}
		}
		double[] steepestDescent = preconditioner.precondition(point, r);
		double[] searchDirection = steepestDescent.clone();
		double delta = 0;
		for (int i = 0; i < n; ++i) {
			delta += (r[i]) * (searchDirection[i]);
		}
		org.apache.commons.math.optimization.RealPointValuePair current = null;
		int iter = 0;
		while (true) {
			++iter;
			final double objective = computeObjectiveValue(point);
			org.apache.commons.math.optimization.RealPointValuePair previous = current;
			current = new org.apache.commons.math.optimization.RealPointValuePair(point, objective);
			if (previous != null) {
				if (getConvergenceChecker().converged(iter, previous, current)) {
					return current;
				}
			}
			double dTd = 0;
			for (final double di : searchDirection) {
				dTd += di * di;
			}
			final org.apache.commons.math.analysis.UnivariateRealFunction lsf = new org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction(searchDirection);
			final double uB = findUpperBound(lsf, 0, initialStep);
			final double step = solver.solve(lsf, 0, uB, 1.0E-15);
			for (int i = 0; i < (point.length); ++i) {
				point[i] += step * (searchDirection[i]);
			}
			r = computeObjectiveGradient(point);
			if (goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE)) {
				for (int i = 0; i < n; ++i) {
					r[i] = -(r[i]);
				}
			}
			final double deltaOld = delta;
			final double[] newSteepestDescent = preconditioner.precondition(point, r);
			delta = 0;
			for (int i = 0; i < n; ++i) {
				delta += (r[i]) * (newSteepestDescent[i]);
			}
			final double beta;
			if ((updateFormula) == (org.apache.commons.math.optimization.general.ConjugateGradientFormula.FLETCHER_REEVES)) {
				beta = delta / deltaOld;
			}else {
				double deltaMid = 0;
				for (int i = 0; i < (r.length); ++i) {
					deltaMid += (r[i]) * (steepestDescent[i]);
				}
				beta = (delta - deltaMid) / deltaOld;
			}
			steepestDescent = newSteepestDescent;
			if (((iter % n) == 0) || (beta < 0)) {
				searchDirection = steepestDescent.clone();
			}else {
				for (int i = 0; i < n; ++i) {
					searchDirection[i] = (steepestDescent[i]) + (beta * (searchDirection[i]));
				}
			}
		} 
	}

	private double findUpperBound(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double a, final double h) throws org.apache.commons.math.exception.MathUserException {
		final double yA = f.value(a);
		double yB = yA;
		for (double step = h; step < (java.lang.Double.MAX_VALUE); step *= org.apache.commons.math.util.FastMath.max(2, (yA / yB))) {
			final double b = a + step;
			yB = f.value(b);
			if ((yA * yB) <= 0) {
				return b;
			}
		}
		throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
	}

	private static class IdentityPreconditioner implements org.apache.commons.math.optimization.general.Preconditioner {
		public double[] precondition(double[] variables, double[] r) {
			return r.clone();
		}
	}

	private class LineSearchFunction implements org.apache.commons.math.analysis.UnivariateRealFunction {
		private final double[] searchDirection;

		public LineSearchFunction(final double[] searchDirection) {
			this.searchDirection = searchDirection;
		}

		public double value(double x) throws org.apache.commons.math.exception.MathUserException {
			final double[] shiftedPoint = point.clone();
			for (int i = 0; i < (shiftedPoint.length); ++i) {
				shiftedPoint[i] += x * (searchDirection[i]);
			}
			final double[] gradient = computeObjectiveGradient(shiftedPoint);
			double dotProduct = 0;
			for (int i = 0; i < (gradient.length); ++i) {
				dotProduct += (gradient[i]) * (searchDirection[i]);
			}
			return dotProduct;
		}
	}
}

