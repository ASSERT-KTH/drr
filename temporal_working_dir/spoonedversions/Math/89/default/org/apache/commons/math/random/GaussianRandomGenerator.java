

package org.apache.commons.math.random;


public class GaussianRandomGenerator implements org.apache.commons.math.random.NormalizedRandomGenerator {
	private static final long serialVersionUID = -4698731518385853565L;

	public GaussianRandomGenerator(org.apache.commons.math.random.RandomGenerator generator) {
		org.apache.commons.math.random.GaussianRandomGenerator.this.generator = generator;
	}

	public double nextNormalizedDouble() {
		return generator.nextGaussian();
	}

	private org.apache.commons.math.random.RandomGenerator generator;
}

