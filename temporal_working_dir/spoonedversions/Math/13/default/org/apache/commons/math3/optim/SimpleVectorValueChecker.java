

package org.apache.commons.math3.optim;


public class SimpleVectorValueChecker extends org.apache.commons.math3.optim.AbstractConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> {
	private static final int ITERATION_CHECK_DISABLED = -1;

	private final int maxIterationCount;

	public SimpleVectorValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
		maxIterationCount = org.apache.commons.math3.optim.SimpleVectorValueChecker.ITERATION_CHECK_DISABLED;
	}

	public SimpleVectorValueChecker(final double relativeThreshold, final double absoluteThreshold, final int maxIter) {
		super(relativeThreshold, absoluteThreshold);
		if (maxIter <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(maxIter);
		}
		maxIterationCount = maxIter;
	}

	@java.lang.Override
	public boolean converged(final int iteration, final org.apache.commons.math3.optim.PointVectorValuePair previous, final org.apache.commons.math3.optim.PointVectorValuePair current) {
		if ((maxIterationCount) != (org.apache.commons.math3.optim.SimpleVectorValueChecker.ITERATION_CHECK_DISABLED)) {
			if (iteration >= (maxIterationCount)) {
				return true;
			}
		}
		final double[] p = previous.getValueRef();
		final double[] c = current.getValueRef();
		for (int i = 0; i < (p.length); ++i) {
			final double pi = p[i];
			final double ci = c[i];
			final double difference = org.apache.commons.math3.util.FastMath.abs((pi - ci));
			final double size = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(pi), org.apache.commons.math3.util.FastMath.abs(ci));
			if ((difference > (size * (getRelativeThreshold()))) && (difference > (getAbsoluteThreshold()))) {
				return false;
			}
		}
		return true;
	}
}

