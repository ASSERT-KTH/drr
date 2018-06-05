

package org.apache.commons.lang;


public class StringUtils {
	public static final java.lang.String EMPTY = "";

	public static final int INDEX_NOT_FOUND = -1;

	private static final int PAD_LIMIT = 8192;

	public StringUtils() {
		super();
	}

	public static boolean isEmpty(java.lang.String str) {
		return (str == null) || ((str.length()) == 0);
	}

	public static boolean isNotEmpty(java.lang.String str) {
		return !(org.apache.commons.lang.StringUtils.isEmpty(str));
	}

	public static boolean isBlank(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((java.lang.Character.isWhitespace(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(java.lang.String str) {
		return !(org.apache.commons.lang.StringUtils.isBlank(str));
	}

	public static java.lang.String clean(java.lang.String str) {
		return str == null ? org.apache.commons.lang.StringUtils.EMPTY : str.trim();
	}

	public static java.lang.String trim(java.lang.String str) {
		return str == null ? null : str.trim();
	}

	public static java.lang.String trimToNull(java.lang.String str) {
		java.lang.String ts = org.apache.commons.lang.StringUtils.trim(str);
		return org.apache.commons.lang.StringUtils.isEmpty(ts) ? null : ts;
	}

	public static java.lang.String trimToEmpty(java.lang.String str) {
		return str == null ? org.apache.commons.lang.StringUtils.EMPTY : str.trim();
	}

	public static java.lang.String strip(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.strip(str, null);
	}

	public static java.lang.String stripToNull(java.lang.String str) {
		if (str == null) {
			return null;
		}
		str = org.apache.commons.lang.StringUtils.strip(str, null);
		return (str.length()) == 0 ? null : str;
	}

	public static java.lang.String stripToEmpty(java.lang.String str) {
		return str == null ? org.apache.commons.lang.StringUtils.EMPTY : org.apache.commons.lang.StringUtils.strip(str, null);
	}

	public static java.lang.String strip(java.lang.String str, java.lang.String stripChars) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return str;
		}
		str = org.apache.commons.lang.StringUtils.stripStart(str, stripChars);
		return org.apache.commons.lang.StringUtils.stripEnd(str, stripChars);
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
				while ((start != strLen) && ((stripChars.indexOf(str.charAt(start))) != (-1))) {
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
				while ((end != 0) && ((stripChars.indexOf(str.charAt((end - 1)))) != (-1))) {
					end--;
				} 
			}
		
		return str.substring(0, end);
	}

	public static java.lang.String[] stripAll(java.lang.String[] strs) {
		return org.apache.commons.lang.StringUtils.stripAll(strs, null);
	}

	public static java.lang.String[] stripAll(java.lang.String[] strs, java.lang.String stripChars) {
		int strsLen;
		if ((strs == null) || ((strsLen = strs.length) == 0)) {
			return strs;
		}
		java.lang.String[] newArr = new java.lang.String[strsLen];
		for (int i = 0; i < strsLen; i++) {
			newArr[i] = org.apache.commons.lang.StringUtils.strip(strs[i], stripChars);
		}
		return newArr;
	}

	public static boolean equals(java.lang.String str1, java.lang.String str2) {
		return str1 == null ? str2 == null : str1.equals(str2);
	}

	public static boolean equalsIgnoreCase(java.lang.String str1, java.lang.String str2) {
		return str1 == null ? str2 == null : str1.equalsIgnoreCase(str2);
	}

	public static int indexOf(java.lang.String str, char searchChar) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return -1;
		}
		return str.indexOf(searchChar);
	}

	public static int indexOf(java.lang.String str, char searchChar, int startPos) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return -1;
		}
		return str.indexOf(searchChar, startPos);
	}

	public static int indexOf(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}
		return str.indexOf(searchStr);
	}

	public static int ordinalIndexOf(java.lang.String str, java.lang.String searchStr, int ordinal) {
		if (((str == null) || (searchStr == null)) || (ordinal <= 0)) {
			return org.apache.commons.lang.StringUtils.INDEX_NOT_FOUND;
		}
		if ((searchStr.length()) == 0) {
			return 0;
		}
		int found = 0;
		int index = org.apache.commons.lang.StringUtils.INDEX_NOT_FOUND;
		do {
			index = str.indexOf(searchStr, (index + 1));
			if (index < 0) {
				return index;
			}
			found++;
		} while (found < ordinal );
		return index;
	}

	public static int indexOf(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}
		if (((searchStr.length()) == 0) && (startPos >= (str.length()))) {
			return str.length();
		}
		return str.indexOf(searchStr, startPos);
	}

	public static int lastIndexOf(java.lang.String str, char searchChar) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return -1;
		}
		return str.lastIndexOf(searchChar);
	}

	public static int lastIndexOf(java.lang.String str, char searchChar, int startPos) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return -1;
		}
		return str.lastIndexOf(searchChar, startPos);
	}

	public static int lastIndexOf(java.lang.String str, java.lang.String searchStr) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}
		return str.lastIndexOf(searchStr);
	}

	public static int lastIndexOf(java.lang.String str, java.lang.String searchStr, int startPos) {
		if ((str == null) || (searchStr == null)) {
			return -1;
		}
		return str.lastIndexOf(searchStr, startPos);
	}

	public static boolean contains(java.lang.String str, char searchChar) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
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
		return org.apache.commons.lang.StringUtils.contains(str.toUpperCase(), searchStr.toUpperCase());
	}

	public static int indexOfAny(java.lang.String str, char[] searchChars) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.ArrayUtils.isEmpty(searchChars))) {
			return -1;
		}
		for (int i = 0; i < (str.length()); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < (searchChars.length); j++) {
				if ((searchChars[j]) == ch) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int indexOfAny(java.lang.String str, java.lang.String searchChars) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(searchChars))) {
			return -1;
		}
		return org.apache.commons.lang.StringUtils.indexOfAny(str, searchChars.toCharArray());
	}

	public static boolean containsAny(java.lang.String str, char[] searchChars) {
		if ((((str == null) || ((str.length()) == 0)) || (searchChars == null)) || ((searchChars.length) == 0)) {
			return false;
		}
		for (int i = 0; i < (str.length()); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < (searchChars.length); j++) {
				if ((searchChars[j]) == ch) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean containsAny(java.lang.String str, java.lang.String searchChars) {
		if (searchChars == null) {
			return false;
		}
		return org.apache.commons.lang.StringUtils.containsAny(str, searchChars.toCharArray());
	}

	public static int indexOfAnyBut(java.lang.String str, char[] searchChars) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.ArrayUtils.isEmpty(searchChars))) {
			return -1;
		}
		outer : for (int i = 0; i < (str.length()); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < (searchChars.length); j++) {
				if ((searchChars[j]) == ch) {
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}

	public static int indexOfAnyBut(java.lang.String str, java.lang.String searchChars) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(searchChars))) {
			return -1;
		}
		for (int i = 0; i < (str.length()); i++) {
			if ((searchChars.indexOf(str.charAt(i))) < 0) {
				return i;
			}
		}
		return -1;
	}

	public static boolean containsOnly(java.lang.String str, char[] valid) {
		if ((valid == null) || (str == null)) {
			return false;
		}
		if ((str.length()) == 0) {
			return true;
		}
		if ((valid.length) == 0) {
			return false;
		}
		return (org.apache.commons.lang.StringUtils.indexOfAnyBut(str, valid)) == (-1);
	}

	public static boolean containsOnly(java.lang.String str, java.lang.String validChars) {
		if ((str == null) || (validChars == null)) {
			return false;
		}
		return org.apache.commons.lang.StringUtils.containsOnly(str, validChars.toCharArray());
	}

	public static boolean containsNone(java.lang.String str, char[] invalidChars) {
		if ((str == null) || (invalidChars == null)) {
			return true;
		}
		int strSize = str.length();
		int validSize = invalidChars.length;
		for (int i = 0; i < strSize; i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < validSize; j++) {
				if ((invalidChars[j]) == ch) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean containsNone(java.lang.String str, java.lang.String invalidChars) {
		if ((str == null) || (invalidChars == null)) {
			return true;
		}
		return org.apache.commons.lang.StringUtils.containsNone(str, invalidChars.toCharArray());
	}

	public static int indexOfAny(java.lang.String str, java.lang.String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return -1;
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
			if (tmp == (-1)) {
				continue;
			}
			if (tmp < ret) {
				ret = tmp;
			}
		}
		return ret == (java.lang.Integer.MAX_VALUE) ? -1 : ret;
	}

	public static int lastIndexOfAny(java.lang.String str, java.lang.String[] searchStrs) {
		if ((str == null) || (searchStrs == null)) {
			return -1;
		}
		int sz = searchStrs.length;
		int ret = -1;
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
			return org.apache.commons.lang.StringUtils.EMPTY;
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
			return org.apache.commons.lang.StringUtils.EMPTY;
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
			return org.apache.commons.lang.StringUtils.EMPTY;
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
			return org.apache.commons.lang.StringUtils.EMPTY;
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
			return org.apache.commons.lang.StringUtils.EMPTY;
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
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (separator == null)) {
			return str;
		}
		if ((separator.length()) == 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int pos = str.indexOf(separator);
		if (pos == (-1)) {
			return str;
		}
		return str.substring(0, pos);
	}

	public static java.lang.String substringAfter(java.lang.String str, java.lang.String separator) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return str;
		}
		if (separator == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int pos = str.indexOf(separator);
		if (pos == (-1)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return str.substring((pos + (separator.length())));
	}

	public static java.lang.String substringBeforeLast(java.lang.String str, java.lang.String separator) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(separator))) {
			return str;
		}
		int pos = str.lastIndexOf(separator);
		if (pos == (-1)) {
			return str;
		}
		return str.substring(0, pos);
	}

	public static java.lang.String substringAfterLast(java.lang.String str, java.lang.String separator) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return str;
		}
		if (org.apache.commons.lang.StringUtils.isEmpty(separator)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int pos = str.lastIndexOf(separator);
		if ((pos == (-1)) || (pos == ((str.length()) - (separator.length())))) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return str.substring((pos + (separator.length())));
	}

	public static java.lang.String substringBetween(java.lang.String str, java.lang.String tag) {
		return org.apache.commons.lang.StringUtils.substringBetween(str, tag, tag);
	}

	public static java.lang.String substringBetween(java.lang.String str, java.lang.String open, java.lang.String close) {
		if (((str == null) || (open == null)) || (close == null)) {
			return null;
		}
		int start = str.indexOf(open);
		if (start != (-1)) {
			int end = str.indexOf(close, (start + (open.length())));
			if (end != (-1)) {
				return str.substring((start + (open.length())), end);
			}
		}
		return null;
	}

	public static java.lang.String[] substringsBetween(java.lang.String str, java.lang.String open, java.lang.String close) {
		if (((str == null) || (org.apache.commons.lang.StringUtils.isEmpty(open))) || (org.apache.commons.lang.StringUtils.isEmpty(close))) {
			return null;
		}
		int strLen = str.length();
		if (strLen == 0) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		int closeLen = close.length();
		int openLen = open.length();
		java.util.List list = new java.util.ArrayList();
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
		return ((java.lang.String[]) (list.toArray(new java.lang.String[list.size()])));
	}

	public static java.lang.String getNestedString(java.lang.String str, java.lang.String tag) {
		return org.apache.commons.lang.StringUtils.substringBetween(str, tag, tag);
	}

	public static java.lang.String getNestedString(java.lang.String str, java.lang.String open, java.lang.String close) {
		return org.apache.commons.lang.StringUtils.substringBetween(str, open, close);
	}

	public static java.lang.String[] split(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.split(str, null, (-1));
	}

	public static java.lang.String[] split(java.lang.String str, char separatorChar) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChar, false);
	}

	public static java.lang.String[] split(java.lang.String str, java.lang.String separatorChars) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChars, (-1), false);
	}

	public static java.lang.String[] split(java.lang.String str, java.lang.String separatorChars, int max) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChars, max, false);
	}

	public static java.lang.String[] splitByWholeSeparator(java.lang.String str, java.lang.String separator) {
		return org.apache.commons.lang.StringUtils.splitByWholeSeparatorWorker(str, separator, (-1), false);
	}

	public static java.lang.String[] splitByWholeSeparator(java.lang.String str, java.lang.String separator, int max) {
		return org.apache.commons.lang.StringUtils.splitByWholeSeparatorWorker(str, separator, max, false);
	}

	public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String str, java.lang.String separator) {
		return org.apache.commons.lang.StringUtils.splitByWholeSeparatorWorker(str, separator, (-1), true);
	}

	public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String str, java.lang.String separator, int max) {
		return org.apache.commons.lang.StringUtils.splitByWholeSeparatorWorker(str, separator, max, true);
	}

	private static java.lang.String[] splitByWholeSeparatorWorker(java.lang.String str, java.lang.String separator, int max, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		if ((separator == null) || (org.apache.commons.lang.StringUtils.EMPTY.equals(separator))) {
			return org.apache.commons.lang.StringUtils.splitWorker(str, null, max, preserveAllTokens);
		}
		int separatorLength = separator.length();
		java.util.ArrayList substrings = new java.util.ArrayList();
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
							substrings.add(org.apache.commons.lang.StringUtils.EMPTY);
						}
					}
					beg = end + separatorLength;
				}
			}else {
				substrings.add(str.substring(beg));
				end = len;
			}
		} 
		return ((java.lang.String[]) (substrings.toArray(new java.lang.String[substrings.size()])));
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, null, (-1), true);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, char separatorChar) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChar, true);
	}

	private static java.lang.String[] splitWorker(java.lang.String str, char separatorChar, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		java.util.List list = new java.util.ArrayList();
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
		return ((java.lang.String[]) (list.toArray(new java.lang.String[list.size()])));
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, java.lang.String separatorChars) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChars, (-1), true);
	}

	public static java.lang.String[] splitPreserveAllTokens(java.lang.String str, java.lang.String separatorChars, int max) {
		return org.apache.commons.lang.StringUtils.splitWorker(str, separatorChars, max, true);
	}

	private static java.lang.String[] splitWorker(java.lang.String str, java.lang.String separatorChars, int max, boolean preserveAllTokens) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (len == 0) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		java.util.List list = new java.util.ArrayList();
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
		return ((java.lang.String[]) (list.toArray(new java.lang.String[list.size()])));
	}

	public static java.lang.String[] splitByCharacterType(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.splitByCharacterType(str, false);
	}

	public static java.lang.String[] splitByCharacterTypeCamelCase(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.splitByCharacterType(str, true);
	}

	private static java.lang.String[] splitByCharacterType(java.lang.String str, boolean camelCase) {
		if (str == null) {
			return null;
		}
		if ((str.length()) == 0) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		char[] c = str.toCharArray();
		java.util.List list = new java.util.ArrayList();
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
		return ((java.lang.String[]) (list.toArray(new java.lang.String[list.size()])));
	}

	public static java.lang.String concatenate(java.lang.Object[] array) {
		return org.apache.commons.lang.StringUtils.join(array, null);
	}

	public static java.lang.String join(java.lang.Object[] array) {
		return org.apache.commons.lang.StringUtils.join(array, null);
	}

	public static java.lang.String join(java.lang.Object[] array, char separator) {
		if (array == null) {
			return null;
		}
		return org.apache.commons.lang.StringUtils.join(array, separator, 0, array.length);
	}

	public static java.lang.String join(java.lang.Object[] array, char separator, int startIndex, int endIndex) {
		if (array == null) {
			return null;
		}
		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		bufSize *= ((array[startIndex]) == null ? 16 : array[startIndex].toString().length()) + 1;
		java.lang.StringBuffer buf = new java.lang.StringBuffer(bufSize);
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
		return org.apache.commons.lang.StringUtils.join(array, separator, 0, array.length);
	}

	public static java.lang.String join(java.lang.Object[] array, java.lang.String separator, int startIndex, int endIndex) {
		if (array == null) {
			return null;
		}
		if (separator == null) {
			separator = org.apache.commons.lang.StringUtils.EMPTY;
		}
		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		bufSize *= ((array[startIndex]) == null ? 16 : array[startIndex].toString().length()) + (separator.length());
		java.lang.StringBuffer buf = new java.lang.StringBuffer(bufSize);
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

	public static java.lang.String join(java.util.Iterator iterator, char separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		java.lang.Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang.ObjectUtils.toString(first);
		}
		java.lang.StringBuffer buf = new java.lang.StringBuffer(256);
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

	public static java.lang.String join(java.util.Iterator iterator, java.lang.String separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		java.lang.Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return org.apache.commons.lang.ObjectUtils.toString(first);
		}
		java.lang.StringBuffer buf = new java.lang.StringBuffer(256);
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

	public static java.lang.String join(java.util.Collection collection, char separator) {
		if (collection == null) {
			return null;
		}
		return org.apache.commons.lang.StringUtils.join(collection.iterator(), separator);
	}

	public static java.lang.String join(java.util.Collection collection, java.lang.String separator) {
		if (collection == null) {
			return null;
		}
		return org.apache.commons.lang.StringUtils.join(collection.iterator(), separator);
	}

	public static java.lang.String deleteSpaces(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return org.apache.commons.lang.CharSetUtils.delete(str, " \t\r\n\b");
	}

	public static java.lang.String deleteWhitespace(java.lang.String str) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
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
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (str.startsWith(remove)) {
			return str.substring(remove.length());
		}
		return str;
	}

	public static java.lang.String removeStartIgnoreCase(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (org.apache.commons.lang.StringUtils.startsWithIgnoreCase(str, remove)) {
			return str.substring(remove.length());
		}
		return str;
	}

	public static java.lang.String removeEnd(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (str.endsWith(remove)) {
			return str.substring(0, ((str.length()) - (remove.length())));
		}
		return str;
	}

	public static java.lang.String removeEndIgnoreCase(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(remove))) {
			return str;
		}
		if (org.apache.commons.lang.StringUtils.endsWithIgnoreCase(str, remove)) {
			return str.substring(0, ((str.length()) - (remove.length())));
		}
		return str;
	}

	public static java.lang.String remove(java.lang.String str, java.lang.String remove) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(remove))) {
			return str;
		}
		return org.apache.commons.lang.StringUtils.replace(str, remove, org.apache.commons.lang.StringUtils.EMPTY, (-1));
	}

	public static java.lang.String remove(java.lang.String str, char remove) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || ((str.indexOf(remove)) == (-1))) {
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
		return org.apache.commons.lang.StringUtils.replace(text, searchString, replacement, 1);
	}

	public static java.lang.String replace(java.lang.String text, java.lang.String searchString, java.lang.String replacement) {
		return org.apache.commons.lang.StringUtils.replace(text, searchString, replacement, (-1));
	}

	public static java.lang.String replace(java.lang.String text, java.lang.String searchString, java.lang.String replacement, int max) {
		if ((((org.apache.commons.lang.StringUtils.isEmpty(text)) || (org.apache.commons.lang.StringUtils.isEmpty(searchString))) || (replacement == null)) || (max == 0)) {
			return text;
		}
		int start = 0;
		int end = text.indexOf(searchString, start);
		if (end == (-1)) {
			return text;
		}
		int replLength = searchString.length();
		int increase = (replacement.length()) - replLength;
		increase = (increase < 0) ? 0 : increase;
		increase *= (max < 0) ? 16 : max > 64 ? 64 : max;
		java.lang.StringBuffer buf = new java.lang.StringBuffer(((text.length()) + increase));
		while (end != (-1)) {
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
		return org.apache.commons.lang.StringUtils.replaceEach(text, searchList, replacementList, false, 0);
	}

	public static java.lang.String replaceEachRepeatedly(java.lang.String text, java.lang.String[] searchList, java.lang.String[] replacementList) {
		int timeToLive = searchList == null ? 0 : searchList.length;
		return org.apache.commons.lang.StringUtils.replaceEach(text, searchList, replacementList, true, timeToLive);
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
			int greater = (replacementList[i].length()) - (searchList[i].length());
			if (greater > 0) {
				increase += 3 * greater;
			}
		}
		increase = java.lang.Math.min(increase, ((text.length()) / 5));
		java.lang.StringBuffer buf = new java.lang.StringBuffer(((text.length()) + increase));
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
		return org.apache.commons.lang.StringUtils.replaceEach(result, searchList, replacementList, repeat, (timeToLive - 1));
	}

	public static java.lang.String replaceChars(java.lang.String str, char searchChar, char replaceChar) {
		if (str == null) {
			return null;
		}
		return str.replace(searchChar, replaceChar);
	}

	public static java.lang.String replaceChars(java.lang.String str, java.lang.String searchChars, java.lang.String replaceChars) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(searchChars))) {
			return str;
		}
		if (replaceChars == null) {
			replaceChars = org.apache.commons.lang.StringUtils.EMPTY;
		}
		boolean modified = false;
		int replaceCharsLength = replaceChars.length();
		int strLength = str.length();
		java.lang.StringBuffer buf = new java.lang.StringBuffer(strLength);
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

	public static java.lang.String overlayString(java.lang.String text, java.lang.String overlay, int start, int end) {
		return new java.lang.StringBuffer(((((start + (overlay.length())) + (text.length())) - end) + 1)).append(text.substring(0, start)).append(overlay).append(text.substring(end)).toString();
	}

	public static java.lang.String overlay(java.lang.String str, java.lang.String overlay, int start, int end) {
		if (str == null) {
			return null;
		}
		if (overlay == null) {
			overlay = org.apache.commons.lang.StringUtils.EMPTY;
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
		return new java.lang.StringBuffer(((((len + start) - end) + (overlay.length())) + 1)).append(str.substring(0, start)).append(overlay).append(str.substring(end)).toString();
	}

	public static java.lang.String chomp(java.lang.String str) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return str;
		}
		if ((str.length()) == 1) {
			char ch = str.charAt(0);
			if ((ch == (org.apache.commons.lang.CharUtils.CR)) || (ch == (org.apache.commons.lang.CharUtils.LF))) {
				return org.apache.commons.lang.StringUtils.EMPTY;
			}
			return str;
		}
		int lastIdx = (str.length()) - 1;
		char last = str.charAt(lastIdx);
		if (last == (org.apache.commons.lang.CharUtils.LF)) {
			if ((str.charAt((lastIdx - 1))) == (org.apache.commons.lang.CharUtils.CR)) {
				lastIdx--;
			}
		}else
			if (last != (org.apache.commons.lang.CharUtils.CR)) {
				lastIdx++;
			}
		
		return str.substring(0, lastIdx);
	}

	public static java.lang.String chomp(java.lang.String str, java.lang.String separator) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (separator == null)) {
			return str;
		}
		if (str.endsWith(separator)) {
			return str.substring(0, ((str.length()) - (separator.length())));
		}
		return str;
	}

	public static java.lang.String chompLast(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.chompLast(str, "\n");
	}

	public static java.lang.String chompLast(java.lang.String str, java.lang.String sep) {
		if ((str.length()) == 0) {
			return str;
		}
		java.lang.String sub = str.substring(((str.length()) - (sep.length())));
		if (sep.equals(sub)) {
			return str.substring(0, ((str.length()) - (sep.length())));
		}
		return str;
	}

	public static java.lang.String getChomp(java.lang.String str, java.lang.String sep) {
		int idx = str.lastIndexOf(sep);
		if (idx == ((str.length()) - (sep.length()))) {
			return sep;
		}else
			if (idx != (-1)) {
				return str.substring(idx);
			}else {
				return org.apache.commons.lang.StringUtils.EMPTY;
			}
		
	}

	public static java.lang.String prechomp(java.lang.String str, java.lang.String sep) {
		int idx = str.indexOf(sep);
		if (idx == (-1)) {
			return str;
		}
		return str.substring((idx + (sep.length())));
	}

	public static java.lang.String getPrechomp(java.lang.String str, java.lang.String sep) {
		int idx = str.indexOf(sep);
		if (idx == (-1)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return str.substring(0, (idx + (sep.length())));
	}

	public static java.lang.String chop(java.lang.String str) {
		if (str == null) {
			return null;
		}
		int strLen = str.length();
		if (strLen < 2) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int lastIdx = strLen - 1;
		java.lang.String ret = str.substring(0, lastIdx);
		char last = str.charAt(lastIdx);
		if (last == (org.apache.commons.lang.CharUtils.LF)) {
			if ((ret.charAt((lastIdx - 1))) == (org.apache.commons.lang.CharUtils.CR)) {
				return ret.substring(0, (lastIdx - 1));
			}
		}
		return ret;
	}

	public static java.lang.String chopNewline(java.lang.String str) {
		int lastIdx = (str.length()) - 1;
		if (lastIdx <= 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		char last = str.charAt(lastIdx);
		if (last == (org.apache.commons.lang.CharUtils.LF)) {
			if ((str.charAt((lastIdx - 1))) == (org.apache.commons.lang.CharUtils.CR)) {
				lastIdx--;
			}
		}else {
			lastIdx++;
		}
		return str.substring(0, lastIdx);
	}

	public static java.lang.String escape(java.lang.String str) {
		return org.apache.commons.lang.StringEscapeUtils.escapeJava(str);
	}

	public static java.lang.String repeat(java.lang.String str, int repeat) {
		if (str == null) {
			return null;
		}
		if (repeat <= 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int inputLength = str.length();
		if ((repeat == 1) || (inputLength == 0)) {
			return str;
		}
		if ((inputLength == 1) && (repeat <= (org.apache.commons.lang.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang.StringUtils.padding(repeat, str.charAt(0));
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
				java.lang.StringBuffer buf = new java.lang.StringBuffer(outputLength);
				for (int i = 0; i < repeat; i++) {
					buf.append(str);
				}
				return buf.toString();
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
		return org.apache.commons.lang.StringUtils.rightPad(str, size, ' ');
	}

	public static java.lang.String rightPad(java.lang.String str, int size, char padChar) {
		if (str == null) {
			return null;
		}
		int pads = size - (str.length());
		if (pads <= 0) {
			return str;
		}
		if (pads > (org.apache.commons.lang.StringUtils.PAD_LIMIT)) {
			return org.apache.commons.lang.StringUtils.rightPad(str, size, java.lang.String.valueOf(padChar));
		}
		return str.concat(org.apache.commons.lang.StringUtils.padding(pads, padChar));
	}

	public static java.lang.String rightPad(java.lang.String str, int size, java.lang.String padStr) {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int padLen = padStr.length();
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		if ((padLen == 1) && (pads <= (org.apache.commons.lang.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang.StringUtils.rightPad(str, size, padStr.charAt(0));
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
		return org.apache.commons.lang.StringUtils.leftPad(str, size, ' ');
	}

	public static java.lang.String leftPad(java.lang.String str, int size, char padChar) {
		if (str == null) {
			return null;
		}
		int pads = size - (str.length());
		if (pads <= 0) {
			return str;
		}
		if (pads > (org.apache.commons.lang.StringUtils.PAD_LIMIT)) {
			return org.apache.commons.lang.StringUtils.leftPad(str, size, java.lang.String.valueOf(padChar));
		}
		return org.apache.commons.lang.StringUtils.padding(pads, padChar).concat(str);
	}

	public static java.lang.String leftPad(java.lang.String str, int size, java.lang.String padStr) {
		if (str == null) {
			return null;
		}
		if (org.apache.commons.lang.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int padLen = padStr.length();
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		if ((padLen == 1) && (pads <= (org.apache.commons.lang.StringUtils.PAD_LIMIT))) {
			return org.apache.commons.lang.StringUtils.leftPad(str, size, padStr.charAt(0));
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

	public static int length(java.lang.String str) {
		return str == null ? 0 : str.length();
	}

	public static java.lang.String center(java.lang.String str, int size) {
		return org.apache.commons.lang.StringUtils.center(str, size, ' ');
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
		str = org.apache.commons.lang.StringUtils.leftPad(str, (strLen + (pads / 2)), padChar);
		str = org.apache.commons.lang.StringUtils.rightPad(str, size, padChar);
		return str;
	}

	public static java.lang.String center(java.lang.String str, int size, java.lang.String padStr) {
		if ((str == null) || (size <= 0)) {
			return str;
		}
		if (org.apache.commons.lang.StringUtils.isEmpty(padStr)) {
			padStr = " ";
		}
		int strLen = str.length();
		int pads = size - strLen;
		if (pads <= 0) {
			return str;
		}
		str = org.apache.commons.lang.StringUtils.leftPad(str, (strLen + (pads / 2)), padStr);
		str = org.apache.commons.lang.StringUtils.rightPad(str, size, padStr);
		return str;
	}

	public static java.lang.String upperCase(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase();
	}

	public static java.lang.String lowerCase(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return str.toLowerCase();
	}

	public static java.lang.String capitalize(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		return new java.lang.StringBuffer(strLen).append(java.lang.Character.toTitleCase(str.charAt(0))).append(str.substring(1)).toString();
	}

	public static java.lang.String capitalise(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.capitalize(str);
	}

	public static java.lang.String uncapitalize(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		return new java.lang.StringBuffer(strLen).append(java.lang.Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}

	public static java.lang.String uncapitalise(java.lang.String str) {
		return org.apache.commons.lang.StringUtils.uncapitalize(str);
	}

	public static java.lang.String swapCase(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(strLen);
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

	public static java.lang.String capitaliseAllWords(java.lang.String str) {
		return org.apache.commons.lang.WordUtils.capitalize(str);
	}

	public static int countMatches(java.lang.String str, java.lang.String sub) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(sub))) {
			return 0;
		}
		int count = 0;
		int idx = 0;
		while ((idx = str.indexOf(sub, idx)) != (-1)) {
			count++;
			idx += sub.length();
		} 
		return count;
	}

	public static boolean isAlpha(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isLetter(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphaSpace(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isLetter(str.charAt(i))) == false) && ((str.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphanumeric(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isLetterOrDigit(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlphanumericSpace(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isLetterOrDigit(str.charAt(i))) == false) && ((str.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAsciiPrintable(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if ((org.apache.commons.lang.CharUtils.isAsciiPrintable(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumeric(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isDigit(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumericSpace(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if (((java.lang.Character.isDigit(str.charAt(i))) == false) && ((str.charAt(i)) != ' ')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isWhitespace(java.lang.String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if ((java.lang.Character.isWhitespace(str.charAt(i))) == false) {
				return false;
			}
		}
		return true;
	}

	public static java.lang.String defaultString(java.lang.String str) {
		return str == null ? org.apache.commons.lang.StringUtils.EMPTY : str;
	}

	public static java.lang.String defaultString(java.lang.String str, java.lang.String defaultStr) {
		return str == null ? defaultStr : str;
	}

	public static java.lang.String defaultIfEmpty(java.lang.String str, java.lang.String defaultStr) {
		return org.apache.commons.lang.StringUtils.isEmpty(str) ? defaultStr : str;
	}

	public static java.lang.String reverse(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return new java.lang.StringBuffer(str).reverse().toString();
	}

	public static java.lang.String reverseDelimited(java.lang.String str, char separatorChar) {
		if (str == null) {
			return null;
		}
		java.lang.String[] strs = org.apache.commons.lang.StringUtils.split(str, separatorChar);
		org.apache.commons.lang.ArrayUtils.reverse(strs);
		return org.apache.commons.lang.StringUtils.join(strs, separatorChar);
	}

	public static java.lang.String reverseDelimitedString(java.lang.String str, java.lang.String separatorChars) {
		if (str == null) {
			return null;
		}
		java.lang.String[] strs = org.apache.commons.lang.StringUtils.split(str, separatorChars);
		org.apache.commons.lang.ArrayUtils.reverse(strs);
		if (separatorChars == null) {
			return org.apache.commons.lang.StringUtils.join(strs, ' ');
		}
		return org.apache.commons.lang.StringUtils.join(strs, separatorChars);
	}

	public static java.lang.String abbreviate(java.lang.String str, int maxWidth) {
		return org.apache.commons.lang.StringUtils.abbreviate(str, 0, maxWidth);
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
		if (offset <= 4) {
			return (str.substring(0, (maxWidth - 3))) + "...";
		}
		if (maxWidth < 7) {
			throw new java.lang.IllegalArgumentException("Minimum abbreviation width with offset is 7");
		}
		if ((offset + (maxWidth - 3)) < (str.length())) {
			return "..." + (org.apache.commons.lang.StringUtils.abbreviate(str.substring(offset), (maxWidth - 3)));
		}
		return "..." + (str.substring(((str.length()) - (maxWidth - 3))));
	}

	public static java.lang.String difference(java.lang.String str1, java.lang.String str2) {
		if (str1 == null) {
			return str2;
		}
		if (str2 == null) {
			return str1;
		}
		int at = org.apache.commons.lang.StringUtils.indexOfDifference(str1, str2);
		if (at == (-1)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return str2.substring(at);
	}

	public static int indexOfDifference(java.lang.String str1, java.lang.String str2) {
		if (str1 == str2) {
			return -1;
		}
		if ((str1 == null) || (str2 == null)) {
			return 0;
		}
		int i;
		for (i = 0; (i < (str1.length())) && (i < (str2.length())); ++i) {
			if ((str1.charAt(i)) != (str2.charAt(i))) {
				break;
			}
		}
		if ((i < (str2.length())) || (i < (str1.length()))) {
			return i;
		}
		return -1;
	}

	public static int indexOfDifference(java.lang.String[] strs) {
		if ((strs == null) || ((strs.length) <= 1)) {
			return -1;
		}
		boolean anyStringNull = false;
		boolean allStringsNull = true;
		int arrayLen = strs.length;
		int shortestStrLen = java.lang.Integer.MAX_VALUE;
		int longestStrLen = 0;
		for (int i = 0; i < arrayLen; i++) {
			if ((strs[i]) == null) {
				anyStringNull = true;
				shortestStrLen = 0;
			}else {
				allStringsNull = false;
				shortestStrLen = java.lang.Math.min(strs[i].length(), shortestStrLen);
				longestStrLen = java.lang.Math.max(strs[i].length(), longestStrLen);
			}
		}
		if (allStringsNull || ((longestStrLen == 0) && (!anyStringNull))) {
			return -1;
		}
		if (shortestStrLen == 0) {
			return 0;
		}
		int firstDiff = -1;
		for (int stringPos = 0; stringPos < shortestStrLen; stringPos++) {
			char comparisonChar = strs[0].charAt(stringPos);
			for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
				if ((strs[arrayPos].charAt(stringPos)) != comparisonChar) {
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

	public static java.lang.String getCommonPrefix(java.lang.String[] strs) {
		if ((strs == null) || ((strs.length) == 0)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int smallestIndexOfDiff = org.apache.commons.lang.StringUtils.indexOfDifference(strs);
		if (smallestIndexOfDiff == (-1)) {
			if ((strs[0]) == null) {
				return org.apache.commons.lang.StringUtils.EMPTY;
			}
			return strs[0];
		}else
			if (smallestIndexOfDiff == 0) {
				return org.apache.commons.lang.StringUtils.EMPTY;
			}else {
				return strs[0].substring(0, smallestIndexOfDiff);
			}
		
	}

	public static int getLevenshteinDistance(java.lang.String s, java.lang.String t) {
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
			java.lang.String tmp = s;
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
		return org.apache.commons.lang.StringUtils.startsWith(str, prefix, false);
	}

	public static boolean startsWithIgnoreCase(java.lang.String str, java.lang.String prefix) {
		return org.apache.commons.lang.StringUtils.startsWith(str, prefix, true);
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

	public static boolean endsWith(java.lang.String str, java.lang.String suffix) {
		return org.apache.commons.lang.StringUtils.endsWith(str, suffix, false);
	}

	public static boolean endsWithIgnoreCase(java.lang.String str, java.lang.String suffix) {
		return org.apache.commons.lang.StringUtils.endsWith(str, suffix, true);
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

