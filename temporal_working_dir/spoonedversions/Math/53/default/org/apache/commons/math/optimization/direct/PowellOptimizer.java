

package org.apache.commons.math.optimization.direct;


public class PowellOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	private static final double MIN_RELATIVE_TOLERANCE = 2 * (org.apache.commons.math.util.FastMath.ulp(1.0));

	private final double relativeThreshold;

	private final double absoluteThreshold;

	private final org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch line;

	public PowellOptimizer(double rel, double abs) {
		if (rel < (org.apache.commons.math.optimization.direct.PowellOptimizer.MIN_RELATIVE_TOLERANCE)) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(rel, org.apache.commons.math.optimization.direct.PowellOptimizer.MIN_RELATIVE_TOLERANCE, true);
		}
		if (abs <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(abs);
		}
		relativeThreshold = rel;
		absoluteThreshold = abs;
		final double minTol = 1.0E-4;
		final double lsRel = java.lang.Math.min(org.apache.commons.math.util.FastMath.sqrt(relativeThreshold), minTol);
		final double lsAbs = java.lang.Math.min(org.apache.commons.math.util.FastMath.sqrt(absoluteThreshold), minTol);
		line = new org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch(lsRel, lsAbs);
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() {
		final org.apache.commons.math.optimization.GoalType goal = getGoalType();
		final double[] guess = getStartPoint();
		final int n = guess.length;
		final double[][] direc = new double[n][n];
		for (int i = 0; i < n; i++) {
			direc[i][i] = 1;
		}
		final org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker = getConvergenceChecker();
		double[] x = guess;
		double fVal = computeObjectiveValue(x);
		double[] x1 = x.clone();
		int iter = 0;
		while (true) {
			++iter;
			double fX = fVal;
			double fX2 = 0;
			double delta = 0;
			int bigInd = 0;
			double alphaMin = 0;
			for (int i = 0; i < n; i++) {
				final double[] d = org.apache.commons.math.util.MathUtils.copyOf(direc[i]);
				fX2 = fVal;
				final org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimum = line.search(x, d);
				fVal = optimum.getValue();
				alphaMin = optimum.getPoint();
				final double[][] result = newPointAndDirection(x, d, alphaMin);
				x = result[0];
				if ((fX2 - fVal) > delta) {
					delta = fX2 - fVal;
					bigInd = i;
				}
			}
			boolean stop = (2 * (fX - fVal)) <= (((relativeThreshold) * ((org.apache.commons.math.util.FastMath.abs(fX)) + (org.apache.commons.math.util.FastMath.abs(fVal)))) + (absoluteThreshold));
			final org.apache.commons.math.optimization.RealPointValuePair previous = new org.apache.commons.math.optimization.RealPointValuePair(x1, fX);
			final org.apache.commons.math.optimization.RealPointValuePair current = new org.apache.commons.math.optimization.RealPointValuePair(x, fVal);
			if (!stop) {
				if (checker != null) {
					stop = checker.converged(iter, previous, current);
				}
			}
			if (stop) {
				if (goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE)) {
					return fVal < fX ? current : previous;
				}else {
					return fVal > fX ? current : previous;
				}
			}
			final double[] d = new double[n];
			final double[] x2 = new double[n];
			for (int i = 0; i < n; i++) {
				d[i] = (x[i]) - (x1[i]);
				x2[i] = (2 * (x[i])) - (x1[i]);
			}
			x1 = x.clone();
			fX2 = computeObjectiveValue(x2);
			if (fX > fX2) {
				double t = 2 * ((fX + fX2) - (2 * fVal));
				double temp = (fX - fVal) - delta;
				t *= temp * temp;
				temp = fX - fX2;
				t -= (delta * temp) * temp;
				if (t < 0.0) {
					final org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimum = line.search(x, d);
					fVal = optimum.getValue();
					alphaMin = optimum.getPoint();
					final double[][] result = newPointAndDirection(x, d, alphaMin);
					x = result[0];
					final int lastInd = n - 1;
					direc[bigInd] = direc[lastInd];
					direc[lastInd] = result[1];
				}
			}
		} 
	}

	private double[][] newPointAndDirection(double[] p, double[] d, double optimum) {
		final int n = p.length;
		final double[][] result = new double[2][n];
		final double[] nP = result[0];
		final double[] nD = result[1];
		for (int i = 0; i < n; i++) {
			nD[i] = (d[i]) * optimum;
			nP[i] = (p[i]) + (nD[i]);
		}
		return result;
	}

	private class LineSearch extends org.apache.commons.math.optimization.univariate.BrentOptimizer {
		private final org.apache.commons.math.optimization.univariate.BracketFinder bracket = new org.apache.commons.math.optimization.univariate.BracketFinder();

		LineSearch(double rel, double abs) {
			super(rel, abs);
		}

		public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair search(final double[] p, final double[] d) {
			final int n = p.length;
			final org.apache.commons.math.analysis.UnivariateRealFunction f = new org.apache.commons.math.analysis.UnivariateRealFunction() {
				public double value(double alpha) {
					final double[] x = new double[n];
					for (int i = 0; i < n; i++) {
						x[i] = (p[i]) + (alpha * (d[i]));
					}
					final double obj = org.apache.commons.math.optimization.direct.PowellOptimizer.this.computeObjectiveValue(x);
					return obj;
				}
			};
			final org.apache.commons.math.optimization.GoalType goal = org.apache.commons.math.optimization.direct.PowellOptimizer.this.getGoalType();
			bracket.search(f, goal, 0, 1);
			return optimize(java.lang.Integer.MAX_VALUE, f, goal, bracket.getLo(), bracket.getHi(), bracket.getMid());
		}
	}
}

