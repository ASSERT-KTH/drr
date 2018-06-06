

package org.apache.commons.math.random;


public class UniformRandomGenerator implements org.apache.commons.math.random.NormalizedRandomGenerator {
	public UniformRandomGenerator(org.apache.commons.math.random.RandomGenerator generator) {
		org.apache.commons.math.random.UniformRandomGenerator.this.generator = generator;
	}

	public double nextNormalizedDouble() {
		return (org.apache.commons.math.random.UniformRandomGenerator.SQRT3) * ((2 * (generator.nextDouble())) - 1.0);
	}

	private org.apache.commons.math.random.RandomGenerator generator;

	private static final double SQRT3 = java.lang.Math.sqrt(3.0);
}

