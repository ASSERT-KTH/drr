

package org.apache.commons.lang;


public final class NumberUtils {
	public NumberUtils() {
		super();
	}

	public static int stringToInt(java.lang.String str) {
		return org.apache.commons.lang.NumberUtils.stringToInt(str, 0);
	}

	public static int stringToInt(java.lang.String str, int defaultValue) {
		try {
			return java.lang.Integer.parseInt(str);
		} catch (java.lang.NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static java.lang.Number createNumber(java.lang.String val) throws java.lang.NumberFormatException {
		if (val == null) {
			return null;
		}
		if ((val.length()) == 0) {
			throw new java.lang.NumberFormatException("\"\" is not a valid number.");
		}
		if (val.startsWith("--")) {
			return null;
		}
		if ((val.startsWith("0x")) || (val.startsWith("-0x"))) {
			return org.apache.commons.lang.NumberUtils.createInteger(val);
		}
		char lastChar = val.charAt(((val.length()) - 1));
		java.lang.String mant;
		java.lang.String dec;
		java.lang.String exp;
		int decPos = val.indexOf('.');
		int expPos = ((val.indexOf('e')) + (val.indexOf('E'))) + 1;
		if (decPos > (-1)) {
			if (expPos > (-1)) {
				if (expPos < decPos) {
					throw new java.lang.NumberFormatException((val + " is not a valid number."));
				}
				dec = val.substring((decPos + 1), expPos);
			}else {
				dec = val.substring((decPos + 1));
			}
			mant = val.substring(0, decPos);
		}else {
			if (expPos > (-1)) {
				mant = val.substring(0, expPos);
			}else {
				mant = val;
			}
			dec = null;
		}
		if (!(java.lang.Character.isDigit(lastChar))) {
			if ((expPos > (-1)) && (expPos < ((val.length()) - 1))) {
				exp = val.substring((expPos + 1), ((val.length()) - 1));
			}else {
				exp = null;
			}
			java.lang.String numeric = val.substring(0, ((val.length()) - 1));
			boolean allZeros = (org.apache.commons.lang.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang.NumberUtils.isAllZeros(exp));
			switch (lastChar) {
				case 'l' :
				case 'L' :
					if ((((dec == null) && (exp == null)) && (org.apache.commons.lang.NumberUtils.isDigits(numeric.substring(1)))) && (((numeric.charAt(0)) == '-') || (java.lang.Character.isDigit(numeric.charAt(0))))) {
						try {
							return org.apache.commons.lang.NumberUtils.createLong(numeric);
						} catch (java.lang.NumberFormatException nfe) {
						}
						return org.apache.commons.lang.NumberUtils.createBigInteger(numeric);
					}
					throw new java.lang.NumberFormatException((val + " is not a valid number."));
				case 'f' :
				case 'F' :
					try {
						java.lang.Float f = org.apache.commons.lang.NumberUtils.createFloat(numeric);
						if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
							return f;
						}
					} catch (java.lang.NumberFormatException e) {
					}
				case 'd' :
				case 'D' :
					try {
						java.lang.Double d = org.apache.commons.lang.NumberUtils.createDouble(numeric);
						if (!((d.isInfinite()) || (((d.floatValue()) == 0.0) && (!allZeros)))) {
							return d;
						}
					} catch (java.lang.NumberFormatException nfe) {
					}
					try {
						return org.apache.commons.lang.NumberUtils.createBigDecimal(numeric);
					} catch (java.lang.NumberFormatException e) {
					}
				default :
					throw new java.lang.NumberFormatException((val + " is not a valid number."));
			}
		}else {
			if ((expPos > (-1)) && (expPos < ((val.length()) - 1))) {
				exp = val.substring((expPos + 1), val.length());
			}else {
				exp = null;
			}
			if ((dec == null) && (exp == null)) {
				try {
					return org.apache.commons.lang.NumberUtils.createInteger(val);
				} catch (java.lang.NumberFormatException nfe) {
				}
				try {
					return org.apache.commons.lang.NumberUtils.createLong(val);
				} catch (java.lang.NumberFormatException nfe) {
				}
				return org.apache.commons.lang.NumberUtils.createBigInteger(val);
			}else {
				boolean allZeros = (org.apache.commons.lang.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang.NumberUtils.isAllZeros(exp));
				try {
					java.lang.Float f = org.apache.commons.lang.NumberUtils.createFloat(val);
					if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
						return f;
					}
				} catch (java.lang.NumberFormatException nfe) {
				}
				try {
					java.lang.Double d = org.apache.commons.lang.NumberUtils.createDouble(val);
					if (!((d.isInfinite()) || (((d.doubleValue()) == 0.0) && (!allZeros)))) {
						return d;
					}
				} catch (java.lang.NumberFormatException nfe) {
				}
				return org.apache.commons.lang.NumberUtils.createBigDecimal(val);
			}
		}
	}

	private static boolean isAllZeros(java.lang.String s) {
		if (s == null) {
			return true;
		}
		for (int i = (s.length()) - 1; i >= 0; i--) {
			if ((s.charAt(i)) != '0') {
				return false;
			}
		}
		return (s.length()) > 0;
	}

	public static java.lang.Float createFloat(java.lang.String val) {
		return java.lang.Float.valueOf(val);
	}

	public static java.lang.Double createDouble(java.lang.String val) {
		return java.lang.Double.valueOf(val);
	}

	public static java.lang.Integer createInteger(java.lang.String val) {
		return java.lang.Integer.decode(val);
	}

	public static java.lang.Long createLong(java.lang.String val) {
		return java.lang.Long.valueOf(val);
	}

	public static java.math.BigInteger createBigInteger(java.lang.String val) {
		java.math.BigInteger bi = new java.math.BigInteger(val);
		return bi;
	}

	public static java.math.BigDecimal createBigDecimal(java.lang.String val) {
		java.math.BigDecimal bd = new java.math.BigDecimal(val);
		return bd;
	}

	public static long minimum(long a, long b, long c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static int minimum(int a, int b, int c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static long maximum(long a, long b, long c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static int maximum(int a, int b, int c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
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
		if ((str == null) || ((str.length()) == 0)) {
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

