

package org.apache.commons.math.stat.regression;


public class OLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math.linear.QRDecomposition qr = null;

	public void newSampleData(double[] y, double[][] x) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
	}

	public void newSampleData(double[] data, int nobs, int nvars) {
		super.newSampleData(data, nobs, nvars);
		qr = new org.apache.commons.math.linear.QRDecompositionImpl(X);
	}

	protected void newXSampleData(double[][] x) {
		org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.this.X = new org.apache.commons.math.linear.RealMatrixImpl(x);
		qr = new org.apache.commons.math.linear.QRDecompositionImpl(X);
	}

	protected org.apache.commons.math.linear.RealMatrix calculateBeta() {
		return org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.solveUpperTriangular(((org.apache.commons.math.linear.RealMatrixImpl) (qr.getR())), ((org.apache.commons.math.linear.RealMatrixImpl) (qr.getQ().transpose().multiply(Y))));
	}

	protected org.apache.commons.math.linear.RealMatrix calculateBetaVariance() {
		org.apache.commons.math.linear.RealMatrix XTX = X.transpose().multiply(X);
		return XTX.inverse();
	}

	protected double calculateYVariance() {
		org.apache.commons.math.linear.RealMatrix u = calculateResiduals();
		org.apache.commons.math.linear.RealMatrix sse = u.transpose().multiply(u);
		return (sse.getTrace()) / ((X.getRowDimension()) - (X.getColumnDimension()));
	}

	private static org.apache.commons.math.linear.RealMatrix solveUpperTriangular(org.apache.commons.math.linear.RealMatrixImpl coefficients, org.apache.commons.math.linear.RealMatrixImpl constants) {
		if (!(org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.isUpperTriangular(coefficients, 1.0E-12))) {
			throw new java.lang.IllegalArgumentException("Coefficients is not upper-triangular");
		}
		if ((constants.getColumnDimension()) != 1) {
			throw new java.lang.IllegalArgumentException("Constants not a column matrix.");
		}
		int length = coefficients.getColumnDimension();
		double[][] cons = constants.getDataRef();
		double[][] coef = coefficients.getDataRef();
		double[] x = new double[length];
		for (int i = 0; i < length; i++) {
			int index = (length - 1) - i;
			double sum = 0;
			for (int j = index + 1; j < length; j++) {
				sum += (coef[index][j]) * (x[j]);
			}
			x[index] = ((cons[index][0]) - sum) / (coef[index][index]);
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(x);
	}

	private static boolean isUpperTriangular(org.apache.commons.math.linear.RealMatrixImpl m, double epsilon) {
		double[][] data = m.getDataRef();
		int nCols = m.getColumnDimension();
		int nRows = m.getRowDimension();
		for (int r = 0; r < nRows; r++) {
			int bound = java.lang.Math.min(r, nCols);
			for (int c = 0; c < bound; c++) {
				if ((java.lang.Math.abs(data[r][c])) > epsilon) {
					return false;
				}
			}
		}
		return true;
	}
}

