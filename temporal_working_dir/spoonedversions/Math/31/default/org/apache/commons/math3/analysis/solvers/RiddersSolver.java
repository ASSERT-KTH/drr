

package org.apache.commons.math3.analysis.solvers;


public class RiddersSolver extends org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public RiddersSolver() {
		this(org.apache.commons.math3.analysis.solvers.RiddersSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public RiddersSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public RiddersSolver(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	@java.lang.Override
	protected double doSolve() {
		double min = getMin();
		double max = getMax();
		double x1 = min;
		double y1 = computeObjectiveValue(x1);
		double x2 = max;
		double y2 = computeObjectiveValue(x2);
		if (y1 == 0) {
			return min;
		}
		if (y2 == 0) {
			return max;
		}
		verifyBracketing(min, max);
		final double absoluteAccuracy = getAbsoluteAccuracy();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		final double relativeAccuracy = getRelativeAccuracy();
		double oldx = java.lang.Double.POSITIVE_INFINITY;
		while (true) {
			final double x3 = 0.5 * (x1 + x2);
			final double y3 = computeObjectiveValue(x3);
			if ((org.apache.commons.math3.util.FastMath.abs(y3)) <= functionValueAccuracy) {
				return x3;
			}
			final double delta = 1 - ((y1 * y2) / (y3 * y3));
			final double correction = (((org.apache.commons.math3.util.FastMath.signum(y2)) * (org.apache.commons.math3.util.FastMath.signum(y3))) * (x3 - x1)) / (org.apache.commons.math3.util.FastMath.sqrt(delta));
			final double x = x3 - correction;
			final double y = computeObjectiveValue(x);
			final double tolerance = org.apache.commons.math3.util.FastMath.max((relativeAccuracy * (org.apache.commons.math3.util.FastMath.abs(x))), absoluteAccuracy);
			if ((org.apache.commons.math3.util.FastMath.abs((x - oldx))) <= tolerance) {
				return x;
			}
			if ((org.apache.commons.math3.util.FastMath.abs(y)) <= functionValueAccuracy) {
				return x;
			}
			if (correction > 0.0) {
				if (((org.apache.commons.math3.util.FastMath.signum(y1)) + (org.apache.commons.math3.util.FastMath.signum(y))) == 0.0) {
					x2 = x;
					y2 = y;
				}else {
					x1 = x;
					x2 = x3;
					y1 = y;
					y2 = y3;
				}
			}else {
				if (((org.apache.commons.math3.util.FastMath.signum(y2)) + (org.apache.commons.math3.util.FastMath.signum(y))) == 0.0) {
					x1 = x;
					y1 = y;
				}else {
					x1 = x3;
					x2 = x;
					y1 = y3;
					y2 = y;
				}
			}
			oldx = x;
		} 
	}
}

