

package org.joda.time.base;


public abstract class AbstractDateTime extends org.joda.time.base.AbstractInstant implements org.joda.time.ReadableDateTime {
	protected AbstractDateTime() {
		super();
	}

	public int get(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		return type.getField(getChronology()).get(getMillis());
	}

	public int getEra() {
		return getChronology().era().get(getMillis());
	}

	public int getCenturyOfEra() {
		return getChronology().centuryOfEra().get(getMillis());
	}

	public int getYearOfEra() {
		return getChronology().yearOfEra().get(getMillis());
	}

	public int getYearOfCentury() {
		return getChronology().yearOfCentury().get(getMillis());
	}

	public int getYear() {
		return getChronology().year().get(getMillis());
	}

	public int getWeekyear() {
		return getChronology().weekyear().get(getMillis());
	}

	public int getMonthOfYear() {
		return getChronology().monthOfYear().get(getMillis());
	}

	public int getWeekOfWeekyear() {
		return getChronology().weekOfWeekyear().get(getMillis());
	}

	public int getDayOfYear() {
		return getChronology().dayOfYear().get(getMillis());
	}

	public int getDayOfMonth() {
		return getChronology().dayOfMonth().get(getMillis());
	}

	public int getDayOfWeek() {
		return getChronology().dayOfWeek().get(getMillis());
	}

	public int getHourOfDay() {
		return getChronology().hourOfDay().get(getMillis());
	}

	public int getMinuteOfDay() {
		return getChronology().minuteOfDay().get(getMillis());
	}

	public int getMinuteOfHour() {
		return getChronology().minuteOfHour().get(getMillis());
	}

	public int getSecondOfDay() {
		return getChronology().secondOfDay().get(getMillis());
	}

	public int getSecondOfMinute() {
		return getChronology().secondOfMinute().get(getMillis());
	}

	public int getMillisOfDay() {
		return getChronology().millisOfDay().get(getMillis());
	}

	public int getMillisOfSecond() {
		return getChronology().millisOfSecond().get(getMillis());
	}

	public java.util.Calendar toCalendar(java.util.Locale locale) {
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		org.joda.time.DateTimeZone zone = getZone();
		java.util.Calendar cal = java.util.Calendar.getInstance(zone.toTimeZone(), locale);
		cal.setTime(toDate());
		return cal;
	}

	public java.util.GregorianCalendar toGregorianCalendar() {
		org.joda.time.DateTimeZone zone = getZone();
		java.util.GregorianCalendar cal = new java.util.GregorianCalendar(zone.toTimeZone());
		cal.setTime(toDate());
		return cal;
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.base.AbstractDateTime.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.base.AbstractDateTime.this);
	}
}

