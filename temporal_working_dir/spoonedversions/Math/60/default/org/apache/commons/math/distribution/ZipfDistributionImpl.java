

package org.apache.commons.math.distribution;


public class ZipfDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ZipfDistribution {
	private static final long serialVersionUID = -140627372283420404L;

	private final int numberOfElements;

	private final double exponent;

	public ZipfDistributionImpl(final int numberOfElements, final double exponent) {
		if (numberOfElements <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSION, numberOfElements);
		}
		if (exponent <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, exponent);
		}
		this.numberOfElements = numberOfElements;
		this.exponent = exponent;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public double getExponent() {
		return exponent;
	}

	public double probability(final int x) {
		if ((x <= 0) || (x > (numberOfElements))) {
			return 0.0;
		}
		return (1.0 / (org.apache.commons.math.util.FastMath.pow(x, exponent))) / (generalizedHarmonic(numberOfElements, exponent));
	}

	@java.lang.Override
	public double cumulativeProbability(final int x) {
		if (x <= 0) {
			return 0.0;
		}else
			if (x >= (numberOfElements)) {
				return 1.0;
			}
		
		return (generalizedHarmonic(x, exponent)) / (generalizedHarmonic(numberOfElements, exponent));
	}

	@java.lang.Override
	protected int getDomainLowerBound(final double p) {
		return 0;
	}

	@java.lang.Override
	protected int getDomainUpperBound(final double p) {
		return numberOfElements;
	}

	private double generalizedHarmonic(final int n, final double m) {
		double value = 0;
		for (int k = n; k > 0; --k) {
			value += 1.0 / (org.apache.commons.math.util.FastMath.pow(k, m));
		}
		return value;
	}
}

