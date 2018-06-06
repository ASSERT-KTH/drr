

package com.google.javascript.jscomp;


class Strings {
	private Strings() {
	}

	static boolean isEmpty(@javax.annotation.Nullable
	java.lang.String string) {
		return (string == null) || (string.isEmpty());
	}

	static java.lang.String makeSafe(@javax.annotation.Nullable
	java.lang.String string) {
		return string == null ? "" : string;
	}

	static java.lang.String repeat(java.lang.String string, int count) {
		java.lang.StringBuilder builder = new java.lang.StringBuilder(((string.length()) * count));
		for (int i = 0; i < count; i++) {
			builder.append(string);
		}
		return builder.toString();
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

