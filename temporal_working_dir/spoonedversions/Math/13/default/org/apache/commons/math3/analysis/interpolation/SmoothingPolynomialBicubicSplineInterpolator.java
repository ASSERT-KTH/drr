

package org.apache.commons.math3.analysis.interpolation;


public class SmoothingPolynomialBicubicSplineInterpolator extends org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator {
	private final org.apache.commons.math3.fitting.PolynomialFitter xFitter;

	private final int xDegree;

	private final org.apache.commons.math3.fitting.PolynomialFitter yFitter;

	private final int yDegree;

	public SmoothingPolynomialBicubicSplineInterpolator() {
		this(3);
	}

	public SmoothingPolynomialBicubicSplineInterpolator(int degree) {
		this(degree, degree);
	}

	public SmoothingPolynomialBicubicSplineInterpolator(int xDegree, int yDegree) {
		if (xDegree < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(xDegree);
		}
		if (yDegree < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(yDegree);
		}
		this.xDegree = xDegree;
		this.yDegree = yDegree;
		final double safeFactor = 100.0;
		final org.apache.commons.math3.optim.SimpleVectorValueChecker checker = new org.apache.commons.math3.optim.SimpleVectorValueChecker((safeFactor * (org.apache.commons.math3.util.Precision.EPSILON)), (safeFactor * (org.apache.commons.math3.util.Precision.SAFE_MIN)));
		xFitter = new org.apache.commons.math3.fitting.PolynomialFitter(new org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer(false, checker));
		yFitter = new org.apache.commons.math3.fitting.PolynomialFitter(new org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer(false, checker));
	}

	@java.lang.Override
	public org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction interpolate(final double[] xval, final double[] yval, final double[][] fval) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException {
		if ((((xval.length) == 0) || ((yval.length) == 0)) || ((fval.length) == 0)) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		if ((xval.length) != (fval.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(xval.length, fval.length);
		}
		final int xLen = xval.length;
		final int yLen = yval.length;
		for (int i = 0; i < xLen; i++) {
			if ((fval[i].length) != yLen) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(fval[i].length, yLen);
			}
		}
		org.apache.commons.math3.util.MathArrays.checkOrder(xval);
		org.apache.commons.math3.util.MathArrays.checkOrder(yval);
		final org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] yPolyX = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[yLen];
		for (int j = 0; j < yLen; j++) {
			xFitter.clearObservations();
			for (int i = 0; i < xLen; i++) {
				xFitter.addObservedPoint(1, xval[i], fval[i][j]);
			}
			yPolyX[j] = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(xFitter.fit(new double[(xDegree) + 1]));
		}
		final double[][] fval_1 = new double[xLen][yLen];
		for (int j = 0; j < yLen; j++) {
			final org.apache.commons.math3.analysis.polynomials.PolynomialFunction f = yPolyX[j];
			for (int i = 0; i < xLen; i++) {
				fval_1[i][j] = f.value(xval[i]);
			}
		}
		final org.apache.commons.math3.analysis.polynomials.PolynomialFunction[] xPolyY = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction[xLen];
		for (int i = 0; i < xLen; i++) {
			yFitter.clearObservations();
			for (int j = 0; j < yLen; j++) {
				yFitter.addObservedPoint(1, yval[j], fval_1[i][j]);
			}
			xPolyY[i] = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(yFitter.fit(new double[(yDegree) + 1]));
		}
		final double[][] fval_2 = new double[xLen][yLen];
		for (int i = 0; i < xLen; i++) {
			final org.apache.commons.math3.analysis.polynomials.PolynomialFunction f = xPolyY[i];
			for (int j = 0; j < yLen; j++) {
				fval_2[i][j] = f.value(yval[j]);
			}
		}
		return super.interpolate(xval, yval, fval_2);
	}
}

