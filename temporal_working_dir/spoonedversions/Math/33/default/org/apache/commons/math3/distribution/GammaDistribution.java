

package org.apache.commons.math3.distribution;


public class GammaDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -3239549463135430361L;

	private final double alpha;

	private final double beta;

	private final double solverAbsoluteAccuracy;

	public GammaDistribution(double alpha, double beta) {
		this(alpha, beta, org.apache.commons.math3.distribution.GammaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public GammaDistribution(double alpha, double beta, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (alpha <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.ALPHA, alpha);
		}
		if (beta <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.BETA, beta);
		}
		this.alpha = alpha;
		this.beta = beta;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getAlpha() {
		return alpha;
	}

	public double getBeta() {
		return beta;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		return (((org.apache.commons.math3.util.FastMath.pow((x / (beta)), ((alpha) - 1))) / (beta)) * (org.apache.commons.math3.util.FastMath.exp(((-x) / (beta))))) / (org.apache.commons.math3.util.FastMath.exp(org.apache.commons.math3.special.Gamma.logGamma(alpha)));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0) {
			ret = 0;
		}else {
			ret = org.apache.commons.math3.special.Gamma.regularizedGammaP(alpha, (x / (beta)));
		}
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return (getAlpha()) * (getBeta());
	}

	public double getNumericalVariance() {
		final double b = getBeta();
		return ((getAlpha()) * b) * b;
	}

	public double getSupportLowerBound() {
		return 0;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return true;
	}
}

