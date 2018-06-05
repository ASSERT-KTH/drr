

package org.apache.commons.math3.util;


public class MathArrays {
	private static final int SPLIT_FACTOR = 134217729;

	private MathArrays() {
	}

	public interface Function {
		double evaluate(double[] array);

		double evaluate(double[] array, int startIndex, int numElements);
	}

	public static double[] ebeAdd(double[] a, double[] b) {
		if ((a.length) != (b.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(a.length, b.length);
		}
		final double[] result = a.clone();
		for (int i = 0; i < (a.length); i++) {
			result[i] += b[i];
		}
		return result;
	}

	public static double[] ebeSubtract(double[] a, double[] b) {
		if ((a.length) != (b.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(a.length, b.length);
		}
		final double[] result = a.clone();
		for (int i = 0; i < (a.length); i++) {
			result[i] -= b[i];
		}
		return result;
	}

	public static double[] ebeMultiply(double[] a, double[] b) {
		if ((a.length) != (b.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(a.length, b.length);
		}
		final double[] result = a.clone();
		for (int i = 0; i < (a.length); i++) {
			result[i] *= b[i];
		}
		return result;
	}

	public static double[] ebeDivide(double[] a, double[] b) {
		if ((a.length) != (b.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(a.length, b.length);
		}
		final double[] result = a.clone();
		for (int i = 0; i < (a.length); i++) {
			result[i] /= b[i];
		}
		return result;
	}

	public static double distance1(double[] p1, double[] p2) {
		double sum = 0;
		for (int i = 0; i < (p1.length); i++) {
			sum += org.apache.commons.math3.util.FastMath.abs(((p1[i]) - (p2[i])));
		}
		return sum;
	}

	public static int distance1(int[] p1, int[] p2) {
		int sum = 0;
		for (int i = 0; i < (p1.length); i++) {
			sum += org.apache.commons.math3.util.FastMath.abs(((p1[i]) - (p2[i])));
		}
		return sum;
	}

	public static double distance(double[] p1, double[] p2) {
		double sum = 0;
		for (int i = 0; i < (p1.length); i++) {
			final double dp = (p1[i]) - (p2[i]);
			sum += dp * dp;
		}
		return org.apache.commons.math3.util.FastMath.sqrt(sum);
	}

	public static double distance(int[] p1, int[] p2) {
		double sum = 0;
		for (int i = 0; i < (p1.length); i++) {
			final double dp = (p1[i]) - (p2[i]);
			sum += dp * dp;
		}
		return org.apache.commons.math3.util.FastMath.sqrt(sum);
	}

	public static double distanceInf(double[] p1, double[] p2) {
		double max = 0;
		for (int i = 0; i < (p1.length); i++) {
			max = org.apache.commons.math3.util.FastMath.max(max, org.apache.commons.math3.util.FastMath.abs(((p1[i]) - (p2[i]))));
		}
		return max;
	}

	public static int distanceInf(int[] p1, int[] p2) {
		int max = 0;
		for (int i = 0; i < (p1.length); i++) {
			max = org.apache.commons.math3.util.FastMath.max(max, org.apache.commons.math3.util.FastMath.abs(((p1[i]) - (p2[i]))));
		}
		return max;
	}

	public static enum OrderDirection {
INCREASING, DECREASING;	}

	public static <T extends java.lang.Comparable<? super T>> boolean isMonotonic(T[] val, org.apache.commons.math3.util.MathArrays.OrderDirection dir, boolean strict) {
		T previous = val[0];
		final int max = val.length;
		for (int i = 1; i < max; i++) {
			final int comp;
			switch (dir) {
				case INCREASING :
					comp = previous.compareTo(val[i]);
					if (strict) {
						if (comp >= 0) {
							return false;
						}
					}else {
						if (comp > 0) {
							return false;
						}
					}
					break;
				case DECREASING :
					comp = val[i].compareTo(previous);
					if (strict) {
						if (comp >= 0) {
							return false;
						}
					}else {
						if (comp > 0) {
							return false;
						}
					}
					break;
				default :
					throw new org.apache.commons.math3.exception.MathInternalError();
			}
			previous = val[i];
		}
		return true;
	}

	public static boolean isMonotonic(double[] val, org.apache.commons.math3.util.MathArrays.OrderDirection dir, boolean strict) {
		return org.apache.commons.math3.util.MathArrays.checkOrder(val, dir, strict, false);
	}

	public static boolean checkOrder(double[] val, org.apache.commons.math3.util.MathArrays.OrderDirection dir, boolean strict, boolean abort) throws org.apache.commons.math3.exception.NonMonotonicSequenceException {
		double previous = val[0];
		final int max = val.length;
		int index;
		ITEM : for (index = 1; index < max; index++) {
			switch (dir) {
				case INCREASING :
					if (strict) {
						if ((val[index]) <= previous) {
							break ITEM;
						}
					}else {
						if ((val[index]) < previous) {
							break ITEM;
						}
					}
					break;
				case DECREASING :
					if (strict) {
						if ((val[index]) >= previous) {
							break ITEM;
						}
					}else {
						if ((val[index]) > previous) {
							break ITEM;
						}
					}
					break;
				default :
					throw new org.apache.commons.math3.exception.MathInternalError();
			}
			previous = val[index];
		}
		if (index == max) {
			return true;
		}
		if (abort) {
			throw new org.apache.commons.math3.exception.NonMonotonicSequenceException(val[index], previous, index, dir, strict);
		}else {
			return false;
		}
	}

	public static void checkOrder(double[] val, org.apache.commons.math3.util.MathArrays.OrderDirection dir, boolean strict) throws org.apache.commons.math3.exception.NonMonotonicSequenceException {
		org.apache.commons.math3.util.MathArrays.checkOrder(val, dir, strict, true);
	}

	public static void checkOrder(double[] val) throws org.apache.commons.math3.exception.NonMonotonicSequenceException {
		org.apache.commons.math3.util.MathArrays.checkOrder(val, org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING, true);
	}

	public static void checkRectangular(final long[][] in) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(in);
		for (int i = 1; i < (in.length); i++) {
			if ((in[i].length) != (in[0].length)) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS, in[i].length, in[0].length);
			}
		}
	}

	public static void checkPositive(final double[] in) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) <= 0) {
				throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(in[i]);
			}
		}
	}

	public static void checkNonNegative(final long[] in) throws org.apache.commons.math3.exception.NotPositiveException {
		for (int i = 0; i < (in.length); i++) {
			if ((in[i]) < 0) {
				throw new org.apache.commons.math3.exception.NotPositiveException(in[i]);
			}
		}
	}

	public static void checkNonNegative(final long[][] in) throws org.apache.commons.math3.exception.NotPositiveException {
		for (int i = 0; i < (in.length); i++) {
			for (int j = 0; j < (in[i].length); j++) {
				if ((in[i][j]) < 0) {
					throw new org.apache.commons.math3.exception.NotPositiveException(in[i][j]);
				}
			}
		}
	}

	public static double safeNorm(double[] v) {
		double rdwarf = 3.834E-20;
		double rgiant = 1.304E19;
		double s1 = 0;
		double s2 = 0;
		double s3 = 0;
		double x1max = 0;
		double x3max = 0;
		double floatn = v.length;
		double agiant = rgiant / floatn;
		for (int i = 0; i < (v.length); i++) {
			double xabs = java.lang.Math.abs(v[i]);
			if ((xabs < rdwarf) || (xabs > agiant)) {
				if (xabs > rdwarf) {
					if (xabs > x1max) {
						double r = x1max / xabs;
						s1 = 1 + ((s1 * r) * r);
						x1max = xabs;
					}else {
						double r = xabs / x1max;
						s1 += r * r;
					}
				}else {
					if (xabs > x3max) {
						double r = x3max / xabs;
						s3 = 1 + ((s3 * r) * r);
						x3max = xabs;
					}else {
						if (xabs != 0) {
							double r = xabs / x3max;
							s3 += r * r;
						}
					}
				}
			}else {
				s2 += xabs * xabs;
			}
		}
		double norm;
		if (s1 != 0) {
			norm = x1max * (java.lang.Math.sqrt((s1 + ((s2 / x1max) / x1max))));
		}else {
			if (s2 == 0) {
				norm = x3max * (java.lang.Math.sqrt(s3));
			}else {
				if (s2 >= x3max) {
					norm = java.lang.Math.sqrt((s2 * (1 + ((x3max / s2) * (x3max * s3)))));
				}else {
					norm = java.lang.Math.sqrt((x3max * ((s2 / x3max) + (x3max * s3))));
				}
			}
		}
		return norm;
	}

	public static void sortInPlace(double[] x, double[]... yList) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathArrays.sortInPlace(x, org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING, yList);
	}

	public static void sortInPlace(double[] x, final org.apache.commons.math3.util.MathArrays.OrderDirection dir, double[]... yList) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException {
		if (x == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final int len = x.length;
		final java.util.List<org.apache.commons.math3.util.Pair<java.lang.Double, double[]>> list = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Double, double[]>>(len);
		final int yListLen = yList.length;
		for (int i = 0; i < len; i++) {
			final double[] yValues = new double[yListLen];
			for (int j = 0; j < yListLen; j++) {
				double[] y = yList[j];
				if (y == null) {
					throw new org.apache.commons.math3.exception.NullArgumentException();
				}
				if ((y.length) != len) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(y.length, len);
				}
				yValues[j] = y[i];
			}
			list.add(new org.apache.commons.math3.util.Pair<java.lang.Double, double[]>(x[i], yValues));
		}
		final java.util.Comparator<org.apache.commons.math3.util.Pair<java.lang.Double, double[]>> comp = new java.util.Comparator<org.apache.commons.math3.util.Pair<java.lang.Double, double[]>>() {
			public int compare(org.apache.commons.math3.util.Pair<java.lang.Double, double[]> o1, org.apache.commons.math3.util.Pair<java.lang.Double, double[]> o2) {
				int val;
				switch (dir) {
					case INCREASING :
						val = o1.getKey().compareTo(o2.getKey());
						break;
					case DECREASING :
						val = o2.getKey().compareTo(o1.getKey());
						break;
					default :
						throw new org.apache.commons.math3.exception.MathInternalError();
				}
				return val;
			}
		};
		java.util.Collections.sort(list, comp);
		for (int i = 0; i < len; i++) {
			final org.apache.commons.math3.util.Pair<java.lang.Double, double[]> e = list.get(i);
			x[i] = e.getKey();
			final double[] yValues = e.getValue();
			for (int j = 0; j < yListLen; j++) {
				yList[j][i] = yValues[j];
			}
		}
	}

	public static int[] copyOf(int[] source) {
		return org.apache.commons.math3.util.MathArrays.copyOf(source, source.length);
	}

	public static double[] copyOf(double[] source) {
		return org.apache.commons.math3.util.MathArrays.copyOf(source, source.length);
	}

	public static int[] copyOf(int[] source, int len) {
		final int[] output = new int[len];
		java.lang.System.arraycopy(source, 0, output, 0, org.apache.commons.math3.util.FastMath.min(len, source.length));
		return output;
	}

	public static double[] copyOf(double[] source, int len) {
		final double[] output = new double[len];
		java.lang.System.arraycopy(source, 0, output, 0, org.apache.commons.math3.util.FastMath.min(len, source.length));
		return output;
	}

	public static double linearCombination(final double[] a, final double[] b) throws org.apache.commons.math3.exception.DimensionMismatchException {
		final int len = a.length;
		if (len != (b.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(len, b.length);
		}
		final double[] prodHigh = new double[len];
		double prodLowSum = 0;
		for (int i = 0; i < len; i++) {
			final double ai = a[i];
			final double ca = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * ai;
			final double aHigh = ca - (ca - ai);
			final double aLow = ai - aHigh;
			final double bi = b[i];
			final double cb = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * bi;
			final double bHigh = cb - (cb - bi);
			final double bLow = bi - bHigh;
			prodHigh[i] = ai * bi;
			final double prodLow = (aLow * bLow) - ((((prodHigh[i]) - (aHigh * bHigh)) - (aLow * bHigh)) - (aHigh * bLow));
			prodLowSum += prodLow;
		}
		final double prodHighCur = prodHigh[0];
		double prodHighNext = prodHigh[1];
		double sHighPrev = prodHighCur + prodHighNext;
		double sPrime = sHighPrev - prodHighNext;
		double sLowSum = (prodHighNext - (sHighPrev - sPrime)) + (prodHighCur - sPrime);
		final int lenMinusOne = len - 1;
		for (int i = 1; i < lenMinusOne; i++) {
			prodHighNext = prodHigh[(i + 1)];
			final double sHighCur = sHighPrev + prodHighNext;
			sPrime = sHighCur - prodHighNext;
			sLowSum += (prodHighNext - (sHighCur - sPrime)) + (sHighPrev - sPrime);
			sHighPrev = sHighCur;
		}
		double result = sHighPrev + (prodLowSum + sLowSum);
		if (java.lang.Double.isNaN(result)) {
			result = 0;
			for (int i = 0; i < len; ++i) {
				result += (a[i]) * (b[i]);
			}
		}
		return result;
	}

	public static double linearCombination(final double a1, final double b1, final double a2, final double b2) {
		final double ca1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a1;
		final double a1High = ca1 - (ca1 - a1);
		final double a1Low = a1 - a1High;
		final double cb1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b1;
		final double b1High = cb1 - (cb1 - b1);
		final double b1Low = b1 - b1High;
		final double prod1High = a1 * b1;
		final double prod1Low = (a1Low * b1Low) - (((prod1High - (a1High * b1High)) - (a1Low * b1High)) - (a1High * b1Low));
		final double ca2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a2;
		final double a2High = ca2 - (ca2 - a2);
		final double a2Low = a2 - a2High;
		final double cb2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b2;
		final double b2High = cb2 - (cb2 - b2);
		final double b2Low = b2 - b2High;
		final double prod2High = a2 * b2;
		final double prod2Low = (a2Low * b2Low) - (((prod2High - (a2High * b2High)) - (a2Low * b2High)) - (a2High * b2Low));
		final double s12High = prod1High + prod2High;
		final double s12Prime = s12High - prod2High;
		final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);
		double result = s12High + ((prod1Low + prod2Low) + s12Low);
		if (java.lang.Double.isNaN(result)) {
			result = (a1 * b1) + (a2 * b2);
		}
		return result;
	}

	public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3) {
		final double ca1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a1;
		final double a1High = ca1 - (ca1 - a1);
		final double a1Low = a1 - a1High;
		final double cb1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b1;
		final double b1High = cb1 - (cb1 - b1);
		final double b1Low = b1 - b1High;
		final double prod1High = a1 * b1;
		final double prod1Low = (a1Low * b1Low) - (((prod1High - (a1High * b1High)) - (a1Low * b1High)) - (a1High * b1Low));
		final double ca2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a2;
		final double a2High = ca2 - (ca2 - a2);
		final double a2Low = a2 - a2High;
		final double cb2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b2;
		final double b2High = cb2 - (cb2 - b2);
		final double b2Low = b2 - b2High;
		final double prod2High = a2 * b2;
		final double prod2Low = (a2Low * b2Low) - (((prod2High - (a2High * b2High)) - (a2Low * b2High)) - (a2High * b2Low));
		final double ca3 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a3;
		final double a3High = ca3 - (ca3 - a3);
		final double a3Low = a3 - a3High;
		final double cb3 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b3;
		final double b3High = cb3 - (cb3 - b3);
		final double b3Low = b3 - b3High;
		final double prod3High = a3 * b3;
		final double prod3Low = (a3Low * b3Low) - (((prod3High - (a3High * b3High)) - (a3Low * b3High)) - (a3High * b3Low));
		final double s12High = prod1High + prod2High;
		final double s12Prime = s12High - prod2High;
		final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);
		final double s123High = s12High + prod3High;
		final double s123Prime = s123High - prod3High;
		final double s123Low = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime);
		double result = s123High + ((((prod1Low + prod2Low) + prod3Low) + s12Low) + s123Low);
		if (java.lang.Double.isNaN(result)) {
			result = ((a1 * b1) + (a2 * b2)) + (a3 * b3);
		}
		return result;
	}

	public static double linearCombination(final double a1, final double b1, final double a2, final double b2, final double a3, final double b3, final double a4, final double b4) {
		final double ca1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a1;
		final double a1High = ca1 - (ca1 - a1);
		final double a1Low = a1 - a1High;
		final double cb1 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b1;
		final double b1High = cb1 - (cb1 - b1);
		final double b1Low = b1 - b1High;
		final double prod1High = a1 * b1;
		final double prod1Low = (a1Low * b1Low) - (((prod1High - (a1High * b1High)) - (a1Low * b1High)) - (a1High * b1Low));
		final double ca2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a2;
		final double a2High = ca2 - (ca2 - a2);
		final double a2Low = a2 - a2High;
		final double cb2 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b2;
		final double b2High = cb2 - (cb2 - b2);
		final double b2Low = b2 - b2High;
		final double prod2High = a2 * b2;
		final double prod2Low = (a2Low * b2Low) - (((prod2High - (a2High * b2High)) - (a2Low * b2High)) - (a2High * b2Low));
		final double ca3 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a3;
		final double a3High = ca3 - (ca3 - a3);
		final double a3Low = a3 - a3High;
		final double cb3 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b3;
		final double b3High = cb3 - (cb3 - b3);
		final double b3Low = b3 - b3High;
		final double prod3High = a3 * b3;
		final double prod3Low = (a3Low * b3Low) - (((prod3High - (a3High * b3High)) - (a3Low * b3High)) - (a3High * b3Low));
		final double ca4 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * a4;
		final double a4High = ca4 - (ca4 - a4);
		final double a4Low = a4 - a4High;
		final double cb4 = (org.apache.commons.math3.util.MathArrays.SPLIT_FACTOR) * b4;
		final double b4High = cb4 - (cb4 - b4);
		final double b4Low = b4 - b4High;
		final double prod4High = a4 * b4;
		final double prod4Low = (a4Low * b4Low) - (((prod4High - (a4High * b4High)) - (a4Low * b4High)) - (a4High * b4Low));
		final double s12High = prod1High + prod2High;
		final double s12Prime = s12High - prod2High;
		final double s12Low = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);
		final double s123High = s12High + prod3High;
		final double s123Prime = s123High - prod3High;
		final double s123Low = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime);
		final double s1234High = s123High + prod4High;
		final double s1234Prime = s1234High - prod4High;
		final double s1234Low = (prod4High - (s1234High - s1234Prime)) + (s123High - s1234Prime);
		double result = s1234High + ((((((prod1Low + prod2Low) + prod3Low) + prod4Low) + s12Low) + s123Low) + s1234Low);
		if (java.lang.Double.isNaN(result)) {
			result = (((a1 * b1) + (a2 * b2)) + (a3 * b3)) + (a4 * b4);
		}
		return result;
	}

	public static boolean equals(float[] x, float[] y) {
		if ((x == null) || (y == null)) {
			return !((x == null) ^ (y == null));
		}
		if ((x.length) != (y.length)) {
			return false;
		}
		for (int i = 0; i < (x.length); ++i) {
			if (!(org.apache.commons.math3.util.Precision.equals(x[i], y[i]))) {
				return false;
			}
		}
		return true;
	}

	public static boolean equalsIncludingNaN(float[] x, float[] y) {
		if ((x == null) || (y == null)) {
			return !((x == null) ^ (y == null));
		}
		if ((x.length) != (y.length)) {
			return false;
		}
		for (int i = 0; i < (x.length); ++i) {
			if (!(org.apache.commons.math3.util.Precision.equalsIncludingNaN(x[i], y[i]))) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(double[] x, double[] y) {
		if ((x == null) || (y == null)) {
			return !((x == null) ^ (y == null));
		}
		if ((x.length) != (y.length)) {
			return false;
		}
		for (int i = 0; i < (x.length); ++i) {
			if (!(org.apache.commons.math3.util.Precision.equals(x[i], y[i]))) {
				return false;
			}
		}
		return true;
	}

	public static boolean equalsIncludingNaN(double[] x, double[] y) {
		if ((x == null) || (y == null)) {
			return !((x == null) ^ (y == null));
		}
		if ((x.length) != (y.length)) {
			return false;
		}
		for (int i = 0; i < (x.length); ++i) {
			if (!(org.apache.commons.math3.util.Precision.equalsIncludingNaN(x[i], y[i]))) {
				return false;
			}
		}
		return true;
	}

	public static double[] normalizeArray(double[] values, double normalizedSum) throws org.apache.commons.math3.exception.MathArithmeticException, org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (java.lang.Double.isInfinite(normalizedSum)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_INFINITE);
		}
		if (java.lang.Double.isNaN(normalizedSum)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_NAN);
		}
		double sum = 0.0;
		final int len = values.length;
		double[] out = new double[len];
		for (int i = 0; i < len; i++) {
			if (java.lang.Double.isInfinite(values[i])) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT, values[i], i);
			}
			if (!(java.lang.Double.isNaN(values[i]))) {
				sum += values[i];
			}
		}
		if (sum == 0) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO);
		}
		for (int i = 0; i < len; i++) {
			if (java.lang.Double.isNaN(values[i])) {
				out[i] = java.lang.Double.NaN;
			}else {
				out[i] = ((values[i]) * normalizedSum) / sum;
			}
		}
		return out;
	}
}

