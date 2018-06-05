

package org.apache.commons.math.optimization;


public class SimpleVectorialPointChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> {
	public SimpleVectorialPointChecker() {
	}

	public SimpleVectorialPointChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	public boolean converged(final int iteration, final org.apache.commons.math.optimization.VectorialPointValuePair... points) {
		if ((points.length) != 2) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(points.length, 2);
		}
		final double[] p = points[0].getPointRef();
		final double[] c = points[1].getPointRef();
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

