

package org.apache.commons.math.distribution;


public class DistributionFactoryImpl extends org.apache.commons.math.distribution.DistributionFactory {
	public DistributionFactoryImpl() {
		super();
	}

	public org.apache.commons.math.distribution.ChiSquaredDistribution createChiSquareDistribution(final double degreesOfFreedom) {
		return new org.apache.commons.math.distribution.ChiSquaredDistributionImpl(degreesOfFreedom);
	}

	public org.apache.commons.math.distribution.GammaDistribution createGammaDistribution(double alpha, double beta) {
		return new org.apache.commons.math.distribution.GammaDistributionImpl(alpha, beta);
	}

	public org.apache.commons.math.distribution.TDistribution createTDistribution(double degreesOfFreedom) {
		return new org.apache.commons.math.distribution.TDistributionImpl(degreesOfFreedom);
	}

	public org.apache.commons.math.distribution.FDistribution createFDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom) {
		return new org.apache.commons.math.distribution.FDistributionImpl(numeratorDegreesOfFreedom, denominatorDegreesOfFreedom);
	}

	public org.apache.commons.math.distribution.ExponentialDistribution createExponentialDistribution(double mean) {
		return new org.apache.commons.math.distribution.ExponentialDistributionImpl(mean);
	}

	public org.apache.commons.math.distribution.BinomialDistribution createBinomialDistribution(int numberOfTrials, double probabilityOfSuccess) {
		return new org.apache.commons.math.distribution.BinomialDistributionImpl(numberOfTrials, probabilityOfSuccess);
	}

	public org.apache.commons.math.distribution.HypergeometricDistribution createHypergeometricDistribution(int populationSize, int numberOfSuccesses, int sampleSize) {
		return new org.apache.commons.math.distribution.HypergeometricDistributionImpl(populationSize, numberOfSuccesses, sampleSize);
	}

	public org.apache.commons.math.distribution.NormalDistribution createNormalDistribution(double mean, double sd) {
		return new org.apache.commons.math.distribution.NormalDistributionImpl(mean, sd);
	}

	public org.apache.commons.math.distribution.NormalDistribution createNormalDistribution() {
		return new org.apache.commons.math.distribution.NormalDistributionImpl();
	}

	public org.apache.commons.math.distribution.PoissonDistribution createPoissonDistribution(double lambda) {
		return new org.apache.commons.math.distribution.PoissonDistributionImpl(lambda);
	}

	public org.apache.commons.math.distribution.PascalDistribution createPascalDistribution(int numberOfSuccesses, double probabilityOfSuccess) {
		return new org.apache.commons.math.distribution.PascalDistributionImpl(numberOfSuccesses, probabilityOfSuccess);
	}
}

