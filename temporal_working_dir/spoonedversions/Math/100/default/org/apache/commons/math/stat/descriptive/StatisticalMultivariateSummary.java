

package org.apache.commons.math.stat.descriptive;


public interface StatisticalMultivariateSummary {
	public int getDimension();

	public abstract double[] getMean();

	public abstract org.apache.commons.math.linear.RealMatrix getCovariance();

	public abstract double[] getStandardDeviation();

	public abstract double[] getMax();

	public abstract double[] getMin();

	public abstract long getN();

	public double[] getGeometricMean();

	public abstract double[] getSum();

	public abstract double[] getSumSq();

	public abstract double[] getSumLog();
}

