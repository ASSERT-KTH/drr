

package org.apache.commons.math.distribution;


public class FDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.FDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -8516354193418641566L;

	private final double numeratorDegreesOfFreedom;

	private final double denominatorDegreesOfFreedom;

	private final double solverAbsoluteAccuracy;

	public FDistributionImpl(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom) {
		this(numeratorDegreesOfFreedom, denominatorDegreesOfFreedom, org.apache.commons.math.distribution.FDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public FDistributionImpl(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom, double inverseCumAccuracy) {
		if (numeratorDegreesOfFreedom <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM, numeratorDegreesOfFreedom);
		}
		if (denominatorDegreesOfFreedom <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DEGREES_OF_FREEDOM, denominatorDegreesOfFreedom);
		}
		this.numeratorDegreesOfFreedom = numeratorDegreesOfFreedom;
		this.denominatorDegreesOfFreedom = denominatorDegreesOfFreedom;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	@java.lang.Override
	public double density(double x) {
		final double nhalf = (numeratorDegreesOfFreedom) / 2;
		final double mhalf = (denominatorDegreesOfFreedom) / 2;
		final double logx = org.apache.commons.math.util.FastMath.log(x);
		final double logn = org.apache.commons.math.util.FastMath.log(numeratorDegreesOfFreedom);
		final double logm = org.apache.commons.math.util.FastMath.log(denominatorDegreesOfFreedom);
		final double lognxm = org.apache.commons.math.util.FastMath.log((((numeratorDegreesOfFreedom) * x) + (denominatorDegreesOfFreedom)));
		return org.apache.commons.math.util.FastMath.exp((((((((nhalf * logn) + (nhalf * logx)) - logx) + (mhalf * logm)) - (nhalf * lognxm)) - (mhalf * lognxm)) - (org.apache.commons.math.special.Beta.logBeta(nhalf, mhalf))));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0) {
			ret = 0;
		}else {
			double n = numeratorDegreesOfFreedom;
			double m = denominatorDegreesOfFreedom;
			ret = org.apache.commons.math.special.Beta.regularizedBeta(((n * x) / (m + (n * x))), (0.5 * n), (0.5 * m));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(final double p) {
		if (p == 0) {
			return 0;
		}
		if (p == 1) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		return super.inverseCumulativeProbability(p);
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return 0;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		return java.lang.Double.MAX_VALUE;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret = 1;
		double d = denominatorDegreesOfFreedom;
		if (d > 2) {
			ret = d / (d - 2);
		}
		return ret;
	}

	public double getNumeratorDegreesOfFreedom() {
		return numeratorDegreesOfFreedom;
	}

	public double getDenominatorDegreesOfFreedom() {
		return denominatorDegreesOfFreedom;
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
		final double denominatorDF = getDenominatorDegreesOfFreedom();
		if (denominatorDF > 2) {
			return denominatorDF / (denominatorDF - 2);
		}
		return java.lang.Double.NaN;
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double denominatorDF = getDenominatorDegreesOfFreedom();
		if (denominatorDF > 4) {
			final double numeratorDF = getNumeratorDegreesOfFreedom();
			final double denomDFMinusTwo = denominatorDF - 2;
			return ((2 * (denominatorDF * denominatorDF)) * ((numeratorDF + denominatorDF) - 2)) / ((numeratorDF * (denomDFMinusTwo * denomDFMinusTwo)) * (denominatorDF - 4));
		}
		return java.lang.Double.NaN;
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

