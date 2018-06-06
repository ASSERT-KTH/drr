

package org.apache.commons.math.stat.descriptive.summary;


public class SumOfLogs extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -370076995648386763L;

	private int n;

	private double value;

	public SumOfLogs() {
		value = 0.0;
		n = 0;
	}

	public void increment(final double d) {
		value += java.lang.Math.log(d);
		(n)++;
	}

	public double getResult() {
		if ((n) > 0) {
			return value;
		}else {
			return java.lang.Double.NaN;
		}
	}

	public long getN() {
		return n;
	}

	public void clear() {
		value = 0.0;
		n = 0;
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		double sumLog = java.lang.Double.NaN;
		if (test(values, begin, length)) {
			sumLog = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				sumLog += java.lang.Math.log(values[i]);
			}
		}
		return sumLog;
	}
}

