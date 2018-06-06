

package org.apache.commons.math3.stat.regression;


public class GLSMultipleLinearRegression extends org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math3.linear.RealMatrix Omega;

	private org.apache.commons.math3.linear.RealMatrix OmegaInverse;

	public void newSampleData(double[] y, double[][] x, double[][] covariance) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
		validateCovarianceData(x, covariance);
		newCovarianceData(covariance);
	}

	protected void newCovarianceData(double[][] omega) {
		org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.this.Omega = new org.apache.commons.math3.linear.Array2DRowRealMatrix(omega);
		org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.this.OmegaInverse = null;
	}

	protected org.apache.commons.math3.linear.RealMatrix getOmegaInverse() {
		if ((OmegaInverse) == null) {
			OmegaInverse = new org.apache.commons.math3.linear.LUDecomposition(Omega).getSolver().getInverse();
		}
		return OmegaInverse;
	}

	@java.lang.Override
	protected org.apache.commons.math3.linear.RealVector calculateBeta() {
		org.apache.commons.math3.linear.RealMatrix OI = getOmegaInverse();
		org.apache.commons.math3.linear.RealMatrix XT = getX().transpose();
		org.apache.commons.math3.linear.RealMatrix XTOIX = XT.multiply(OI).multiply(getX());
		org.apache.commons.math3.linear.RealMatrix inverse = new org.apache.commons.math3.linear.LUDecomposition(XTOIX).getSolver().getInverse();
		return inverse.multiply(XT).multiply(OI).operate(getY());
	}

	@java.lang.Override
	protected org.apache.commons.math3.linear.RealMatrix calculateBetaVariance() {
		org.apache.commons.math3.linear.RealMatrix OI = getOmegaInverse();
		org.apache.commons.math3.linear.RealMatrix XTOIX = getX().transpose().multiply(OI).multiply(getX());
		return new org.apache.commons.math3.linear.LUDecomposition(XTOIX).getSolver().getInverse();
	}

	@java.lang.Override
	protected double calculateErrorVariance() {
		org.apache.commons.math3.linear.RealVector residuals = calculateResiduals();
		double t = residuals.dotProduct(getOmegaInverse().operate(residuals));
		return t / ((getX().getRowDimension()) - (getX().getColumnDimension()));
	}
}

