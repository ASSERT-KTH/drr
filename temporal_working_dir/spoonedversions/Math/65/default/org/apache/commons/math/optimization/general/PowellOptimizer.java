

package org.apache.commons.math.optimization.general;


public class PowellOptimizer extends org.apache.commons.math.optimization.general.AbstractScalarOptimizer {
	public static final double DEFAULT_LINE_SEARCH_TOLERANCE = 1.0E-7;

	private final org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch line;

	public PowellOptimizer() {
		this(org.apache.commons.math.optimization.general.PowellOptimizer.DEFAULT_LINE_SEARCH_TOLERANCE);
	}

	public PowellOptimizer(double lineSearchTolerance) {
		line = new org.apache.commons.math.optimization.general.PowellOptimizer.LineSearch(lineSearchTolerance);
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
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
		while (true) {
			incrementIterationsCounter();
			double fX = fVal;
			double fX2 = 0;
			double delta = 0;
			int bigInd = 0;
			double alphaMin = 0;
			double[] direc1 = new double[n];
			for (int i = 0; i < n; i++) {
				direc1 = direc[i];
				fX2 = fVal;
				line.search(x, direc1);
				fVal = line.getValueAtOptimum();
				alphaMin = line.getOptimum();
				setNewPointAndDirection(x, direc1, alphaMin);
				if ((fX2 - fVal) > delta) {
					delta = fX2 - fVal;
					bigInd = i;
				}
			}
			final org.apache.commons.math.optimization.RealPointValuePair previous = new org.apache.commons.math.optimization.RealPointValuePair(x1, fX);
			final org.apache.commons.math.optimization.RealPointValuePair current = new org.apache.commons.math.optimization.RealPointValuePair(x, fVal);
			if (getConvergenceChecker().converged(getIterations(), previous, current)) {
				if (goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE)) {
					return fVal < fX ? current : previous;
				}else {
					return fVal > fX ? current : previous;
				}
			}
			double[] x2 = new double[n];
			for (int i = 0; i < n; i++) {
				direc1[i] = (x[i]) - (x1[i]);
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
					line.search(x, direc1);
					fVal = line.getValueAtOptimum();
					alphaMin = line.getOptimum();
					setNewPointAndDirection(x, direc1, alphaMin);
					final int lastInd = n - 1;
					direc[bigInd] = direc[lastInd];
					direc[lastInd] = direc1;
				}
			}
		} 
	}

	private void setNewPointAndDirection(double[] p, double[] d, double optimum) {
		final int n = p.length;
		for (int i = 0; i < n; i++) {
			d[i] *= optimum;
			p[i] += d[i];
		}
	}

	private class LineSearch {
		private final org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer optim = new org.apache.commons.math.optimization.univariate.BrentOptimizer();

		private final org.apache.commons.math.optimization.univariate.BracketFinder bracket = new org.apache.commons.math.optimization.univariate.BracketFinder();

		private double optimum = java.lang.Double.NaN;

		private double valueAtOptimum = java.lang.Double.NaN;

		public LineSearch(double tolerance) {
			optim.setRelativeAccuracy(tolerance);
			optim.setAbsoluteAccuracy(java.lang.Math.ulp(1.0));
		}

		public void search(final double[] p, final double[] d) throws org.apache.commons.math.optimization.OptimizationException {
			try {
				final int n = p.length;
				final org.apache.commons.math.analysis.UnivariateRealFunction f = new org.apache.commons.math.analysis.UnivariateRealFunction() {
					public double value(double alpha) throws org.apache.commons.math.FunctionEvaluationException {
						final double[] x = new double[n];
						for (int i = 0; i < n; i++) {
							x[i] = (p[i]) + (alpha * (d[i]));
						}
						return computeObjectiveValue(x);
					}
				};
				final org.apache.commons.math.optimization.GoalType goal = getGoalType();
				bracket.search(f, goal, 0, 1);
				optimum = optim.optimize(f, goal, bracket.getLo(), bracket.getHi(), bracket.getMid());
				valueAtOptimum = f.value(optimum);
			} catch (org.apache.commons.math.FunctionEvaluationException e) {
				throw new org.apache.commons.math.optimization.OptimizationException(e);
			} catch (org.apache.commons.math.MaxIterationsExceededException e) {
				throw new org.apache.commons.math.optimization.OptimizationException(e);
			}
		}

		public double getOptimum() {
			return optimum;
		}

		public double getValueAtOptimum() {
			return valueAtOptimum;
		}
	}
}

