

package org.apache.commons.math.stat.descriptive.moment;


public class Kurtosis extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic {
	private static final long serialVersionUID = 2784465764798260919L;

	protected org.apache.commons.math.stat.descriptive.moment.FourthMoment moment;

	protected boolean incMoment;

	public Kurtosis() {
		incMoment = true;
		moment = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
	}

	public Kurtosis(final org.apache.commons.math.stat.descriptive.moment.FourthMoment m4) {
		incMoment = false;
		org.apache.commons.math.stat.descriptive.moment.Kurtosis.this.moment = m4;
	}

	public void increment(final double d) {
		if (incMoment) {
			moment.increment(d);
		}else {
			throw new java.lang.IllegalStateException("Statistics constructed from external moments cannot be incremented");
		}
	}

	public double getResult() {
		double kurtosis = java.lang.Double.NaN;
		if ((moment.getN()) > 3) {
			double variance = (moment.m2) / ((double) ((moment.n) - 1));
			if (((moment.n) <= 3) || (variance < 1.0E-19)) {
				kurtosis = 0.0;
			}else {
				double n = ((double) (moment.n));
				kurtosis = (((n * (n + 1)) * (moment.m4)) - (((3 * (moment.m2)) * (moment.m2)) * (n - 1))) / (((((n - 1) * (n - 2)) * (n - 3)) * variance) * variance);
			}
		}
		return kurtosis;
	}

	public void clear() {
		if (incMoment) {
			moment.clear();
		}else {
			throw new java.lang.IllegalStateException("Statistics constructed from external moments cannot be cleared");
		}
	}

	public long getN() {
		return moment.getN();
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		double kurt = java.lang.Double.NaN;
		if ((test(values, begin, length)) && (length > 3)) {
			org.apache.commons.math.stat.descriptive.moment.Variance variance = new org.apache.commons.math.stat.descriptive.moment.Variance();
			variance.incrementAll(values, begin, length);
			double mean = variance.moment.m1;
			double stdDev = java.lang.Math.sqrt(variance.getResult());
			double accum3 = 0.0;
			for (int i = begin; i < (begin + length); i++) {
				accum3 += java.lang.Math.pow(((values[i]) - mean), 4.0);
			}
			accum3 /= java.lang.Math.pow(stdDev, 4.0);
			double n0 = length;
			double coefficientOne = (n0 * (n0 + 1)) / (((n0 - 1) * (n0 - 2)) * (n0 - 3));
			double termTwo = (3 * (java.lang.Math.pow((n0 - 1), 2.0))) / ((n0 - 2) * (n0 - 3));
			kurt = (coefficientOne * accum3) - termTwo;
		}
		return kurt;
	}
}

