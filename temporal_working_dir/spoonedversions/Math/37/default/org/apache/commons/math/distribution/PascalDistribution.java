

package org.apache.commons.math.distribution;


public class PascalDistribution extends org.apache.commons.math.distribution.AbstractIntegerDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private final int numberOfSuccesses;

	private final double probabilityOfSuccess;

	public PascalDistribution(int r, double p) throws org.apache.commons.math.exception.NotStrictlyPositiveException, org.apache.commons.math.exception.OutOfRangeException {
		if (r <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES, r);
		}
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0, 1);
		}
		numberOfSuccesses = r;
		probabilityOfSuccess = p;
	}

	public int getNumberOfSuccesses() {
		return numberOfSuccesses;
	}

	public double getProbabilityOfSuccess() {
		return probabilityOfSuccess;
	}

	public double probability(int x) {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else {
			ret = ((org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientDouble(((x + (numberOfSuccesses)) - 1), ((numberOfSuccesses) - 1))) * (org.apache.commons.math.util.FastMath.pow(probabilityOfSuccess, numberOfSuccesses))) * (org.apache.commons.math.util.FastMath.pow((1.0 - (probabilityOfSuccess)), x));
		}
		return ret;
	}

	public double cumulativeProbability(int x) {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else {
			ret = org.apache.commons.math.special.Beta.regularizedBeta(probabilityOfSuccess, numberOfSuccesses, (x + 1));
		}
		return ret;
	}

	public double getNumericalMean() {
		final double p = getProbabilityOfSuccess();
		final double r = getNumberOfSuccesses();
		return (r * (1 - p)) / p;
	}

	public double getNumericalVariance() {
		final double p = getProbabilityOfSuccess();
		final double r = getNumberOfSuccesses();
		return (r * (1 - p)) / (p * p);
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
}

