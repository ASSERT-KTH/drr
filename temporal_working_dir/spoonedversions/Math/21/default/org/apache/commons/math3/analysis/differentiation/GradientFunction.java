

package org.apache.commons.math3.analysis.differentiation;


public class GradientFunction implements org.apache.commons.math3.analysis.MultivariateVectorFunction {
	private final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f;

	public GradientFunction(final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f) {
		this.f = f;
	}

	public double[] value(double[] point) throws java.lang.IllegalArgumentException {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[point.length];
		for (int i = 0; i < (point.length); ++i) {
			dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(point.length, 1, i, point[i]);
		}
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure dsY = f.value(dsX);
		final double[] y = new double[point.length];
		final int[] orders = new int[point.length];
		for (int i = 0; i < (point.length); ++i) {
			orders[i] = 1;
			y[i] = dsY.getPartialDerivative(orders);
			orders[i] = 0;
		}
		return y;
	}
}

