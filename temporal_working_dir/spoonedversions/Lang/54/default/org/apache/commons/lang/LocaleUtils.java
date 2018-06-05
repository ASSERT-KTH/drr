

package org.apache.commons.lang;


public class LocaleUtils {
	private static final java.util.List cAvailableLocaleList;

	private static java.util.Set cAvailableLocaleSet;

	private static final java.util.Map cLanguagesByCountry = java.util.Collections.synchronizedMap(new java.util.HashMap());

	private static final java.util.Map cCountriesByLanguage = java.util.Collections.synchronizedMap(new java.util.HashMap());

	static {
		java.util.List list = java.util.Arrays.asList(java.util.Locale.getAvailableLocales());
		cAvailableLocaleList = java.util.Collections.unmodifiableList(list);
	}

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

	public static java.util.List localeLookupList(java.util.Locale locale) {
		return org.apache.commons.lang.LocaleUtils.localeLookupList(locale, locale);
	}

	public static java.util.List localeLookupList(java.util.Locale locale, java.util.Locale defaultLocale) {
		java.util.List list = new java.util.ArrayList(4);
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

	public static java.util.List availableLocaleList() {
		return org.apache.commons.lang.LocaleUtils.cAvailableLocaleList;
	}

	public static java.util.Set availableLocaleSet() {
		java.util.Set set = org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet;
		if (set == null) {
			set = new java.util.HashSet(org.apache.commons.lang.LocaleUtils.availableLocaleList());
			set = java.util.Collections.unmodifiableSet(set);
			org.apache.commons.lang.LocaleUtils.cAvailableLocaleSet = set;
		}
		return set;
	}

	public static boolean isAvailableLocale(java.util.Locale locale) {
		return org.apache.commons.lang.LocaleUtils.availableLocaleList().contains(locale);
	}

	public static java.util.List languagesByCountry(java.lang.String countryCode) {
		java.util.List langs = ((java.util.List) (org.apache.commons.lang.LocaleUtils.cLanguagesByCountry.get(countryCode)));
		if (langs == null) {
			if (countryCode != null) {
				langs = new java.util.ArrayList();
				java.util.List locales = org.apache.commons.lang.LocaleUtils.availableLocaleList();
				for (int i = 0; i < (locales.size()); i++) {
					java.util.Locale locale = ((java.util.Locale) (locales.get(i)));
					if ((countryCode.equals(locale.getCountry())) && ((locale.getVariant().length()) == 0)) {
						langs.add(locale);
					}
				}
				langs = java.util.Collections.unmodifiableList(langs);
			}else {
				langs = java.util.Collections.EMPTY_LIST;
			}
			org.apache.commons.lang.LocaleUtils.cLanguagesByCountry.put(countryCode, langs);
		}
		return langs;
	}

	public static java.util.List countriesByLanguage(java.lang.String languageCode) {
		java.util.List countries = ((java.util.List) (org.apache.commons.lang.LocaleUtils.cCountriesByLanguage.get(languageCode)));
		if (countries == null) {
			if (languageCode != null) {
				countries = new java.util.ArrayList();
				java.util.List locales = org.apache.commons.lang.LocaleUtils.availableLocaleList();
				for (int i = 0; i < (locales.size()); i++) {
					java.util.Locale locale = ((java.util.Locale) (locales.get(i)));
					if (((languageCode.equals(locale.getLanguage())) && ((locale.getCountry().length()) != 0)) && ((locale.getVariant().length()) == 0)) {
						countries.add(locale);
					}
				}
				countries = java.util.Collections.unmodifiableList(countries);
			}else {
				countries = java.util.Collections.EMPTY_LIST;
			}
			org.apache.commons.lang.LocaleUtils.cCountriesByLanguage.put(languageCode, countries);
		}
		return countries;
	}
}

