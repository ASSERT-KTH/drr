

package org.apache.commons.math.distribution;


public class HypergeometricDistributionImpl extends org.apache.commons.math.distribution.AbstractIntegerDistribution implements java.io.Serializable , org.apache.commons.math.distribution.HypergeometricDistribution {
	private static final long serialVersionUID = -436928820673516179L;

	private final int numberOfSuccesses;

	private final int populationSize;

	private final int sampleSize;

	public HypergeometricDistributionImpl(int populationSize, int numberOfSuccesses, int sampleSize) {
		if (populationSize <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.POPULATION_SIZE, populationSize);
		}
		if (numberOfSuccesses < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES, numberOfSuccesses);
		}
		if (sampleSize < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		if (numberOfSuccesses > populationSize) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE, numberOfSuccesses, populationSize, true);
		}
		if (sampleSize > populationSize) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE, sampleSize, populationSize, true);
		}
		this.numberOfSuccesses = numberOfSuccesses;
		this.populationSize = populationSize;
		this.sampleSize = sampleSize;
	}

	@java.lang.Override
	public double cumulativeProbability(int x) {
		double ret;
		int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if (x < (domain[0])) {
			ret = 0.0;
		}else
			if (x >= (domain[1])) {
				ret = 1.0;
			}else {
				ret = innerCumulativeProbability(domain[0], x, 1, populationSize, numberOfSuccesses, sampleSize);
			}
		
		return ret;
	}

	private int[] getDomain(int n, int m, int k) {
		return new int[]{ getLowerDomain(n, m, k) , getUpperDomain(m, k) };
	}

	@java.lang.Override
	protected int getDomainLowerBound(double p) {
		return getLowerDomain(populationSize, numberOfSuccesses, sampleSize);
	}

	@java.lang.Override
	protected int getDomainUpperBound(double p) {
		return getUpperDomain(sampleSize, numberOfSuccesses);
	}

	private int getLowerDomain(int n, int m, int k) {
		return org.apache.commons.math.util.FastMath.max(0, (m - (n - k)));
	}

	public int getNumberOfSuccesses() {
		return numberOfSuccesses;
	}

	public int getPopulationSize() {
		return populationSize;
	}

	public int getSampleSize() {
		return sampleSize;
	}

	private int getUpperDomain(int m, int k) {
		return org.apache.commons.math.util.FastMath.min(k, m);
	}

	public double probability(int x) {
		double ret;
		int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if ((x < (domain[0])) || (x > (domain[1]))) {
			ret = 0.0;
		}else {
			double p = ((double) (sampleSize)) / ((double) (populationSize));
			double q = ((double) ((populationSize) - (sampleSize))) / ((double) (populationSize));
			double p1 = org.apache.commons.math.distribution.SaddlePointExpansion.logBinomialProbability(x, numberOfSuccesses, p, q);
			double p2 = org.apache.commons.math.distribution.SaddlePointExpansion.logBinomialProbability(((sampleSize) - x), ((populationSize) - (numberOfSuccesses)), p, q);
			double p3 = org.apache.commons.math.distribution.SaddlePointExpansion.logBinomialProbability(sampleSize, populationSize, p, q);
			ret = org.apache.commons.math.util.FastMath.exp(((p1 + p2) - p3));
		}
		return ret;
	}

	private double probability(int n, int m, int k, int x) {
		return org.apache.commons.math.util.FastMath.exp((((org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientLog(m, x)) + (org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientLog((n - m), (k - x)))) - (org.apache.commons.math.util.ArithmeticUtils.binomialCoefficientLog(n, k))));
	}

	public double upperCumulativeProbability(int x) {
		double ret;
		final int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if (x < (domain[0])) {
			ret = 1.0;
		}else
			if (x > (domain[1])) {
				ret = 0.0;
			}else {
				ret = innerCumulativeProbability(domain[1], x, (-1), populationSize, numberOfSuccesses, sampleSize);
			}
		
		return ret;
	}

	private double innerCumulativeProbability(int x0, int x1, int dx, int n, int m, int k) {
		double ret = probability(n, m, k, x0);
		while (x0 != x1) {
			x0 += dx;
			ret += probability(n, m, k, x0);
		} 
		return ret;
	}

	@java.lang.Override
	public int getSupportLowerBound() {
		return org.apache.commons.math.util.FastMath.max(0, (((getSampleSize()) + (getNumberOfSuccesses())) - (getPopulationSize())));
	}

	@java.lang.Override
	public int getSupportUpperBound() {
		return org.apache.commons.math.util.FastMath.min(getNumberOfSuccesses(), getSampleSize());
	}

	@java.lang.Override
	protected double calculateNumericalMean() {
		return ((double) ((getSampleSize()) * (getNumberOfSuccesses()))) / ((double) (getPopulationSize()));
	}

	@java.lang.Override
	protected double calculateNumericalVariance() {
		final double N = getPopulationSize();
		final double m = getNumberOfSuccesses();
		final double n = getSampleSize();
		return (((n * m) * (N - n)) * (N - m)) / ((N * N) * (N - 1));
	}
}

