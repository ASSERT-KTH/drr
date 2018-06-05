

package org.apache.commons.math.optimization;


public class SimpleVectorValueChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> {
	public SimpleVectorValueChecker() {
	}

	public SimpleVectorValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	@java.lang.Override
	public boolean converged(final int iteration, final org.apache.commons.math.optimization.PointVectorValuePair previous, final org.apache.commons.math.optimization.PointVectorValuePair current) {
		final double[] p = previous.getValueRef();
		final double[] c = current.getValueRef();
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

