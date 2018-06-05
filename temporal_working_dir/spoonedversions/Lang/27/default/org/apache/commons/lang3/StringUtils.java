

package org.apache.commons.lang3;


public class StringUtils {
	public static final java.lang.String EMPTY = "";

	public static final int INDEX_NOT_FOUND = -1;

	private static final int PAD_LIMIT = 8192;

	public StringUtils() {
		super();
	}

	public static boolean isEmpty(java.lang.CharSequence cs) {
		return (cs == null) || ((cs.length()) == 0);
	}

	public static boolean isNotEmpty(java.lang.CharSequence cs) {
		return !(org.apache.commons.lang3.StringUtils.isEmpty(cs));
	}

	public static boolean isBlank(java.lang.CharSequence cs) {
		int strLen;
		if ((cs == null) || ((strLen = cs.length()) == 0)) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((java.lang.Character.isWhitespace(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(java.lang.CharSequence cs) {
		return !(org.apache.commons.lang3.StringUtils.isBlank(cs));
	}

	public static java.lang.String trim(java.lang.String str) {
		return str == null ? null : str.trim();
	}

	public static java.lang.String trimToNull(java.lang.String str) {
		java.lang.String ts = org.apache.commons.lang3.StringUtils.trim(str);
		return org.apache.commons.lang3.StringUtils.isEmpty(ts) ? null : ts;
	}

	public static java.lang.String trimToEmpty(java.lang.String str) {
		return str == null ? org.apache.commons.lang3.StringUtils.EMPTY : str.trim();
	}

	public static java.lang.String strip(java.lang.String str) {
		return org.apache.commons.lang3.StringUtils.strip(str, null);
	}

	public static java.lang.String stripToNull(java.lang.String str) {
		if (str == null) {
			return null;
		}
		str = org.apache.commons.lang3.StringUtils.strip(str, null);
		return (str.length()) == 0 ? null : str;
	}

	public static java.lang.String stripToEmpty(java.lang.String str) {
		return str == null ? org.apache.commons.lang3.StringUtils.EMPTY : org.apache.commons.lang3.StringUtils.strip(str, null);
	}

	public static java.lang.String strip(java.lang.String str, java.lang.String stripChars) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return str;
		}
		str = org.apache.commons.lang3.StringUtils.stripStart(str, stripChars);
		return org.apache.commons.lang3.StringUtils.stripEnd(str, stripChars);
	}

	public static java.lang.String stripStart(java.lang.String str, java.lang.String stripChars) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		int start = 0;
		if (stripChars == null) {
			while ((start != strLen) && (java.lang.Character.isWhitespace(str.charAt(start)))) {
				start++;
			} 
		}else
			if ((stripChars.length()) == 0) {
				return str;
			}else {
				while ((start != strLen) && ((stripChars.indexOf(str.charAt(start))) != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND))) {
					start++;
				} 
			}
		
		return str.substring(start);
	}

	public static java.lang.String stripEnd(java.lang.String str, java.lang.String stripChars) {
		int end;
		if ((str == null) || ((end = str.length()) == 0)) {
			return str;
		}
		if (stripChars == null) {
			while ((end != 0) && (java.lang.Character.isWhitespace(str.charAt((end - 1))))) {
				end--;
			} 
		}else
			if ((stripChars.length()) == 0) {
				return str;
			}else {
				while ((end != 0) && ((stripChars.indexOf(str.charAt((end - 1)))) != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND))) {
					end--;
				} 
			}
		
		return str.substring(0, end);
	}

	public static java.lang.String[] stripAll(java.lang.String[] strs) {
		return org.apache.commons.lang3.StringUtils.stripAll(strs, null);
	}

	public static java.lang.String[] stripAll(java.lang.String[] strs, java.lang.String stripChars) {
		int strsLen;
		if ((strs == null) || ((strsLen = strs.length) == 0)) {
			return strs;
		}
		java.lang.String[] newArr = new java.lang.String[strsLen];
		for (int i = 0; i < strsLen; i++) {
			newArr[i] = org.apache.commons.lang3.StringUtils.strip(strs[i], stripChars);
		}
		return newArr;
	}

	public static java.lang.String stripAccents(java.lang.String input) {
		if (input == null) {
			return null;
		}
		if (org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(1.6F)) {
			try {
				java.lang.Class<?> normalizerFormClass = org.apache.commons.lang3.ClassUtils.getClass("java.text.Normalizer$Form", false);
				java.lang.Class<?> normalizerClass = org.apache.commons.lang3.ClassUtils.getClass("java.text.Normalizer", false);
				java.lang.reflect.Method method = normalizerClass.getMethod("normalize", java.lang.CharSequence.class, normalizerFormClass);
				java.lang.reflect.Field nfd = normalizerFormClass.getField("NFD");
				java.lang.String decomposed = ((java.lang.String) (method.invoke(null, input, nfd.get(null))));
				java.util.regex.Pattern accentPattern = java.util.regex.Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
				return accentPattern.matcher(decomposed).replaceAll("");
			} catch (java.lang.ClassNotFoundException cnfe) {
				throw new java.lang.RuntimeException("ClassNotFoundException occurred during 1.6 backcompat code", cnfe);
			} catch (java.lang.NoSuchMethodException nsme) {
				throw new java.lang.RuntimeException("NoSuchMethodException occurred during 1.6 backcompat code", nsme);
			} catch (java.lang.NoSuchFieldException nsfe) {
				throw new java.lang.RuntimeException("NoSuchFieldException occurred during 1.6 backcompat code", nsfe);
			} catch (java.lang.IllegalAccessException iae) {
				throw new java.lang.RuntimeException("IllegalAccessException occurred during 1.6 backcompat code", iae);
			} catch (java.lang.IllegalArgumentException iae) {
				throw new java.lang.RuntimeException("IllegalArgumentException occurred during 1.6 backcompat code", iae);
			} catch (java.lang.reflect.InvocationTargetException ite) {
				throw new java.lang.RuntimeException("InvocationTargetException occurred during 1.6 backcompat code", ite);
			} catch (java.lang.SecurityException se) {
				throw new java.lang.RuntimeException("SecurityException occurred during 1.6 backcompat code", se);
			}
		}else {
			throw new java.lang.UnsupportedOperationException("The stripAccents(String) method is not supported until Java 1.6");
		}
	}

	public static boolean equals(java.lang.CharSequence cs1, java.lang.CharSequence cs2) {
		return cs1 == null ? cs2 == null : cs1.equals(cs2);
	}

	public static boolean equalsIgnoreCase(java.lang.String str1, java.lang.String str2) {
		return str1 == null ? str2 == null : str1.equalsIgnoreCase(str2);
	}

	public static int indexOf(java.lang.String str, int searchChar) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.indexOf(searchChar);
	}

	public static int indexOf(java.lang.String str, int searchChar, int startPos) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.indexOf(searchChar, startPos);
	}

	public static int indexOf(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.indexOf(searchStr);
	}

	public static int indexOf(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.indexOf(searchStr, startPos);
	}

	public static int ordinalIndexOf(java.lang.String str, java.lang.String searchStr, int ordinal) {
		return org.apache.commons.lang3.StringUtils.ordinalIndexOf(str, searchStr, ordinal, false);
	}

	private static int ordinalIndexOf(java.lang.String str, java.lang.String searchStr, int ordinal, boolean lastIndex) {
		if (((str == null) || (searchStr == null)) || (ordinal <= 0)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if ((searchStr.length()) == 0) {
			return lastIndex ? str.length() : 0;
		}
		int found = 0;
		int index = lastIndex ? str.length() : org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		do {
			if (lastIndex) {
				index = str.lastIndexOf(searchStr, (index - 1));
			}else {
				index = str.indexOf(searchStr, (index + 1));
			}
			if (index < 0) {
				return index;
			}
			found++;
		} while (found < ordinal );
		return index;
	}

	public static int indexOfIgnoreCase(java.lang.String str, java.lang.String searchStr) {
		return org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(str, searchStr, 0);
	}

	public static int indexOfIgnoreCase(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if (startPos < 0) {
			startPos = 0;
		}
		int endLimit = ((str.length()) - (searchStr.length())) + 1;
		if (startPos > endLimit) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if ((searchStr.length()) == 0) {
			return startPos;
		}
		for (int i = startPos; i < endLimit; i++) {
			if (str.regionMatches(true, i, searchStr, 0, searchStr.length())) {
				return i;
			}
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static int lastIndexOf(java.lang.String str, int searchChar) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.lastIndexOf(searchChar);
	}

	public static int lastIndexOf(java.lang.String str, int searchChar, int startPos) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.lastIndexOf(searchChar, startPos);
	}

	public static int lastIndexOf(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.lastIndexOf(searchStr);
	}

	public static int lastOrdinalIndexOf(java.lang.String str, java.lang.String searchStr, int ordinal) {
		return org.apache.commons.lang3.StringUtils.ordinalIndexOf(str, searchStr, ordinal, true);
	}

	public static int lastIndexOf(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return str.lastIndexOf(searchStr, startPos);
	}

	public static int lastIndexOfIgnoreCase(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(str, searchStr, str.length());
	}

	public static int lastIndexOfIgnoreCase(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if (startPos > ((str.length()) - (searchStr.length()))) {
			startPos = (str.length()) - (searchStr.length());
		}
		if (startPos < 0) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if ((searchStr.length()) == 0) {
			return startPos;
		}
		for (int i = startPos; i >= 0; i--) {
			if (str.regionMatches(true, i, searchStr, 0, searchStr.length())) {
				return i;
			}
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static boolean contains(java.lang.String str, int searchChar) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return false;
		}
		return (str.indexOf(searchChar)) >= 0;
	}

	public static boolean contains(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return false;
		}
		return (str.indexOf(searchStr)) >= 0;
	}

	public static boolean containsIgnoreCase(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return false;
		}
		int len = searchStr.length();
		int max = (str.length()) - len;
		for (int i = 0; i <= max; i++) {
			if (str.regionMatches(true, i, searchStr, 0, len)) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsWhitespace(java.lang.String str) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return false;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (java.lang.Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static int indexOfAny(java.lang.CharSequence cs, char[] searchChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		int csLen = cs.length();
		int csLast = csLen - 1;
		int searchLen = searchChars.length;
		int searchLast = searchLen - 1;
		for (int i = 0; i < csLen; i++) {
			char ch = cs.charAt(i);
			for (int j = 0; j < searchLen; j++) {
				if ((searchChars[j]) == ch) {
					if (((i < csLast) && (j < searchLast)) && (java.lang.Character.isHighSurrogate(ch))) {
						if ((searchChars[(j + 1)]) == (cs.charAt((i + 1)))) {
							return i;
						}
					}else {
						return i;
					}
				}
			}
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static int indexOfAny(java.lang.CharSequence cs, java.lang.String searchChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		return org.apache.commons.lang3.StringUtils.indexOfAny(cs, searchChars.toCharArray());
	}

	public static boolean containsAny(java.lang.String cs, char[] searchChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
			return false;
		}
		int csLength = cs.length();
		int searchLength = searchChars.length;
		int csLast = csLength - 1;
		int searchLast = searchLength - 1;
		for (int i = 0; i < csLength; i++) {
			char ch = cs.charAt(i);
			for (int j = 0; j < searchLength; j++) {
				if ((searchChars[j]) == ch) {
					if (java.lang.Character.isHighSurrogate(ch)) {
						if (j == searchLast) {
							return true;
						}
						if ((i < csLast) && ((searchChars[(j + 1)]) == (cs.charAt((i + 1))))) {
							return true;
						}
					}else {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean containsAny(java.lang.String cs, java.lang.String searchChars) {
		if (searchChars == null) {
			return false;
		}
		return org.apache.commons.lang3.StringUtils.containsAny(cs, searchChars.toCharArray());
	}

	public static int indexOfAnyBut(java.lang.CharSequence cs, char[] searchChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		int csLen = cs.length();
		int csLast = csLen - 1;
		int searchLen = searchChars.length;
		int searchLast = searchLen - 1;
		outer : for (int i = 0; i < csLen; i++) {
			char ch = cs.charAt(i);
			for (int j = 0; j < searchLen; j++) {
				if ((searchChars[j]) == ch) {
					if (((i < csLast) && (j < searchLast)) && (java.lang.Character.isHighSurrogate(ch))) {
						if ((searchChars[(j + 1)]) == (cs.charAt((i + 1)))) {
							continue outer;
						}
					}else {
						continue outer;
					}
				}
			}
			return i;
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static int indexOfAnyBut(java.lang.String str, java.lang.String searchChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			boolean chFound = (searchChars.indexOf(ch)) >= 0;
			if (((i + 1) < strLen) && (java.lang.Character.isHighSurrogate(ch))) {
				char ch2 = str.charAt((i + 1));
				if (chFound && ((searchChars.indexOf(ch2)) < 0)) {
					return i;
				}
			}else {
				if (!chFound) {
					return i;
				}
			}
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static boolean containsOnly(java.lang.CharSequence cs, char[] valid) {
		if ((valid == null) || (cs == null)) {
			return false;
		}
		if ((cs.length()) == 0) {
			return true;
		}
		if ((valid.length) == 0) {
			return false;
		}
		return (org.apache.commons.lang3.StringUtils.indexOfAnyBut(cs, valid)) == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND);
	}

	public static boolean containsOnly(java.lang.CharSequence cs, java.lang.String validChars) {
		if ((cs == null) || (validChars == null)) {
			return false;
		}
		return org.apache.commons.lang3.StringUtils.containsOnly(cs, validChars.toCharArray());
	}

	public static boolean containsNone(java.lang.CharSequence cs, char[] searchChars) {
		if ((cs == null) || (searchChars == null)) {
			return true;
		}
		int csLen = cs.length();
		int csLast = csLen - 1;
		int searchLen = searchChars.length;
		int searchLast = searchLen - 1;
		for (int i = 0; i < csLen; i++) {
			char ch = cs.charAt(i);
			for (int j = 0; j < searchLen; j++) {
				if ((searchChars[j]) == ch) {
					if (java.lang.Character.isHighSurrogate(ch)) {
						if (j == searchLast) {
							return false;
						}
						if ((i < csLast) && ((searchChars[(j + 1)]) == (cs.charAt((i + 1))))) {
							return false;
						}
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean containsNone(java.lang.CharSequence cs, java.lang.String invalidChars) {
		if ((cs == null) || (invalidChars == null)) {
			return true;
		}
		return org.apache.commons.lang3.StringUtils.containsNone(cs, invalidChars.toCharArray());
	}

	public static int indexOfAny(java.lang.String str, java.lang.String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		int sz = searchStrs.length;
		int ret = java.lang.Integer.MAX_VALUE;
		int tmp = 0;
		for (int i = 0; i < sz; i++) {
			java.lang.String search = searchStrs[i];
			if (search == null) {
				continue;
			}
			tmp = str.indexOf(search);
			if (tmp == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
				continue;
			}
			if (tmp < ret) {
				ret = tmp;
			}
		}
		return ret == (java.lang.Integer.MAX_VALUE) ? org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND : ret;
	}

	public static int lastIndexOfAny(java.lang.String str, java.lang.String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		int sz = searchStrs.length;
		int ret = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		int tmp = 0;
		for (int i = 0; i < sz; i++) {
			java.lang.String search = searchStrs[i];
			if (search == null) {
				continue;
			}
			tmp = str.lastIndexOf(search);
			if (tmp > ret) {
				ret = tmp;
			}
		}
		return ret;
	}

	public static java.lang.String substring(java.lang.String str, int start) {
		if (str == null) {
			return null;
		}
		if (start < 0) {
			start = (str.length()) + start;
		}
		if (start < 0) {
			start = 0;
		}
		if (start > (str.length())) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		return str.substring(start);
	}

	public static java.lang.String substring(java.lang.String str, int start, int end) {
		if (str == null) {
			return null;
		}
		if (end < 0) {
			end = (str.length()) + end;
		}
		if (start < 0) {
			start = (str.length()) + start;
		}
		if (end > (str.length())) {
			end = str.length();
		}
		if (start > end) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		if (start < 0) {
			start = 0;
		}
		if (end < 0) {
			end = 0;
		}
		return str.substring(start, end);
	}

	public static java.lang.String left(java.lang.String str, int len) {
		if (str == null) {
			return null;
		}
		if (len < 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		if ((str.length()) <= len) {
			return str;
		}
		return str.substring(0, len);
	}

	public static java.lang.String right(java.lang.String str, int len) {
		if (str == null) {
			return null;
		}
		if (len < 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		if ((str.length()) <= len) {
			return str;
		}
		return str.substring(((str.length()) - len));
	}

	public static java.lang.String mid(java.lang.String str, int pos, int len) {
		if (str == null) {
			return null;
		}
		if ((len < 0) || (pos > (str.length()))) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		if (pos < 0) {
			pos = 0;
		}
		if ((str.length()) <= (pos + len)) {
			return str.substring(pos);
		}
		return str.substring(pos, (pos + len));
	}

	public static java.lang.String substringBefore(java.lang.String str, java.lang.String separator) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (separator == null)) {
			return str;
		}
		if ((separator.length()) == 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int pos = str.indexOf(separator);
		if (pos == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			return str;
		}
		return str.substring(0, pos);
	}

	public static java.lang.String substringAfter(java.lang.String str, java.lang.String separator) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return str;
		}
		if (separator == null) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int pos = str.indexOf(separator);
		if (pos == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		return str.substring((pos + (separator.length())));
	}

	public static java.lang.String substringBeforeLast(java.lang.String str, java.lang.String separator) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(separator))) {
			return str;
		}
		int pos = str.lastIndexOf(separator);
		if (pos == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			return str;
		}
		return str.substring(0, pos);
	}

	public static java.lang.String substringAfterLast(java.lang.String str, java.lang.String separator) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return str;
		}
		if (org.apache.commons.lang3.StringUtils.isEmpty(separator)) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int pos = str.lastIndexOf(separator);
		if ((pos == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) || (pos == ((str.length()) - (separator.length())))) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		return str.substring((pos + (separator.length())));
	}

	public static java.lang.String substringBetween(java.lang.String str, java.lang.String tag) {
		return org.apache.commons.lang3.StringUtils.substringBetween(str, tag, tag);
	}

	public static java.lang.String substringBetween(java.lang.String str, java.lang.String open, java.lang.String close) {
		if (((str == null) || (open == null)) || (close == null)) {
			return null;
		}
		int start = str.indexOf(open);
		if (start != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			int end = str.indexOf(close, (start + (open.length())));
			if (end != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
				return str.substring((start + (open.length())), end);
			}
		}
		return null;
	}

	public static java.lang.String[] substringsBetween(java.lang.String str, java.lang.String open, java.lang.String close) {
		if (((str == null) || (org.apache.commons.lang3.StringUtils.isEmpty(open))) || (org.apache.commons.lang3.StringUtils.isEmpty(close))) {
			return null;
		}
		int strLen = str.length();
		if (strLen == 0) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		int closeLen = close.length();
		int openLen = open.length();
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		int pos = 0;
		while (pos < (strLen - closeLen)) {
			int start = str.indexOf(open, pos);
			if (start < 0) {
				break;
			}
			start += openLen;
			int end = str.indexOf(close, start);
			if (end < 0) {
				break;
			}
			list.add(str.substring(start, end));
			pos = end + closeLen;
		} 
		if (list.isEmpty()) {
			return null;
		}
		return list.toArray(new java.lang.String[list.size()]);
	}

	public static java.lang.String[] split(java.lang.String str) {
		return org.apache.commons.lang3.StringUtils.split(str, null, (-1));
	}

	public static java.lang.String[] split(java.lang.String str, char separatorChar) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChar, false);
	}

	public static java.lang.String[] split(java.lang.String str, java.lang.String separatorChars) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, (-1), false);
	}

	public static java.lang.String[] split(java.lang.String str, java.lang.String separatorChars, int max) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, max, false);
	}

	public static java.lang.String[] splitByWholeSeparator(java.lang.String str, java.lang.String separator) {
		return org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, (-1), false);
	}

	public static java.lang.String[] splitByWholeSeparator(java.lang.String str, java.lang.String separator, int max) {
		return org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, max, false);
	}

	public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String str, java.lang.String separator) {
		return org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, (-1), true);
	}

	public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String str, java.lang.String separator, int max) {
		return org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, max, true);
	}

	private static java.lang.String[] splitByWholeSeparatorWorker(java.lang.String str, java.lang.String separator, int max, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		if ((separator == null) || (org.apache.commons.lang3.StringUtils.EMPTY.equals(separator))) {
			return org.apache.commons.lang3.StringUtils.splitWorker(str, null, max, preserveAllTokens);
		}
		int separatorLength = separator.length();
		java.util.ArrayList<java.lang.String> substrings = new java.util.ArrayList<java.lang.String>();
		int numberOfSubstrings = 0;
		int beg = 0;
		int end = 0;
		while (end < len) {
			end = str.indexOf(separator, beg);
			if (end > (-1)) {
				if (end > beg) {
					numberOfSubstrings += 1;
					if (numberOfSubstrings == max) {
						end = len;
						substrings.add(str.substring(beg));
					}else {
						substrings.add(str.substring(beg, end));
						beg = end + separatorLength;
					}
				}else {
					if (preserveAllTokens) {
						numberOfSubstrings += 1;
						if (numberOfSubstrings == max) {
							end = len;
							substrings.add(str.substring(beg));
						}else {
							substrings.add(org.apache.commons.lang3.StringUtils.EMPTY);
						}
					}
					beg = end + separatorLength;
				}
			}else {
				substrings.add(str.substring(beg));
				end = len;
			}
		} 
		return substrings.toArray(new java.lang.String[substrings.size()]);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, null, (-1), true);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, char separatorChar) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChar, true);
	}

	private static java.lang.String[] splitWorker(java.lang.String str, char separatorChar, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		int i = 0;
		int start = 0;
		boolean match = false;
		boolean lastMatch = false;
		while (i < len) {
			if ((str.charAt(i)) == separatorChar) {
				if (match || preserveAllTokens) {
					list.add(str.substring(start, i));
					match = false;
					lastMatch = true;
				}
				start = ++i;
				continue;
			}
			lastMatch = false;
			match = true;
			i++;
		} 
		if (match || (preserveAllTokens && lastMatch)) {
			list.add(str.substring(start, i));
		}
		return list.toArray(new java.lang.String[list.size()]);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, java.lang.String separatorChars) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, (-1), true);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, java.lang.String separatorChars, int max) {
		return org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, max, true);
	}

	private static java.lang.String[] splitWorker(java.lang.String str, java.lang.String separatorChars, int max, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		int sizePlus1 = 1;
		int i = 0;
		int start = 0;
		boolean match = false;
		boolean lastMatch = false;
		if (separatorChars == null) {
			while (i < len) {
				if (java.lang.Character.isWhitespace(str.charAt(i))) {
					if (match || preserveAllTokens) {
						lastMatch = true;
						if ((sizePlus1++) == max) {
							i = len;
							lastMatch = false;
						}
						list.add(str.substring(start, i));
						match = false;
					}
					start = ++i;
					continue;
				}
				lastMatch = false;
				match = true;
				i++;
			} 
		}else
			if ((separatorChars.length()) == 1) {
				char sep = separatorChars.charAt(0);
				while (i < len) {
					if ((str.charAt(i)) == sep) {
						if (match || preserveAllTokens) {
							lastMatch = true;
							if ((sizePlus1++) == max) {
								i = len;
								lastMatch = false;
							}
							list.add(str.substring(start, i));
							match = false;
						}
						start = ++i;
						continue;
					}
					lastMatch = false;
					match = true;
					i++;
				} 
			}else {
				while (i < len) {
					if ((separatorChars.indexOf(str.charAt(i))) >= 0) {
						if (match || preserveAllTokens) {
							lastMatch = true;
							if ((sizePlus1++) == max) {
								i = len;
								lastMatch = false;
							}
							list.add(str.substring(start, i));
							match = false;
						}
						start = ++i;
						continue;
					}
					lastMatch = false;
					match = true;
					i++;
				} 
			}
		
		if (match || (preserveAllTokens && lastMatch)) {
			list.add(str.substring(start, i));
		}
		return list.toArray(new java.lang.String[list.size()]);
	}

	public static java.lang.String[] splitByCharacterType(java.lang.String str) {
		return org.apache.commons.lang3.StringUtils.splitByCharacterType(str, false);
	}

	public static java.lang.String[] splitByCharacterTypeCamelCase(java.lang.String str) {
		return org.apache.commons.lang3.StringUtils.splitByCharacterType(str, true);
	}

	private static java.lang.String[] splitByCharacterType(java.lang.String str, boolean camelCase) {
		if (str == null) {
			return null;
		}
		if ((str.length()) == 0) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		char[] c = str.toCharArray();
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		int tokenStart = 0;
		int currentType = java.lang.Character.getType(c[tokenStart]);
		for (int pos = tokenStart + 1; pos < (c.length); pos++) {
			int type = java.lang.Character.getType(c[pos]);
			if (type == currentType) {
				continue;
			}
			if ((camelCase && (type == (java.lang.Character.LOWERCASE_LETTER))) && (currentType == (java.lang.Character.UPPERCASE_LETTER))) {
				int newTokenStart = pos - 1;
				if (newTokenStart != tokenStart) {
					list.add(new java.lang.String(c, tokenStart, (newTokenStart - tokenStart)));
					tokenStart = newTokenStart;
				}
			}else {
				list.add(new java.lang.String(c, tokenStart, (pos - tokenStart)));
				tokenStart = pos;
			}
			currentType = type;
		}
		list.add(new java.lang.String(c, tokenStart, ((c.length) - tokenStart)));
		return list.toArray(new java.lang.String[list.size()]);
	}

	public static java.lang.String concat(java.lang.Object... elements) {
		return org.apache.commons.lang3.StringUtils.join(elements, null);
	}

	public static java.lang.String concatWith(java.lang.String separator, java.lang.Object... elements) {
		return org.apache.commons.lang3.StringUtils.join(elements, separator);
	}

	public static java.lang.String join(java.lang.Object[] array) {
		return org.apache.commons.lang3.StringUtils.join(array, null);
	}

	public static java.lang.String join(java.lang.Object[] array, char separator) {
		if (array == null) {
			return null;
		}
		return org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length);
	}

	public static java.lang.String join(java.lang.Object[] array, char separator, int startIndex, int endIndex) {
		if (array == null) {
			return null;
		}
		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		bufSize *= ((array[startIndex]) == null ? 16 : array[startIndex].toString().length()) + 1;
		java.lang.StringBuilder buf = new java.lang.StringBuilder(bufSize);
		for (int i = startIndex; i < endIndex; i++) {
			if (i > startIndex) {
				buf.append(separator);
			}
			if ((array[i]) != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}

	public static java.lang.String join(java.lang.Object[] array, java.lang.String separator) {
		if (array == null) {
			return null;
		}
		return org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length);
	}

	public static java.lang.String join(java.lang.Object[] array, java.lang.String separator, int startIndex, int endIndex) {
		if (array == null) {
			return null;
		}
		if (separator == null) {
			separator = org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		bufSize *= ((array[startIndex]) == null ? 16 : array[startIndex].toString().length()) + (separator.length());
		java.lang.StringBuilder buf = new java.lang.StringBuilder(bufSize);
		for (int i = startIndex; i < endIndex; i++) {
			if (i > startIndex) {
				buf.append(separator);
			}
			if ((array[i]) != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}

	public static java.lang.String join(java.util.Iterator<?> iterator, char separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		java.lang.Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang3.ObjectUtils.toString(first);
		}
		java.lang.StringBuilder buf = new java.lang.StringBuilder(256);
		if (first != null) {
			buf.append(first);
		}
		while (iterator.hasNext()) {
			buf.append(separator);
			java.lang.Object obj = iterator.next();
			if (obj != null) {
				buf.append(obj);
			}
		} 
		return buf.toString();
	}

	public static java.lang.String join(java.util.Iterator<?> iterator, java.lang.String separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		java.lang.Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang3.ObjectUtils.toString(first);
		}
		java.lang.StringBuilder buf = new java.lang.StringBuilder(256);
		if (first != null) {
			buf.append(first);
		}
		while (iterator.hasNext()) {
			if (separator != null) {
				buf.append(separator);
			}
			java.lang.Object obj = iterator.next();
			if (obj != null) {
				buf.append(obj);
			}
		} 
		return buf.toString();
	}

	public static java.lang.String join(java.lang.Iterable<?> iterable, char separator) {
		if (iterable == null) {
			return null;
		}
		return org.apache.commons.lang3.StringUtils.join(iterable.iterator(), separator);
	}

	public static java.lang.String join(java.lang.Iterable<?> iterable, java.lang.String separator) {
		if (iterable == null) {
			return null;
		}
		return org.apache.commons.lang3.StringUtils.join(iterable.iterator(), separator);
	}

	public static java.lang.String deleteWhitespace(java.lang.String str) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return str;
		}
		int sz = str.length();
		char[] chs = new char[sz];
		int count = 0;
		for (int i = 0; i < sz; i++) {
			if (!(java.lang.Character.isWhitespace(str.charAt(i)))) {
				chs[(count++)] = str.charAt(i);
			}
		}
		if (count == sz) {
			return str;
		}
		return new java.lang.String(chs, 0, count);
	}

	public static java.lang.String removeStart(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (str.startsWith(remove)) {
			return str.substring(remove.length());
		}
		return str;
	}

	public static java.lang.String removeStartIgnoreCase(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(str, remove)) {
			return str.substring(remove.length());
		}
		return str;
	}

	public static java.lang.String removeEnd(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (str.endsWith(remove)) {
			return str.substring(0, ((str.length()) - (remove.length())));
		}
		return str;
	}

	public static java.lang.String removeEndIgnoreCase(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(str, remove)) {
			return str.substring(0, ((str.length()) - (remove.length())));
		}
		return str;
	}

	public static java.lang.String remove(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
			return str;
		}
		return org.apache.commons.lang3.StringUtils.replace(str, remove, org.apache.commons.lang3.StringUtils.EMPTY, (-1));
	}

	public static java.lang.String remove(java.lang.String str, char remove) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || ((str.indexOf(remove)) == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND))) {
			return str;
		}
		char[] chars = str.toCharArray();
		int pos = 0;
		for (int i = 0; i < (chars.length); i++) {
			if ((chars[i]) != remove) {
				chars[(pos++)] = chars[i];
			}
		}
		return new java.lang.String(chars, 0, pos);
	}

	public static java.lang.String replaceOnce(java.lang.String text, java.lang.String searchString, java.lang.String replacement) {
		return org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement, 1);
	}

	public static java.lang.String replace(java.lang.String text, java.lang.String searchString, java.lang.String replacement) {
		return org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement, (-1));
	}

	public static java.lang.String replace(java.lang.String text, java.lang.String searchString, java.lang.String replacement, int max) {
		if ((((org.apache.commons.lang3.StringUtils.isEmpty(text)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchString))) || (replacement == null)) || (max == 0)) {
			return text;
		}
		int start = 0;
		int end = text.indexOf(searchString, start);
		if (end == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			return text;
		}
		int replLength = searchString.length();
		int increase = (replacement.length()) - replLength;
		increase = (increase < 0) ? 0 : increase;
		increase *= (max < 0) ? 16 : max > 64 ? 64 : max;
		java.lang.StringBuilder buf = new java.lang.StringBuilder(((text.length()) + increase));
		while (end != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			buf.append(text.substring(start, end)).append(replacement);
			start = end + replLength;
			if ((--max) == 0) {
				break;
			}
			end = text.indexOf(searchString, start);
		} 
		buf.append(text.substring(start));
		return buf.toString();
	}

	public static java.lang.String replaceEach(java.lang.String text, java.lang.String[] searchList, java.lang.String[] replacementList) {
		return org.apache.commons.lang3.StringUtils.replaceEach(text, searchList, replacementList, false, 0);
	}

	public static java.lang.String replaceEachRepeatedly(java.lang.String text, java.lang.String[] searchList, java.lang.String[] replacementList) {
		int timeToLive = searchList == null ? 0 : searchList.length;
		return org.apache.commons.lang3.StringUtils.replaceEach(text, searchList, replacementList, true, timeToLive);
	}

	private static java.lang.String replaceEach(java.lang.String text, java.lang.String[] searchList, java.lang.String[] replacementList, boolean repeat, int timeToLive) {
		if ((((((text == null) || ((text.length()) == 0)) || (searchList == null)) || ((searchList.length) == 0)) || (replacementList == null)) || ((replacementList.length) == 0)) {
			return text;
		}
		if (timeToLive < 0) {
			throw new java.lang.IllegalStateException(((("TimeToLive of " + timeToLive) + " is less than 0: ") + text));
		}
		int searchLength = searchList.length;
		int replacementLength = replacementList.length;
		if (searchLength != replacementLength) {
			throw new java.lang.IllegalArgumentException(((("Search and Replace array lengths don't match: " + searchLength) + " vs ") + replacementLength));
		}
		boolean[] noMoreMatchesForReplIndex = new boolean[searchLength];
		int textIndex = -1;
		int replaceIndex = -1;
		int tempIndex = -1;
		for (int i = 0; i < searchLength; i++) {
			if ((((noMoreMatchesForReplIndex[i]) || ((searchList[i]) == null)) || ((searchList[i].length()) == 0)) || ((replacementList[i]) == null)) {
				continue;
			}
			tempIndex = text.indexOf(searchList[i]);
			if (tempIndex == (-1)) {
				noMoreMatchesForReplIndex[i] = true;
			}else {
				if ((textIndex == (-1)) || (tempIndex < textIndex)) {
					textIndex = tempIndex;
					replaceIndex = i;
				}
			}
		}
		if (textIndex == (-1)) {
			return text;
		}
		int start = 0;
		int increase = 0;
		for (int i = 0; i < (searchList.length); i++) {
			if (((searchList[i]) == null) || ((replacementList[i]) == null)) {
				continue;
			}
			int greater = (replacementList[i].length()) - (searchList[i].length());
			if (greater > 0) {
				increase += 3 * greater;
			}
		}
		increase = java.lang.Math.min(increase, ((text.length()) / 5));
		java.lang.StringBuilder buf = new java.lang.StringBuilder(((text.length()) + increase));
		while (textIndex != (-1)) {
			for (int i = start; i < textIndex; i++) {
				buf.append(text.charAt(i));
			}
			buf.append(replacementList[replaceIndex]);
			start = textIndex + (searchList[replaceIndex].length());
			textIndex = -1;
			replaceIndex = -1;
			tempIndex = -1;
			for (int i = 0; i < searchLength; i++) {
				if ((((noMoreMatchesForReplIndex[i]) || ((searchList[i]) == null)) || ((searchList[i].length()) == 0)) || ((replacementList[i]) == null)) {
					continue;
				}
				tempIndex = text.indexOf(searchList[i], start);
				if (tempIndex == (-1)) {
					noMoreMatchesForReplIndex[i] = true;
				}else {
					if ((textIndex == (-1)) || (tempIndex < textIndex)) {
						textIndex = tempIndex;
						replaceIndex = i;
					}
				}
			}
		} 
		int textLength = text.length();
		for (int i = start; i < textLength; i++) {
			buf.append(text.charAt(i));
		}
		java.lang.String result = buf.toString();
		if (!repeat) {
			return result;
		}
		return org.apache.commons.lang3.StringUtils.replaceEach(result, searchList, replacementList, repeat, (timeToLive - 1));
	}

	public static java.lang.String replaceChars(java.lang.String str, char searchChar, char replaceChar) {
		if (str == null) {
			return null;
		}
		return str.replace(searchChar, replaceChar);
	}

	public static java.lang.String replaceChars(java.lang.String str, java.lang.String searchChars, java.lang.String replaceChars) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
			return str;
		}
		if (replaceChars == null) {
			replaceChars = org.apache.commons.lang3.StringUtils.EMPTY;
		}
		boolean modified = false;
		int replaceCharsLength = replaceChars.length();
		int strLength = str.length();
		java.lang.StringBuilder buf = new java.lang.StringBuilder(strLength);
		for (int i = 0; i < strLength; i++) {
			char ch = str.charAt(i);
			int index = searchChars.indexOf(ch);
			if (index >= 0) {
				modified = true;
				if (index < replaceCharsLength) {
					buf.append(replaceChars.charAt(index));
				}
			}else {
				buf.append(ch);
			}
		}
		if (modified) {
			return buf.toString();
		}
		return str;
	}

	public static java.lang.String overlay(java.lang.String str, java.lang.String overlay, int start, int end) {
		if (str == null) {
			return null;
		}
		if (overlay == null) {
			overlay = org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int len = str.length();
		if (start < 0) {
			start = 0;
		}
		if (start > len) {
			start = len;
		}
		if (end < 0) {
			end = 0;
		}
		if (end > len) {
			end = len;
		}
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return new java.lang.StringBuilder(((((len + start) - end) + (overlay.length())) + 1)).append(str.substring(0, start)).append(overlay).append(str.substring(end)).toString();
	}

	public static java.lang.String chomp(java.lang.String str) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
			return str;
		}
		if ((str.length()) == 1) {
			char ch = str.charAt(0);
			if ((ch == (org.apache.commons.lang3.CharUtils.CR)) || (ch == (org.apache.commons.lang3.CharUtils.LF))) {
				return org.apache.commons.lang3.StringUtils.EMPTY;
			}
			return str;
		}
		int lastIdx = (str.length()) - 1;
		char last = str.charAt(lastIdx);
		if (last == (org.apache.commons.lang3.CharUtils.LF)) {
			if ((str.charAt((lastIdx - 1))) == (org.apache.commons.lang3.CharUtils.CR)) {
				lastIdx--;
			}
		}else
			if (last != (org.apache.commons.lang3.CharUtils.CR)) {
				lastIdx++;
			}
		
		return str.substring(0, lastIdx);
	}

	public static java.lang.String chomp(java.lang.String str, java.lang.String separator) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (separator == null)) {
			return str;
		}
		if (str.endsWith(separator)) {
			return str.substring(0, ((str.length()) - (separator.length())));
		}
		return str;
	}

	public static java.lang.String chop(java.lang.String str) {
		if (str == null) {
			return null;
		}
		int strLen = str.length();
		if (strLen < 2) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int lastIdx = strLen - 1;
		java.lang.String ret = str.substring(0, lastIdx);
		char last = str.charAt(lastIdx);
		if (last == (org.apache.commons.lang3.CharUtils.LF)) {
			if ((ret.charAt((lastIdx - 1))) == (org.apache.commons.lang3.CharUtils.CR)) {
				return ret.substring(0, (lastIdx - 1));
			}
		}
		return ret;
	}

	public static java.lang.String repeat(java.lang.String str, int repeat) {
		if (str == null) {
			return null;
		}
		if (repeat <= 0) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int inputLength = str.length();
		if ((repeat == 1) || (inputLength == 0)) {
			return str;
		}
		if ((inputLength == 1) && (repeat <= (org.apache.commons.lang3.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang3.StringUtils.padding(repeat, str.charAt(0));
		}
		int outputLength = inputLength * repeat;
		switch (inputLength) {
			case 1 :
				char ch = str.charAt(0);
				char[] output1 = new char[outputLength];
				for (int i = repeat - 1; i >= 0; i--) {
					output1[i] = ch;
				}
				return new java.lang.String(output1);
			case 2 :
				char ch0 = str.charAt(0);
				char ch1 = str.charAt(1);
				char[] output2 = new char[outputLength];
				for (int i = (repeat * 2) - 2; i >= 0; i-- , i--) {
					output2[i] = ch0;
					output2[(i + 1)] = ch1;
				}
				return new java.lang.String(output2);
			default :
				java.lang.StringBuilder buf = new java.lang.StringBuilder(outputLength);
				for (int i = 0; i < repeat; i++) {
					buf.append(str);
				}
				return buf.toString();
		}
	}

	public static java.lang.String repeat(java.lang.String str, java.lang.String separator, int repeat) {
		if ((str == null) || (separator == null)) {
			return org.apache.commons.lang3.StringUtils.repeat(str, repeat);
		}else {
			java.lang.String result = org.apache.commons.lang3.StringUtils.repeat((str + separator), repeat);
			return org.apache.commons.lang3.StringUtils.removeEnd(result, separator);
		}
	}

	private static java.lang.String padding(int repeat, char padChar) throws java.lang.IndexOutOfBoundsException {
		if (repeat < 0) {
			throw new java.lang.IndexOutOfBoundsException(("Cannot pad a negative amount: " + repeat));
		}
		final char[] buf = new char[repeat];
		for (int i = 0; i < (buf.length); i++) {
			buf[i] = padChar;
		}
		return new java.lang.String(buf);
	}

	public static java.lang.String rightPad(java.lang.String str, int size) {
		return org.apache.commons.lang3.StringUtils.rightPad(str, size, ' ');
	}

	public static java.lang.String rightPad(java.lang.String str, int size, char padChar) {
		if (str == null) {
			return null;
		}
		int pads = size - (str.length());
		if (pads <= 0) {
			return str;
		}
		if (pads > (org.apache.commons.lang3.StringUtils.PAD_LIMIT)) {
			return org.apache.commons.lang3.StringUtils.rightPad(str, size, java.lang.String.valueOf(padChar));
		}
		return str.concat(org.apache.commons.lang3.StringUtils.padding(pads, padChar));
	}

	public static java.lang.String rightPad(java.lang.String str, int size, java.lang.String padStr) {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int padLen = padStr.length();
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		if ((padLen == 1) && (pads <= (org.apache.commons.lang3.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang3.StringUtils.rightPad(str, size, padStr.charAt(0));
		}
		if (pads == padLen) {
			return str.concat(padStr);
		}else
			if (pads < padLen) {
				return str.concat(padStr.substring(0, pads));
			}else {
				char[] padding = new char[pads];
				char[] padChars = padStr.toCharArray();
				for (int i = 0; i < pads; i++) {
					padding[i] = padChars[(i % padLen)];
				}
				return str.concat(new java.lang.String(padding));
			}
		
	}

	public static java.lang.String leftPad(java.lang.String str, int size) {
		return org.apache.commons.lang3.StringUtils.leftPad(str, size, ' ');
	}

	public static java.lang.String leftPad(java.lang.String str, int size, char padChar) {
		if (str == null) {
			return null;
		}
		int pads = size - (str.length());
		if (pads <= 0) {
			return str;
		}
		if (pads > (org.apache.commons.lang3.StringUtils.PAD_LIMIT)) {
			return org.apache.commons.lang3.StringUtils.leftPad(str, size, java.lang.String.valueOf(padChar));
		}
		return org.apache.commons.lang3.StringUtils.padding(pads, padChar).concat(str);
	}

	public static java.lang.String leftPad(java.lang.String str, int size, java.lang.String padStr) {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int padLen = padStr.length();
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		if ((padLen == 1) && (pads <= (org.apache.commons.lang3.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang3.StringUtils.leftPad(str, size, padStr.charAt(0));
		}
		if (pads == padLen) {
			return padStr.concat(str);
		}else
			if (pads < padLen) {
				return padStr.substring(0, pads).concat(str);
			}else {
				char[] padding = new char[pads];
				char[] padChars = padStr.toCharArray();
				for (int i = 0; i < pads; i++) {
					padding[i] = padChars[(i % padLen)];
				}
				return new java.lang.String(padding).concat(str);
			}
		
	}

	@java.lang.Deprecated
	public static int length(java.lang.CharSequence cs) {
		return org.apache.commons.lang3.CharSequenceUtils.length(cs);
	}

	public static java.lang.String center(java.lang.String str, int size) {
		return org.apache.commons.lang3.StringUtils.center(str, size, ' ');
	}

	public static java.lang.String center(java.lang.String str, int size, char padChar) {
		if ((str == null) || (size <= 0)) {
			return str;
		}
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		str = org.apache.commons.lang3.StringUtils.leftPad(str, (strLen + (pads / 2)), padChar);
		str = org.apache.commons.lang3.StringUtils.rightPad(str, size, padChar);
		return str;
	}

	public static java.lang.String center(java.lang.String str, int size, java.lang.String padStr) {
		if ((str == null) || (size <= 0)) {
			return str;
		}
		if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		str = org.apache.commons.lang3.StringUtils.leftPad(str, (strLen + (pads / 2)), padStr);
		str = org.apache.commons.lang3.StringUtils.rightPad(str, size, padStr);
		return str;
	}

	public static java.lang.String upperCase(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase();
	}

	public static java.lang.String upperCase(java.lang.String str, java.util.Locale locale) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase(locale);
	}

	public static java.lang.String lowerCase(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return str.toLowerCase();
	}

	public static java.lang.String lowerCase(java.lang.String str, java.util.Locale locale) {
		if (str == null) {
			return null;
		}
		return str.toLowerCase(locale);
	}

	public static java.lang.String capitalize(java.lang.CharSequence cs) {
		if (cs == null) {
			return null;
		}
		int strLen;
		if ((strLen = cs.length()) == 0) {
			return cs.toString();
		}
		return new java.lang.StringBuilder(strLen).append(java.lang.Character.toTitleCase(cs.charAt(0))).append(org.apache.commons.lang3.CharSequenceUtils.subSequence(cs, 1)).toString();
	}

	public static java.lang.String uncapitalize(java.lang.CharSequence cs) {
		if (cs == null) {
			return null;
		}
		int strLen;
		if ((strLen = cs.length()) == 0) {
			return cs.toString();
		}
		return new java.lang.StringBuilder(strLen).append(java.lang.Character.toLowerCase(cs.charAt(0))).append(org.apache.commons.lang3.CharSequenceUtils.subSequence(cs, 1)).toString();
	}

	public static java.lang.String swapCase(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		java.lang.StringBuilder buffer = new java.lang.StringBuilder(strLen);
		char ch = 0;
		for (int i = 0; i < strLen; i++) {
			ch = str.charAt(i);
			if (java.lang.Character.isUpperCase(ch)) {
				ch = java.lang.Character.toLowerCase(ch);
			}else
				if (java.lang.Character.isTitleCase(ch)) {
					ch = java.lang.Character.toLowerCase(ch);
				}else
					if (java.lang.Character.isLowerCase(ch)) {
						ch = java.lang.Character.toUpperCase(ch);
					}
				
			
			buffer.append(ch);
		}
		return buffer.toString();
	}

	public static int countMatches(java.lang.String str, java.lang.String sub) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(sub))) {
			return 0;
		}
		int count = 0;
		int idx = 0;
		while ((idx = str.indexOf(sub, idx)) != (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			count++;
			idx += sub.length();
		} 
		return count;
	}

	public static boolean isAlpha(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isLetter(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphaSpace(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isLetter(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphanumeric(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isLetterOrDigit(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphanumericSpace(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isLetterOrDigit(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAsciiPrintable(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((org.apache.commons.lang3.CharUtils.isAsciiPrintable(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumeric(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isDigit(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumericSpace(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isDigit(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isWhitespace(java.lang.CharSequence cs) {
		if (cs == null) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isWhitespace(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAllLowerCase(java.lang.CharSequence cs) {
		if ((cs == null) || (org.apache.commons.lang3.StringUtils.isEmpty(cs))) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isLowerCase(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAllUpperCase(java.lang.CharSequence cs) {
		if ((cs == null) || (org.apache.commons.lang3.StringUtils.isEmpty(cs))) {
			return false;
		}
		int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isUpperCase(cs.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static java.lang.String defaultString(java.lang.String str) {
		return str == null ? org.apache.commons.lang3.StringUtils.EMPTY : str;
	}

	public static java.lang.String defaultString(java.lang.String str, java.lang.String defaultStr) {
		return str == null ? defaultStr : str;
	}

	public static <T extends java.lang.CharSequence> T defaultIfEmpty(T str, T defaultStr) {
		return org.apache.commons.lang3.StringUtils.isEmpty(str) ? defaultStr : str;
	}

	public static java.lang.String reverse(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return new java.lang.StringBuilder(str).reverse().toString();
	}

	public static java.lang.String reverseDelimited(java.lang.String str, char separatorChar) {
		if (str == null) {
			return null;
		}
		java.lang.String[] strs = org.apache.commons.lang3.StringUtils.split(str, separatorChar);
		org.apache.commons.lang3.ArrayUtils.reverse(strs);
		return org.apache.commons.lang3.StringUtils.join(strs, separatorChar);
	}

	public static java.lang.String abbreviate(java.lang.String str, int maxWidth) {
		return org.apache.commons.lang3.StringUtils.abbreviate(str, 0, maxWidth);
	}

	public static java.lang.String abbreviate(java.lang.String str, int offset, int maxWidth) {
		if (str == null) {
			return null;
		}
		if (maxWidth < 4) {
			throw new java.lang.IllegalArgumentException("Minimum abbreviation width is 4");
		}
		if ((str.length()) <= maxWidth) {
			return str;
		}
		if (offset > (str.length())) {
			offset = str.length();
		}
		if (((str.length()) - offset) < (maxWidth - 3)) {
			offset = (str.length()) - (maxWidth - 3);
		}
		final java.lang.String abrevMarker = "...";
		if (offset <= 4) {
			return (str.substring(0, (maxWidth - 3))) + abrevMarker;
		}
		if (maxWidth < 7) {
			throw new java.lang.IllegalArgumentException("Minimum abbreviation width with offset is 7");
		}
		if ((offset + (maxWidth - 3)) < (str.length())) {
			return abrevMarker + (org.apache.commons.lang3.StringUtils.abbreviate(str.substring(offset), (maxWidth - 3)));
		}
		return abrevMarker + (str.substring(((str.length()) - (maxWidth - 3))));
	}

	public static java.lang.String abbreviateMiddle(java.lang.String str, java.lang.String middle, int length) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(middle))) {
			return str;
		}
		if ((length >= (str.length())) || (length < ((middle.length()) + 2))) {
			return str;
		}
		int targetSting = length - (middle.length());
		int startOffset = (targetSting / 2) + (targetSting % 2);
		int endOffset = (str.length()) - (targetSting / 2);
		java.lang.StringBuilder builder = new java.lang.StringBuilder(length);
		builder.append(str.substring(0, startOffset));
		builder.append(middle);
		builder.append(str.substring(endOffset));
		return builder.toString();
	}

	public static java.lang.String difference(java.lang.String str1, java.lang.String str2) {
		if (str1 == null) {
			return str2;
		}
		if (str2 == null) {
			return str1;
		}
		int at = org.apache.commons.lang3.StringUtils.indexOfDifference(str1, str2);
		if (at == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		return str2.substring(at);
	}

	public static int indexOfDifference(java.lang.CharSequence cs1, java.lang.CharSequence cs2) {
		if (cs1 == cs2) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if ((cs1 == null) || (cs2 == null)) {
			return 0;
		}
		int i;
		for (i = 0; (i < (cs1.length())) && (i < (cs2.length())); ++i) {
			if ((cs1.charAt(i)) != (cs2.charAt(i))) {
				break;
			}
		}
		if ((i < (cs2.length())) || (i < (cs1.length()))) {
			return i;
		}
		return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
	}

	public static int indexOfDifference(java.lang.CharSequence... css) {
		if ((css == null) || ((css.length) <= 1)) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		boolean anyStringNull = false;
		boolean allStringsNull = true;
		int arrayLen = css.length;
		int shortestStrLen = java.lang.Integer.MAX_VALUE;
		int longestStrLen = 0;
		for (int i = 0; i < arrayLen; i++) {
			if ((css[i]) == null) {
				anyStringNull = true;
				shortestStrLen = 0;
			}else {
				allStringsNull = false;
				shortestStrLen = java.lang.Math.min(css[i].length(), shortestStrLen);
				longestStrLen = java.lang.Math.max(css[i].length(), longestStrLen);
			}
		}
		if (allStringsNull || ((longestStrLen == 0) && (!anyStringNull))) {
			return org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
		}
		if (shortestStrLen == 0) {
			return 0;
		}
		int firstDiff = -1;
		for (int stringPos = 0; stringPos < shortestStrLen; stringPos++) {
			char comparisonChar = css[0].charAt(stringPos);
			for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
				if ((css[arrayPos].charAt(stringPos)) != comparisonChar) {
					firstDiff = stringPos;
					break;
				}
			}
			if (firstDiff != (-1)) {
				break;
			}
		}
		if ((firstDiff == (-1)) && (shortestStrLen != longestStrLen)) {
			return shortestStrLen;
		}
		return firstDiff;
	}

	public static java.lang.String getCommonPrefix(java.lang.String... strs) {
		if ((strs == null) || ((strs.length) == 0)) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}
		int smallestIndexOfDiff = org.apache.commons.lang3.StringUtils.indexOfDifference(strs);
		if (smallestIndexOfDiff == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)) {
			if ((strs[0]) == null) {
				return org.apache.commons.lang3.StringUtils.EMPTY;
			}
			return strs[0];
		}else
			if (smallestIndexOfDiff == 0) {
				return org.apache.commons.lang3.StringUtils.EMPTY;
			}else {
				return strs[0].substring(0, smallestIndexOfDiff);
			}
		
	}

	public static int getLevenshteinDistance(java.lang.CharSequence s, java.lang.CharSequence t) {
		if ((s == null) || (t == null)) {
			throw new java.lang.IllegalArgumentException("Strings must not be null");
		}
		int n = s.length();
		int m = t.length();
		if (n == 0) {
			return m;
		}else
			if (m == 0) {
				return n;
			}
		
		if (n > m) {
			java.lang.CharSequence tmp = s;
			s = t;
			t = tmp;
			n = m;
			m = t.length();
		}
		int[] p = new int[n + 1];
		int[] d = new int[n + 1];
		int[] _d;
		int i;
		int j;
		char t_j;
		int cost;
		for (i = 0; i <= n; i++) {
			p[i] = i;
		}
		for (j = 1; j <= m; j++) {
			t_j = t.charAt((j - 1));
			d[0] = j;
			for (i = 1; i <= n; i++) {
				cost = ((s.charAt((i - 1))) == t_j) ? 0 : 1;
				d[i] = java.lang.Math.min(java.lang.Math.min(((d[(i - 1)]) + 1), ((p[i]) + 1)), ((p[(i - 1)]) + cost));
			}
			_d = p;
			p = d;
			d = _d;
		}
		return p[n];
	}

	public static boolean startsWith(java.lang.String str, java.lang.String prefix) {
		return org.apache.commons.lang3.StringUtils.startsWith(str, prefix, false);
	}

	public static boolean startsWithIgnoreCase(java.lang.String str, java.lang.String prefix) {
		return org.apache.commons.lang3.StringUtils.startsWith(str, prefix, true);
	}

	private static boolean startsWith(java.lang.String str, java.lang.String prefix, boolean ignoreCase) {
		if ((str == null) || (prefix == null)) {
			return (str == null) && (prefix == null);
		}
		if ((prefix.length()) > (str.length())) {
			return false;
		}
		return str.regionMatches(ignoreCase, 0, prefix, 0, prefix.length());
	}

	public static boolean startsWithAny(java.lang.String string, java.lang.String... searchStrings) {
		if ((org.apache.commons.lang3.StringUtils.isEmpty(string)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchStrings))) {
			return false;
		}
		for (int i = 0; i < (searchStrings.length); i++) {
			java.lang.String searchString = searchStrings[i];
			if (org.apache.commons.lang3.StringUtils.startsWith(string, searchString)) {
				return true;
			}
		}
		return false;
	}

	public static boolean endsWith(java.lang.String str, java.lang.String suffix) {
		return org.apache.commons.lang3.StringUtils.endsWith(str, suffix, false);
	}

	public static boolean endsWithIgnoreCase(java.lang.String str, java.lang.String suffix) {
		return org.apache.commons.lang3.StringUtils.endsWith(str, suffix, true);
	}

	private static boolean endsWith(java.lang.String str, java.lang.String suffix, boolean ignoreCase) {
		if ((str == null) || (suffix == null)) {
			return (str == null) && (suffix == null);
		}
		if ((suffix.length()) > (str.length())) {
			return false;
		}
		int strOffset = (str.length()) - (suffix.length());
		return str.regionMatches(ignoreCase, strOffset, suffix, 0, suffix.length());
	}
}

