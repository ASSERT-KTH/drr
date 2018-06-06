

package org.apache.commons.math.optimization;


public abstract class AbstractConvergenceChecker<T> implements org.apache.commons.math.optimization.ConvergenceChecker<T> {
	private static final double DEFAULT_RELATIVE_THRESHOLD = 100 * (org.apache.commons.math.util.MathUtils.EPSILON);

	private static final double DEFAULT_ABSOLUTE_THRESHOLD = 100 * (org.apache.commons.math.util.MathUtils.SAFE_MIN);

	private final double relativeThreshold;

	private final double absoluteThreshold;

	public AbstractConvergenceChecker() {
		this.relativeThreshold = org.apache.commons.math.optimization.AbstractConvergenceChecker.DEFAULT_RELATIVE_THRESHOLD;
		this.absoluteThreshold = org.apache.commons.math.optimization.AbstractConvergenceChecker.DEFAULT_ABSOLUTE_THRESHOLD;
	}

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

	public abstract boolean converged(int iteration, T... points);
}

