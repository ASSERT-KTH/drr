

package org.apache.commons.math.stat.descriptive.summary;


public class Product extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable , org.apache.commons.math.stat.descriptive.WeightedEvaluation {
	private static final long serialVersionUID = 2824226005990582538L;

	private long n;

	private double value;

	public Product() {
		n = 0;
		value = 1;
	}

	public Product(org.apache.commons.math.stat.descriptive.summary.Product original) {
		org.apache.commons.math.stat.descriptive.summary.Product.copy(original, org.apache.commons.math.stat.descriptive.summary.Product.this);
	}

	@java.lang.Override
	public void increment(final double d) {
		value *= d;
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
		value = 1;
		n = 0;
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) {
		double product = java.lang.Double.NaN;
		if (test(values, begin, length, true)) {
			product = 1.0;
			for (int i = begin; i < (begin + length); i++) {
				product *= values[i];
			}
		}
		return product;
	}

	public double evaluate(final double[] values, final double[] weights, final int begin, final int length) {
		double product = java.lang.Double.NaN;
		if (test(values, weights, begin, length, true)) {
			product = 1.0;
			for (int i = begin; i < (begin + length); i++) {
				product *= org.apache.commons.math.util.FastMath.pow(values[i], weights[i]);
			}
		}
		return product;
	}

	public double evaluate(final double[] values, final double[] weights) {
		return evaluate(values, weights, 0, values.length);
	}

	@java.lang.Override
	public org.apache.commons.math.stat.descriptive.summary.Product copy() {
		org.apache.commons.math.stat.descriptive.summary.Product result = new org.apache.commons.math.stat.descriptive.summary.Product();
		org.apache.commons.math.stat.descriptive.summary.Product.copy(org.apache.commons.math.stat.descriptive.summary.Product.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math.stat.descriptive.summary.Product source, org.apache.commons.math.stat.descriptive.summary.Product dest) {
		dest.n = source.n;
		dest.value = source.value;
	}
}

