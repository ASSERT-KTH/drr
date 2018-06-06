

package org.apache.commons.math.optimization;


public class SimpleRealPointChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> {
	public SimpleRealPointChecker() {
	}

	public SimpleRealPointChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	public boolean converged(final int iteration, final org.apache.commons.math.optimization.RealPointValuePair... points) {
		if ((points.length) != 2) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(points.length, 2);
		}
		final double[] p = points[0].getPoint();
		final double[] c = points[1].getPoint();
		for (int i = 0; i < (p.length); ++i) {
			final double difference = org.apache.commons.math.util.FastMath.abs(((p[i]) - (c[i])));
			final double size = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(p[i]), org.apache.commons.math.util.FastMath.abs(c[i]));
			if ((difference > (size * (getRelativeThreshold()))) && (difference > (getAbsoluteThreshold()))) {
				return false;
			}
		}
		return true;
	}
}

