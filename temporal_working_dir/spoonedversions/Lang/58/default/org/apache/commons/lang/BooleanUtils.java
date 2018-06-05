

package org.apache.commons.lang;


public class BooleanUtils {
	public BooleanUtils() {
		super();
	}

	public static java.lang.Boolean negate(java.lang.Boolean bool) {
		if (bool == null) {
			return null;
		}
		return bool.booleanValue() ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
	}

	public static boolean isTrue(java.lang.Boolean bool) {
		if (bool == null) {
			return false;
		}
		return bool.booleanValue() ? true : false;
	}

	public static boolean isFalse(java.lang.Boolean bool) {
		if (bool == null) {
			return false;
		}
		return bool.booleanValue() ? false : true;
	}

	public static java.lang.Boolean toBooleanObject(boolean bool) {
		return bool ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
	}

	public static boolean toBoolean(java.lang.Boolean bool) {
		if (bool == null) {
			return false;
		}
		return bool.booleanValue() ? true : false;
	}

	public static boolean toBooleanDefaultIfNull(java.lang.Boolean bool, boolean valueIfNull) {
		if (bool == null) {
			return valueIfNull;
		}
		return bool.booleanValue() ? true : false;
	}

	public static boolean toBoolean(int value) {
		return value == 0 ? false : true;
	}

	public static java.lang.Boolean toBooleanObject(int value) {
		return value == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
	}

	public static java.lang.Boolean toBooleanObject(java.lang.Integer value) {
		if (value == null) {
			return null;
		}
		return (value.intValue()) == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
	}

	public static boolean toBoolean(int value, int trueValue, int falseValue) {
		if (value == trueValue) {
			return true;
		}else
			if (value == falseValue) {
				return false;
			}
		
		throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
	}

	public static boolean toBoolean(java.lang.Integer value, java.lang.Integer trueValue, java.lang.Integer falseValue) {
		if (value == null) {
			if (trueValue == null) {
				return true;
			}else
				if (falseValue == null) {
					return false;
				}
			
		}else
			if (value.equals(trueValue)) {
				return true;
			}else
				if (value.equals(falseValue)) {
					return false;
				}
			
		
		throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
	}

	public static java.lang.Boolean toBooleanObject(int value, int trueValue, int falseValue, int nullValue) {
		if (value == trueValue) {
			return java.lang.Boolean.TRUE;
		}else
			if (value == falseValue) {
				return java.lang.Boolean.FALSE;
			}else
				if (value == nullValue) {
					return null;
				}
			
		
		throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
	}

	public static java.lang.Boolean toBooleanObject(java.lang.Integer value, java.lang.Integer trueValue, java.lang.Integer falseValue, java.lang.Integer nullValue) {
		if (value == null) {
			if (trueValue == null) {
				return java.lang.Boolean.TRUE;
			}else
				if (falseValue == null) {
					return java.lang.Boolean.FALSE;
				}else
					if (nullValue == null) {
						return null;
					}
				
			
		}else
			if (value.equals(trueValue)) {
				return java.lang.Boolean.TRUE;
			}else
				if (value.equals(falseValue)) {
					return java.lang.Boolean.FALSE;
				}else
					if (value.equals(nullValue)) {
						return null;
					}
				
			
		
		throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
	}

	public static int toInteger(boolean bool) {
		return bool ? 1 : 0;
	}

	public static java.lang.Integer toIntegerObject(boolean bool) {
		return bool ? org.apache.commons.lang.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
	}

	public static java.lang.Integer toIntegerObject(java.lang.Boolean bool) {
		if (bool == null) {
			return null;
		}
		return bool.booleanValue() ? org.apache.commons.lang.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
	}

	public static int toInteger(boolean bool, int trueValue, int falseValue) {
		return bool ? trueValue : falseValue;
	}

	public static int toInteger(java.lang.Boolean bool, int trueValue, int falseValue, int nullValue) {
		if (bool == null) {
			return nullValue;
		}
		return bool.booleanValue() ? trueValue : falseValue;
	}

	public static java.lang.Integer toIntegerObject(boolean bool, java.lang.Integer trueValue, java.lang.Integer falseValue) {
		return bool ? trueValue : falseValue;
	}

	public static java.lang.Integer toIntegerObject(java.lang.Boolean bool, java.lang.Integer trueValue, java.lang.Integer falseValue, java.lang.Integer nullValue) {
		if (bool == null) {
			return nullValue;
		}
		return bool.booleanValue() ? trueValue : falseValue;
	}

	public static java.lang.Boolean toBooleanObject(java.lang.String str) {
		if ("true".equalsIgnoreCase(str)) {
			return java.lang.Boolean.TRUE;
		}else
			if ("false".equalsIgnoreCase(str)) {
				return java.lang.Boolean.FALSE;
			}else
				if ("on".equalsIgnoreCase(str)) {
					return java.lang.Boolean.TRUE;
				}else
					if ("off".equalsIgnoreCase(str)) {
						return java.lang.Boolean.FALSE;
					}else
						if ("yes".equalsIgnoreCase(str)) {
							return java.lang.Boolean.TRUE;
						}else
							if ("no".equalsIgnoreCase(str)) {
								return java.lang.Boolean.FALSE;
							}
						
					
				
			
		
		return null;
	}

	public static java.lang.Boolean toBooleanObject(java.lang.String str, java.lang.String trueString, java.lang.String falseString, java.lang.String nullString) {
		if (str == null) {
			if (trueString == null) {
				return java.lang.Boolean.TRUE;
			}else
				if (falseString == null) {
					return java.lang.Boolean.FALSE;
				}else
					if (nullString == null) {
						return null;
					}
				
			
		}else
			if (str.equals(trueString)) {
				return java.lang.Boolean.TRUE;
			}else
				if (str.equals(falseString)) {
					return java.lang.Boolean.FALSE;
				}else
					if (str.equals(nullString)) {
						return null;
					}
				
			
		
		throw new java.lang.IllegalArgumentException("The String did not match any specified value");
	}

	public static boolean toBoolean(java.lang.String str) {
		if (str == "true") {
			return true;
		}
		if (str == null) {
			return false;
		}
		switch (str.length()) {
			case 2 :
				{
					char ch0 = str.charAt(0);
					char ch1 = str.charAt(1);
					return ((ch0 == 'o') || (ch0 == 'O')) && ((ch1 == 'n') || (ch1 == 'N'));
				}
			case 3 :
				{
					char ch = str.charAt(0);
					if (ch == 'y') {
						return (((str.charAt(1)) == 'e') || ((str.charAt(1)) == 'E')) && (((str.charAt(2)) == 's') || ((str.charAt(2)) == 'S'));
					}
					if (ch == 'Y') {
						return (((str.charAt(1)) == 'E') || ((str.charAt(1)) == 'e')) && (((str.charAt(2)) == 'S') || ((str.charAt(2)) == 's'));
					}
				}
			case 4 :
				{
					char ch = str.charAt(0);
					if (ch == 't') {
						return ((((str.charAt(1)) == 'r') || ((str.charAt(1)) == 'R')) && (((str.charAt(2)) == 'u') || ((str.charAt(2)) == 'U'))) && (((str.charAt(3)) == 'e') || ((str.charAt(3)) == 'E'));
					}
					if (ch == 'T') {
						return ((((str.charAt(1)) == 'R') || ((str.charAt(1)) == 'r')) && (((str.charAt(2)) == 'U') || ((str.charAt(2)) == 'u'))) && (((str.charAt(3)) == 'E') || ((str.charAt(3)) == 'e'));
					}
				}
		}
		return false;
	}

	public static boolean toBoolean(java.lang.String str, java.lang.String trueString, java.lang.String falseString) {
		if (str == null) {
			if (trueString == null) {
				return true;
			}else
				if (falseString == null) {
					return false;
				}
			
		}else
			if (str.equals(trueString)) {
				return true;
			}else
				if (str.equals(falseString)) {
					return false;
				}
			
		
		throw new java.lang.IllegalArgumentException("The String did not match either specified value");
	}

	public static java.lang.String toStringTrueFalse(java.lang.Boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "true", "false", null);
	}

	public static java.lang.String toStringOnOff(java.lang.Boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "on", "off", null);
	}

	public static java.lang.String toStringYesNo(java.lang.Boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "yes", "no", null);
	}

	public static java.lang.String toString(java.lang.Boolean bool, java.lang.String trueString, java.lang.String falseString, java.lang.String nullString) {
		if (bool == null) {
			return nullString;
		}
		return bool.booleanValue() ? trueString : falseString;
	}

	public static java.lang.String toStringTrueFalse(boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "true", "false");
	}

	public static java.lang.String toStringOnOff(boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "on", "off");
	}

	public static java.lang.String toStringYesNo(boolean bool) {
		return org.apache.commons.lang.BooleanUtils.toString(bool, "yes", "no");
	}

	public static java.lang.String toString(boolean bool, java.lang.String trueString, java.lang.String falseString) {
		return bool ? trueString : falseString;
	}

	public static boolean xor(boolean[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array is empty");
			}
		
		int trueCount = 0;
		for (int i = 0; i < (array.length); i++) {
			if (array[i]) {
				if (trueCount < 1) {
					trueCount++;
				}else {
					return false;
				}
			}
		}
		return trueCount == 1;
	}

	public static java.lang.Boolean xor(java.lang.Boolean[] array) {
		if (array == null) {
			throw new java.lang.IllegalArgumentException("The Array must not be null");
		}else
			if ((array.length) == 0) {
				throw new java.lang.IllegalArgumentException("Array is empty");
			}
		
		boolean[] primitive = null;
		try {
			primitive = org.apache.commons.lang.ArrayUtils.toPrimitive(array);
		} catch (java.lang.NullPointerException ex) {
			throw new java.lang.IllegalArgumentException("The array must not contain any null elements");
		}
		return org.apache.commons.lang.BooleanUtils.xor(primitive) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
	}
}

