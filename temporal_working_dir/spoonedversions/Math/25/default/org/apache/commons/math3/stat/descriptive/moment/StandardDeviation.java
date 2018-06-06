

package org.apache.commons.math3.stat.descriptive.moment;


public class StandardDeviation extends org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = 5728716329662425188L;

	private org.apache.commons.math3.stat.descriptive.moment.Variance variance = null;

	public StandardDeviation() {
		variance = new org.apache.commons.math3.stat.descriptive.moment.Variance();
	}

	public StandardDeviation(final org.apache.commons.math3.stat.descriptive.moment.SecondMoment m2) {
		variance = new org.apache.commons.math3.stat.descriptive.moment.Variance(m2);
	}

	public StandardDeviation(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation original) {
		org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.copy(original, org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.this);
	}

	public StandardDeviation(boolean isBiasCorrected) {
		variance = new org.apache.commons.math3.stat.descriptive.moment.Variance(isBiasCorrected);
	}

	public StandardDeviation(boolean isBiasCorrected, org.apache.commons.math3.stat.descriptive.moment.SecondMoment m2) {
		variance = new org.apache.commons.math3.stat.descriptive.moment.Variance(isBiasCorrected, m2);
	}

	@java.lang.Override
	public void increment(final double d) {
		variance.increment(d);
	}

	public long getN() {
		return variance.getN();
	}

	@java.lang.Override
	public double getResult() {
		return org.apache.commons.math3.util.FastMath.sqrt(variance.getResult());
	}

	@java.lang.Override
	public void clear() {
		variance.clear();
	}

	@java.lang.Override
	public double evaluate(final double[] values) {
		return org.apache.commons.math3.util.FastMath.sqrt(variance.evaluate(values));
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) {
		return org.apache.commons.math3.util.FastMath.sqrt(variance.evaluate(values, begin, length));
	}

	public double evaluate(final double[] values, final double mean, final int begin, final int length) {
		return org.apache.commons.math3.util.FastMath.sqrt(variance.evaluate(values, mean, begin, length));
	}

	public double evaluate(final double[] values, final double mean) {
		return org.apache.commons.math3.util.FastMath.sqrt(variance.evaluate(values, mean));
	}

	public boolean isBiasCorrected() {
		return variance.isBiasCorrected();
	}

	public void setBiasCorrected(boolean isBiasCorrected) {
		variance.setBiasCorrected(isBiasCorrected);
	}

	@java.lang.Override
	public org.apache.commons.math3.stat.descriptive.moment.StandardDeviation copy() {
		org.apache.commons.math3.stat.descriptive.moment.StandardDeviation result = new org.apache.commons.math3.stat.descriptive.moment.StandardDeviation();
		org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.copy(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math3.stat.descriptive.moment.StandardDeviation source, org.apache.commons.math3.stat.descriptive.moment.StandardDeviation dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		dest.setData(source.getDataRef());
		dest.variance = source.variance.copy();
	}
}

