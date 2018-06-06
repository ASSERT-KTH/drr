

package org.apache.commons.math.distribution;


public class PoissonDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.PoissonDistribution {
	private static final long serialVersionUID = -3349935121172596109L;

	private org.apache.commons.math.distribution.NormalDistribution normal;

	private double mean;

	public PoissonDistributionImpl(double p) {
		this(p, new org.apache.commons.math.distribution.NormalDistributionImpl());
	}

	public PoissonDistributionImpl(double p, org.apache.commons.math.distribution.NormalDistribution z) {
		super();
		setNormal(z);
		setMean(p);
	}

	public double getMean() {
		return org.apache.commons.math.distribution.PoissonDistributionImpl.this.mean;
	}

	public void setMean(double p) {
		if (p <= 0) {
			throw new java.lang.IllegalArgumentException("The Poisson mean must be positive");
		}
		org.apache.commons.math.distribution.PoissonDistributionImpl.this.mean = p;
		normal.setMean(p);
		normal.setStandardDeviation(java.lang.Math.sqrt(p));
	}

	public double probability(int x) {
		if ((x < 0) || (x == (java.lang.Integer.MAX_VALUE))) {
			return 0;
		}
		return ((java.lang.Math.pow(getMean(), x)) / (org.apache.commons.math.util.MathUtils.factorialDouble(x))) * (java.lang.Math.exp((-(mean))));
	}

	@java.lang.Override
	public double cumulativeProbability(int x) throws org.apache.commons.math.MathException {
		if (x < 0) {
			return 0;
		}
		if (x == (java.lang.Integer.MAX_VALUE)) {
			return 1;
		}
		return org.apache.commons.math.special.Gamma.regularizedGammaQ((((double) (x)) + 1), mean, 1.0E-12, java.lang.Integer.MAX_VALUE);
	}

	public double normalApproximateProbability(int x) throws org.apache.commons.math.MathException {
		return normal.cumulativeProbability((x + 0.5));
	}

	@java.lang.Override
	protected int getDomainLowerBound(double p) {
		return 0;
	}

	@java.lang.Override
	protected int getDomainUpperBound(double p) {
		return java.lang.Integer.MAX_VALUE;
	}

	public void setNormal(org.apache.commons.math.distribution.NormalDistribution value) {
		normal = value;
	}
}

