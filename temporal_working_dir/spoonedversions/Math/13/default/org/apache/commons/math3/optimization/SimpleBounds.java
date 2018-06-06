

package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class SimpleBounds implements org.apache.commons.math3.optimization.OptimizationData {
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
}

