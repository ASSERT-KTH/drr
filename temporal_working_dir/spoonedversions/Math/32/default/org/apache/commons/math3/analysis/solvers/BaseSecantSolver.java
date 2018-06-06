

package org.apache.commons.math3.analysis.solvers;


public abstract class BaseSecantSolver extends org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver implements org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver<org.apache.commons.math3.analysis.UnivariateFunction> {
	protected static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	private org.apache.commons.math3.analysis.solvers.AllowedSolution allowed;

	private final org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method method;

	protected BaseSecantSolver(final double absoluteAccuracy, final org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method method) {
		super(absoluteAccuracy);
		org.apache.commons.math3.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math3.analysis.solvers.AllowedSolution.ANY_SIDE;
		this.method = method;
	}

	protected BaseSecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method method) {
		super(relativeAccuracy, absoluteAccuracy);
		org.apache.commons.math3.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math3.analysis.solvers.AllowedSolution.ANY_SIDE;
		this.method = method;
	}

	protected BaseSecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy, final org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method method) {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
		org.apache.commons.math3.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math3.analysis.solvers.AllowedSolution.ANY_SIDE;
		this.method = method;
	}

	public double solve(final int maxEval, final org.apache.commons.math3.analysis.UnivariateFunction f, final double min, final double max, final org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution) {
		return solve(maxEval, f, min, max, (min + (0.5 * (max - min))), allowedSolution);
	}

	public double solve(final int maxEval, final org.apache.commons.math3.analysis.UnivariateFunction f, final double min, final double max, final double startValue, final org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution) {
		org.apache.commons.math3.analysis.solvers.BaseSecantSolver.this.allowed = allowedSolution;
		return super.solve(maxEval, f, min, max, startValue);
	}

	@java.lang.Override
	public double solve(final int maxEval, final org.apache.commons.math3.analysis.UnivariateFunction f, final double min, final double max, final double startValue) {
		return solve(maxEval, f, min, max, startValue, org.apache.commons.math3.analysis.solvers.AllowedSolution.ANY_SIDE);
	}

	@java.lang.Override
	protected final double doSolve() {
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
		boolean inverted = false;
		while (true) {
			final double x = x1 - ((f1 * (x1 - x0)) / (f1 - f0));
			final double fx = computeObjectiveValue(x);
			if (fx == 0.0) {
				return x;
			}
			if ((f1 * fx) < 0) {
				x0 = x1;
				f0 = f1;
				inverted = !inverted;
			}else {
				switch (method) {
					case ILLINOIS :
						f0 *= 0.5;
						break;
					case PEGASUS :
						f0 *= f1 / (f1 + fx);
						break;
					case REGULA_FALSI :
						if (x == x1) {
							throw new org.apache.commons.math3.exception.ConvergenceException();
						}
						break;
					default :
						throw new org.apache.commons.math3.exception.MathInternalError();
				}
			}
			x1 = x;
			f1 = fx;
			if ((org.apache.commons.math3.util.FastMath.abs(f1)) <= ftol) {
				switch (allowed) {
					case ANY_SIDE :
						return x1;
					case LEFT_SIDE :
						if (inverted) {
							return x1;
						}
						break;
					case RIGHT_SIDE :
						if (!inverted) {
							return x1;
						}
						break;
					case BELOW_SIDE :
						if (f1 <= 0) {
							return x1;
						}
						break;
					case ABOVE_SIDE :
						if (f1 >= 0) {
							return x1;
						}
						break;
					default :
						throw new org.apache.commons.math3.exception.MathInternalError();
				}
			}
			if ((org.apache.commons.math3.util.FastMath.abs((x1 - x0))) < (org.apache.commons.math3.util.FastMath.max((rtol * (org.apache.commons.math3.util.FastMath.abs(x1))), atol))) {
				switch (allowed) {
					case ANY_SIDE :
						return x1;
					case LEFT_SIDE :
						return inverted ? x1 : x0;
					case RIGHT_SIDE :
						return inverted ? x0 : x1;
					case BELOW_SIDE :
						return f1 <= 0 ? x1 : x0;
					case ABOVE_SIDE :
						return f1 >= 0 ? x1 : x0;
					default :
						throw new org.apache.commons.math3.exception.MathInternalError();
				}
			}
		} 
	}

	protected enum Method {
REGULA_FALSI, ILLINOIS, PEGASUS;	}
}

