

package org.apache.commons.math3.random;


public class RandomDataImpl implements java.io.Serializable , org.apache.commons.math3.random.RandomData {
	private static final long serialVersionUID = -626730818244969716L;

	private org.apache.commons.math3.random.RandomDataGenerator delegate;

	public RandomDataImpl() {
		delegate = new org.apache.commons.math3.random.RandomDataGenerator();
	}

	public RandomDataImpl(org.apache.commons.math3.random.RandomGenerator rand) {
		delegate = new org.apache.commons.math3.random.RandomDataGenerator(rand);
	}

	public java.lang.String nextHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextHexString(len);
	}

	public int nextInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextInt(lower, upper);
	}

	public long nextLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextLong(lower, upper);
	}

	public java.lang.String nextSecureHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextSecureHexString(len);
	}

	public int nextSecureInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextSecureInt(lower, upper);
	}

	public long nextSecureLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextSecureLong(lower, upper);
	}

	public long nextPoisson(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextPoisson(mean);
	}

	public double nextGaussian(double mu, double sigma) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextGaussian(mu, sigma);
	}

	public double nextExponential(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextExponential(mean);
	}

	public double nextUniform(double lower, double upper) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextUniform(lower, upper);
	}

	public double nextUniform(double lower, double upper, boolean lowerInclusive) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextUniform(lower, upper, lowerInclusive);
	}

	public double nextBeta(double alpha, double beta) {
		return delegate.nextBeta(alpha, beta);
	}

	public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) {
		return delegate.nextBinomial(numberOfTrials, probabilityOfSuccess);
	}

	public double nextCauchy(double median, double scale) {
		return delegate.nextCauchy(median, scale);
	}

	public double nextChiSquare(double df) {
		return delegate.nextChiSquare(df);
	}

	public double nextF(double numeratorDf, double denominatorDf) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextF(numeratorDf, denominatorDf);
	}

	public double nextGamma(double shape, double scale) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextGamma(shape, scale);
	}

	public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextHypergeometric(populationSize, numberOfSuccesses, sampleSize);
	}

	public int nextPascal(int r, double p) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		return delegate.nextPascal(r, p);
	}

	public double nextT(double df) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextT(df);
	}

	public double nextWeibull(double shape, double scale) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextWeibull(shape, scale);
	}

	public int nextZipf(int numberOfElements, double exponent) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return delegate.nextZipf(numberOfElements, exponent);
	}

	public void reSeed(long seed) {
		delegate.reSeed(seed);
	}

	public void reSeedSecure() {
		delegate.reSeedSecure();
	}

	public void reSeedSecure(long seed) {
		delegate.reSeedSecure(seed);
	}

	public void reSeed() {
		delegate.reSeed();
	}

	public void setSecureAlgorithm(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
		delegate.setSecureAlgorithm(algorithm, provider);
	}

	public int[] nextPermutation(int n, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextPermutation(n, k);
	}

	public java.lang.Object[] nextSample(java.util.Collection<?> c, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return delegate.nextSample(c, k);
	}

	public double nextInversionDeviate(org.apache.commons.math3.distribution.RealDistribution distribution) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return distribution.inverseCumulativeProbability(nextUniform(0, 1));
	}

	public int nextInversionDeviate(org.apache.commons.math3.distribution.IntegerDistribution distribution) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		return distribution.inverseCumulativeProbability(nextUniform(0, 1));
	}
}

