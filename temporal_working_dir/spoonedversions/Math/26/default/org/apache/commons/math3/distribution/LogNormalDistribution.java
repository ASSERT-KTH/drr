

package org.apache.commons.math3.distribution;


public class LogNormalDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 20120112;

	private static final double SQRT2PI = org.apache.commons.math3.util.FastMath.sqrt((2 * (org.apache.commons.math3.util.FastMath.PI)));

	private static final double SQRT2 = org.apache.commons.math3.util.FastMath.sqrt(2.0);

	private final double scale;

	private final double shape;

	private final double solverAbsoluteAccuracy;

	public LogNormalDistribution() {
		this(0, 1);
	}

	public LogNormalDistribution(double scale, double shape) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(scale, shape, org.apache.commons.math3.distribution.LogNormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public LogNormalDistribution(double scale, double shape, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(new org.apache.commons.math3.random.Well19937c(), scale, shape, inverseCumAccuracy);
	}

	public LogNormalDistribution(org.apache.commons.math3.random.RandomGenerator rng, double scale, double shape, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rng);
		if (shape <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.SHAPE, shape);
		}
		this.scale = scale;
		this.shape = shape;
		this.solverAbsoluteAccuracy = inverseCumAccuracy;
	}

	public double getScale() {
		return scale;
	}

	public double getShape() {
		return shape;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		if (x <= 0) {
			return 0;
		}
		final double x0 = (org.apache.commons.math3.util.FastMath.log(x)) - (scale);
		final double x1 = x0 / (shape);
		return (org.apache.commons.math3.util.FastMath.exp((((-0.5) * x1) * x1))) / (((shape) * (org.apache.commons.math3.distribution.LogNormalDistribution.SQRT2PI)) * x);
	}

	public double cumulativeProbability(double x) {
		if (x <= 0) {
			return 0;
		}
		final double dev = (org.apache.commons.math3.util.FastMath.log(x)) - (scale);
		if ((org.apache.commons.math3.util.FastMath.abs(dev)) > (40 * (shape))) {
			return dev < 0 ? 0.0 : 1.0;
		}
		return 0.5 + (0.5 * (org.apache.commons.math3.special.Erf.erf((dev / ((shape) * (org.apache.commons.math3.distribution.LogNormalDistribution.SQRT2))))));
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (x0 > x1) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		if ((x0 <= 0) || (x1 <= 0)) {
			return super.cumulativeProbability(x0, x1);
		}
		final double denom = (shape) * (org.apache.commons.math3.distribution.LogNormalDistribution.SQRT2);
		final double v0 = ((org.apache.commons.math3.util.FastMath.log(x0)) - (scale)) / denom;
		final double v1 = ((org.apache.commons.math3.util.FastMath.log(x1)) - (scale)) / denom;
		return 0.5 * (org.apache.commons.math3.special.Erf.erf(v0, v1));
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		double s = shape;
		return org.apache.commons.math3.util.FastMath.exp(((scale) + ((s * s) / 2)));
	}

	public double getNumericalVariance() {
		final double s = shape;
		final double ss = s * s;
		return ((org.apache.commons.math3.util.FastMath.exp(ss)) - 1) * (org.apache.commons.math3.util.FastMath.exp(((2 * (scale)) + ss)));
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

	@java.lang.Override
	public double sample() {
		final double n = random.nextGaussian();
		return org.apache.commons.math3.util.FastMath.exp(((scale) + ((shape) * n)));
	}
}

