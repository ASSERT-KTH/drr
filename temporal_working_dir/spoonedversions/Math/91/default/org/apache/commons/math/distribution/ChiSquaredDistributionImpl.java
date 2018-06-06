

package org.apache.commons.math.distribution;


public class ChiSquaredDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ChiSquaredDistribution {
	private static final long serialVersionUID = -8352658048349159782L;

	private org.apache.commons.math.distribution.GammaDistribution gamma;

	public ChiSquaredDistributionImpl(double df) {
		this(df, new org.apache.commons.math.distribution.GammaDistributionImpl((df / 2.0), 2.0));
	}

	public ChiSquaredDistributionImpl(double df, org.apache.commons.math.distribution.GammaDistribution g) {
		super();
		setGamma(g);
		setDegreesOfFreedom(df);
	}

	public void setDegreesOfFreedom(double degreesOfFreedom) {
		getGamma().setAlpha((degreesOfFreedom / 2.0));
	}

	public double getDegreesOfFreedom() {
		return (getGamma().getAlpha()) * 2.0;
	}

	public double density(java.lang.Double x) {
		return gamma.density(x);
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		return getGamma().cumulativeProbability(x);
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

	protected double getDomainLowerBound(double p) {
		return (java.lang.Double.MIN_VALUE) * (getGamma().getBeta());
	}

	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = getDegreesOfFreedom();
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (getDegreesOfFreedom()) * 0.5;
		}else {
			ret = getDegreesOfFreedom();
		}
		return ret;
	}

	public void setGamma(org.apache.commons.math.distribution.GammaDistribution g) {
		org.apache.commons.math.distribution.ChiSquaredDistributionImpl.this.gamma = g;
	}

	private org.apache.commons.math.distribution.GammaDistribution getGamma() {
		return gamma;
	}
}

