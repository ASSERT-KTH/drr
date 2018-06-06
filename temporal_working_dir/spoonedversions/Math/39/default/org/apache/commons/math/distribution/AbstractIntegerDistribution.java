

package org.apache.commons.math.distribution;


public abstract class AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.IntegerDistribution {
	private static final long serialVersionUID = -1146319659338487221L;

	protected final org.apache.commons.math.random.RandomDataImpl randomData = new org.apache.commons.math.random.RandomDataImpl();

	protected AbstractIntegerDistribution() {
	}

	public double cumulativeProbability(int x0, int x1) {
		if (x1 < x0) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x1, x0, true);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability((x0 - 1)));
	}

	public int inverseCumulativeProbability(final double p) {
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0, 1);
		}
		int x0 = getDomainLowerBound(p);
		int x1 = getDomainUpperBound(p);
		double pm;
		while (x0 < x1) {
			int xm = x0 + ((x1 - x0) / 2);
			pm = checkedCumulativeProbability(xm);
			if (pm > p) {
				if (xm == x1) {
					--x1;
				}else {
					x1 = xm;
				}
			}else {
				if (xm == x0) {
					++x0;
				}else {
					x0 = xm;
				}
			}
		} 
		pm = checkedCumulativeProbability(x0);
		while (pm > p) {
			--x0;
			pm = checkedCumulativeProbability(x0);
		} 
		return x0;
	}

	protected abstract int getDomainLowerBound(double p);

	protected abstract int getDomainUpperBound(double p);

	public void reseedRandomGenerator(long seed) {
		randomData.reSeed(seed);
	}

	public int sample() {
		return randomData.nextInversionDeviate(org.apache.commons.math.distribution.AbstractIntegerDistribution.this);
	}

	public int[] sample(int sampleSize) {
		if (sampleSize <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		int[] out = new int[sampleSize];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}

	private double checkedCumulativeProbability(int argument) throws org.apache.commons.math.exception.MathInternalError {
		double result = java.lang.Double.NaN;
		result = cumulativeProbability(argument);
		if (java.lang.Double.isNaN(result)) {
			throw new org.apache.commons.math.exception.MathInternalError(org.apache.commons.math.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN, argument);
		}
		return result;
	}
}

