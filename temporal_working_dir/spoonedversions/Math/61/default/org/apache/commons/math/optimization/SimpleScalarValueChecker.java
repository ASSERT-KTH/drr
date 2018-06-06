

package org.apache.commons.math.optimization;


public class SimpleScalarValueChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> {
	public SimpleScalarValueChecker() {
	}

	public SimpleScalarValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	public boolean converged(final int iteration, final org.apache.commons.math.optimization.RealPointValuePair previous, final org.apache.commons.math.optimization.RealPointValuePair current) {
		final double p = previous.getValue();
		final double c = current.getValue();
		final double difference = org.apache.commons.math.util.FastMath.abs((p - c));
		final double size = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(p), org.apache.commons.math.util.FastMath.abs(c));
		return (difference <= (size * (getRelativeThreshold()))) || (difference <= (getAbsoluteThreshold()));
	}
}

