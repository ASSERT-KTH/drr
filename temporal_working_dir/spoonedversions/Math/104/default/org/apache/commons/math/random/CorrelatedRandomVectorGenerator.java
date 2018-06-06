

package org.apache.commons.math.random;


public class CorrelatedRandomVectorGenerator implements org.apache.commons.math.random.RandomVectorGenerator {
	public CorrelatedRandomVectorGenerator(double[] mean, org.apache.commons.math.linear.RealMatrix covariance, double small, org.apache.commons.math.random.NormalizedRandomGenerator generator) throws org.apache.commons.math.DimensionMismatchException, org.apache.commons.math.random.NotPositiveDefiniteMatrixException {
		int order = covariance.getRowDimension();
		if ((mean.length) != order) {
			throw new org.apache.commons.math.DimensionMismatchException(mean.length, order);
		}
		org.apache.commons.math.random.CorrelatedRandomVectorGenerator.this.mean = ((double[]) (mean.clone()));
		decompose(covariance, small);
		org.apache.commons.math.random.CorrelatedRandomVectorGenerator.this.generator = generator;
		normalized = new double[rank];
	}

	public CorrelatedRandomVectorGenerator(org.apache.commons.math.linear.RealMatrix covariance, double small, org.apache.commons.math.random.NormalizedRandomGenerator generator) throws org.apache.commons.math.random.NotPositiveDefiniteMatrixException {
		int order = covariance.getRowDimension();
		mean = new double[order];
		for (int i = 0; i < order; ++i) {
			mean[i] = 0;
		}
		decompose(covariance, small);
		org.apache.commons.math.random.CorrelatedRandomVectorGenerator.this.generator = generator;
		normalized = new double[rank];
	}

	public org.apache.commons.math.random.NormalizedRandomGenerator getGenerator() {
		return generator;
	}

	public org.apache.commons.math.linear.RealMatrix getRootMatrix() {
		return root;
	}

	public int getRank() {
		return rank;
	}

	private void decompose(org.apache.commons.math.linear.RealMatrix covariance, double small) throws org.apache.commons.math.random.NotPositiveDefiniteMatrixException {
		int order = covariance.getRowDimension();
		double[][] c = covariance.getData();
		double[][] b = new double[order][order];
		int[] swap = new int[order];
		int[] index = new int[order];
		for (int i = 0; i < order; ++i) {
			index[i] = i;
		}
		rank = 0;
		for (boolean loop = true; loop;) {
			swap[rank] = rank;
			for (int i = (rank) + 1; i < order; ++i) {
				int ii = index[i];
				int isi = index[swap[i]];
				if ((c[ii][ii]) > (c[isi][isi])) {
					swap[rank] = i;
				}
			}
			if ((swap[rank]) != (rank)) {
				int tmp = index[rank];
				index[rank] = index[swap[rank]];
				index[swap[rank]] = tmp;
			}
			int ir = index[rank];
			if ((c[ir][ir]) < small) {
				if ((rank) == 0) {
					throw new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
				}
				for (int i = rank; i < order; ++i) {
					if ((c[index[i]][index[i]]) < (-small)) {
						throw new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
					}
				}
				++(rank);
				loop = false;
			}else {
				double sqrt = java.lang.Math.sqrt(c[ir][ir]);
				b[rank][rank] = sqrt;
				double inverse = 1 / sqrt;
				for (int i = (rank) + 1; i < order; ++i) {
					int ii = index[i];
					double e = inverse * (c[ii][ir]);
					b[i][rank] = e;
					c[ii][ii] -= e * e;
					for (int j = (rank) + 1; j < i; ++j) {
						int ij = index[j];
						double f = (c[ii][ij]) - (e * (b[j][rank]));
						c[ii][ij] = f;
						c[ij][ii] = f;
					}
				}
				loop = (++(rank)) < order;
			}
		}
		root = new org.apache.commons.math.linear.RealMatrixImpl(order, rank);
		for (int i = 0; i < order; ++i) {
			java.lang.System.arraycopy(b[i], 0, root.getDataRef()[swap[i]], 0, rank);
		}
	}

	public double[] nextVector() {
		for (int i = 0; i < (rank); ++i) {
			normalized[i] = generator.nextNormalizedDouble();
		}
		double[] correlated = new double[mean.length];
		for (int i = 0; i < (correlated.length); ++i) {
			correlated[i] = mean[i];
			for (int j = 0; j < (rank); ++j) {
				correlated[i] += (root.getEntry(i, j)) * (normalized[j]);
			}
		}
		return correlated;
	}

	private double[] mean;

	private org.apache.commons.math.linear.RealMatrixImpl root;

	private int rank;

	private org.apache.commons.math.random.NormalizedRandomGenerator generator;

	private double[] normalized;
}

