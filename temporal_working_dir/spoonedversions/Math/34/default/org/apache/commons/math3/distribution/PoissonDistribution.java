

package org.apache.commons.math3.distribution;


public class PoissonDistribution extends org.apache.commons.math3.distribution.AbstractIntegerDistribution {
	public static final int DEFAULT_MAX_ITERATIONS = 10000000;

	public static final double DEFAULT_EPSILON = 1.0E-12;

	private static final long serialVersionUID = -3349935121172596109L;

	private final org.apache.commons.math3.distribution.NormalDistribution normal;

	private final double mean;

	private final int maxIterations;

	private final double epsilon;

	public PoissonDistribution(double p) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(p, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_EPSILON, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_MAX_ITERATIONS);
	}

	public PoissonDistribution(double p, double epsilon, int maxIterations) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (p <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.MEAN, p);
		}
		mean = p;
		normal = new org.apache.commons.math3.distribution.NormalDistribution(p, org.apache.commons.math3.util.FastMath.sqrt(p));
		this.epsilon = epsilon;
		this.maxIterations = maxIterations;
	}

	public PoissonDistribution(double p, double epsilon) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(p, epsilon, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_MAX_ITERATIONS);
	}

	public PoissonDistribution(double p, int maxIterations) {
		this(p, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_EPSILON, maxIterations);
	}

	public double getMean() {
		return mean;
	}

	public double probability(int x) {
		double ret;
		if ((x < 0) || (x == (java.lang.Integer.MAX_VALUE))) {
			ret = 0.0;
		}else
			if (x == 0) {
				ret = org.apache.commons.math3.util.FastMath.exp((-(mean)));
			}else {
				ret = (org.apache.commons.math3.util.FastMath.exp(((-(org.apache.commons.math3.distribution.SaddlePointExpansion.getStirlingError(x))) - (org.apache.commons.math3.distribution.SaddlePointExpansion.getDeviancePart(x, mean))))) / (org.apache.commons.math3.util.FastMath.sqrt(((org.apache.commons.math3.util.MathUtils.TWO_PI) * x)));
			}
		
		return ret;
	}

	public double cumulativeProbability(int x) {
		if (x < 0) {
			return 0;
		}
		if (x == (java.lang.Integer.MAX_VALUE)) {
			return 1;
		}
		return org.apache.commons.math3.special.Gamma.regularizedGammaQ((((double) (x)) + 1), mean, epsilon, maxIterations);
	}

	public double normalApproximateProbability(int x) {
		return normal.cumulativeProbability((x + 0.5));
	}

	public double getNumericalMean() {
		return getMean();
	}

	public double getNumericalVariance() {
		return getMean();
	}

	public int getSupportLowerBound() {
		return 0;
	}

	public int getSupportUpperBound() {
		return java.lang.Integer.MAX_VALUE;
	}

	public boolean isSupportConnected() {
		return true;
	}

	@java.lang.Override
	public int sample() {
		return ((int) (org.apache.commons.math3.util.FastMath.min(randomData.nextPoisson(mean), java.lang.Integer.MAX_VALUE)));
	}
}

