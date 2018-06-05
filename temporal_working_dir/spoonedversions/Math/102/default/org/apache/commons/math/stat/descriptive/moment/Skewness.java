

package org.apache.commons.math.stat.descriptive.moment;


public class Skewness extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = 7101857578996691352L;

	protected org.apache.commons.math.stat.descriptive.moment.ThirdMoment moment = null;

	protected boolean incMoment;

	public Skewness() {
		incMoment = true;
		moment = new org.apache.commons.math.stat.descriptive.moment.ThirdMoment();
	}

	public Skewness(final org.apache.commons.math.stat.descriptive.moment.ThirdMoment m3) {
		incMoment = false;
		org.apache.commons.math.stat.descriptive.moment.Skewness.this.moment = m3;
	}

	public void increment(final double d) {
		if (incMoment) {
			moment.increment(d);
		}
	}

	public double getResult() {
		if ((moment.n) < 3) {
			return java.lang.Double.NaN;
		}
		double variance = (moment.m2) / ((double) ((moment.n) - 1));
		if (variance < 1.0E-19) {
			return 0.0;
		}else {
			double n0 = ((double) (moment.getN()));
			return (n0 * (moment.m3)) / ((((n0 - 1) * (n0 - 2)) * (java.lang.Math.sqrt(variance))) * variance);
		}
	}

	public long getN() {
		return moment.getN();
	}

	public void clear() {
		if (incMoment) {
			moment.clear();
		}
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		double skew = java.lang.Double.NaN;
		if ((test(values, begin, length)) && (length > 2)) {
			org.apache.commons.math.stat.descriptive.moment.Mean mean = new org.apache.commons.math.stat.descriptive.moment.Mean();
			double m = mean.evaluate(values, begin, length);
			double accum = 0.0;
			double accum2 = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				accum += java.lang.Math.pow(((values[i]) - m), 2.0);
				accum2 += (values[i]) - m;
			}
			double stdDev = java.lang.Math.sqrt(((accum - ((java.lang.Math.pow(accum2, 2)) / ((double) (length)))) / ((double) (length - 1))));
			double accum3 = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				accum3 += java.lang.Math.pow(((values[i]) - m), 3.0);
			}
			accum3 /= java.lang.Math.pow(stdDev, 3.0);
			double n0 = length;
			skew = (n0 / ((n0 - 1) * (n0 - 2))) * accum3;
		}
		return skew;
	}
}

