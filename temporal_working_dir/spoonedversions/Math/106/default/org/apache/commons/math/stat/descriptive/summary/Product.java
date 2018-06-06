

package org.apache.commons.math.stat.descriptive.summary;


public class Product extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = 2824226005990582538L;

	private long n;

	private double value;

	public Product() {
		n = 0;
		value = java.lang.Double.NaN;
	}

	public void increment(final double d) {
		if ((n) == 0) {
			value = d;
		}else {
			value *= d;
		}
		(n)++;
	}

	public double getResult() {
		return value;
	}

	public long getN() {
		return n;
	}

	public void clear() {
		value = java.lang.Double.NaN;
		n = 0;
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		double product = java.lang.Double.NaN;
		if (test(values, begin, length)) {
			product = 1.0;
			for (int i = begin; i < (begin + length); i++) {
				product *= values[i];
			}
		}
		return product;
	}
}

