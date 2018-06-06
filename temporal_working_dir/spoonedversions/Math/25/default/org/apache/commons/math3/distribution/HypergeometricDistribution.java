

package org.apache.commons.math3.distribution;


public class HypergeometricDistribution extends org.apache.commons.math3.distribution.AbstractIntegerDistribution {
	private static final long serialVersionUID = -436928820673516179L;

	private final int numberOfSuccesses;

	private final int populationSize;

	private final int sampleSize;

	private double numericalVariance = java.lang.Double.NaN;

	private boolean numericalVarianceIsCalculated = false;

	public HypergeometricDistribution(int populationSize, int numberOfSuccesses, int sampleSize) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		this(new org.apache.commons.math3.random.Well19937c(), populationSize, numberOfSuccesses, sampleSize);
	}

	public HypergeometricDistribution(org.apache.commons.math3.random.RandomGenerator rng, int populationSize, int numberOfSuccesses, int sampleSize) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		super(rng);
		if (populationSize <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_SIZE, populationSize);
		}
		if (numberOfSuccesses < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESSES, numberOfSuccesses);
		}
		if (sampleSize < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
		}
		if (numberOfSuccesses > populationSize) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE, numberOfSuccesses, populationSize, true);
		}
		if (sampleSize > populationSize) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE, sampleSize, populationSize, true);
		}
		this.numberOfSuccesses = numberOfSuccesses;
		this.populationSize = populationSize;
		this.sampleSize = sampleSize;
	}

	public double cumulativeProbability(int x) {
		double ret;
		int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if (x < (domain[0])) {
			ret = 0.0;
		}else
			if (x >= (domain[1])) {
				ret = 1.0;
			}else {
				ret = innerCumulativeProbability(domain[0], x, 1);
			}
		
		return ret;
	}

	private int[] getDomain(int n, int m, int k) {
		return new int[]{ getLowerDomain(n, m, k) , getUpperDomain(m, k) };
	}

	private int getLowerDomain(int n, int m, int k) {
		return org.apache.commons.math3.util.FastMath.max(0, (m - (n - k)));
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
		return org.apache.commons.math3.util.FastMath.min(k, m);
	}

	public double probability(int x) {
		double ret;
		int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if ((x < (domain[0])) || (x > (domain[1]))) {
			ret = 0.0;
		}else {
			double p = ((double) (sampleSize)) / ((double) (populationSize));
			double q = ((double) ((populationSize) - (sampleSize))) / ((double) (populationSize));
			double p1 = org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(x, numberOfSuccesses, p, q);
			double p2 = org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(((sampleSize) - x), ((populationSize) - (numberOfSuccesses)), p, q);
			double p3 = org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(sampleSize, populationSize, p, q);
			ret = org.apache.commons.math3.util.FastMath.exp(((p1 + p2) - p3));
		}
		return ret;
	}

	public double upperCumulativeProbability(int x) {
		double ret;
		final int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
		if (x <= (domain[0])) {
			ret = 1.0;
		}else
			if (x > (domain[1])) {
				ret = 0.0;
			}else {
				ret = innerCumulativeProbability(domain[1], x, (-1));
			}
		
		return ret;
	}

	private double innerCumulativeProbability(int x0, int x1, int dx) {
		double ret = probability(x0);
		while (x0 != x1) {
			x0 += dx;
			ret += probability(x0);
		} 
		return ret;
	}

	public double getNumericalMean() {
		return ((double) ((getSampleSize()) * (getNumberOfSuccesses()))) / ((double) (getPopulationSize()));
	}

	public double getNumericalVariance() {
		if (!(numericalVarianceIsCalculated)) {
			numericalVariance = calculateNumericalVariance();
			numericalVarianceIsCalculated = true;
		}
		return numericalVariance;
	}

	protected double calculateNumericalVariance() {
		final double N = getPopulationSize();
		final double m = getNumberOfSuccesses();
		final double n = getSampleSize();
		return (((n * m) * (N - n)) * (N - m)) / ((N * N) * (N - 1));
	}

	public int getSupportLowerBound() {
		return org.apache.commons.math3.util.FastMath.max(0, (((getSampleSize()) + (getNumberOfSuccesses())) - (getPopulationSize())));
	}

	public int getSupportUpperBound() {
		return org.apache.commons.math3.util.FastMath.min(getNumberOfSuccesses(), getSampleSize());
	}

	public boolean isSupportConnected() {
		return true;
	}
}

