

package org.apache.commons.math.distribution;


public class NormalDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.NormalDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private static final double SQRT2PI = org.apache.commons.math.util.FastMath.sqrt((2 * (org.apache.commons.math.util.FastMath.PI)));

	private static final double SQRT2 = org.apache.commons.math.util.FastMath.sqrt(2.0);

	private final double mean;

	private final double standardDeviation;

	private final double solverAbsoluteAccuracy;

	public NormalDistributionImpl(double mean, double sd) {
		this(mean, sd, org.apache.commons.math.distribution.NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public NormalDistributionImpl(double mean, double sd, double inverseCumAccuracy) {
		if (sd <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.STANDARD_DEVIATION, sd);
		}
		this.mean = mean;
		standardDeviation = sd;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public NormalDistributionImpl() {
		this(0, 1);
	}

	public double getMean() {
		return mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	@java.lang.Override
	public double density(double x) {
		final double x0 = x - (mean);
		final double x1 = x0 / (standardDeviation);
		return (org.apache.commons.math.util.FastMath.exp((((-0.5) * x1) * x1))) / ((standardDeviation) * (org.apache.commons.math.distribution.NormalDistributionImpl.SQRT2PI));
	}

	public double cumulativeProbability(double x) {
		final double dev = x - (mean);
		if ((org.apache.commons.math.util.FastMath.abs(dev)) > (40 * (standardDeviation))) {
			return dev < 0 ? 0.0 : 1.0;
		}
		return 0.5 * (1 + (org.apache.commons.math.special.Erf.erf((dev / ((standardDeviation) * (org.apache.commons.math.distribution.NormalDistributionImpl.SQRT2))))));
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) {
		if (x0 > x1) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		final double denom = (standardDeviation) * (org.apache.commons.math.distribution.NormalDistributionImpl.SQRT2);
		final double v0 = (x0 - (mean)) / denom;
		final double v1 = (x1 - (mean)) / denom;
		return 0.5 * (org.apache.commons.math.special.Erf.erf(v0, v1));
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
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
	public double sample() {
		return randomData.nextGaussian(mean, standardDeviation);
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = -(java.lang.Double.MAX_VALUE);
		}else {
			ret = mean;
		}
		return ret;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = mean;
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (mean) - (standardDeviation);
		}else
			if (p > 0.5) {
				ret = (mean) + (standardDeviation);
			}else {
				ret = mean;
			}
		
		return ret;
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
		return getMean();
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double s = getStandardDeviation();
		return s * s;
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

