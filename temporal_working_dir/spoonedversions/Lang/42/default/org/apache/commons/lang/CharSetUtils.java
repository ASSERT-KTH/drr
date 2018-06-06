

package org.apache.commons.lang;


public class CharSetUtils {
	public CharSetUtils() {
		super();
	}

	public static org.apache.commons.lang.CharSet evaluateSet(java.lang.String[] set) {
		if (set == null) {
			return null;
		}
		return new org.apache.commons.lang.CharSet(set);
	}

	public static java.lang.String squeeze(java.lang.String str, java.lang.String set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(set))) {
			return str;
		}
		java.lang.String[] strs = new java.lang.String[1];
		strs[0] = set;
		return org.apache.commons.lang.CharSetUtils.squeeze(str, strs);
	}

	public static java.lang.String squeeze(java.lang.String str, java.lang.String[] set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.ArrayUtils.isEmpty(set))) {
			return str;
		}
		org.apache.commons.lang.CharSet chars = org.apache.commons.lang.CharSet.getInstance(set);
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(str.length());
		char[] chrs = str.toCharArray();
		int sz = chrs.length;
		char lastChar = ' ';
		char ch = ' ';
		for (int i = 0; i < sz; i++) {
			ch = chrs[i];
			if (chars.contains(ch)) {
				if ((ch == lastChar) && (i != 0)) {
					continue;
				}
			}
			buffer.append(ch);
			lastChar = ch;
		}
		return buffer.toString();
	}

	public static int count(java.lang.String str, java.lang.String set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(set))) {
			return 0;
		}
		java.lang.String[] strs = new java.lang.String[1];
		strs[0] = set;
		return org.apache.commons.lang.CharSetUtils.count(str, strs);
	}

	public static int count(java.lang.String str, java.lang.String[] set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.ArrayUtils.isEmpty(set))) {
			return 0;
		}
		org.apache.commons.lang.CharSet chars = org.apache.commons.lang.CharSet.getInstance(set);
		int count = 0;
		char[] chrs = str.toCharArray();
		int sz = chrs.length;
		for (int i = 0; i < sz; i++) {
			if (chars.contains(chrs[i])) {
				count++;
			}
		}
		return count;
	}

	public static java.lang.String keep(java.lang.String str, java.lang.String set) {
		if (str == null) {
			return null;
		}
		if (((str.length()) == 0) || (org.apache.commons.lang.StringUtils.isEmpty(set))) {
			return "";
		}
		java.lang.String[] strs = new java.lang.String[1];
		strs[0] = set;
		return org.apache.commons.lang.CharSetUtils.keep(str, strs);
	}

	public static java.lang.String keep(java.lang.String str, java.lang.String[] set) {
		if (str == null) {
			return null;
		}
		if (((str.length()) == 0) || (org.apache.commons.lang.ArrayUtils.isEmpty(set))) {
			return "";
		}
		return org.apache.commons.lang.CharSetUtils.modify(str, set, true);
	}

	public static java.lang.String delete(java.lang.String str, java.lang.String set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.StringUtils.isEmpty(set))) {
			return str;
		}
		java.lang.String[] strs = new java.lang.String[1];
		strs[0] = set;
		return org.apache.commons.lang.CharSetUtils.delete(str, strs);
	}

	public static java.lang.String delete(java.lang.String str, java.lang.String[] set) {
		if ((org.apache.commons.lang.StringUtils.isEmpty(str)) || (org.apache.commons.lang.ArrayUtils.isEmpty(set))) {
			return str;
		}
		return org.apache.commons.lang.CharSetUtils.modify(str, set, false);
	}

	private static java.lang.String modify(java.lang.String str, java.lang.String[] set, boolean expect) {
		org.apache.commons.lang.CharSet chars = org.apache.commons.lang.CharSet.getInstance(set);
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(str.length());
		char[] chrs = str.toCharArray();
		int sz = chrs.length;
		for (int i = 0; i < sz; i++) {
			if ((chars.contains(chrs[i])) == expect) {
				buffer.append(chrs[i]);
			}
		}
		return buffer.toString();
	}

	public static java.lang.String translate(java.lang.String str, java.lang.String searchChars, java.lang.String replaceChars) {
		if (org.apache.commons.lang.StringUtils.isEmpty(str)) {
			return str;
		}
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(str.length());
		char[] chrs = str.toCharArray();
		char[] withChrs = replaceChars.toCharArray();
		int sz = chrs.length;
		int withMax = (replaceChars.length()) - 1;
		for (int i = 0; i < sz; i++) {
			int idx = searchChars.indexOf(chrs[i]);
			if (idx != (-1)) {
				if (idx > withMax) {
					idx = withMax;
				}
				buffer.append(withChrs[idx]);
			}else {
				buffer.append(chrs[i]);
			}
		}
		return buffer.toString();
	}
}

