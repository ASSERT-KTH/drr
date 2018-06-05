

package org.apache.commons.math.distribution;


public class CauchyDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.CauchyDistribution {
	private static final long serialVersionUID = 8589540077390120676L;

	private double median = 0;

	private double scale = 1;

	public CauchyDistributionImpl() {
		this(0.0, 1.0);
	}

	public CauchyDistributionImpl(double median, double s) {
		super();
		setMedian(median);
		setScale(s);
	}

	public double cumulativeProbability(double x) {
		return 0.5 + ((java.lang.Math.atan(((x - (median)) / (scale)))) / (java.lang.Math.PI));
	}

	public double getMedian() {
		return median;
	}

	public double getScale() {
		return scale;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw new java.lang.IllegalArgumentException("probability argument must be between 0 and 1 (inclusive)");
		}else
			if (p == 0) {
				ret = java.lang.Double.NEGATIVE_INFINITY;
			}else
				if (p == 1) {
					ret = java.lang.Double.POSITIVE_INFINITY;
				}else {
					ret = (median) + ((scale) * (java.lang.Math.tan(((java.lang.Math.PI) * (p - 0.5)))));
				}
			
		
		return ret;
	}

	public void setMedian(double median) {
		org.apache.commons.math.distribution.CauchyDistributionImpl.this.median = median;
	}

	public void setScale(double s) {
		if (s <= 0.0) {
			throw new java.lang.IllegalArgumentException("Scale must be positive.");
		}
		scale = s;
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = -(java.lang.Double.MAX_VALUE);
		}else {
			ret = getMedian();
		}
		return ret;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = getMedian();
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (getMedian()) - (getScale());
		}else
			if (p > 0.5) {
				ret = (getMedian()) + (getScale());
			}else {
				ret = getMedian();
			}
		
		return ret;
	}
}

