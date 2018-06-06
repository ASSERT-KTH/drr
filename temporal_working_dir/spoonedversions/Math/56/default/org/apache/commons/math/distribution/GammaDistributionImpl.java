

package org.apache.commons.math.distribution;


public class GammaDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.GammaDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -3239549463135430361L;

	private final double alpha;

	private final double beta;

	private final double solverAbsoluteAccuracy;

	public GammaDistributionImpl(double alpha, double beta) {
		this(alpha, beta, org.apache.commons.math.distribution.GammaDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public GammaDistributionImpl(double alpha, double beta, double inverseCumAccuracy) {
		if (alpha <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.ALPHA, alpha);
		}
		if (beta <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.BETA, beta);
		}
		this.alpha = alpha;
		this.beta = beta;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x <= 0) {
			ret = 0;
		}else {
			ret = org.apache.commons.math.special.Gamma.regularizedGammaP(alpha, (x / (beta)));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return 0;
		}
		if (p == 1) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return super.inverseCumulativeProbability(p);
	}

	public double getAlpha() {
		return alpha;
	}

	public double getBeta() {
		return beta;
	}

	@java.lang.Override
	public double density(double x) {
		if (x < 0)
			return 0;
		
		return (((org.apache.commons.math.util.FastMath.pow((x / (beta)), ((alpha) - 1))) / (beta)) * (org.apache.commons.math.util.FastMath.exp(((-x) / (beta))))) / (org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.special.Gamma.logGamma(alpha)));
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return java.lang.Double.MIN_VALUE;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = (alpha) * (beta);
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = ((alpha) * (beta)) * 0.5;
		}else {
			ret = (alpha) * (beta);
		}
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	@java.lang.Override
	public double getSupportLowerBound() {
		return 0;
	}

	@java.lang.Override
	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		return (getAlpha()) * (getBeta());
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double b = getBeta();
		return ((getAlpha()) * b) * b;
	}

	@java.lang.Override
	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	@java.lang.Override
	public boolean isSupportUpperBoundInclusive() {
		return false;
	}
}

