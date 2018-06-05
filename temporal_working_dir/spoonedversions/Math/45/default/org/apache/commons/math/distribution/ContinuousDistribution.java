

package org.apache.commons.math.distribution;


public interface ContinuousDistribution extends org.apache.commons.math.distribution.Distribution {
	double inverseCumulativeProbability(double p);

	double density(double x);

	void reseedRandomGenerator(long seed);

	double sample();

	double[] sample(int sampleSize);
}

