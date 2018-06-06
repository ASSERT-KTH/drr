

package org.apache.commons.math3.distribution;


public class GammaDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1.0E-9;

	private static final long serialVersionUID = -3239549463135430361L;

	private final double alpha;

	private final double beta;

	private final double shiftedShape;

	private final double densityPrefactor1;

	private final double densityPrefactor2;

	private final double minY;

	private final double maxLogY;

	private final double solverAbsoluteAccuracy;

	public GammaDistribution(double alpha, double beta) {
		this(alpha, beta, org.apache.commons.math3.distribution.GammaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
	}

	public GammaDistribution(double alpha, double beta, double inverseCumAccuracy) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (alpha <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.ALPHA, alpha);
		}
		if (beta <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.BETA, beta);
		}
		this.alpha = alpha;
		this.beta = beta;
		this.solverAbsoluteAccuracy = inverseCumAccuracy;
		this.shiftedShape = (alpha + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + 0.5;
		final double aux = (org.apache.commons.math3.util.FastMath.E) / ((2.0 * (org.apache.commons.math3.util.FastMath.PI)) * (shiftedShape));
		this.densityPrefactor2 = (alpha * (org.apache.commons.math3.util.FastMath.sqrt(aux))) / (org.apache.commons.math3.special.Gamma.lanczos(alpha));
		this.densityPrefactor1 = (((org.apache.commons.math3.distribution.GammaDistribution.this.densityPrefactor2) / beta) * (org.apache.commons.math3.util.FastMath.pow(shiftedShape, (-alpha)))) * (org.apache.commons.math3.util.FastMath.exp((alpha + (org.apache.commons.math3.special.Gamma.LANCZOS_G))));
		this.minY = (alpha + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) - (org.apache.commons.math3.util.FastMath.log(java.lang.Double.MAX_VALUE));
		this.maxLogY = (org.apache.commons.math3.util.FastMath.log(java.lang.Double.MAX_VALUE)) / (alpha - 1.0);
	}

	public double getAlpha() {
		return alpha;
	}

	public double getBeta() {
		return beta;
	}

	public double probability(double x) {
		return 0.0;
	}

	public double density(double x) {
		if (x < 0) {
			return 0;
		}
		final double y = x / (beta);
		if ((y <= (minY)) || ((org.apache.commons.math3.util.FastMath.log(y)) >= (maxLogY))) {
			final double aux1 = (y - (shiftedShape)) / (shiftedShape);
			final double aux2 = (alpha) * ((org.apache.commons.math3.util.FastMath.log1p(aux1)) - aux1);
			final double aux3 = ((((-y) * ((org.apache.commons.math3.special.Gamma.LANCZOS_G) + 0.5)) / (shiftedShape)) + (org.apache.commons.math3.special.Gamma.LANCZOS_G)) + aux2;
			return ((densityPrefactor2) / x) * (org.apache.commons.math3.util.FastMath.exp(aux3));
		}
		return ((densityPrefactor1) * (org.apache.commons.math3.util.FastMath.exp((-y)))) * (org.apache.commons.math3.util.FastMath.pow(y, ((alpha) - 1)));
	}

	public double cumulativeProbability(double x) {
		double ret;
		if (x <= 0) {
			ret = 0;
		}else {
			ret = org.apache.commons.math3.special.Gamma.regularizedGammaP(alpha, (x / (beta)));
		}
		return ret;
	}

	@java.lang.Override
	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public double getNumericalMean() {
		return (getAlpha()) * (getBeta());
	}

	public double getNumericalVariance() {
		final double b = getBeta();
		return ((getAlpha()) * b) * b;
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

