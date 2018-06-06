

package org.apache.commons.math.stat.descriptive.moment;


public class Mean extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -1296043746617791564L;

	protected org.apache.commons.math.stat.descriptive.moment.FirstMoment moment;

	protected boolean incMoment;

	public Mean() {
		incMoment = true;
		moment = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
	}

	public Mean(final org.apache.commons.math.stat.descriptive.moment.FirstMoment m1) {
		org.apache.commons.math.stat.descriptive.moment.Mean.this.moment = m1;
		incMoment = false;
	}

	public void increment(final double d) {
		if (incMoment) {
			moment.increment(d);
		}
	}

	public void clear() {
		if (incMoment) {
			moment.clear();
		}
	}

	public double getResult() {
		return moment.m1;
	}

	public long getN() {
		return moment.getN();
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		if (test(values, begin, length)) {
			org.apache.commons.math.stat.descriptive.summary.Sum sum = new org.apache.commons.math.stat.descriptive.summary.Sum();
			double sampleSize = ((double) (length));
			double xbar = (sum.evaluate(values, begin, length)) / sampleSize;
			double correction = 0;
			for (int i = begin; i < (begin + length); i++) {
				correction += (values[i]) - xbar;
			}
			return xbar + (correction / sampleSize);
		}
		return java.lang.Double.NaN;
	}
}

