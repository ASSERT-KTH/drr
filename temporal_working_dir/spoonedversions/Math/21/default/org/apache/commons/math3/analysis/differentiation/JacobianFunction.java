

package org.apache.commons.math3.analysis.differentiation;


public class JacobianFunction implements org.apache.commons.math3.analysis.MultivariateMatrixFunction {
	private final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction f;

	public JacobianFunction(final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction f) {
		this.f = f;
	}

	public double[][] value(double[] point) throws java.lang.IllegalArgumentException {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[point.length];
		for (int i = 0; i < (point.length); ++i) {
			dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(point.length, 1, i, point[i]);
		}
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsY = f.value(dsX);
		final double[][] y = new double[dsY.length][point.length];
		final int[] orders = new int[point.length];
		for (int i = 0; i < (dsY.length); ++i) {
			for (int j = 0; j < (point.length); ++j) {
				orders[j] = 1;
				y[i][j] = dsY[i].getPartialDerivative(orders);
				orders[j] = 0;
			}
		}
		return y;
	}
}

