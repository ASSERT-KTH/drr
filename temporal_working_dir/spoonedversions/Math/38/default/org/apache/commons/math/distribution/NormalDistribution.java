

package org.apache.commons.math.distribution;


public class NormalDistribution extends org.apache.commons.math.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private static final double SQRT2PI = org.apache.commons.math.util.FastMath.sqrt((2 * (org.apache.commons.math.util.FastMath.PI)));

	private static final double SQRT2 = org.apache.commons.math.util.FastMath.sqrt(2.0);

	private final double mean;

	private final double standardDeviation;

	private final double solverAbsoluteAccuracy;

	public NormalDistribution(double mean, double sd) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
		this(mean, sd, org.apache.commons.math.distribution.NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public NormalDistribution(double mean, double sd, double inverseCumAccuracy) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
		if (sd <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.STANDARD_DEVIATION, sd);
		}
		this.mean = mean;
		standardDeviation = sd;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public NormalDistribution() {
		this(0, 1);
	}

	public double getMean() {
		return mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		final double x0 = x - (mean);
		final double x1 = x0 / (standardDeviation);
		return (org.apache.commons.math.util.FastMath.exp((((-0.5) * x1) * x1))) / ((standardDeviation) * (org.apache.commons.math.distribution.NormalDistribution.SQRT2PI));
	}

	public double cumulativeProbability(double x) {
		final double dev = x - (mean);
		if ((org.apache.commons.math.util.FastMath.abs(dev)) > (40 * (standardDeviation))) {
			return dev < 0 ? 0.0 : 1.0;
		}
		return 0.5 * (1 + (org.apache.commons.math.special.Erf.erf((dev / ((standardDeviation) * (org.apache.commons.math.distribution.NormalDistribution.SQRT2))))));
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.exception.NumberIsTooLargeException {
		if (x0 > x1) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		final double denom = (standardDeviation) * (org.apache.commons.math.distribution.NormalDistribution.SQRT2);
		final double v0 = (x0 - (mean)) / denom;
		final double v1 = (x1 - (mean)) / denom;
		return 0.5 * (org.apache.commons.math.special.Erf.erf(v0, v1));
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return getMean();
	}

	public double getNumericalVariance() {
		final double s = getStandardDeviation();
		return s * s;
	}

	public double getSupportLowerBound() {
		return java.lang.Double.NEGATIVE_INFINITY;
	}

	public double getSupportUpperBound() {
		return java.lang.Double.POSITIVE_INFINITY;
	}

	public boolean isSupportLowerBoundInclusive() {
		return false;
	}

	public boolean isSupportUpperBoundInclusive() {
		return false;
	}

	public boolean isSupportConnected() {
		return true;
	}

	@java.lang.Override
	public double sample() {
		return randomData.nextGaussian(mean, standardDeviation);
	}
}

