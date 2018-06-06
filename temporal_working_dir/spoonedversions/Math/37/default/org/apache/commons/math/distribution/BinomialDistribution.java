

package org.apache.commons.math.distribution;


public class BinomialDistribution extends org.apache.commons.math.distribution.AbstractIntegerDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private final int numberOfTrials;

	private final double probabilityOfSuccess;

	public BinomialDistribution(int trials, double p) {
		if (trials < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_TRIALS, trials);
		}
		if ((p < 0) || (p > 1)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(p, 0, 1);
		}
		probabilityOfSuccess = p;
		numberOfTrials = trials;
	}

	public int getNumberOfTrials() {
		return numberOfTrials;
	}

	public double getProbabilityOfSuccess() {
		return probabilityOfSuccess;
	}

	public double probability(int x) {
		double ret;
		if ((x < 0) || (x > (numberOfTrials))) {
			ret = 0.0;
		}else {
			ret = org.apache.commons.math.util.FastMath.exp(org.apache.commons.math.distribution.SaddlePointExpansion.logBinomialProbability(x, numberOfTrials, probabilityOfSuccess, (1.0 - (probabilityOfSuccess))));
		}
		return ret;
	}

	public double cumulativeProbability(int x) {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else
			if (x >= (numberOfTrials)) {
				ret = 1.0;
			}else {
				ret = 1.0 - (org.apache.commons.math.special.Beta.regularizedBeta(probabilityOfSuccess, (x + 1.0), ((numberOfTrials) - x)));
			}
		
		return ret;
	}

	public double getNumericalMean() {
		return (numberOfTrials) * (probabilityOfSuccess);
	}

	public double getNumericalVariance() {
		final double p = probabilityOfSuccess;
		return ((numberOfTrials) * p) * (1 - p);
	}

	public int getSupportLowerBound() {
		return (probabilityOfSuccess) < 1.0 ? 0 : numberOfTrials;
	}

	public int getSupportUpperBound() {
		return (probabilityOfSuccess) > 0.0 ? numberOfTrials : 0;
	}

	public boolean isSupportConnected() {
		return true;
	}
}

