

package org.apache.commons.math3.distribution;


public interface MultivariateRealDistribution {
	double probability(double[] x);

	double density(double[] x);

	double getSupportLowerBound();

	double getSupportUpperBound();

	boolean isSupportLowerBoundInclusive();

	boolean isSupportUpperBoundInclusive();

	boolean isSupportConnected();

	void reseedRandomGenerator(long seed);

	double[] sample();

	double[][] sample(int sampleSize) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;
}

