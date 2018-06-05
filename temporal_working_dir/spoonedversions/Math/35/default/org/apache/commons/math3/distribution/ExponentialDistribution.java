

package org.apache.commons.math3.distribution;


public class ExponentialDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 2401296428283614780L;

	private final double mean;

	private final double solverAbsoluteAccuracy;

	public ExponentialDistribution(double mean) {
		this(mean, org.apache.commons.math3.distribution.ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public ExponentialDistribution(double mean, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (mean <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.MEAN, mean);
		}
		this.mean = mean;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getMean() {
		return mean;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		return (org.apache.commons.math3.util.FastMath.exp(((-x) / (mean)))) / (mean);
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = 1.0 - (org.apache.commons.math3.util.FastMath.exp(((-x) / (mean))));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0.0, 1.0);
		}else
			if (p == 1.0) {
				ret = java.lang.Double.POSITIVE_INFINITY;
			}else {
				ret = (-(mean)) * (org.apache.commons.math3.util.FastMath.log((1.0 - p)));
			}
		
		return ret;
	}

	@java.lang.Override
	public double sample() {
		return randomData.nextExponential(mean);
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return getMean();
	}

	public double getNumericalVariance() {
		final double m = getMean();
		return m * m;
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

