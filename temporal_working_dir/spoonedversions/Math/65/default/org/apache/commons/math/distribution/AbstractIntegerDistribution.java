

package org.apache.commons.math.distribution;


public abstract class AbstractIntegerDistribution extends org.apache.commons.math.distribution.AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.IntegerDistribution {
	private static final long serialVersionUID = -1146319659338487221L;

	protected final org.apache.commons.math.random.RandomDataImpl randomData = new org.apache.commons.math.random.RandomDataImpl();

	protected AbstractIntegerDistribution() {
		super();
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		return cumulativeProbability(((int) (java.lang.Math.floor(x))));
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1);
		}
		if ((java.lang.Math.floor(x0)) < x0) {
			return cumulativeProbability((((int) (java.lang.Math.floor(x0))) + 1), ((int) (java.lang.Math.floor(x1))));
		}else {
			return cumulativeProbability(((int) (java.lang.Math.floor(x0))), ((int) (java.lang.Math.floor(x1))));
		}
	}

	public abstract double cumulativeProbability(int x) throws org.apache.commons.math.MathException;

	public double probability(double x) {
		double fl = java.lang.Math.floor(x);
		if (fl == x) {
			return org.apache.commons.math.distribution.AbstractIntegerDistribution.this.probability(((int) (x)));
		}else {
			return 0;
		}
	}

	public double cumulativeProbability(int x0, int x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability((x0 - 1)));
	}

	public int inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if ((p < 0.0) || (p > 1.0)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.OUT_OF_RANGE_SIMPLE, p, 0.0, 1.0);
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

	public void reseedRandomGenerator(long seed) {
		randomData.reSeed(seed);
	}

	public int sample() throws org.apache.commons.math.MathException {
		return randomData.nextInversionDeviate(org.apache.commons.math.distribution.AbstractIntegerDistribution.this);
	}

	public int[] sample(int sampleSize) throws org.apache.commons.math.MathException {
		if (sampleSize <= 0) {
			org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.LocalizedFormats.NOT_POSITIVE_SAMPLE_SIZE, sampleSize);
		}
		int[] out = new int[sampleSize];
		for (int i = 0; i < sampleSize; i++) {
			out[i] = sample();
		}
		return out;
	}

	private double checkedCumulativeProbability(int argument) throws org.apache.commons.math.FunctionEvaluationException {
		double result = java.lang.Double.NaN;
		try {
			result = cumulativeProbability(argument);
		} catch (org.apache.commons.math.MathException ex) {
			throw new org.apache.commons.math.FunctionEvaluationException(ex, argument, ex.getLocalizablePattern(), ex.getArguments());
		}
		if (java.lang.Double.isNaN(result)) {
			throw new org.apache.commons.math.FunctionEvaluationException(argument, org.apache.commons.math.exception.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN, argument);
		}
		return result;
	}

	protected abstract int getDomainLowerBound(double p);

	protected abstract int getDomainUpperBound(double p);
}

