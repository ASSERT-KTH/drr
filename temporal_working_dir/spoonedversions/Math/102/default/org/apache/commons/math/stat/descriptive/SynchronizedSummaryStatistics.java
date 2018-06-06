

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
}

