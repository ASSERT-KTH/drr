

package org.joda.time.chrono;


final class GJMonthOfYearDateTimeField extends org.joda.time.chrono.BasicMonthOfYearDateTimeField {
	private static final long serialVersionUID = -4748157875845286249L;

	GJMonthOfYearDateTimeField(org.joda.time.chrono.BasicChronology chronology) {
		super(chronology, 2);
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).monthOfYearValueToText(fieldValue);
	}

	public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).monthOfYearValueToShortText(fieldValue);
	}

	protected int convertText(java.lang.String text, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).monthOfYearTextToValue(text);
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getMonthMaxTextLength();
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getMonthMaxShortTextLength();
	}
}

