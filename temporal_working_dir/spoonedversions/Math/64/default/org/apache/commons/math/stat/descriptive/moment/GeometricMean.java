

package org.apache.commons.math.stat.descriptive.moment;


public class GeometricMean extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -8178734905303459453L;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumOfLogs;

	public GeometricMean() {
		sumOfLogs = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
	}

	public GeometricMean(org.apache.commons.math.stat.descriptive.moment.GeometricMean original) {
		super();
		org.apache.commons.math.stat.descriptive.moment.GeometricMean.copy(original, org.apache.commons.math.stat.descriptive.moment.GeometricMean.this);
	}

	public GeometricMean(org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs) {
		org.apache.commons.math.stat.descriptive.moment.GeometricMean.this.sumOfLogs = sumOfLogs;
	}

	@java.lang.Override
	public org.apache.commons.math.stat.descriptive.moment.GeometricMean copy() {
		org.apache.commons.math.stat.descriptive.moment.GeometricMean result = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
		org.apache.commons.math.stat.descriptive.moment.GeometricMean.copy(org.apache.commons.math.stat.descriptive.moment.GeometricMean.this, result);
		return result;
	}

	@java.lang.Override
	public void increment(final double d) {
		sumOfLogs.increment(d);
	}

	@java.lang.Override
	public double getResult() {
		if ((sumOfLogs.getN()) > 0) {
			return java.lang.Math.exp(((sumOfLogs.getResult()) / (sumOfLogs.getN())));
		}else {
			return java.lang.Double.NaN;
		}
	}

	@java.lang.Override
	public void clear() {
		sumOfLogs.clear();
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) {
		return java.lang.Math.exp(((sumOfLogs.evaluate(values, begin, length)) / length));
	}

	public long getN() {
		return sumOfLogs.getN();
	}

	public void setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumLogImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.moment.GeometricMean.this.sumOfLogs = sumLogImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumLogImpl() {
		return sumOfLogs;
	}

	public static void copy(org.apache.commons.math.stat.descriptive.moment.GeometricMean source, org.apache.commons.math.stat.descriptive.moment.GeometricMean dest) {
		dest.sumOfLogs = source.sumOfLogs.copy();
	}

	private void checkEmpty() {
		if ((getN()) > 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, getN());
		}
	}
}

