

package org.apache.commons.math.stat.regression;


public class OLSMultipleLinearRegression extends org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression {
	public void addData(double[] y, double[][] x, double[][] covariance) {
		validateSampleData(x, y);
		addYSampleData(y);
		addXSampleData(x);
	}

	protected org.apache.commons.math.linear.RealMatrix calculateBeta() {
		org.apache.commons.math.linear.RealMatrix XTX = X.transpose().multiply(X);
		return XTX.inverse().multiply(X.transpose()).multiply(Y);
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
}

