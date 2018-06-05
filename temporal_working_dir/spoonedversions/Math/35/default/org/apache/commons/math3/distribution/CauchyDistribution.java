

package org.apache.commons.math3.distribution;


public class CauchyDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private final double median;

	private final double scale;

	private final double solverAbsoluteAccuracy;

	public CauchyDistribution() {
		this(0, 1);
	}

	public CauchyDistribution(double median, double scale) {
		this(median, scale, org.apache.commons.math3.distribution.CauchyDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public CauchyDistribution(double median, double scale, double inverseCumAccuracy) {
		if (scale <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.SCALE, scale);
		}
		this.scale = scale;
		this.median = median;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double cumulativeProbability(double x) {
		return 0.5 + ((org.apache.commons.math3.util.FastMath.atan(((x - (median)) / (scale)))) / (org.apache.commons.math3.util.FastMath.PI));
	}

	public double getMedian() {
		return median;
	}

	public double getScale() {
		return scale;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		final double dev = x - (median);
		return (1 / (org.apache.commons.math3.util.FastMath.PI)) * ((scale) / ((dev * dev) + ((scale) * (scale))));
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		double ret;
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0, 1);
		}else
			if (p == 0) {
				ret = java.lang.Double.NEGATIVE_INFINITY;
			}else
				if (p == 1) {
					ret = java.lang.Double.POSITIVE_INFINITY;
				}else {
					ret = (median) + ((scale) * (org.apache.commons.math3.util.FastMath.tan(((org.apache.commons.math3.util.FastMath.PI) * (p - 0.5)))));
				}
			
		
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return java.lang.Double.NaN;
	}

	public double getNumericalVariance() {
		return java.lang.Double.NaN;
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
}

