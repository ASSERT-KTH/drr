

package org.apache.commons.math.distribution;


public interface ContinuousDistribution extends org.apache.commons.math.distribution.Distribution {
	double inverseCumulativeProbability(double p) throws org.apache.commons.math.MathException;

	double density(double x);

	void reseedRandomGenerator(long seed);

	double sample() throws org.apache.commons.math.MathException;

	double[] sample(int sampleSize) throws org.apache.commons.math.MathException;
}

