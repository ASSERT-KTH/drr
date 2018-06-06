

package org.apache.commons.math.distribution;


public class CauchyDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.CauchyDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private final double median;

	private final double scale;

	private final double solverAbsoluteAccuracy;

	public CauchyDistributionImpl() {
		this(0, 1);
	}

	public CauchyDistributionImpl(double median, double scale) {
		this(median, scale, org.apache.commons.math.distribution.CauchyDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public CauchyDistributionImpl(double median, double scale, double inverseCumAccuracy) {
		if (scale <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.SCALE, scale);
		}
		this.scale = scale;
		this.median = median;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double cumulativeProbability(double x) {
		return 0.5 + ((org.apache.commons.math.util.FastMath.atan(((x - (median)) / (scale)))) / (org.apache.commons.math.util.FastMath.PI));
	}

	public double getMedian() {
		return median;
	}

	public double getScale() {
		return scale;
	}

	@java.lang.Override
	public double density(double x) {
		final double dev = x - (median);
		return (1 / (org.apache.commons.math.util.FastMath.PI)) * ((scale) / ((dev * dev) + ((scale) * (scale))));
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) {
		double ret;
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0, 1);
		}else
			if (p == 0) {
				ret = java.lang.Double.NEGATIVE_INFINITY;
			}else
				if (p == 1) {
					ret = java.lang.Double.POSITIVE_INFINITY;
				}else {
					ret = (median) + ((scale) * (org.apache.commons.math.util.FastMath.tan(((org.apache.commons.math.util.FastMath.PI) * (p - 0.5)))));
				}
			
		
		return ret;
	}

	@java.lang.Override
	protected double getDomainLowerBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = -(java.lang.Double.MAX_VALUE);
		}else {
			ret = median;
		}
		return ret;
	}

	@java.lang.Override
	protected double getDomainUpperBound(double p) {
		double ret;
		if (p < 0.5) {
			ret = median;
		}else {
			ret = java.lang.Double.MAX_VALUE;
		}
		return ret;
	}

	@java.lang.Override
	protected double getInitialDomain(double p) {
		double ret;
		if (p < 0.5) {
			ret = (median) - (scale);
		}else
			if (p > 0.5) {
				ret = (median) + (scale);
			}else {
				ret = median;
			}
		
		return ret;
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
		return java.lang.Double.NaN;
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
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

