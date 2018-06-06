

package org.apache.commons.math.stat.correlation;


public class Covariance {
	private final org.apache.commons.math.linear.RealMatrix covarianceMatrix;

	private final int n;

	public Covariance() {
		super();
		covarianceMatrix = null;
		n = 0;
	}

	public Covariance(double[][] data, boolean biasCorrected) {
		this(new org.apache.commons.math.linear.BlockRealMatrix(data), biasCorrected);
	}

	public Covariance(double[][] data) {
		this(data, true);
	}

	public Covariance(org.apache.commons.math.linear.RealMatrix matrix, boolean biasCorrected) {
		checkSufficientData(matrix);
		n = matrix.getRowDimension();
		covarianceMatrix = computeCovarianceMatrix(matrix, biasCorrected);
	}

	public Covariance(org.apache.commons.math.linear.RealMatrix matrix) {
		this(matrix, true);
	}

	public org.apache.commons.math.linear.RealMatrix getCovarianceMatrix() {
		return covarianceMatrix;
	}

	public int getN() {
		return n;
	}

	protected org.apache.commons.math.linear.RealMatrix computeCovarianceMatrix(org.apache.commons.math.linear.RealMatrix matrix, boolean biasCorrected) {
		int dimension = matrix.getColumnDimension();
		org.apache.commons.math.stat.descriptive.moment.Variance variance = new org.apache.commons.math.stat.descriptive.moment.Variance(biasCorrected);
		org.apache.commons.math.linear.RealMatrix outMatrix = new org.apache.commons.math.linear.BlockRealMatrix(dimension, dimension);
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < i; j++) {
				double cov = covariance(matrix.getColumn(i), matrix.getColumn(j), biasCorrected);
				outMatrix.setEntry(i, j, cov);
				outMatrix.setEntry(j, i, cov);
			}
			outMatrix.setEntry(i, i, variance.evaluate(matrix.getColumn(i)));
		}
		return outMatrix;
	}

	protected org.apache.commons.math.linear.RealMatrix computeCovarianceMatrix(org.apache.commons.math.linear.RealMatrix matrix) {
		return computeCovarianceMatrix(matrix, true);
	}

	protected org.apache.commons.math.linear.RealMatrix computeCovarianceMatrix(double[][] data, boolean biasCorrected) {
		return computeCovarianceMatrix(new org.apache.commons.math.linear.BlockRealMatrix(data), biasCorrected);
	}

	protected org.apache.commons.math.linear.RealMatrix computeCovarianceMatrix(double[][] data) {
		return computeCovarianceMatrix(data, true);
	}

	public double covariance(final double[] xArray, final double[] yArray, boolean biasCorrected) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.stat.descriptive.moment.Mean mean = new org.apache.commons.math.stat.descriptive.moment.Mean();
		double result = 0.0;
		int length = xArray.length;
		if (length != (yArray.length)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, length, yArray.length);
		}else
			if (length < 2) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.INSUFFICIENT_DIMENSION, length, 2);
			}else {
				double xMean = mean.evaluate(xArray);
				double yMean = mean.evaluate(yArray);
				for (int i = 0; i < length; i++) {
					double xDev = (xArray[i]) - xMean;
					double yDev = (yArray[i]) - yMean;
					result += ((xDev * yDev) - result) / (i + 1);
				}
			}
		
		return biasCorrected ? result * (((double) (length)) / ((double) (length - 1))) : result;
	}

	public double covariance(final double[] xArray, final double[] yArray) throws java.lang.IllegalArgumentException {
		return covariance(xArray, yArray, true);
	}

	private void checkSufficientData(final org.apache.commons.math.linear.RealMatrix matrix) {
		int nRows = matrix.getRowDimension();
		int nCols = matrix.getColumnDimension();
		if ((nRows < 2) || (nCols < 2)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.INSUFFICIENT_ROWS_AND_COLUMNS, nRows, nCols);
		}
	}
}

