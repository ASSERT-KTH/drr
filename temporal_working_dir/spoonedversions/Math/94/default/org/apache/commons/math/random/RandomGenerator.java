

package org.apache.commons.math.random;


public interface RandomGenerator extends java.io.Serializable {
	void setSeed(long seed);

	void nextBytes(byte[] bytes);

	int nextInt();

	int nextInt(int n);

	long nextLong();

	boolean nextBoolean();

	float nextFloat();

	double nextDouble();

	double nextGaussian();
}

