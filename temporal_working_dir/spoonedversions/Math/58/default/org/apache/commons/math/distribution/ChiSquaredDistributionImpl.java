

package org.apache.commons.math.distribution;


public class ChiSquaredDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ChiSquaredDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -8352658048349159782L;

	private final org.apache.commons.math.distribution.GammaDistribution gamma;

	private final double solverAbsoluteAccuracy;

	public ChiSquaredDistributionImpl(double degreesOfFreedom) {
		this(degreesOfFreedom, org.apache.commons.math.distribution.ChiSquaredDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public ChiSquaredDistributionImpl(double degreesOfFreedom, double inverseCumAccuracy) {
		gamma = new org.apache.commons.math.distribution.GammaDistributionImpl((degreesOfFreedom / 2), 2);
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getDegreesOfFreedom() {
		return (gamma.getAlpha()) * 2.0;
	}

	@java.lang.Override
	public double density(double x) {
		return gamma.density(x);
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		return gamma.cumulativeProbability(x);
	}

	@java.lang.Override
	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return 0.0;
		}
		if (p == 1) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return super.inverseCumulativeProbability(p);
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return (java.lang.Double.MIN_VALUE) * (gamma.getBeta());
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = getDegreesOfFreedom();
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (getDegreesOfFreedom()) * 0.5;
		}else {
			ret = getDegreesOfFreedom();
		}
		return ret;
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
		return java.lang.Double.POSITIVE_INFINITY;
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		return getDegreesOfFreedom();
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		return 2 * (getDegreesOfFreedom());
	}

	@java.lang.Override
	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	@java.lang.Override
	public boolean isSupportUpperBoundInclusive() {
		return false;
	}
}

