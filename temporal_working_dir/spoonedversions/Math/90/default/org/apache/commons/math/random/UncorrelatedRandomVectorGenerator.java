

package org.apache.commons.math.random;


public class UncorrelatedRandomVectorGenerator implements org.apache.commons.math.random.RandomVectorGenerator {
	private static final long serialVersionUID = -3268228248001718811L;

	public UncorrelatedRandomVectorGenerator(double[] mean, double[] standardDeviation, org.apache.commons.math.random.NormalizedRandomGenerator generator) {
		if ((mean.length) != (standardDeviation.length)) {
			throw new java.lang.IllegalArgumentException("dimension mismatch");
		}
		org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.this.mean = mean.clone();
		org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.this.standardDeviation = standardDeviation.clone();
		org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.this.generator = generator;
	}

	public UncorrelatedRandomVectorGenerator(int dimension, org.apache.commons.math.random.NormalizedRandomGenerator generator) {
		mean = new double[dimension];
		standardDeviation = new double[dimension];
		java.util.Arrays.fill(standardDeviation, 1.0);
		org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.this.generator = generator;
	}

	public double[] nextVector() {
		double[] random = new double[mean.length];
		for (int i = 0; i < (random.length); ++i) {
			random[i] = (mean[i]) + ((standardDeviation[i]) * (generator.nextNormalizedDouble()));
		}
		return random;
	}

	private double[] mean;

	private double[] standardDeviation;

	private org.apache.commons.math.random.NormalizedRandomGenerator generator;
}

