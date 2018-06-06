

package org.apache.commons.math.optimization;


public class SimpleValueChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.PointValuePair> {
	public SimpleValueChecker() {
	}

	public SimpleValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	@java.lang.Override
	public boolean converged(final int iteration, final org.apache.commons.math.optimization.PointValuePair previous, final org.apache.commons.math.optimization.PointValuePair current) {
		final double p = previous.getValue();
		final double c = current.getValue();
		final double difference = org.apache.commons.math.util.FastMath.abs((p - c));
		final double size = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(p), org.apache.commons.math.util.FastMath.abs(c));
		return (difference <= (size * (getRelativeThreshold()))) || (difference <= (getAbsoluteThreshold()));
	}
}

