

package org.apache.commons.math3.analysis.interpolation;


public class BicubicSplineInterpolator implements org.apache.commons.math3.analysis.interpolation.BivariateGridInterpolator {
	public org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction interpolate(final double[] xval, final double[] yval, final double[][] fval) {
		if ((((xval.length) == 0) || ((yval.length) == 0)) || ((fval.length) == 0)) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		if ((xval.length) != (fval.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(xval.length, fval.length);
		}
		org.apache.commons.math3.util.MathArrays.checkOrder(xval);
		org.apache.commons.math3.util.MathArrays.checkOrder(yval);
		final int xLen = xval.length;
		final int yLen = yval.length;
		final double[][] fX = new double[yLen][xLen];
		for (int i = 0; i < xLen; i++) {
			if ((fval[i].length) != yLen) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(fval[i].length, yLen);
			}
			for (int j = 0; j < yLen; j++) {
				fX[j][i] = fval[i][j];
			}
		}
		final org.apache.commons.math3.analysis.interpolation.SplineInterpolator spInterpolator = new org.apache.commons.math3.analysis.interpolation.SplineInterpolator();
		final org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction[] ySplineX = new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction[yLen];
		for (int j = 0; j < yLen; j++) {
			ySplineX[j] = spInterpolator.interpolate(xval, fX[j]);
		}
		final org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction[] xSplineY = new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction[xLen];
		for (int i = 0; i < xLen; i++) {
			xSplineY[i] = spInterpolator.interpolate(yval, fval[i]);
		}
		final double[][] dFdX = new double[xLen][yLen];
		for (int j = 0; j < yLen; j++) {
			final org.apache.commons.math3.analysis.UnivariateFunction f = ySplineX[j].derivative();
			for (int i = 0; i < xLen; i++) {
				dFdX[i][j] = f.value(xval[i]);
			}
		}
		final double[][] dFdY = new double[xLen][yLen];
		for (int i = 0; i < xLen; i++) {
			final org.apache.commons.math3.analysis.UnivariateFunction f = xSplineY[i].derivative();
			for (int j = 0; j < yLen; j++) {
				dFdY[i][j] = f.value(yval[j]);
			}
		}
		final double[][] d2FdXdY = new double[xLen][yLen];
		for (int i = 0; i < xLen; i++) {
			final int nI = nextIndex(i, xLen);
			final int pI = previousIndex(i);
			for (int j = 0; j < yLen; j++) {
				final int nJ = nextIndex(j, yLen);
				final int pJ = previousIndex(j);
				d2FdXdY[i][j] = ((((fval[nI][nJ]) - (fval[nI][pJ])) - (fval[pI][nJ])) + (fval[pI][pJ])) / (((xval[nI]) - (xval[pI])) * ((yval[nJ]) - (yval[pJ])));
			}
		}
		return new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction(xval, yval, fval, dFdX, dFdY, d2FdXdY);
	}

	private int nextIndex(int i, int max) {
		final int index = i + 1;
		return index < max ? index : index - 1;
	}

	private int previousIndex(int i) {
		final int index = i - 1;
		return index >= 0 ? index : 0;
	}
}

