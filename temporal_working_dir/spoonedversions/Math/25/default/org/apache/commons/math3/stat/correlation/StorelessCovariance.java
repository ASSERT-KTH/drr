

package org.apache.commons.math3.stat.correlation;


public class StorelessCovariance extends org.apache.commons.math3.stat.correlation.Covariance {
	private org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance[] covMatrix;

	private int dimension;

	public StorelessCovariance(final int dim) {
		this(dim, true);
	}

	public StorelessCovariance(final int dim, final boolean biasCorrected) {
		dimension = dim;
		covMatrix = new org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance[((dimension) * ((dimension) + 1)) / 2];
		initializeMatrix(biasCorrected);
	}

	private void initializeMatrix(final boolean biasCorrected) {
		for (int i = 0; i < (dimension); i++) {
			for (int j = 0; j < (dimension); j++) {
				setElement(i, j, new org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance(biasCorrected));
			}
		}
	}

	private int indexOf(final int i, final int j) {
		return j < i ? ((i * (i + 1)) / 2) + j : ((j * (j + 1)) / 2) + i;
	}

	private org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance getElement(final int i, final int j) {
		return covMatrix[indexOf(i, j)];
	}

	private void setElement(final int i, final int j, final org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance cov) {
		covMatrix[indexOf(i, j)] = cov;
	}

	public double getCovariance(final int xIndex, final int yIndex) throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		return getElement(xIndex, yIndex).getResult();
	}

	public void increment(final double[] data) throws org.apache.commons.math3.exception.DimensionMismatchException {
		int length = data.length;
		if (length != (dimension)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(length, dimension);
		}
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				getElement(i, j).increment(data[i], data[j]);
			}
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix getCovarianceMatrix() throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		return org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(getData());
	}

	public double[][] getData() throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		final double[][] data = new double[dimension][dimension];
		for (int i = 0; i < (dimension); i++) {
			for (int j = 0; j < (dimension); j++) {
				data[i][j] = getElement(i, j).getResult();
			}
		}
		return data;
	}

	@java.lang.Override
	public int getN() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}
}

