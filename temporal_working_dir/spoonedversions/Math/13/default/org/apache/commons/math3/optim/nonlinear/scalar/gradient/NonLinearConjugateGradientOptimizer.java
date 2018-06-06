

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;


public class NonLinearConjugateGradientOptimizer extends org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer {
	private final org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula updateFormula;

	private final org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner;

	private final org.apache.commons.math3.analysis.solvers.UnivariateSolver solver;

	private double initialStep = 1;

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula updateFormula, org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> checker) {
		this(updateFormula, checker, new org.apache.commons.math3.analysis.solvers.BrentSolver(), new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner());
	}

	public static enum Formula {
FLETCHER_REEVES, POLAK_RIBIERE;	}

	public static class BracketingStep implements org.apache.commons.math3.optim.OptimizationData {
		private final double initialStep;

		public BracketingStep(double step) {
			initialStep = step;
		}

		public double getBracketingStep() {
			return initialStep;
		}
	}

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula updateFormula, org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> checker, final org.apache.commons.math3.analysis.solvers.UnivariateSolver lineSearchSolver) {
		this(updateFormula, checker, lineSearchSolver, new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner());
	}

	public NonLinearConjugateGradientOptimizer(final org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula updateFormula, org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> checker, final org.apache.commons.math3.analysis.solvers.UnivariateSolver lineSearchSolver, final org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner preconditioner) {
		super(checker);
		this.updateFormula = updateFormula;
		solver = lineSearchSolver;
		this.preconditioner = preconditioner;
		initialStep = 1;
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		parseOptimizationData(optData);
		return super.optimize(optData);
	}

	@java.lang.Override
	protected org.apache.commons.math3.optim.PointValuePair doOptimize() {
		final org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointValuePair> checker = getConvergenceChecker();
		final double[] point = getStartPoint();
		final org.apache.commons.math3.optim.nonlinear.scalar.GoalType goal = getGoalType();
		final int n = point.length;
		double[] r = computeObjectiveGradient(point);
		if (goal == (org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE)) {
			for (int i = 0; i < n; i++) {
				r[i] = -(r[i]);
			}
		}
		double[] steepestDescent = preconditioner.precondition(point, r);
		double[] searchDirection = steepestDescent.clone();
		double delta = 0;
		for (int i = 0; i < n; ++i) {
			delta += (r[i]) * (searchDirection[i]);
		}
		org.apache.commons.math3.optim.PointValuePair current = null;
		int iter = 0;
		int maxEval = getMaxEvaluations();
		while (true) {
			++iter;
			final double objective = computeObjectiveValue(point);
			org.apache.commons.math3.optim.PointValuePair previous = current;
			current = new org.apache.commons.math3.optim.PointValuePair(point, objective);
			if (previous != null) {
				if (checker.converged(iter, previous, current)) {
					return current;
				}
			}
			final org.apache.commons.math3.analysis.UnivariateFunction lsf = new org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.LineSearchFunction(point, searchDirection);
			final double uB = findUpperBound(lsf, 0, initialStep);
			final double step = solver.solve(maxEval, lsf, 0, uB, 1.0E-15);
			maxEval -= solver.getEvaluations();
			for (int i = 0; i < (point.length); ++i) {
				point[i] += step * (searchDirection[i]);
			}
			r = computeObjectiveGradient(point);
			if (goal == (org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE)) {
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
			switch (updateFormula) {
				case FLETCHER_REEVES :
					beta = delta / deltaOld;
					break;
				case POLAK_RIBIERE :
					double deltaMid = 0;
					for (int i = 0; i < (r.length); ++i) {
						deltaMid += (r[i]) * (steepestDescent[i]);
					}
					beta = (delta - deltaMid) / deltaOld;
					break;
				default :
					throw new org.apache.commons.math3.exception.MathInternalError();
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

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep) {
				initialStep = ((org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep) (data)).getBracketingStep();
				break;
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

	public static class IdentityPreconditioner implements org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner {
		public double[] precondition(double[] variables, double[] r) {
			return r.clone();
		}
	}

	private class LineSearchFunction implements org.apache.commons.math3.analysis.UnivariateFunction {
		private final double[] currentPoint;

		private final double[] searchDirection;

		public LineSearchFunction(double[] point, double[] direction) {
			currentPoint = point.clone();
			searchDirection = direction.clone();
		}

		public double value(double x) {
			final double[] shiftedPoint = currentPoint.clone();
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

