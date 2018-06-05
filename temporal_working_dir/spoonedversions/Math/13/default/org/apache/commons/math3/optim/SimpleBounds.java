

package org.apache.commons.math3.optim;


public class SimpleBounds implements org.apache.commons.math3.optim.OptimizationData {
	private final double[] lower;

	private final double[] upper;

	public SimpleBounds(double[] lB, double[] uB) {
		lower = lB.clone();
		upper = uB.clone();
	}

	public double[] getLower() {
		return lower.clone();
	}

	public double[] getUpper() {
		return upper.clone();
	}

	public static org.apache.commons.math3.optim.SimpleBounds unbounded(int dim) {
		final double[] lB = new double[dim];
		java.util.Arrays.fill(lB, java.lang.Double.NEGATIVE_INFINITY);
		final double[] uB = new double[dim];
		java.util.Arrays.fill(uB, java.lang.Double.POSITIVE_INFINITY);
		return new org.apache.commons.math3.optim.SimpleBounds(lB, uB);
	}
}

