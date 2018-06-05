

package org.apache.commons.lang.math;


public class NumberUtils {
	public static final java.lang.Long LONG_ZERO = new java.lang.Long(0L);

	public static final java.lang.Long LONG_ONE = new java.lang.Long(1L);

	public static final java.lang.Long LONG_MINUS_ONE = new java.lang.Long((-1L));

	public static final java.lang.Integer INTEGER_ZERO = new java.lang.Integer(0);

	public static final java.lang.Integer INTEGER_ONE = new java.lang.Integer(1);

	public static final java.lang.Integer INTEGER_MINUS_ONE = new java.lang.Integer((-1));

	public static final java.lang.Short SHORT_ZERO = new java.lang.Short(((short) (0)));

	public static final java.lang.Short SHORT_ONE = new java.lang.Short(((short) (1)));

	public static final java.lang.Short SHORT_MINUS_ONE = new java.lang.Short(((short) (-1)));

	public static final java.lang.Byte BYTE_ZERO = new java.lang.Byte(((byte) (0)));

	public static final java.lang.Byte BYTE_ONE = new java.lang.Byte(((byte) (1)));

	public static final java.lang.Byte BYTE_MINUS_ONE = new java.lang.Byte(((byte) (-1)));

	public static final java.lang.Double DOUBLE_ZERO = new java.lang.Double(0.0);

	public static final java.lang.Double DOUBLE_ONE = new java.lang.Double(1.0);

	public static final java.lang.Double DOUBLE_MINUS_ONE = new java.lang.Double((-1.0));

	public static final java.lang.Float FLOAT_ZERO = new java.lang.Float(0.0F);

	public static final java.lang.Float FLOAT_ONE = new java.lang.Float(1.0F);

	public static final java.lang.Float FLOAT_MINUS_ONE = new java.lang.Float((-1.0F));

	public NumberUtils() {
		super();
	}

	public static int stringToInt(java.lang.String str) {
		return org.apache.commons.lang.math.NumberUtils.toInt(str);
	}

	public static int toInt(java.lang.String str) {
		return org.apache.commons.lang.math.NumberUtils.toInt(str, 0);
	}

	public static int stringToInt(java.lang.String str, int defaultValue) {
		return org.apache.commons.lang.math.NumberUtils.toInt(str, defaultValue);
	}

	public static int toInt(java.lang.String str, int defaultValue) {
		if (str == null) {
			return defaultValue;
		}
		try {
			return java.lang.Integer.parseInt(str);
		} catch (java.lang.NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static long toLong(java.lang.String str) {
		return org.apache.commons.lang.math.NumberUtils.toLong(str, 0L);
	}

	public static long toLong(java.lang.String str, long defaultValue) {
		if (str == null) {
			return defaultValue;
		}
		try {
			return java.lang.Long.parseLong(str);
		} catch (java.lang.NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static float toFloat(java.lang.String str) {
		return org.apache.commons.lang.math.NumberUtils.toFloat(str, 0.0F);
	}

	public static float toFloat(java.lang.String str, float defaultValue) {
		if (str == null) {
			return defaultValue;
		}
		try {
			return java.lang.Float.parseFloat(str);
		} catch (java.lang.NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static double toDouble(java.lang.String str) {
		return org.apache.commons.lang.math.NumberUtils.toDouble(str, 0.0);
	}

	public static double toDouble(java.lang.String str, double defaultValue) {
		if (str == null) {
			return defaultValue;
		}
		try {
			return java.lang.Double.parseDouble(str);
		} catch (java.lang.NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static java.lang.Number createNumber(java.lang.String str) throws java.lang.NumberFormatException {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang.StringUtils.isBlank(str)) {
			throw new java.lang.NumberFormatException("A blank string is not a valid number");
		}
		if (str.startsWith("--")) {
			return null;
		}
		if ((str.startsWith("0x")) || (str.startsWith("-0x"))) {
			return org.apache.commons.lang.math.NumberUtils.createInteger(str);
		}
		char lastChar = str.charAt(((str.length()) - 1));
		java.lang.String mant;
		java.lang.String dec;
		java.lang.String exp;
		int decPos = str.indexOf('.');
		int expPos = ((str.indexOf('e')) + (str.indexOf('E'))) + 1;
		if (decPos > (-1)) {
			if (expPos > (-1)) {
				if (expPos < decPos) {
					throw new java.lang.NumberFormatException((str + " is not a valid number."));
				}
				dec = str.substring((decPos + 1), expPos);
			}else {
				dec = str.substring((decPos + 1));
			}
			mant = str.substring(0, decPos);
		}else {
			if (expPos > (-1)) {
				mant = str.substring(0, expPos);
			}else {
				mant = str;
			}
			dec = null;
		}
		if (!(java.lang.Character.isDigit(lastChar))) {
			if ((expPos > (-1)) && (expPos < ((str.length()) - 1))) {
				exp = str.substring((expPos + 1), ((str.length()) - 1));
			}else {
				exp = null;
			}
			java.lang.String numeric = str.substring(0, ((str.length()) - 1));
			boolean allZeros = (org.apache.commons.lang.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang.math.NumberUtils.isAllZeros(exp));
			switch (lastChar) {
				case 'l' :
				case 'L' :
					if (((dec == null) && (exp == null)) && ((((numeric.charAt(0)) == '-') && (org.apache.commons.lang.math.NumberUtils.isDigits(numeric.substring(1)))) || (org.apache.commons.lang.math.NumberUtils.isDigits(numeric)))) {
						try {
							return org.apache.commons.lang.math.NumberUtils.createLong(numeric);
						} catch (java.lang.NumberFormatException nfe) {
						}
						return org.apache.commons.lang.math.NumberUtils.createBigInteger(numeric);
					}
					throw new java.lang.NumberFormatException((str + " is not a valid number."));
				case 'f' :
				case 'F' :
					try {
						java.lang.Float f = org.apache.commons.lang.math.NumberUtils.createFloat(numeric);
						if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
							return f;
						}
					} catch (java.lang.NumberFormatException nfe) {
					}
				case 'd' :
				case 'D' :
					try {
						java.lang.Double d = org.apache.commons.lang.math.NumberUtils.createDouble(numeric);
						if (!((d.isInfinite()) || (((d.floatValue()) == 0.0) && (!allZeros)))) {
							return d;
						}
					} catch (java.lang.NumberFormatException nfe) {
					}
					try {
						return org.apache.commons.lang.math.NumberUtils.createBigDecimal(numeric);
					} catch (java.lang.NumberFormatException e) {
					}
				default :
					throw new java.lang.NumberFormatException((str + " is not a valid number."));
			}
		}else {
			if ((expPos > (-1)) && (expPos < ((str.length()) - 1))) {
				exp = str.substring((expPos + 1), str.length());
			}else {
				exp = null;
			}
			if ((dec == null) && (exp == null)) {
				try {
					return org.apache.commons.lang.math.NumberUtils.createInteger(str);
				} catch (java.lang.NumberFormatException nfe) {
				}
				try {
					return org.apache.commons.lang.math.NumberUtils.createLong(str);
				} catch (java.lang.NumberFormatException nfe) {
				}
				return org.apache.commons.lang.math.NumberUtils.createBigInteger(str);
			}else {
				boolean allZeros = (org.apache.commons.lang.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang.math.NumberUtils.isAllZeros(exp));
				try {
					java.lang.Float f = org.apache.commons.lang.math.NumberUtils.createFloat(str);
					if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
						return f;
					}
				} catch (java.lang.NumberFormatException nfe) {
				}
				try {
					java.lang.Double d = org.apache.commons.lang.math.NumberUtils.createDouble(str);
					if (!((d.isInfinite()) || (((d.doubleValue()) == 0.0) && (!allZeros)))) {
						return d;
					}
				} catch (java.lang.NumberFormatException nfe) {
				}
				return org.apache.commons.lang.math.NumberUtils.createBigDecimal(str);
			}
		}
	}

	private static boolean isAllZeros(java.lang.String str) {
		if (str == null) {
			return true;
		}
		for (int i = (str.length()) - 1; i >= 0; i--) {
			if ((str.charAt(i)) != '0') {
				return false;
			}
		}
		return (str.length()) > 0;
	}

	public static java.lang.Float createFloat(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return java.lang.Float.valueOf(str);
	}

	public static java.lang.Double createDouble(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return java.lang.Double.valueOf(str);
	}

	public static java.lang.Integer createInteger(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return java.lang.Integer.decode(str);
	}

	public static java.lang.Long createLong(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return java.lang.Long.valueOf(str);
	}

	public static java.math.BigInteger createBigInteger(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return new java.math.BigInteger(str);
	}

	public static java.math.BigDecimal createBigDecimal(java.lang.String str) {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang.StringUtils.isBlank(str)) {
			throw new java.lang.NumberFormatException("A blank string is not a valid number");
		}
		return new java.math.BigDecimal(str);
	}

	public static boolean equals(byte[] array1, byte[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((array1[i]) != (array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(short[] array1, short[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((array1[i]) != (array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(int[] array1, int[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((array1[i]) != (array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(long[] array1, long[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((array1[i]) != (array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(float[] array1, float[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((org.apache.commons.lang.math.NumberUtils.compare(array1[i], array2[i])) != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean equals(double[] array1, double[] array2) {
		if (array1 == array2) {
			return true;
		}
		if ((array1 == null) || (array2 == null)) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if ((org.apache.commons.lang.math.NumberUtils.compare(array1[i], array2[i])) != 0) {
				return false;
			}
		}
		return true;
	}

	public static long min(long[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		long min = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int min(int[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		int min = array[0];
		for (int j = 1; j < (array.length); j++) {
			if ((array[j]) < min) {
				min = array[j];
			}
		}
		return min;
	}

	public static short min(short[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		short min = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static byte min(byte[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		byte min = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double min(double[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		double min = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) < min) {
				min = array[i];
			}
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
			if ((array[i]) < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static long max(long[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		long max = array[0];
		for (int j = 1; j < (array.length); j++) {
			if ((array[j]) > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static int max(int[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		int max = array[0];
		for (int j = 1; j < (array.length); j++) {
			if ((array[j]) > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static short max(short[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		short max = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static byte max(byte[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array cannot be empty.");
			}
		
		byte max = array[0];
		for (int i = 1; i < (array.length); i++) {
			if ((array[i]) > max) {
				max = array[i];
			}
		}
		return max;
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
			if ((array[j]) > max) {
				max = array[j];
			}
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
			if ((array[j]) > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static long min(long a, long b, long c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static int min(int a, int b, int c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static short min(short a, short b, short c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static byte min(byte a, byte b, byte c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static double min(double a, double b, double c) {
		return java.lang.Math.min(java.lang.Math.min(a, b), c);
	}

	public static float min(float a, float b, float c) {
		return java.lang.Math.min(java.lang.Math.min(a, b), c);
	}

	public static long max(long a, long b, long c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static int max(int a, int b, int c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static short max(short a, short b, short c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static byte max(byte a, byte b, byte c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static double max(double a, double b, double c) {
		return java.lang.Math.max(java.lang.Math.max(a, b), c);
	}

	public static float max(float a, float b, float c) {
		return java.lang.Math.max(java.lang.Math.max(a, b), c);
	}

	public static int compare(double lhs, double rhs) {
		if (lhs < rhs) {
			return -1;
		}
		if (lhs > rhs) {
			return +1;
		}
		long lhsBits = java.lang.Double.doubleToLongBits(lhs);
		long rhsBits = java.lang.Double.doubleToLongBits(rhs);
		if (lhsBits == rhsBits) {
			return 0;
		}
		if (lhsBits < rhsBits) {
			return -1;
		}else {
			return +1;
		}
	}

	public static int compare(float lhs, float rhs) {
		if (lhs < rhs) {
			return -1;
		}
		if (lhs > rhs) {
			return +1;
		}
		int lhsBits = java.lang.Float.floatToIntBits(lhs);
		int rhsBits = java.lang.Float.floatToIntBits(rhs);
		if (lhsBits == rhsBits) {
			return 0;
		}
		if (lhsBits < rhsBits) {
			return -1;
		}else {
			return +1;
		}
	}

	public static boolean isDigits(java.lang.String str) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return false;
		}
		for (int i = 0; i < (str.length()); i++) {
			if (!(java.lang.Character.isDigit(str.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumber(java.lang.String str) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return false;
		}
		char[] chars = str.toCharArray();
		int sz = chars.length;
		boolean hasExp = false;
		boolean hasDecPoint = false;
		boolean allowSigns = false;
		boolean foundDigit = false;
		int start = (chars[0]) == '-' ? 1 : 0;
		if (sz > (start + 1)) {
			if (((chars[start]) == '0') && ((chars[(start + 1)]) == 'x')) {
				int i = start + 2;
				if (i == sz) {
					return false;
				}
				for (; i < (chars.length); i++) {
					if (((((chars[i]) < '0') || ((chars[i]) > '9')) && (((chars[i]) < 'a') || ((chars[i]) > 'f'))) && (((chars[i]) < 'A') || ((chars[i]) > 'F'))) {
						return false;
					}
				}
				return true;
			}
		}
		sz--;
		int i = start;
		while ((i < sz) || (((i < (sz + 1)) && allowSigns) && (!foundDigit))) {
			if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
				foundDigit = true;
				allowSigns = false;
			}else
				if ((chars[i]) == '.') {
					if (hasDecPoint || hasExp) {
						return false;
					}
					hasDecPoint = true;
				}else
					if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
						if (hasExp) {
							return false;
						}
						if (!foundDigit) {
							return false;
						}
						hasExp = true;
						allowSigns = true;
					}else
						if (((chars[i]) == '+') || ((chars[i]) == '-')) {
							if (!allowSigns) {
								return false;
							}
							allowSigns = false;
							foundDigit = false;
						}else {
							return false;
						}
					
				
			
			i++;
		} 
		if (i < (chars.length)) {
			if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
				return true;
			}
			if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
				return false;
			}
			if ((!allowSigns) && (((((chars[i]) == 'd') || ((chars[i]) == 'D')) || ((chars[i]) == 'f')) || ((chars[i]) == 'F'))) {
				return foundDigit;
			}
			if (((chars[i]) == 'l') || ((chars[i]) == 'L')) {
				return foundDigit && (!hasExp);
			}
			return false;
		}
		return (!allowSigns) && foundDigit;
	}
}

