

package org.apache.commons.math3.distribution;


public abstract class AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math3.distribution.IntegerDistribution {
	private static final long serialVersionUID = -1146319659338487221L;

	protected final org.apache.commons.math3.random.RandomDataImpl randomData = new org.apache.commons.math3.random.RandomDataImpl();

	protected final org.apache.commons.math3.random.RandomGenerator random;

	@java.lang.Deprecated
	protected AbstractIntegerDistribution() {
		random = null;
	}

	protected AbstractIntegerDistribution(org.apache.commons.math3.random.RandomGenerator rng) {
		random = rng;
	}

	public double cumulativeProbability(int x0, int x1) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (x1 < x0) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1, true);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}

	public int inverseCumulativeProbability(final double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0, 1);
		}
		int lower = getSupportLowerBound();
		if (p == 0.0) {
			return lower;
		}
		if (lower == (java.lang.Integer.MIN_VALUE)) {
			if ((checkedCumulativeProbability(lower)) >= p) {
				return lower;
			}
		}else {
			lower -= 1;
		}
		int upper = getSupportUpperBound();
		if (p == 1.0) {
			return upper;
		}
		final double mu = getNumericalMean();
		final double sigma = org.apache.commons.math3.util.FastMath.sqrt(getNumericalVariance());
		final boolean chebyshevApplies = !(((((java.lang.Double.isInfinite(mu)) || (java.lang.Double.isNaN(mu))) || (java.lang.Double.isInfinite(sigma))) || (java.lang.Double.isNaN(sigma))) || (sigma == 0.0));
		if (chebyshevApplies) {
			double k = org.apache.commons.math3.util.FastMath.sqrt(((1.0 - p) / p));
			double tmp = mu - (k * sigma);
			if (tmp > lower) {
				lower = ((int) (java.lang.Math.ceil(tmp))) - 1;
			}
			k = 1.0 / k;
			tmp = mu + (k * sigma);
			if (tmp < upper) {
				upper = ((int) (java.lang.Math.ceil(tmp))) - 1;
			}
		}
		return solveInverseCumulativeProbability(p, lower, upper);
	}

	protected int solveInverseCumulativeProbability(final double p, int lower, int upper) {
		while ((lower + 1) < upper) {
			int xm = (lower + upper) / 2;
			if ((xm < lower) || (xm > upper)) {
				xm = lower + ((upper - lower) / 2);
			}
			double pm = checkedCumulativeProbability(xm);
			if (pm >= p) {
				upper = xm;
			}else {
				lower = xm;
			}
		} 
		return upper;
	}

	public void reseedRandomGenerator(long seed) {
		random.setSeed(seed);
		randomData.reSeed(seed);
	}

	public int sample() {
		return inverseCumulativeProbability(random.nextDouble());
	}

	public int[] sample(int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		int[] out = new int[sampleSize];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}

	private double checkedCumulativeProbability(int argument) throws org.apache.commons.math3.exception.MathInternalError {
		double result = java.lang.Double.NaN;
		result = cumulativeProbability(argument);
		if (java.lang.Double.isNaN(result)) {
			throw new org.apache.commons.math3.exception.MathInternalError(org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN, argument);
		}
		return result;
	}
}

