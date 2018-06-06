

package org.apache.commons.math.stat.regression;


public abstract class AbstractMultipleLinearRegression implements org.apache.commons.math.stat.regression.MultipleLinearRegression {
	protected org.apache.commons.math.linear.RealMatrix X;

	protected org.apache.commons.math.linear.RealVector Y;

	private boolean noIntercept = false;

	public boolean isNoIntercept() {
		return noIntercept;
	}

	public void setNoIntercept(boolean noIntercept) {
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.noIntercept = noIntercept;
	}

	public void newSampleData(double[] data, int nobs, int nvars) {
		if (data == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((data.length) != (nobs * (nvars + 1))) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(data.length, (nobs * (nvars + 1)));
		}
		if (nobs <= nvars) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(nobs, nvars, false);
		}
		double[] y = new double[nobs];
		final int cols = noIntercept ? nvars : nvars + 1;
		double[][] x = new double[nobs][cols];
		int pointer = 0;
		for (int i = 0; i < nobs; i++) {
			y[i] = data[(pointer++)];
			if (!(noIntercept)) {
				x[i][0] = 1.0;
			}
			for (int j = noIntercept ? 0 : 1; j < cols; j++) {
				x[i][j] = data[(pointer++)];
			}
		}
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.Array2DRowRealMatrix(x);
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.Y = new org.apache.commons.math.linear.ArrayRealVector(y);
	}

	protected void newYSampleData(double[] y) {
		if (y == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((y.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.Y = new org.apache.commons.math.linear.ArrayRealVector(y);
	}

	protected void newXSampleData(double[][] x) {
		if (x == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((x.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		if (noIntercept) {
			org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.Array2DRowRealMatrix(x, true);
		}else {
			final int nVars = x[0].length;
			final double[][] xAug = new double[x.length][nVars + 1];
			for (int i = 0; i < (x.length); i++) {
				if ((x[i].length) != nVars) {
					throw new org.apache.commons.math.exception.DimensionMismatchException(x[i].length, nVars);
				}
				xAug[i][0] = 1.0;
				java.lang.System.arraycopy(x[i], 0, xAug[i], 1, nVars);
			}
			org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.this.X = new org.apache.commons.math.linear.Array2DRowRealMatrix(xAug, false);
		}
	}

	protected void validateSampleData(double[][] x, double[] y) {
		if ((x == null) || (y == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((x.length) != (y.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(y.length, x.length);
		}
		if ((x.length) == 0) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		if (((x[0].length) + 1) > (x.length)) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, x.length, x[0].length);
		}
	}

	protected void validateCovarianceData(double[][] x, double[][] covariance) {
		if ((x.length) != (covariance.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(x.length, covariance.length);
		}
		if (((covariance.length) > 0) && ((covariance.length) != (covariance[0].length))) {
			throw new org.apache.commons.math.linear.NonSquareMatrixException(covariance.length, covariance[0].length);
		}
	}

	public double[] estimateRegressionParameters() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		return b.toArray();
	}

	public double[] estimateResiduals() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		org.apache.commons.math.linear.RealVector e = Y.subtract(X.operate(b));
		return e.toArray();
	}

	public double[][] estimateRegressionParametersVariance() {
		return calculateBetaVariance().getData();
	}

	public double[] estimateRegressionParametersStandardErrors() {
		double[][] betaVariance = estimateRegressionParametersVariance();
		double sigma = calculateErrorVariance();
		int length = betaVariance[0].length;
		double[] result = new double[length];
		for (int i = 0; i < length; i++) {
			result[i] = org.apache.commons.math.util.FastMath.sqrt((sigma * (betaVariance[i][i])));
		}
		return result;
	}

	public double estimateRegressandVariance() {
		return calculateYVariance();
	}

	public double estimateErrorVariance() {
		return calculateErrorVariance();
	}

	public double estimateRegressionStandardError() {
		return java.lang.Math.sqrt(estimateErrorVariance());
	}

	protected abstract org.apache.commons.math.linear.RealVector calculateBeta();

	protected abstract org.apache.commons.math.linear.RealMatrix calculateBetaVariance();

	protected double calculateYVariance() {
		return new org.apache.commons.math.stat.descriptive.moment.Variance().evaluate(Y.toArray());
	}

	protected double calculateErrorVariance() {
		org.apache.commons.math.linear.RealVector residuals = calculateResiduals();
		return (residuals.dotProduct(residuals)) / ((X.getRowDimension()) - (X.getColumnDimension()));
	}

	protected org.apache.commons.math.linear.RealVector calculateResiduals() {
		org.apache.commons.math.linear.RealVector b = calculateBeta();
		return Y.subtract(X.operate(b));
	}
}

