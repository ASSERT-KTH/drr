

package org.apache.commons.math.distribution;


public class BetaDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements org.apache.commons.math.distribution.BetaDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -1221965979403477668L;

	private final double alpha;

	private final double beta;

	private double z;

	private final double solverAbsoluteAccuracy;

	public BetaDistributionImpl(double alpha, double beta, double inverseCumAccuracy) {
		this.alpha = alpha;
		this.beta = beta;
		z = java.lang.Double.NaN;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public BetaDistributionImpl(double alpha, double beta) {
		this(alpha, beta, org.apache.commons.math.distribution.BetaDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public double getAlpha() {
		return alpha;
	}

	public double getBeta() {
		return beta;
	}

	private void recomputeZ() {
		if (java.lang.Double.isNaN(z)) {
			z = ((org.apache.commons.math.special.Gamma.logGamma(alpha)) + (org.apache.commons.math.special.Gamma.logGamma(beta))) - (org.apache.commons.math.special.Gamma.logGamma(((alpha) + (beta))));
		}
	}

	@java.lang.Override
	public double density(double x) {
		recomputeZ();
		if ((x < 0) || (x > 1)) {
			return 0;
		}else
			if (x == 0) {
				if ((alpha) < 1) {
					throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA, alpha, 1, false);
				}
				return 0;
			}else
				if (x == 1) {
					if ((beta) < 1) {
						throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA, beta, 1, false);
					}
					return 0;
				}else {
					double logX = org.apache.commons.math.util.FastMath.log(x);
					double log1mX = org.apache.commons.math.util.FastMath.log1p((-x));
					return org.apache.commons.math.util.FastMath.exp((((((alpha) - 1) * logX) + (((beta) - 1) * log1mX)) - (z)));
				}
			
		
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return 0;
		}else
			if (p == 1) {
				return 1;
			}else {
				return super.inverseCumulativeProbability(p);
			}
		
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		return p;
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return 0;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		return 1;
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		if (x <= 0) {
			return 0;
		}else
			if (x >= 1) {
				return 1;
			}else {
				return org.apache.commons.math.special.Beta.regularizedBeta(x, alpha, beta);
			}
		
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
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
		return 1;
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		final double a = getAlpha();
		return a / (a + (getBeta()));
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double a = getAlpha();
		final double b = getBeta();
		final double alphabetasum = a + b;
		return (a * b) / ((alphabetasum * alphabetasum) * (alphabetasum + 1));
	}

	@java.lang.Override
	public boolean isSupportLowerBoundInclusive() {
		return false;
	}

	@java.lang.Override
	public boolean isSupportUpperBoundInclusive() {
		return false;
	}
}

