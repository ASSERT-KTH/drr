

package org.apache.commons.math.distribution;


public abstract class DistributionFactory {
	protected DistributionFactory() {
		super();
	}

	public static org.apache.commons.math.distribution.DistributionFactory newInstance() {
		org.apache.commons.math.distribution.DistributionFactory factory = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			factory = ((org.apache.commons.math.distribution.DistributionFactory) (dc.newInstance(org.apache.commons.math.distribution.DistributionFactory.class, "org.apache.commons.math.distribution.DistributionFactoryImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.distribution.DistributionFactoryImpl();
		}
		return factory;
	}

	public abstract org.apache.commons.math.distribution.BinomialDistribution createBinomialDistribution(int numberOfTrials, double probabilityOfSuccess);

	public abstract org.apache.commons.math.distribution.PascalDistribution createPascalDistribution(int numberOfSuccesses, double probabilityOfSuccess);

	public org.apache.commons.math.distribution.CauchyDistribution createCauchyDistribution(double median, double scale) {
		return new org.apache.commons.math.distribution.CauchyDistributionImpl(median, scale);
	}

	public abstract org.apache.commons.math.distribution.ChiSquaredDistribution createChiSquareDistribution(double degreesOfFreedom);

	public abstract org.apache.commons.math.distribution.ExponentialDistribution createExponentialDistribution(double mean);

	public abstract org.apache.commons.math.distribution.FDistribution createFDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom);

	public abstract org.apache.commons.math.distribution.GammaDistribution createGammaDistribution(double alpha, double beta);

	public abstract org.apache.commons.math.distribution.TDistribution createTDistribution(double degreesOfFreedom);

	public abstract org.apache.commons.math.distribution.HypergeometricDistribution createHypergeometricDistribution(int populationSize, int numberOfSuccesses, int sampleSize);

	public abstract org.apache.commons.math.distribution.NormalDistribution createNormalDistribution(double mean, double sd);

	public abstract org.apache.commons.math.distribution.NormalDistribution createNormalDistribution();

	public abstract org.apache.commons.math.distribution.PoissonDistribution createPoissonDistribution(double lambda);

	public org.apache.commons.math.distribution.WeibullDistribution createWeibullDistribution(double alpha, double beta) {
		return new org.apache.commons.math.distribution.WeibullDistributionImpl(alpha, beta);
	}
}

