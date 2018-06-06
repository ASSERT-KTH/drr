

package org.joda.time.chrono;


final class GJDayOfWeekDateTimeField extends org.joda.time.field.PreciseDurationDateTimeField {
	private static final long serialVersionUID = -3857947176719041436L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	GJDayOfWeekDateTimeField(org.joda.time.chrono.BasicChronology chronology, org.joda.time.DurationField days) {
		super(org.joda.time.DateTimeFieldType.dayOfWeek(), days);
		iChronology = chronology;
	}

	public int get(long instant) {
		return iChronology.getDayOfWeek(instant);
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(fieldValue);
	}

	public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(fieldValue);
	}

	protected int convertText(java.lang.String text, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(text);
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iChronology.weeks();
	}

	public int getMinimumValue() {
		return org.joda.time.DateTimeConstants.MONDAY;
	}

	public int getMaximumValue() {
		return org.joda.time.DateTimeConstants.SUNDAY;
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength();
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength();
	}

	private java.lang.Object readResolve() {
		return iChronology.dayOfWeek();
	}
}

