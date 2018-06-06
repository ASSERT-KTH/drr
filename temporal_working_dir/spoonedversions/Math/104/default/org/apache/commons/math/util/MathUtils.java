

package org.apache.commons.math.util;


public final class MathUtils {
	private static final byte NB = ((byte) (-1));

	private static final short NS = ((short) (-1));

	private static final byte PB = ((byte) (1));

	private static final short PS = ((short) (1));

	private static final byte ZB = ((byte) (0));

	private static final short ZS = ((short) (0));

	private MathUtils() {
		super();
	}

	public static int addAndCheck(int x, int y) {
		long s = ((long) (x)) + ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: add");
		}
		return ((int) (s));
	}

	public static long binomialCoefficient(final int n, final int k) {
		if (n < k) {
			throw new java.lang.IllegalArgumentException("must have n >= k for binomial coefficient (n,k)");
		}
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("must have n >= 0 for binomial coefficient (n,k)");
		}
		if ((n == k) || (k == 0)) {
			return 1;
		}
		if ((k == 1) || (k == (n - 1))) {
			return n;
		}
		long result = java.lang.Math.round(org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(n, k));
		if (result == (java.lang.Long.MAX_VALUE)) {
			throw new java.lang.ArithmeticException("result too large to represent in a long integer");
		}
		return result;
	}

	public static double binomialCoefficientDouble(final int n, final int k) {
		return java.lang.Math.floor(((java.lang.Math.exp(org.apache.commons.math.util.MathUtils.binomialCoefficientLog(n, k))) + 0.5));
	}

	public static double binomialCoefficientLog(final int n, final int k) {
		if (n < k) {
			throw new java.lang.IllegalArgumentException("must have n >= k for binomial coefficient (n,k)");
		}
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("must have n >= 0 for binomial coefficient (n,k)");
		}
		if ((n == k) || (k == 0)) {
			return 0;
		}
		if ((k == 1) || (k == (n - 1))) {
			return java.lang.Math.log(((double) (n)));
		}
		double logSum = 0;
		for (int i = k + 1; i <= n; i++) {
			logSum += java.lang.Math.log(((double) (i)));
		}
		for (int i = 2; i <= (n - k); i++) {
			logSum -= java.lang.Math.log(((double) (i)));
		}
		return logSum;
	}

	public static double cosh(double x) {
		return ((java.lang.Math.exp(x)) + (java.lang.Math.exp((-x)))) / 2.0;
	}

	public static boolean equals(double x, double y) {
		return ((java.lang.Double.isNaN(x)) && (java.lang.Double.isNaN(y))) || (x == y);
	}

	public static long factorial(final int n) {
		long result = java.lang.Math.round(org.apache.commons.math.util.MathUtils.factorialDouble(n));
		if (result == (java.lang.Long.MAX_VALUE)) {
			throw new java.lang.ArithmeticException("result too large to represent in a long integer");
		}
		return result;
	}

	public static double factorialDouble(final int n) {
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("must have n >= 0 for n!");
		}
		return java.lang.Math.floor(((java.lang.Math.exp(org.apache.commons.math.util.MathUtils.factorialLog(n))) + 0.5));
	}

	public static double factorialLog(final int n) {
		if (n < 0) {
			throw new java.lang.IllegalArgumentException("must have n > 0 for n!");
		}
		double logSum = 0;
		for (int i = 2; i <= n; i++) {
			logSum += java.lang.Math.log(((double) (i)));
		}
		return logSum;
	}

	public static int gcd(int u, int v) {
		if ((u * v) == 0) {
			return (java.lang.Math.abs(u)) + (java.lang.Math.abs(v));
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
			throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
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

	public static int hash(double value) {
		long bits = java.lang.Double.doubleToLongBits(value);
		return ((int) (bits ^ (bits >>> 32)));
	}

	public static byte indicator(final byte x) {
		return x >= (org.apache.commons.math.util.MathUtils.ZB) ? org.apache.commons.math.util.MathUtils.PB : org.apache.commons.math.util.MathUtils.NB;
	}

	public static double indicator(final double x) {
		if (java.lang.Double.isNaN(x)) {
			return java.lang.Double.NaN;
		}
		return x >= 0.0 ? 1.0 : -1.0;
	}

	public static float indicator(final float x) {
		if (java.lang.Float.isNaN(x)) {
			return java.lang.Float.NaN;
		}
		return x >= 0.0F ? 1.0F : -1.0F;
	}

	public static int indicator(final int x) {
		return x >= 0 ? 1 : -1;
	}

	public static long indicator(final long x) {
		return x >= 0L ? 1L : -1L;
	}

	public static short indicator(final short x) {
		return x >= (org.apache.commons.math.util.MathUtils.ZS) ? org.apache.commons.math.util.MathUtils.PS : org.apache.commons.math.util.MathUtils.NS;
	}

	public static int lcm(int a, int b) {
		return java.lang.Math.abs(org.apache.commons.math.util.MathUtils.mulAndCheck((a / (org.apache.commons.math.util.MathUtils.gcd(a, b))), b));
	}

	public static int mulAndCheck(int x, int y) {
		long m = ((long) (x)) * ((long) (y));
		if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: mul");
		}
		return ((int) (m));
	}

	public static double nextAfter(double d, double direction) {
		if ((java.lang.Double.isNaN(d)) || (java.lang.Double.isInfinite(d))) {
			return d;
		}else
			if (d == 0) {
				return direction < 0 ? -(java.lang.Double.MIN_VALUE) : java.lang.Double.MIN_VALUE;
			}
		
		long bits = java.lang.Double.doubleToLongBits(d);
		long sign = bits & -9223372036854775808L;
		long exponent = bits & 9218868437227405312L;
		long mantissa = bits & 4503599627370495L;
		if ((d * (direction - d)) >= 0) {
			if (mantissa == 4503599627370495L) {
				return java.lang.Double.longBitsToDouble((sign | (exponent + 4503599627370496L)));
			}else {
				return java.lang.Double.longBitsToDouble(((sign | exponent) | (mantissa + 1)));
			}
		}else {
			if (mantissa == 0L) {
				return java.lang.Double.longBitsToDouble(((sign | (exponent - 4503599627370496L)) | 4503599627370495L));
			}else {
				return java.lang.Double.longBitsToDouble(((sign | exponent) | (mantissa - 1)));
			}
		}
	}

	public static double round(double x, int scale) {
		return org.apache.commons.math.util.MathUtils.round(x, scale, java.math.BigDecimal.ROUND_HALF_UP);
	}

	public static double round(double x, int scale, int roundingMethod) {
		try {
			return new java.math.BigDecimal(java.lang.Double.toString(x)).setScale(scale, roundingMethod).doubleValue();
		} catch (java.lang.NumberFormatException ex) {
			if (java.lang.Double.isInfinite(x)) {
				return x;
			}else {
				return java.lang.Double.NaN;
			}
		}
	}

	public static float round(float x, int scale) {
		return org.apache.commons.math.util.MathUtils.round(x, scale, java.math.BigDecimal.ROUND_HALF_UP);
	}

	public static float round(float x, int scale, int roundingMethod) {
		float sign = org.apache.commons.math.util.MathUtils.indicator(x);
		float factor = ((float) (java.lang.Math.pow(10.0F, scale))) * sign;
		return ((float) (org.apache.commons.math.util.MathUtils.roundUnscaled((x * factor), sign, roundingMethod))) / factor;
	}

	private static double roundUnscaled(double unscaled, double sign, int roundingMethod) {
		switch (roundingMethod) {
			case java.math.BigDecimal.ROUND_CEILING :
				if (sign == (-1)) {
					unscaled = java.lang.Math.floor(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.NEGATIVE_INFINITY));
				}else {
					unscaled = java.lang.Math.ceil(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.POSITIVE_INFINITY));
				}
				break;
			case java.math.BigDecimal.ROUND_DOWN :
				unscaled = java.lang.Math.floor(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.NEGATIVE_INFINITY));
				break;
			case java.math.BigDecimal.ROUND_FLOOR :
				if (sign == (-1)) {
					unscaled = java.lang.Math.ceil(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.POSITIVE_INFINITY));
				}else {
					unscaled = java.lang.Math.floor(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.NEGATIVE_INFINITY));
				}
				break;
			case java.math.BigDecimal.ROUND_HALF_DOWN :
				{
					unscaled = org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.NEGATIVE_INFINITY);
					double fraction = unscaled - (java.lang.Math.floor(unscaled));
					if (fraction > 0.5) {
						unscaled = java.lang.Math.ceil(unscaled);
					}else {
						unscaled = java.lang.Math.floor(unscaled);
					}
					break;
				}
			case java.math.BigDecimal.ROUND_HALF_EVEN :
				{
					double fraction = unscaled - (java.lang.Math.floor(unscaled));
					if (fraction > 0.5) {
						unscaled = java.lang.Math.ceil(unscaled);
					}else
						if (fraction < 0.5) {
							unscaled = java.lang.Math.floor(unscaled);
						}else {
							if (((java.lang.Math.floor(unscaled)) / 2.0) == (java.lang.Math.floor(((java.lang.Math.floor(unscaled)) / 2.0)))) {
								unscaled = java.lang.Math.floor(unscaled);
							}else {
								unscaled = java.lang.Math.ceil(unscaled);
							}
						}
					
					break;
				}
			case java.math.BigDecimal.ROUND_HALF_UP :
				{
					unscaled = org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.POSITIVE_INFINITY);
					double fraction = unscaled - (java.lang.Math.floor(unscaled));
					if (fraction >= 0.5) {
						unscaled = java.lang.Math.ceil(unscaled);
					}else {
						unscaled = java.lang.Math.floor(unscaled);
					}
					break;
				}
			case java.math.BigDecimal.ROUND_UNNECESSARY :
				if (unscaled != (java.lang.Math.floor(unscaled))) {
					throw new java.lang.ArithmeticException("Inexact result from rounding");
				}
				break;
			case java.math.BigDecimal.ROUND_UP :
				unscaled = java.lang.Math.ceil(org.apache.commons.math.util.MathUtils.nextAfter(unscaled, java.lang.Double.POSITIVE_INFINITY));
				break;
			default :
				throw new java.lang.IllegalArgumentException("Invalid rounding method.");
		}
		return unscaled;
	}

	public static byte sign(final byte x) {
		return x == (org.apache.commons.math.util.MathUtils.ZB) ? org.apache.commons.math.util.MathUtils.ZB : x > (org.apache.commons.math.util.MathUtils.ZB) ? org.apache.commons.math.util.MathUtils.PB : org.apache.commons.math.util.MathUtils.NB;
	}

	public static double sign(final double x) {
		if (java.lang.Double.isNaN(x)) {
			return java.lang.Double.NaN;
		}
		return x == 0.0 ? 0.0 : x > 0.0 ? 1.0 : -1.0;
	}

	public static float sign(final float x) {
		if (java.lang.Float.isNaN(x)) {
			return java.lang.Float.NaN;
		}
		return x == 0.0F ? 0.0F : x > 0.0F ? 1.0F : -1.0F;
	}

	public static int sign(final int x) {
		return x == 0 ? 0 : x > 0 ? 1 : -1;
	}

	public static long sign(final long x) {
		return x == 0L ? 0L : x > 0L ? 1L : -1L;
	}

	public static short sign(final short x) {
		return x == (org.apache.commons.math.util.MathUtils.ZS) ? org.apache.commons.math.util.MathUtils.ZS : x > (org.apache.commons.math.util.MathUtils.ZS) ? org.apache.commons.math.util.MathUtils.PS : org.apache.commons.math.util.MathUtils.NS;
	}

	public static double sinh(double x) {
		return ((java.lang.Math.exp(x)) - (java.lang.Math.exp((-x)))) / 2.0;
	}

	public static int subAndCheck(int x, int y) {
		long s = ((long) (x)) - ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: subtract");
		}
		return ((int) (s));
	}
}

