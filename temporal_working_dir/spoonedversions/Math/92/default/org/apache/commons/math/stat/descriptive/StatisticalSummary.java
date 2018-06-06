

package org.apache.commons.math.stat.descriptive;


public interface StatisticalSummary {
	public abstract double getMean();

	public abstract double getVariance();

	public abstract double getStandardDeviation();

	public abstract double getMax();

	public abstract double getMin();

	public abstract long getN();

	public abstract double getSum();
}

