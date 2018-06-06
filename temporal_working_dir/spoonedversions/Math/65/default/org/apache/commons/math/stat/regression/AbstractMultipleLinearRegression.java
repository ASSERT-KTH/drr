

package org.apache.commons.math.stat.regression;


public abstract class AbstractMultipleLinearRegression implements org.apache.commons.math.stat.regression.MultipleLinearRegression {
	protected org.apache.commons.math.linear.RealMatrix X;

	protected org.apache.commons.math.linear.RealVector Y;

	public void newSampleData(double[] data, int nobs, int nvars) {
		double[] y = new double[nobs];
		double[][] x = new double[nobs][nvars + 1];
		int pointer = 0;
		for (int i = 0; i < nobs; i++) {
			y[i] = data[(pointer++)];
			x[i][0] = 1.0;
			for (int j = 1; j < (nvars + 1); j++) {
				x[i][j] = data[(pointer++)];
			}
		}
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.Array2DRowRealMatrix(x);
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.Y = new org.apache.commons.math.linear.ArrayRealVector(y);
	}

	protected void newYSampleData(double[] y) {
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.Y = new org.apache.commons.math.linear.ArrayRealVector(y);
	}

	protected void newXSampleData(double[][] x) {
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.Array2DRowRealMatrix(x);
	}

	protected void validateSampleData(double[][] x, double[] y) {
		if (((x == null) || (y == null)) || ((x.length) != (y.length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, (x == null ? 0 : x.length), (y == null ? 0 : y.length));
		}else
			if (((x.length) > 0) && ((x[0].length) > (x.length))) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, x.length, x[0].length);
			}
		
	}

	protected void validateCovarianceData(double[][] x, double[][] covariance) {
		if ((x.length) != (covariance.length)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, x.length, covariance.length);
		}
		if (((covariance.length) > 0) && ((covariance.length) != (covariance[0].length))) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.NON_SQUARE_MATRIX, covariance.length, covariance[0].length);
		}
	}

	public double[] estimateRegressionParameters() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		return b.getData();
	}

	public double[] estimateResiduals() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		org.apache.commons.math.linear.RealVector e = Y.subtract(X.operate(b));
		return e.getData();
	}

	public double[][] estimateRegressionParametersVariance() {
		return calculateBetaVariance().getData();
	}

	public double[] estimateRegressionParametersStandardErrors() {
		double[][] betaVariance = estimateRegressionParametersVariance();
		double sigma = calculateYVariance();
		int length = betaVariance[0].length;
		double[] result = new double[length];
		for (int i = 0; i < length; i++) {
			result[i] = java.lang.Math.sqrt((sigma * (betaVariance[i][i])));
		}
		return result;
	}

	public double estimateRegressandVariance() {
		return calculateYVariance();
	}

	protected abstract org.apache.commons.math.linear.RealVector calculateBeta();

	protected abstract org.apache.commons.math.linear.RealMatrix calculateBetaVariance();

	protected abstract double calculateYVariance();

	protected org.apache.commons.math.linear.RealVector calculateResiduals() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		return Y.subtract(X.operate(b));
	}
}

