

package org.apache.commons.math3.random;


public class UniformRandomGenerator implements org.apache.commons.math3.random.NormalizedRandomGenerator {
	private static final double SQRT3 = org.apache.commons.math3.util.FastMath.sqrt(3.0);

	private final org.apache.commons.math3.random.RandomGenerator generator;

	public UniformRandomGenerator(org.apache.commons.math3.random.RandomGenerator generator) {
		this.generator = generator;
	}

	public double nextNormalizedDouble() {
		return (org.apache.commons.math3.random.UniformRandomGenerator.SQRT3) * ((2 * (generator.nextDouble())) - 1.0);
	}
}

