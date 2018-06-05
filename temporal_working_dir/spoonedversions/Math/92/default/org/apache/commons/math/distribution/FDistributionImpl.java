

package org.apache.commons.math.distribution;


public class FDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.FDistribution {
	private static final long serialVersionUID = -8516354193418641566L;

	private double numeratorDegreesOfFreedom;

	private double denominatorDegreesOfFreedom;

	public FDistributionImpl(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom) {
		super();
		setNumeratorDegreesOfFreedom(numeratorDegreesOfFreedom);
		setDenominatorDegreesOfFreedom(denominatorDegreesOfFreedom);
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			double n = getNumeratorDegreesOfFreedom();
			double m = getDenominatorDegreesOfFreedom();
			ret = org.apache.commons.math.special.Beta.regularizedBeta(((n * x) / (m + (n * x))), (0.5 * n), (0.5 * m));
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

	protected double getDomainLowerBound(double p) {
		return 0.0;
	}

	protected double getDomainUpperBound(double p) {
		return java.lang.Double.MAX_VALUE;
	}

	protected double getInitialDomain(double p) {
		double ret = 1.0;
		double d = getDenominatorDegreesOfFreedom();
		if (d > 2.0) {
			ret = d / (d - 2.0);
		}
		return ret;
	}

	public void setNumeratorDegreesOfFreedom(double degreesOfFreedom) {
		if (degreesOfFreedom <= 0.0) {
			throw new java.lang.IllegalArgumentException("degrees of freedom must be positive.");
		}
		org.apache.commons.math.distribution.FDistributionImpl.this.numeratorDegreesOfFreedom = degreesOfFreedom;
	}

	public double getNumeratorDegreesOfFreedom() {
		return numeratorDegreesOfFreedom;
	}

	public void setDenominatorDegreesOfFreedom(double degreesOfFreedom) {
		if (degreesOfFreedom <= 0.0) {
			throw new java.lang.IllegalArgumentException("degrees of freedom must be positive.");
		}
		org.apache.commons.math.distribution.FDistributionImpl.this.denominatorDegreesOfFreedom = degreesOfFreedom;
	}

	public double getDenominatorDegreesOfFreedom() {
		return denominatorDegreesOfFreedom;
	}
}

