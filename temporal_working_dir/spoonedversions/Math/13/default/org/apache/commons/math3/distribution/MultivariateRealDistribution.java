

package org.apache.commons.math3.distribution;


public interface MultivariateRealDistribution {
	double density(double[] x);

	void reseedRandomGenerator(long seed);

	int getDimension();

	double[] sample();

	double[][] sample(int sampleSize) throws org.apache.commons.math3.exception.NotStrictlyPositiveException;
}

