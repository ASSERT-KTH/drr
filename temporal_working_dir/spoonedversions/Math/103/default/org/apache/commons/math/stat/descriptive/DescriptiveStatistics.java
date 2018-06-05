

package org.apache.commons.math.stat.descriptive;


public abstract class DescriptiveStatistics implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StatisticalSummary {
	private static final long serialVersionUID = 5188298269533339922L;

	public static org.apache.commons.math.stat.descriptive.DescriptiveStatistics newInstance(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
		return ((org.apache.commons.math.stat.descriptive.DescriptiveStatistics) (cls.newInstance()));
	}

	public static org.apache.commons.math.stat.descriptive.DescriptiveStatistics newInstance() {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics factory = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			factory = ((org.apache.commons.math.stat.descriptive.DescriptiveStatistics) (dc.newInstance(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.class, "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl();
		}
		return factory;
	}

	public static final int INFINITE_WINDOW = -1;

	public abstract void addValue(double v);

	public double getMean() {
		return apply(new org.apache.commons.math.stat.descriptive.moment.Mean());
	}

	public double getGeometricMean() {
		return apply(new org.apache.commons.math.stat.descriptive.moment.GeometricMean());
	}

	public double getVariance() {
		return apply(new org.apache.commons.math.stat.descriptive.moment.Variance());
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

	public double getSkewness() {
		return apply(new org.apache.commons.math.stat.descriptive.moment.Skewness());
	}

	public double getKurtosis() {
		return apply(new org.apache.commons.math.stat.descriptive.moment.Kurtosis());
	}

	public double getMax() {
		return apply(new org.apache.commons.math.stat.descriptive.rank.Max());
	}

	public double getMin() {
		return apply(new org.apache.commons.math.stat.descriptive.rank.Min());
	}

	public abstract long getN();

	public double getSum() {
		return apply(new org.apache.commons.math.stat.descriptive.summary.Sum());
	}

	public double getSumsq() {
		return apply(new org.apache.commons.math.stat.descriptive.summary.SumOfSquares());
	}

	public abstract void clear();

	public abstract int getWindowSize();

	public abstract void setWindowSize(int windowSize);

	public abstract double[] getValues();

	public double[] getSortedValues() {
		double[] sort = getValues();
		java.util.Arrays.sort(sort);
		return sort;
	}

	public abstract double getElement(int index);

	public double getPercentile(double p) {
		return apply(new org.apache.commons.math.stat.descriptive.rank.Percentile(p));
	}

	public java.lang.String toString() {
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
		outBuffer.append("DescriptiveStatistics:\n");
		outBuffer.append((("n: " + (getN())) + "\n"));
		outBuffer.append((("min: " + (getMin())) + "\n"));
		outBuffer.append((("max: " + (getMax())) + "\n"));
		outBuffer.append((("mean: " + (getMean())) + "\n"));
		outBuffer.append((("std dev: " + (getStandardDeviation())) + "\n"));
		outBuffer.append((("median: " + (getPercentile(50))) + "\n"));
		outBuffer.append((("skewness: " + (getSkewness())) + "\n"));
		outBuffer.append((("kurtosis: " + (getKurtosis())) + "\n"));
		return outBuffer.toString();
	}

	public abstract double apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic stat);
}

