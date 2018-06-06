

package org.apache.commons.math.analysis;


public class UnivariateRealSolverUtils {
	private UnivariateRealSolverUtils() {
		super();
	}

	private static org.apache.commons.math.analysis.UnivariateRealSolverFactory factory = null;

	public static double solve(org.apache.commons.math.analysis.UnivariateRealFunction f, double x0, double x1) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		org.apache.commons.math.analysis.UnivariateRealSolverUtils.setup(f);
		return org.apache.commons.math.analysis.UnivariateRealSolverUtils.factory.newDefaultSolver(f).solve(x0, x1);
	}

	public static double solve(org.apache.commons.math.analysis.UnivariateRealFunction f, double x0, double x1, double absoluteAccuracy) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		org.apache.commons.math.analysis.UnivariateRealSolverUtils.setup(f);
		org.apache.commons.math.analysis.UnivariateRealSolver solver = org.apache.commons.math.analysis.UnivariateRealSolverUtils.factory.newDefaultSolver(f);
		solver.setAbsoluteAccuracy(absoluteAccuracy);
		return solver.solve(x0, x1);
	}

	public static double[] bracket(org.apache.commons.math.analysis.UnivariateRealFunction function, double initial, double lowerBound, double upperBound) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		return org.apache.commons.math.analysis.UnivariateRealSolverUtils.bracket(function, initial, lowerBound, upperBound, java.lang.Integer.MAX_VALUE);
	}

	public static double[] bracket(org.apache.commons.math.analysis.UnivariateRealFunction function, double initial, double lowerBound, double upperBound, int maximumIterations) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		if (function == null) {
			throw new java.lang.IllegalArgumentException("function is null.");
		}
		if (maximumIterations <= 0) {
			throw new java.lang.IllegalArgumentException(("bad value for maximumIterations: " + maximumIterations));
		}
		if (((initial < lowerBound) || (initial > upperBound)) || (lowerBound >= upperBound)) {
			throw new java.lang.IllegalArgumentException(((((("Invalid endpoint parameters:  lowerBound=" + lowerBound) + " initial=") + initial) + " upperBound=") + upperBound));
		}
		double a = initial;
		double b = initial;
		double fa;
		double fb;
		int numIterations = 0;
		do {
			a = java.lang.Math.max((a - 1.0), lowerBound);
			b = java.lang.Math.min((b + 1.0), upperBound);
			fa = function.value(a);
			fb = function.value(b);
			numIterations++;
		} while ((((fa * fb) > 0.0) && (numIterations < maximumIterations)) && ((a > lowerBound) || (b < upperBound)) );
		if ((fa * fb) >= 0.0) {
			throw new org.apache.commons.math.ConvergenceException("Number of iterations={0}, maximum iterations={1}, initial={2}, lower bound={3}, upper bound={4}, final a value={5}, final b value={6}, f(a)={7}, f(b)={8}", new java.lang.Object[]{ new java.lang.Integer(numIterations) , new java.lang.Integer(maximumIterations) , new java.lang.Double(initial) , new java.lang.Double(lowerBound) , new java.lang.Double(upperBound) , new java.lang.Double(a) , new java.lang.Double(b) , new java.lang.Double(fa) , new java.lang.Double(fb) });
		}
		return new double[]{ a , b };
	}

	public static double midpoint(double a, double b) {
		return (a + b) * 0.5;
	}

	private static void setup(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		if (f == null) {
			throw new java.lang.IllegalArgumentException("function can not be null.");
		}
		if ((org.apache.commons.math.analysis.UnivariateRealSolverUtils.factory) == null) {
			org.apache.commons.math.analysis.UnivariateRealSolverUtils.factory = org.apache.commons.math.analysis.UnivariateRealSolverFactory.newInstance();
		}
	}
}

