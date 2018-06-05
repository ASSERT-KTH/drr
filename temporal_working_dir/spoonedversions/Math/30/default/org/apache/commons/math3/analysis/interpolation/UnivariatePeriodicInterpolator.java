

package org.apache.commons.math3.analysis.interpolation;


public class UnivariatePeriodicInterpolator implements org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator {
	public static final int DEFAULT_EXTEND = 5;

	private final org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator interpolator;

	private final double period;

	private final int extend;

	public UnivariatePeriodicInterpolator(org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator interpolator, double period, int extend) {
		this.interpolator = interpolator;
		this.period = period;
		this.extend = extend;
	}

	public UnivariatePeriodicInterpolator(org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator interpolator, double period) {
		this(interpolator, period, org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolator.DEFAULT_EXTEND);
	}

	public org.apache.commons.math3.analysis.UnivariateFunction interpolate(double[] xval, double[] yval) {
		if ((xval.length) < (extend)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(xval.length, extend, true);
		}
		org.apache.commons.math3.util.MathArrays.checkOrder(xval);
		final double offset = xval[0];
		final int len = (xval.length) + ((extend) * 2);
		final double[] x = new double[len];
		final double[] y = new double[len];
		for (int i = 0; i < (xval.length); i++) {
			final int index = i + (extend);
			x[index] = org.apache.commons.math3.util.MathUtils.reduce(xval[i], period, offset);
			y[index] = yval[i];
		}
		for (int i = 0; i < (extend); i++) {
			int index = ((xval.length) - (extend)) + i;
			x[i] = (org.apache.commons.math3.util.MathUtils.reduce(xval[index], period, offset)) - (period);
			y[i] = yval[index];
			index = (len - (extend)) + i;
			x[index] = (org.apache.commons.math3.util.MathUtils.reduce(xval[i], period, offset)) + (period);
			y[index] = yval[i];
		}
		org.apache.commons.math3.util.MathArrays.sortInPlace(x, y);
		final org.apache.commons.math3.analysis.UnivariateFunction f = interpolator.interpolate(x, y);
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(final double x) {
				return f.value(org.apache.commons.math3.util.MathUtils.reduce(x, period, offset));
			}
		};
	}
}

