

package org.apache.commons.math3.stat.descriptive.summary;


public class Sum extends org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -8231831954703408316L;

	private long n;

	private double value;

	public Sum() {
		n = 0;
		value = 0;
	}

	public Sum(org.apache.commons.math3.stat.descriptive.summary.Sum original) {
		org.apache.commons.math3.stat.descriptive.summary.Sum.copy(original, org.apache.commons.math3.stat.descriptive.summary.Sum.this);
	}

	@java.lang.Override
	public void increment(final double d) {
		value += d;
		(n)++;
	}

	@java.lang.Override
	public double getResult() {
		return value;
	}

	public long getN() {
		return n;
	}

	@java.lang.Override
	public void clear() {
		value = 0;
		n = 0;
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) {
		double sum = java.lang.Double.NaN;
		if (test(values, begin, length, true)) {
			sum = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				sum += values[i];
			}
		}
		return sum;
	}

	public double evaluate(final double[] values, final double[] weights, final int begin, final int length) {
		double sum = java.lang.Double.NaN;
		if (test(values, weights, begin, length, true)) {
			sum = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				sum += (values[i]) * (weights[i]);
			}
		}
		return sum;
	}

	public double evaluate(final double[] values, final double[] weights) {
		return evaluate(values, weights, 0, values.length);
	}

	@java.lang.Override
	public org.apache.commons.math3.stat.descriptive.summary.Sum copy() {
		org.apache.commons.math3.stat.descriptive.summary.Sum result = new org.apache.commons.math3.stat.descriptive.summary.Sum();
		org.apache.commons.math3.stat.descriptive.summary.Sum.copy(org.apache.commons.math3.stat.descriptive.summary.Sum.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math3.stat.descriptive.summary.Sum source, org.apache.commons.math3.stat.descriptive.summary.Sum dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		dest.setData(source.getDataRef());
		dest.n = source.n;
		dest.value = source.value;
	}
}

