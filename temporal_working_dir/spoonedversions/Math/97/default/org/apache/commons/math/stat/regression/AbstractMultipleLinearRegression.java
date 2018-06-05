

package org.apache.commons.math.stat.regression;


public abstract class AbstractMultipleLinearRegression implements org.apache.commons.math.stat.regression.MultipleLinearRegression {
	protected org.apache.commons.math.linear.RealMatrix X;

	protected org.apache.commons.math.linear.RealMatrix Y;

	protected void addYSampleData(double[] y) {
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.Y = new org.apache.commons.math.linear.RealMatrixImpl(y);
	}

	protected void addXSampleData(double[][] x) {
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.RealMatrixImpl(x);
	}

	protected void validateSampleData(double[][] x, double[] y) {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("The regressors matrix x cannot be null.");
		}
		if (y == null) {
			throw new java.lang.IllegalArgumentException("The regressand vector y cannot be null.");
		}
		if ((x.length) != (y.length)) {
			throw new java.lang.IllegalArgumentException("The regressors matrix x columns must have the same length of the regressand vector y");
		}
	}

	protected void validateCovarianceData(double[][] x, double[][] covariance) {
		if (covariance == null) {
			throw new java.lang.IllegalArgumentException("Covariance matrix cannot be null.");
		}
		if ((x.length) != (covariance.length)) {
			throw new java.lang.IllegalArgumentException("The regressors matrix x columns must have the same length of the covariance matrix columns");
		}
		if (((covariance.length) > 0) && ((covariance.length) != (covariance[0].length))) {
			throw new java.lang.IllegalArgumentException("The covariance matrix must be square");
		}
	}

	public double[] estimateRegressionParameters() {
		org.apache.commons.math.linear.RealMatrix b = calculateBeta();
		return b.getColumn(0);
	}

	public double[] estimateResiduals() {
		org.apache.commons.math.linear.RealMatrix b = calculateBeta();
		org.apache.commons.math.linear.RealMatrix e = Y.subtract(X.multiply(b));
		return e.getColumn(0);
	}

	public double[][] estimateRegressionParametersVariance() {
		return calculateBetaVariance().getData();
	}

	public double estimateRegressandVariance() {
		return calculateYVariance();
	}

	protected abstract org.apache.commons.math.linear.RealMatrix calculateBeta();

	protected abstract org.apache.commons.math.linear.RealMatrix calculateBetaVariance();

	protected abstract double calculateYVariance();

	protected org.apache.commons.math.linear.RealMatrix calculateResiduals() {
		org.apache.commons.math.linear.RealMatrix b = calculateBeta();
		return Y.subtract(X.multiply(b));
	}
}

