

package org.apache.commons.math.distribution;


public class TDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.TDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -5852615386664158222L;

	private final double degreesOfFreedom;

	private final double solverAbsoluteAccuracy;

	public TDistributionImpl(double degreesOfFreedom, double inverseCumAccuracy) {
		if (degreesOfFreedom <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM, degreesOfFreedom);
		}
		this.degreesOfFreedom = degreesOfFreedom;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public TDistributionImpl(double degreesOfFreedom) {
		this(degreesOfFreedom, org.apache.commons.math.distribution.TDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public double getDegreesOfFreedom() {
		return degreesOfFreedom;
	}

	@java.lang.Override
	public double density(double x) {
		final double n = degreesOfFreedom;
		final double nPlus1Over2 = (n + 1) / 2;
		return org.apache.commons.math.util.FastMath.exp(((((org.apache.commons.math.special.Gamma.logGamma(nPlus1Over2)) - (0.5 * ((org.apache.commons.math.util.FastMath.log(org.apache.commons.math.util.FastMath.PI)) + (org.apache.commons.math.util.FastMath.log(n))))) - (org.apache.commons.math.special.Gamma.logGamma((n / 2)))) - (nPlus1Over2 * (org.apache.commons.math.util.FastMath.log((1 + ((x * x) / n)))))));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x == 0) {
			ret = 0.5;
		}else {
			double t = org.apache.commons.math.special.Beta.regularizedBeta(((degreesOfFreedom) / ((degreesOfFreedom) + (x * x))), (0.5 * (degreesOfFreedom)), 0.5);
			if (x < 0.0) {
				ret = 0.5 * t;
			}else {
				ret = 1.0 - (0.5 * t);
			}
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(final double p) {
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
		return 0;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	@java.lang.Override
	public double getSupportLowerBound() {
		return java.lang.Double.NEGATIVE_INFINITY;
	}

	@java.lang.Override
	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		final double df = getDegreesOfFreedom();
		if (df > 1) {
			return 0;
		}
		return java.lang.Double.NaN;
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double df = getDegreesOfFreedom();
		if (df > 2) {
			return df / (df - 2);
		}
		if ((df > 1) && (df <= 2)) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return java.lang.Double.NaN;
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

