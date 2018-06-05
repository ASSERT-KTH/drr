

package org.apache.commons.math.random;


public class RandomDataImpl implements java.io.Serializable , org.apache.commons.math.random.RandomData {
	private static final long serialVersionUID = -626730818244969716L;

	private org.apache.commons.math.random.RandomGenerator rand = null;

	private java.security.SecureRandom secRand = null;

	public RandomDataImpl() {
	}

	public RandomDataImpl(org.apache.commons.math.random.RandomGenerator rand) {
		super();
		org.apache.commons.math.random.RandomDataImpl.this.rand = rand;
	}

	public java.lang.String nextHexString(int len) {
		if (len <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.LENGTH, len);
		}
		org.apache.commons.math.random.RandomGenerator ran = getRan();
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

	public int nextInt(int lower, int upper) {
		if (lower >= upper) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		double r = getRan().nextDouble();
		return ((int) (((r * upper) + ((1.0 - r) * lower)) + r));
	}

	public long nextLong(long lower, long upper) {
		if (lower >= upper) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		double r = getRan().nextDouble();
		return ((long) (((r * upper) + ((1.0 - r) * lower)) + r));
	}

	public java.lang.String nextSecureHexString(int len) {
		if (len <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.LENGTH, len);
		}
		java.security.SecureRandom secRan = getSecRan();
		java.security.MessageDigest alg = null;
		try {
			alg = java.security.MessageDigest.getInstance("SHA-1");
		} catch (java.security.NoSuchAlgorithmException ex) {
			throw new org.apache.commons.math.exception.MathInternalError(ex);
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

	public int nextSecureInt(int lower, int upper) {
		if (lower >= upper) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((int) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextSecureLong(long lower, long upper) {
		if (lower >= upper) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((long) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextPoisson(double mean) {
		if (mean <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.MEAN, mean);
		}
		final org.apache.commons.math.random.RandomGenerator generator = getRan();
		final double pivot = 40.0;
		if (mean < pivot) {
			double p = org.apache.commons.math.util.FastMath.exp((-mean));
			long n = 0;
			double r = 1.0;
			double rnd = 1.0;
			while (n < (1000 * mean)) {
				rnd = generator.nextDouble();
				r = r * rnd;
				if (r >= p) {
					n++;
				}else {
					return n;
				}
			} 
			return n;
		}else {
			final double lambda = org.apache.commons.math.util.FastMath.floor(mean);
			final double lambdaFractional = mean - lambda;
			final double logLambda = org.apache.commons.math.util.FastMath.log(lambda);
			final double logLambdaFactorial = org.apache.commons.math.util.MathUtils.factorialLog(((int) (lambda)));
			final long y2 = lambdaFractional < (java.lang.Double.MIN_VALUE) ? 0 : nextPoisson(lambdaFractional);
			final double delta = org.apache.commons.math.util.FastMath.sqrt((lambda * (org.apache.commons.math.util.FastMath.log((((32 * lambda) / (org.apache.commons.math.util.FastMath.PI)) + 1)))));
			final double halfDelta = delta / 2;
			final double twolpd = (2 * lambda) + delta;
			final double a1 = (org.apache.commons.math.util.FastMath.sqrt(((org.apache.commons.math.util.FastMath.PI) * twolpd))) * (org.apache.commons.math.util.FastMath.exp(((1 / 8) * lambda)));
			final double a2 = (twolpd / delta) * (org.apache.commons.math.util.FastMath.exp((((-delta) * (1 + delta)) / twolpd)));
			final double aSum = (a1 + a2) + 1;
			final double p1 = a1 / aSum;
			final double p2 = a2 / aSum;
			final double c1 = 1 / (8 * lambda);
			double x = 0;
			double y = 0;
			double v = 0;
			int a = 0;
			double t = 0;
			double qr = 0;
			double qa = 0;
			for (; ;) {
				final double u = nextUniform(0.0, 1);
				if (u <= p1) {
					final double n = nextGaussian(0.0, 1.0);
					x = (n * (org.apache.commons.math.util.FastMath.sqrt((lambda + halfDelta)))) - 0.5;
					if ((x > delta) || (x < (-lambda))) {
						continue;
					}
					y = (x < 0) ? org.apache.commons.math.util.FastMath.floor(x) : org.apache.commons.math.util.FastMath.ceil(x);
					final double e = nextExponential(1.0);
					v = ((-e) - ((n * n) / 2)) + c1;
				}else {
					if (u > (p1 + p2)) {
						y = lambda;
						break;
					}else {
						x = delta + ((twolpd / delta) * (nextExponential(1.0)));
						y = org.apache.commons.math.util.FastMath.ceil(x);
						v = (-(nextExponential(1.0))) - ((delta * (x + 1)) / twolpd);
					}
				}
				a = (x < 0) ? 1 : 0;
				t = (y * (y + 1)) / (2 * lambda);
				if ((v < (-t)) && (a == 0)) {
					y = lambda + y;
					break;
				}
				qr = t * ((((2 * y) + 1) / (6 * lambda)) - 1);
				qa = qr - ((t * t) / (3 * (lambda + (a * (y + 1)))));
				if (v < qa) {
					y = lambda + y;
					break;
				}
				if (v > qr) {
					continue;
				}
				if (v < (((y * logLambda) - (org.apache.commons.math.util.MathUtils.factorialLog(((int) (y + lambda))))) + logLambdaFactorial)) {
					y = lambda + y;
					break;
				}
			}
			return y2 + ((long) (y));
		}
	}

	public double nextGaussian(double mu, double sigma) {
		if (sigma <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.STANDARD_DEVIATION, sigma);
		}
		return (sigma * (getRan().nextGaussian())) + mu;
	}

	public double nextExponential(double mean) {
		if (mean <= 0.0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.MEAN, mean);
		}
		final org.apache.commons.math.random.RandomGenerator generator = getRan();
		double unif = generator.nextDouble();
		while (unif == 0.0) {
			unif = generator.nextDouble();
		} 
		return (-mean) * (org.apache.commons.math.util.FastMath.log(unif));
	}

	public double nextUniform(double lower, double upper) {
		if (lower >= upper) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND, lower, upper, false);
		}
		final org.apache.commons.math.random.RandomGenerator generator = getRan();
		double u = generator.nextDouble();
		while (u <= 0.0) {
			u = generator.nextDouble();
		} 
		return lower + (u * (upper - lower));
	}

	public double nextBeta(double alpha, double beta) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.BetaDistributionImpl(alpha, beta));
	}

	public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.BinomialDistributionImpl(numberOfTrials, probabilityOfSuccess));
	}

	public double nextCauchy(double median, double scale) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.CauchyDistributionImpl(median, scale));
	}

	public double nextChiSquare(double df) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.ChiSquaredDistributionImpl(df));
	}

	public double nextF(double numeratorDf, double denominatorDf) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.FDistributionImpl(numeratorDf, denominatorDf));
	}

	public double nextGamma(double shape, double scale) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.GammaDistributionImpl(shape, scale));
	}

	public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.HypergeometricDistributionImpl(populationSize, numberOfSuccesses, sampleSize));
	}

	public int nextPascal(int r, double p) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.PascalDistributionImpl(r, p));
	}

	public double nextT(double df) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.TDistributionImpl(df));
	}

	public double nextWeibull(double shape, double scale) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.WeibullDistributionImpl(shape, scale));
	}

	public int nextZipf(int numberOfElements, double exponent) throws org.apache.commons.math.MathException {
		return nextInversionDeviate(new org.apache.commons.math.distribution.ZipfDistributionImpl(numberOfElements, exponent));
	}

	private org.apache.commons.math.random.RandomGenerator getRan() {
		if ((rand) == null) {
			rand = new org.apache.commons.math.random.JDKRandomGenerator();
			rand.setSeed(java.lang.System.currentTimeMillis());
		}
		return rand;
	}

	private java.security.SecureRandom getSecRan() {
		if ((secRand) == null) {
			secRand = new java.security.SecureRandom();
			secRand.setSeed(java.lang.System.currentTimeMillis());
		}
		return secRand;
	}

	public void reSeed(long seed) {
		if ((rand) == null) {
			rand = new org.apache.commons.math.random.JDKRandomGenerator();
		}
		rand.setSeed(seed);
	}

	public void reSeedSecure() {
		if ((secRand) == null) {
			secRand = new java.security.SecureRandom();
		}
		secRand.setSeed(java.lang.System.currentTimeMillis());
	}

	public void reSeedSecure(long seed) {
		if ((secRand) == null) {
			secRand = new java.security.SecureRandom();
		}
		secRand.setSeed(seed);
	}

	public void reSeed() {
		if ((rand) == null) {
			rand = new org.apache.commons.math.random.JDKRandomGenerator();
		}
		rand.setSeed(java.lang.System.currentTimeMillis());
	}

	public void setSecureAlgorithm(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
		secRand = java.security.SecureRandom.getInstance(algorithm, provider);
	}

	public int[] nextPermutation(int n, int k) {
		if (k > n) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N, k, n, true);
		}
		if (k == 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.PERMUTATION_SIZE, k);
		}
		int[] index = getNatural(n);
		shuffle(index, (n - k));
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = index[((n - i) - 1)];
		}
		return result;
	}

	public java.lang.Object[] nextSample(java.util.Collection<?> c, int k) {
		int len = c.size();
		if (k > len) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(org.apache.commons.math.exception.util.LocalizedFormats.SAMPLE_SIZE_EXCEEDS_COLLECTION_SIZE, k, len, true);
		}
		if (k <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES, k);
		}
		java.lang.Object[] objects = c.toArray();
		int[] index = nextPermutation(len, k);
		java.lang.Object[] result = new java.lang.Object[k];
		for (int i = 0; i < k; i++) {
			result[i] = objects[index[i]];
		}
		return result;
	}

	public double nextInversionDeviate(org.apache.commons.math.distribution.ContinuousDistribution distribution) throws org.apache.commons.math.MathException {
		return distribution.inverseCumulativeProbability(nextUniform(0, 1));
	}

	public int nextInversionDeviate(org.apache.commons.math.distribution.IntegerDistribution distribution) throws org.apache.commons.math.MathException {
		final double target = nextUniform(0, 1);
		final int glb = distribution.inverseCumulativeProbability(target);
		if ((distribution.cumulativeProbability(glb)) == 1.0) {
			return glb;
		}else {
			return glb + 1;
		}
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

