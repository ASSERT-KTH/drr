

package org.apache.commons.math.analysis;


public class BrentSolver extends org.apache.commons.math.analysis.UnivariateRealSolverImpl {
	private static final long serialVersionUID = -2136672307739067002L;

	public BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) {
		super(f, 100, 1.0E-6);
	}

	public double solve(double min, double max, double initial) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		if (((initial - min) * (max - initial)) < 0) {
			throw new java.lang.IllegalArgumentException(((((((("Initial guess is not in search" + (" interval." + "  Initial: ")) + initial) + "  Endpoints: [") + min) + ",") + max) + "]"));
		}
		double yInitial = f.value(initial);
		if ((java.lang.Math.abs(yInitial)) <= (functionValueAccuracy)) {
			setResult(initial, 0);
			return result;
		}
		double yMin = f.value(min);
		if ((java.lang.Math.abs(yMin)) <= (functionValueAccuracy)) {
			setResult(yMin, 0);
			return result;
		}
		if ((yInitial * yMin) < 0) {
			return solve(min, yMin, initial, yInitial, min, yMin);
		}
		double yMax = f.value(max);
		if ((java.lang.Math.abs(yMax)) <= (functionValueAccuracy)) {
			setResult(yMax, 0);
			return result;
		}
		if ((yInitial * yMax) < 0) {
			return solve(initial, yInitial, max, yMax, initial, yInitial);
		}
		return solve(min, yMin, max, yMax, initial, yInitial);
	}

	public double solve(double min, double max) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		clearResult();
		verifyInterval(min, max);
		double yMin = f.value(min);
		double yMax = f.value(max);
		if ((yMin * yMax) >= 0) {
			throw new java.lang.IllegalArgumentException((((((((((("Function values at endpoints do not have different signs." + "  Endpoints: [") + min) + ",") + max) + "]") + "  Values: [") + yMin) + ",") + yMax) + "]"));
		}
		return solve(min, yMin, max, yMax, min, yMin);
	}

	private double solve(double x0, double y0, double x1, double y1, double x2, double y2) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		double delta = x1 - x0;
		double oldDelta = delta;
		int i = 0;
		while (i < (maximalIterationCount)) {
			if ((java.lang.Math.abs(y2)) < (java.lang.Math.abs(y1))) {
				x0 = x1;
				x1 = x2;
				x2 = x0;
				y0 = y1;
				y1 = y2;
				y2 = y0;
			}
			if ((java.lang.Math.abs(y1)) <= (functionValueAccuracy)) {
				setResult(x1, i);
				return result;
			}
			double dx = x2 - x1;
			double tolerance = java.lang.Math.max(((relativeAccuracy) * (java.lang.Math.abs(x1))), absoluteAccuracy);
			if ((java.lang.Math.abs(dx)) <= tolerance) {
				setResult(x1, i);
				return result;
			}
			if (((java.lang.Math.abs(oldDelta)) < tolerance) || ((java.lang.Math.abs(y0)) <= (java.lang.Math.abs(y1)))) {
				delta = 0.5 * dx;
				oldDelta = delta;
			}else {
				double r3 = y1 / y0;
				double p;
				double p1;
				if (x0 == x2) {
					p = dx * r3;
					p1 = 1.0 - r3;
				}else {
					double r1 = y0 / y2;
					double r2 = y1 / y2;
					p = r3 * (((dx * r1) * (r1 - r2)) - ((x1 - x0) * (r2 - 1.0)));
					p1 = ((r1 - 1.0) * (r2 - 1.0)) * (r3 - 1.0);
				}
				if (p > 0.0) {
					p1 = -p1;
				}else {
					p = -p;
				}
				if (((2.0 * p) >= (((1.5 * dx) * p1) - (java.lang.Math.abs((tolerance * p1))))) || (p >= (java.lang.Math.abs(((0.5 * oldDelta) * p1))))) {
					delta = 0.5 * dx;
					oldDelta = delta;
				}else {
					oldDelta = delta;
					delta = p / p1;
				}
			}
			x0 = x1;
			y0 = y1;
			if ((java.lang.Math.abs(delta)) > tolerance) {
				x1 = x1 + delta;
			}else
				if (dx > 0.0) {
					x1 = x1 + (0.5 * tolerance);
				}else
					if (dx <= 0.0) {
						x1 = x1 - (0.5 * tolerance);
					}
				
			
			y1 = f.value(x1);
			if ((y1 > 0) == (y2 > 0)) {
				x2 = x0;
				y2 = y0;
				delta = x1 - x0;
				oldDelta = delta;
			}
			i++;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}
}

