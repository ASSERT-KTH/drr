

package org.apache.commons.lang;


public class LocaleUtils {
	private static java.util.List<java.util.Locale> cAvailableLocaleList;

	private static java.util.Set<java.util.Locale> cAvailableLocaleSet;

	private static final java.util.Map<java.lang.String, java.util.List<java.util.Locale>> cLanguagesByCountry = java.util.Collections.synchronizedMap(new java.util.HashMap<java.lang.String, java.util.List<java.util.Locale>>());

	private static final java.util.Map<java.lang.String, java.util.List<java.util.Locale>> cCountriesByLanguage = java.util.Collections.synchronizedMap(new java.util.HashMap<java.lang.String, java.util.List<java.util.Locale>>());

	public LocaleUtils() {
		super();
	}

	public static java.util.Locale toLocale(java.lang.String str) {
		if (str == null) {
			return null;
		}
		int len = str.length();
		if (((len != 2) && (len != 5)) && (len < 7)) {
			throw new java.lang.IllegalArgumentException(("Invalid locale format: " + str));
		}
		char ch0 = str.charAt(0);
		char ch1 = str.charAt(1);
		if ((((ch0 < 'a') || (ch0 > 'z')) || (ch1 < 'a')) || (ch1 > 'z')) {
			throw new java.lang.IllegalArgumentException(("Invalid locale format: " + str));
		}
		if (len == 2) {
			return new java.util.Locale(str, "");
		}else {
			if ((str.charAt(2)) != '_') {
				throw new java.lang.IllegalArgumentException(("Invalid locale format: " + str));
			}
			char ch3 = str.charAt(3);
			if (ch3 == '_') {
				return new java.util.Locale(str.substring(0, 2), "", str.substring(4));
			}
			char ch4 = str.charAt(4);
			if ((((ch3 < 'A') || (ch3 > 'Z')) || (ch4 < 'A')) || (ch4 > 'Z')) {
				throw new java.lang.IllegalArgumentException(("Invalid locale format: " + str));
			}
			if (len == 5) {
				return new java.util.Locale(str.substring(0, 2), str.substring(3, 5));
			}else {
				if ((str.charAt(5)) != '_') {
					throw new java.lang.IllegalArgumentException(("Invalid locale format: " + str));
				}
				return new java.util.Locale(str.substring(0, 2), str.substring(3, 5), str.substring(6));
			}
		}
	}

	public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale locale) {
		return org.apache.commons.lang.LocaleUtils.localeLookupList(locale, locale);
	}

	public static java.util.List<java.util.Locale> localeLookupList(java.util.Locale locale, java.util.Locale defaultLocale) {
		java.util.List<java.util.Locale> list = new java.util.ArrayList<java.util.Locale>(4);
		if (locale != null) {
			list.add(locale);
			if ((locale.getVariant().length()) > 0) {
				list.add(new java.util.Locale(locale.getLanguage(), locale.getCountry()));
			}
			if ((locale.getCountry().length()) > 0) {
				list.add(new java.util.Locale(locale.getLanguage(), ""));
			}
			if ((list.contains(defaultLocale)) == false) {
				list.add(defaultLocale);
			}
		}
		return java.util.Collections.unmodifiableList(list);
	}

	public static java.util.List<java.util.Locale> availableLocaleList() {
		if ((org.apache.commons.lang.LocaleUtils.cAvailableLocaleList) == null) {
			org.apache.commons.lang.LocaleUtils.initAvailableLocaleList();
		}
		return org.apache.commons.lang.LocaleUtils.cAvailableLocaleList;
	}

	private static synchronized void initAvailableLocaleList() {
		if ((org.apache.commons.lang.LocaleUtils.cAvailableLocaleList) == null) {
			java.util.List<java.util.Locale> list = java.util.Arrays.asList(java.util.Locale.getAvailableLocales());
			org.apache.commons.lang.LocaleUtils.cAvailableLocaleList = java.util.Collections.unmodifiableList(list);
		}
	}

	public static java.util.Set<java.util.Locale> availableLocaleSet() {
		if ((org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet) == null) {
			org.apache.commons.lang.LocaleUtils.initAvailableLocaleSet();
		}
		return org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet;
	}

	private static synchronized void initAvailableLocaleSet() {
		if ((org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet) == null) {
			org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet = java.util.Collections.unmodifiableSet(new java.util.HashSet<java.util.Locale>(org.apache.commons.lang.LocaleUtils.availableLocaleList()));
		}
	}

	public static boolean isAvailableLocale(java.util.Locale locale) {
		return org.apache.commons.lang.LocaleUtils.availableLocaleList().contains(locale);
	}

	public static java.util.List<java.util.Locale> languagesByCountry(java.lang.String countryCode) {
		java.util.List<java.util.Locale> langs = org.apache.commons.lang.LocaleUtils.cLanguagesByCountry.get(countryCode);
		if (langs == null) {
			if (countryCode != null) {
				langs = new java.util.ArrayList<java.util.Locale>();
				java.util.List<java.util.Locale> locales = org.apache.commons.lang.LocaleUtils.availableLocaleList();
				for (int i = 0; i < (locales.size()); i++) {
					java.util.Locale locale = locales.get(i);
					if ((countryCode.equals(locale.getCountry())) && ((locale.getVariant().length()) == 0)) {
						langs.add(locale);
					}
				}
				langs = java.util.Collections.unmodifiableList(langs);
			}else {
				langs = java.util.Collections.emptyList();
			}
			org.apache.commons.lang.LocaleUtils.cLanguagesByCountry.put(countryCode, langs);
		}
		return langs;
	}

	public static java.util.List<java.util.Locale> countriesByLanguage(java.lang.String languageCode) {
		java.util.List<java.util.Locale> countries = org.apache.commons.lang.LocaleUtils.cCountriesByLanguage.get(languageCode);
		if (countries == null) {
			if (languageCode != null) {
				countries = new java.util.ArrayList<java.util.Locale>();
				java.util.List<java.util.Locale> locales = org.apache.commons.lang.LocaleUtils.availableLocaleList();
				for (int i = 0; i < (locales.size()); i++) {
					java.util.Locale locale = locales.get(i);
					if (((languageCode.equals(locale.getLanguage())) && ((locale.getCountry().length()) != 0)) && ((locale.getVariant().length()) == 0)) {
						countries.add(locale);
					}
				}
				countries = java.util.Collections.unmodifiableList(countries);
			}else {
				countries = java.util.Collections.emptyList();
			}
			org.apache.commons.lang.LocaleUtils.cCountriesByLanguage.put(languageCode, countries);
		}
		return countries;
	}
}

