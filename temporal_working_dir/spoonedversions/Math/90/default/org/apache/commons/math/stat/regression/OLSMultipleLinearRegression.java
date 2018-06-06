

package org.apache.commons.math.stat.regression;


public class OLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math.linear.decomposition.QRDecomposition qr = null;

	public void newSampleData(double[] y, double[][] x) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
	}

	@java.lang.Override
	public void newSampleData(double[] data, int nobs, int nvars) {
		super.newSampleData(data, nobs, nvars);
		qr = new org.apache.commons.math.linear.decomposition.QRDecompositionImpl(X);
	}

	public org.apache.commons.math.linear.RealMatrix calculateHat() {
		org.apache.commons.math.linear.RealMatrix Q = qr.getQ();
		final int p = qr.getR().getColumnDimension();
		final int n = Q.getColumnDimension();
		org.apache.commons.math.linear.RealMatrixImpl augI = new org.apache.commons.math.linear.RealMatrixImpl(n, n);
		double[][] augIData = augI.getDataRef();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j) && (i < p)) {
					augIData[i][j] = 1.0;
				}else {
					augIData[i][j] = 0.0;
				}
			}
		}
		return Q.multiply(augI).multiply(Q.transpose());
	}

	@java.lang.Override
	protected void newXSampleData(double[][] x) {
		org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.this.X = new org.apache.commons.math.linear.RealMatrixImpl(x);
		qr = new org.apache.commons.math.linear.decomposition.QRDecompositionImpl(X);
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealMatrix calculateBeta() {
		return org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.solveUpperTriangular(qr.getR(), qr.getQ().transpose().multiply(Y));
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealMatrix calculateBetaVariance() {
		int p = X.getColumnDimension();
		org.apache.commons.math.linear.RealMatrix Raug = qr.getR().getSubMatrix(0, (p - 1), 0, (p - 1));
		org.apache.commons.math.linear.RealMatrix Rinv = new org.apache.commons.math.linear.decomposition.LUDecompositionImpl(Raug).getSolver().getInverse();
		return Rinv.multiply(Rinv.transpose());
	}

	@java.lang.Override
	protected double calculateYVariance() {
		org.apache.commons.math.linear.RealMatrix u = calculateResiduals();
		org.apache.commons.math.linear.RealMatrix sse = u.transpose().multiply(u);
		return (sse.getTrace()) / ((X.getRowDimension()) - (X.getColumnDimension()));
	}

	private static org.apache.commons.math.linear.RealMatrix solveUpperTriangular(org.apache.commons.math.linear.RealMatrix coefficients, org.apache.commons.math.linear.RealMatrix constants) {
		if (!(org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.isUpperTriangular(coefficients, 1.0E-12))) {
			throw new java.lang.IllegalArgumentException("Coefficients is not upper-triangular");
		}
		if ((constants.getColumnDimension()) != 1) {
			throw new java.lang.IllegalArgumentException("Constants not a column matrix.");
		}
		int length = coefficients.getColumnDimension();
		double[] x = new double[length];
		for (int i = 0; i < length; i++) {
			int index = (length - 1) - i;
			double sum = 0;
			for (int j = index + 1; j < length; j++) {
				sum += (coefficients.getEntry(index, j)) * (x[j]);
			}
			x[index] = ((constants.getEntry(index, 0)) - sum) / (coefficients.getEntry(index, index));
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(x);
	}

	private static boolean isUpperTriangular(org.apache.commons.math.linear.RealMatrix m, double epsilon) {
		int nCols = m.getColumnDimension();
		int nRows = m.getRowDimension();
		for (int r = 0; r < nRows; r++) {
			int bound = java.lang.Math.min(r, nCols);
			for (int c = 0; c < bound; c++) {
				if ((java.lang.Math.abs(m.getEntry(r, c))) > epsilon) {
					return false;
				}
			}
		}
		return true;
	}
}

