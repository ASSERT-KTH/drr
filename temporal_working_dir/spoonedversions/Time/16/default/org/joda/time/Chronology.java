

package org.joda.time;


public abstract class Chronology {
	public abstract org.joda.time.DateTimeZone getZone();

	public abstract org.joda.time.Chronology withUTC();

	public abstract org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone);

	public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay);

	public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond);

	public abstract long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond);

	public abstract void validate(org.joda.time.ReadablePartial partial, int[] values);

	public abstract int[] get(org.joda.time.ReadablePartial partial, long instant);

	public abstract long set(org.joda.time.ReadablePartial partial, long instant);

	public abstract int[] get(org.joda.time.ReadablePeriod period, long startInstant, long endInstant);

	public abstract int[] get(org.joda.time.ReadablePeriod period, long duration);

	public abstract long add(org.joda.time.ReadablePeriod period, long instant, int scalar);

	public abstract long add(long instant, long duration, int scalar);

	public abstract org.joda.time.DurationField millis();

	public abstract org.joda.time.DateTimeField millisOfSecond();

	public abstract org.joda.time.DateTimeField millisOfDay();

	public abstract org.joda.time.DurationField seconds();

	public abstract org.joda.time.DateTimeField secondOfMinute();

	public abstract org.joda.time.DateTimeField secondOfDay();

	public abstract org.joda.time.DurationField minutes();

	public abstract org.joda.time.DateTimeField minuteOfHour();

	public abstract org.joda.time.DateTimeField minuteOfDay();

	public abstract org.joda.time.DurationField hours();

	public abstract org.joda.time.DateTimeField hourOfDay();

	public abstract org.joda.time.DateTimeField clockhourOfDay();

	public abstract org.joda.time.DurationField halfdays();

	public abstract org.joda.time.DateTimeField hourOfHalfday();

	public abstract org.joda.time.DateTimeField clockhourOfHalfday();

	public abstract org.joda.time.DateTimeField halfdayOfDay();

	public abstract org.joda.time.DurationField days();

	public abstract org.joda.time.DateTimeField dayOfWeek();

	public abstract org.joda.time.DateTimeField dayOfMonth();

	public abstract org.joda.time.DateTimeField dayOfYear();

	public abstract org.joda.time.DurationField weeks();

	public abstract org.joda.time.DateTimeField weekOfWeekyear();

	public abstract org.joda.time.DurationField weekyears();

	public abstract org.joda.time.DateTimeField weekyear();

	public abstract org.joda.time.DateTimeField weekyearOfCentury();

	public abstract org.joda.time.DurationField months();

	public abstract org.joda.time.DateTimeField monthOfYear();

	public abstract org.joda.time.DurationField years();

	public abstract org.joda.time.DateTimeField year();

	public abstract org.joda.time.DateTimeField yearOfEra();

	public abstract org.joda.time.DateTimeField yearOfCentury();

	public abstract org.joda.time.DurationField centuries();

	public abstract org.joda.time.DateTimeField centuryOfEra();

	public abstract org.joda.time.DurationField eras();

	public abstract org.joda.time.DateTimeField era();

	public abstract java.lang.String toString();
}

