

package org.apache.commons.math.stat.descriptive;


public class SummaryStatistics implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StatisticalSummary {
	private static final long serialVersionUID = -2021321786743555871L;

	public SummaryStatistics() {
	}

	protected long n = 0;

	protected org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();

	protected org.apache.commons.math.stat.descriptive.summary.Sum sum = new org.apache.commons.math.stat.descriptive.summary.Sum();

	protected org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumsq = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();

	protected org.apache.commons.math.stat.descriptive.rank.Min min = new org.apache.commons.math.stat.descriptive.rank.Min();

	protected org.apache.commons.math.stat.descriptive.rank.Max max = new org.apache.commons.math.stat.descriptive.rank.Max();

	protected org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumLog = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();

	protected org.apache.commons.math.stat.descriptive.moment.GeometricMean geoMean = new org.apache.commons.math.stat.descriptive.moment.GeometricMean(sumLog);

	protected org.apache.commons.math.stat.descriptive.moment.Mean mean = new org.apache.commons.math.stat.descriptive.moment.Mean();

	protected org.apache.commons.math.stat.descriptive.moment.Variance variance = new org.apache.commons.math.stat.descriptive.moment.Variance();

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumImpl = sum;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumsqImpl = sumsq;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic minImpl = min;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic maxImpl = max;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumLogImpl = sumLog;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl = geoMean;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic meanImpl = mean;

	private org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic varianceImpl = variance;

	public org.apache.commons.math.stat.descriptive.StatisticalSummary getSummary() {
		return new org.apache.commons.math.stat.descriptive.StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());
	}

	public void addValue(double value) {
		sumImpl.increment(value);
		sumsqImpl.increment(value);
		minImpl.increment(value);
		maxImpl.increment(value);
		sumLogImpl.increment(value);
		secondMoment.increment(value);
		if (!((meanImpl) instanceof org.apache.commons.math.stat.descriptive.moment.Mean)) {
			meanImpl.increment(value);
		}
		if (!((varianceImpl) instanceof org.apache.commons.math.stat.descriptive.moment.Variance)) {
			varianceImpl.increment(value);
		}
		if (!((geoMeanImpl) instanceof org.apache.commons.math.stat.descriptive.moment.GeometricMean)) {
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
		if ((mean) == (meanImpl)) {
			return new org.apache.commons.math.stat.descriptive.moment.Mean(secondMoment).getResult();
		}else {
			return meanImpl.getResult();
		}
	}

	public double getStandardDeviation() {
		double stdDev = java.lang.Double.NaN;
		if ((getN()) > 0) {
			if ((getN()) > 1) {
				stdDev = java.lang.Math.sqrt(getVariance());
			}else {
				stdDev = 0.0;
			}
		}
		return stdDev;
	}

	public double getVariance() {
		if ((varianceImpl) == (variance)) {
			return new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment).getResult();
		}else {
			return varianceImpl.getResult();
		}
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

	public java.lang.String toString() {
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
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
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.n = 0;
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

	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math.stat.descriptive.SummaryStatistics.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.stat.descriptive.SummaryStatistics) == false) {
			return false;
		}
		org.apache.commons.math.stat.descriptive.SummaryStatistics stat = ((org.apache.commons.math.stat.descriptive.SummaryStatistics) (object));
		return (((((((org.apache.commons.math.util.MathUtils.equals(stat.getGeometricMean(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getGeometricMean())) && (org.apache.commons.math.util.MathUtils.equals(stat.getMax(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getMax()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getMean(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getMean()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getMin(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getMin()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getN(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getN()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getSum(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getSum()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getSumsq(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getSumsq()))) && (org.apache.commons.math.util.MathUtils.equals(stat.getVariance(), org.apache.commons.math.stat.descriptive.SummaryStatistics.this.getVariance()));
	}

	public int hashCode() {
		int result = 31 + (org.apache.commons.math.util.MathUtils.hash(getGeometricMean()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getGeometricMean()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getMax()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getMean()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getMin()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getN()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getSum()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getSumsq()));
		result = (result * 31) + (org.apache.commons.math.util.MathUtils.hash(getVariance()));
		return result;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumImpl() {
		return sumImpl;
	}

	public void setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.sumImpl = sumImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumsqImpl() {
		return sumsqImpl;
	}

	public void setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumsqImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.sumsqImpl = sumsqImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMinImpl() {
		return minImpl;
	}

	public void setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic minImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.minImpl = minImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMaxImpl() {
		return maxImpl;
	}

	public void setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic maxImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.maxImpl = maxImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getSumLogImpl() {
		return sumLogImpl;
	}

	public void setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic sumLogImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.sumLogImpl = sumLogImpl;
		geoMean.setSumLogImpl(sumLogImpl);
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getGeoMeanImpl() {
		return geoMeanImpl;
	}

	public void setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic geoMeanImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.geoMeanImpl = geoMeanImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getMeanImpl() {
		return meanImpl;
	}

	public void setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic meanImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.meanImpl = meanImpl;
	}

	public org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic getVarianceImpl() {
		return varianceImpl;
	}

	public void setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic varianceImpl) {
		checkEmpty();
		org.apache.commons.math.stat.descriptive.SummaryStatistics.this.varianceImpl = varianceImpl;
	}

	private void checkEmpty() {
		if ((n) > 0) {
			throw new java.lang.IllegalStateException("Implementations must be configured before values are added.");
		}
	}
}

