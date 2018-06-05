

package org.apache.commons.math.stat.descriptive;


public class SummaryStatisticsImpl extends org.apache.commons.math.stat.descriptive.SummaryStatistics implements java.io.Serializable {
	private static final long serialVersionUID = 8787174276883311692L;

	protected long n = 0;

	protected org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment = null;

	protected org.apache.commons.math.stat.descriptive.summary.Sum sum = null;

	protected org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumsq = null;

	protected org.apache.commons.math.stat.descriptive.rank.Min min = null;

	protected org.apache.commons.math.stat.descriptive.rank.Max max = null;

	protected org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumLog = null;

	protected org.apache.commons.math.stat.descriptive.moment.GeometricMean geoMean = null;

	protected org.apache.commons.math.stat.descriptive.moment.Mean mean = null;

	protected org.apache.commons.math.stat.descriptive.moment.Variance variance = null;

	public SummaryStatisticsImpl() {
		sum = new org.apache.commons.math.stat.descriptive.summary.Sum();
		sumsq = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();
		min = new org.apache.commons.math.stat.descriptive.rank.Min();
		max = new org.apache.commons.math.stat.descriptive.rank.Max();
		sumLog = new org.apache.commons.math.stat.descriptive.summary.SumOfLogs();
		geoMean = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();
		secondMoment = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
	}

	public void addValue(double value) {
		sum.increment(value);
		sumsq.increment(value);
		min.increment(value);
		max.increment(value);
		sumLog.increment(value);
		geoMean.increment(value);
		secondMoment.increment(value);
		(n)++;
	}

	public long getN() {
		return n;
	}

	public double getSum() {
		return sum.getResult();
	}

	public double getSumsq() {
		return sumsq.getResult();
	}

	public double getMean() {
		return new org.apache.commons.math.stat.descriptive.moment.Mean(secondMoment).getResult();
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
		return new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment).getResult();
	}

	public double getMax() {
		return max.getResult();
	}

	public double getMin() {
		return min.getResult();
	}

	public double getGeometricMean() {
		return geoMean.getResult();
	}

	public java.lang.String toString() {
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
		outBuffer.append("SummaryStatistics:\n");
		outBuffer.append((("n: " + (getN())) + "\n"));
		outBuffer.append((("min: " + (getMin())) + "\n"));
		outBuffer.append((("max: " + (getMax())) + "\n"));
		outBuffer.append((("mean: " + (getMean())) + "\n"));
		outBuffer.append((("geometric mean: " + (getGeometricMean())) + "\n"));
		outBuffer.append((("variance: " + (getVariance())) + "\n"));
		outBuffer.append((("sum of squares: " + (getSumsq())) + "\n"));
		outBuffer.append((("standard deviation: " + (getStandardDeviation())) + "\n"));
		return outBuffer.toString();
	}

	public void clear() {
		org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.this.n = 0;
		min.clear();
		max.clear();
		sum.clear();
		sumLog.clear();
		sumsq.clear();
		geoMean.clear();
		secondMoment.clear();
	}
}

