

package org.joda.time;


public interface ReadableDateTime extends org.joda.time.ReadableInstant {
	int getDayOfWeek();

	int getDayOfMonth();

	int getDayOfYear();

	int getWeekOfWeekyear();

	int getWeekyear();

	int getMonthOfYear();

	int getYear();

	int getYearOfEra();

	int getYearOfCentury();

	int getCenturyOfEra();

	int getEra();

	int getMillisOfSecond();

	int getMillisOfDay();

	int getSecondOfMinute();

	int getSecondOfDay();

	int getMinuteOfHour();

	int getMinuteOfDay();

	int getHourOfDay();

	org.joda.time.DateTime toDateTime();

	org.joda.time.MutableDateTime toMutableDateTime();

	java.lang.String toString(java.lang.String pattern) throws java.lang.IllegalArgumentException;

	java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException;
}

