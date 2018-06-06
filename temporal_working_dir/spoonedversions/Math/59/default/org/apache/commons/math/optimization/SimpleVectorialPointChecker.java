

package org.apache.commons.math.optimization;


public class SimpleVectorialPointChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> {
	public SimpleVectorialPointChecker() {
	}

	public SimpleVectorialPointChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	@java.lang.Override
	public boolean converged(final int iteration, final org.apache.commons.math.optimization.VectorialPointValuePair previous, final org.apache.commons.math.optimization.VectorialPointValuePair current) {
		final double[] p = previous.getPointRef();
		final double[] c = current.getPointRef();
		for (int i = 0; i < (p.length); ++i) {
			final double pi = p[i];
			final double ci = c[i];
			final double difference = java.lang.Math.abs((pi - ci));
			final double size = java.lang.Math.max(java.lang.Math.abs(pi), java.lang.Math.abs(ci));
			if ((difference > (size * (getRelativeThreshold()))) && (difference > (getAbsoluteThreshold()))) {
				return false;
			}
		}
		return true;
	}
}

