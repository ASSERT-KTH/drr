

package org.apache.commons.math.distribution;


public class GammaDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.GammaDistribution {
	private static final long serialVersionUID = -3239549463135430361L;

	private double alpha;

	private double beta;

	public GammaDistributionImpl(double alpha, double beta) {
		super();
		setAlpha(alpha);
		setBeta(beta);
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = org.apache.commons.math.special.Gamma.regularizedGammaP(getAlpha(), (x / (getBeta())));
		}
		return ret;
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return 0.0;
		}
		if (p == 1) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return super.inverseCumulativeProbability(p);
	}

	public void setAlpha(double alpha) {
		if (alpha <= 0.0) {
			throw new java.lang.IllegalArgumentException("alpha must be positive");
		}
		org.apache.commons.math.distribution.GammaDistributionImpl.this.alpha = alpha;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setBeta(double beta) {
		if (beta <= 0.0) {
			throw new java.lang.IllegalArgumentException("beta must be positive");
		}
		org.apache.commons.math.distribution.GammaDistributionImpl.this.beta = beta;
	}

	public double getBeta() {
		return beta;
	}

	protected double getDomainLowerBound(double p) {
		return java.lang.Double.MIN_VALUE;
	}

	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = (getAlpha()) * (getBeta());
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = ((getAlpha()) * (getBeta())) * 0.5;
		}else {
			ret = (getAlpha()) * (getBeta());
		}
		return ret;
	}
}

