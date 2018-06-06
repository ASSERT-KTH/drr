

package org.apache.commons.math.distribution;


public interface PoissonDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	double getMean();

	double normalApproximateProbability(int x);
}

