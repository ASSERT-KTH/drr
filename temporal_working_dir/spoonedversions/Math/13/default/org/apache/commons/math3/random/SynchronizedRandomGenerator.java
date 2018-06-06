

package org.apache.commons.math3.random;


public class SynchronizedRandomGenerator implements org.apache.commons.math3.random.RandomGenerator {
	private final org.apache.commons.math3.random.RandomGenerator wrapped;

	public SynchronizedRandomGenerator(org.apache.commons.math3.random.RandomGenerator rng) {
		wrapped = rng;
	}

	public synchronized void setSeed(int seed) {
		wrapped.setSeed(seed);
	}

	public synchronized void setSeed(int[] seed) {
		wrapped.setSeed(seed);
	}

	public synchronized void setSeed(long seed) {
		wrapped.setSeed(seed);
	}

	public synchronized void nextBytes(byte[] bytes) {
		wrapped.nextBytes(bytes);
	}

	public synchronized int nextInt() {
		return wrapped.nextInt();
	}

	public synchronized int nextInt(int n) {
		return wrapped.nextInt(n);
	}

	public synchronized long nextLong() {
		return wrapped.nextLong();
	}

	public synchronized boolean nextBoolean() {
		return wrapped.nextBoolean();
	}

	public synchronized float nextFloat() {
		return wrapped.nextFloat();
	}

	public synchronized double nextDouble() {
		return wrapped.nextDouble();
	}

	public synchronized double nextGaussian() {
		return wrapped.nextGaussian();
	}
}

