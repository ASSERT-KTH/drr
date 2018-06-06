

package org.apache.commons.math3.optim;


public class MaxIter implements org.apache.commons.math3.optim.OptimizationData {
	private final int maxIter;

	public MaxIter(int max) {
		if (max <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(max);
		}
		maxIter = max;
	}

	public int getMaxIter() {
		return maxIter;
	}

	public static org.apache.commons.math3.optim.MaxIter unlimited() {
		return new org.apache.commons.math3.optim.MaxIter(java.lang.Integer.MAX_VALUE);
	}
}

