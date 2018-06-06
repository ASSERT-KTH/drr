

package org.apache.commons.math.stat.correlation;


public class PearsonsCorrelation {
	private final org.apache.commons.math.linear.RealMatrix correlationMatrix;

	private final int nObs;

	public PearsonsCorrelation() {
		super();
		correlationMatrix = null;
		nObs = 0;
	}

	public PearsonsCorrelation(double[][] data) {
		this(new org.apache.commons.math.linear.BlockRealMatrix(data));
	}

	public PearsonsCorrelation(org.apache.commons.math.linear.RealMatrix matrix) {
		checkSufficientData(matrix);
		nObs = matrix.getRowDimension();
		correlationMatrix = computeCorrelationMatrix(matrix);
	}

	public PearsonsCorrelation(org.apache.commons.math.stat.correlation.Covariance covariance) {
		org.apache.commons.math.linear.RealMatrix covarianceMatrix = covariance.getCovarianceMatrix();
		if (covarianceMatrix == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.COVARIANCE_MATRIX);
		}
		nObs = covariance.getN();
		correlationMatrix = covarianceToCorrelation(covarianceMatrix);
	}

	public PearsonsCorrelation(org.apache.commons.math.linear.RealMatrix covarianceMatrix, int numberOfObservations) {
		nObs = numberOfObservations;
		correlationMatrix = covarianceToCorrelation(covarianceMatrix);
	}

	public org.apache.commons.math.linear.RealMatrix getCorrelationMatrix() {
		return correlationMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix getCorrelationStandardErrors() {
		int nVars = correlationMatrix.getColumnDimension();
		double[][] out = new double[nVars][nVars];
		for (int i = 0; i < nVars; i++) {
			for (int j = 0; j < nVars; j++) {
				double r = correlationMatrix.getEntry(i, j);
				out[i][j] = java.lang.Math.sqrt(((1 - (r * r)) / ((nObs) - 2)));
			}
		}
		return new org.apache.commons.math.linear.BlockRealMatrix(out);
	}

	public org.apache.commons.math.linear.RealMatrix getCorrelationPValues() throws org.apache.commons.math.MathException {
		org.apache.commons.math.distribution.TDistribution tDistribution = new org.apache.commons.math.distribution.TDistributionImpl(((nObs) - 2));
		int nVars = correlationMatrix.getColumnDimension();
		double[][] out = new double[nVars][nVars];
		for (int i = 0; i < nVars; i++) {
			for (int j = 0; j < nVars; j++) {
				if (i == j) {
					out[i][j] = 0.0;
				}else {
					double r = correlationMatrix.getEntry(i, j);
					double t = java.lang.Math.abs((r * (java.lang.Math.sqrt((((nObs) - 2) / (1 - (r * r)))))));
					out[i][j] = 2 * (tDistribution.cumulativeProbability((-t)));
				}
			}
		}
		return new org.apache.commons.math.linear.BlockRealMatrix(out);
	}

	public org.apache.commons.math.linear.RealMatrix computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix matrix) {
		int nVars = matrix.getColumnDimension();
		org.apache.commons.math.linear.RealMatrix outMatrix = new org.apache.commons.math.linear.BlockRealMatrix(nVars, nVars);
		for (int i = 0; i < nVars; i++) {
			for (int j = 0; j < i; j++) {
				double corr = correlation(matrix.getColumn(i), matrix.getColumn(j));
				outMatrix.setEntry(i, j, corr);
				outMatrix.setEntry(j, i, corr);
			}
			outMatrix.setEntry(i, i, 1.0);
		}
		return outMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix computeCorrelationMatrix(double[][] data) {
		return computeCorrelationMatrix(new org.apache.commons.math.linear.BlockRealMatrix(data));
	}

	public double correlation(final double[] xArray, final double[] yArray) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.stat.regression.SimpleRegression regression = new org.apache.commons.math.stat.regression.SimpleRegression();
		if ((xArray.length) != (yArray.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(xArray.length, yArray.length);
		}else
			if ((xArray.length) < 2) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION, xArray.length, 2);
			}else {
				for (int i = 0; i < (xArray.length); i++) {
					regression.addData(xArray[i], yArray[i]);
				}
				return regression.getR();
			}
		
	}

	public org.apache.commons.math.linear.RealMatrix covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix covarianceMatrix) {
		int nVars = covarianceMatrix.getColumnDimension();
		org.apache.commons.math.linear.RealMatrix outMatrix = new org.apache.commons.math.linear.BlockRealMatrix(nVars, nVars);
		for (int i = 0; i < nVars; i++) {
			double sigma = java.lang.Math.sqrt(covarianceMatrix.getEntry(i, i));
			outMatrix.setEntry(i, i, 1.0);
			for (int j = 0; j < i; j++) {
				double entry = (covarianceMatrix.getEntry(i, j)) / (sigma * (java.lang.Math.sqrt(covarianceMatrix.getEntry(j, j))));
				outMatrix.setEntry(i, j, entry);
				outMatrix.setEntry(j, i, entry);
			}
		}
		return outMatrix;
	}

	private void checkSufficientData(final org.apache.commons.math.linear.RealMatrix matrix) {
		int nRows = matrix.getRowDimension();
		int nCols = matrix.getColumnDimension();
		if ((nRows < 2) || (nCols < 2)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INSUFFICIENT_ROWS_AND_COLUMNS, nRows, nCols);
		}
	}
}

