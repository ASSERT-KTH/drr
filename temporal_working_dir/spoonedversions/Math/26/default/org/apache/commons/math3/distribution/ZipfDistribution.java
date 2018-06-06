

package org.apache.commons.math3.distribution;


public class ZipfDistribution extends org.apache.commons.math3.distribution.AbstractIntegerDistribution {
	private static final long serialVersionUID = -140627372283420404L;

	private final int numberOfElements;

	private final double exponent;

	private double numericalMean = java.lang.Double.NaN;

	private boolean numericalMeanIsCalculated = false;

	private double numericalVariance = java.lang.Double.NaN;

	private boolean numericalVarianceIsCalculated = false;

	public ZipfDistribution(final int numberOfElements, final double exponent) {
		this(new org.apache.commons.math3.random.Well19937c(), numberOfElements, exponent);
	}

	public ZipfDistribution(org.apache.commons.math3.random.RandomGenerator rng, int numberOfElements, double exponent) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rng);
		if (numberOfElements <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSION, numberOfElements);
		}
		if (exponent <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, exponent);
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
		return (1.0 / (org.apache.commons.math3.util.FastMath.pow(x, exponent))) / (generalizedHarmonic(numberOfElements, exponent));
	}

	public double cumulativeProbability(final int x) {
		if (x <= 0) {
			return 0.0;
		}else
			if (x >= (numberOfElements)) {
				return 1.0;
			}
		
		return (generalizedHarmonic(x, exponent)) / (generalizedHarmonic(numberOfElements, exponent));
	}

	public double getNumericalMean() {
		if (!(numericalMeanIsCalculated)) {
			numericalMean = calculateNumericalMean();
			numericalMeanIsCalculated = true;
		}
		return numericalMean;
	}

	protected double calculateNumericalMean() {
		final int N = getNumberOfElements();
		final double s = getExponent();
		final double Hs1 = generalizedHarmonic(N, (s - 1));
		final double Hs = generalizedHarmonic(N, s);
		return Hs1 / Hs;
	}

	public double getNumericalVariance() {
		if (!(numericalVarianceIsCalculated)) {
			numericalVariance = calculateNumericalVariance();
			numericalVarianceIsCalculated = true;
		}
		return numericalVariance;
	}

	protected double calculateNumericalVariance() {
		final int N = getNumberOfElements();
		final double s = getExponent();
		final double Hs2 = generalizedHarmonic(N, (s - 2));
		final double Hs1 = generalizedHarmonic(N, (s - 1));
		final double Hs = generalizedHarmonic(N, s);
		return (Hs2 / Hs) - ((Hs1 * Hs1) / (Hs * Hs));
	}

	private double generalizedHarmonic(final int n, final double m) {
		double value = 0;
		for (int k = n; k > 0; --k) {
			value += 1.0 / (org.apache.commons.math3.util.FastMath.pow(k, m));
		}
		return value;
	}

	public int getSupportLowerBound() {
		return 1;
	}

	public int getSupportUpperBound() {
		return getNumberOfElements();
	}

	public boolean isSupportConnected() {
		return true;
	}
}

