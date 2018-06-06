

package org.apache.commons.math.distribution;


public class WeibullDistribution extends org.apache.commons.math.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 8589540077390120676L;

	private final double shape;

	private final double scale;

	private final double solverAbsoluteAccuracy;

	private double numericalMean = java.lang.Double.NaN;

	private boolean numericalMeanIsCalculated = false;

	private double numericalVariance = java.lang.Double.NaN;

	private boolean numericalVarianceIsCalculated = false;

	public WeibullDistribution(double alpha, double beta) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
		this(alpha, beta, org.apache.commons.math.distribution.WeibullDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public WeibullDistribution(double alpha, double beta, double inverseCumAccuracy) throws org.apache.commons.math.exception.NotStrictlyPositiveException {
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

	public double getShape() {
		return shape;
	}

	public double getScale() {
		return scale;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		final double xscale = x / (scale);
		final double xscalepow = org.apache.commons.math.util.FastMath.pow(xscale, ((shape) - 1));
		final double xscalepowshape = xscalepow * xscale;
		return (((shape) / (scale)) * xscalepow) * (org.apache.commons.math.util.FastMath.exp((-xscalepowshape)));
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
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		if (!(numericalMeanIsCalculated)) {
			numericalMean = calculateNumericalMean();
			numericalMeanIsCalculated = true;
		}
		return numericalMean;
	}

	protected double calculateNumericalMean() {
		final double sh = getShape();
		final double sc = getScale();
		return sc * (org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.special.Gamma.logGamma((1 + (1 / sh)))));
	}

	public double getNumericalVariance() {
		if (!(numericalVarianceIsCalculated)) {
			numericalVariance = calculateNumericalVariance();
			numericalVarianceIsCalculated = true;
		}
		return numericalVariance;
	}

	protected double calculateNumericalVariance() {
		final double sh = getShape();
		final double sc = getScale();
		final double mn = getNumericalMean();
		return ((sc * sc) * (org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.special.Gamma.logGamma((1 + (2 / sh)))))) - (mn * mn);
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

