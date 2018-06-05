

package org.joda.time.chrono;


final class GJEraDateTimeField extends org.joda.time.field.BaseDateTimeField {
	private static final long serialVersionUID = 4240986525305515528L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	GJEraDateTimeField(org.joda.time.chrono.BasicChronology chronology) {
		super(org.joda.time.DateTimeFieldType.era());
		iChronology = chronology;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		if ((iChronology.getYear(instant)) <= 0) {
			return org.joda.time.DateTimeConstants.BCE;
		}else {
			return org.joda.time.DateTimeConstants.CE;
		}
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).eraValueToText(fieldValue);
	}

	public long set(long instant, int era) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.GJEraDateTimeField.this, era, org.joda.time.DateTimeConstants.BCE, org.joda.time.DateTimeConstants.CE);
		int oldEra = get(instant);
		if (oldEra != era) {
			int year = iChronology.getYear(instant);
			return iChronology.setYear(instant, (-year));
		}else {
			return instant;
		}
	}

	public long set(long instant, java.lang.String text, java.util.Locale locale) {
		return set(instant, org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).eraTextToValue(text));
	}

	public long roundFloor(long instant) {
		if ((get(instant)) == (org.joda.time.DateTimeConstants.CE)) {
			return iChronology.setYear(0, 1);
		}else {
			return java.lang.Long.MIN_VALUE;
		}
	}

	public long roundCeiling(long instant) {
		if ((get(instant)) == (org.joda.time.DateTimeConstants.BCE)) {
			return iChronology.setYear(0, 1);
		}else {
			return java.lang.Long.MAX_VALUE;
		}
	}

	public long roundHalfFloor(long instant) {
		return roundFloor(instant);
	}

	public long roundHalfCeiling(long instant) {
		return roundFloor(instant);
	}

	public long roundHalfEven(long instant) {
		return roundFloor(instant);
	}

	public org.joda.time.DurationField getDurationField() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.eras());
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return null;
	}

	public int getMinimumValue() {
		return org.joda.time.DateTimeConstants.BCE;
	}

	public int getMaximumValue() {
		return org.joda.time.DateTimeConstants.CE;
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
	}

	private java.lang.Object readResolve() {
		return iChronology.era();
	}
}

