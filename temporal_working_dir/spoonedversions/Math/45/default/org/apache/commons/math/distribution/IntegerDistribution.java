

package org.apache.commons.math.distribution;


public interface IntegerDistribution extends org.apache.commons.math.distribution.DiscreteDistribution {
	double probability(int x);

	double cumulativeProbability(int x);

	double cumulativeProbability(int x0, int x1);

	int inverseCumulativeProbability(double p);

	void reseedRandomGenerator(long seed);

	int sample();

	int[] sample(int sampleSize);
}

