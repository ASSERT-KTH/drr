

package org.apache.commons.math3.distribution;


public abstract class AbstractMultivariateRealDistribution implements org.apache.commons.math3.distribution.MultivariateRealDistribution {
	protected final org.apache.commons.math3.random.RandomGenerator random;

	private final int numDimensions;

	protected AbstractMultivariateRealDistribution(org.apache.commons.math3.random.RandomGenerator rng, int n) {
		random = rng;
		numDimensions = n;
	}

	public void reseedRandomGenerator(long seed) {
		random.setSeed(seed);
	}

	public int getDimensions() {
		return numDimensions;
	}

	public abstract double[] sample();

	public double[][] sample(final int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		final double[][] out = new double[sampleSize][numDimensions];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}

	public double probability(double[] x) {
		return 0;
	}

	public double getSupportLowerBound() {
		return java.lang.Double.NEGATIVE_INFINITY;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return false;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return false;
	}
}

