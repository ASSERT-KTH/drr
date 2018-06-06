

package org.apache.commons.math.stat.descriptive;


public class SynchronizedMultivariateSummaryStatistics extends org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics {
	private static final long serialVersionUID = 7099834153347155363L;

	public SynchronizedMultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {
		super(k, isCovarianceBiasCorrected);
	}

	public synchronized void addValue(double[] value) throws org.apache.commons.math.DimensionMismatchException {
		super.addValue(value);
	}

	public synchronized int getDimension() {
		return super.getDimension();
	}

	public synchronized long getN() {
		return super.getN();
	}

	public synchronized double[] getSum() {
		return super.getSum();
	}

	public synchronized double[] getSumSq() {
		return super.getSumSq();
	}

	public synchronized double[] getSumLog() {
		return super.getSumLog();
	}

	public synchronized double[] getMean() {
		return super.getMean();
	}

	public synchronized double[] getStandardDeviation() {
		return super.getStandardDeviation();
	}

	public synchronized org.apache.commons.math.linear.RealMatrix getCovariance() {
		return super.getCovariance();
	}

	public synchronized double[] getMax() {
		return super.getMax();
	}

	public synchronized double[] getMin() {
		return super.getMin();
	}

	public synchronized double[] getGeometricMean() {
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

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getSumImpl() {
		return super.getSumImpl();
	}

	public synchronized void setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] sumImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setSumImpl(sumImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getSumsqImpl() {
		return super.getSumsqImpl();
	}

	public synchronized void setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] sumsqImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setSumsqImpl(sumsqImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getMinImpl() {
		return super.getMinImpl();
	}

	public synchronized void setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] minImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setMinImpl(minImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getMaxImpl() {
		return super.getMaxImpl();
	}

	public synchronized void setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] maxImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setMaxImpl(maxImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getSumLogImpl() {
		return super.getSumLogImpl();
	}

	public synchronized void setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] sumLogImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setSumLogImpl(sumLogImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getGeoMeanImpl() {
		return super.getGeoMeanImpl();
	}

	public synchronized void setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] geoMeanImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setGeoMeanImpl(geoMeanImpl);
	}

	public synchronized org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] getMeanImpl() {
		return super.getMeanImpl();
	}

	public synchronized void setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[] meanImpl) throws org.apache.commons.math.DimensionMismatchException {
		super.setMeanImpl(meanImpl);
	}
}

