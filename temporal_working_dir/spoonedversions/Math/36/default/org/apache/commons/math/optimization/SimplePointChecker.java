

package org.apache.commons.math.optimization;


public class SimplePointChecker<PAIR extends org.apache.commons.math.util.Pair<double[], ? extends java.lang.Object>> extends org.apache.commons.math.optimization.AbstractConvergenceChecker<PAIR> {
	public SimplePointChecker() {
	}

	public SimplePointChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	@java.lang.Override
	public boolean converged(final int iteration, final PAIR previous, final PAIR current) {
		final double[] p = previous.getKey();
		final double[] c = current.getKey();
		for (int i = 0; i < (p.length); ++i) {
			final double pi = p[i];
			final double ci = c[i];
			final double difference = org.apache.commons.math.util.FastMath.abs((pi - ci));
			final double size = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(pi), org.apache.commons.math.util.FastMath.abs(ci));
			if ((difference > (size * (getRelativeThreshold()))) && (difference > (getAbsoluteThreshold()))) {
				return false;
			}
		}
		return true;
	}
}

