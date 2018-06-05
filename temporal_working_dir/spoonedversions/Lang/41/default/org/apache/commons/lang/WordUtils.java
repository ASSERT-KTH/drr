

package org.apache.commons.lang;


public class WordUtils {
	public WordUtils() {
		super();
	}

	public static java.lang.String wrap(java.lang.String str, int wrapLength) {
		return org.apache.commons.lang.WordUtils.wrap(str, wrapLength, null, false);
	}

	public static java.lang.String wrap(java.lang.String str, int wrapLength, java.lang.String newLineStr, boolean wrapLongWords) {
		if (str == null) {
			return null;
		}
		if (newLineStr == null) {
			newLineStr = org.apache.commons.lang.SystemUtils.LINE_SEPARATOR;
		}
		if (wrapLength < 1) {
			wrapLength = 1;
		}
		int inputLineLength = str.length();
		int offset = 0;
		java.lang.StringBuffer wrappedLine = new java.lang.StringBuffer((inputLineLength + 32));
		while ((inputLineLength - offset) > wrapLength) {
			if ((str.charAt(offset)) == ' ') {
				offset++;
				continue;
			}
			int spaceToWrapAt = str.lastIndexOf(' ', (wrapLength + offset));
			if (spaceToWrapAt >= offset) {
				wrappedLine.append(str.substring(offset, spaceToWrapAt));
				wrappedLine.append(newLineStr);
				offset = spaceToWrapAt + 1;
			}else {
				if (wrapLongWords) {
					wrappedLine.append(str.substring(offset, (wrapLength + offset)));
					wrappedLine.append(newLineStr);
					offset += wrapLength;
				}else {
					spaceToWrapAt = str.indexOf(' ', (wrapLength + offset));
					if (spaceToWrapAt >= 0) {
						wrappedLine.append(str.substring(offset, spaceToWrapAt));
						wrappedLine.append(newLineStr);
						offset = spaceToWrapAt + 1;
					}else {
						wrappedLine.append(str.substring(offset));
						offset = inputLineLength;
					}
				}
			}
		} 
		wrappedLine.append(str.substring(offset));
		return wrappedLine.toString();
	}

	public static java.lang.String capitalize(java.lang.String str) {
		return org.apache.commons.lang.WordUtils.capitalize(str, null);
	}

	public static java.lang.String capitalize(java.lang.String str, char[] delimiters) {
		int delimLen = delimiters == null ? -1 : delimiters.length;
		if (((str == null) || ((str.length()) == 0)) || (delimLen == 0)) {
			return str;
		}
		int strLen = str.length();
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(strLen);
		boolean capitalizeNext = true;
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (org.apache.commons.lang.WordUtils.isDelimiter(ch, delimiters)) {
				buffer.append(ch);
				capitalizeNext = true;
			}else
				if (capitalizeNext) {
					buffer.append(java.lang.Character.toTitleCase(ch));
					capitalizeNext = false;
				}else {
					buffer.append(ch);
				}
			
		}
		return buffer.toString();
	}

	public static java.lang.String capitalizeFully(java.lang.String str) {
		return org.apache.commons.lang.WordUtils.capitalizeFully(str, null);
	}

	public static java.lang.String capitalizeFully(java.lang.String str, char[] delimiters) {
		int delimLen = delimiters == null ? -1 : delimiters.length;
		if (((str == null) || ((str.length()) == 0)) || (delimLen == 0)) {
			return str;
		}
		str = str.toLowerCase();
		return org.apache.commons.lang.WordUtils.capitalize(str, delimiters);
	}

	public static java.lang.String uncapitalize(java.lang.String str) {
		return org.apache.commons.lang.WordUtils.uncapitalize(str, null);
	}

	public static java.lang.String uncapitalize(java.lang.String str, char[] delimiters) {
		int delimLen = delimiters == null ? -1 : delimiters.length;
		if (((str == null) || ((str.length()) == 0)) || (delimLen == 0)) {
			return str;
		}
		int strLen = str.length();
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(strLen);
		boolean uncapitalizeNext = true;
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (org.apache.commons.lang.WordUtils.isDelimiter(ch, delimiters)) {
				buffer.append(ch);
				uncapitalizeNext = true;
			}else
				if (uncapitalizeNext) {
					buffer.append(java.lang.Character.toLowerCase(ch));
					uncapitalizeNext = false;
				}else {
					buffer.append(ch);
				}
			
		}
		return buffer.toString();
	}

	public static java.lang.String swapCase(java.lang.String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0)) {
			return str;
		}
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(strLen);
		boolean whitespace = true;
		char ch = 0;
		char tmp = 0;
		for (int i = 0; i < strLen; i++) {
			ch = str.charAt(i);
			if (java.lang.Character.isUpperCase(ch)) {
				tmp = java.lang.Character.toLowerCase(ch);
			}else
				if (java.lang.Character.isTitleCase(ch)) {
					tmp = java.lang.Character.toLowerCase(ch);
				}else
					if (java.lang.Character.isLowerCase(ch)) {
						if (whitespace) {
							tmp = java.lang.Character.toTitleCase(ch);
						}else {
							tmp = java.lang.Character.toUpperCase(ch);
						}
					}else {
						tmp = ch;
					}
				
			
			buffer.append(tmp);
			whitespace = java.lang.Character.isWhitespace(ch);
		}
		return buffer.toString();
	}

	public static java.lang.String initials(java.lang.String str) {
		return org.apache.commons.lang.WordUtils.initials(str, null);
	}

	public static java.lang.String initials(java.lang.String str, char[] delimiters) {
		if ((str == null) || ((str.length()) == 0)) {
			return str;
		}
		if ((delimiters != null) && ((delimiters.length) == 0)) {
			return "";
		}
		int strLen = str.length();
		char[] buf = new char[(strLen / 2) + 1];
		int count = 0;
		boolean lastWasGap = true;
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);
			if (org.apache.commons.lang.WordUtils.isDelimiter(ch, delimiters)) {
				lastWasGap = true;
			}else
				if (lastWasGap) {
					buf[(count++)] = ch;
					lastWasGap = false;
				}else {
				}
			
		}
		return new java.lang.String(buf, 0, count);
	}

	private static boolean isDelimiter(char ch, char[] delimiters) {
		if (delimiters == null) {
			return java.lang.Character.isWhitespace(ch);
		}
		for (int i = 0, isize = delimiters.length; i < isize; i++) {
			if (ch == (delimiters[i])) {
				return true;
			}
		}
		return false;
	}

	public static java.lang.String abbreviate(java.lang.String str, int lower, int upper, java.lang.String appendToEnd) {
		if (str == null) {
			return null;
		}
		if ((str.length()) == 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		if (lower > (str.length())) {
			lower = str.length();
		}
		if ((upper == (-1)) || (upper > (str.length()))) {
			upper = str.length();
		}
		if (upper < lower) {
			upper = lower;
		}
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		int index = org.apache.commons.lang.StringUtils.indexOf(str, " ", lower);
		if (index == (-1)) {
			result.append(str.substring(0, upper));
			if (upper != (str.length())) {
				result.append(org.apache.commons.lang.StringUtils.defaultString(appendToEnd));
			}
		}else
			if (index > upper) {
				result.append(str.substring(0, upper));
				result.append(org.apache.commons.lang.StringUtils.defaultString(appendToEnd));
			}else {
				result.append(str.substring(0, index));
				result.append(org.apache.commons.lang.StringUtils.defaultString(appendToEnd));
			}
		
		return result.toString();
	}
}

