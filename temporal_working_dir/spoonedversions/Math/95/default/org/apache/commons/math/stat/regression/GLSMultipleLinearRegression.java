

package org.apache.commons.math.stat.regression;


public class GLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	private org.apache.commons.math.linear.RealMatrix Omega;

	public void newSampleData(double[] y, double[][] x, double[][] covariance) {
		validateSampleData(x, y);
		newYSampleData(y);
		newXSampleData(x);
		validateCovarianceData(x, covariance);
		newCovarianceData(covariance);
	}

	protected void newCovarianceData(double[][] omega) {
		org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.this.Omega = new org.apache.commons.math.linear.RealMatrixImpl(omega);
	}

	protected org.apache.commons.math.linear.RealMatrix calculateBeta() {
		org.apache.commons.math.linear.RealMatrix OI = Omega.inverse();
		org.apache.commons.math.linear.RealMatrix XT = X.transpose();
		org.apache.commons.math.linear.RealMatrix XTOIX = XT.multiply(OI).multiply(X);
		return XTOIX.inverse().multiply(XT).multiply(OI).multiply(Y);
	}

	protected org.apache.commons.math.linear.RealMatrix calculateBetaVariance() {
		org.apache.commons.math.linear.RealMatrix XTOIX = X.transpose().multiply(Omega.inverse()).multiply(X);
		return XTOIX.inverse();
	}

	protected double calculateYVariance() {
		org.apache.commons.math.linear.RealMatrix u = calculateResiduals();
		org.apache.commons.math.linear.RealMatrix sse = u.transpose().multiply(Omega.inverse()).multiply(u);
		return (sse.getTrace()) / ((X.getRowDimension()) - (X.getColumnDimension()));
	}
}

