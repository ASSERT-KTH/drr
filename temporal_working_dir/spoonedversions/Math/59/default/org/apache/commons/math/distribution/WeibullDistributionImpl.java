

package org.apache.commons.math.distribution;


public class WeibullDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements java.io.Serializable , org.apache.commons.math.distribution.WeibullDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private final double shape;

	private final double scale;

	private final double solverAbsoluteAccuracy;

	public WeibullDistributionImpl(double alpha, double beta) {
		this(alpha, beta, org.apache.commons.math.distribution.WeibullDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public WeibullDistributionImpl(double alpha, double beta, double inverseCumAccuracy) {
		if (alpha <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.SHAPE, alpha);
		}
		if (beta <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.SCALE, beta);
		}
		scale = beta;
		shape = alpha;
		solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0.0) {
			ret = 0.0;
		}else {
			ret = 1.0 - (org.apache.commons.math.util.FastMath.exp((-(org.apache.commons.math.util.FastMath.pow((x / (scale)), shape)))));
		}
		return ret;
	}

	public double getShape() {
		return shape;
	}

	public double getScale() {
		return scale;
	}

	@java.lang.Override
	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		final double xscale = x / (scale);
		final double xscalepow = org.apache.commons.math.util.FastMath.pow(xscale, ((shape) - 1));
		final double xscalepowshape = xscalepow * xscale;
		return (((shape) / (scale)) * xscalepow) * (org.apache.commons.math.util.FastMath.exp((-xscalepowshape)));
	}

	@java.lang.Override
	public double inverseCumulativeProbability(double p) {
		double ret;
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0.0, 1.0);
		}else
			if (p == 0) {
				ret = 0.0;
			}else
				if (p == 1) {
					ret = java.lang.Double.POSITIVE_INFINITY;
				}else {
					ret = (scale) * (org.apache.commons.math.util.FastMath.pow((-(org.apache.commons.math.util.FastMath.log((1.0 - p)))), (1.0 / (shape))));
				}
			
		
		return ret;
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
		return org.apache.commons.math.util.FastMath.pow(((scale) * (org.apache.commons.math.util.FastMath.log(2.0))), (1.0 / (shape)));
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
		final double sh = getShape();
		final double sc = getScale();
		return sc * (org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.special.Gamma.logGamma((1 + (1 / sh)))));
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double sh = getShape();
		final double sc = getScale();
		final double mn = getNumericalMean();
		return ((sc * sc) * (org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.special.Gamma.logGamma((1 + (2 / sh)))))) - (mn * mn);
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

