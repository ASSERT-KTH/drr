

package org.apache.commons.math.distribution;


public class TDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.TDistribution {
	private static final long serialVersionUID = -5852615386664158222L;

	private double degreesOfFreedom;

	public TDistributionImpl(double degreesOfFreedom) {
		super();
		setDegreesOfFreedom(degreesOfFreedom);
	}

	public void setDegreesOfFreedom(double degreesOfFreedom) {
		if (degreesOfFreedom <= 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("degrees of freedom must be positive ({0})", degreesOfFreedom);
		}
		org.apache.commons.math.distribution.TDistributionImpl.this.degreesOfFreedom = degreesOfFreedom;
	}

	public double getDegreesOfFreedom() {
		return degreesOfFreedom;
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x == 0.0) {
			ret = 0.5;
		}else {
			double t = org.apache.commons.math.special.Beta.regularizedBeta(((getDegreesOfFreedom()) / ((getDegreesOfFreedom()) + (x * x))), (0.5 * (getDegreesOfFreedom())), 0.5);
			if (x < 0.0) {
				ret = 0.5 * t;
			}else {
				ret = 1.0 - (0.5 * t);
			}
		}
		return ret;
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
		return -(java.lang.Double.MAX_VALUE);
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		return java.lang.Double.MAX_VALUE;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		return 0.0;
	}
}

