

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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("length must be positive ({0})", len);
		}
		org.apache.commons.math.random.RandomGenerator ran = getRan();
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("upper bound ({0}) must be greater than lower bound ({1})", upper, lower);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		double r = rand.nextDouble();
		return ((int) (((r * upper) + ((1.0 - r) * lower)) + r));
	}

	public long nextLong(long lower, long upper) {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("upper bound ({0}) must be greater than lower bound ({1})", upper, lower);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		double r = rand.nextDouble();
		return ((long) (((r * upper) + ((1.0 - r) * lower)) + r));
	}

	public java.lang.String nextSecureHexString(int len) {
		if (len <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("length must be positive ({0})", len);
		}
		java.security.SecureRandom secRan = getSecRan();
		java.security.MessageDigest alg = null;
		try {
			alg = java.security.MessageDigest.getInstance("SHA-1");
		} catch (java.security.NoSuchAlgorithmException ex) {
			return null;
		}
		alg.reset();
		int numIter = (len / 40) + 1;
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("upper bound ({0}) must be greater than lower bound ({1})", upper, lower);
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((int) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextSecureLong(long lower, long upper) {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("upper bound ({0}) must be greater than lower bound ({1})", upper, lower);
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((long) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextPoisson(double mean) {
		if (mean <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("the Poisson mean must be positive ({0})", mean);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		double pivot = 6.0;
		if (mean < pivot) {
			double p = java.lang.Math.exp((-mean));
			long n = 0;
			double r = 1.0;
			double rnd = 1.0;
			while (n < (1000 * mean)) {
				rnd = rand.nextDouble();
				r = r * rnd;
				if (r >= p) {
					n++;
				}else {
					return n;
				}
			} 
			return n;
		}else {
			double mu = java.lang.Math.floor(mean);
			double delta = java.lang.Math.floor((pivot + ((mu - pivot) / 2.0)));
			double mu2delta = (2.0 * mu) + delta;
			double muDeltaHalf = mu + (delta / 2.0);
			double logMeanMu = java.lang.Math.log((mean / mu));
			double muFactorialLog = org.apache.commons.math.util.MathUtils.factorialLog(((int) (mu)));
			double c1 = java.lang.Math.sqrt((((java.lang.Math.PI) * mu) / 2.0));
			double c2 = c1 + (java.lang.Math.sqrt((((java.lang.Math.PI) * muDeltaHalf) / (2.0 * (java.lang.Math.exp((1.0 / mu2delta)))))));
			double c3 = c2 + 2.0;
			double c4 = c3 + (java.lang.Math.exp((1.0 / 78.0)));
			double c = c4 + (((2.0 / delta) * mu2delta) * (java.lang.Math.exp((((-delta) / mu2delta) * (1.0 + (delta / 2.0))))));
			double y = 0.0;
			double x = 0.0;
			double w = java.lang.Double.POSITIVE_INFINITY;
			boolean accept = false;
			while (!accept) {
				double u = nextUniform(0.0, c);
				double e = nextExponential(mean);
				if (u <= c1) {
					double z = nextGaussian(0.0, 1.0);
					y = ((-(java.lang.Math.abs(z))) * (java.lang.Math.sqrt(mu))) - 1.0;
					x = java.lang.Math.floor(y);
					w = ((((-z) * z) / 2.0) - e) - (x * logMeanMu);
					if (x < (-mu)) {
						w = java.lang.Double.POSITIVE_INFINITY;
					}
				}else
					if ((c1 < u) && (u <= c2)) {
						double z = nextGaussian(0.0, 1.0);
						y = 1.0 + ((java.lang.Math.abs(z)) * (java.lang.Math.sqrt(muDeltaHalf)));
						x = java.lang.Math.ceil(y);
						w = (((((-y) * y) + (2.0 * y)) / mu2delta) - e) - (x * logMeanMu);
						if (x > delta) {
							w = java.lang.Double.POSITIVE_INFINITY;
						}
					}else
						if ((c2 < u) && (u <= c3)) {
							x = 0.0;
							w = -e;
						}else
							if ((c3 < u) && (u <= c4)) {
								x = 1.0;
								w = (-e) - logMeanMu;
							}else
								if (c4 < u) {
									double v = nextExponential(mean);
									y = delta + (((v * 2.0) / delta) * mu2delta);
									x = java.lang.Math.ceil(y);
									w = ((((-delta) / mu2delta) * (1.0 + (y / 2.0))) - e) - (x * logMeanMu);
								}
							
						
					
				
				accept = w <= ((x * (java.lang.Math.log(mu))) - ((org.apache.commons.math.util.MathUtils.factorialLog(((int) (mu + x)))) / muFactorialLog));
			} 
			return ((long) (x + mu));
		}
	}

	public double nextGaussian(double mu, double sigma) {
		if (sigma <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("standard deviation must be positive ({0})", sigma);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		return (sigma * (rand.nextGaussian())) + mu;
	}

	public double nextExponential(double mean) {
		if (mean < 0.0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("mean must be positive ({0})", mean);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		double unif = rand.nextDouble();
		while (unif == 0.0) {
			unif = rand.nextDouble();
		} 
		return (-mean) * (java.lang.Math.log(unif));
	}

	public double nextUniform(double lower, double upper) {
		if (lower >= upper) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("upper bound ({0}) must be greater than lower bound ({1})", upper, lower);
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		double u = rand.nextDouble();
		while (u <= 0.0) {
			u = rand.nextDouble();
		} 
		return lower + (u * (upper - lower));
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("permutation k ({0}) exceeds n ({1})", k, n);
		}
		if (k == 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("permutation k ({0}) must be positive", k);
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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("sample size ({0}) exceeds collection size ({1})");
		}
		if (k <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("sample size must be positive ({0})", k);
		}
		java.lang.Object[] objects = c.toArray();
		int[] index = nextPermutation(len, k);
		java.lang.Object[] result = new java.lang.Object[k];
		for (int i = 0; i < k; i++) {
			result[i] = objects[index[i]];
		}
		return result;
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

