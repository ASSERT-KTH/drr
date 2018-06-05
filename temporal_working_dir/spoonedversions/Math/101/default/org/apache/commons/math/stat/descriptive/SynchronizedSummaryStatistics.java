

package org.apache.commons.math.stat.descriptive;


public class SynchronizedSummaryStatistics extends org.apache.commons.math.stat.descriptive.SummaryStatistics {
	private static final long serialVersionUID = 1909861009042253704L;

	public SynchronizedSummaryStatistics() {
		super();
	}

	public synchronized org.apache.commons.math.stat.descriptive.StatisticalSummary getSummary() {
		return super.getSummary();
	}

	public synchronized void addValue(double value) {
		super.addValue(value);
	}

	public synchronized long getN() {
		return super.getN();
	}

	public synchronized double getSum() {
		return super.getSum();
	}

	public synchronized double getSumsq() {
		return super.getSumsq();
	}

	public synchronized double getMean() {
		return super.getMean();
	}

	public synchronized double getStandardDeviation() {
		return super.getStandardDeviation();
	}

	public synchronized double getVariance() {
		return super.getVariance();
	}

	public synchronized double getMax() {
		return super.getMax();
	}

	public synchronized double getMin() {
		return super.getMin();
	}

	public synchronized double getGeometricMean() {
		return super.getGeometricMean();
	}

	public synchronized java.lang.String toString() {
		return super.toString();
	}

	public synchronized void clear() {
		super.clear();
	}

	public synchronized boolean equals(java.lang.Object object) {
		return super.equals(object);
	}

	public synchronized int hashCode() {
		return super.hashCode();
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumImpl() {
		return super.getSumImpl();
	}

	public synchronized void setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumImpl) {
		super.setSumImpl(sumImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumsqImpl() {
		return super.getSumsqImpl();
	}

	public synchronized void setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumsqImpl) {
		super.setSumsqImpl(sumsqImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMinImpl() {
		return super.getMinImpl();
	}

	public synchronized void setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic minImpl) {
		super.setMinImpl(minImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMaxImpl() {
		return super.getMaxImpl();
	}

	public synchronized void setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic maxImpl) {
		super.setMaxImpl(maxImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumLogImpl() {
		return super.getSumLogImpl();
	}

	public synchronized void setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumLogImpl) {
		super.setSumLogImpl(sumLogImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getGeoMeanImpl() {
		return super.getGeoMeanImpl();
	}

	public synchronized void setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl) {
		super.setGeoMeanImpl(geoMeanImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMeanImpl() {
		return super.getMeanImpl();
	}

	public synchronized void setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic meanImpl) {
		super.setMeanImpl(meanImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getVarianceImpl() {
		return super.getVarianceImpl();
	}

	public synchronized void setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic varianceImpl) {
		super.setVarianceImpl(varianceImpl);
	}
}

