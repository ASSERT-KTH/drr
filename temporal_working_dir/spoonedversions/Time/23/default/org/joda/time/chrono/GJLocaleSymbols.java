

package org.joda.time.chrono;


class GJLocaleSymbols {
	private static final int FAST_CACHE_SIZE = 64;

	private static final org.joda.time.chrono.GJLocaleSymbols[] cFastCache = new org.joda.time.chrono.GJLocaleSymbols[org.joda.time.chrono.GJLocaleSymbols.FAST_CACHE_SIZE];

	private static java.util.WeakHashMap<java.util.Locale, org.joda.time.chrono.GJLocaleSymbols> cCache = new java.util.WeakHashMap<java.util.Locale, org.joda.time.chrono.GJLocaleSymbols>();

	public static org.joda.time.chrono.GJLocaleSymbols forLocale(java.util.Locale locale) {
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		int index = (java.lang.System.identityHashCode(locale)) & ((org.joda.time.chrono.GJLocaleSymbols.FAST_CACHE_SIZE) - 1);
		org.joda.time.chrono.GJLocaleSymbols symbols = org.joda.time.chrono.GJLocaleSymbols.cFastCache[index];
		if ((symbols != null) && ((symbols.iLocale.get()) == locale)) {
			return symbols;
		}
		synchronized(org.joda.time.chrono.GJLocaleSymbols.cCache) {
			symbols = org.joda.time.chrono.GJLocaleSymbols.cCache.get(locale);
			if (symbols == null) {
				symbols = new org.joda.time.chrono.GJLocaleSymbols(locale);
				org.joda.time.chrono.GJLocaleSymbols.cCache.put(locale, symbols);
			}
		}
		org.joda.time.chrono.GJLocaleSymbols.cFastCache[index] = symbols;
		return symbols;
	}

	private static java.lang.String[] realignMonths(java.lang.String[] months) {
		java.lang.String[] a = new java.lang.String[13];
		for (int i = 1; i < 13; i++) {
			a[i] = months[(i - 1)];
		}
		return a;
	}

	private static java.lang.String[] realignDaysOfWeek(java.lang.String[] daysOfWeek) {
		java.lang.String[] a = new java.lang.String[8];
		for (int i = 1; i < 8; i++) {
			a[i] = daysOfWeek[(i < 7 ? i + 1 : 1)];
		}
		return a;
	}

	private static void addSymbols(java.util.TreeMap<java.lang.String, java.lang.Integer> map, java.lang.String[] symbols, java.lang.Integer[] integers) {
		for (int i = symbols.length; (--i) >= 0;) {
			java.lang.String symbol = symbols[i];
			if (symbol != null) {
				map.put(symbol, integers[i]);
			}
		}
	}

	private static void addNumerals(java.util.TreeMap<java.lang.String, java.lang.Integer> map, int start, int end, java.lang.Integer[] integers) {
		for (int i = start; i <= end; i++) {
			map.put(java.lang.String.valueOf(i).intern(), integers[i]);
		}
	}

	private static int maxLength(java.lang.String[] a) {
		int max = 0;
		for (int i = a.length; (--i) >= 0;) {
			java.lang.String s = a[i];
			if (s != null) {
				int len = s.length();
				if (len > max) {
					max = len;
				}
			}
		}
		return max;
	}

	private final java.lang.ref.WeakReference<java.util.Locale> iLocale;

	private final java.lang.String[] iEras;

	private final java.lang.String[] iDaysOfWeek;

	private final java.lang.String[] iShortDaysOfWeek;

	private final java.lang.String[] iMonths;

	private final java.lang.String[] iShortMonths;

	private final java.lang.String[] iHalfday;

	private final java.util.TreeMap<java.lang.String, java.lang.Integer> iParseEras;

	private final java.util.TreeMap<java.lang.String, java.lang.Integer> iParseDaysOfWeek;

	private final java.util.TreeMap<java.lang.String, java.lang.Integer> iParseMonths;

	private final int iMaxEraLength;

	private final int iMaxDayOfWeekLength;

	private final int iMaxShortDayOfWeekLength;

	private final int iMaxMonthLength;

	private final int iMaxShortMonthLength;

	private final int iMaxHalfdayLength;

	private GJLocaleSymbols(java.util.Locale locale) {
		iLocale = new java.lang.ref.WeakReference<java.util.Locale>(locale);
		java.text.DateFormatSymbols dfs = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale);
		iEras = dfs.getEras();
		iDaysOfWeek = org.joda.time.chrono.GJLocaleSymbols.realignDaysOfWeek(dfs.getWeekdays());
		iShortDaysOfWeek = org.joda.time.chrono.GJLocaleSymbols.realignDaysOfWeek(dfs.getShortWeekdays());
		iMonths = org.joda.time.chrono.GJLocaleSymbols.realignMonths(dfs.getMonths());
		iShortMonths = org.joda.time.chrono.GJLocaleSymbols.realignMonths(dfs.getShortMonths());
		iHalfday = dfs.getAmPmStrings();
		java.lang.Integer[] integers = new java.lang.Integer[13];
		for (int i = 0; i < 13; i++) {
			integers[i] = new java.lang.Integer(i);
		}
		iParseEras = new java.util.TreeMap<java.lang.String, java.lang.Integer>(java.lang.String.CASE_INSENSITIVE_ORDER);
		org.joda.time.chrono.GJLocaleSymbols.addSymbols(iParseEras, iEras, integers);
		if ("en".equals(locale.getLanguage())) {
			iParseEras.put("BCE", integers[0]);
			iParseEras.put("CE", integers[1]);
		}
		iParseDaysOfWeek = new java.util.TreeMap<java.lang.String, java.lang.Integer>(java.lang.String.CASE_INSENSITIVE_ORDER);
		org.joda.time.chrono.GJLocaleSymbols.addSymbols(iParseDaysOfWeek, iDaysOfWeek, integers);
		org.joda.time.chrono.GJLocaleSymbols.addSymbols(iParseDaysOfWeek, iShortDaysOfWeek, integers);
		org.joda.time.chrono.GJLocaleSymbols.addNumerals(iParseDaysOfWeek, 1, 7, integers);
		iParseMonths = new java.util.TreeMap<java.lang.String, java.lang.Integer>(java.lang.String.CASE_INSENSITIVE_ORDER);
		org.joda.time.chrono.GJLocaleSymbols.addSymbols(iParseMonths, iMonths, integers);
		org.joda.time.chrono.GJLocaleSymbols.addSymbols(iParseMonths, iShortMonths, integers);
		org.joda.time.chrono.GJLocaleSymbols.addNumerals(iParseMonths, 1, 12, integers);
		iMaxEraLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iEras);
		iMaxDayOfWeekLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iDaysOfWeek);
		iMaxShortDayOfWeekLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iShortDaysOfWeek);
		iMaxMonthLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iMonths);
		iMaxShortMonthLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iShortMonths);
		iMaxHalfdayLength = org.joda.time.chrono.GJLocaleSymbols.maxLength(iHalfday);
	}

	public java.lang.String eraValueToText(int value) {
		return iEras[value];
	}

	public int eraTextToValue(java.lang.String text) {
		java.lang.Integer era = iParseEras.get(text);
		if (era != null) {
			return era.intValue();
		}
		throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.era(), text);
	}

	public int getEraMaxTextLength() {
		return iMaxEraLength;
	}

	public java.lang.String monthOfYearValueToText(int value) {
		return iMonths[value];
	}

	public java.lang.String monthOfYearValueToShortText(int value) {
		return iShortMonths[value];
	}

	public int monthOfYearTextToValue(java.lang.String text) {
		java.lang.Integer month = iParseMonths.get(text);
		if (month != null) {
			return month.intValue();
		}
		throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.monthOfYear(), text);
	}

	public int getMonthMaxTextLength() {
		return iMaxMonthLength;
	}

	public int getMonthMaxShortTextLength() {
		return iMaxShortMonthLength;
	}

	public java.lang.String dayOfWeekValueToText(int value) {
		return iDaysOfWeek[value];
	}

	public java.lang.String dayOfWeekValueToShortText(int value) {
		return iShortDaysOfWeek[value];
	}

	public int dayOfWeekTextToValue(java.lang.String text) {
		java.lang.Integer day = iParseDaysOfWeek.get(text);
		if (day != null) {
			return day.intValue();
		}
		throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.dayOfWeek(), text);
	}

	public int getDayOfWeekMaxTextLength() {
		return iMaxDayOfWeekLength;
	}

	public int getDayOfWeekMaxShortTextLength() {
		return iMaxShortDayOfWeekLength;
	}

	public java.lang.String halfdayValueToText(int value) {
		return iHalfday[value];
	}

	public int halfdayTextToValue(java.lang.String text) {
		java.lang.String[] halfday = iHalfday;
		for (int i = halfday.length; (--i) >= 0;) {
			if (halfday[i].equalsIgnoreCase(text)) {
				return i;
			}
		}
		throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.halfdayOfDay(), text);
	}

	public int getHalfdayMaxTextLength() {
		return iMaxHalfdayLength;
	}
}

