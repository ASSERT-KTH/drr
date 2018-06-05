

package org.apache.commons.math3.distribution;


public class GammaDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = 20120524L;

	private final double shape;

	private final double scale;

	private final double shiftedShape;

	private final double densityPrefactor1;

	private final double densityPrefactor2;

	private final double minY;

	private final double maxLogY;

	private final double solverAbsoluteAccuracy;

	public GammaDistribution(double shape, double scale) {
		this(shape, scale, org.apache.commons.math3.distribution.GammaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public GammaDistribution(double shape, double scale, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(new org.apache.commons.math3.random.Well19937c(), shape, scale, inverseCumAccuracy);
	}

	public GammaDistribution(org.apache.commons.math3.random.RandomGenerator rng, double shape, double scale, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rng);
		if (shape <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.SHAPE, shape);
		}
		if (scale <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.SCALE, scale);
		}
		this.shape = shape;
		this.scale = scale;
		this.solverAbsoluteAccuracy = inverseCumAccuracy;
		this.shiftedShape = (shape + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + 0.5;
		final double aux = (org.apache.commons.math3.util.FastMath.E) / ((2.0 * (org.apache.commons.math3.util.FastMath.PI)) * (shiftedShape));
		this.densityPrefactor2 = (shape * (org.apache.commons.math3.util.FastMath.sqrt(aux))) / (org.apache.commons.math3.special.Gamma.lanczos(shape));
		this.densityPrefactor1 = (((org.apache.commons.math3.distribution.GammaDistribution.this.densityPrefactor2) / scale) * (org.apache.commons.math3.util.FastMath.pow(shiftedShape, (-shape)))) * (org.apache.commons.math3.util.FastMath.exp((shape + (org.apache.commons.math3.special.Gamma.LANCZOS_G))));
		this.minY = (shape + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) - (org.apache.commons.math3.util.FastMath.log(java.lang.Double.MAX_VALUE));
		this.maxLogY = (org.apache.commons.math3.util.FastMath.log(java.lang.Double.MAX_VALUE)) / (shape - 1.0);
	}

	public double getAlpha() {
		return shape;
	}

	public double getShape() {
		return shape;
	}

	public double getBeta() {
		return scale;
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
		final double y = x / (scale);
		if ((y <= (minY)) || ((org.apache.commons.math3.util.FastMath.log(y)) >= (maxLogY))) {
			final double aux1 = (y - (shiftedShape)) / (shiftedShape);
			final double aux2 = (shape) * ((org.apache.commons.math3.util.FastMath.log1p(aux1)) - aux1);
			final double aux3 = ((((-y) * ((org.apache.commons.math3.special.Gamma.LANCZOS_G) + 0.5)) / (shiftedShape)) + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + aux2;
			return ((densityPrefactor2) / x) * (org.apache.commons.math3.util.FastMath.exp(aux3));
		}
		return ((densityPrefactor1) * (org.apache.commons.math3.util.FastMath.exp((-y)))) * (org.apache.commons.math3.util.FastMath.pow(y, ((shape) - 1)));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0) {
			ret = 0;
		}else {
			ret = org.apache.commons.math3.special.Gamma.regularizedGammaP(shape, (x / (scale)));
		}
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return (shape) * (scale);
	}

	public double getNumericalVariance() {
		return ((shape) * (scale)) * (scale);
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
		if ((shape) < 1) {
			while (true) {
				final double u = random.nextDouble();
				final double bGS = 1 + ((shape) / (org.apache.commons.math3.util.FastMath.E));
				final double p = bGS * u;
				if (p <= 1) {
					final double x = org.apache.commons.math3.util.FastMath.pow(p, (1 / (shape)));
					final double u2 = random.nextDouble();
					if (u2 > (org.apache.commons.math3.util.FastMath.exp((-x)))) {
						continue;
					}else {
						return (scale) * x;
					}
				}else {
					final double x = (-1) * (org.apache.commons.math3.util.FastMath.log(((bGS - p) / (shape))));
					final double u2 = random.nextDouble();
					if (u2 > (org.apache.commons.math3.util.FastMath.pow(x, ((shape) - 1)))) {
						continue;
					}else {
						return (scale) * x;
					}
				}
			} 
		}
		final double d = (shape) - 0.3333333333333333;
		final double c = 1 / (3 * (org.apache.commons.math3.util.FastMath.sqrt(d)));
		while (true) {
			final double x = random.nextGaussian();
			final double v = ((1 + (c * x)) * (1 + (c * x))) * (1 + (c * x));
			if (v <= 0) {
				continue;
			}
			final double x2 = x * x;
			final double u = random.nextDouble();
			if (u < (1 - ((0.0331 * x2) * x2))) {
				return ((scale) * d) * v;
			}
			if ((org.apache.commons.math3.util.FastMath.log(u)) < ((0.5 * x2) + (d * ((1 - v) + (org.apache.commons.math3.util.FastMath.log(v)))))) {
				return ((scale) * d) * v;
			}
		} 
	}
}

