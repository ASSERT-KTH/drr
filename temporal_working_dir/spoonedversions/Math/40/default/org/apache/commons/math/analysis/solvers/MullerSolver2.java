

package org.apache.commons.math.analysis.solvers;


public class MullerSolver2 extends org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver {
	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public MullerSolver2() {
		this(org.apache.commons.math.analysis.solvers.MullerSolver2.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public MullerSolver2(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public MullerSolver2(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	@java.lang.Override
	protected double doSolve() {
		final double min = getMin();
		final double max = getMax();
		verifyInterval(min, max);
		final double relativeAccuracy = getRelativeAccuracy();
		final double absoluteAccuracy = getAbsoluteAccuracy();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		double x0 = min;
		double y0 = computeObjectiveValue(x0);
		if ((org.apache.commons.math.util.FastMath.abs(y0)) < functionValueAccuracy) {
			return x0;
		}
		double x1 = max;
		double y1 = computeObjectiveValue(x1);
		if ((org.apache.commons.math.util.FastMath.abs(y1)) < functionValueAccuracy) {
			return x1;
		}
		if ((y0 * y1) > 0) {
			throw new org.apache.commons.math.exception.NoBracketingException(x0, x1, y0, y1);
		}
		double x2 = 0.5 * (x0 + x1);
		double y2 = computeObjectiveValue(x2);
		double oldx = java.lang.Double.POSITIVE_INFINITY;
		while (true) {
			final double q = (x2 - x1) / (x1 - x0);
			final double a = q * ((y2 - ((1 + q) * y1)) + (q * y0));
			final double b = ((((2 * q) + 1) * y2) - (((1 + q) * (1 + q)) * y1)) + ((q * q) * y0);
			final double c = (1 + q) * y2;
			final double delta = (b * b) - ((4 * a) * c);
			double x;
			final double denominator;
			if (delta >= 0.0) {
				double dplus = b + (org.apache.commons.math.util.FastMath.sqrt(delta));
				double dminus = b - (org.apache.commons.math.util.FastMath.sqrt(delta));
				denominator = ((org.apache.commons.math.util.FastMath.abs(dplus)) > (org.apache.commons.math.util.FastMath.abs(dminus))) ? dplus : dminus;
			}else {
				denominator = org.apache.commons.math.util.FastMath.sqrt(((b * b) - delta));
			}
			if (denominator != 0) {
				x = x2 - (((2.0 * c) * (x2 - x1)) / denominator);
				while ((x == x1) || (x == x2)) {
					x += absoluteAccuracy;
				} 
			}else {
				x = min + ((org.apache.commons.math.util.FastMath.random()) * (max - min));
				oldx = java.lang.Double.POSITIVE_INFINITY;
			}
			final double y = computeObjectiveValue(x);
			final double tolerance = org.apache.commons.math.util.FastMath.max((relativeAccuracy * (org.apache.commons.math.util.FastMath.abs(x))), absoluteAccuracy);
			if (((org.apache.commons.math.util.FastMath.abs((x - oldx))) <= tolerance) || ((org.apache.commons.math.util.FastMath.abs(y)) <= functionValueAccuracy)) {
				return x;
			}
			x0 = x1;
			y0 = y1;
			x1 = x2;
			y1 = y2;
			x2 = x;
			y2 = y;
			oldx = x;
		} 
	}
}

