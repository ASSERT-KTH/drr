

package org.apache.commons.math3.util;


public final class ArithmeticUtils {
	static final long[] FACTORIALS = new long[]{ 1L , 1L , 2L , 6L , 24L , 120L , 720L , 5040L , 40320L , 362880L , 3628800L , 39916800L , 479001600L , 6227020800L , 87178291200L , 1307674368000L , 20922789888000L , 355687428096000L , 6402373705728000L , 121645100408832000L , 2432902008176640000L };

	private ArithmeticUtils() {
		super();
	}

	public static int addAndCheck(int x, int y) {
		long s = ((long) (x)) + ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION, x, y);
		}
		return ((int) (s));
	}

	public static long addAndCheck(long a, long b) {
		return org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(a, b, org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION);
	}

	public static long binomialCoefficient(final int n, final int k) {
		org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(n, k);
		if ((n == k) || (k == 0)) {
			return 1;
		}
		if ((k == 1) || (k == (n - 1))) {
			return n;
		}
		if (k > (n / 2)) {
			return org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(n, (n - k));
		}
		long result = 1;
		if (n <= 61) {
			int i = (n - k) + 1;
			for (int j = 1; j <= k; j++) {
				result = (result * i) / j;
				i++;
			}
		}else
			if (n <= 66) {
				int i = (n - k) + 1;
				for (int j = 1; j <= k; j++) {
					final long d = org.apache.commons.math3.util.ArithmeticUtils.gcd(i, j);
					result = (result / (j / d)) * (i / d);
					i++;
				}
			}else {
				int i = (n - k) + 1;
				for (int j = 1; j <= k; j++) {
					final long d = org.apache.commons.math3.util.ArithmeticUtils.gcd(i, j);
					result = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((result / (j / d)), (i / d));
					i++;
				}
			}
		
		return result;
	}

	public static double binomialCoefficientDouble(final int n, final int k) {
		org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(n, k);
		if ((n == k) || (k == 0)) {
			return 1.0;
		}
		if ((k == 1) || (k == (n - 1))) {
			return n;
		}
		if (k > (n / 2)) {
			return org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(n, (n - k));
		}
		if (n < 67) {
			return org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(n, k);
		}
		double result = 1.0;
		for (int i = 1; i <= k; i++) {
			result *= ((double) ((n - k) + i)) / ((double) (i));
		}
		return org.apache.commons.math3.util.FastMath.floor((result + 0.5));
	}

	public static double binomialCoefficientLog(final int n, final int k) {
		org.apache.commons.math3.util.ArithmeticUtils.checkBinomial(n, k);
		if ((n == k) || (k == 0)) {
			return 0;
		}
		if ((k == 1) || (k == (n - 1))) {
			return org.apache.commons.math3.util.FastMath.log(n);
		}
		if (n < 67) {
			return org.apache.commons.math3.util.FastMath.log(org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(n, k));
		}
		if (n < 1030) {
			return org.apache.commons.math3.util.FastMath.log(org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(n, k));
		}
		if (k > (n / 2)) {
			return org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(n, (n - k));
		}
		double logSum = 0;
		for (int i = (n - k) + 1; i <= n; i++) {
			logSum += org.apache.commons.math3.util.FastMath.log(i);
		}
		for (int i = 2; i <= k; i++) {
			logSum -= org.apache.commons.math3.util.FastMath.log(i);
		}
		return logSum;
	}

	public static long factorial(final int n) {
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER, n);
		}
		if (n > 20) {
			throw new org.apache.commons.math3.exception.MathArithmeticException();
		}
		return org.apache.commons.math3.util.ArithmeticUtils.FACTORIALS[n];
	}

	public static double factorialDouble(final int n) {
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER, n);
		}
		if (n < 21) {
			return org.apache.commons.math3.util.ArithmeticUtils.factorial(n);
		}
		return org.apache.commons.math3.util.FastMath.floor(((org.apache.commons.math3.util.FastMath.exp(org.apache.commons.math3.util.ArithmeticUtils.factorialLog(n))) + 0.5));
	}

	public static double factorialLog(final int n) {
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER, n);
		}
		if (n < 21) {
			return org.apache.commons.math3.util.FastMath.log(org.apache.commons.math3.util.ArithmeticUtils.factorial(n));
		}
		double logSum = 0;
		for (int i = 2; i <= n; i++) {
			logSum += org.apache.commons.math3.util.FastMath.log(i);
		}
		return logSum;
	}

	public static int gcd(final int p, final int q) {
		int u = p;
		int v = q;
		if ((u == 0) || (v == 0)) {
			if ((u == (java.lang.Integer.MIN_VALUE)) || (v == (java.lang.Integer.MIN_VALUE))) {
				throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS, p, q);
			}
			return (org.apache.commons.math3.util.FastMath.abs(u)) + (org.apache.commons.math3.util.FastMath.abs(v));
		}
		if (u > 0) {
			u = -u;
		}
		if (v > 0) {
			v = -v;
		}
		int k = 0;
		while ((((u & 1) == 0) && ((v & 1) == 0)) && (k < 31)) {
			u /= 2;
			v /= 2;
			k++;
		} 
		if (k == 31) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_32_BITS, p, q);
		}
		int t = (u & 1) == 1 ? v : -(u / 2);
		do {
			while ((t & 1) == 0) {
				t /= 2;
			} 
			if (t > 0) {
				u = -t;
			}else {
				v = t;
			}
			t = (v - u) / 2;
		} while (t != 0 );
		return (-u) * (1 << k);
	}

	public static long gcd(final long p, final long q) {
		long u = p;
		long v = q;
		if ((u == 0) || (v == 0)) {
			if ((u == (java.lang.Long.MIN_VALUE)) || (v == (java.lang.Long.MIN_VALUE))) {
				throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS, p, q);
			}
			return (org.apache.commons.math3.util.FastMath.abs(u)) + (org.apache.commons.math3.util.FastMath.abs(v));
		}
		if (u > 0) {
			u = -u;
		}
		if (v > 0) {
			v = -v;
		}
		int k = 0;
		while ((((u & 1) == 0) && ((v & 1) == 0)) && (k < 63)) {
			u /= 2;
			v /= 2;
			k++;
		} 
		if (k == 63) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS, p, q);
		}
		long t = (u & 1) == 1 ? v : -(u / 2);
		do {
			while ((t & 1) == 0) {
				t /= 2;
			} 
			if (t > 0) {
				u = -t;
			}else {
				v = t;
			}
			t = (v - u) / 2;
		} while (t != 0 );
		return (-u) * (1L << k);
	}

	public static int lcm(int a, int b) {
		if ((a == 0) || (b == 0)) {
			return 0;
		}
		int lcm = org.apache.commons.math3.util.FastMath.abs(org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((a / (org.apache.commons.math3.util.ArithmeticUtils.gcd(a, b))), b));
		if (lcm == (java.lang.Integer.MIN_VALUE)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.LCM_OVERFLOW_32_BITS, a, b);
		}
		return lcm;
	}

	public static long lcm(long a, long b) {
		if ((a == 0) || (b == 0)) {
			return 0;
		}
		long lcm = org.apache.commons.math3.util.FastMath.abs(org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((a / (org.apache.commons.math3.util.ArithmeticUtils.gcd(a, b))), b));
		if (lcm == (java.lang.Long.MIN_VALUE)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.LCM_OVERFLOW_64_BITS, a, b);
		}
		return lcm;
	}

	public static int mulAndCheck(int x, int y) {
		long m = ((long) (x)) * ((long) (y));
		if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
			throw new org.apache.commons.math3.exception.MathArithmeticException();
		}
		return ((int) (m));
	}

	public static long mulAndCheck(long a, long b) {
		long ret;
		if (a > b) {
			ret = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(b, a);
		}else {
			if (a < 0) {
				if (b < 0) {
					if (a >= ((java.lang.Long.MAX_VALUE) / b)) {
						ret = a * b;
					}else {
						throw new org.apache.commons.math3.exception.MathArithmeticException();
					}
				}else
					if (b > 0) {
						if (((java.lang.Long.MIN_VALUE) / b) <= a) {
							ret = a * b;
						}else {
							throw new org.apache.commons.math3.exception.MathArithmeticException();
						}
					}else {
						ret = 0;
					}
				
			}else
				if (a > 0) {
					if (a <= ((java.lang.Long.MAX_VALUE) / b)) {
						ret = a * b;
					}else {
						throw new org.apache.commons.math3.exception.MathArithmeticException();
					}
				}else {
					ret = 0;
				}
			
		}
		return ret;
	}

	public static int subAndCheck(int x, int y) {
		long s = ((long) (x)) - ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_SUBTRACTION, x, y);
		}
		return ((int) (s));
	}

	public static long subAndCheck(long a, long b) {
		long ret;
		if (b == (java.lang.Long.MIN_VALUE)) {
			if (a < 0) {
				ret = a - b;
			}else {
				throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION, a, (-b));
			}
		}else {
			ret = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(a, (-b), org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION);
		}
		return ret;
	}

	public static int pow(final int k, int e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		int result = 1;
		int k2p = k;
		while (e != 0) {
			if ((e & 1) != 0) {
				result *= k2p;
			}
			k2p *= k2p;
			e = e >> 1;
		} 
		return result;
	}

	public static int pow(final int k, long e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		int result = 1;
		int k2p = k;
		while (e != 0) {
			if ((e & 1) != 0) {
				result *= k2p;
			}
			k2p *= k2p;
			e = e >> 1;
		} 
		return result;
	}

	public static long pow(final long k, int e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		long result = 1L;
		long k2p = k;
		while (e != 0) {
			if ((e & 1) != 0) {
				result *= k2p;
			}
			k2p *= k2p;
			e = e >> 1;
		} 
		return result;
	}

	public static long pow(final long k, long e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		long result = 1L;
		long k2p = k;
		while (e != 0) {
			if ((e & 1) != 0) {
				result *= k2p;
			}
			k2p *= k2p;
			e = e >> 1;
		} 
		return result;
	}

	public static java.math.BigInteger pow(final java.math.BigInteger k, int e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		return k.pow(e);
	}

	public static java.math.BigInteger pow(final java.math.BigInteger k, long e) {
		if (e < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		java.math.BigInteger result = java.math.BigInteger.ONE;
		java.math.BigInteger k2p = k;
		while (e != 0) {
			if ((e & 1) != 0) {
				result = result.multiply(k2p);
			}
			k2p = k2p.multiply(k2p);
			e = e >> 1;
		} 
		return result;
	}

	public static java.math.BigInteger pow(final java.math.BigInteger k, java.math.BigInteger e) {
		if ((e.compareTo(java.math.BigInteger.ZERO)) < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.EXPONENT, e);
		}
		java.math.BigInteger result = java.math.BigInteger.ONE;
		java.math.BigInteger k2p = k;
		while (!(java.math.BigInteger.ZERO.equals(e))) {
			if (e.testBit(0)) {
				result = result.multiply(k2p);
			}
			k2p = k2p.multiply(k2p);
			e = e.shiftRight(1);
		} 
		return result;
	}

	private static long addAndCheck(long a, long b, org.apache.commons.math3.exception.util.Localizable pattern) {
		long ret;
		if (a > b) {
			ret = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(b, a, pattern);
		}else {
			if (a < 0) {
				if (b < 0) {
					if (((java.lang.Long.MIN_VALUE) - b) <= a) {
						ret = a + b;
					}else {
						throw new org.apache.commons.math3.exception.MathArithmeticException(pattern, a, b);
					}
				}else {
					ret = a + b;
				}
			}else {
				if (a <= ((java.lang.Long.MAX_VALUE) - b)) {
					ret = a + b;
				}else {
					throw new org.apache.commons.math3.exception.MathArithmeticException(pattern, a, b);
				}
			}
		}
		return ret;
	}

	private static void checkBinomial(final int n, final int k) {
		if (n < k) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_INVALID_PARAMETERS_ORDER, k, n, true);
		}
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER, n);
		}
	}

	public static boolean isPowerOfTwo(long n) {
		return (n > 0) && ((n & (n - 1)) == 0);
	}
}

