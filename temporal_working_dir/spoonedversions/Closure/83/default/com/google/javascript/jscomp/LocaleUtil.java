

package com.google.javascript.jscomp;


class LocaleUtil {
	private static final java.util.regex.Pattern LOCALE_PATTERN = java.util.regex.Pattern.compile("(^[^_-]*)(?:[_-]([^_-]*)(?:[_-]([^_-]*))?)?");

	static java.util.Locale getLocaleFromStandardLocaleString(java.lang.String s) {
		if (s == null) {
			return null;
		}
		java.util.regex.Matcher matcher = com.google.javascript.jscomp.LocaleUtil.LOCALE_PATTERN.matcher(s);
		matcher.find();
		java.lang.String language = com.google.javascript.jscomp.Strings.makeSafe(matcher.group(1));
		java.lang.String country = com.google.javascript.jscomp.Strings.makeSafe(matcher.group(2));
		java.lang.String variant = com.google.javascript.jscomp.Strings.makeSafe(matcher.group(3));
		return new java.util.Locale(language, country, variant);
	}
}

