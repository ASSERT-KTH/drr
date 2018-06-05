

package org.apache.commons.math.random;


public class RandomAdaptor extends java.util.Random implements org.apache.commons.math.random.RandomGenerator {
	private static final long serialVersionUID = 2570805822599485047L;

	private org.apache.commons.math.random.RandomGenerator randomGenerator = null;

	@java.lang.SuppressWarnings(value = "unused")
	private RandomAdaptor() {
	}

	public RandomAdaptor(org.apache.commons.math.random.RandomGenerator randomGenerator) {
		org.apache.commons.math.random.RandomAdaptor.this.randomGenerator = randomGenerator;
	}

	public static java.util.Random createAdaptor(org.apache.commons.math.random.RandomGenerator randomGenerator) {
		return new org.apache.commons.math.random.RandomAdaptor(randomGenerator);
	}

	public boolean nextBoolean() {
		return randomGenerator.nextBoolean();
	}

	public void nextBytes(byte[] bytes) {
		randomGenerator.nextBytes(bytes);
	}

	public double nextDouble() {
		return randomGenerator.nextDouble();
	}

	public float nextFloat() {
		return randomGenerator.nextFloat();
	}

	public double nextGaussian() {
		return randomGenerator.nextGaussian();
	}

	public int nextInt() {
		return randomGenerator.nextInt();
	}

	public int nextInt(int n) {
		return randomGenerator.nextInt(n);
	}

	public long nextLong() {
		return randomGenerator.nextLong();
	}

	public void setSeed(long seed) {
		if ((randomGenerator) != null) {
			randomGenerator.setSeed(seed);
		}
	}
}

