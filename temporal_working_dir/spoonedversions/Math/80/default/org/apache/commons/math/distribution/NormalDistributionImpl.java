

package org.apache.commons.math.distribution;


public class NormalDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.NormalDistribution {
	private static final long serialVersionUID = 8589540077390120676L;

	private static final double SQRT2PI = java.lang.Math.sqrt((2 * (java.lang.Math.PI)));

	private double mean = 0;

	private double standardDeviation = 1;

	public NormalDistributionImpl(double mean, double sd) {
		super();
		setMean(mean);
		setStandardDeviation(sd);
	}

	public NormalDistributionImpl() {
		this(0.0, 1.0);
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		org.apache.commons.math.distribution.NormalDistributionImpl.this.mean = mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double sd) {
		if (sd <= 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("standard deviation must be positive ({0})", sd);
		}
		standardDeviation = sd;
	}

	public double density(java.lang.Double x) {
		double x0 = x - (getMean());
		return (java.lang.Math.exp((((-x0) * x0) / ((2 * (getStandardDeviation())) * (getStandardDeviation()))))) / ((getStandardDeviation()) * (org.apache.commons.math.distribution.NormalDistributionImpl.SQRT2PI));
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		try {
			return 0.5 * (1.0 + (org.apache.commons.math.special.Erf.erf(((x - (mean)) / ((standardDeviation) * (java.lang.Math.sqrt(2.0)))))));
		} catch (org.apache.commons.math.MaxIterationsExceededException ex) {
			if (x < ((mean) - (20 * (standardDeviation)))) {
				return 0.0;
			}else
				if (x > ((mean) + (20 * (standardDeviation)))) {
					return 1.0;
				}else {
					throw ex;
				}
			
		}
	}

	@java.lang.Override
	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return java.lang.Double.NEGATIVE_INFINITY;
		}
		if (p == 1) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return super.inverseCumulativeProbability(p);
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = -(java.lang.Double.MAX_VALUE);
		}else {
			ret = getMean();
		}
		return ret;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = getMean();
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (getMean()) - (getStandardDeviation());
		}else
			if (p > 0.5) {
				ret = (getMean()) + (getStandardDeviation());
			}else {
				ret = getMean();
			}
		
		return ret;
	}
}

