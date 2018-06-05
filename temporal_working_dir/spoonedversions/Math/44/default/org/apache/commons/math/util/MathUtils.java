

package org.apache.commons.math.util;


public final class MathUtils {
	public static final double EPSILON = 1.1102230246251565E-16;

	public static final double SAFE_MIN = 2.2250738585072014E-308;

	public static final double TWO_PI = 2 * (org.apache.commons.math.util.FastMath.PI);

	private static final byte NB = ((byte) (-1));

	private static final short NS = ((short) (-1));

	private static final byte PB = ((byte) (1));

	private static final short PS = ((short) (1));

	private static final byte ZB = ((byte) (0));

	private static final short ZS = ((short) (0));

	private MathUtils() {
		super();
	}

	public static int hash(double value) {
		return new java.lang.Double(value).hashCode();
	}

	public static int hash(double[] value) {
		return java.util.Arrays.hashCode(value);
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

	public static double normalizeAngle(double a, double center) {
		return a - ((org.apache.commons.math.util.MathUtils.TWO_PI) * (org.apache.commons.math.util.FastMath.floor((((a + (org.apache.commons.math.util.FastMath.PI)) - center) / (org.apache.commons.math.util.MathUtils.TWO_PI)))));
	}

	public static double reduce(double a, double period, double offset) {
		final double p = org.apache.commons.math.util.FastMath.abs(period);
		return (a - (p * (org.apache.commons.math.util.FastMath.floor(((a - offset) / p))))) - offset;
	}

	public static byte sign(final byte x) {
		return x == (org.apache.commons.math.util.MathUtils.ZB) ? org.apache.commons.math.util.MathUtils.ZB : x > (org.apache.commons.math.util.MathUtils.ZB) ? org.apache.commons.math.util.MathUtils.PB : org.apache.commons.math.util.MathUtils.NB;
	}

	public static byte copySign(byte magnitude, byte sign) {
		if (((magnitude >= 0) && (sign >= 0)) || ((magnitude < 0) && (sign < 0))) {
			return magnitude;
		}else
			if ((sign >= 0) && (magnitude == (java.lang.Byte.MIN_VALUE))) {
				throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.OVERFLOW);
			}else {
				return ((byte) (-magnitude));
			}
		
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

	public static int pow(final int k, int e) {
		if (e < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
		}
		return k.pow(e);
	}

	public static java.math.BigInteger pow(final java.math.BigInteger k, long e) {
		if (e < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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
			throw new org.apache.commons.math.exception.NotPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.EXPONENT, e);
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

	public static void checkFinite(final double x) {
		if ((java.lang.Double.isInfinite(x)) || (java.lang.Double.isNaN(x))) {
			throw new org.apache.commons.math.exception.NotFiniteNumberException(x);
		}
	}

	public static void checkFinite(final double[] val) {
		for (int i = 0; i < (val.length); i++) {
			final double x = val[i];
			if ((java.lang.Double.isInfinite(x)) || (java.lang.Double.isNaN(x))) {
				throw new org.apache.commons.math.exception.NotFiniteNumberException(org.apache.commons.math.exception.util.LocalizedFormats.ARRAY_ELEMENT, x, i);
			}
		}
	}

	public static void checkNotNull(java.lang.Object o, org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... args) {
		if (o == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(pattern, args);
		}
	}

	public static void checkNotNull(java.lang.Object o) throws org.apache.commons.math.exception.NullArgumentException {
		if (o == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
	}
}

