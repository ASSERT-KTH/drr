

package org.apache.commons.math.distribution;


public class NormalDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.NormalDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private static final double SQRT2PI = org.apache.commons.math.util.FastMath.sqrt((2 * (org.apache.commons.math.util.FastMath.PI)));

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

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		final double dev = x - (mean);
		try {
			return 0.5 * (1.0 + (org.apache.commons.math.special.Erf.erf((dev / ((standardDeviation) * (org.apache.commons.math.util.FastMath.sqrt(2.0)))))));
		} catch (org.apache.commons.math.MaxIterationsExceededException ex) {
			if (x < ((mean) - (20 * (standardDeviation)))) {
				return 0;
			}else
				if (x > ((mean) + (20 * (standardDeviation)))) {
					return 1;
				}else {
					throw ex;
				}
			
		}
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
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
	public double sample() throws org.apache.commons.math.MathException {
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
}

