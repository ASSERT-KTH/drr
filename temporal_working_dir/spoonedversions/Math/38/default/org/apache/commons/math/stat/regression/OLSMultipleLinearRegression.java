

package org.apache.commons.math.stat.regression;


public class OLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math.linear.QRDecomposition qr = null;

	public void newSampleData(double[] y, double[][] x) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
	}

	@java.lang.Override
	public void newSampleData(double[] data, int nobs, int nvars) {
		super.newSampleData(data, nobs, nvars);
		qr = new org.apache.commons.math.linear.QRDecomposition(X);
	}

	public org.apache.commons.math.linear.RealMatrix calculateHat() {
		org.apache.commons.math.linear.RealMatrix Q = qr.getQ();
		final int p = qr.getR().getColumnDimension();
		final int n = Q.getColumnDimension();
		org.apache.commons.math.linear.Array2DRowRealMatrix augI = new org.apache.commons.math.linear.Array2DRowRealMatrix(n, n);
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

	public double calculateTotalSumOfSquares() {
		if (isNoIntercept()) {
			return org.apache.commons.math.stat.StatUtils.sumSq(Y.toArray());
		}else {
			return new org.apache.commons.math.stat.descriptive.moment.SecondMoment().evaluate(Y.toArray());
		}
	}

	public double calculateResidualSumOfSquares() {
		final org.apache.commons.math.linear.RealVector residuals = calculateResiduals();
		return residuals.dotProduct(residuals);
	}

	public double calculateRSquared() {
		return 1 - ((calculateResidualSumOfSquares()) / (calculateTotalSumOfSquares()));
	}

	public double calculateAdjustedRSquared() {
		final double n = X.getRowDimension();
		if (isNoIntercept()) {
			return 1 - ((1 - (calculateRSquared())) * (n / (n - (X.getColumnDimension()))));
		}else {
			return 1 - (((calculateResidualSumOfSquares()) * (n - 1)) / ((calculateTotalSumOfSquares()) * (n - (X.getColumnDimension()))));
		}
	}

	@java.lang.Override
	protected void newXSampleData(double[][] x) {
		super.newXSampleData(x);
		qr = new org.apache.commons.math.linear.QRDecomposition(X);
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealVector calculateBeta() {
		return qr.getSolver().solve(Y);
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealMatrix calculateBetaVariance() {
		int p = X.getColumnDimension();
		org.apache.commons.math.linear.RealMatrix Raug = qr.getR().getSubMatrix(0, (p - 1), 0, (p - 1));
		org.apache.commons.math.linear.RealMatrix Rinv = new org.apache.commons.math.linear.LUDecomposition(Raug).getSolver().getInverse();
		return Rinv.multiply(Rinv.transpose());
	}
}

