

package org.apache.commons.math.distribution;


public class ExponentialDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ExponentialDistribution {
	private static final long serialVersionUID = 2401296428283614780L;

	private double mean;

	public ExponentialDistributionImpl(double mean) {
		super();
		setMean(mean);
	}

	public void setMean(double mean) {
		if (mean <= 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("mean must be positive ({0})", mean);
		}
		org.apache.commons.math.distribution.ExponentialDistributionImpl.this.mean = mean;
	}

	public double getMean() {
		return mean;
	}

	public double density(java.lang.Double x) {
		if (x < 0) {
			return 0;
		}
		return (java.lang.Math.exp(((-x) / (getMean())))) / (getMean());
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = 1.0 - (java.lang.Math.exp(((-x) / (getMean()))));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math.MathException {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", p, 0.0, 1.0);
		}else
			if (p == 1.0) {
				ret = java.lang.Double.POSITIVE_INFINITY;
			}else {
				ret = (-(getMean())) * (java.lang.Math.log((1.0 - p)));
			}
		
		return ret;
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return 0;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		if (p < 0.5) {
			return getMean();
		}else {
			return java.lang.Double.MAX_VALUE;
		}
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		if (p < 0.5) {
			return (getMean()) * 0.5;
		}else {
			return getMean();
		}
	}
}

