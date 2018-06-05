

package org.apache.commons.math.stat.correlation;


public class StorelessCovariance extends org.apache.commons.math.stat.correlation.Covariance {
	private org.apache.commons.math.stat.correlation.StorelessBivariateCovariance[][] covMatrix = null;

	private int rowDimension = 1;

	private int colDimension = 1;

	private boolean biasCorrected = true;

	public StorelessCovariance(int rowDimension, int colDimension) {
		this(rowDimension, colDimension, true);
	}

	public StorelessCovariance(int rowDimension, int colDimension, boolean biasCorrected) {
		org.apache.commons.math.stat.correlation.StorelessCovariance.this.rowDimension = rowDimension;
		org.apache.commons.math.stat.correlation.StorelessCovariance.this.colDimension = colDimension;
		org.apache.commons.math.stat.correlation.StorelessCovariance.this.biasCorrected = biasCorrected;
		covMatrix = new org.apache.commons.math.stat.correlation.StorelessBivariateCovariance[rowDimension][colDimension];
		initializeMatrix();
	}

	private void initializeMatrix() {
		for (int i = 0; i < (rowDimension); i++) {
			for (int j = 0; j < (colDimension); j++) {
				covMatrix[i][j] = new org.apache.commons.math.stat.correlation.StorelessBivariateCovariance(biasCorrected);
			}
		}
	}

	public org.apache.commons.math.stat.correlation.StorelessBivariateCovariance getCovariance(int xIndex, int yIndex) {
		return covMatrix[xIndex][yIndex];
	}

	public void setCovariance(int xIndex, int yIndex, org.apache.commons.math.stat.correlation.StorelessBivariateCovariance cov) {
		covMatrix[xIndex][yIndex] = cov;
	}

	public void incrementCovariance(int xIndex, int yIndex, double x, double y) {
		covMatrix[xIndex][yIndex].increment(x, y);
	}

	public void incrementRow(double[] rowData) throws java.lang.IllegalArgumentException {
		int length = rowData.length;
		if (length != (colDimension)) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, length, colDimension);
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				covMatrix[i][j].increment(rowData[i], rowData[j]);
			}
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix getCovarianceMatrix() throws java.lang.IllegalArgumentException {
		org.apache.commons.math.linear.RealMatrix matrix = new org.apache.commons.math.linear.Array2DRowRealMatrix(rowDimension, colDimension);
		for (int i = 0; i < (rowDimension); i++) {
			for (int j = 0; j < (colDimension); j++) {
				matrix.setEntry(i, j, covMatrix[i][j].getResult());
			}
		}
		return matrix;
	}

	public double[][] getData() throws java.lang.IllegalArgumentException {
		double[][] data = new double[rowDimension][rowDimension];
		for (int i = 0; i < (rowDimension); i++) {
			for (int j = 0; j < (colDimension); j++) {
				data[i][j] = covMatrix[i][j].getResult();
			}
		}
		return data;
	}

	@java.lang.Override
	public int getN() {
		throw new org.apache.commons.math.exception.MathUnsupportedOperationException();
	}
}

