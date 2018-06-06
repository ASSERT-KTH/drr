

package org.apache.commons.math3.distribution;


public class PoissonDistribution extends org.apache.commons.math3.distribution.AbstractIntegerDistribution {
	public static final int DEFAULT_MAX_ITERATIONS = 10000000;

	public static final double DEFAULT_EPSILON = 1.0E-12;

	private static final long serialVersionUID = -3349935121172596109L;

	private final org.apache.commons.math3.distribution.NormalDistribution normal;

	private final org.apache.commons.math3.distribution.ExponentialDistribution exponential;

	private final double mean;

	private final int maxIterations;

	private final double epsilon;

	public PoissonDistribution(double p) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(p, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_EPSILON, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_MAX_ITERATIONS);
	}

	public PoissonDistribution(double p, double epsilon, int maxIterations) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(new org.apache.commons.math3.random.Well19937c(), p, epsilon, maxIterations);
	}

	public PoissonDistribution(org.apache.commons.math3.random.RandomGenerator rng, double p, double epsilon, int maxIterations) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rng);
		if (p <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.MEAN, p);
		}
		mean = p;
		this.epsilon = epsilon;
		this.maxIterations = maxIterations;
		normal = new org.apache.commons.math3.distribution.NormalDistribution(rng, p, org.apache.commons.math3.util.FastMath.sqrt(p), org.apache.commons.math3.distribution.NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
		exponential = new org.apache.commons.math3.distribution.ExponentialDistribution(rng, 1, org.apache.commons.math3.distribution.ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
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
		return ((int) (org.apache.commons.math3.util.FastMath.min(nextPoisson(mean), java.lang.Integer.MAX_VALUE)));
	}

	private long nextPoisson(double meanPoisson) {
		final double pivot = 40.0;
		if (meanPoisson < pivot) {
			double p = org.apache.commons.math3.util.FastMath.exp((-meanPoisson));
			long n = 0;
			double r = 1.0;
			double rnd = 1.0;
			while (n < (1000 * meanPoisson)) {
				rnd = random.nextDouble();
				r = r * rnd;
				if (r >= p) {
					n++;
				}else {
					return n;
				}
			} 
			return n;
		}else {
			final double lambda = org.apache.commons.math3.util.FastMath.floor(meanPoisson);
			final double lambdaFractional = meanPoisson - lambda;
			final double logLambda = org.apache.commons.math3.util.FastMath.log(lambda);
			final double logLambdaFactorial = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(((int) (lambda)));
			final long y2 = lambdaFractional < (java.lang.Double.MIN_VALUE) ? 0 : nextPoisson(lambdaFractional);
			final double delta = org.apache.commons.math3.util.FastMath.sqrt((lambda * (org.apache.commons.math3.util.FastMath.log((((32 * lambda) / (org.apache.commons.math3.util.FastMath.PI)) + 1)))));
			final double halfDelta = delta / 2;
			final double twolpd = (2 * lambda) + delta;
			final double a1 = (org.apache.commons.math3.util.FastMath.sqrt(((org.apache.commons.math3.util.FastMath.PI) * twolpd))) * (org.apache.commons.math3.util.FastMath.exp(((1 / 8) * lambda)));
			final double a2 = (twolpd / delta) * (org.apache.commons.math3.util.FastMath.exp((((-delta) * (1 + delta)) / twolpd)));
			final double aSum = (a1 + a2) + 1;
			final double p1 = a1 / aSum;
			final double p2 = a2 / aSum;
			final double c1 = 1 / (8 * lambda);
			double x = 0;
			double y = 0;
			double v = 0;
			int a = 0;
			double t = 0;
			double qr = 0;
			double qa = 0;
			for (; ;) {
				final double u = random.nextDouble();
				if (u <= p1) {
					final double n = random.nextGaussian();
					x = (n * (org.apache.commons.math3.util.FastMath.sqrt((lambda + halfDelta)))) - 0.5;
					if ((x > delta) || (x < (-lambda))) {
						continue;
					}
					y = (x < 0) ? org.apache.commons.math3.util.FastMath.floor(x) : org.apache.commons.math3.util.FastMath.ceil(x);
					final double e = exponential.sample();
					v = ((-e) - ((n * n) / 2)) + c1;
				}else {
					if (u > (p1 + p2)) {
						y = lambda;
						break;
					}else {
						x = delta + ((twolpd / delta) * (exponential.sample()));
						y = org.apache.commons.math3.util.FastMath.ceil(x);
						v = (-(exponential.sample())) - ((delta * (x + 1)) / twolpd);
					}
				}
				a = (x < 0) ? 1 : 0;
				t = (y * (y + 1)) / (2 * lambda);
				if ((v < (-t)) && (a == 0)) {
					y = lambda + y;
					break;
				}
				qr = t * ((((2 * y) + 1) / (6 * lambda)) - 1);
				qa = qr - ((t * t) / (3 * (lambda + (a * (y + 1)))));
				if (v < qa) {
					y = lambda + y;
					break;
				}
				if (v > qr) {
					continue;
				}
				if (v < (((y * logLambda) - (org.apache.commons.math3.util.ArithmeticUtils.factorialLog(((int) (y + lambda))))) + logLambdaFactorial)) {
					y = lambda + y;
					break;
				}
			}
			return y2 + ((long) (y));
		}
	}
}

