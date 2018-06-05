

package org.apache.commons.math3.distribution;


public interface RealDistribution {
	double probability(double x);

	double density(double x);

	double cumulativeProbability(double x);

	double cumulativeProbability(double x0, double x1) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	double inverseCumulativeProbability(double p) throws org.apache.commons.math3.exception.OutOfRangeException;

	double getNumericalMean();

	double getNumericalVariance();

	double getSupportLowerBound();

	double getSupportUpperBound();

	boolean isSupportLowerBoundInclusive();

	boolean isSupportUpperBoundInclusive();

	boolean isSupportConnected();

	void reseedRandomGenerator(long seed);

	double sample();

	double[] sample(int sampleSize);
}

