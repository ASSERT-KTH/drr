

package org.apache.commons.math3.stat.regression;


public class OLSMultipleLinearRegression extends org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math3.linear.QRDecomposition qr = null;

	public void newSampleData(double[] y, double[][] x) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
	}

	@java.lang.Override
	public void newSampleData(double[] data, int nobs, int nvars) {
		super.newSampleData(data, nobs, nvars);
		qr = new org.apache.commons.math3.linear.QRDecomposition(getX());
	}

	public org.apache.commons.math3.linear.RealMatrix calculateHat() {
		org.apache.commons.math3.linear.RealMatrix Q = qr.getQ();
		final int p = qr.getR().getColumnDimension();
		final int n = Q.getColumnDimension();
		org.apache.commons.math3.linear.Array2DRowRealMatrix augI = new org.apache.commons.math3.linear.Array2DRowRealMatrix(n, n);
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
			return org.apache.commons.math3.stat.StatUtils.sumSq(getY().toArray());
		}else {
			return new org.apache.commons.math3.stat.descriptive.moment.SecondMoment().evaluate(getY().toArray());
		}
	}

	public double calculateResidualSumOfSquares() {
		final org.apache.commons.math3.linear.RealVector residuals = calculateResiduals();
		return residuals.dotProduct(residuals);
	}

	public double calculateRSquared() {
		return 1 - ((calculateResidualSumOfSquares()) / (calculateTotalSumOfSquares()));
	}

	public double calculateAdjustedRSquared() {
		final double n = getX().getRowDimension();
		if (isNoIntercept()) {
			return 1 - ((1 - (calculateRSquared())) * (n / (n - (getX().getColumnDimension()))));
		}else {
			return 1 - (((calculateResidualSumOfSquares()) * (n - 1)) / ((calculateTotalSumOfSquares()) * (n - (getX().getColumnDimension()))));
		}
	}

	@java.lang.Override
	protected void newXSampleData(double[][] x) {
		super.newXSampleData(x);
		qr = new org.apache.commons.math3.linear.QRDecomposition(getX());
	}

	@java.lang.Override
	protected org.apache.commons.math3.linear.RealVector calculateBeta() {
		return qr.getSolver().solve(getY());
	}

	@java.lang.Override
	protected org.apache.commons.math3.linear.RealMatrix calculateBetaVariance() {
		int p = getX().getColumnDimension();
		org.apache.commons.math3.linear.RealMatrix Raug = qr.getR().getSubMatrix(0, (p - 1), 0, (p - 1));
		org.apache.commons.math3.linear.RealMatrix Rinv = new org.apache.commons.math3.linear.LUDecomposition(Raug).getSolver().getInverse();
		return Rinv.multiply(Rinv.transpose());
	}
}

