

package org.apache.commons.lang.text;


public abstract class StrMatcher {
	private static final org.apache.commons.lang.text.StrMatcher COMMA_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharMatcher(',');

	private static final org.apache.commons.lang.text.StrMatcher TAB_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharMatcher('\t');

	private static final org.apache.commons.lang.text.StrMatcher SPACE_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharMatcher(' ');

	private static final org.apache.commons.lang.text.StrMatcher SPLIT_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharSetMatcher(" \t\n\r\f".toCharArray());

	private static final org.apache.commons.lang.text.StrMatcher TRIM_MATCHER = new org.apache.commons.lang.text.StrMatcher.TrimMatcher();

	private static final org.apache.commons.lang.text.StrMatcher SINGLE_QUOTE_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharMatcher('\'');

	private static final org.apache.commons.lang.text.StrMatcher DOUBLE_QUOTE_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharMatcher('"');

	private static final org.apache.commons.lang.text.StrMatcher QUOTE_MATCHER = new org.apache.commons.lang.text.StrMatcher.CharSetMatcher("\'\"".toCharArray());

	private static final org.apache.commons.lang.text.StrMatcher NONE_MATCHER = new org.apache.commons.lang.text.StrMatcher.NoMatcher();

	public static org.apache.commons.lang.text.StrMatcher commaMatcher() {
		return org.apache.commons.lang.text.StrMatcher.COMMA_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher tabMatcher() {
		return org.apache.commons.lang.text.StrMatcher.TAB_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher spaceMatcher() {
		return org.apache.commons.lang.text.StrMatcher.SPACE_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher splitMatcher() {
		return org.apache.commons.lang.text.StrMatcher.SPLIT_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher trimMatcher() {
		return org.apache.commons.lang.text.StrMatcher.TRIM_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher singleQuoteMatcher() {
		return org.apache.commons.lang.text.StrMatcher.SINGLE_QUOTE_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher doubleQuoteMatcher() {
		return org.apache.commons.lang.text.StrMatcher.DOUBLE_QUOTE_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher quoteMatcher() {
		return org.apache.commons.lang.text.StrMatcher.QUOTE_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher noneMatcher() {
		return org.apache.commons.lang.text.StrMatcher.NONE_MATCHER;
	}

	public static org.apache.commons.lang.text.StrMatcher charMatcher(char ch) {
		return new org.apache.commons.lang.text.StrMatcher.CharMatcher(ch);
	}

	public static org.apache.commons.lang.text.StrMatcher charSetMatcher(char[] chars) {
		if ((chars == null) || ((chars.length) == 0)) {
			return org.apache.commons.lang.text.StrMatcher.NONE_MATCHER;
		}
		if ((chars.length) == 1) {
			return new org.apache.commons.lang.text.StrMatcher.CharMatcher(chars[0]);
		}
		return new org.apache.commons.lang.text.StrMatcher.CharSetMatcher(chars);
	}

	public static org.apache.commons.lang.text.StrMatcher charSetMatcher(java.lang.String chars) {
		if ((chars == null) || ((chars.length()) == 0)) {
			return org.apache.commons.lang.text.StrMatcher.NONE_MATCHER;
		}
		if ((chars.length()) == 1) {
			return new org.apache.commons.lang.text.StrMatcher.CharMatcher(chars.charAt(0));
		}
		return new org.apache.commons.lang.text.StrMatcher.CharSetMatcher(chars.toCharArray());
	}

	public static org.apache.commons.lang.text.StrMatcher stringMatcher(java.lang.String str) {
		if ((str == null) || ((str.length()) == 0)) {
			return org.apache.commons.lang.text.StrMatcher.NONE_MATCHER;
		}
		return new org.apache.commons.lang.text.StrMatcher.StringMatcher(str);
	}

	protected StrMatcher() {
		super();
	}

	public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

	public int isMatch(char[] buffer, int pos) {
		return isMatch(buffer, pos, 0, buffer.length);
	}

	static final class CharSetMatcher extends org.apache.commons.lang.text.StrMatcher {
		private char[] chars;

		CharSetMatcher(char[] chars) {
			super();
			org.apache.commons.lang.text.StrMatcher.CharSetMatcher.this.chars = ((char[]) (chars.clone()));
			java.util.Arrays.sort(org.apache.commons.lang.text.StrMatcher.CharSetMatcher.this.chars);
		}

		public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
			return (java.util.Arrays.binarySearch(chars, buffer[pos])) >= 0 ? 1 : 0;
		}
	}

	static final class CharMatcher extends org.apache.commons.lang.text.StrMatcher {
		private char ch;

		CharMatcher(char ch) {
			super();
			org.apache.commons.lang.text.StrMatcher.CharMatcher.this.ch = ch;
		}

		public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
			return (ch) == (buffer[pos]) ? 1 : 0;
		}
	}

	static final class StringMatcher extends org.apache.commons.lang.text.StrMatcher {
		private char[] chars;

		StringMatcher(java.lang.String str) {
			super();
			chars = str.toCharArray();
		}

		public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
			int len = chars.length;
			if ((pos + len) > bufferEnd) {
				return 0;
			}
			for (int i = 0; i < (chars.length); i++ , pos++) {
				if ((chars[i]) != (buffer[pos])) {
					return 0;
				}
			}
			return len;
		}
	}

	static final class NoMatcher extends org.apache.commons.lang.text.StrMatcher {
		NoMatcher() {
			super();
		}

		public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
			return 0;
		}
	}

	static final class TrimMatcher extends org.apache.commons.lang.text.StrMatcher {
		TrimMatcher() {
			super();
		}

		public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
			return (buffer[pos]) <= 32 ? 1 : 0;
		}
	}
}

