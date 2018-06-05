

package org.apache.commons.math.distribution;


public class ExponentialDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ExponentialDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 2401296428283614780L;

	private final double mean;

	private final double solverAbsoluteAccuracy;

	public ExponentialDistributionImpl(double mean) {
		this(mean, org.apache.commons.math.distribution.ExponentialDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public ExponentialDistributionImpl(double mean, double inverseCumAccuracy) {
		if (mean <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.MEAN, mean);
		}
		this.mean = mean;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getMean() {
		return mean;
	}

	@java.lang.Override
	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		return (org.apache.commons.math.util.FastMath.exp(((-x) / (mean)))) / (mean);
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = 1.0 - (org.apache.commons.math.util.FastMath.exp(((-x) / (mean))));
		}
		return ret;
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math.MathException {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0.0, 1.0);
		}else
			if (p == 1.0) {
				ret = java.lang.Double.POSITIVE_INFINITY;
			}else {
				ret = (-(mean)) * (org.apache.commons.math.util.FastMath.log((1.0 - p)));
			}
		
		return ret;
	}

	@java.lang.Override
	public double sample() throws org.apache.commons.math.MathException {
		return randomData.nextExponential(mean);
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		return 0;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		if (p < 0.5) {
			return mean;
		}else {
			return java.lang.Double.MAX_VALUE;
		}
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		if (p < 0.5) {
			return (mean) * 0.5;
		}else {
			return mean;
		}
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}
}

