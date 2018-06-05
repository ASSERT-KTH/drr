

package org.apache.commons.math.stat.descriptive.moment;


public class StandardDeviation extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = 5728716329662425188L;

	private org.apache.commons.math.stat.descriptive.moment.Variance variance = null;

	public StandardDeviation() {
		variance = new org.apache.commons.math.stat.descriptive.moment.Variance();
	}

	public StandardDeviation(final org.apache.commons.math.stat.descriptive.moment.SecondMoment m2) {
		variance = new org.apache.commons.math.stat.descriptive.moment.Variance(m2);
	}

	public StandardDeviation(boolean isBiasCorrected) {
		variance = new org.apache.commons.math.stat.descriptive.moment.Variance(isBiasCorrected);
	}

	public StandardDeviation(boolean isBiasCorrected, org.apache.commons.math.stat.descriptive.moment.SecondMoment m2) {
		variance = new org.apache.commons.math.stat.descriptive.moment.Variance(isBiasCorrected, m2);
	}

	public void increment(final double d) {
		variance.increment(d);
	}

	public long getN() {
		return variance.getN();
	}

	public double getResult() {
		return java.lang.Math.sqrt(variance.getResult());
	}

	public void clear() {
		variance.clear();
	}

	public double evaluate(final double[] values) {
		return java.lang.Math.sqrt(variance.evaluate(values));
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		return java.lang.Math.sqrt(variance.evaluate(values, begin, length));
	}

	public double evaluate(final double[] values, final double mean, final int begin, final int length) {
		return java.lang.Math.sqrt(variance.evaluate(values, mean, begin, length));
	}

	public double evaluate(final double[] values, final double mean) {
		return java.lang.Math.sqrt(variance.evaluate(values, mean));
	}

	public boolean isBiasCorrected() {
		return variance.isBiasCorrected();
	}

	public void setBiasCorrected(boolean isBiasCorrected) {
		variance.setBiasCorrected(isBiasCorrected);
	}
}

