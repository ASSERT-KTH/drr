

package org.apache.commons.lang.math;


public class IEEE754rUtils {
	public static double min(double[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		double min = array[0];
		for (int i = 1; i < (array.length); i++) {
			min = org.apache.commons.lang.math.IEEE754rUtils.min(array[i], min);
		}
		return min;
	}

	public static float min(float[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		float min = array[0];
		for (int i = 1; i < (array.length); i++) {
			min = org.apache.commons.lang.math.IEEE754rUtils.min(array[i], min);
		}
		return min;
	}

	public static double min(double a, double b, double c) {
		return org.apache.commons.lang.math.IEEE754rUtils.min(org.apache.commons.lang.math.IEEE754rUtils.min(a, b), c);
	}

	public static double min(double a, double b) {
		if (java.lang.Double.isNaN(a)) {
			return b;
		}else
			if (java.lang.Double.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.min(a, b);
			}
		
	}

	public static float min(float a, float b, float c) {
		return org.apache.commons.lang.math.IEEE754rUtils.min(org.apache.commons.lang.math.IEEE754rUtils.min(a, b), c);
	}

	public static float min(float a, float b) {
		if (java.lang.Float.isNaN(a)) {
			return b;
		}else
			if (java.lang.Float.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.min(a, b);
			}
		
	}

	public static double max(double[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		double max = array[0];
		for (int j = 1; j < (array.length); j++) {
			max = org.apache.commons.lang.math.IEEE754rUtils.max(array[j], max);
		}
		return max;
	}

	public static float max(float[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		float max = array[0];
		for (int j = 1; j < (array.length); j++) {
			max = org.apache.commons.lang.math.IEEE754rUtils.max(array[j], max);
		}
		return max;
	}

	public static double max(double a, double b, double c) {
		return org.apache.commons.lang.math.IEEE754rUtils.max(org.apache.commons.lang.math.IEEE754rUtils.max(a, b), c);
	}

	public static double max(double a, double b) {
		if (java.lang.Double.isNaN(a)) {
			return b;
		}else
			if (java.lang.Double.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.max(a, b);
			}
		
	}

	public static float max(float a, float b, float c) {
		return org.apache.commons.lang.math.IEEE754rUtils.max(org.apache.commons.lang.math.IEEE754rUtils.max(a, b), c);
	}

	public static float max(float a, float b) {
		if (java.lang.Float.isNaN(a)) {
			return b;
		}else
			if (java.lang.Float.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.max(a, b);
			}
		
	}
}

