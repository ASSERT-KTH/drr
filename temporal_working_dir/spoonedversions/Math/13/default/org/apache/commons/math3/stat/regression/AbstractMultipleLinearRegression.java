

package org.apache.commons.math3.stat.regression;


public abstract class AbstractMultipleLinearRegression implements org.apache.commons.math3.stat.regression.MultipleLinearRegression {
	private org.apache.commons.math3.linear.RealMatrix xMatrix;

	private org.apache.commons.math3.linear.RealVector yVector;

	private boolean noIntercept = false;

	protected org.apache.commons.math3.linear.RealMatrix getX() {
		return xMatrix;
	}

	protected org.apache.commons.math3.linear.RealVector getY() {
		return yVector;
	}

	public boolean isNoIntercept() {
		return noIntercept;
	}

	public void setNoIntercept(boolean noIntercept) {
		org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.noIntercept = noIntercept;
	}

	public void newSampleData(double[] data, int nobs, int nvars) {
		if (data == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((data.length) != (nobs * (nvars + 1))) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(data.length, (nobs * (nvars + 1)));
		}
		if (nobs <= nvars) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(nobs, nvars, false);
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
		org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.xMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(x);
		org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.yVector = new org.apache.commons.math3.linear.ArrayRealVector(y);
	}

	protected void newYSampleData(double[] y) {
		if (y == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((y.length) == 0) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.yVector = new org.apache.commons.math3.linear.ArrayRealVector(y);
	}

	protected void newXSampleData(double[][] x) {
		if (x == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((x.length) == 0) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		if (noIntercept) {
			org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.xMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(x, true);
		}else {
			final int nVars = x[0].length;
			final double[][] xAug = new double[x.length][nVars + 1];
			for (int i = 0; i < (x.length); i++) {
				if ((x[i].length) != nVars) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(x[i].length, nVars);
				}
				xAug[i][0] = 1.0;
				java.lang.System.arraycopy(x[i], 0, xAug[i], 1, nVars);
			}
			org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.this.xMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(xAug, false);
		}
	}

	protected void validateSampleData(double[][] x, double[] y) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if ((x == null) || (y == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((x.length) != (y.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(y.length, x.length);
		}
		if ((x.length) == 0) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		if (((x[0].length) + 1) > (x.length)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, x.length, x[0].length);
		}
	}

	protected void validateCovarianceData(double[][] x, double[][] covariance) {
		if ((x.length) != (covariance.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(x.length, covariance.length);
		}
		if (((covariance.length) > 0) && ((covariance.length) != (covariance[0].length))) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(covariance.length, covariance[0].length);
		}
	}

	public double[] estimateRegressionParameters() {
		org.apache.commons.math3.linear.RealVector b = calculateBeta();
		return b.toArray();
	}

	public double[] estimateResiduals() {
		org.apache.commons.math3.linear.RealVector b = calculateBeta();
		org.apache.commons.math3.linear.RealVector e = yVector.subtract(xMatrix.operate(b));
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
			result[i] = org.apache.commons.math3.util.FastMath.sqrt((sigma * (betaVariance[i][i])));
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

	protected abstract org.apache.commons.math3.linear.RealVector calculateBeta();

	protected abstract org.apache.commons.math3.linear.RealMatrix calculateBetaVariance();

	protected double calculateYVariance() {
		return new org.apache.commons.math3.stat.descriptive.moment.Variance().evaluate(yVector.toArray());
	}

	protected double calculateErrorVariance() {
		org.apache.commons.math3.linear.RealVector residuals = calculateResiduals();
		return (residuals.dotProduct(residuals)) / ((xMatrix.getRowDimension()) - (xMatrix.getColumnDimension()));
	}

	protected org.apache.commons.math3.linear.RealVector calculateResiduals() {
		org.apache.commons.math3.linear.RealVector b = calculateBeta();
		return yVector.subtract(xMatrix.operate(b));
	}
}

