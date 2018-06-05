

package org.apache.commons.math.distribution;


public interface IntegerDistribution {
	double probability(int x);

	double cumulativeProbability(int x);

	double cumulativeProbability(int x0, int x1);

	int inverseCumulativeProbability(double p);

	double getNumericalMean();

	double getNumericalVariance();

	int getSupportLowerBound();

	int getSupportUpperBound();

	boolean isSupportConnected();

	void reseedRandomGenerator(long seed);

	int sample();

	int[] sample(int sampleSize);
}

