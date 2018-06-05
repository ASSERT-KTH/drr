

package org.apache.commons.math3.stat.descriptive;


public class MultivariateSummaryStatistics implements java.io.Serializable , org.apache.commons.math3.stat.descriptive.StatisticalMultivariateSummary {
	private static final long serialVersionUID = 2271900808994826718L;

	private int k;

	private long n = 0;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumSqImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] minImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] maxImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumLogImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] geoMeanImpl;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] meanImpl;

	private org.apache.commons.math3.stat.descriptive.moment.VectorialCovariance covarianceImpl;

	public MultivariateSummaryStatistics(int k, boolean isCovarianceBiasCorrected) {
		org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.k = k;
		sumImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		sumSqImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		minImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		maxImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		sumLogImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		geoMeanImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		meanImpl = new org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[k];
		for (int i = 0; i < k; ++i) {
			sumImpl[i] = new org.apache.commons.math3.stat.descriptive.summary.Sum();
			sumSqImpl[i] = new org.apache.commons.math3.stat.descriptive.summary.SumOfSquares();
			minImpl[i] = new org.apache.commons.math3.stat.descriptive.rank.Min();
			maxImpl[i] = new org.apache.commons.math3.stat.descriptive.rank.Max();
			sumLogImpl[i] = new org.apache.commons.math3.stat.descriptive.summary.SumOfLogs();
			geoMeanImpl[i] = new org.apache.commons.math3.stat.descriptive.moment.GeometricMean();
			meanImpl[i] = new org.apache.commons.math3.stat.descriptive.moment.Mean();
		}
		covarianceImpl = new org.apache.commons.math3.stat.descriptive.moment.VectorialCovariance(k, isCovarianceBiasCorrected);
	}

	public void addValue(double[] value) {
		checkDimension(value.length);
		for (int i = 0; i < (k); ++i) {
			double v = value[i];
			sumImpl[i].increment(v);
			sumSqImpl[i].increment(v);
			minImpl[i].increment(v);
			maxImpl[i].increment(v);
			sumLogImpl[i].increment(v);
			geoMeanImpl[i].increment(v);
			meanImpl[i].increment(v);
		}
		covarianceImpl.increment(value);
		(n)++;
	}

	public int getDimension() {
		return k;
	}

	public long getN() {
		return n;
	}

	private double[] getResults(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] stats) {
		double[] results = new double[stats.length];
		for (int i = 0; i < (results.length); ++i) {
			results[i] = stats[i].getResult();
		}
		return results;
	}

	public double[] getSum() {
		return getResults(sumImpl);
	}

	public double[] getSumSq() {
		return getResults(sumSqImpl);
	}

	public double[] getSumLog() {
		return getResults(sumLogImpl);
	}

	public double[] getMean() {
		return getResults(meanImpl);
	}

	public double[] getStandardDeviation() {
		double[] stdDev = new double[k];
		if ((getN()) < 1) {
			java.util.Arrays.fill(stdDev, java.lang.Double.NaN);
		}else
			if ((getN()) < 2) {
				java.util.Arrays.fill(stdDev, 0.0);
			}else {
				org.apache.commons.math3.linear.RealMatrix matrix = covarianceImpl.getResult();
				for (int i = 0; i < (k); ++i) {
					stdDev[i] = org.apache.commons.math3.util.FastMath.sqrt(matrix.getEntry(i, i));
				}
			}
		
		return stdDev;
	}

	public org.apache.commons.math3.linear.RealMatrix getCovariance() {
		return covarianceImpl.getResult();
	}

	public double[] getMax() {
		return getResults(maxImpl);
	}

	public double[] getMin() {
		return getResults(minImpl);
	}

	public double[] getGeometricMean() {
		return getResults(geoMeanImpl);
	}

	@java.lang.Override
	public java.lang.String toString() {
		final java.lang.String separator = ", ";
		final java.lang.String suffix = java.lang.System.getProperty("line.separator");
		java.lang.StringBuilder outBuffer = new java.lang.StringBuilder();
		outBuffer.append(("MultivariateSummaryStatistics:" + suffix));
		outBuffer.append((("n: " + (getN())) + suffix));
		append(outBuffer, getMin(), "min: ", separator, suffix);
		append(outBuffer, getMax(), "max: ", separator, suffix);
		append(outBuffer, getMean(), "mean: ", separator, suffix);
		append(outBuffer, getGeometricMean(), "geometric mean: ", separator, suffix);
		append(outBuffer, getSumSq(), "sum of squares: ", separator, suffix);
		append(outBuffer, getSumLog(), "sum of logarithms: ", separator, suffix);
		append(outBuffer, getStandardDeviation(), "standard deviation: ", separator, suffix);
		outBuffer.append((("covariance: " + (getCovariance().toString())) + suffix));
		return outBuffer.toString();
	}

	private void append(java.lang.StringBuilder buffer, double[] data, java.lang.String prefix, java.lang.String separator, java.lang.String suffix) {
		buffer.append(prefix);
		for (int i = 0; i < (data.length); ++i) {
			if (i > 0) {
				buffer.append(separator);
			}
			buffer.append(data[i]);
		}
		buffer.append(suffix);
	}

	public void clear() {
		org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.n = 0;
		for (int i = 0; i < (k); ++i) {
			minImpl[i].clear();
			maxImpl[i].clear();
			sumImpl[i].clear();
			sumLogImpl[i].clear();
			sumSqImpl[i].clear();
			geoMeanImpl[i].clear();
			meanImpl[i].clear();
		}
		covarianceImpl.clear();
	}

	@java.lang.Override
	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics) == false) {
			return false;
		}
		org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics stat = ((org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics) (object));
		return ((((((((org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean())) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getMax(), getMax()))) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getMean(), getMean()))) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getMin(), getMin()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getN(), getN()))) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getSum(), getSum()))) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getSumSq(), getSumSq()))) && (org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(stat.getSumLog(), getSumLog()))) && (stat.getCovariance().equals(getCovariance()));
	}

	@java.lang.Override
	public int hashCode() {
		int result = 31 + (org.apache.commons.math3.util.MathUtils.hash(getGeometricMean()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getGeometricMean()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getMax()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getMean()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getMin()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getN()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getSum()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getSumSq()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getSumLog()));
		result = (result * 31) + (getCovariance().hashCode());
		return result;
	}

	private void setImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] newImpl, org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] oldImpl) {
		checkEmpty();
		checkDimension(newImpl.length);
		java.lang.System.arraycopy(newImpl, 0, oldImpl, 0, newImpl.length);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumImpl() {
		return sumImpl.clone();
	}

	public void setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumImpl) {
		setImpl(sumImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.sumImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumsqImpl() {
		return sumSqImpl.clone();
	}

	public void setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumsqImpl) {
		setImpl(sumsqImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.sumSqImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMinImpl() {
		return minImpl.clone();
	}

	public void setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] minImpl) {
		setImpl(minImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.minImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMaxImpl() {
		return maxImpl.clone();
	}

	public void setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] maxImpl) {
		setImpl(maxImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.maxImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getSumLogImpl() {
		return sumLogImpl.clone();
	}

	public void setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] sumLogImpl) {
		setImpl(sumLogImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.sumLogImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getGeoMeanImpl() {
		return geoMeanImpl.clone();
	}

	public void setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] geoMeanImpl) {
		setImpl(geoMeanImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.geoMeanImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] getMeanImpl() {
		return meanImpl.clone();
	}

	public void setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[] meanImpl) {
		setImpl(meanImpl, org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.this.meanImpl);
	}

	private void checkEmpty() {
		if ((n) > 0) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, n);
		}
	}

	private void checkDimension(int dimension) {
		if (dimension != (k)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(dimension, k);
		}
	}
}

