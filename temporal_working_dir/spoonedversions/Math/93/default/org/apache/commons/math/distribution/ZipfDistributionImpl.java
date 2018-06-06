

package org.apache.commons.math.distribution;


public class ZipfDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.ZipfDistribution {
	private static final long serialVersionUID = -140627372283420404L;

	private int numberOfElements;

	private double exponent;

	public ZipfDistributionImpl(final int numberOfElements, final double exponent) throws java.lang.IllegalArgumentException {
		setNumberOfElements(numberOfElements);
		setExponent(exponent);
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(final int n) throws java.lang.IllegalArgumentException {
		if (n <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(("invalid number of elements {0}" + " (must be positive)"), new java.lang.Object[]{ n });
		}
		org.apache.commons.math.distribution.ZipfDistributionImpl.this.numberOfElements = n;
	}

	public double getExponent() {
		return exponent;
	}

	public void setExponent(final double s) throws java.lang.IllegalArgumentException {
		if (s <= 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("invalid exponent {0} (must be positive)", new java.lang.Object[]{ s });
		}
		org.apache.commons.math.distribution.ZipfDistributionImpl.this.exponent = s;
	}

	public double probability(final int x) {
		if ((x <= 0) || (x > (getNumberOfElements()))) {
			return 0.0;
		}
		return (1.0 / (java.lang.Math.pow(x, exponent))) / (generalizedHarmonic(numberOfElements, exponent));
	}

	public double cumulativeProbability(final int x) {
		if (x <= 0) {
			return 0.0;
		}else
			if (x >= (getNumberOfElements())) {
				return 1.0;
			}
		
		return (generalizedHarmonic(x, exponent)) / (generalizedHarmonic(numberOfElements, exponent));
	}

	protected int getDomainLowerBound(final double p) {
		return 0;
	}

	protected int getDomainUpperBound(final double p) {
		return numberOfElements;
	}

	private double generalizedHarmonic(final int n, final double m) {
		double value = 0;
		for (int k = n; k > 0; --k) {
			value += 1.0 / (java.lang.Math.pow(k, m));
		}
		return value;
	}
}

