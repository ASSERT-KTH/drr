

package org.apache.commons.math3.analysis.function;


public class StepFunction implements org.apache.commons.math3.analysis.UnivariateFunction {
	private final double[] abscissa;

	private final double[] ordinate;

	public StepFunction(double[] x, double[] y) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		if ((x == null) || (y == null)) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (((x.length) == 0) || ((y.length) == 0)) {
			throw new org.apache.commons.math3.exception.NoDataException();
		}
		if ((y.length) != (x.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(y.length, x.length);
		}
		org.apache.commons.math3.util.MathArrays.checkOrder(x);
		abscissa = org.apache.commons.math3.util.MathArrays.copyOf(x);
		ordinate = org.apache.commons.math3.util.MathArrays.copyOf(y);
	}

	public double value(double x) {
		int index = java.util.Arrays.binarySearch(abscissa, x);
		double fx = 0;
		if (index < (-1)) {
			fx = ordinate[((-index) - 2)];
		}else
			if (index >= 0) {
				fx = ordinate[index];
			}else {
				fx = ordinate[0];
			}
		
		return fx;
	}
}

