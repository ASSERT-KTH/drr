

package org.apache.commons.math.analysis.interpolation;


public class UnivariateRealPeriodicInterpolator implements org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator {
	public static final int DEFAULT_EXTEND = 5;

	private final org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator interpolator;

	private final double period;

	private final int extend;

	public UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator interpolator, double period, int extend) {
		this.interpolator = interpolator;
		this.period = period;
		this.extend = extend;
	}

	public UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator interpolator, double period) {
		this(interpolator, period, org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.DEFAULT_EXTEND);
	}

	public org.apache.commons.math.analysis.UnivariateRealFunction interpolate(double[] xval, double[] yval) {
		if ((xval.length) < (extend)) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(xval.length, extend, true);
		}
		org.apache.commons.math.util.MathUtils.checkOrder(xval);
		final double offset = xval[0];
		final int len = (xval.length) + ((extend) * 2);
		final double[] x = new double[len];
		final double[] y = new double[len];
		for (int i = 0; i < (xval.length); i++) {
			final int index = i + (extend);
			x[index] = org.apache.commons.math.util.MathUtils.reduce(xval[i], period, offset);
			y[index] = yval[i];
		}
		for (int i = 0; i < (extend); i++) {
			int index = ((xval.length) - (extend)) + i;
			x[i] = (org.apache.commons.math.util.MathUtils.reduce(xval[index], period, offset)) - (period);
			y[i] = yval[index];
			index = (len - (extend)) + i;
			x[index] = (org.apache.commons.math.util.MathUtils.reduce(xval[i], period, offset)) + (period);
			y[index] = yval[i];
		}
		org.apache.commons.math.util.MathUtils.sortInPlace(x, y);
		final org.apache.commons.math.analysis.UnivariateRealFunction f = interpolator.interpolate(x, y);
		return new org.apache.commons.math.analysis.UnivariateRealFunction() {
			public double value(final double x) {
				return f.value(org.apache.commons.math.util.MathUtils.reduce(x, period, offset));
			}
		};
	}
}

