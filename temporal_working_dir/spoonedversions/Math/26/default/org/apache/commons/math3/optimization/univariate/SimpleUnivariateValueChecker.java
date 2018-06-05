

package org.apache.commons.math3.optimization.univariate;


public class SimpleUnivariateValueChecker extends org.apache.commons.math3.optimization.AbstractConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> {
	@java.lang.Deprecated
	public SimpleUnivariateValueChecker() {
	}

	public SimpleUnivariateValueChecker(final double relativeThreshold, final double absoluteThreshold) {
		super(relativeThreshold, absoluteThreshold);
	}

	@java.lang.Override
	public boolean converged(final int iteration, final org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair previous, final org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair current) {
		final double p = previous.getValue();
		final double c = current.getValue();
		final double difference = org.apache.commons.math3.util.FastMath.abs((p - c));
		final double size = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(p), org.apache.commons.math3.util.FastMath.abs(c));
		return (difference <= (size * (getRelativeThreshold()))) || (difference <= (getAbsoluteThreshold()));
	}
}

