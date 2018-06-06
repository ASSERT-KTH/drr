

package org.apache.commons.math.analysis.solvers;


public class SecantSolver extends org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public SecantSolver() {
		this(org.apache.commons.math.analysis.solvers.SecantSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public SecantSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public SecantSolver(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	@java.lang.Override
	protected double doSolve() {
		double min = getMin();
		double max = getMax();
		verifyInterval(min, max);
		final double functionValueAccuracy = getFunctionValueAccuracy();
		double x0 = min;
		double x1 = max;
		double y0 = computeObjectiveValue(x0);
		if ((org.apache.commons.math.util.FastMath.abs(y0)) <= functionValueAccuracy) {
			return x0;
		}
		double y1 = computeObjectiveValue(x1);
		if ((org.apache.commons.math.util.FastMath.abs(y1)) <= functionValueAccuracy) {
			return x1;
		}
		if ((y0 * y1) >= 0) {
			throw new org.apache.commons.math.exception.NoBracketingException(min, max, y0, y1);
		}
		final double absoluteAccuracy = getAbsoluteAccuracy();
		final double relativeAccuracy = getRelativeAccuracy();
		double x2 = x0;
		double y2 = y0;
		double oldDelta = x2 - x1;
		while (true) {
			if ((org.apache.commons.math.util.FastMath.abs(y2)) < (org.apache.commons.math.util.FastMath.abs(y1))) {
				x0 = x1;
				x1 = x2;
				x2 = x0;
				y0 = y1;
				y1 = y2;
				y2 = y0;
			}
			if ((org.apache.commons.math.util.FastMath.abs(y1)) <= functionValueAccuracy) {
				return x1;
			}
			if ((org.apache.commons.math.util.FastMath.abs(oldDelta)) < (org.apache.commons.math.util.FastMath.max((relativeAccuracy * (org.apache.commons.math.util.FastMath.abs(x1))), absoluteAccuracy))) {
				return x1;
			}
			double delta;
			if ((org.apache.commons.math.util.FastMath.abs(y1)) > (org.apache.commons.math.util.FastMath.abs(y0))) {
				delta = 0.5 * oldDelta;
			}else {
				delta = (x0 - x1) / (1 - (y0 / y1));
				if ((delta / oldDelta) > 1) {
					delta = 0.5 * oldDelta;
				}
			}
			x0 = x1;
			y0 = y1;
			x1 = x1 + delta;
			y1 = computeObjectiveValue(x1);
			if ((y1 > 0) == (y2 > 0)) {
				x2 = x0;
				y2 = y0;
			}
			oldDelta = x2 - x1;
		} 
	}
}

