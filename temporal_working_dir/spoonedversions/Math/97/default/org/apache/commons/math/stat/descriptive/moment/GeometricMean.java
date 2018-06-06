

package org.apache.commons.math.stat.descriptive.moment;


public class GeometricMean extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic {
	private static final long serialVersionUID = -8178734905303459453L;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumOfLogs;

	public GeometricMean() {
		sumOfLogs = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
	}

	public GeometricMean(org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs) {
		org.apache.commons.math.stat.descriptive.moment.GeometricMean.this.sumOfLogs = sumOfLogs;
	}

	public void increment(final double d) {
		sumOfLogs.increment(d);
	}

	public double getResult() {
		if ((sumOfLogs.getN()) > 0) {
			return java.lang.Math.exp(((sumOfLogs.getResult()) / ((double) (sumOfLogs.getN()))));
		}else {
			return java.lang.Double.NaN;
		}
	}

	public void clear() {
		sumOfLogs.clear();
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		return java.lang.Math.exp(((sumOfLogs.evaluate(values, begin, length)) / ((double) (length))));
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

	private void checkEmpty() {
		if ((getN()) > 0) {
			throw new java.lang.IllegalStateException("Implementation must be configured before values are added.");
		}
	}
}

