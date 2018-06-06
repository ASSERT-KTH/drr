

package org.apache.commons.math.stat.descriptive;


public abstract class SummaryStatistics implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StatisticalSummary {
	private static final long serialVersionUID = -6400596334135654825L;

	public static org.apache.commons.math.stat.descriptive.SummaryStatistics newInstance(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
		return ((org.apache.commons.math.stat.descriptive.SummaryStatistics) (cls.newInstance()));
	}

	public static org.apache.commons.math.stat.descriptive.SummaryStatistics newInstance() {
		org.apache.commons.math.stat.descriptive.SummaryStatistics instance = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			instance = ((org.apache.commons.math.stat.descriptive.SummaryStatistics) (dc.newInstance(org.apache.commons.math.stat.descriptive.SummaryStatistics.class, "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl();
		}
		return instance;
	}

	public org.apache.commons.math.stat.descriptive.StatisticalSummary getSummary() {
		return new org.apache.commons.math.stat.descriptive.StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());
	}

	public abstract void addValue(double v);

	public abstract double getMean();

	public abstract double getGeometricMean();

	public abstract double getVariance();

	public abstract double getStandardDeviation();

	public abstract double getMax();

	public abstract double getMin();

	public abstract long getN();

	public abstract double getSum();

	public abstract double getSumsq();

	public abstract void clear();

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
}

