

package org.apache.commons.math.analysis.solvers;


public class MullerSolver extends org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver {
	private static final long serialVersionUID = 7694577816772532779L;

	private static final double DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	public MullerSolver() {
		this(org.apache.commons.math.analysis.solvers.MullerSolver.DEFAULT_ABSOLUTE_ACCURACY);
	}

	public MullerSolver(double absoluteAccuracy) {
		super(absoluteAccuracy);
	}

	public MullerSolver(double relativeAccuracy, double absoluteAccuracy) {
		super(relativeAccuracy, absoluteAccuracy);
	}

	@java.lang.Override
	protected double doSolve() {
		final double min = getMin();
		final double max = getMax();
		final double initial = getStartValue();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		verifySequence(min, initial, max);
		final double fMin = computeObjectiveValue(min);
		if ((org.apache.commons.math.util.FastMath.abs(fMin)) < functionValueAccuracy) {
			return min;
		}
		final double fMax = computeObjectiveValue(max);
		if ((org.apache.commons.math.util.FastMath.abs(fMax)) < functionValueAccuracy) {
			return max;
		}
		final double fInitial = computeObjectiveValue(initial);
		if ((org.apache.commons.math.util.FastMath.abs(fInitial)) < functionValueAccuracy) {
			return initial;
		}
		verifyBracketing(min, max);
		if (isBracketing(min, initial)) {
			return solve(min, initial, fMin, fInitial);
		}else {
			return solve(initial, max, fInitial, fMax);
		}
	}

	private double solve(double min, double max, double fMin, double fMax) {
		final double relativeAccuracy = getRelativeAccuracy();
		final double absoluteAccuracy = getAbsoluteAccuracy();
		final double functionValueAccuracy = getFunctionValueAccuracy();
		double x0 = min;
		double y0 = fMin;
		double x2 = max;
		double y2 = fMax;
		double x1 = 0.5 * (x0 + x2);
		double y1 = computeObjectiveValue(x1);
		double oldx = java.lang.Double.POSITIVE_INFINITY;
		while (true) {
			final double d01 = (y1 - y0) / (x1 - x0);
			final double d12 = (y2 - y1) / (x2 - x1);
			final double d012 = (d12 - d01) / (x2 - x0);
			final double c1 = d01 + ((x1 - x0) * d012);
			final double delta = (c1 * c1) - ((4 * y1) * d012);
			final double xplus = x1 + (((-2.0) * y1) / (c1 + (org.apache.commons.math.util.FastMath.sqrt(delta))));
			final double xminus = x1 + (((-2.0) * y1) / (c1 - (org.apache.commons.math.util.FastMath.sqrt(delta))));
			final double x = isSequence(x0, xplus, x2) ? xplus : xminus;
			final double y = computeObjectiveValue(x);
			final double tolerance = org.apache.commons.math.util.FastMath.max((relativeAccuracy * (org.apache.commons.math.util.FastMath.abs(x))), absoluteAccuracy);
			if (((org.apache.commons.math.util.FastMath.abs((x - oldx))) <= tolerance) || ((org.apache.commons.math.util.FastMath.abs(y)) <= functionValueAccuracy)) {
				return x;
			}
			boolean bisect = (((x < x1) && ((x1 - x0) > (0.95 * (x2 - x0)))) || ((x > x1) && ((x2 - x1) > (0.95 * (x2 - x0))))) || (x == x1);
			if (!bisect) {
				x0 = (x < x1) ? x0 : x1;
				y0 = (x < x1) ? y0 : y1;
				x2 = (x > x1) ? x2 : x1;
				y2 = (x > x1) ? y2 : y1;
				x1 = x;
				y1 = y;
				oldx = x;
			}else {
				double xm = 0.5 * (x0 + x2);
				double ym = computeObjectiveValue(xm);
				if (((org.apache.commons.math.util.MathUtils.sign(y0)) + (org.apache.commons.math.util.MathUtils.sign(ym))) == 0.0) {
					x2 = xm;
					y2 = ym;
				}else {
					x0 = xm;
					y0 = ym;
				}
				x1 = 0.5 * (x0 + x2);
				y1 = computeObjectiveValue(x1);
				oldx = java.lang.Double.POSITIVE_INFINITY;
			}
		} 
	}
}

