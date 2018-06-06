

package org.apache.commons.math.optimization.general;


public class PowellOptimizer extends org.apache.commons.math.optimization.general.AbstractScalarOptimizer {
	private org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch line = new org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch();

	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> checker) {
		super.setConvergenceChecker(checker);
		final double minTol = 1.0E-4;
		final double rel = java.lang.Math.min(java.lang.Math.sqrt(checker.getRelativeThreshold()), minTol);
		final double abs = java.lang.Math.min(java.lang.Math.sqrt(checker.getAbsoluteThreshold()), minTol);
		line.setConvergenceChecker(new org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker(rel, abs));
	}

	@java.lang.Override
	public void setMaxEvaluations(int maxEvaluations) {
		super.setMaxEvaluations(maxEvaluations);
		line.setMaxEvaluations(maxEvaluations);
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException {
		final org.apache.commons.math.optimization.GoalType goal = getGoalType();
		final double[] guess = getStartPoint();
		final int n = guess.length;
		final double[][] direc = new double[n][n];
		for (int i = 0; i < n; i++) {
			direc[i][i] = 1;
		}
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
				final double[] d = java.util.Arrays.copyOf(direc[i], n);
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
			final org.apache.commons.math.optimization.RealPointValuePair previous = new org.apache.commons.math.optimization.RealPointValuePair(x1, fX);
			final org.apache.commons.math.optimization.RealPointValuePair current = new org.apache.commons.math.optimization.RealPointValuePair(x, fVal);
			if (getConvergenceChecker().converged(iter, previous, current)) {
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

		private org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair optimum;

		public org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair search(final double[] p, final double[] d) throws org.apache.commons.math.FunctionEvaluationException {
			final int n = p.length;
			final org.apache.commons.math.analysis.UnivariateRealFunction f = new org.apache.commons.math.analysis.UnivariateRealFunction() {
				public double value(double alpha) throws org.apache.commons.math.FunctionEvaluationException {
					final double[] x = new double[n];
					for (int i = 0; i < n; i++) {
						x[i] = (p[i]) + (alpha * (d[i]));
					}
					final double obj = org.apache.commons.math.optimization.general.PowellOptimizer.this.computeObjectiveValue(x);
					return obj;
				}
			};
			final org.apache.commons.math.optimization.GoalType goal = org.apache.commons.math.optimization.general.PowellOptimizer.this.getGoalType();
			bracket.search(f, goal, 0, 1);
			return optimize(f, goal, bracket.getLo(), bracket.getHi(), bracket.getMid());
		}
	}
}

