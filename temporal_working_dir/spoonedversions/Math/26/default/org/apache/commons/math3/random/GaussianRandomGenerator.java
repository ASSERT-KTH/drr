

package org.apache.commons.math3.random;


public class GaussianRandomGenerator implements org.apache.commons.math3.random.NormalizedRandomGenerator {
	private final org.apache.commons.math3.random.RandomGenerator generator;

	public GaussianRandomGenerator(final org.apache.commons.math3.random.RandomGenerator generator) {
		this.generator = generator;
	}

	public double nextNormalizedDouble() {
		return generator.nextGaussian();
	}
}

