

package org.jfree.chart.util;


public class StringUtilities {
	private StringUtilities() {
	}

	public static boolean startsWithIgnoreCase(java.lang.String base, java.lang.String start) {
		if ((base.length()) < (start.length())) {
			return false;
		}
		return base.regionMatches(true, 0, start, 0, start.length());
	}

	public static boolean endsWithIgnoreCase(java.lang.String base, java.lang.String end) {
		if ((base.length()) < (end.length())) {
			return false;
		}
		return base.regionMatches(true, ((base.length()) - (end.length())), end, 0, end.length());
	}

	public static java.lang.String getLineSeparator() {
		try {
			return java.lang.System.getProperty("line.separator", "\n");
		} catch (java.lang.Exception e) {
			return "\n";
		}
	}
}

