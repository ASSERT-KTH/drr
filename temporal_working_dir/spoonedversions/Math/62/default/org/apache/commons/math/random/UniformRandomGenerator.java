

package org.apache.commons.math.random;


public class UniformRandomGenerator implements org.apache.commons.math.random.NormalizedRandomGenerator {
	private static final long serialVersionUID = 1569292426375546027L;

	private static final double SQRT3 = org.apache.commons.math.util.FastMath.sqrt(3.0);

	private final org.apache.commons.math.random.RandomGenerator generator;

	public UniformRandomGenerator(org.apache.commons.math.random.RandomGenerator generator) {
		this.generator = generator;
	}

	public double nextNormalizedDouble() {
		return (org.apache.commons.math.random.UniformRandomGenerator.SQRT3) * ((2 * (generator.nextDouble())) - 1.0);
	}
}

