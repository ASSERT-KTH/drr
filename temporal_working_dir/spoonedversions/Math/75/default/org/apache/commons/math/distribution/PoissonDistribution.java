

package org.apache.commons.math.distribution;


public interface PoissonDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	double getMean();

	void setMean(double p);

	double normalApproximateProbability(int x) throws org.apache.commons.math.MathException;
}

