



package org.apache.commons.math.analysis.interpolation;


public class BicubicSplineInterpolatingFunction implements org.apache.commons.math.analysis.BivariateRealFunction {
	private static final double[][] aInv = new double[][]{ new double[]{ 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } , new double[]{ -3 , 3 , 0 , 0 , -2 , -1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 2 , -2 , 0 , 0 , 1 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , -3 , 3 , 0 , 0 , -2 , -1 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 2 , -2 , 0 , 0 , 1 , 1 , 0 , 0 } , new double[]{ -3 , 0 , 3 , 0 , 0 , 0 , 0 , 0 , -2 , 0 , -1 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , -3 , 0 , 3 , 0 , 0 , 0 , 0 , 0 , -2 , 0 , -1 , 0 } , new double[]{ 9 , -9 , -9 , 9 , 6 , 3 , -6 , -3 , 6 , -6 , 3 , -3 , 4 , 2 , 2 , 1 } , new double[]{ -6 , 6 , 6 , -6 , -3 , -3 , 3 , 3 , -4 , 4 , -2 , 2 , -2 , -2 , -1 , -1 } , new double[]{ 2 , 0 , -2 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 0 , 0 , 0 , 0 , 0 } , new double[]{ 0 , 0 , 0 , 0 , 2 , 0 , -2 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 0 } , new double[]{ -6 , 6 , 6 , -6 , -4 , -2 , 4 , 2 , -3 , 3 , -3 , 3 , -2 , -1 , -2 , -1 } , new double[]{ 4 , -4 , -4 , 4 , 2 , 2 , -2 , -2 , 2 , -2 , 2 , -2 , 1 , 1 , 1 , 1 } };

	private final double[] xval;

	private final double[] yval;

	private final org.apache.commons.math.analysis.interpolation.BicubicSplineFunction[][] splines;

	public BicubicSplineInterpolatingFunction(double[] x, double[] y, double[][] z, double[][] dZdX, double[][] dZdY, double[][] dZdXdY) throws org.apache.commons.math.MathException {
		final int xLen = x.length;
		final int yLen = y.length;
		if ((((xLen == 0) || (yLen == 0)) || ((z.length) == 0)) || ((z[0].length) == 0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("no data");
		}
		if (xLen != (z.length)) {
			throw new org.apache.commons.math.DimensionMismatchException(xLen, z.length);
		}
		if (xLen != (dZdX.length)) {
			throw new org.apache.commons.math.DimensionMismatchException(xLen, dZdX.length);
		}
		if (xLen != (dZdY.length)) {
			throw new org.apache.commons.math.DimensionMismatchException(xLen, dZdY.length);
		}
		if (xLen != (dZdXdY.length)) {
			throw new org.apache.commons.math.DimensionMismatchException(xLen, dZdXdY.length);
		}
		org.apache.commons.math.util.MathUtils.checkOrder(x, 1, true);
		org.apache.commons.math.util.MathUtils.checkOrder(y, 1, true);
		xval = x.clone();
		yval = y.clone();
		final int lastI = xLen - 1;
		final int lastJ = yLen - 1;
		splines = new org.apache.commons.math.analysis.interpolation.BicubicSplineFunction[lastI][lastJ];
		for (int i = 0; i < lastI; i++) {
			if ((z[i].length) != yLen) {
				throw new org.apache.commons.math.DimensionMismatchException(z[i].length, yLen);
			}
			if ((dZdX[i].length) != yLen) {
				throw new org.apache.commons.math.DimensionMismatchException(dZdX[i].length, yLen);
			}
			if ((dZdY[i].length) != yLen) {
				throw new org.apache.commons.math.DimensionMismatchException(dZdY[i].length, yLen);
			}
			if ((dZdXdY[i].length) != yLen) {
				throw new org.apache.commons.math.DimensionMismatchException(dZdXdY[i].length, yLen);
			}
			final int ip1 = i + 1;
			for (int j = 0; j < lastJ; j++) {
				final int jp1 = j + 1;
				final double[] beta = new double[]{ z[i][j] , z[ip1][j] , z[i][jp1] , z[ip1][jp1] , dZdX[i][j] , dZdX[ip1][j] , dZdX[i][jp1] , dZdX[ip1][jp1] , dZdY[i][j] , dZdY[ip1][j] , dZdY[i][jp1] , dZdY[ip1][jp1] , dZdXdY[i][j] , dZdXdY[ip1][j] , dZdXdY[i][jp1] , dZdXdY[ip1][jp1] };
				splines[i][j] = new org.apache.commons.math.analysis.interpolation.BicubicSplineFunction(computeSplineCoefficients(beta));
			}
		}
	}

	public double value(double x, double y) {
		final int i = searchIndex(x, xval);
		if (i == (-1)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", x, xval[0], xval[((xval.length) - 1)]);
		}
		final int j = searchIndex(y, yval);
		if (j == (-1)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", y, yval[0], yval[((yval.length) - 1)]);
		}
		final double xN = (x - (xval[i])) / ((xval[(i + 1)]) - (xval[i]));
		final double yN = (y - (yval[j])) / ((yval[(j + 1)]) - (yval[j]));
		return splines[i][j].value(xN, yN);
	}

	private int searchIndex(double c, double[] val) {
		if (c < (val[0])) {
			return -1;
		}
		for (int i = 1, max = val.length; i < max; i++) {
			if (c <= (val[i])) {
				return i - 1;
			}
		}
		return -1;
	}

	private double[] computeSplineCoefficients(double[] beta) {
		final double[] a = new double[16];
		for (int i = 0; i < 16; i++) {
			double result = 0;
			final double[] row = org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.aInv[i];
			for (int j = 0; j < 16; j++) {
				result += (row[j]) * (beta[j]);
			}
			a[i] = result;
		}
		return a;
	}
}

class BicubicSplineFunction implements org.apache.commons.math.analysis.BivariateRealFunction {
	private final double a00;

	private final double a01;

	private final double a02;

	private final double a03;

	private final double a10;

	private final double a11;

	private final double a12;

	private final double a13;

	private final double a20;

	private final double a21;

	private final double a22;

	private final double a23;

	private final double a30;

	private final double a31;

	private final double a32;

	private final double a33;

	public BicubicSplineFunction(double[] a) {
		this.a00 = a[0];
		this.a10 = a[1];
		this.a20 = a[2];
		this.a30 = a[3];
		this.a01 = a[4];
		this.a11 = a[5];
		this.a21 = a[6];
		this.a31 = a[7];
		this.a02 = a[8];
		this.a12 = a[9];
		this.a22 = a[10];
		this.a32 = a[11];
		this.a03 = a[12];
		this.a13 = a[13];
		this.a23 = a[14];
		this.a33 = a[15];
	}

	public double value(double x, double y) {
		if ((x < 0) || (x > 1)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", x, 0, 1);
		}
		if ((y < 0) || (y > 1)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", y, 0, 1);
		}
		final double x2 = x * x;
		final double x3 = x2 * x;
		final double y2 = y * y;
		final double y3 = y2 * y;
		return (((((((((((((((a00) + ((a01) * y)) + ((a02) * y2)) + ((a03) * y3)) + ((a10) * x)) + (((a11) * x) * y)) + (((a12) * x) * y2)) + (((a13) * x) * y3)) + ((a20) * x2)) + (((a21) * x2) * y)) + (((a22) * x2) * y2)) + (((a23) * x2) * y3)) + ((a30) * x3)) + (((a31) * x3) * y)) + (((a32) * x3) * y2)) + (((a33) * x3) * y3);
	}
}

