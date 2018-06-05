

package org.apache.commons.math.optimization;


public class SimpleVectorialValueChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> {
	public SimpleVectorialValueChecker() {
	}

	public SimpleVectorialValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	public boolean converged(final int iteration, final org.apache.commons.math.optimization.VectorialPointValuePair... points) {
		if ((points.length) != 2) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(points.length, 2);
		}
		final double[] p = points[0].getValueRef();
		final double[] c = points[1].getValueRef();
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

