

package org.apache.commons.math3.distribution;


public abstract class AbstractRealDistribution implements java.io.Serializable , org.apache.commons.math3.distribution.RealDistribution {
	public static final double SOLVER_DEFAULT_ABSOLUTE_ACCURACY = 1.0E-6;

	private static final long serialVersionUID = -38038050983108802L;

	protected final org.apache.commons.math3.random.RandomDataImpl randomData = new org.apache.commons.math3.random.RandomDataImpl();

	protected final org.apache.commons.math3.random.RandomGenerator random;

	private double solverAbsoluteAccuracy = org.apache.commons.math3.distribution.AbstractRealDistribution.SOLVER_DEFAULT_ABSOLUTE_ACCURACY;

	@java.lang.Deprecated
	protected AbstractRealDistribution() {
		random = null;
	}

	protected AbstractRealDistribution(org.apache.commons.math3.random.RandomGenerator rng) {
		random = rng;
	}

	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (x0 > x1) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0, 1);
		}
		double lowerBound = getSupportLowerBound();
		if (p == 0.0) {
			return lowerBound;
		}
		double upperBound = getSupportUpperBound();
		if (p == 1.0) {
			return upperBound;
		}
		final double mu = getNumericalMean();
		final double sig = org.apache.commons.math3.util.FastMath.sqrt(getNumericalVariance());
		final boolean chebyshevApplies;
		chebyshevApplies = !((((java.lang.Double.isInfinite(mu)) || (java.lang.Double.isNaN(mu))) || (java.lang.Double.isInfinite(sig))) || (java.lang.Double.isNaN(sig)));
		if (lowerBound == (java.lang.Double.NEGATIVE_INFINITY)) {
			if (chebyshevApplies) {
				lowerBound = mu - (sig * (org.apache.commons.math3.util.FastMath.sqrt(((1.0 - p) / p))));
			}else {
				lowerBound = -1.0;
				while ((cumulativeProbability(lowerBound)) >= p) {
					lowerBound *= 2.0;
				} 
			}
		}
		if (upperBound == (java.lang.Double.POSITIVE_INFINITY)) {
			if (chebyshevApplies) {
				upperBound = mu + (sig * (org.apache.commons.math3.util.FastMath.sqrt((p / (1.0 - p)))));
			}else {
				upperBound = 1.0;
				while ((cumulativeProbability(upperBound)) < p) {
					upperBound *= 2.0;
				} 
			}
		}
		final org.apache.commons.math3.analysis.UnivariateFunction toSolve = new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(final double x) {
				return (cumulativeProbability(x)) - p;
			}
		};
		double x = org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.solve(toSolve, lowerBound, upperBound, getSolverAbsoluteAccuracy());
		if (!(isSupportConnected())) {
			final double dx = getSolverAbsoluteAccuracy();
			if ((x - dx) >= (getSupportLowerBound())) {
				double px = cumulativeProbability(x);
				if ((cumulativeProbability((x - dx))) == px) {
					upperBound = x;
					while ((upperBound - lowerBound) > dx) {
						final double midPoint = 0.5 * (lowerBound + upperBound);
						if ((cumulativeProbability(midPoint)) < px) {
							lowerBound = midPoint;
						}else {
							upperBound = midPoint;
						}
					} 
					return upperBound;
				}
			}
		}
		return x;
	}

	protected double getSolverAbsoluteAccuracy() {
		return solverAbsoluteAccuracy;
	}

	public void reseedRandomGenerator(long seed) {
		random.setSeed(seed);
		randomData.reSeed(seed);
	}

	public double sample() {
		return inverseCumulativeProbability(random.nextDouble());
	}

	public double[] sample(int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		double[] out = new double[sampleSize];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}
}

