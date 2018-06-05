

package org.apache.commons.math.distribution;


public class PascalDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.PascalDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private final int numberOfSuccesses;

	private final double probabilityOfSuccess;

	public PascalDistributionImpl(int r, double p) {
		if (r < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES, r);
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

	@java.lang.Override
	protected int getDomainLowerBound(double p) {
		return -1;
	}

	@java.lang.Override
	protected int getDomainUpperBound(double p) {
		return (java.lang.Integer.MAX_VALUE) - 1;
	}

	@java.lang.Override
	public double cumulativeProbability(int x) throws org.apache.commons.math.MathException {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else {
			ret = org.apache.commons.math.special.Beta.regularizedBeta(probabilityOfSuccess, numberOfSuccesses, (x + 1));
		}
		return ret;
	}

	public double probability(int x) {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else {
			ret = ((org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(((x + (numberOfSuccesses)) - 1), ((numberOfSuccesses) - 1))) * (org.apache.commons.math.util.FastMath.pow(probabilityOfSuccess, numberOfSuccesses))) * (org.apache.commons.math.util.FastMath.pow((1.0 - (probabilityOfSuccess)), x));
		}
		return ret;
	}

	@java.lang.Override
	public int inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		int ret;
		if (p == 0) {
			ret = -1;
		}else
			if (p == 1) {
				ret = java.lang.Integer.MAX_VALUE;
			}else {
				ret = super.inverseCumulativeProbability(p);
			}
		
		return ret;
	}

	@java.lang.Override
	public int getSupportLowerBound() {
		return 0;
	}

	@java.lang.Override
	public int getSupportUpperBound() {
		return java.lang.Integer.MAX_VALUE;
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		final double p = getProbabilityOfSuccess();
		final double r = getNumberOfSuccesses();
		return (r * p) / (1 - p);
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double p = getProbabilityOfSuccess();
		final double r = getNumberOfSuccesses();
		final double pInv = 1 - p;
		return (r * p) / (pInv * pInv);
	}

	@java.lang.Override
	public boolean isSupportUpperBoundInclusive() {
		return false;
	}
}

