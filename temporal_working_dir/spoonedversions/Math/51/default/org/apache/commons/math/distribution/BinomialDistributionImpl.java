

package org.apache.commons.math.distribution;


public class BinomialDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.BinomialDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private final int numberOfTrials;

	private final double probabilityOfSuccess;

	public BinomialDistributionImpl(int trials, double p) {
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

	@java.lang.Override
	protected int getDomainLowerBound(double p) {
		return -1;
	}

	@java.lang.Override
	protected int getDomainUpperBound(double p) {
		return numberOfTrials;
	}

	@java.lang.Override
	public double cumulativeProbability(int x) throws org.apache.commons.math.MathException {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else
			if (x >= (numberOfTrials)) {
				ret = 1.0;
			}else {
				ret = 1.0 - (org.apache.commons.math.special.Beta.regularizedBeta(getProbabilityOfSuccess(), (x + 1.0), ((numberOfTrials) - x)));
			}
		
		return ret;
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

	@java.lang.Override
	public int inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return -1;
		}
		if (p == 1) {
			return java.lang.Integer.MAX_VALUE;
		}
		return super.inverseCumulativeProbability(p);
	}

	@java.lang.Override
	public int getSupportLowerBound() {
		return 0;
	}

	@java.lang.Override
	public int getSupportUpperBound() {
		return getNumberOfTrials();
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		return ((double) (getNumberOfTrials())) * (getProbabilityOfSuccess());
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double p = getProbabilityOfSuccess();
		return (((double) (getNumberOfTrials())) * p) * (1 - p);
	}
}

