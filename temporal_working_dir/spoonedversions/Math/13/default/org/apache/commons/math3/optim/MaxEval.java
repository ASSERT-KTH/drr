

package org.apache.commons.math3.optim;


public class MaxEval implements org.apache.commons.math3.optim.OptimizationData {
	private final int maxEval;

	public MaxEval(int max) {
		if (max <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(max);
		}
		maxEval = max;
	}

	public int getMaxEval() {
		return maxEval;
	}

	public static org.apache.commons.math3.optim.MaxEval unlimited() {
		return new org.apache.commons.math3.optim.MaxEval(java.lang.Integer.MAX_VALUE);
	}
}

