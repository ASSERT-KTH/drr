

package org.apache.commons.math.stat.descriptive.summary;


public class SumOfSquares extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = 1460986908574398008L;

	private long n;

	private double value;

	public SumOfSquares() {
		n = 0;
		value = java.lang.Double.NaN;
	}

	public void increment(final double d) {
		if ((n) == 0) {
			value = d * d;
		}else {
			value += d * d;
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
		double sumSq = java.lang.Double.NaN;
		if (test(values, begin, length)) {
			sumSq = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				sumSq += (values[i]) * (values[i]);
			}
		}
		return sumSq;
	}
}

