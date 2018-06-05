

package org.apache.commons.math.analysis.function;


public class StepFunction implements org.apache.commons.math.analysis.UnivariateRealFunction {
	private final double[] abscissa;

	private final double[] ordinate;

	public StepFunction(double[] x, double[] y) {
		if ((x == null) || (y == null)) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if (((x.length) == 0) || ((y.length) == 0)) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		if ((y.length) != (x.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(y.length, x.length);
		}
		org.apache.commons.math.util.MathArrays.checkOrder(x);
		abscissa = org.apache.commons.math.util.MathArrays.copyOf(x);
		ordinate = org.apache.commons.math.util.MathArrays.copyOf(y);
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

