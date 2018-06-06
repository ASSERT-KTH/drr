

package org.apache.commons.math.stat.regression;


public class GLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math.linear.RealMatrix Omega;

	private org.apache.commons.math.linear.RealMatrix OmegaInverse;

	public void newSampleData(double[] y, double[][] x, double[][] covariance) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
		validateCovarianceData(x, covariance);
		newCovarianceData(covariance);
	}

	protected void newCovarianceData(double[][] omega) {
		org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.this.Omega = new org.apache.commons.math.linear.RealMatrixImpl(omega);
		org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.this.OmegaInverse = null;
	}

	protected org.apache.commons.math.linear.RealMatrix getOmegaInverse() {
		if ((OmegaInverse) == null) {
			OmegaInverse = new org.apache.commons.math.linear.decomposition.LUDecompositionImpl(Omega).getSolver().getInverse();
		}
		return OmegaInverse;
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealMatrix calculateBeta() {
		org.apache.commons.math.linear.RealMatrix OI = getOmegaInverse();
		org.apache.commons.math.linear.RealMatrix XT = X.transpose();
		org.apache.commons.math.linear.RealMatrix XTOIX = XT.multiply(OI).multiply(X);
		org.apache.commons.math.linear.RealMatrix inverse = new org.apache.commons.math.linear.decomposition.LUDecompositionImpl(XTOIX).getSolver().getInverse();
		return inverse.multiply(XT).multiply(OI).multiply(Y);
	}

	@java.lang.Override
	protected org.apache.commons.math.linear.RealMatrix calculateBetaVariance() {
		org.apache.commons.math.linear.RealMatrix OI = getOmegaInverse();
		org.apache.commons.math.linear.RealMatrix XTOIX = X.transpose().multiply(OI).multiply(X);
		return new org.apache.commons.math.linear.decomposition.LUDecompositionImpl(XTOIX).getSolver().getInverse();
	}

	@java.lang.Override
	protected double calculateYVariance() {
		org.apache.commons.math.linear.RealMatrix u = calculateResiduals();
		org.apache.commons.math.linear.RealMatrix sse = u.transpose().multiply(getOmegaInverse()).multiply(u);
		return (sse.getTrace()) / ((X.getRowDimension()) - (X.getColumnDimension()));
	}
}

