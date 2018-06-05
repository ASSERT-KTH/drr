

package org.apache.commons.math.analysis.solvers;


public class BracketingNthOrderBrentSolver extends org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver implements org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	private static final int DEFAULT_MAXIMAL_ORDER = 5;

	private static final int MAXIMAL_AGING = 2;

	private static final double REDUCTION_FACTOR = 1.0 / 16.0;

	private final int maximalOrder;

	private org.apache.commons.math.analysis.solvers.AllowedSolution allowed;

	public BracketingNthOrderBrentSolver() {
		this(org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.DEFAULT_ABSOLUTE_ACCURACY, org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.DEFAULT_MAXIMAL_ORDER);
	}

	public BracketingNthOrderBrentSolver(final double absoluteAccuracy, final int maximalOrder) throws org.apache.commons.math.exception.NumberIsTooSmallException {
		super(absoluteAccuracy);
		if (maximalOrder < 2) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(maximalOrder, 2, true);
		}
		this.maximalOrder = maximalOrder;
		org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
	}

	public BracketingNthOrderBrentSolver(final double relativeAccuracy, final double absoluteAccuracy, final int maximalOrder) throws org.apache.commons.math.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy);
		if (maximalOrder < 2) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(maximalOrder, 2, true);
		}
		this.maximalOrder = maximalOrder;
		org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
	}

	public BracketingNthOrderBrentSolver(final double relativeAccuracy, final double absoluteAccuracy, final double functionValueAccuracy, final int maximalOrder) throws org.apache.commons.math.exception.NumberIsTooSmallException {
		super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);
		if (maximalOrder < 2) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(maximalOrder, 2, true);
		}
		this.maximalOrder = maximalOrder;
		org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
	}

	public int getMaximalOrder() {
		return maximalOrder;
	}

	@java.lang.Override
	protected double doSolve() {
		final double[] x = new double[(maximalOrder) + 1];
		final double[] y = new double[(maximalOrder) + 1];
		x[0] = getMin();
		x[1] = getStartValue();
		x[2] = getMax();
		verifySequence(x[0], x[1], x[2]);
		y[1] = computeObjectiveValue(x[1]);
		if (org.apache.commons.math.util.MathUtils.equals(y[1], 0.0, 1)) {
			return x[1];
		}
		y[0] = computeObjectiveValue(x[0]);
		if (org.apache.commons.math.util.MathUtils.equals(y[0], 0.0, 1)) {
			return x[0];
		}
		int nbPoints;
		int signChangeIndex;
		if (((y[0]) * (y[1])) < 0) {
			nbPoints = 2;
			signChangeIndex = 1;
		}else {
			y[2] = computeObjectiveValue(x[2]);
			if (org.apache.commons.math.util.MathUtils.equals(y[2], 0.0, 1)) {
				return x[2];
			}
			if (((y[1]) * (y[2])) < 0) {
				nbPoints = 3;
				signChangeIndex = 2;
			}else {
				throw new org.apache.commons.math.exception.NoBracketingException(x[0], x[2], y[0], y[2]);
			}
		}
		final double[] tmpX = new double[x.length];
		double xA = x[(signChangeIndex - 1)];
		double yA = y[(signChangeIndex - 1)];
		double absYA = org.apache.commons.math.util.FastMath.abs(yA);
		int agingA = 0;
		double xB = x[signChangeIndex];
		double yB = y[signChangeIndex];
		double absYB = org.apache.commons.math.util.FastMath.abs(yB);
		int agingB = 0;
		while (true) {
			final double xTol = (getAbsoluteAccuracy()) + ((getRelativeAccuracy()) * (org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(xA), org.apache.commons.math.util.FastMath.abs(xB))));
			if (((xB - xA) <= xTol) || ((org.apache.commons.math.util.FastMath.max(absYA, absYB)) < (getFunctionValueAccuracy()))) {
				switch (allowed) {
					case ANY_SIDE :
						return absYA < absYB ? xA : xB;
					case LEFT_SIDE :
						return xA;
					case RIGHT_SIDE :
						return xB;
					case BELOW_SIDE :
						return yA <= 0 ? xA : xB;
					case ABOVE_SIDE :
						return yA < 0 ? xB : xA;
					default :
						throw new org.apache.commons.math.exception.MathInternalError(null);
				}
			}
			double targetY;
			if (agingA >= (org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.MAXIMAL_AGING)) {
				targetY = (-(org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR)) * yB;
			}else
				if (agingB >= (org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.MAXIMAL_AGING)) {
					targetY = (-(org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.REDUCTION_FACTOR)) * yA;
				}else {
					targetY = 0;
				}
			
			double nextX;
			int start = 0;
			int end = nbPoints;
			do {
				java.lang.System.arraycopy(x, start, tmpX, start, (end - start));
				nextX = guessX(targetY, tmpX, y, start, end);
				if (!((nextX > xA) && (nextX < xB))) {
					if ((signChangeIndex - start) >= (end - signChangeIndex)) {
						++start;
					}else {
						--end;
					}
					nextX = java.lang.Double.NaN;
				}
			} while ((java.lang.Double.isNaN(nextX)) && ((end - start) > 1) );
			if (java.lang.Double.isNaN(nextX)) {
				nextX = xA + (0.5 * (xB - xA));
				start = signChangeIndex - 1;
				end = signChangeIndex;
			}
			final double nextY = computeObjectiveValue(nextX);
			if (org.apache.commons.math.util.MathUtils.equals(nextY, 0.0, 1)) {
				return nextX;
			}
			if ((nbPoints > 2) && ((end - start) != nbPoints)) {
				nbPoints = end - start;
				java.lang.System.arraycopy(x, start, x, 0, nbPoints);
				java.lang.System.arraycopy(y, start, y, 0, nbPoints);
				signChangeIndex -= start;
			}else
				if (nbPoints == (x.length)) {
					nbPoints--;
					if (signChangeIndex >= (((x.length) + 1) / 2)) {
						java.lang.System.arraycopy(x, 1, x, 0, nbPoints);
						java.lang.System.arraycopy(y, 1, y, 0, nbPoints);
						--signChangeIndex;
					}
				}
			
			java.lang.System.arraycopy(x, signChangeIndex, x, (signChangeIndex + 1), (nbPoints - signChangeIndex));
			x[signChangeIndex] = nextX;
			java.lang.System.arraycopy(y, signChangeIndex, y, (signChangeIndex + 1), (nbPoints - signChangeIndex));
			y[signChangeIndex] = nextY;
			++nbPoints;
			if ((nextY * yA) <= 0) {
				xB = nextX;
				yB = nextY;
				absYB = org.apache.commons.math.util.FastMath.abs(yB);
				++agingA;
				agingB = 0;
			}else {
				xA = nextX;
				yA = nextY;
				absYA = org.apache.commons.math.util.FastMath.abs(yA);
				agingA = 0;
				++agingB;
				signChangeIndex++;
			}
		} 
	}

	private double guessX(final double targetY, final double[] x, final double[] y, final int start, final int end) {
		for (int i = start; i < (end - 1); ++i) {
			final int delta = (i + 1) - start;
			for (int j = end - 1; j > i; --j) {
				x[j] = ((x[j]) - (x[(j - 1)])) / ((y[j]) - (y[(j - delta)]));
			}
		}
		double x0 = 0;
		for (int j = end - 1; j >= start; --j) {
			x0 = (x[j]) + (x0 * (targetY - (y[j])));
		}
		return x0;
	}

	public double solve(int maxEval, org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution) {
		org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed = allowedSolution;
		return super.solve(maxEval, f, min, max);
	}

	public double solve(int maxEval, org.apache.commons.math.analysis.UnivariateRealFunction f, double min, double max, double startValue, org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution) {
		org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.this.allowed = allowedSolution;
		return super.solve(maxEval, f, min, max, startValue);
	}
}

