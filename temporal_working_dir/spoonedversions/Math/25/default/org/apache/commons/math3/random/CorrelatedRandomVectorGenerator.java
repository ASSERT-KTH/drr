

package org.apache.commons.math3.random;


public class CorrelatedRandomVectorGenerator implements org.apache.commons.math3.random.RandomVectorGenerator {
	private final double[] mean;

	private final org.apache.commons.math3.random.NormalizedRandomGenerator generator;

	private final double[] normalized;

	private final org.apache.commons.math3.linear.RealMatrix root;

	public CorrelatedRandomVectorGenerator(double[] mean, org.apache.commons.math3.linear.RealMatrix covariance, double small, org.apache.commons.math3.random.NormalizedRandomGenerator generator) {
		int order = covariance.getRowDimension();
		if ((mean.length) != order) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(mean.length, order);
		}
		this.mean = mean.clone();
		final org.apache.commons.math3.linear.RectangularCholeskyDecomposition decomposition = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(covariance, small);
		root = decomposition.getRootMatrix();
		this.generator = generator;
		normalized = new double[decomposition.getRank()];
	}

	public CorrelatedRandomVectorGenerator(org.apache.commons.math3.linear.RealMatrix covariance, double small, org.apache.commons.math3.random.NormalizedRandomGenerator generator) {
		int order = covariance.getRowDimension();
		mean = new double[order];
		for (int i = 0; i < order; ++i) {
			mean[i] = 0;
		}
		final org.apache.commons.math3.linear.RectangularCholeskyDecomposition decomposition = new org.apache.commons.math3.linear.RectangularCholeskyDecomposition(covariance, small);
		root = decomposition.getRootMatrix();
		this.generator = generator;
		normalized = new double[decomposition.getRank()];
	}

	public org.apache.commons.math3.random.NormalizedRandomGenerator getGenerator() {
		return generator;
	}

	public int getRank() {
		return normalized.length;
	}

	public org.apache.commons.math3.linear.RealMatrix getRootMatrix() {
		return root;
	}

	public double[] nextVector() {
		for (int i = 0; i < (normalized.length); ++i) {
			normalized[i] = generator.nextNormalizedDouble();
		}
		double[] correlated = new double[mean.length];
		for (int i = 0; i < (correlated.length); ++i) {
			correlated[i] = mean[i];
			for (int j = 0; j < (root.getColumnDimension()); ++j) {
				correlated[i] += (root.getEntry(i, j)) * (normalized[j]);
			}
		}
		return correlated;
	}
}

