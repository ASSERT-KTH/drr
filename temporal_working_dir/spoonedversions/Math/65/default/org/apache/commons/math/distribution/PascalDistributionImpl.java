

package org.apache.commons.math.distribution;


public class PascalDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.PascalDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private int numberOfSuccesses;

	private double probabilityOfSuccess;

	public PascalDistributionImpl(int r, double p) {
		super();
		setNumberOfSuccessesInternal(r);
		setProbabilityOfSuccessInternal(p);
	}

	public int getNumberOfSuccesses() {
		return numberOfSuccesses;
	}

	public double getProbabilityOfSuccess() {
		return probabilityOfSuccess;
	}

	@java.lang.Deprecated
	public void setNumberOfSuccesses(int successes) {
		setNumberOfSuccessesInternal(successes);
	}

	private void setNumberOfSuccessesInternal(int successes) {
		if (successes < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.NEGATIVE_NUMBER_OF_SUCCESSES, successes);
		}
		numberOfSuccesses = successes;
	}

	@java.lang.Deprecated
	public void setProbabilityOfSuccess(double p) {
		setProbabilityOfSuccessInternal(p);
	}

	private void setProbabilityOfSuccessInternal(double p) {
		if ((p < 0.0) || (p > 1.0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.OUT_OF_RANGE_SIMPLE, p, 0.0, 1.0);
		}
		probabilityOfSuccess = p;
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
			ret = ((org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(((x + (numberOfSuccesses)) - 1), ((numberOfSuccesses) - 1))) * (java.lang.Math.pow(probabilityOfSuccess, numberOfSuccesses))) * (java.lang.Math.pow((1.0 - (probabilityOfSuccess)), x));
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
}

