

package org.apache.commons.math.distribution;


public interface PoissonDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	public double getMean();

	public void setMean(double p);

	public double normalApproximateProbability(int x) throws org.apache.commons.math.MathException;
}

