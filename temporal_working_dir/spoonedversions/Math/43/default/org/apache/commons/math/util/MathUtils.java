

package org.apache.commons.math.util;


public final class MathUtils {
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

	public static short copySign(short magnitude, short sign) {
		if (((magnitude >= 0) && (sign >= 0)) || ((magnitude < 0) && (sign < 0))) {
			return magnitude;
		}else
			if ((sign >= 0) && (magnitude == (java.lang.Short.MIN_VALUE))) {
				throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.OVERFLOW);
			}else {
				return ((short) (-magnitude));
			}
		
	}

	public static int copySign(int magnitude, int sign) {
		if (((magnitude >= 0) && (sign >= 0)) || ((magnitude < 0) && (sign < 0))) {
			return magnitude;
		}else
			if ((sign >= 0) && (magnitude == (java.lang.Integer.MIN_VALUE))) {
				throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.OVERFLOW);
			}else {
				return -magnitude;
			}
		
	}

	public static long copySign(long magnitude, long sign) {
		if (((magnitude >= 0) && (sign >= 0)) || ((magnitude < 0) && (sign < 0))) {
			return magnitude;
		}else
			if ((sign >= 0) && (magnitude == (java.lang.Long.MIN_VALUE))) {
				throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.OVERFLOW);
			}else {
				return -magnitude;
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

