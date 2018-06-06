

package org.apache.commons.lang.math;


public final class JVMRandom extends java.util.Random {
	private boolean constructed = false;

	public JVMRandom() {
		org.apache.commons.lang.math.JVMRandom.this.constructed = true;
	}

	public synchronized void setSeed(long seed) {
		if (org.apache.commons.lang.math.JVMRandom.this.constructed) {
			throw new java.lang.UnsupportedOperationException();
		}
	}

	public synchronized double nextGaussian() {
		throw new java.lang.UnsupportedOperationException();
	}

	public void nextBytes(byte[] byteArray) {
		throw new java.lang.UnsupportedOperationException();
	}

	public int nextInt() {
		return nextInt(java.lang.Integer.MAX_VALUE);
	}

	public int nextInt(int n) {
		if (n <= 0) {
			throw new java.lang.IllegalArgumentException("Upper bound for nextInt must be positive");
		}
		return ((int) ((java.lang.Math.random()) * n));
	}

	public long nextLong() {
		return org.apache.commons.lang.math.JVMRandom.nextLong(java.lang.Long.MAX_VALUE);
	}

	public static long nextLong(long n) {
		if (n <= 0) {
			throw new java.lang.IllegalArgumentException("Upper bound for nextInt must be positive");
		}
		return ((long) ((java.lang.Math.random()) * n));
	}

	public boolean nextBoolean() {
		return (java.lang.Math.random()) > 0.5;
	}

	public float nextFloat() {
		return ((float) (java.lang.Math.random()));
	}

	public double nextDouble() {
		return java.lang.Math.random();
	}
}

