

package com.google.javascript.jscomp;


class Strings {
	private Strings() {
	}

	static java.lang.String truncateAtMaxLength(java.lang.String source, int maxLength, boolean addEllipsis) {
		if ((source.length()) <= maxLength) {
			return source;
		}
		if (addEllipsis && (maxLength > 3)) {
			return (com.google.javascript.jscomp.Strings.unicodePreservingSubstring(source, 0, (maxLength - 3))) + "...";
		}
		return com.google.javascript.jscomp.Strings.unicodePreservingSubstring(source, 0, maxLength);
	}

	private static int unicodePreservingIndex(java.lang.String str, int index) {
		if ((index > 0) && (index < (str.length()))) {
			if ((java.lang.Character.isHighSurrogate(str.charAt((index - 1)))) && (java.lang.Character.isLowSurrogate(str.charAt(index)))) {
				return index - 1;
			}
		}
		return index;
	}

	private static java.lang.String unicodePreservingSubstring(java.lang.String str, int begin, int end) {
		return str.substring(com.google.javascript.jscomp.Strings.unicodePreservingIndex(str, begin), com.google.javascript.jscomp.Strings.unicodePreservingIndex(str, end));
	}
}

