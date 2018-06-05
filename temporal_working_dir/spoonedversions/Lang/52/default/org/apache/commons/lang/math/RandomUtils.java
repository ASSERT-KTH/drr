

package org.apache.commons.lang.math;


public class RandomUtils {
	public static final java.util.Random JVM_RANDOM = new org.apache.commons.lang.math.JVMRandom();

	public static int nextInt() {
		return org.apache.commons.lang.math.RandomUtils.nextInt(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM);
	}

	public static int nextInt(java.util.Random random) {
		return random.nextInt();
	}

	public static int nextInt(int n) {
		return org.apache.commons.lang.math.RandomUtils.nextInt(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM, n);
	}

	public static int nextInt(java.util.Random random, int n) {
		return random.nextInt(n);
	}

	public static long nextLong() {
		return org.apache.commons.lang.math.RandomUtils.nextLong(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM);
	}

	public static long nextLong(java.util.Random random) {
		return random.nextLong();
	}

	public static boolean nextBoolean() {
		return org.apache.commons.lang.math.RandomUtils.nextBoolean(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM);
	}

	public static boolean nextBoolean(java.util.Random random) {
		return random.nextBoolean();
	}

	public static float nextFloat() {
		return org.apache.commons.lang.math.RandomUtils.nextFloat(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM);
	}

	public static float nextFloat(java.util.Random random) {
		return random.nextFloat();
	}

	public static double nextDouble() {
		return org.apache.commons.lang.math.RandomUtils.nextDouble(org.apache.commons.lang.math.RandomUtils.JVM_RANDOM);
	}

	public static double nextDouble(java.util.Random random) {
		return random.nextDouble();
	}
}

