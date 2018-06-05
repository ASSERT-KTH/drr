

package org.apache.commons.math3.stat.descriptive;


public class SynchronizedMultivariateSummaryStatistics extends org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics {
	private static final long serialVersionUID = 7099834153347155363L;

	public SynchronizedMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {
		super(k, isCovarianceBiasCorrected);
	}

	@java.lang.Override
	public synchronized void addValue(double[] value) {
		super.addValue(value);
	}

	@java.lang.Override
	public synchronized int getDimension() {
		return super.getDimension();
	}

	@java.lang.Override
	public synchronized long getN() {
		return super.getN();
	}

	@java.lang.Override
	public synchronized double[] getSum() {
		return super.getSum();
	}

	@java.lang.Override
	public synchronized double[] getSumSq() {
		return super.getSumSq();
	}

	@java.lang.Override
	public synchronized double[] getSumLog() {
		return super.getSumLog();
	}

	@java.lang.Override
	public synchronized double[] getMean() {
		return super.getMean();
	}

	@java.lang.Override
	public synchronized double[] getStandardDeviation() {
		return super.getStandardDeviation();
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.linear.RealMatrix getCovariance() {
		return super.getCovariance();
	}

	@java.lang.Override
	public synchronized double[] getMax() {
		return super.getMax();
	}

	@java.lang.Override
	public synchronized double[] getMin() {
		return super.getMin();
	}

	@java.lang.Override
	public synchronized double[] getGeometricMean() {
		return super.getGeometricMean();
	}

	@java.lang.Override
	public synchronized java.lang.String toString() {
		return super.toString();
	}

	@java.lang.Override
	public synchronized void clear() {
		super.clear();
	}

	@java.lang.Override
	public synchronized boolean equals(java.lang.Object object) {
		return super.equals(object);
	}

	@java.lang.Override
	public synchronized int hashCode() {
		return super.hashCode();
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumImpl() {
		return super.getSumImpl();
	}

	@java.lang.Override
	public synchronized void setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumImpl) {
		super.setSumImpl(sumImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumsqImpl() {
		return super.getSumsqImpl();
	}

	@java.lang.Override
	public synchronized void setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumsqImpl) {
		super.setSumsqImpl(sumsqImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMinImpl() {
		return super.getMinImpl();
	}

	@java.lang.Override
	public synchronized void setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] minImpl) {
		super.setMinImpl(minImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMaxImpl() {
		return super.getMaxImpl();
	}

	@java.lang.Override
	public synchronized void setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] maxImpl) {
		super.setMaxImpl(maxImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumLogImpl() {
		return super.getSumLogImpl();
	}

	@java.lang.Override
	public synchronized void setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumLogImpl) {
		super.setSumLogImpl(sumLogImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getGeoMeanImpl() {
		return super.getGeoMeanImpl();
	}

	@java.lang.Override
	public synchronized void setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] geoMeanImpl) {
		super.setGeoMeanImpl(geoMeanImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMeanImpl() {
		return super.getMeanImpl();
	}

	@java.lang.Override
	public synchronized void setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] meanImpl) {
		super.setMeanImpl(meanImpl);
	}
}

