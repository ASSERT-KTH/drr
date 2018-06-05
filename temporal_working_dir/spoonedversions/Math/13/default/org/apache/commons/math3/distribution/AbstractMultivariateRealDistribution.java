

package org.apache.commons.math3.distribution;


public abstract class AbstractMultivariateRealDistribution implements org.apache.commons.math3.distribution.MultivariateRealDistribution {
	protected final org.apache.commons.math3.random.RandomGenerator random;

	private final int dimension;

	protected AbstractMultivariateRealDistribution(org.apache.commons.math3.random.RandomGenerator rng, int n) {
		random = rng;
		dimension = n;
	}

	public void reseedRandomGenerator(long seed) {
		random.setSeed(seed);
	}

	public int getDimension() {
		return dimension;
	}

	public abstract double[] sample();

	public double[][] sample(final int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		final double[][] out = new double[sampleSize][dimension];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}
}

