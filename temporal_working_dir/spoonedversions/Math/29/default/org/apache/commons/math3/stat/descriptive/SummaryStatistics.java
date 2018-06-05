

package org.apache.commons.math3.stat.descriptive;


public class SummaryStatistics implements java.io.Serializable , org.apache.commons.math3.stat.descriptive.StatisticalSummary {
	private static final long serialVersionUID = -2021321786743555871L;

	private long n = 0;

	private org.apache.commons.math3.stat.descriptive.moment.SecondMoment secondMoment = new org.apache.commons.math3.stat.descriptive.moment.SecondMoment();

	private org.apache.commons.math3.stat.descriptive.summary.Sum sum = new org.apache.commons.math3.stat.descriptive.summary.Sum();

	private org.apache.commons.math3.stat.descriptive.summary.SumOfSquares sumsq = new org.apache.commons.math3.stat.descriptive.summary.SumOfSquares();

	private org.apache.commons.math3.stat.descriptive.rank.Min min = new org.apache.commons.math3.stat.descriptive.rank.Min();

	private org.apache.commons.math3.stat.descriptive.rank.Max max = new org.apache.commons.math3.stat.descriptive.rank.Max();

	private org.apache.commons.math3.stat.descriptive.summary.SumOfLogs sumLog = new org.apache.commons.math3.stat.descriptive.summary.SumOfLogs();

	private org.apache.commons.math3.stat.descriptive.moment.GeometricMean geoMean = new org.apache.commons.math3.stat.descriptive.moment.GeometricMean(sumLog);

	private org.apache.commons.math3.stat.descriptive.moment.Mean mean = new org.apache.commons.math3.stat.descriptive.moment.Mean(secondMoment);

	private org.apache.commons.math3.stat.descriptive.moment.Variance variance = new org.apache.commons.math3.stat.descriptive.moment.Variance(secondMoment);

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumImpl = sum;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumsqImpl = sumsq;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic minImpl = min;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic maxImpl = max;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumLogImpl = sumLog;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl = geoMean;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic meanImpl = mean;

	private org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic varianceImpl = variance;

	public SummaryStatistics() {
	}

	public SummaryStatistics(org.apache.commons.math3.stat.descriptive.SummaryStatistics original) {
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.copy(original, org.apache.commons.math3.stat.descriptive.SummaryStatistics.this);
	}

	public org.apache.commons.math3.stat.descriptive.StatisticalSummary getSummary() {
		return new org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());
	}

	public void addValue(double value) {
		sumImpl.increment(value);
		sumsqImpl.increment(value);
		minImpl.increment(value);
		maxImpl.increment(value);
		sumLogImpl.increment(value);
		secondMoment.increment(value);
		if ((meanImpl) != (mean)) {
			meanImpl.increment(value);
		}
		if ((varianceImpl) != (variance)) {
			varianceImpl.increment(value);
		}
		if ((geoMeanImpl) != (geoMean)) {
			geoMeanImpl.increment(value);
		}
		(n)++;
	}

	public long getN() {
		return n;
	}

	public double getSum() {
		return sumImpl.getResult();
	}

	public double getSumsq() {
		return sumsqImpl.getResult();
	}

	public double getMean() {
		return meanImpl.getResult();
	}

	public double getStandardDeviation() {
		double stdDev = java.lang.Double.NaN;
		if ((getN()) > 0) {
			if ((getN()) > 1) {
				stdDev = org.apache.commons.math3.util.FastMath.sqrt(getVariance());
			}else {
				stdDev = 0.0;
			}
		}
		return stdDev;
	}

	public double getVariance() {
		return varianceImpl.getResult();
	}

	public double getPopulationVariance() {
		org.apache.commons.math3.stat.descriptive.moment.Variance populationVariance = new org.apache.commons.math3.stat.descriptive.moment.Variance(secondMoment);
		populationVariance.setBiasCorrected(false);
		return populationVariance.getResult();
	}

	public double getMax() {
		return maxImpl.getResult();
	}

	public double getMin() {
		return minImpl.getResult();
	}

	public double getGeometricMean() {
		return geoMeanImpl.getResult();
	}

	public double getSumOfLogs() {
		return sumLogImpl.getResult();
	}

	public double getSecondMoment() {
		return secondMoment.getResult();
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder outBuffer = new java.lang.StringBuilder();
		java.lang.String endl = "\n";
		outBuffer.append("SummaryStatistics:").append(endl);
		outBuffer.append("n: ").append(getN()).append(endl);
		outBuffer.append("min: ").append(getMin()).append(endl);
		outBuffer.append("max: ").append(getMax()).append(endl);
		outBuffer.append("mean: ").append(getMean()).append(endl);
		outBuffer.append("geometric mean: ").append(getGeometricMean()).append(endl);
		outBuffer.append("variance: ").append(getVariance()).append(endl);
		outBuffer.append("sum of squares: ").append(getSumsq()).append(endl);
		outBuffer.append("standard deviation: ").append(getStandardDeviation()).append(endl);
		outBuffer.append("sum of logs: ").append(getSumOfLogs()).append(endl);
		return outBuffer.toString();
	}

	public void clear() {
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.n = 0;
		minImpl.clear();
		maxImpl.clear();
		sumImpl.clear();
		sumLogImpl.clear();
		sumsqImpl.clear();
		geoMeanImpl.clear();
		secondMoment.clear();
		if ((meanImpl) != (mean)) {
			meanImpl.clear();
		}
		if ((varianceImpl) != (variance)) {
			varianceImpl.clear();
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math3.stat.descriptive.SummaryStatistics.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math3.stat.descriptive.SummaryStatistics) == false) {
			return false;
		}
		org.apache.commons.math3.stat.descriptive.SummaryStatistics stat = ((org.apache.commons.math3.stat.descriptive.SummaryStatistics) (object));
		return (((((((org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean())) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getMax(), getMax()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getMean(), getMean()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getMin(), getMin()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getN(), getN()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getSum(), getSum()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getSumsq(), getSumsq()))) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getVariance(), getVariance()));
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
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getSumsq()));
		result = (result * 31) + (org.apache.commons.math3.util.MathUtils.hash(getVariance()));
		return result;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumImpl() {
		return sumImpl;
	}

	public void setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.sumImpl = sumImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumsqImpl() {
		return sumsqImpl;
	}

	public void setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumsqImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.sumsqImpl = sumsqImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMinImpl() {
		return minImpl;
	}

	public void setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic minImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.minImpl = minImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMaxImpl() {
		return maxImpl;
	}

	public void setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic maxImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.maxImpl = maxImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getSumLogImpl() {
		return sumLogImpl;
	}

	public void setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic sumLogImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.sumLogImpl = sumLogImpl;
		geoMean.setSumLogImpl(sumLogImpl);
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getGeoMeanImpl() {
		return geoMeanImpl;
	}

	public void setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.geoMeanImpl = geoMeanImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getMeanImpl() {
		return meanImpl;
	}

	public void setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic meanImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.meanImpl = meanImpl;
	}

	public org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic getVarianceImpl() {
		return varianceImpl;
	}

	public void setVarianceImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic varianceImpl) {
		checkEmpty();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.this.varianceImpl = varianceImpl;
	}

	private void checkEmpty() {
		if ((n) > 0) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC, n);
		}
	}

	public org.apache.commons.math3.stat.descriptive.SummaryStatistics copy() {
		org.apache.commons.math3.stat.descriptive.SummaryStatistics result = new org.apache.commons.math3.stat.descriptive.SummaryStatistics();
		org.apache.commons.math3.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math3.stat.descriptive.SummaryStatistics.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math3.stat.descriptive.SummaryStatistics source, org.apache.commons.math3.stat.descriptive.SummaryStatistics dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		dest.maxImpl = source.maxImpl.copy();
		dest.minImpl = source.minImpl.copy();
		dest.sumImpl = source.sumImpl.copy();
		dest.sumLogImpl = source.sumLogImpl.copy();
		dest.sumsqImpl = source.sumsqImpl.copy();
		dest.secondMoment = source.secondMoment.copy();
		dest.n = source.n;
		if ((source.getVarianceImpl()) instanceof org.apache.commons.math3.stat.descriptive.moment.Variance) {
			dest.varianceImpl = new org.apache.commons.math3.stat.descriptive.moment.Variance(dest.secondMoment);
		}else {
			dest.varianceImpl = source.varianceImpl.copy();
		}
		if ((source.meanImpl) instanceof org.apache.commons.math3.stat.descriptive.moment.Mean) {
			dest.meanImpl = new org.apache.commons.math3.stat.descriptive.moment.Mean(dest.secondMoment);
		}else {
			dest.meanImpl = source.meanImpl.copy();
		}
		if ((source.getGeoMeanImpl()) instanceof org.apache.commons.math3.stat.descriptive.moment.GeometricMean) {
			dest.geoMeanImpl = new org.apache.commons.math3.stat.descriptive.moment.GeometricMean(((org.apache.commons.math3.stat.descriptive.summary.SumOfLogs) (dest.sumLogImpl)));
		}else {
			dest.geoMeanImpl = source.geoMeanImpl.copy();
		}
		if ((source.geoMean) == (source.geoMeanImpl)) {
			dest.geoMean = ((org.apache.commons.math3.stat.descriptive.moment.GeometricMean) (dest.geoMeanImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.moment.GeometricMean.copy(source.geoMean, dest.geoMean);
		}
		if ((source.max) == (source.maxImpl)) {
			dest.max = ((org.apache.commons.math3.stat.descriptive.rank.Max) (dest.maxImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.rank.Max.copy(source.max, dest.max);
		}
		if ((source.mean) == (source.meanImpl)) {
			dest.mean = ((org.apache.commons.math3.stat.descriptive.moment.Mean) (dest.meanImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.moment.Mean.copy(source.mean, dest.mean);
		}
		if ((source.min) == (source.minImpl)) {
			dest.min = ((org.apache.commons.math3.stat.descriptive.rank.Min) (dest.minImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.rank.Min.copy(source.min, dest.min);
		}
		if ((source.sum) == (source.sumImpl)) {
			dest.sum = ((org.apache.commons.math3.stat.descriptive.summary.Sum) (dest.sumImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.summary.Sum.copy(source.sum, dest.sum);
		}
		if ((source.variance) == (source.varianceImpl)) {
			dest.variance = ((org.apache.commons.math3.stat.descriptive.moment.Variance) (dest.varianceImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.moment.Variance.copy(source.variance, dest.variance);
		}
		if ((source.sumLog) == (source.sumLogImpl)) {
			dest.sumLog = ((org.apache.commons.math3.stat.descriptive.summary.SumOfLogs) (dest.sumLogImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.copy(source.sumLog, dest.sumLog);
		}
		if ((source.sumsq) == (source.sumsqImpl)) {
			dest.sumsq = ((org.apache.commons.math3.stat.descriptive.summary.SumOfSquares) (dest.sumsqImpl));
		}else {
			org.apache.commons.math3.stat.descriptive.summary.SumOfSquares.copy(source.sumsq, dest.sumsq);
		}
	}
}

