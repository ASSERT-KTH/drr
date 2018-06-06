

package org.apache.commons.math3.optimization.general;


@java.lang.Deprecated
public class NonLinearConjugateGradientOptimizer extends org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer {
	private final org.apache.commons.math3.optimization.general.ConjugateGradientFormula updateFormula;

	private final org.apache.commons.math3.optimization.general.Preconditioner preconditioner;

	private final org.apache.commons.math3.analysis.solvers.UnivariateSolver solver;

	private double initialStep;

	private double[] point;

	@java.lang.Deprecated
	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optimization.general.ConjugateGradientFormula updateFormula) {
		this(updateFormula, new org.apache.commons.math3.optimization.SimpleValueChecker());
	}

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optimization.general.ConjugateGradientFormula updateFormula, org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		this(updateFormula, checker, new org.apache.commons.math3.analysis.solvers.BrentSolver(), new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner());
	}

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optimization.general.ConjugateGradientFormula updateFormula, org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker, final org.apache.commons.math3.analysis.solvers.UnivariateSolver lineSearchSolver) {
		this(updateFormula, checker, lineSearchSolver, new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner());
	}

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optimization.general.ConjugateGradientFormula updateFormula, org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker, final org.apache.commons.math3.analysis.solvers.UnivariateSolver lineSearchSolver, final org.apache.commons.math3.optimization.general.Preconditioner preconditioner) {
		super(checker);
		this.updateFormula = updateFormula;
		solver = lineSearchSolver;
		this.preconditioner = preconditioner;
		initialStep = 1.0;
	}

	public void setInitialStep(final double initialStep) {
		if (initialStep <= 0) {
			org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.this.initialStep = 1.0;
		}else {
			org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.this.initialStep = initialStep;
		}
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair doOptimize() {
		final org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker = getConvergenceChecker();
		point = getStartPoint();
		final org.apache.commons.math3.optimization.GoalType goal = getGoalType();
		final int n = point.length;
		double[] r = computeObjectiveGradient(point);
		if (goal == (org.apache.commons.math3.optimization.GoalType.MINIMIZE)) {
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
		org.apache.commons.math3.optimization.PointValuePair current = null;
		int iter = 0;
		int maxEval = getMaxEvaluations();
		while (true) {
			++iter;
			final double objective = computeObjectiveValue(point);
			org.apache.commons.math3.optimization.PointValuePair previous = current;
			current = new org.apache.commons.math3.optimization.PointValuePair(point, objective);
			if (previous != null) {
				if (checker.converged(iter, previous, current)) {
					return current;
				}
			}
			final org.apache.commons.math3.analysis.UnivariateFunction lsf = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction(searchDirection);
			final double uB = findUpperBound(lsf, 0, initialStep);
			final double step = solver.solve(maxEval, lsf, 0, uB, 1.0E-15);
			maxEval -= solver.getEvaluations();
			for (int i = 0; i < (point.length); ++i) {
				point[i] += step * (searchDirection[i]);
			}
			r = computeObjectiveGradient(point);
			if (goal == (org.apache.commons.math3.optimization.GoalType.MINIMIZE)) {
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
			if ((updateFormula) == (org.apache.commons.math3.optimization.general.ConjugateGradientFormula.FLETCHER_REEVES)) {
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

	private double findUpperBound(final org.apache.commons.math3.analysis.UnivariateFunction f, final double a, final double h) {
		final double yA = f.value(a);
		double yB = yA;
		for (double step = h; step < (java.lang.Double.MAX_VALUE); step *= org.apache.commons.math3.util.FastMath.max(2, (yA / yB))) {
			final double b = a + step;
			yB = f.value(b);
			if ((yA * yB) <= 0) {
				return b;
			}
		}
		throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
	}

	public static class IdentityPreconditioner implements org.apache.commons.math3.optimization.general.Preconditioner {
		public double[] precondition(double[] variables, double[] r) {
			return r.clone();
		}
	}

	private class LineSearchFunction implements org.apache.commons.math3.analysis.UnivariateFunction {
		private final double[] searchDirection;

		public LineSearchFunction(final double[] searchDirection) {
			this.searchDirection = searchDirection;
		}

		public double value(double x) {
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

