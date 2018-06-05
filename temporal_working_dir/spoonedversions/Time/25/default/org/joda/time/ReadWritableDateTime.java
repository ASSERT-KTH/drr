

package org.joda.time;


public interface ReadWritableDateTime extends org.joda.time.ReadWritableInstant , org.joda.time.ReadableDateTime {
	void setYear(int year);

	void addYears(int years);

	void setWeekyear(int weekyear);

	void addWeekyears(int weekyears);

	void setMonthOfYear(int monthOfYear);

	void addMonths(int months);

	void setWeekOfWeekyear(int weekOfWeekyear);

	void addWeeks(int weeks);

	void setDayOfYear(int dayOfYear);

	void setDayOfMonth(int dayOfMonth);

	void setDayOfWeek(int dayOfWeek);

	void addDays(int days);

	void setHourOfDay(int hourOfDay);

	void addHours(int hours);

	void setMinuteOfDay(int minuteOfDay);

	void setMinuteOfHour(int minuteOfHour);

	void addMinutes(int minutes);

	void setSecondOfDay(int secondOfDay);

	void setSecondOfMinute(int secondOfMinute);

	void addSeconds(int seconds);

	void setMillisOfDay(int millisOfDay);

	void setMillisOfSecond(int millisOfSecond);

	void addMillis(int millis);

	void setDate(int year, int monthOfYear, int dayOfMonth);

	void setTime(int hour, int minuteOfHour, int secondOfMinute, int millisOfSecond);

	void setDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond);
}

