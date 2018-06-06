

package org.apache.commons.math3.random;


public class RandomDataGenerator implements java.io.Serializable , org.apache.commons.math3.random.RandomData {
	private static final long serialVersionUID = -626730818244969716L;

	private org.apache.commons.math3.random.RandomGenerator rand = null;

	private java.security.SecureRandom secRand = null;

	public RandomDataGenerator() {
	}

	public RandomDataGenerator(org.apache.commons.math3.random.RandomGenerator rand) {
		org.apache.commons.math3.random.RandomDataGenerator.this.rand = rand;
	}

	public java.lang.String nextHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (len <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.LENGTH, len);
		}
		org.apache.commons.math3.random.RandomGenerator ran = getRan();
		java.lang.StringBuilder outBuffer = new java.lang.StringBuilder();
		byte[] randomBytes = new byte[(len / 2) + 1];
		ran.nextBytes(randomBytes);
		for (int i = 0; i < (randomBytes.length); i++) {
			java.lang.Integer c = java.lang.Integer.valueOf(randomBytes[i]);
			java.lang.String hex = java.lang.Integer.toHexString(((c.intValue()) + 128));
			if ((hex.length()) == 1) {
				hex = "0" + hex;
			}
			outBuffer.append(hex);
		}
		return outBuffer.toString().substring(0, len);
	}

	public int nextInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		double r = getRan().nextDouble();
		double scaled = ((r * upper) + ((1.0 - r) * lower)) + r;
		return ((int) (org.apache.commons.math3.util.FastMath.floor(scaled)));
	}

	public long nextLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		double r = getRan().nextDouble();
		double scaled = ((r * upper) + ((1.0 - r) * lower)) + r;
		return ((long) (org.apache.commons.math3.util.FastMath.floor(scaled)));
	}

	public java.lang.String nextSecureHexString(int len) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (len <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.LENGTH, len);
		}
		java.security.SecureRandom secRan = getSecRan();
		java.security.MessageDigest alg = null;
		try {
			alg = java.security.MessageDigest.getInstance("SHA-1");
		} catch (java.security.NoSuchAlgorithmException ex) {
			throw new org.apache.commons.math3.exception.MathInternalError(ex);
		}
		alg.reset();
		int numIter = (len / 40) + 1;
		java.lang.StringBuilder outBuffer = new java.lang.StringBuilder();
		for (int iter = 1; iter < (numIter + 1); iter++) {
			byte[] randomBytes = new byte[40];
			secRan.nextBytes(randomBytes);
			alg.update(randomBytes);
			byte[] hash = alg.digest();
			for (int i = 0; i < (hash.length); i++) {
				java.lang.Integer c = java.lang.Integer.valueOf(hash[i]);
				java.lang.String hex = java.lang.Integer.toHexString(((c.intValue()) + 128));
				if ((hex.length()) == 1) {
					hex = "0" + hex;
				}
				outBuffer.append(hex);
			}
		}
		return outBuffer.toString().substring(0, len);
	}

	public int nextSecureInt(int lower, int upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		java.security.SecureRandom sec = getSecRan();
		final double r = sec.nextDouble();
		final double scaled = ((r * upper) + ((1.0 - r) * lower)) + r;
		return ((int) (org.apache.commons.math3.util.FastMath.floor(scaled)));
	}

	public long nextSecureLong(long lower, long upper) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		java.security.SecureRandom sec = getSecRan();
		final double r = sec.nextDouble();
		final double scaled = ((r * upper) + ((1.0 - r) * lower)) + r;
		return ((long) (org.apache.commons.math3.util.FastMath.floor(scaled)));
	}

	public long nextPoisson(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.PoissonDistribution(getRan(), mean, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_EPSILON, org.apache.commons.math3.distribution.PoissonDistribution.DEFAULT_MAX_ITERATIONS).sample();
	}

	public double nextGaussian(double mu, double sigma) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (sigma <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.STANDARD_DEVIATION, sigma);
		}
		return (sigma * (getRan().nextGaussian())) + mu;
	}

	public double nextExponential(double mean) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.ExponentialDistribution(getRan(), mean, org.apache.commons.math3.distribution.ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public double nextGamma(double shape, double scale) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.GammaDistribution(getRan(), shape, scale, org.apache.commons.math3.distribution.GammaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return new org.apache.commons.math3.distribution.HypergeometricDistribution(getRan(), populationSize, numberOfSuccesses, sampleSize).sample();
	}

	public int nextPascal(int r, double p) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		return new org.apache.commons.math3.distribution.PascalDistribution(getRan(), r, p).sample();
	}

	public double nextT(double df) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.TDistribution(getRan(), df, org.apache.commons.math3.distribution.TDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public double nextWeibull(double shape, double scale) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.WeibullDistribution(getRan(), shape, scale, org.apache.commons.math3.distribution.WeibullDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public int nextZipf(int numberOfElements, double exponent) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.ZipfDistribution(getRan(), numberOfElements, exponent).sample();
	}

	public double nextBeta(double alpha, double beta) {
		return new org.apache.commons.math3.distribution.BetaDistribution(getRan(), alpha, beta, org.apache.commons.math3.distribution.BetaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) {
		return new org.apache.commons.math3.distribution.BinomialDistribution(getRan(), numberOfTrials, probabilityOfSuccess).sample();
	}

	public double nextCauchy(double median, double scale) {
		return new org.apache.commons.math3.distribution.CauchyDistribution(getRan(), median, scale, org.apache.commons.math3.distribution.CauchyDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public double nextChiSquare(double df) {
		return new org.apache.commons.math3.distribution.ChiSquaredDistribution(getRan(), df, org.apache.commons.math3.distribution.ChiSquaredDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public double nextF(double numeratorDf, double denominatorDf) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.distribution.FDistribution(getRan(), numeratorDf, denominatorDf, org.apache.commons.math3.distribution.FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY).sample();
	}

	public double nextUniform(double lower, double upper) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return nextUniform(lower, upper, false);
	}

	public double nextUniform(double lower, double upper, boolean lowerInclusive) throws org.apache.commons.math3.exception.NotANumberException, org.apache.commons.math3.exception.NotFiniteNumberException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (lower >= upper) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		if (java.lang.Double.isInfinite(lower)) {
			throw new org.apache.commons.math3.exception.NotFiniteNumberException(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND, lower);
		}
		if (java.lang.Double.isInfinite(upper)) {
			throw new org.apache.commons.math3.exception.NotFiniteNumberException(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_BOUND, upper);
		}
		if ((java.lang.Double.isNaN(lower)) || (java.lang.Double.isNaN(upper))) {
			throw new org.apache.commons.math3.exception.NotANumberException();
		}
		final org.apache.commons.math3.random.RandomGenerator generator = getRan();
		double u = generator.nextDouble();
		while ((!lowerInclusive) && (u <= 0.0)) {
			u = generator.nextDouble();
		} 
		return (u * upper) + ((1.0 - u) * lower);
	}

	public int[] nextPermutation(int n, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (k > n) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N, k, n, true);
		}
		if (k <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_SIZE, k);
		}
		int[] index = getNatural(n);
		shuffle(index, (n - k));
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = index[((n - i) - 1)];
		}
		return result;
	}

	public java.lang.Object[] nextSample(java.util.Collection<?> c, int k) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		int len = c.size();
		if (k > len) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE, k, len, true);
		}
		if (k <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, k);
		}
		java.lang.Object[] objects = c.toArray();
		int[] index = nextPermutation(len, k);
		java.lang.Object[] result = new java.lang.Object[k];
		for (int i = 0; i < k; i++) {
			result[i] = objects[index[i]];
		}
		return result;
	}

	public void reSeed(long seed) {
		getRan().setSeed(seed);
	}

	public void reSeedSecure() {
		getSecRan().setSeed(java.lang.System.currentTimeMillis());
	}

	public void reSeedSecure(long seed) {
		getSecRan().setSeed(seed);
	}

	public void reSeed() {
		getRan().setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math3.random.RandomDataGenerator.this))));
	}

	public void setSecureAlgorithm(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
		secRand = java.security.SecureRandom.getInstance(algorithm, provider);
	}

	private org.apache.commons.math3.random.RandomGenerator getRan() {
		if ((rand) == null) {
			initRan();
		}
		return rand;
	}

	private void initRan() {
		rand = new org.apache.commons.math3.random.Well19937c(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math3.random.RandomDataGenerator.this))));
	}

	private java.security.SecureRandom getSecRan() {
		if ((secRand) == null) {
			secRand = new java.security.SecureRandom();
			secRand.setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math3.random.RandomDataGenerator.this))));
		}
		return secRand;
	}

	private void shuffle(int[] list, int end) {
		int target = 0;
		for (int i = (list.length) - 1; i >= end; i--) {
			if (i == 0) {
				target = 0;
			}else {
				target = nextInt(0, i);
			}
			int temp = list[target];
			list[target] = list[i];
			list[i] = temp;
		}
	}

	private int[] getNatural(int n) {
		int[] natural = new int[n];
		for (int i = 0; i < n; i++) {
			natural[i] = i;
		}
		return natural;
	}
}

