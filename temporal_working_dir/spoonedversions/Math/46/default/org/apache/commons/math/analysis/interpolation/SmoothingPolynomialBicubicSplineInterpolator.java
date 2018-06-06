

package org.apache.commons.math.analysis.interpolation;


public class SmoothingPolynomialBicubicSplineInterpolator extends org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator {
	private final org.apache.commons.math.optimization.fitting.PolynomialFitter xFitter;

	private final org.apache.commons.math.optimization.fitting.PolynomialFitter yFitter;

	public SmoothingPolynomialBicubicSplineInterpolator() {
		this(3);
	}

	public SmoothingPolynomialBicubicSplineInterpolator(int degree) {
		this(degree, degree);
	}

	public SmoothingPolynomialBicubicSplineInterpolator(int xDegree, int yDegree) {
		xFitter = new org.apache.commons.math.optimization.fitting.PolynomialFitter(xDegree, new org.apache.commons.math.optimization.general.GaussNewtonOptimizer(false));
		yFitter = new org.apache.commons.math.optimization.fitting.PolynomialFitter(yDegree, new org.apache.commons.math.optimization.general.GaussNewtonOptimizer(false));
	}

	@java.lang.Override
	public org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction interpolate(final double[] xval, final double[] yval, final double[][] fval) {
		if ((((xval.length) == 0) || ((yval.length) == 0)) || ((fval.length) == 0)) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		if ((xval.length) != (fval.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(xval.length, fval.length);
		}
		final int xLen = xval.length;
		final int yLen = yval.length;
		for (int i = 0; i < xLen; i++) {
			if ((fval[i].length) != yLen) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(fval[i].length, yLen);
			}
		}
		org.apache.commons.math.util.MathUtils.checkOrder(xval);
		org.apache.commons.math.util.MathUtils.checkOrder(yval);
		final org.apache.commons.math.analysis.polynomials.PolynomialFunction[] yPolyX = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[yLen];
		for (int j = 0; j < yLen; j++) {
			xFitter.clearObservations();
			for (int i = 0; i < xLen; i++) {
				xFitter.addObservedPoint(1, xval[i], fval[i][j]);
			}
			yPolyX[j] = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(xFitter.fit());
		}
		final double[][] fval_1 = new double[xLen][yLen];
		for (int j = 0; j < yLen; j++) {
			final org.apache.commons.math.analysis.polynomials.PolynomialFunction f = yPolyX[j];
			for (int i = 0; i < xLen; i++) {
				fval_1[i][j] = f.value(xval[i]);
			}
		}
		final org.apache.commons.math.analysis.polynomials.PolynomialFunction[] xPolyY = new org.apache.commons.math.analysis.polynomials.PolynomialFunction[xLen];
		for (int i = 0; i < xLen; i++) {
			yFitter.clearObservations();
			for (int j = 0; j < yLen; j++) {
				yFitter.addObservedPoint(1, yval[j], fval_1[i][j]);
			}
			xPolyY[i] = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(yFitter.fit());
		}
		final double[][] fval_2 = new double[xLen][yLen];
		for (int i = 0; i < xLen; i++) {
			final org.apache.commons.math.analysis.polynomials.PolynomialFunction f = xPolyY[i];
			for (int j = 0; j < yLen; j++) {
				fval_2[i][j] = f.value(yval[j]);
			}
		}
		return super.interpolate(xval, yval, fval_2);
	}
}

