

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
			throw new java.lang.IllegalArgumentException("length must be positive");
		}
		org.apache.commons.math.random.RandomGenerator ran = getRan();
		java.lang.StringBuffer outBuffer = new java.lang.StringBuffer();
		byte[] randomBytes = new byte[(len / 2) + 1];
		ran.nextBytes(randomBytes);
		for (int i = 0; i < (randomBytes.length); i++) {
			java.lang.Integer c = new java.lang.Integer(randomBytes[i]);
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
			throw new java.lang.IllegalArgumentException("upper bound must be > lower bound");
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		return lower + ((int) ((rand.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextLong(long lower, long upper) {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException("upper bound must be > lower bound");
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		return lower + ((long) ((rand.nextDouble()) * ((upper - lower) + 1)));
	}

	public java.lang.String nextSecureHexString(int len) {
		if (len <= 0) {
			throw new java.lang.IllegalArgumentException("length must be positive");
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
				java.lang.Integer c = new java.lang.Integer(hash[i]);
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
			throw new java.lang.IllegalArgumentException("lower bound must be < upper bound");
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((int) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextSecureLong(long lower, long upper) {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException("lower bound must be < upper bound");
		}
		java.security.SecureRandom sec = getSecRan();
		return lower + ((long) ((sec.nextDouble()) * ((upper - lower) + 1)));
	}

	public long nextPoisson(double mean) {
		if (mean <= 0) {
			throw new java.lang.IllegalArgumentException("Poisson mean must be > 0");
		}
		double p = java.lang.Math.exp((-mean));
		long n = 0;
		double r = 1.0;
		double rnd = 1.0;
		org.apache.commons.math.random.RandomGenerator rand = getRan();
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
	}

	public double nextGaussian(double mu, double sigma) {
		if (sigma <= 0) {
			throw new java.lang.IllegalArgumentException("Gaussian std dev must be > 0");
		}
		org.apache.commons.math.random.RandomGenerator rand = getRan();
		return (sigma * (rand.nextGaussian())) + mu;
	}

	public double nextExponential(double mean) {
		if (mean < 0.0) {
			throw new java.lang.IllegalArgumentException("Exponential mean must be >= 0");
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
			throw new java.lang.IllegalArgumentException("lower bound must be <= upper bound");
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
			throw new java.lang.IllegalArgumentException("permutation k exceeds n");
		}
		if (k == 0) {
			throw new java.lang.IllegalArgumentException("permutation k must be > 0");
		}
		int[] index = getNatural(n);
		shuffle(index, (n - k));
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = index[((n - i) - 1)];
		}
		return result;
	}

	public java.lang.Object[] nextSample(java.util.Collection c, int k) {
		int len = c.size();
		if (k > len) {
			throw new java.lang.IllegalArgumentException("sample size exceeds collection size");
		}
		if (k == 0) {
			throw new java.lang.IllegalArgumentException("sample size must be > 0");
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

