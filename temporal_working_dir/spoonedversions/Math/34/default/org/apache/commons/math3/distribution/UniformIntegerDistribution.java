

package org.apache.commons.math3.distribution;


public class UniformIntegerDistribution extends org.apache.commons.math3.distribution.AbstractIntegerDistribution {
	private static final long serialVersionUID = 20120109L;

	private final int lower;

	private final int upper;

	public UniformIntegerDistribution(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		this.lower = lower;
		this.upper = upper;
	}

	public double probability(int x) {
		if ((x < (lower)) || (x > (upper))) {
			return 0;
		}
		return 1.0 / (((upper) - (lower)) + 1);
	}

	public double cumulativeProbability(int x) {
		if (x < (lower)) {
			return 0;
		}
		if (x > (upper)) {
			return 1;
		}
		return ((x - (lower)) + 1.0) / (((upper) - (lower)) + 1.0);
	}

	public double getNumericalMean() {
		return 0.5 * ((lower) + (upper));
	}

	public double getNumericalVariance() {
		double n = ((upper) - (lower)) + 1;
		return ((n * n) - 1) / 12.0;
	}

	public int getSupportLowerBound() {
		return lower;
	}

	public int getSupportUpperBound() {
		return upper;
	}

	public boolean isSupportConnected() {
		return true;
	}

	@java.lang.Override
	public int sample() {
		return randomData.nextInt(lower, upper);
	}
}

