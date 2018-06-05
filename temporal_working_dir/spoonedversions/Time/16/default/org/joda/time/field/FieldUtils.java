

package org.joda.time.field;


public class FieldUtils {
	private FieldUtils() {
		super();
	}

	public static int safeNegate(int value) {
		if (value == (java.lang.Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException("Integer.MIN_VALUE cannot be negated");
		}
		return -value;
	}

	public static int safeAdd(int val1, int val2) {
		int sum = val1 + val2;
		if (((val1 ^ sum) < 0) && ((val1 ^ val2) >= 0)) {
			throw new java.lang.ArithmeticException(((("The calculation caused an overflow: " + val1) + " + ") + val2));
		}
		return sum;
	}

	public static long safeAdd(long val1, long val2) {
		long sum = val1 + val2;
		if (((val1 ^ sum) < 0) && ((val1 ^ val2) >= 0)) {
			throw new java.lang.ArithmeticException(((("The calculation caused an overflow: " + val1) + " + ") + val2));
		}
		return sum;
	}

	public static long safeSubtract(long val1, long val2) {
		long diff = val1 - val2;
		if (((val1 ^ diff) < 0) && ((val1 ^ val2) < 0)) {
			throw new java.lang.ArithmeticException(((("The calculation caused an overflow: " + val1) + " - ") + val2));
		}
		return diff;
	}

	public static int safeMultiply(int val1, int val2) {
		long total = ((long) (val1)) * ((long) (val2));
		if ((total < (java.lang.Integer.MIN_VALUE)) || (total > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException(((("The calculation caused an overflow: " + val1) + " * ") + val2));
		}
		return ((int) (total));
	}

	public static long safeMultiply(long val1, int scalar) {
		switch (scalar) {
			case -1 :
				return -val1;
			case 0 :
				return 0L;
			case 1 :
				return val1;
		}
		long total = val1 * scalar;
		if ((total / scalar) != val1) {
			throw new java.lang.ArithmeticException(((("The calculation caused an overflow: " + val1) + " * ") + scalar));
		}
		return total;
	}

	public static long safeMultiply(long val1, long val2) {
		if (val2 == 1) {
			return val1;
		}
		if (val1 == 1) {
			return val2;
		}
		if ((val1 == 0) || (val2 == 0)) {
			return 0;
		}
		long total = val1 * val2;
		if ((((total / val2) != val1) || ((val1 == (java.lang.Long.MIN_VALUE)) && (val2 == (-1)))) || ((val2 == (java.lang.Long.MIN_VALUE)) && (val1 == (-1)))) {
			throw new java.lang.ArithmeticException(((("Multiplication overflows a long: " + val1) + " * ") + val2));
		}
		return total;
	}

	public static int safeToInt(long value) {
		if (((java.lang.Integer.MIN_VALUE) <= value) && (value <= (java.lang.Integer.MAX_VALUE))) {
			return ((int) (value));
		}
		throw new java.lang.ArithmeticException(("Value cannot fit in an int: " + value));
	}

	public static int safeMultiplyToInt(long val1, long val2) {
		long val = org.joda.time.field.FieldUtils.safeMultiply(val1, val2);
		return org.joda.time.field.FieldUtils.safeToInt(val);
	}

	public static void verifyValueBounds(org.joda.time.DateTimeField field, int value, int lowerBound, int upperBound) {
		if ((value < lowerBound) || (value > upperBound)) {
			throw new org.joda.time.IllegalFieldValueException(field.getType(), java.lang.Integer.valueOf(value), java.lang.Integer.valueOf(lowerBound), java.lang.Integer.valueOf(upperBound));
		}
	}

	public static void verifyValueBounds(org.joda.time.DateTimeFieldType fieldType, int value, int lowerBound, int upperBound) {
		if ((value < lowerBound) || (value > upperBound)) {
			throw new org.joda.time.IllegalFieldValueException(fieldType, java.lang.Integer.valueOf(value), java.lang.Integer.valueOf(lowerBound), java.lang.Integer.valueOf(upperBound));
		}
	}

	public static void verifyValueBounds(java.lang.String fieldName, int value, int lowerBound, int upperBound) {
		if ((value < lowerBound) || (value > upperBound)) {
			throw new org.joda.time.IllegalFieldValueException(fieldName, java.lang.Integer.valueOf(value), java.lang.Integer.valueOf(lowerBound), java.lang.Integer.valueOf(upperBound));
		}
	}

	public static int getWrappedValue(int currentValue, int wrapValue, int minValue, int maxValue) {
		return org.joda.time.field.FieldUtils.getWrappedValue((currentValue + wrapValue), minValue, maxValue);
	}

	public static int getWrappedValue(int value, int minValue, int maxValue) {
		if (minValue >= maxValue) {
			throw new java.lang.IllegalArgumentException("MIN > MAX");
		}
		int wrapRange = (maxValue - minValue) + 1;
		value -= minValue;
		if (value >= 0) {
			return (value % wrapRange) + minValue;
		}
		int remByRange = (-value) % wrapRange;
		if (remByRange == 0) {
			return 0 + minValue;
		}
		return (wrapRange - remByRange) + minValue;
	}

	public static boolean equals(java.lang.Object object1, java.lang.Object object2) {
		if (object1 == object2) {
			return true;
		}
		if ((object1 == null) || (object2 == null)) {
			return false;
		}
		return object1.equals(object2);
	}
}

