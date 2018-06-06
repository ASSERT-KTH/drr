

package org.apache.commons.math3.stat.descriptive;


public class SynchronizedSummaryStatistics extends org.apache.commons.math3.stat.descriptive.SummaryStatistics {
	private static final long serialVersionUID = 1909861009042253704L;

	public SynchronizedSummaryStatistics() {
		super();
	}

	public SynchronizedSummaryStatistics(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics original) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy(original, org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.this);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StatisticalSummary getSummary() {
		return super.getSummary();
	}

	@java.lang.Override
	public synchronized void addValue(double value) {
		super.addValue(value);
	}

	@java.lang.Override
	public synchronized long getN() {
		return super.getN();
	}

	@java.lang.Override
	public synchronized double getSum() {
		return super.getSum();
	}

	@java.lang.Override
	public synchronized double getSumsq() {
		return super.getSumsq();
	}

	@java.lang.Override
	public synchronized double getMean() {
		return super.getMean();
	}

	@java.lang.Override
	public synchronized double getStandardDeviation() {
		return super.getStandardDeviation();
	}

	@java.lang.Override
	public synchronized double getVariance() {
		return super.getVariance();
	}

	@java.lang.Override
	public synchronized double getPopulationVariance() {
		return super.getPopulationVariance();
	}

	@java.lang.Override
	public synchronized double getMax() {
		return super.getMax();
	}

	@java.lang.Override
	public synchronized double getMin() {
		return super.getMin();
	}

	@java.lang.Override
	public synchronized double getGeometricMean() {
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
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumImpl() {
		return super.getSumImpl();
	}

	@java.lang.Override
	public synchronized void setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setSumImpl(sumImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumsqImpl() {
		return super.getSumsqImpl();
	}

	@java.lang.Override
	public synchronized void setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumsqImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setSumsqImpl(sumsqImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMinImpl() {
		return super.getMinImpl();
	}

	@java.lang.Override
	public synchronized void setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic minImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setMinImpl(minImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMaxImpl() {
		return super.getMaxImpl();
	}

	@java.lang.Override
	public synchronized void setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic maxImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setMaxImpl(maxImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumLogImpl() {
		return super.getSumLogImpl();
	}

	@java.lang.Override
	public synchronized void setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumLogImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setSumLogImpl(sumLogImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getGeoMeanImpl() {
		return super.getGeoMeanImpl();
	}

	@java.lang.Override
	public synchronized void setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setGeoMeanImpl(geoMeanImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMeanImpl() {
		return super.getMeanImpl();
	}

	@java.lang.Override
	public synchronized void setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic meanImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setMeanImpl(meanImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getVarianceImpl() {
		return super.getVarianceImpl();
	}

	@java.lang.Override
	public synchronized void setVarianceImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic varianceImpl) throws org.apache.commons.math3.exception.MathIllegalStateException {
		super.setVarianceImpl(varianceImpl);
	}

	@java.lang.Override
	public synchronized org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics copy() {
		org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics result = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics();
		org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics source, org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		synchronized(source) {
			synchronized(dest) {
				org.apache.commons.math3.stat.descriptive.SummaryStatistics.copy(source, dest);
			}
		}
	}
}

