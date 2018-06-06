

package org.apache.commons.math.optimization;


public class SimpleVectorialValueChecker implements java.io.Serializable , org.apache.commons.math.optimization.VectorialConvergenceChecker {
	private static final long serialVersionUID = -3892196630780700808L;

	private static final double DEFAULT_RELATIVE_THRESHOLD = 100 * (org.apache.commons.math.util.MathUtils.EPSILON);

	private static final double DEFAULT_ABSOLUTE_THRESHOLD = 100 * (org.apache.commons.math.util.MathUtils.SAFE_MIN);

	private final double relativeThreshold;

	private final double absoluteThreshold;

	public SimpleVectorialValueChecker() {
		this.relativeThreshold = org.apache.commons.math.optimization.SimpleVectorialValueChecker.DEFAULT_RELATIVE_THRESHOLD;
		this.absoluteThreshold = org.apache.commons.math.optimization.SimpleVectorialValueChecker.DEFAULT_ABSOLUTE_THRESHOLD;
	}

	public SimpleVectorialValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		this.relativeThreshold = relativeThreshold;
		this.absoluteThreshold = absoluteThreshold;
	}

	public boolean converged(final int iteration, final org.apache.commons.math.optimization.VectorialPointValuePair previous, final org.apache.commons.math.optimization.VectorialPointValuePair current) {
		final double[] p = previous.getValueRef();
		final double[] c = current.getValueRef();
		for (int i = 0; i < (p.length); ++i) {
			final double pi = p[i];
			final double ci = c[i];
			final double difference = java.lang.Math.abs((pi - ci));
			final double size = java.lang.Math.max(java.lang.Math.abs(pi), java.lang.Math.abs(ci));
			if ((difference > (size * (relativeThreshold))) && (difference > (absoluteThreshold))) {
				return false;
			}
		}
		return true;
	}
}

