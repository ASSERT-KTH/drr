

package org.apache.commons.math.distribution;


public class BinomialDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.BinomialDistribution {
	private static final long serialVersionUID = 6751309484392813623L;

	private int numberOfTrials;

	private double probabilityOfSuccess;

	public BinomialDistributionImpl(int trials, double p) {
		super();
		setNumberOfTrials(trials);
		setProbabilityOfSuccess(p);
	}

	public int getNumberOfTrials() {
		return numberOfTrials;
	}

	public double getProbabilityOfSuccess() {
		return probabilityOfSuccess;
	}

	public void setNumberOfTrials(int trials) {
		if (trials < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("number of trials must be non-negative ({0})", trials);
		}
		numberOfTrials = trials;
	}

	public void setProbabilityOfSuccess(double p) {
		if ((p < 0.0) || (p > 1.0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} out of [{1}, {2}] range", p, 0.0, 1.0);
		}
		probabilityOfSuccess = p;
	}

	@java.lang.Override
	protected int getDomainLowerBound(double p) {
		return -1;
	}

	@java.lang.Override
	protected int getDomainUpperBound(double p) {
		return getNumberOfTrials();
	}

	@java.lang.Override
	public double cumulativeProbability(int x) throws org.apache.commons.math.MathException {
		double ret;
		if (x < 0) {
			ret = 0.0;
		}else
			if (x >= (getNumberOfTrials())) {
				ret = 1.0;
			}else {
				ret = 1.0 - (org.apache.commons.math.special.Beta.regularizedBeta(getProbabilityOfSuccess(), (x + 1.0), ((getNumberOfTrials()) - x)));
			}
		
		return ret;
	}

	public double probability(int x) {
		double ret;
		if ((x < 0) || (x > (getNumberOfTrials()))) {
			ret = 0.0;
		}else {
			ret = ((org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(getNumberOfTrials(), x)) * (java.lang.Math.pow(getProbabilityOfSuccess(), x))) * (java.lang.Math.pow((1.0 - (getProbabilityOfSuccess())), ((getNumberOfTrials()) - x)));
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
}

