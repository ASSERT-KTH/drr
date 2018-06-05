

package org.apache.commons.math.distribution;


public class FDistribution extends org.apache.commons.math.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -8516354193418641566L;

	private final double numeratorDegreesOfFreedom;

	private final double denominatorDegreesOfFreedom;

	private final double solverAbsoluteAccuracy;

	private double numericalVariance = java.lang.Double.NaN;

	private boolean numericalVarianceIsCalculated = false;

	public FDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
		this(numeratorDegreesOfFreedom, denominatorDegreesOfFreedom, org.apache.commons.math.distribution.FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public FDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom, double inverseCumAccuracy) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
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

	public double probability(double x) {
		return 0.0;
	}

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

	public double getNumericalMean() {
		final double denominatorDF = getDenominatorDegreesOfFreedom();
		if (denominatorDF > 2) {
			return denominatorDF / (denominatorDF - 2);
		}
		return java.lang.Double.NaN;
	}

	public double getNumericalVariance() {
		if (!(numericalVarianceIsCalculated)) {
			numericalVariance = calculateNumericalVariance();
			numericalVarianceIsCalculated = true;
		}
		return numericalVariance;
	}

	protected double calculateNumericalVariance() {
		final double denominatorDF = getDenominatorDegreesOfFreedom();
		if (denominatorDF > 4) {
			final double numeratorDF = getNumeratorDegreesOfFreedom();
			final double denomDFMinusTwo = denominatorDF - 2;
			return ((2 * (denominatorDF * denominatorDF)) * ((numeratorDF + denominatorDF) - 2)) / ((numeratorDF * (denomDFMinusTwo * denomDFMinusTwo)) * (denominatorDF - 4));
		}
		return java.lang.Double.NaN;
	}

	public double getSupportLowerBound() {
		return 0;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return true;
	}
}

