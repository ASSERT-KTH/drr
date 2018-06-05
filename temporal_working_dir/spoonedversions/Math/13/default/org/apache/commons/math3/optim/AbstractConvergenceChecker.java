

package org.apache.commons.math3.optim;


public abstract class AbstractConvergenceChecker<PAIR> implements org.apache.commons.math3.optim.ConvergenceChecker<PAIR> {
	private final double relativeThreshold;

	private final double absoluteThreshold;

	public AbstractConvergenceChecker(final double relativeThreshold, final double absoluteThreshold) {
		this.relativeThreshold = relativeThreshold;
		this.absoluteThreshold = absoluteThreshold;
	}

	public double getRelativeThreshold() {
		return relativeThreshold;
	}

	public double getAbsoluteThreshold() {
		return absoluteThreshold;
	}

	public abstract boolean converged(int iteration, PAIR previous, PAIR current);
}

